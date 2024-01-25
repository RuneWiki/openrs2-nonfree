import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class51 implements Interface9 {

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
	private int anInt1166;

	@OriginalMember(owner = "client!dg", name = "u", descriptor = "I")
	private int anInt1179;

	@OriginalMember(owner = "client!dg", name = "z", descriptor = "I")
	private int anInt1183;

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "[Lclient!ja;")
	private final Interface5[] anInterface5Array1 = new Interface5[9];

	@OriginalMember(owner = "client!dg", name = "r", descriptor = "I")
	private int anInt1176 = 0;

	@OriginalMember(owner = "client!dg", name = "A", descriptor = "I")
	private int anInt1184 = -1;

	@OriginalMember(owner = "client!dg", name = "p", descriptor = "Lclient!na;")
	private final Class75_Sub2 aClass75_Sub2_6;

	@OriginalMember(owner = "client!dg", name = "w", descriptor = "I")
	private final int anInt1181;

	static {
		new Class231("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lclient!na;)V")
	public Class51(@OriginalArg(0) Class75_Sub2 arg0) {
		if (!arg0.aBoolean339) {
			throw new IllegalStateException("");
		}
		this.aClass75_Sub2_6 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static262.anIntArray397, 0);
		this.anInt1181 = Static262.anIntArray397[0];
	}

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "(I)V")
	@Override
	public void method1076() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt1181);
		this.anInt1176 |= 0x4;
		this.anInt1184 = this.method1084();
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
	@Override
	public void method1071() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt1176 &= 0xFFFFFFFE;
		this.anInt1184 = this.method1084();
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V")
	@Override
	public void method1072() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt1176 &= 0xFFFFFFFD;
		this.anInt1184 = this.method1084();
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)V")
	public void method1078(@OriginalArg(1) int arg0) {
		if (this.anInt1184 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static34.anIntArray54[arg0]);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!sa;IZ)V")
	public void method1080(@OriginalArg(0) Class64_Sub4 arg0, @OriginalArg(1) int arg1) {
		this.method1085(arg0, arg1);
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)V")
	public void method1081(@OriginalArg(1) int arg0) {
		if (this.anInterface5Array1[arg0] != null) {
			this.anInterface5Array1[arg0].method5596();
		}
		this.anInt1166 &= ~(0x1 << arg0);
		this.anInterface5Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IBLclient!tr;)V")
	public void method1082(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub17 arg1) {
		if (this.anInt1184 == -1) {
			throw new RuntimeException();
		}
		@Pc(22) int local22 = 0x1 << arg0;
		if ((this.anInt1166 & ~local22) == 0) {
			this.anInt1183 = arg1.anInt6982;
			this.anInt1179 = arg1.anInt6979;
		} else if (arg1.anInt6979 != this.anInt1179 || arg1.anInt6982 != this.anInt1183) {
			throw new RuntimeException();
		}
		arg1.method5597(Static34.anIntArray54[arg0], this.anInt1184);
		this.anInterface5Array1[arg0] = arg1;
		this.anInt1166 |= local22;
	}

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "(I)V")
	@Override
	public void method1075() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt1181);
		this.anInt1176 |= 0x2;
		this.anInt1184 = this.method1084();
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)I")
	public int method1083() {
		return this.anInt1183;
	}

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "(I)I")
	private int method1084() {
		if ((this.anInt1176 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt1176 & 0x2) == 0) {
			return (this.anInt1176 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILclient!sa;I)V")
	private void method1085(@OriginalArg(2) Class64_Sub4 arg0, @OriginalArg(3) int arg1) {
		if (this.anInt1184 == -1) {
			throw new RuntimeException();
		}
		@Pc(20) int local20 = 0x1 << arg1;
		if ((this.anInt1166 & ~local20) == 0) {
			this.anInt1179 = arg0.anInt4399;
			this.anInt1183 = arg0.anInt4403;
		} else if (this.anInt1179 != arg0.anInt4399 || this.anInt1183 != arg0.anInt4403) {
			throw new RuntimeException();
		}
		arg0.method3536(Static34.anIntArray54[arg1], this.anInt1184);
		this.anInterface5Array1[arg1] = arg0;
		this.anInt1166 |= local20;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
	@Override
	public void method1074() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt1181);
		this.anInt1176 |= 0x1;
		this.anInt1184 = this.method1084();
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IBIILclient!ea;)V")
	private void method1087(@OriginalArg(2) int arg0, @OriginalArg(4) Class64_Sub1 arg1) {
		if (this.anInt1184 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt1166 & 0xFFFFFFFE) == 0) {
			this.anInt1179 = arg1.anInt1424;
			this.anInt1183 = arg1.anInt1424;
		} else if (this.anInt1179 != arg1.anInt1424 || this.anInt1183 != arg1.anInt1424) {
			throw new RuntimeException();
		}
		arg1.method1311(arg0, Static34.anIntArray54[0], this.anInt1184);
		this.anInterface5Array1[0] = arg1;
		this.anInt1166 |= 0x1;
	}

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "(I)Z")
	public boolean method1089() {
		@Pc(7) int local7 = OpenGL.glCheckFramebufferStatusEXT(this.anInt1184);
		return local7 == 36053;
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(II)V")
	public void method1091() {
		if (this.anInt1184 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static34.anIntArray54[0]);
	}

	@OriginalMember(owner = "client!dg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass75_Sub2_6.method3815(this.anInt1181);
		super.finalize();
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)V")
	@Override
	public void method1073() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt1176 &= 0xFFFFFFFB;
		this.anInt1184 = this.method1084();
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILclient!ea;I)V")
	public void method1092(@OriginalArg(2) Class64_Sub1 arg0, @OriginalArg(3) int arg1) {
		this.method1087(arg1, arg0);
	}
}
