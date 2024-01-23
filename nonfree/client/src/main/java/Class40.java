import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public class Class40 implements Interface3 {

	@OriginalMember(owner = "client!qk", name = "m", descriptor = "Lclient!gi;")
	private Class64 aClass64_8 = new Class64(256);

	@OriginalMember(owner = "client!qk", name = "i", descriptor = "Lclient!ak;")
	private Class7 aClass7_55;

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "Lclient!ak;")
	private Class7 aClass7_54;

	@OriginalMember(owner = "client!qk", name = "g", descriptor = "[Lclient!rn;")
	private Class145[] aClass145Array2;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lclient!ak;Lclient!ak;Lclient!ak;)V")
	protected Class40(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) Class7 arg2) {
		this.aClass7_55 = arg2;
		this.aClass7_54 = arg1;
		@Pc(24) Class1_Sub18 local24 = new Class1_Sub18(arg0.method253(0, 0));
		@Pc(28) int local28 = local24.method3107();
		this.aClass145Array2 = new Class145[local28];
		@Pc(34) int local34;
		for (local34 = 0; local34 < local28; local34++) {
			if (local24.method3122() == 1) {
				this.aClass145Array2[local34] = new Class145();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass145Array2[local34] != null) {
				this.aClass145Array2[local34].aBoolean363 = local24.method3122() == 0;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass145Array2[local34] != null) {
				this.aClass145Array2[local34].aBoolean362 = local24.method3122() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass145Array2[local34] != null) {
				this.aClass145Array2[local34].aBoolean364 = local24.method3122() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass145Array2[local34] != null) {
				this.aClass145Array2[local34].aBoolean361 = local24.method3122() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass145Array2[local34] != null) {
				this.aClass145Array2[local34].aByte23 = local24.method3082();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass145Array2[local34] != null) {
				this.aClass145Array2[local34].aByte22 = local24.method3082();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass145Array2[local34] != null) {
				this.aClass145Array2[local34].aByte24 = local24.method3082();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass145Array2[local34] != null) {
				this.aClass145Array2[local34].aByte21 = local24.method3082();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass145Array2[local34] != null) {
				this.aClass145Array2[local34].aShort37 = (short) local24.method3107();
			}
		}
		if (local24.anInt3911 < local24.aByteArray71.length) {
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass145Array2[local34] != null) {
					local24.method3082();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass145Array2[local34] != null) {
					local24.method3082();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass145Array2[local34] != null) {
					local24.method3122();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass145Array2[local34] != null) {
					this.aClass145Array2[local34].aBoolean360 = local24.method3122() == 1;
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass145Array2[local34] != null) {
					local24.method3082();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass145Array2[local34] != null) {
					local24.method3122();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass145Array2[local34] != null) {
					local24.method3122();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass145Array2[local34] != null) {
					local24.method3122();
				}
			}
		}
	}

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "(ZI)Lclient!pk;")
	protected Class1_Sub2_Sub15 method962(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub2 local6 = this.aClass64_8.method1471((long) arg0);
		if (local6 != null) {
			return (Class1_Sub2_Sub15) local6;
		}
		@Pc(22) byte[] local22 = this.aClass7_54.method258(arg0);
		if (local22 == null) {
			return null;
		} else {
			@Pc(36) Class1_Sub2_Sub15 local36 = new Class1_Sub2_Sub15(new Class1_Sub18(local22));
			this.aClass64_8.method1466(local36, (long) arg0);
			return local36;
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)Z")
	@Override
	public final boolean method961(@OriginalArg(0) int arg0) {
		@Pc(4) Class1_Sub2_Sub15 local4 = this.method962(arg0);
		return local4 != null && local4.method3217(this.aClass7_55, this);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(BI)Lclient!rn;")
	@Override
	public final Class145 method959(@OriginalArg(1) int arg0) {
		return this.aClass145Array2[arg0];
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIZIIF)[I")
	@Override
	public final int[] method960(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3) {
		return this.method962(arg2).method3216(this.aClass145Array2[arg2].aBoolean360, this.aClass7_55, arg0, (double) arg3, arg1, this, false);
	}
}
