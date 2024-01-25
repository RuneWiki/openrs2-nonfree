import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class77 implements Interface4 {

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
	private int anInt2586;

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
	private int anInt2587;

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
	private int anInt2589;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "[Lclient!ii;")
	private final Interface5[] anInterface5Array1 = new Interface5[9];

	@OriginalMember(owner = "client!gg", name = "h", descriptor = "Lclient!ig;")
	private final Class47_Sub2 aClass47_Sub2_15;

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
	private final int anInt2588;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!ig;)V")
	public Class77(@OriginalArg(0) Class47_Sub2 arg0) {
		if (!arg0.aBoolean228) {
			throw new IllegalStateException("");
		}
		this.aClass47_Sub2_15 = arg0;
		this.aClass47_Sub2_15.anOpengl2.glGenFramebuffersEXT(1, Static102.anIntArray228, 0);
		this.anInt2588 = Static102.anIntArray228[0];
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "()V")
	@Override
	public void method2763() {
		this.aClass47_Sub2_15.anOpengl2.glBindFramebufferEXT(36160, this.anInt2588);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!hf;I)V")
	private void method2288(@OriginalArg(0) int arg0, @OriginalArg(1) Class52_Sub1 arg1) {
		if (this.aClass47_Sub2_15.method2815() != this) {
			throw new RuntimeException();
		}
		@Pc(12) int local12 = 0x1 << arg0;
		if ((this.anInt2589 & ~local12) == 0) {
			this.anInt2586 = arg1.anInt5495;
			this.anInt2587 = arg1.anInt5496;
		} else if (arg1.anInt5495 != this.anInt2586 || arg1.anInt5496 != this.anInt2587) {
			throw new RuntimeException();
		}
		arg1.method4732(Static102.anIntArray227[arg0]);
		this.anInterface5Array1[arg0] = arg1;
		this.anInt2589 |= local12;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
	public void method2289(@OriginalArg(0) int arg0) {
		if (this.anInterface5Array1[arg0] != null) {
			this.anInterface5Array1[arg0].method5602();
		}
		this.anInt2589 &= ~(0x1 << arg0);
		this.anInterface5Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!wl;I)V")
	public void method2290(@OriginalArg(1) Class52_Sub4 arg0, @OriginalArg(2) int arg1) {
		this.method2294(arg0, arg1);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!hf;)V")
	public void method2291(@OriginalArg(0) int arg0, @OriginalArg(1) Class52_Sub1 arg1) {
		this.method2288(arg0, arg1);
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "()V")
	@Override
	public void method2762() {
		this.aClass47_Sub2_15.anOpengl2.glBindFramebufferEXT(36160, 0);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!rr;)V")
	public void method2292(@OriginalArg(1) Class179 arg0) {
		if (this.aClass47_Sub2_15.method2815() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt2589 & 0xFFFFFEFF) == 0) {
			this.anInt2586 = arg0.anInt5525;
			this.anInt2587 = arg0.anInt5526;
		} else if (arg0.anInt5525 != this.anInt2586 || arg0.anInt5526 != this.anInt2587) {
			throw new RuntimeException();
		}
		arg0.method4775(Static102.anIntArray227[8]);
		this.anInterface5Array1[8] = arg0;
		this.anInt2589 |= 0x100;
	}

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "()Z")
	public boolean method2293() {
		@Pc(5) int local5 = this.aClass47_Sub2_15.anOpengl2.glCheckFramebufferStatusEXT(36160);
		return local5 == 36053;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!wl;II)V")
	private void method2294(@OriginalArg(1) Class52_Sub4 arg0, @OriginalArg(3) int arg1) {
		if (this.aClass47_Sub2_15.method2815() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt2589 & 0xFFFFFFFE) == 0) {
			this.anInt2586 = arg0.anInt6687;
			this.anInt2587 = arg0.anInt6687;
		} else if (arg0.anInt6687 != this.anInt2586 || arg0.anInt6687 != this.anInt2587) {
			throw new RuntimeException();
		}
		arg0.method5616(Static102.anIntArray227[0], arg1);
		this.anInterface5Array1[0] = arg0;
		this.anInt2589 |= 0x1;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "()I")
	@Override
	public int method2761() {
		return this.anInt2587;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
	public void method2295(@OriginalArg(0) int arg0) {
		if (this.aClass47_Sub2_15.method2815() != this) {
			throw new RuntimeException();
		}
		this.aClass47_Sub2_15.anOpengl2.glDrawBuffer(Static102.anIntArray227[arg0]);
	}

	@OriginalMember(owner = "client!gg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass47_Sub2_15.method2789(this.anInt2588);
		super.finalize();
	}
}
