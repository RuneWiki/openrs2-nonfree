import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class271 implements Interface13 {

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
	private int anInt7713;

	@OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
	private int anInt7721;

	@OriginalMember(owner = "client!qk", name = "s", descriptor = "I")
	private int anInt7730;

	@OriginalMember(owner = "client!qk", name = "n", descriptor = "I")
	private int anInt7725 = -1;

	@OriginalMember(owner = "client!qk", name = "x", descriptor = "I")
	private int anInt7734 = 0;

	@OriginalMember(owner = "client!qk", name = "z", descriptor = "[Lclient!nca;")
	private final Interface17[] anInterface17Array1 = new Interface17[9];

	@OriginalMember(owner = "client!qk", name = "t", descriptor = "Lclient!qj;")
	private final Class100_Sub3 aClass100_Sub3_35;

	@OriginalMember(owner = "client!qk", name = "u", descriptor = "I")
	private final int anInt7731;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lclient!qj;)V")
	public Class271(@OriginalArg(0) Class100_Sub3 arg0) {
		if (!arg0.aBoolean600) {
			throw new IllegalStateException("");
		}
		this.aClass100_Sub3_35 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static543.anIntArray642, 0);
		this.anInt7731 = Static543.anIntArray642[0];
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)V")
	public void method6352(@OriginalArg(0) int arg0) {
		if (this.anInterface17Array1[arg0] != null) {
			this.anInterface17Array1[arg0].method7774();
		}
		this.anInt7730 &= ~(0x1 << arg0);
		this.anInterface17Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!qk", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass100_Sub3_35.method6308(this.anInt7731);
		super.finalize();
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V")
	@Override
	public void method6347() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt7734 &= 0xFFFFFFFD;
		this.anInt7725 = this.method6355();
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!waa;BIII)V")
	private void method6353(@OriginalArg(0) Class23_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt7725 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt7730 & 0xFFFFFFFE) == 0) {
			this.anInt7721 = arg0.anInt9361;
			this.anInt7713 = arg0.anInt9361;
		} else if (arg0.anInt9361 != this.anInt7713 || arg0.anInt9361 != this.anInt7721) {
			throw new RuntimeException();
		}
		arg0.method7786(Static462.anIntArray524[0], this.anInt7725, arg1);
		this.anInterface17Array1[0] = arg0;
		this.anInt7730 |= 0x1;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
	@Override
	public void method6345() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt7731);
		this.anInt7734 |= 0x4;
		this.anInt7725 = this.method6355();
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILclient!pm;BI)V")
	private void method6354(@OriginalArg(0) int arg0, @OriginalArg(1) Class23_Sub1 arg1) {
		if (this.anInt7725 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg0;
		if ((this.anInt7730 & ~local16) == 0) {
			this.anInt7713 = arg1.anInt570;
			this.anInt7721 = arg1.anInt578;
		} else if (this.anInt7713 != arg1.anInt570 || arg1.anInt578 != this.anInt7721) {
			throw new RuntimeException();
		}
		arg1.method375(this.anInt7725, Static462.anIntArray524[arg0]);
		this.anInterface17Array1[arg0] = arg1;
		this.anInt7730 |= local16;
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)I")
	private int method6355() {
		if ((this.anInt7734 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt7734 & 0x2) == 0) {
			return (this.anInt7734 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IZ)V")
	public void method6356(@OriginalArg(0) int arg0) {
		if (this.anInt7725 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static462.anIntArray524[arg0]);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)Z")
	public boolean method6357() {
		@Pc(12) int local12 = OpenGL.glCheckFramebufferStatusEXT(this.anInt7725);
		return local12 == 36053;
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V")
	@Override
	public void method6346() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt7734 &= 0xFFFFFFFB;
		this.anInt7725 = this.method6355();
	}

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "(I)V")
	@Override
	public void method6350() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt7731);
		this.anInt7734 |= 0x2;
		this.anInt7725 = this.method6355();
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILclient!pca;I)V")
	public void method6358(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub3_Sub12 arg1) {
		if (this.anInt7725 == -1) {
			throw new RuntimeException();
		}
		@Pc(23) int local23 = 0x1 << arg0;
		if ((this.anInt7730 & ~local23) == 0) {
			this.anInt7713 = arg1.anInt6971;
			this.anInt7721 = arg1.anInt6967;
		} else if (this.anInt7713 != arg1.anInt6971 || arg1.anInt6967 != this.anInt7721) {
			throw new RuntimeException();
		}
		arg1.method5835(Static462.anIntArray524[arg0], this.anInt7725);
		this.anInterface17Array1[arg0] = arg1;
		this.anInt7730 |= local23;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(BI)V")
	public void method6359() {
		if (this.anInt7725 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static462.anIntArray524[0]);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V")
	@Override
	public void method6348() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt7731);
		this.anInt7734 |= 0x1;
		this.anInt7725 = this.method6355();
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IBLclient!waa;I)V")
	public void method6360(@OriginalArg(2) Class23_Sub4 arg0, @OriginalArg(3) int arg1) {
		this.method6353(arg0, arg1);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!pm;BI)V")
	public void method6361(@OriginalArg(0) Class23_Sub1 arg0, @OriginalArg(2) int arg1) {
		this.method6354(arg1, arg0);
	}

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)V")
	@Override
	public void method6349() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt7734 &= 0xFFFFFFFE;
		this.anInt7725 = this.method6355();
	}
}
