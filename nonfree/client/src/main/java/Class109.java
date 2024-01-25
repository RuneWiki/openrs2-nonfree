import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class109 implements Interface3 {

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
	private int anInt2957;

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
	private int anInt2958;

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
	private int anInt2959;

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "[Lclient!gg;")
	private final Interface2[] anInterface2Array1 = new Interface2[9];

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "Lclient!se;")
	private final Class122_Sub2 aClass122_Sub2_19;

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
	private final int anInt2960;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lclient!se;)V")
	public Class109(@OriginalArg(0) Class122_Sub2 arg0) {
		if (!arg0.aBoolean355) {
			throw new IllegalStateException("");
		}
		this.aClass122_Sub2_19 = arg0;
		this.aClass122_Sub2_19.anOpengl2.glGenFramebuffersEXT(1, Static150.anIntArray209, 0);
		this.anInt2960 = Static150.anIntArray209[0];
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
	public void method2429(@OriginalArg(0) int arg0) {
		if (this.anInterface2Array1[arg0] != null) {
			this.anInterface2Array1[arg0].method4037();
		}
		this.anInt2957 &= ~(0x1 << arg0);
		this.anInterface2Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILclient!nc;II)V")
	private void method2430(@OriginalArg(1) Class66_Sub3 arg0, @OriginalArg(3) int arg1) {
		if (this.aClass122_Sub2_19.method4858() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt2957 & 0xFFFFFFFE) == 0) {
			this.anInt2959 = arg0.anInt4189;
			this.anInt2958 = arg0.anInt4187;
		} else if (arg0.anInt4189 != this.anInt2959 || arg0.anInt4187 != this.anInt2958) {
			throw new RuntimeException();
		}
		arg0.method3565(Static150.anIntArray210[0], arg1);
		this.anInterface2Array1[0] = arg0;
		this.anInt2957 |= 0x1;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILclient!oa;I)V")
	private void method2431(@OriginalArg(0) int arg0, @OriginalArg(1) Class66_Sub1 arg1) {
		if (this.aClass122_Sub2_19.method4858() != this) {
			throw new RuntimeException();
		}
		@Pc(12) int local12 = 0x1 << arg0;
		if ((this.anInt2957 & ~local12) == 0) {
			this.anInt2959 = arg1.anInt1844;
			this.anInt2958 = arg1.anInt1842;
		} else if (arg1.anInt1844 != this.anInt2959 || arg1.anInt1842 != this.anInt2958) {
			throw new RuntimeException();
		}
		arg1.method1515(Static150.anIntArray210[arg0]);
		this.anInterface2Array1[arg0] = arg1;
		this.anInt2957 |= local12;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILclient!pi;II)V")
	private void method2432(@OriginalArg(1) Class66_Sub4 arg0, @OriginalArg(3) int arg1) {
		if (this.aClass122_Sub2_19.method4858() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt2957 & 0xFFFFFFFE) == 0) {
			this.anInt2959 = arg0.anInt4756;
			this.anInt2958 = arg0.anInt4756;
		} else if (arg0.anInt4756 != this.anInt2959 || arg0.anInt4756 != this.anInt2958) {
			throw new RuntimeException();
		}
		arg0.method4051(Static150.anIntArray210[0], arg1);
		this.anInterface2Array1[0] = arg0;
		this.anInt2957 |= 0x1;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V")
	public void method2433(@OriginalArg(0) int arg0) {
		if (this.aClass122_Sub2_19.method4858() != this) {
			throw new RuntimeException();
		}
		this.aClass122_Sub2_19.anOpengl2.glDrawBuffer(Static150.anIntArray210[arg0]);
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "()V")
	@Override
	public void method4808() {
		this.aClass122_Sub2_19.anOpengl2.glBindFramebufferEXT(36160, 0);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILclient!pi;I)V")
	public void method2434(@OriginalArg(1) Class66_Sub4 arg0, @OriginalArg(2) int arg1) {
		this.method2432(arg0, arg1);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILclient!ij;)V")
	public void method2435(@OriginalArg(1) Class94 arg0) {
		if (this.aClass122_Sub2_19.method4858() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt2957 & 0xFFFFFEFF) == 0) {
			this.anInt2959 = arg0.anInt2765;
			this.anInt2958 = arg0.anInt2763;
		} else if (arg0.anInt2765 != this.anInt2959 || arg0.anInt2763 != this.anInt2958) {
			throw new RuntimeException();
		}
		arg0.method2238(Static150.anIntArray210[8]);
		this.anInterface2Array1[8] = arg0;
		this.anInt2957 |= 0x100;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILclient!oa;)V")
	public void method2436(@OriginalArg(0) int arg0, @OriginalArg(1) Class66_Sub1 arg1) {
		this.method2431(arg0, arg1);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "()I")
	@Override
	public int method4806() {
		return this.anInt2958;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "()V")
	@Override
	public void method4807() {
		this.aClass122_Sub2_19.anOpengl2.glBindFramebufferEXT(36160, this.anInt2960);
	}

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "()Z")
	public boolean method2437() {
		@Pc(5) int local5 = this.aClass122_Sub2_19.anOpengl2.glCheckFramebufferStatusEXT(36160);
		return local5 == 36053;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILclient!nc;I)V")
	public void method2438(@OriginalArg(1) Class66_Sub3 arg0, @OriginalArg(2) int arg1) {
		this.method2430(arg0, arg1);
	}

	@OriginalMember(owner = "client!jj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass122_Sub2_19.method4870(this.anInt2960);
		super.finalize();
	}
}
