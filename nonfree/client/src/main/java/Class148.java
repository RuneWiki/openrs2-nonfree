import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jca")
public final class Class148 {

	@OriginalMember(owner = "client!jca", name = "g", descriptor = "Lclient!pt;")
	private final Class230 aClass230_24 = new Class230(256);

	@OriginalMember(owner = "client!jca", name = "o", descriptor = "Lclient!pt;")
	private final Class230 aClass230_25 = new Class230(256);

	@OriginalMember(owner = "client!jca", name = "n", descriptor = "Lclient!dn;")
	private final Class69 aClass69_44;

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "Lclient!dn;")
	private final Class69 aClass69_43;

	@OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(Lclient!dn;Lclient!dn;)V")
	public Class148(@OriginalArg(0) Class69 arg0, @OriginalArg(1) Class69 arg1) {
		this.aClass69_44 = arg1;
		this.aClass69_43 = arg0;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(II[II)Lclient!mr;")
	private Class1_Sub30_Sub1 method4012(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (arg2 >>> 12 | (arg2 & 0xE0000FFF) << 4) ^ arg0;
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class1_Sub30_Sub1 local33 = (Class1_Sub30_Sub1) this.aClass230_25.method6144(local26);
		if (local33 != null) {
			return local33;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(55) Class1_Sub21 local55 = (Class1_Sub21) this.aClass230_24.method6144(local26);
			if (local55 == null) {
				local55 = Static195.method3720(this.aClass69_44, arg2, arg0);
				if (local55 == null) {
					return null;
				}
				this.aClass230_24.method6139(local26, local55);
			}
			local33 = local55.method3725(arg1);
			if (local33 == null) {
				return null;
			} else {
				local55.method8239();
				this.aClass230_25.method6139(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "(II[II)Lclient!mr;")
	private Class1_Sub30_Sub1 method4013(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(21) int local21 = (arg0 >>> 12 | arg0 << 4 & 0xFFF4) ^ arg2;
		@Pc(27) int local27 = local21 | arg0 << 16;
		@Pc(30) long local30 = (long) local27;
		@Pc(37) Class1_Sub30_Sub1 local37 = (Class1_Sub30_Sub1) this.aClass230_25.method6144(local30);
		if (local37 != null) {
			return local37;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(58) Class233 local58 = Static552.method6179(this.aClass69_43, arg0, arg2);
			if (local58 == null) {
				return null;
			}
			local37 = local58.method6178();
			this.aClass230_25.method6139(local30, local37);
			if (arg1 != null) {
				arg1[0] -= local37.aByteArray77.length;
			}
			return local37;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(BI[I)Lclient!mr;")
	public Class1_Sub30_Sub1 method4014(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass69_43.method1895() == 1) {
			return this.method4013(0, arg1, arg0);
		} else if (this.aClass69_43.method1884(arg0) == 1) {
			return this.method4013(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "([III)Lclient!mr;")
	public Class1_Sub30_Sub1 method4017(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass69_44.method1895() == 1) {
			return this.method4012(arg1, arg0, 0);
		} else if (this.aClass69_44.method1884(arg1) == 1) {
			return this.method4012(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}
}
