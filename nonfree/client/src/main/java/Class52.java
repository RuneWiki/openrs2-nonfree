import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public class Class52 implements Interface1 {

	@OriginalMember(owner = "client!rn", name = "f", descriptor = "Lclient!mi;")
	private Class112 aClass112_7 = new Class112(256);

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "Lclient!nm;")
	private Class119 aClass119_26;

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "Lclient!nm;")
	private Class119 aClass119_27;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "[Lclient!wf;")
	private Class188[] aClass188Array2;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lclient!nm;Lclient!nm;Lclient!nm;)V")
	protected Class52(@OriginalArg(0) Class119 arg0, @OriginalArg(1) Class119 arg1, @OriginalArg(2) Class119 arg2) {
		this.aClass119_26 = arg1;
		this.aClass119_27 = arg2;
		@Pc(24) Class1_Sub13 local24 = new Class1_Sub13(arg0.method3235(0, 0));
		@Pc(28) int local28 = local24.method1879();
		this.aClass188Array2 = new Class188[local28];
		@Pc(34) int local34;
		for (local34 = 0; local34 < local28; local34++) {
			if (local24.method1853() == 1) {
				this.aClass188Array2[local34] = new Class188();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass188Array2[local34] != null) {
				this.aClass188Array2[local34].aBoolean524 = local24.method1853() == 0;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass188Array2[local34] != null) {
				this.aClass188Array2[local34].aBoolean521 = local24.method1853() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass188Array2[local34] != null) {
				this.aClass188Array2[local34].aBoolean526 = local24.method1853() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass188Array2[local34] != null) {
				this.aClass188Array2[local34].aBoolean522 = local24.method1853() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass188Array2[local34] != null) {
				this.aClass188Array2[local34].aByte24 = local24.method1829();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass188Array2[local34] != null) {
				this.aClass188Array2[local34].aByte23 = local24.method1829();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass188Array2[local34] != null) {
				this.aClass188Array2[local34].aByte26 = local24.method1829();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass188Array2[local34] != null) {
				this.aClass188Array2[local34].aByte25 = local24.method1829();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass188Array2[local34] != null) {
				this.aClass188Array2[local34].aShort51 = (short) local24.method1879();
			}
		}
		if (local24.aByteArray63.length > local24.anInt2018) {
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass188Array2[local34] != null) {
					local24.method1829();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass188Array2[local34] != null) {
					local24.method1829();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass188Array2[local34] != null) {
					local24.method1853();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass188Array2[local34] != null) {
					this.aClass188Array2[local34].aBoolean523 = local24.method1853() == 1;
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass188Array2[local34] != null) {
					local24.method1829();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass188Array2[local34] != null) {
					local24.method1853();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass188Array2[local34] != null) {
					local24.method1853();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass188Array2[local34] != null) {
					local24.method1853();
				}
			}
		}
	}

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "(IB)Lclient!kg;")
	protected Class1_Sub5_Sub10 method1452(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub5 local10 = this.aClass112_7.method2951((long) arg0);
		if (local10 != null) {
			return (Class1_Sub5_Sub10) local10;
		}
		@Pc(23) byte[] local23 = this.aClass119_26.method3244(arg0);
		if (local23 == null) {
			return null;
		} else {
			@Pc(44) Class1_Sub5_Sub10 local44 = new Class1_Sub5_Sub10(new Class1_Sub13(local23));
			this.aClass112_7.method2950((long) arg0, local44);
			return local44;
		}
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(BI)Z")
	@Override
	public final boolean method1451(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub5_Sub10 local12 = this.method1452(arg0);
		return local12 != null && local12.method2506(this.aClass119_27, this);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZIIIIF)[I")
	@Override
	public final int[] method1450(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3) {
		return this.method1452(arg1).method2510(false, arg2, (double) arg3, this, this.aClass119_27, this.aClass188Array2[arg1].aBoolean523, arg0);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(BI)Lclient!wf;")
	@Override
	public final Class188 method1449(@OriginalArg(1) int arg0) {
		return this.aClass188Array2[arg0];
	}
}
