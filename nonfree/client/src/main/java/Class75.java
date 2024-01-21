import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class75 implements Interface2 {

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "Lclient!wd;")
	private Class82 aClass82_12 = new Class82();

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "D")
	private double aDouble9 = 1.0D;

	@OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
	private int anInt2885 = 128;

	@OriginalMember(owner = "client!ua", name = "s", descriptor = "I")
	private int anInt2884 = 0;

	@OriginalMember(owner = "client!ua", name = "v", descriptor = "Lclient!ea;")
	private final Class20 aClass20_57;

	@OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
	private final int anInt2883;

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "[Lclient!vb;")
	private final Class4_Sub22[] aClass4_Sub22Array1;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lclient!ea;Lclient!ea;IDI)V")
	public Class75(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4) {
		this.anInt2885 = arg4;
		this.aDouble9 = arg3;
		this.aClass20_57 = arg1;
		this.anInt2883 = arg2;
		this.anInt2884 = this.anInt2883;
		@Pc(38) int[] local38 = arg0.method598(0);
		@Pc(41) int local41 = local38.length;
		this.aClass4_Sub22Array1 = new Class4_Sub22[arg0.method591(0)];
		for (@Pc(50) int local50 = 0; local50 < local41; local50++) {
			@Pc(63) Class4_Sub11 local63 = new Class4_Sub11(arg0.method597(0, local38[local50]));
			this.aClass4_Sub22Array1[local38[local50]] = new Class4_Sub22(local63);
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ID)V")
	public void method1848(@OriginalArg(1) double arg0) {
		this.aDouble9 = arg0;
		this.method1850();
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)V")
	public void method1849(@OriginalArg(1) int arg0) {
		for (@Pc(3) int local3 = 0; local3 < this.aClass4_Sub22Array1.length; local3++) {
			@Pc(10) Class4_Sub22 local10 = this.aClass4_Sub22Array1[local3];
			if (local10 != null && local10.anInt2967 != 0 && local10.aBoolean267) {
				local10.method1897(arg0);
				local10.aBoolean267 = false;
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZI)Z")
	@Override
	public boolean method1845(@OriginalArg(1) int arg0) {
		return this.anInt2885 == 64;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
	public void method1850() {
		for (@Pc(7) int local7 = 0; local7 < this.aClass4_Sub22Array1.length; local7++) {
			if (this.aClass4_Sub22Array1[local7] != null) {
				this.aClass4_Sub22Array1[local7].method1898();
			}
		}
		this.aClass82_12 = new Class82();
		this.anInt2884 = this.anInt2883;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method1847(@OriginalArg(1) int arg0) {
		return this.aClass4_Sub22Array1[arg0].aBoolean266;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZ)I")
	@Override
	public int method1844(@OriginalArg(0) int arg0) {
		return this.aClass4_Sub22Array1[arg0] == null ? 0 : this.aClass4_Sub22Array1[arg0].anInt2968;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method1846(@OriginalArg(1) int arg0) {
		@Pc(13) Class4_Sub22 local13 = this.aClass4_Sub22Array1[arg0];
		if (local13 != null) {
			if (local13.anIntArray322 != null) {
				this.aClass82_12.method2021(local13);
				local13.aBoolean267 = true;
				return local13.anIntArray322;
			}
			@Pc(38) boolean local38 = local13.method1900(this.aDouble9, this.anInt2885, this.aClass20_57);
			if (local38) {
				if (this.anInt2884 == 0) {
					@Pc(49) Class4_Sub22 local49 = (Class4_Sub22) this.aClass82_12.method2020();
					local49.method1898();
				} else {
					this.anInt2884--;
				}
				this.aClass82_12.method2021(local13);
				local13.aBoolean267 = true;
				return local13.anIntArray322;
			}
		}
		return null;
	}
}
