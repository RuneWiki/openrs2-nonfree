import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lda")
public final class Class217 implements Interface1 {

	@OriginalMember(owner = "client!lda", name = "G", descriptor = "I")
	private int anInt5753;

	@OriginalMember(owner = "client!lda", name = "j", descriptor = "I")
	private int anInt5760;

	@OriginalMember(owner = "client!lda", name = "q", descriptor = "I")
	private int anInt5765;

	@OriginalMember(owner = "client!lda", name = "B", descriptor = "I")
	private int anInt5749 = 0;

	@OriginalMember(owner = "client!lda", name = "h", descriptor = "I")
	private int anInt5744 = -1;

	@OriginalMember(owner = "client!lda", name = "e", descriptor = "[Lclient!nk;")
	private final Interface15[] anInterface15Array1 = new Interface15[9];

	@OriginalMember(owner = "client!lda", name = "c", descriptor = "Lclient!pi;")
	private final Class144_Sub3 aClass144_Sub3_21;

	@OriginalMember(owner = "client!lda", name = "l", descriptor = "I")
	private final int anInt5764;

	@OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(Lclient!pi;)V")
	public Class217(@OriginalArg(0) Class144_Sub3 arg0) {
		if (!arg0.aBoolean576) {
			throw new IllegalStateException("");
		}
		this.aClass144_Sub3_21 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static221.anIntArray223, 0);
		this.anInt5764 = Static221.anIntArray223[0];
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(ILclient!vr;III)V")
	private void method5178(@OriginalArg(1) Class161_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt5744 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt5753 & 0xFFFFFFFE) == 0) {
			this.anInt5760 = arg0.anInt10753;
			this.anInt5765 = arg0.anInt10753;
		} else if (this.anInt5760 != arg0.anInt10753 || arg0.anInt10753 != this.anInt5765) {
			throw new RuntimeException();
		}
		arg0.method9177(this.anInt5744, Static256.anIntArray242[0], arg1);
		this.anInterface15Array1[0] = arg0;
		this.anInt5753 |= 0x1;
	}

	@OriginalMember(owner = "client!lda", name = "d", descriptor = "(II)V")
	public void method5180(@OriginalArg(1) int arg0) {
		if (this.anInt5744 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static256.anIntArray242[arg0]);
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(II)V")
	public void method5181() {
		if (this.anInt5744 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static256.anIntArray242[0]);
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lclient!sb;III)V")
	private void method5182(@OriginalArg(0) Class161_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt5744 == -1) {
			throw new RuntimeException();
		}
		@Pc(23) int local23 = 0x1 << arg1;
		if ((this.anInt5753 & ~local23) == 0) {
			this.anInt5760 = arg0.anInt4554;
			this.anInt5765 = arg0.anInt4546;
		} else if (arg0.anInt4554 != this.anInt5760 || arg0.anInt4546 != this.anInt5765) {
			throw new RuntimeException();
		}
		arg0.method3967(Static256.anIntArray242[arg1], this.anInt5744);
		this.anInterface15Array1[arg1] = arg0;
		this.anInt5753 |= local23;
	}

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "(B)Z")
	public boolean method5184() {
		@Pc(15) int local15 = OpenGL.glCheckFramebufferStatusEXT(this.anInt5744);
		return local15 == 36053;
	}

	@OriginalMember(owner = "client!lda", name = "d", descriptor = "(I)V")
	@Override
	public void method5172() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt5764);
		this.anInt5749 |= 0x4;
		this.anInt5744 = this.method5185();
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(I)V")
	@Override
	public void method5174() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt5764);
		this.anInt5749 |= 0x2;
		this.anInt5744 = this.method5185();
	}

	@OriginalMember(owner = "client!lda", name = "e", descriptor = "(I)I")
	private int method5185() {
		if ((this.anInt5749 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt5749 & 0x2) == 0) {
			return (this.anInt5749 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(B)V")
	@Override
	public void method5175() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt5749 &= 0xFFFFFFFB;
		this.anInt5744 = this.method5185();
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IILclient!sb;)V")
	public void method5186(@OriginalArg(1) int arg0, @OriginalArg(2) Class161_Sub1 arg1) {
		this.method5182(arg1, arg0);
	}

	@OriginalMember(owner = "client!lda", name = "c", descriptor = "(II)V")
	public void method5187(@OriginalArg(0) int arg0) {
		if (this.anInterface15Array1[arg0] != null) {
			this.anInterface15Array1[arg0].method9166();
		}
		this.anInt5753 &= ~(0x1 << arg0);
		this.anInterface15Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!lda", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass144_Sub3_21.method7056(this.anInt5764);
		super.finalize();
	}

	@OriginalMember(owner = "client!lda", name = "c", descriptor = "(I)V")
	@Override
	public void method5173() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt5749 &= 0xFFFFFFFE;
		this.anInt5744 = this.method5185();
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIILclient!vr;)V")
	public void method5188(@OriginalArg(0) int arg0, @OriginalArg(3) Class161_Sub4 arg1) {
		this.method5178(arg1, arg0);
	}

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "(I)V")
	@Override
	public void method5176() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt5749 &= 0xFFFFFFFD;
		this.anInt5744 = this.method5185();
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lclient!jv;II)V")
	public void method5189(@OriginalArg(0) Class14_Sub2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt5744 == -1) {
			throw new RuntimeException();
		}
		@Pc(21) int local21 = 0x1 << arg1;
		if ((~local21 & this.anInt5753) == 0) {
			this.anInt5765 = arg0.anInt5347;
			this.anInt5760 = arg0.anInt5343;
		} else if (arg0.anInt5343 != this.anInt5760 || arg0.anInt5347 != this.anInt5765) {
			throw new RuntimeException();
		}
		arg0.method4873(this.anInt5744, Static256.anIntArray242[arg1]);
		this.anInterface15Array1[arg1] = arg0;
		this.anInt5753 |= local21;
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(Z)V")
	@Override
	public void method5177() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt5764);
		this.anInt5749 |= 0x1;
		this.anInt5744 = this.method5185();
	}
}
