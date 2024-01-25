import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class50 {

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "Lclient!cs;")
	private final Class42 aClass42_4 = new Class42(256);

	@OriginalMember(owner = "client!dm", name = "m", descriptor = "Lclient!cs;")
	private final Class42 aClass42_5 = new Class42(256);

	@OriginalMember(owner = "client!dm", name = "f", descriptor = "Lclient!ra;")
	private final Class170 aClass170_15;

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "Lclient!ra;")
	private final Class170 aClass170_14;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lclient!ra;Lclient!ra;)V")
	public Class50(@OriginalArg(0) Class170 arg0, @OriginalArg(1) Class170 arg1) {
		this.aClass170_15 = arg1;
		this.aClass170_14 = arg0;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z[III)Lclient!fp;")
	private Class5_Sub15_Sub1 method1245(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (arg2 >>> 12 | arg2 << 4 & 0xFFF4) ^ arg1;
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class5_Sub15_Sub1 local33 = (Class5_Sub15_Sub1) this.aClass42_5.method1052(local26);
		if (local33 != null) {
			return local33;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(60) Class5_Sub24 local60 = (Class5_Sub24) this.aClass42_4.method1052(local26);
			if (local60 == null) {
				local60 = Static143.method2667(this.aClass170_15, arg2, arg1);
				if (local60 == null) {
					return null;
				}
				this.aClass42_4.method1050(local26, local60);
			}
			local33 = local60.method2672(arg0);
			if (local33 == null) {
				return null;
			} else {
				local60.method5803();
				this.aClass42_5.method1050(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "([III)Lclient!fp;")
	public Class5_Sub15_Sub1 method1247(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass170_14.method4581() == 1) {
			return this.method1251(0, arg1, arg0);
		} else if (this.aClass170_14.method4575(arg1) == 1) {
			return this.method1251(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(II[II)Lclient!fp;")
	private Class5_Sub15_Sub1 method1251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(15) int local15 = arg1 ^ (arg0 >>> 12 | (arg0 & 0x40000FFF) << 4);
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(36) Class5_Sub15_Sub1 local36 = (Class5_Sub15_Sub1) this.aClass42_5.method1052(local24);
		if (local36 != null) {
			return local36;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(54) Class196 local54 = Static368.method5324(this.aClass170_14, arg0, arg1);
			if (local54 == null) {
				return null;
			}
			local36 = local54.method5322();
			this.aClass42_5.method1050(local24, local36);
			if (arg2 != null) {
				arg2[0] -= local36.aByteArray19.length;
			}
			return local36;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IB[I)Lclient!fp;")
	public Class5_Sub15_Sub1 method1253(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass170_15.method4581() == 1) {
			return this.method1245(arg1, arg0, 0);
		} else if (this.aClass170_15.method4575(arg0) == 1) {
			return this.method1245(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}
}
