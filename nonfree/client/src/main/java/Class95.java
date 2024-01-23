import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public class Class95 implements Interface4 {

	@OriginalMember(owner = "client!om", name = "p", descriptor = "Lclient!nb;")
	private Class111 aClass111_11 = new Class111(256);

	@OriginalMember(owner = "client!om", name = "n", descriptor = "Lclient!cg;")
	private Class22 aClass22_53;

	@OriginalMember(owner = "client!om", name = "j", descriptor = "Lclient!cg;")
	private Class22 aClass22_52;

	@OriginalMember(owner = "client!om", name = "q", descriptor = "[Lclient!sc;")
	private Class152[] aClass152Array2;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!cg;Lclient!cg;Lclient!cg;)V")
	protected Class95(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) Class22 arg2) {
		this.aClass22_53 = arg2;
		this.aClass22_52 = arg1;
		@Pc(24) Class4_Sub24 local24 = new Class4_Sub24(arg0.method665(0, 0));
		@Pc(28) int local28 = local24.method3085();
		this.aClass152Array2 = new Class152[local28];
		@Pc(34) int local34;
		for (local34 = 0; local34 < local28; local34++) {
			if (local24.method3110() == 1) {
				this.aClass152Array2[local34] = new Class152();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass152Array2[local34] != null) {
				this.aClass152Array2[local34].aBoolean307 = local24.method3110() == 0;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass152Array2[local34] != null) {
				this.aClass152Array2[local34].aBoolean310 = local24.method3110() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass152Array2[local34] != null) {
				this.aClass152Array2[local34].aBoolean306 = local24.method3110() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass152Array2[local34] != null) {
				this.aClass152Array2[local34].aBoolean308 = local24.method3110() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass152Array2[local34] != null) {
				this.aClass152Array2[local34].aByte19 = local24.method3069();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass152Array2[local34] != null) {
				this.aClass152Array2[local34].aByte17 = local24.method3069();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass152Array2[local34] != null) {
				this.aClass152Array2[local34].aByte20 = local24.method3069();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass152Array2[local34] != null) {
				this.aClass152Array2[local34].aByte18 = local24.method3069();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass152Array2[local34] != null) {
				this.aClass152Array2[local34].aShort29 = (short) local24.method3085();
			}
		}
		if (local24.anInt3822 < local24.aByteArray47.length) {
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass152Array2[local34] != null) {
					local24.method3069();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass152Array2[local34] != null) {
					local24.method3069();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass152Array2[local34] != null) {
					local24.method3110();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass152Array2[local34] != null) {
					this.aClass152Array2[local34].aBoolean311 = local24.method3110() == 1;
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass152Array2[local34] != null) {
					local24.method3069();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass152Array2[local34] != null) {
					local24.method3110();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass152Array2[local34] != null) {
					local24.method3110();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass152Array2[local34] != null) {
					local24.method3110();
				}
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(IB)Lclient!kj;")
	protected Class4_Sub2_Sub12 method2416(@OriginalArg(0) int arg0) {
		@Pc(12) Class4_Sub2 local12 = this.aClass111_11.method2890((long) arg0);
		if (local12 != null) {
			return (Class4_Sub2_Sub12) local12;
		}
		@Pc(30) byte[] local30 = this.aClass22_52.method683(arg0);
		if (local30 == null) {
			return null;
		} else {
			@Pc(43) Class4_Sub2_Sub12 local43 = new Class4_Sub2_Sub12(new Class4_Sub24(local30));
			this.aClass111_11.method2886((long) arg0, local43);
			return local43;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZI)Z")
	@Override
	public final boolean method2414(@OriginalArg(1) int arg0) {
		@Pc(12) Class4_Sub2_Sub12 local12 = this.method2416(arg0);
		return local12 != null && local12.method2319(this.aClass22_53, this);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(BIZIFI)[I")
	@Override
	public final int[] method2412(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3) {
		return this.method2416(arg1).method2322((double) arg2, arg3, false, this, this.aClass152Array2[arg1].aBoolean311, arg0, this.aClass22_53);
	}

	@OriginalMember(owner = "client!om", name = "i", descriptor = "(II)Lclient!sc;")
	@Override
	public final Class152 method2413(@OriginalArg(1) int arg0) {
		return this.aClass152Array2[arg0];
	}
}
