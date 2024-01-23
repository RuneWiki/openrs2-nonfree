import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public class Class24 implements Interface3 {

	@OriginalMember(owner = "client!qi", name = "p", descriptor = "Lclient!dj;")
	private Class40 aClass40_2 = new Class40(256);

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "Lclient!fh;")
	private Class58 aClass58_13;

	@OriginalMember(owner = "client!qi", name = "m", descriptor = "Lclient!fh;")
	private Class58 aClass58_14;

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "[Lclient!mi;")
	private Class121[] aClass121Array2;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lclient!fh;Lclient!fh;Lclient!fh;)V")
	protected Class24(@OriginalArg(0) Class58 arg0, @OriginalArg(1) Class58 arg1, @OriginalArg(2) Class58 arg2) {
		this.aClass58_13 = arg1;
		this.aClass58_14 = arg2;
		@Pc(24) Class4_Sub10 local24 = new Class4_Sub10(arg0.method1372(0, 0));
		@Pc(28) int local28 = local24.method4653();
		this.aClass121Array2 = new Class121[local28];
		@Pc(34) int local34;
		for (local34 = 0; local34 < local28; local34++) {
			if (local24.method4666() == 1) {
				this.aClass121Array2[local34] = new Class121();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass121Array2[local34] != null) {
				this.aClass121Array2[local34].aBoolean237 = local24.method4666() == 0;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass121Array2[local34] != null) {
				this.aClass121Array2[local34].aBoolean235 = local24.method4666() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass121Array2[local34] != null) {
				this.aClass121Array2[local34].aBoolean234 = local24.method4666() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass121Array2[local34] != null) {
				this.aClass121Array2[local34].aBoolean233 = local24.method4666() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass121Array2[local34] != null) {
				this.aClass121Array2[local34].aByte10 = local24.method4674();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass121Array2[local34] != null) {
				this.aClass121Array2[local34].aByte7 = local24.method4674();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass121Array2[local34] != null) {
				this.aClass121Array2[local34].aByte8 = local24.method4674();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass121Array2[local34] != null) {
				this.aClass121Array2[local34].aByte9 = local24.method4674();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass121Array2[local34] != null) {
				this.aClass121Array2[local34].aShort26 = (short) local24.method4653();
			}
		}
		if (local24.anInt5713 < local24.aByteArray71.length) {
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass121Array2[local34] != null) {
					local24.method4674();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass121Array2[local34] != null) {
					local24.method4674();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass121Array2[local34] != null) {
					local24.method4666();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass121Array2[local34] != null) {
					this.aClass121Array2[local34].aBoolean236 = local24.method4666() == 1;
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass121Array2[local34] != null) {
					local24.method4674();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass121Array2[local34] != null) {
					local24.method4666();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass121Array2[local34] != null) {
					local24.method4666();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass121Array2[local34] != null) {
					local24.method4666();
				}
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IFIIIZ)[I")
	@Override
	public final int[] method415(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return this.method421(arg2).method2666((double) arg1, this.aClass121Array2[arg2].aBoolean236, this.aClass58_14, this, arg0, false, arg3);
	}

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "(IZ)Lclient!ln;")
	protected Class4_Sub3_Sub15 method421(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub3 local10 = this.aClass40_2.method889((long) arg0);
		if (local10 != null) {
			return (Class4_Sub3_Sub15) local10;
		}
		@Pc(21) byte[] local21 = this.aClass58_13.method1343(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(34) Class4_Sub3_Sub15 local34 = new Class4_Sub3_Sub15(new Class4_Sub10(local21));
			this.aClass40_2.method888((long) arg0, local34);
			return local34;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Z")
	@Override
	public final boolean method416(@OriginalArg(0) int arg0) {
		@Pc(11) Class4_Sub3_Sub15 local11 = this.method421(arg0);
		return local11 != null && local11.method2662(this, this.aClass58_14);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IB)Lclient!mi;")
	@Override
	public final Class121 method417(@OriginalArg(0) int arg0) {
		return this.aClass121Array2[arg0];
	}
}
