import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class161 implements Interface17 {

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "I")
	private int anInt4365;

	@OriginalMember(owner = "client!iu", name = "h", descriptor = "I")
	private int anInt4372;

	@OriginalMember(owner = "client!iu", name = "w", descriptor = "I")
	private int anInt4383;

	@OriginalMember(owner = "client!iu", name = "t", descriptor = "[Lclient!go;")
	private final Interface9[] anInterface9Array1 = new Interface9[9];

	@OriginalMember(owner = "client!iu", name = "e", descriptor = "I")
	private int anInt4369 = -1;

	@OriginalMember(owner = "client!iu", name = "y", descriptor = "I")
	private int anInt4385 = 0;

	@OriginalMember(owner = "client!iu", name = "o", descriptor = "Lclient!ag;")
	private final Class12_Sub1 aClass12_Sub1_19;

	@OriginalMember(owner = "client!iu", name = "g", descriptor = "I")
	private final int anInt4371;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lclient!ag;)V")
	public Class161(@OriginalArg(0) Class12_Sub1 arg0) {
		if (!arg0.aBoolean34) {
			throw new IllegalStateException("");
		}
		this.aClass12_Sub1_19 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static159.anIntArray177, 0);
		this.anInt4371 = Static159.anIntArray177[0];
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(BI)V")
	public void method3784(@OriginalArg(1) int arg0) {
		if (this.anInterface9Array1[arg0] != null) {
			this.anInterface9Array1[arg0].method5633();
		}
		this.anInt4365 &= ~(0x1 << arg0);
		this.anInterface9Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIILclient!d;)V")
	public void method3785(@OriginalArg(1) int arg0, @OriginalArg(3) Class52_Sub2 arg1) {
		this.method3793(arg0, arg1);
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)V")
	public void method3786(@OriginalArg(1) int arg0) {
		if (this.anInt4369 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static203.anIntArray234[arg0]);
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(I)V")
	@Override
	public void method3780() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt4385 &= 0xFFFFFFFD;
		this.anInt4369 = this.method3787();
	}

	@OriginalMember(owner = "client!iu", name = "f", descriptor = "(I)I")
	private int method3787() {
		if ((this.anInt4385 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt4385 & 0x2) == 0) {
			return (this.anInt4385 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(B)V")
	@Override
	public void method3778() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt4371);
		this.anInt4385 |= 0x4;
		this.anInt4369 = this.method3787();
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIILclient!dga;)V")
	private void method3788(@OriginalArg(0) int arg0, @OriginalArg(3) Class52_Sub1 arg1) {
		if (this.anInt4369 == -1) {
			throw new RuntimeException();
		}
		@Pc(22) int local22 = 0x1 << arg0;
		if ((~local22 & this.anInt4365) == 0) {
			this.anInt4372 = arg1.anInt1670;
			this.anInt4383 = arg1.anInt1667;
		} else if (this.anInt4372 != arg1.anInt1670 || this.anInt4383 != arg1.anInt1667) {
			throw new RuntimeException();
		}
		arg1.method1505(this.anInt4369, Static203.anIntArray234[arg0]);
		this.anInterface9Array1[arg0] = arg1;
		this.anInt4365 |= local22;
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(II)V")
	public void method3789() {
		if (this.anInt4369 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static203.anIntArray234[0]);
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)V")
	@Override
	public void method3779() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt4385 &= 0xFFFFFFFB;
		this.anInt4369 = this.method3787();
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Z)V")
	@Override
	public void method3777() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt4385 &= 0xFFFFFFFE;
		this.anInt4369 = this.method3787();
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(BLclient!dga;I)V")
	public void method3790(@OriginalArg(1) Class52_Sub1 arg0, @OriginalArg(2) int arg1) {
		this.method3788(arg1, arg0);
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(ILclient!mea;I)V")
	public void method3791(@OriginalArg(1) Class1_Sub3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt4369 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg1;
		if ((this.anInt4365 & ~local15) == 0) {
			this.anInt4383 = arg0.anInt5783;
			this.anInt4372 = arg0.anInt5774;
		} else if (arg0.anInt5774 != this.anInt4372 || arg0.anInt5783 != this.anInt4383) {
			throw new RuntimeException();
		}
		arg0.method4882(this.anInt4369, Static203.anIntArray234[arg1]);
		this.anInterface9Array1[arg1] = arg0;
		this.anInt4365 |= local15;
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(B)Z")
	public boolean method3792() {
		@Pc(7) int local7 = OpenGL.glCheckFramebufferStatusEXT(this.anInt4369);
		return local7 == 36053;
	}

	@OriginalMember(owner = "client!iu", name = "d", descriptor = "(I)V")
	@Override
	public void method3782() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt4371);
		this.anInt4385 |= 0x2;
		this.anInt4369 = this.method3787();
	}

	@OriginalMember(owner = "client!iu", name = "c", descriptor = "(I)V")
	@Override
	public void method3781() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt4371);
		this.anInt4385 |= 0x1;
		this.anInt4369 = this.method3787();
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIILclient!d;I)V")
	private void method3793(@OriginalArg(1) int arg0, @OriginalArg(3) Class52_Sub2 arg1) {
		if (this.anInt4369 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt4365 & 0xFFFFFFFE) == 0) {
			this.anInt4372 = arg1.anInt1904;
			this.anInt4383 = arg1.anInt1904;
		} else if (this.anInt4372 != arg1.anInt1904 || arg1.anInt1904 != this.anInt4383) {
			throw new RuntimeException();
		}
		arg1.method1662(this.anInt4369, arg0, Static203.anIntArray234[0]);
		this.anInterface9Array1[0] = arg1;
		this.anInt4365 |= 0x1;
	}

	@OriginalMember(owner = "client!iu", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass12_Sub1_19.method407(this.anInt4371);
		super.finalize();
	}
}
