import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public final class Class39 implements Interface22 {

	@OriginalMember(owner = "client!bq", name = "g", descriptor = "I")
	private int anInt1122;

	@OriginalMember(owner = "client!bq", name = "z", descriptor = "I")
	private int anInt1138;

	@OriginalMember(owner = "client!bq", name = "C", descriptor = "I")
	private int anInt1141;

	@OriginalMember(owner = "client!bq", name = "h", descriptor = "I")
	private int anInt1123 = 0;

	@OriginalMember(owner = "client!bq", name = "s", descriptor = "[Lclient!sfa;")
	private final Interface18[] anInterface18Array1 = new Interface18[9];

	@OriginalMember(owner = "client!bq", name = "B", descriptor = "I")
	private int anInt1140 = -1;

	@OriginalMember(owner = "client!bq", name = "t", descriptor = "Lclient!lea;")
	private final Class101_Sub2 aClass101_Sub2_4;

	@OriginalMember(owner = "client!bq", name = "d", descriptor = "I")
	private final int anInt1119;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lclient!lea;)V")
	public Class39(@OriginalArg(0) Class101_Sub2 arg0) {
		if (!arg0.aBoolean463) {
			throw new IllegalStateException("");
		}
		this.aClass101_Sub2_4 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static638.anIntArray577, 0);
		this.anInt1119 = Static638.anIntArray577[0];
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IILclient!oh;IZ)V")
	private void method1106(@OriginalArg(2) Class50_Sub3 arg0, @OriginalArg(3) int arg1) {
		if (this.anInt1140 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt1138 & 0xFFFFFFFE) == 0) {
			this.anInt1141 = arg0.anInt7870;
			this.anInt1122 = arg0.anInt7870;
		} else if (arg0.anInt7870 != this.anInt1141 || arg0.anInt7870 != this.anInt1122) {
			throw new RuntimeException();
		}
		arg0.method7036(Static315.anIntArray290[0], arg1, this.anInt1140);
		this.anInterface18Array1[0] = arg0;
		this.anInt1138 |= 0x1;
	}

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "(I)V")
	@Override
	public void method1103() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt1119);
		this.anInt1123 |= 0x1;
		this.anInt1140 = this.method1117();
	}

	@OriginalMember(owner = "client!bq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass101_Sub2_4.method5622(this.anInt1119);
		super.finalize();
	}

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "(Z)V")
	@Override
	public void method1105() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt1123 &= 0xFFFFFFFD;
		this.anInt1140 = this.method1117();
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIILclient!wi;)V")
	private void method1108(@OriginalArg(2) int arg0, @OriginalArg(3) Class50_Sub4 arg1) {
		if (this.anInt1140 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg0;
		if ((this.anInt1138 & ~local16) == 0) {
			this.anInt1141 = arg1.anInt10687;
			this.anInt1122 = arg1.anInt10688;
		} else if (this.anInt1141 != arg1.anInt10687 || arg1.anInt10688 != this.anInt1122) {
			throw new RuntimeException();
		}
		arg1.method9151(this.anInt1140, Static315.anIntArray290[arg0]);
		this.anInterface18Array1[arg0] = arg1;
		this.anInt1138 |= local16;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(II)V")
	public void method1109(@OriginalArg(1) int arg0) {
		if (this.anInt1140 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static315.anIntArray290[arg0]);
	}

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "(I)V")
	@Override
	public void method1102() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt1123 &= 0xFFFFFFFE;
		this.anInt1140 = this.method1117();
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V")
	@Override
	public void method1101() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt1123 &= 0xFFFFFFFB;
		this.anInt1140 = this.method1117();
	}

	@OriginalMember(owner = "client!bq", name = "e", descriptor = "(I)Z")
	public boolean method1110() {
		@Pc(12) int local12 = OpenGL.glCheckFramebufferStatusEXT(this.anInt1140);
		return local12 == 36053;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IILclient!wi;)V")
	public void method1111(@OriginalArg(1) int arg0, @OriginalArg(2) Class50_Sub4 arg1) {
		this.method1108(arg0, arg1);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!ra;II)V")
	public void method1112(@OriginalArg(0) Class2_Sub1_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt1140 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg1;
		if ((this.anInt1138 & ~local15) == 0) {
			this.anInt1141 = arg0.anInt8987;
			this.anInt1122 = arg0.anInt8985;
		} else if (arg0.anInt8987 != this.anInt1141 || this.anInt1122 != arg0.anInt8985) {
			throw new RuntimeException();
		}
		arg0.method7895(this.anInt1140, Static315.anIntArray290[arg1]);
		this.anInterface18Array1[arg1] = arg0;
		this.anInt1138 |= local15;
	}

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "(II)V")
	public void method1114(@OriginalArg(1) int arg0) {
		if (this.anInterface18Array1[arg0] != null) {
			this.anInterface18Array1[arg0].method9133();
		}
		this.anInt1138 &= ~(0x1 << arg0);
		this.anInterface18Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!bq", name = "d", descriptor = "(I)V")
	@Override
	public void method1104() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt1119);
		this.anInt1123 |= 0x4;
		this.anInt1140 = this.method1117();
	}

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "(II)V")
	public void method1116() {
		if (this.anInt1140 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static315.anIntArray290[0]);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Z)V")
	@Override
	public void method1100() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt1119);
		this.anInt1123 |= 0x2;
		this.anInt1140 = this.method1117();
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(B)I")
	private int method1117() {
		if ((this.anInt1123 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt1123 & 0x2) == 0) {
			return (this.anInt1123 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!oh;III)V")
	public void method1118(@OriginalArg(0) Class50_Sub3 arg0, @OriginalArg(3) int arg1) {
		this.method1106(arg0, arg1);
	}
}
