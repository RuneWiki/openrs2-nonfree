import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class183 implements Interface3 {

	@OriginalMember(owner = "client!ns", name = "k", descriptor = "I")
	private int anInt4527;

	@OriginalMember(owner = "client!ns", name = "x", descriptor = "I")
	private int anInt4536;

	@OriginalMember(owner = "client!ns", name = "A", descriptor = "I")
	private int anInt4539;

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "I")
	private int anInt4521 = -1;

	@OriginalMember(owner = "client!ns", name = "n", descriptor = "[Lclient!lk;")
	private final Interface10[] anInterface10Array1 = new Interface10[9];

	@OriginalMember(owner = "client!ns", name = "g", descriptor = "I")
	private int anInt4523 = 0;

	@OriginalMember(owner = "client!ns", name = "v", descriptor = "Lclient!ug;")
	private final Class135_Sub2 aClass135_Sub2_25;

	@OriginalMember(owner = "client!ns", name = "z", descriptor = "I")
	private final int anInt4538;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lclient!ug;)V")
	public Class183(@OriginalArg(0) Class135_Sub2 arg0) {
		if (!arg0.aBoolean458) {
			throw new IllegalStateException("");
		}
		this.aClass135_Sub2_25 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static82.anIntArray119, 0);
		this.anInt4538 = Static82.anIntArray119[0];
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)V")
	public void method3605(@OriginalArg(0) int arg0) {
		if (this.anInterface10Array1[arg0] != null) {
			this.anInterface10Array1[arg0].method4759();
		}
		this.anInt4539 &= ~(0x1 << arg0);
		this.anInterface10Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!nn;IIII)V")
	private void method3606(@OriginalArg(0) Class65_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt4521 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt4539 & 0xFFFFFFFE) == 0) {
			this.anInt4536 = arg0.anInt4432;
			this.anInt4527 = arg0.anInt4432;
		} else if (this.anInt4527 != arg0.anInt4432 || arg0.anInt4432 != this.anInt4536) {
			throw new RuntimeException();
		}
		arg0.method3535(arg1, Static26.anIntArray52[0], this.anInt4521);
		this.anInterface10Array1[0] = arg0;
		this.anInt4539 |= 0x1;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZI)V")
	public void method3607(@OriginalArg(1) int arg0) {
		if (this.anInt4521 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static26.anIntArray52[arg0]);
	}

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "(B)I")
	public int method3608() {
		return this.anInt4536;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V")
	@Override
	public void method3599() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt4538);
		this.anInt4523 |= 0x4;
		this.anInt4521 = this.method3612();
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(B)V")
	@Override
	public void method3602() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt4538);
		this.anInt4523 |= 0x1;
		this.anInt4521 = this.method3612();
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)V")
	@Override
	public void method3600() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt4523 &= 0xFFFFFFFE;
		this.anInt4521 = this.method3612();
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIBLclient!nn;)V")
	public void method3609(@OriginalArg(0) int arg0, @OriginalArg(3) Class65_Sub3 arg1) {
		this.method3606(arg1, arg0);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!ml;II)V")
	public void method3610(@OriginalArg(0) Class65_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.method3615(arg1, arg0);
	}

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "(I)I")
	private int method3612() {
		if ((this.anInt4523 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt4523 & 0x2) == 0) {
			return (this.anInt4523 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IILclient!ml;I)V")
	private void method3615(@OriginalArg(1) int arg0, @OriginalArg(2) Class65_Sub2 arg1) {
		if (this.anInt4521 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg0;
		if ((this.anInt4539 & ~local16) == 0) {
			this.anInt4527 = arg1.anInt4497;
			this.anInt4536 = arg1.anInt4496;
		} else if (this.anInt4527 != arg1.anInt4497 || this.anInt4536 != arg1.anInt4496) {
			throw new RuntimeException();
		}
		arg1.method3587(this.anInt4521, Static26.anIntArray52[arg0]);
		this.anInterface10Array1[arg0] = arg1;
		this.anInt4539 |= local16;
	}

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "(I)Z")
	public boolean method3616() {
		@Pc(7) int local7 = OpenGL.glCheckFramebufferStatusEXT(this.anInt4521);
		return local7 == 36053;
	}

	@OriginalMember(owner = "client!ns", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass135_Sub2_25.method5449(this.anInt4538);
		super.finalize();
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(II)V")
	public void method3618() {
		if (this.anInt4521 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static26.anIntArray52[0]);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Z)V")
	@Override
	public void method3601() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt4523 &= 0xFFFFFFFD;
		this.anInt4521 = this.method3612();
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!cf;II)V")
	public void method3619(@OriginalArg(0) Class4_Sub2_Sub5 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt4521 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg1;
		if ((this.anInt4539 & ~local16) == 0) {
			this.anInt4536 = arg0.anInt760;
			this.anInt4527 = arg0.anInt761;
		} else if (arg0.anInt761 != this.anInt4527 || arg0.anInt760 != this.anInt4536) {
			throw new RuntimeException();
		}
		arg0.method633(Static26.anIntArray52[arg1], this.anInt4521);
		this.anInterface10Array1[arg1] = arg0;
		this.anInt4539 |= local16;
	}

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "(B)V")
	@Override
	public void method3603() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt4538);
		this.anInt4523 |= 0x2;
		this.anInt4521 = this.method3612();
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)V")
	@Override
	public void method3604() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt4523 &= 0xFFFFFFFB;
		this.anInt4521 = this.method3612();
	}
}
