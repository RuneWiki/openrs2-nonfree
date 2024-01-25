import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class51 implements Interface17 {

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
	private int anInt1063;

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
	private int anInt1064;

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
	private int anInt1065;

	@OriginalMember(owner = "client!ci", name = "s", descriptor = "[Lclient!mo;")
	private final Interface15[] anInterface15Array1 = new Interface15[9];

	@OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
	private int anInt1069 = 0;

	@OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
	private int anInt1074 = -1;

	@OriginalMember(owner = "client!ci", name = "z", descriptor = "Lclient!kga;")
	private final Class44_Sub3 aClass44_Sub3_5;

	@OriginalMember(owner = "client!ci", name = "t", descriptor = "I")
	private final int anInt1078;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lclient!kga;)V")
	public Class51(@OriginalArg(0) Class44_Sub3 arg0) {
		if (!arg0.aBoolean412) {
			throw new IllegalStateException("");
		}
		this.aClass44_Sub3_5 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static66.anIntArray40, 0);
		this.anInt1078 = Static66.anIntArray40[0];
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!saa;III)V")
	private void method1092(@OriginalArg(0) Class77_Sub1 arg0, @OriginalArg(3) int arg1) {
		if (this.anInt1074 == -1) {
			throw new RuntimeException();
		}
		@Pc(23) int local23 = 0x1 << arg1;
		if ((~local23 & this.anInt1065) == 0) {
			this.anInt1063 = arg0.anInt2390;
			this.anInt1064 = arg0.anInt2392;
		} else if (arg0.anInt2390 != this.anInt1063 || arg0.anInt2392 != this.anInt1064) {
			throw new RuntimeException();
		}
		arg0.method2265(Static212.anIntArray192[arg1], this.anInt1074);
		this.anInterface15Array1[arg1] = arg0;
		this.anInt1065 |= local23;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZLclient!saa;I)V")
	public void method1093(@OriginalArg(1) Class77_Sub1 arg0, @OriginalArg(2) int arg1) {
		this.method1092(arg0, arg1);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
	@Override
	public void method1086() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt1078);
		this.anInt1069 |= 0x4;
		this.anInt1074 = this.method1101();
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)V")
	@Override
	public void method1089() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt1069 &= 0xFFFFFFFB;
		this.anInt1074 = this.method1101();
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILclient!sa;III)V")
	private void method1094(@OriginalArg(1) Class77_Sub4 arg0, @OriginalArg(4) int arg1) {
		if (this.anInt1074 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt1065 & 0xFFFFFFFE) == 0) {
			this.anInt1063 = arg0.anInt8684;
			this.anInt1064 = arg0.anInt8684;
		} else if (arg0.anInt8684 != this.anInt1063 || this.anInt1064 != arg0.anInt8684) {
			throw new RuntimeException();
		}
		arg0.method7077(this.anInt1074, Static212.anIntArray192[0], arg1);
		this.anInterface15Array1[0] = arg0;
		this.anInt1065 |= 0x1;
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(B)V")
	@Override
	public void method1090() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt1069 &= 0xFFFFFFFE;
		this.anInt1074 = this.method1101();
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILclient!oaa;I)V")
	public void method1096(@OriginalArg(1) Class4_Sub5_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt1074 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg1;
		if ((this.anInt1065 & ~local16) == 0) {
			this.anInt1064 = arg0.anInt7075;
			this.anInt1063 = arg0.anInt7068;
		} else if (this.anInt1063 != arg0.anInt7068 || this.anInt1064 != arg0.anInt7075) {
			throw new RuntimeException();
		}
		arg0.method5876(Static212.anIntArray192[arg1], this.anInt1074);
		this.anInterface15Array1[arg1] = arg0;
		this.anInt1065 |= local16;
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)V")
	@Override
	public void method1087() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt1078);
		this.anInt1069 |= 0x2;
		this.anInt1074 = this.method1101();
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
	@Override
	public void method1088() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt1069 &= 0xFFFFFFFD;
		this.anInt1074 = this.method1101();
	}

	@OriginalMember(owner = "client!ci", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass44_Sub3_5.method4662(this.anInt1078);
		super.finalize();
	}

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)V")
	@Override
	public void method1091() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt1078);
		this.anInt1069 |= 0x1;
		this.anInt1074 = this.method1101();
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILclient!sa;II)V")
	public void method1098(@OriginalArg(1) Class77_Sub4 arg0, @OriginalArg(3) int arg1) {
		this.method1094(arg0, arg1);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)V")
	public void method1099() {
		if (this.anInt1074 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static212.anIntArray192[0]);
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(II)V")
	public void method1100(@OriginalArg(0) int arg0) {
		if (this.anInterface15Array1[arg0] != null) {
			this.anInterface15Array1[arg0].method7064();
		}
		this.anInt1065 &= ~(0x1 << arg0);
		this.anInterface15Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(B)I")
	private int method1101() {
		if ((this.anInt1069 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt1069 & 0x2) == 0) {
			return (this.anInt1069 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "(I)Z")
	public boolean method1102() {
		@Pc(12) int local12 = OpenGL.glCheckFramebufferStatusEXT(this.anInt1074);
		return local12 == 36053;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZ)V")
	public void method1103(@OriginalArg(0) int arg0) {
		if (this.anInt1074 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static212.anIntArray192[arg0]);
	}
}
