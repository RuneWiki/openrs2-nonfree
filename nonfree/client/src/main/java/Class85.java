import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class85 implements Interface2 {

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
	private int anInt2487;

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
	private int anInt2488;

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
	private int anInt2489;

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "[Lclient!qp;")
	private final Interface7[] anInterface7Array1 = new Interface7[9];

	@OriginalMember(owner = "client!gm", name = "h", descriptor = "Lclient!hd;")
	private final Class89_Sub1 aClass89_Sub1_18;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
	private final int anInt2486;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lclient!hd;)V")
	public Class85(@OriginalArg(0) Class89_Sub1 arg0) {
		if (!arg0.aBoolean197) {
			throw new IllegalStateException("");
		}
		this.aClass89_Sub1_18 = arg0;
		this.aClass89_Sub1_18.anOpengl2.glGenFramebuffersEXT(1, Static106.anIntArray336, 0);
		this.anInt2486 = Static106.anIntArray336[0];
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILclient!m;II)V")
	private void method2067(@OriginalArg(1) Class92_Sub3 arg0, @OriginalArg(3) int arg1) {
		if (this.aClass89_Sub1_18.method2452() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt2488 & 0xFFFFFFFE) == 0) {
			this.anInt2489 = arg0.anInt3842;
			this.anInt2487 = arg0.anInt3842;
		} else if (arg0.anInt3842 != this.anInt2489 || arg0.anInt3842 != this.anInt2487) {
			throw new RuntimeException();
		}
		arg0.method3483(Static106.anIntArray335[0], arg1);
		this.anInterface7Array1[0] = arg0;
		this.anInt2488 |= 0x1;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILclient!sr;)V")
	public void method2068(@OriginalArg(1) Class186 arg0) {
		if (this.aClass89_Sub1_18.method2452() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt2488 & 0xFFFFFEFF) == 0) {
			this.anInt2489 = arg0.anInt5727;
			this.anInt2487 = arg0.anInt5730;
		} else if (arg0.anInt5727 != this.anInt2489 || arg0.anInt5730 != this.anInt2487) {
			throw new RuntimeException();
		}
		arg0.method4830(Static106.anIntArray335[8]);
		this.anInterface7Array1[8] = arg0;
		this.anInt2488 |= 0x100;
	}

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "()Z")
	public boolean method2069() {
		@Pc(5) int local5 = this.aClass89_Sub1_18.anOpengl2.glCheckFramebufferStatusEXT(36160);
		return local5 == 36053;
	}

	@OriginalMember(owner = "client!gm", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass89_Sub1_18.method2394(this.anInt2486);
		super.finalize();
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILclient!hj;II)V")
	private void method2070(@OriginalArg(1) Class92_Sub1 arg0, @OriginalArg(3) int arg1) {
		if (this.aClass89_Sub1_18.method2452() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt2488 & 0xFFFFFFFE) == 0) {
			this.anInt2489 = arg0.anInt2684;
			this.anInt2487 = arg0.anInt2685;
		} else if (arg0.anInt2684 != this.anInt2489 || arg0.anInt2685 != this.anInt2487) {
			throw new RuntimeException();
		}
		arg0.method2522(Static106.anIntArray335[0], arg1);
		this.anInterface7Array1[0] = arg0;
		this.anInt2488 |= 0x1;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
	public void method2071(@OriginalArg(0) int arg0) {
		if (this.aClass89_Sub1_18.method2452() != this) {
			throw new RuntimeException();
		}
		this.aClass89_Sub1_18.anOpengl2.glDrawBuffer(Static106.anIntArray335[arg0]);
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V")
	public void method2072(@OriginalArg(0) int arg0) {
		if (this.anInterface7Array1[arg0] != null) {
			this.anInterface7Array1[arg0].method4829();
		}
		this.anInt2488 &= ~(0x1 << arg0);
		this.anInterface7Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "()I")
	@Override
	public int method2391() {
		return this.anInt2487;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILclient!hj;I)V")
	public void method2073(@OriginalArg(1) Class92_Sub1 arg0, @OriginalArg(2) int arg1) {
		this.method2070(arg0, arg1);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILclient!oe;)V")
	public void method2074(@OriginalArg(0) int arg0, @OriginalArg(1) Class92_Sub4 arg1) {
		this.method2076(arg0, arg1);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "()V")
	@Override
	public void method2389() {
		this.aClass89_Sub1_18.anOpengl2.glBindFramebufferEXT(36160, this.anInt2486);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILclient!m;I)V")
	public void method2075(@OriginalArg(1) Class92_Sub3 arg0, @OriginalArg(2) int arg1) {
		this.method2067(arg0, arg1);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILclient!oe;I)V")
	private void method2076(@OriginalArg(0) int arg0, @OriginalArg(1) Class92_Sub4 arg1) {
		if (this.aClass89_Sub1_18.method2452() != this) {
			throw new RuntimeException();
		}
		@Pc(12) int local12 = 0x1 << arg0;
		if ((this.anInt2488 & ~local12) == 0) {
			this.anInt2489 = arg1.anInt3881;
			this.anInt2487 = arg1.anInt3880;
		} else if (arg1.anInt3881 != this.anInt2489 || arg1.anInt3880 != this.anInt2487) {
			throw new RuntimeException();
		}
		arg1.method3533(Static106.anIntArray335[arg0]);
		this.anInterface7Array1[arg0] = arg1;
		this.anInt2488 |= local12;
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "()V")
	@Override
	public void method2390() {
		this.aClass89_Sub1_18.anOpengl2.glBindFramebufferEXT(36160, 0);
	}
}
