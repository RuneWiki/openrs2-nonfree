import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class77 {

	@OriginalMember(owner = "client!gi", name = "i", descriptor = "J")
	private long aLong66;

	@OriginalMember(owner = "client!gi", name = "p", descriptor = "Lclient!ff;")
	private Class14_Sub2 aClass14_Sub2_19;

	@OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
	private final int anInt2293;

	@OriginalMember(owner = "client!gi", name = "j", descriptor = "[Lclient!ff;")
	private final Class14_Sub2[] aClass14_Sub2Array1;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(I)V")
	public Class77(@OriginalArg(0) int arg0) {
		this.anInt2293 = arg0;
		this.aClass14_Sub2Array1 = new Class14_Sub2[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class14_Sub2 local20 = this.aClass14_Sub2Array1[local10] = new Class14_Sub2();
			local20.aClass14_Sub2_61 = local20;
			local20.aClass14_Sub2_62 = local20;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!ff;IJ)V")
	public void method2259(@OriginalArg(0) Class14_Sub2 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass14_Sub2_62 != null) {
			arg0.method5760();
		}
		@Pc(25) Class14_Sub2 local25 = this.aClass14_Sub2Array1[(int) (arg1 & (long) (this.anInt2293 - 1))];
		arg0.aClass14_Sub2_62 = local25.aClass14_Sub2_62;
		arg0.aClass14_Sub2_61 = local25;
		arg0.aClass14_Sub2_62.aClass14_Sub2_61 = arg0;
		arg0.aLong208 = arg1;
		arg0.aClass14_Sub2_61.aClass14_Sub2_62 = arg0;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IJ)Lclient!ff;")
	public Class14_Sub2 method2262(@OriginalArg(1) long arg0) {
		this.aLong66 = arg0;
		@Pc(20) Class14_Sub2 local20 = this.aClass14_Sub2Array1[(int) ((long) (this.anInt2293 - 1) & arg0)];
		for (this.aClass14_Sub2_19 = local20.aClass14_Sub2_61; this.aClass14_Sub2_19 != local20; this.aClass14_Sub2_19 = this.aClass14_Sub2_19.aClass14_Sub2_61) {
			if (this.aClass14_Sub2_19.aLong208 == arg0) {
				@Pc(39) Class14_Sub2 local39 = this.aClass14_Sub2_19;
				this.aClass14_Sub2_19 = this.aClass14_Sub2_19.aClass14_Sub2_61;
				return local39;
			}
		}
		this.aClass14_Sub2_19 = null;
		return null;
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)Lclient!ff;")
	public Class14_Sub2 method2263() {
		if (this.aClass14_Sub2_19 == null) {
			return null;
		}
		@Pc(23) Class14_Sub2 local23 = this.aClass14_Sub2Array1[(int) (this.aLong66 & (long) (this.anInt2293 - 1))];
		while (this.aClass14_Sub2_19 != local23) {
			if (this.aClass14_Sub2_19.aLong208 == this.aLong66) {
				@Pc(43) Class14_Sub2 local43 = this.aClass14_Sub2_19;
				this.aClass14_Sub2_19 = this.aClass14_Sub2_19.aClass14_Sub2_61;
				return local43;
			}
			this.aClass14_Sub2_19 = this.aClass14_Sub2_19.aClass14_Sub2_61;
		}
		this.aClass14_Sub2_19 = null;
		return null;
	}
}
