import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public class Class49 implements Interface3 {

	@OriginalMember(owner = "client!el", name = "c", descriptor = "Lclient!ok;")
	private Class125 aClass125_19 = new Class125(256);

	@OriginalMember(owner = "client!el", name = "k", descriptor = "Lclient!pk;")
	private Class132 aClass132_29;

	@OriginalMember(owner = "client!el", name = "m", descriptor = "Lclient!pk;")
	private Class132 aClass132_30;

	@OriginalMember(owner = "client!el", name = "e", descriptor = "[Lclient!aa;")
	private Class2[] aClass2Array2;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lclient!pk;Lclient!pk;Lclient!pk;)V")
	protected Class49(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(2) Class132 arg2) {
		this.aClass132_29 = arg2;
		this.aClass132_30 = arg1;
		@Pc(24) Class8_Sub2 local24 = new Class8_Sub2(arg0.method3194(0, 0));
		@Pc(28) int local28 = local24.method2375();
		this.aClass2Array2 = new Class2[local28];
		@Pc(34) int local34;
		for (local34 = 0; local34 < local28; local34++) {
			if (local24.method2334() == 1) {
				this.aClass2Array2[local34] = new Class2();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass2Array2[local34] != null) {
				this.aClass2Array2[local34].aBoolean5 = local24.method2334() == 0;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass2Array2[local34] != null) {
				this.aClass2Array2[local34].aBoolean1 = local24.method2334() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass2Array2[local34] != null) {
				this.aClass2Array2[local34].aBoolean3 = local24.method2334() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass2Array2[local34] != null) {
				this.aClass2Array2[local34].aBoolean2 = local24.method2334() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass2Array2[local34] != null) {
				this.aClass2Array2[local34].aByte1 = local24.method2374();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass2Array2[local34] != null) {
				this.aClass2Array2[local34].aByte4 = local24.method2374();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass2Array2[local34] != null) {
				this.aClass2Array2[local34].aByte3 = local24.method2374();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass2Array2[local34] != null) {
				this.aClass2Array2[local34].aByte2 = local24.method2374();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass2Array2[local34] != null) {
				this.aClass2Array2[local34].aShort2 = (short) local24.method2375();
			}
		}
		if (local24.anInt2955 < local24.aByteArray24.length) {
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass2Array2[local34] != null) {
					local24.method2374();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass2Array2[local34] != null) {
					local24.method2374();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass2Array2[local34] != null) {
					local24.method2334();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass2Array2[local34] != null) {
					this.aClass2Array2[local34].aBoolean4 = local24.method2334() == 1;
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass2Array2[local34] != null) {
					local24.method2374();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass2Array2[local34] != null) {
					local24.method2334();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass2Array2[local34] != null) {
					local24.method2334();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass2Array2[local34] != null) {
					local24.method2334();
				}
			}
		}
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(BI)Lclient!be;")
	protected Class8_Sub1_Sub1 method1238(@OriginalArg(1) int arg0) {
		@Pc(6) Class8_Sub1 local6 = this.aClass125_19.method2957((long) arg0);
		if (local6 != null) {
			return (Class8_Sub1_Sub1) local6;
		}
		@Pc(29) byte[] local29 = this.aClass132_30.method3177(arg0);
		if (local29 == null) {
			return null;
		} else {
			@Pc(42) Class8_Sub1_Sub1 local42 = new Class8_Sub1_Sub1(new Class8_Sub2(local29));
			this.aClass125_19.method2956((long) arg0, local42);
			return local42;
		}
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(II)Z")
	@Override
	public final boolean method1237(@OriginalArg(0) int arg0) {
		@Pc(4) Class8_Sub1_Sub1 local4 = this.method1238(arg0);
		return local4 != null && local4.method359(this.aClass132_29, this);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(II)Lclient!aa;")
	@Override
	public final Class2 method1235(@OriginalArg(0) int arg0) {
		return this.aClass2Array2[arg0];
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIZIIF)[I")
	@Override
	public final int[] method1236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) float arg3) {
		return this.method1238(arg1).method360((double) arg3, arg2, this.aClass132_29, arg0, this, false, this.aClass2Array2[arg1].aBoolean4);
	}
}
