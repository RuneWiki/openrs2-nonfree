import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public class Class91 implements Interface2 {

	@OriginalMember(owner = "client!k", name = "i", descriptor = "Lclient!df;")
	private Class33 aClass33_8 = new Class33(256);

	@OriginalMember(owner = "client!k", name = "c", descriptor = "Lclient!rn;")
	private Class155 aClass155_67;

	@OriginalMember(owner = "client!k", name = "l", descriptor = "Lclient!rn;")
	private Class155 aClass155_68;

	@OriginalMember(owner = "client!k", name = "e", descriptor = "[Lclient!ek;")
	private Class46[] aClass46Array2;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lclient!rn;Lclient!rn;Lclient!rn;)V")
	protected Class91(@OriginalArg(0) Class155 arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) Class155 arg2) {
		this.aClass155_67 = arg1;
		this.aClass155_68 = arg2;
		@Pc(24) Class3_Sub26 local24 = new Class3_Sub26(arg0.method4121(0, 0));
		@Pc(28) int local28 = local24.method3948();
		this.aClass46Array2 = new Class46[local28];
		@Pc(34) int local34;
		for (local34 = 0; local34 < local28; local34++) {
			if (local24.method3915() == 1) {
				this.aClass46Array2[local34] = new Class46();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass46Array2[local34] != null) {
				this.aClass46Array2[local34].aBoolean96 = local24.method3915() == 0;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass46Array2[local34] != null) {
				this.aClass46Array2[local34].aBoolean100 = local24.method3915() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass46Array2[local34] != null) {
				this.aClass46Array2[local34].aBoolean98 = local24.method3915() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass46Array2[local34] != null) {
				this.aClass46Array2[local34].aBoolean99 = local24.method3915() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass46Array2[local34] != null) {
				this.aClass46Array2[local34].aByte4 = local24.method3920();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass46Array2[local34] != null) {
				this.aClass46Array2[local34].aByte3 = local24.method3920();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass46Array2[local34] != null) {
				this.aClass46Array2[local34].aByte6 = local24.method3920();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass46Array2[local34] != null) {
				this.aClass46Array2[local34].aByte5 = local24.method3920();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass46Array2[local34] != null) {
				this.aClass46Array2[local34].aShort11 = (short) local24.method3948();
			}
		}
		if (local24.anInt4615 < local24.aByteArray64.length) {
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass46Array2[local34] != null) {
					local24.method3920();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass46Array2[local34] != null) {
					local24.method3920();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass46Array2[local34] != null) {
					local24.method3915();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass46Array2[local34] != null) {
					this.aClass46Array2[local34].aBoolean97 = local24.method3915() == 1;
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass46Array2[local34] != null) {
					local24.method3920();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass46Array2[local34] != null) {
					local24.method3915();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass46Array2[local34] != null) {
					local24.method3915();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass46Array2[local34] != null) {
					local24.method3915();
				}
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(BI)Z")
	@Override
	public final boolean method2890(@OriginalArg(1) int arg0) {
		@Pc(16) Class3_Sub4_Sub17 local16 = this.method2895(arg0);
		return local16 != null && local16.method2948(this, this.aClass155_68);
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(BI)Lclient!ek;")
	@Override
	public final Class46 method2892(@OriginalArg(1) int arg0) {
		return this.aClass46Array2[arg0];
	}

	@OriginalMember(owner = "client!k", name = "g", descriptor = "(II)Lclient!n;")
	protected Class3_Sub4_Sub17 method2895(@OriginalArg(0) int arg0) {
		@Pc(6) Class3_Sub4 local6 = this.aClass33_8.method828((long) arg0);
		if (local6 != null) {
			return (Class3_Sub4_Sub17) local6;
		}
		@Pc(22) byte[] local22 = this.aClass155_67.method4137(arg0);
		if (local22 == null) {
			return null;
		} else {
			@Pc(42) Class3_Sub4_Sub17 local42 = new Class3_Sub4_Sub17(new Class3_Sub26(local22));
			this.aClass33_8.method827(local42, (long) arg0);
			return local42;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(FZIIBI)[I")
	@Override
	public final int[] method2891(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		return this.method2895(arg2).method2946(this, this.aClass155_68, false, arg3, (double) arg0, this.aClass46Array2[arg2].aBoolean97, arg1);
	}
}
