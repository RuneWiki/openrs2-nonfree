import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public final class Class326 {

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "Lclient!sl;")
	private final Class310 aClass310_35 = new Class310(256);

	@OriginalMember(owner = "client!tu", name = "j", descriptor = "Lclient!sl;")
	private final Class310 aClass310_36 = new Class310(256);

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "Lclient!om;")
	private final Class246 aClass246_241;

	@OriginalMember(owner = "client!tu", name = "f", descriptor = "Lclient!om;")
	private final Class246 aClass246_243;

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lclient!om;Lclient!om;)V")
	public Class326(@OriginalArg(0) Class246 arg0, @OriginalArg(1) Class246 arg1) {
		this.aClass246_241 = arg0;
		this.aClass246_243 = arg1;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "([IIB)Lclient!ee;")
	public Class3_Sub20_Sub1 method6920(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass246_243.method5682() == 1) {
			return this.method6921(arg1, 0, arg0);
		} else if (this.aClass246_243.method5673(arg1) == 1) {
			return this.method6921(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(BII[I)Lclient!ee;")
	private Class3_Sub20_Sub1 method6921(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = (arg1 >>> 12 | (arg1 & 0x20000FFF) << 4) ^ arg0;
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class3_Sub20_Sub1 local33 = (Class3_Sub20_Sub1) this.aClass310_36.method6601(local26);
		if (local33 != null) {
			return local33;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(57) Class3_Sub36 local57 = (Class3_Sub36) this.aClass310_35.method6601(local26);
			if (local57 == null) {
				local57 = Static362.method5450(this.aClass246_243, arg1, arg0);
				if (local57 == null) {
					return null;
				}
				this.aClass310_35.method6603(local57, local26);
			}
			local33 = local57.method5442(arg2);
			if (local33 == null) {
				return null;
			} else {
				local57.method7812();
				this.aClass310_36.method6603(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(II[IB)Lclient!ee;")
	private Class3_Sub20_Sub1 method6923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(15) int local15 = arg1 ^ ((arg0 & 0xE0000FFF) << 4 | arg0 >>> 12);
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(30) long local30 = (long) local21;
		@Pc(37) Class3_Sub20_Sub1 local37 = (Class3_Sub20_Sub1) this.aClass310_36.method6601(local30);
		if (local37 != null) {
			return local37;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(55) Class358 local55 = Static607.method7640(this.aClass246_241, arg0, arg1);
			if (local55 == null) {
				return null;
			}
			local37 = local55.method7641();
			this.aClass310_36.method6603(local37, local30);
			if (arg2 != null) {
				arg2[0] -= local37.aByteArray23.length;
			}
			return local37;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I[II)Lclient!ee;")
	public Class3_Sub20_Sub1 method6925(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass246_241.method5682() == 1) {
			return this.method6923(0, arg1, arg0);
		} else if (this.aClass246_241.method5673(arg1) == 1) {
			return this.method6923(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}
}
