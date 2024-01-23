import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public class Class74 implements Interface5 {

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "Lclient!g;")
	private Class58 aClass58_8 = new Class58(256);

	@OriginalMember(owner = "client!lj", name = "g", descriptor = "Lclient!ph;")
	private Class138 aClass138_33;

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "Lclient!ph;")
	private Class138 aClass138_32;

	@OriginalMember(owner = "client!lj", name = "k", descriptor = "[Lclient!ob;")
	private Class124[] aClass124Array2;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lclient!ph;Lclient!ph;Lclient!ph;)V")
	protected Class74(@OriginalArg(0) Class138 arg0, @OriginalArg(1) Class138 arg1, @OriginalArg(2) Class138 arg2) {
		this.aClass138_33 = arg1;
		this.aClass138_32 = arg2;
		@Pc(24) Class1_Sub14 local24 = new Class1_Sub14(arg0.method3346(0, 0));
		@Pc(28) int local28 = local24.method2593();
		this.aClass124Array2 = new Class124[local28];
		@Pc(34) int local34;
		for (local34 = 0; local34 < local28; local34++) {
			if (local24.method2595() == 1) {
				this.aClass124Array2[local34] = new Class124();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass124Array2[local34] != null) {
				this.aClass124Array2[local34].aBoolean272 = local24.method2595() == 0;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass124Array2[local34] != null) {
				this.aClass124Array2[local34].aBoolean274 = local24.method2595() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass124Array2[local34] != null) {
				this.aClass124Array2[local34].aBoolean275 = local24.method2595() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass124Array2[local34] != null) {
				this.aClass124Array2[local34].aBoolean276 = local24.method2595() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass124Array2[local34] != null) {
				this.aClass124Array2[local34].aByte19 = local24.method2598();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass124Array2[local34] != null) {
				this.aClass124Array2[local34].aByte18 = local24.method2598();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass124Array2[local34] != null) {
				this.aClass124Array2[local34].aByte17 = local24.method2598();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass124Array2[local34] != null) {
				this.aClass124Array2[local34].aByte16 = local24.method2598();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass124Array2[local34] != null) {
				this.aClass124Array2[local34].aShort22 = (short) local24.method2593();
			}
		}
		if (local24.anInt3290 < local24.aByteArray34.length) {
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass124Array2[local34] != null) {
					local24.method2598();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass124Array2[local34] != null) {
					local24.method2598();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass124Array2[local34] != null) {
					local24.method2595();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass124Array2[local34] != null) {
					this.aClass124Array2[local34].aBoolean271 = local24.method2595() == 1;
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass124Array2[local34] != null) {
					local24.method2598();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass124Array2[local34] != null) {
					local24.method2595();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass124Array2[local34] != null) {
					local24.method2595();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass124Array2[local34] != null) {
					local24.method2595();
				}
			}
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZ)Z")
	@Override
	public final boolean method1619(@OriginalArg(0) int arg0) {
		@Pc(14) Class1_Sub1_Sub23 local14 = this.method1624(arg0);
		return local14 != null && local14.method4216(this.aClass138_32, this);
	}

	@OriginalMember(owner = "client!lj", name = "l", descriptor = "(II)Lclient!ob;")
	@Override
	public final Class124 method1620(@OriginalArg(1) int arg0) {
		return this.aClass124Array2[arg0];
	}

	@OriginalMember(owner = "client!lj", name = "m", descriptor = "(II)Lclient!ud;")
	protected Class1_Sub1_Sub23 method1624(@OriginalArg(0) int arg0) {
		@Pc(17) Class1_Sub1 local17 = this.aClass58_8.method1233((long) arg0);
		if (local17 != null) {
			return (Class1_Sub1_Sub23) local17;
		}
		@Pc(30) byte[] local30 = this.aClass138_33.method3339(arg0);
		if (local30 == null) {
			return null;
		} else {
			@Pc(43) Class1_Sub1_Sub23 local43 = new Class1_Sub1_Sub23(new Class1_Sub14(local30));
			this.aClass58_8.method1229((long) arg0, local43);
			return local43;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZFIIIZ)[I")
	@Override
	public final int[] method1618(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return this.method1624(arg1).method4215(this.aClass138_32, false, arg3, this, arg2, (double) arg0, this.aClass124Array2[arg1].aBoolean271);
	}
}
