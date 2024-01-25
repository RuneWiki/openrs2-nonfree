import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ria")
public final class Class316 {

	@OriginalMember(owner = "client!ria", name = "c", descriptor = "Lclient!si;")
	private final Class335 aClass335_35 = new Class335(256);

	@OriginalMember(owner = "client!ria", name = "j", descriptor = "Lclient!si;")
	private final Class335 aClass335_36 = new Class335(256);

	@OriginalMember(owner = "client!ria", name = "e", descriptor = "Lclient!gga;")
	private final Class124 aClass124_107;

	@OriginalMember(owner = "client!ria", name = "b", descriptor = "Lclient!gga;")
	private final Class124 aClass124_106;

	@OriginalMember(owner = "client!ria", name = "<init>", descriptor = "(Lclient!gga;Lclient!gga;)V")
	public Class316(@OriginalArg(0) Class124 arg0, @OriginalArg(1) Class124 arg1) {
		this.aClass124_107 = arg1;
		this.aClass124_106 = arg0;
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(III[I)Lclient!ud;")
	private Class2_Sub44_Sub1 method8009(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = (arg0 << 4 & 0xFFF4 | arg0 >>> 12) ^ arg1;
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(35) Class2_Sub44_Sub1 local35 = (Class2_Sub44_Sub1) this.aClass335_36.method8357(local24);
		if (local35 != null) {
			return local35;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(53) Class116 local53 = Static678.method3543(this.aClass124_106, arg0, arg1);
			if (local53 == null) {
				return null;
			}
			local35 = local53.method3542();
			this.aClass335_36.method8356(local35, local24);
			if (arg2 != null) {
				arg2[0] -= local35.aByteArray92.length;
			}
			return local35;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "([III)Lclient!ud;")
	public Class2_Sub44_Sub1 method8011(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass124_107.method3633() == 1) {
			return this.method8012(arg1, arg0, 0);
		} else if (this.aClass124_107.method3629(arg1) == 1) {
			return this.method8012(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(BI[II)Lclient!ud;")
	private Class2_Sub44_Sub1 method8012(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (arg2 >>> 12 | (arg2 & 0x40000FFF) << 4) ^ arg0;
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class2_Sub44_Sub1 local33 = (Class2_Sub44_Sub1) this.aClass335_36.method8357(local26);
		if (local33 != null) {
			return local33;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(55) Class2_Sub46 local55 = (Class2_Sub46) this.aClass335_35.method8357(local26);
			if (local55 == null) {
				local55 = Static529.method8216(this.aClass124_107, arg2, arg0);
				if (local55 == null) {
					return null;
				}
				this.aClass335_35.method8356(local55, local26);
			}
			local33 = local55.method8218(arg1);
			if (local33 == null) {
				return null;
			} else {
				local55.method9825();
				this.aClass335_36.method8356(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(II[I)Lclient!ud;")
	public Class2_Sub44_Sub1 method8014(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass124_106.method3633() == 1) {
			return this.method8009(0, arg0, arg1);
		} else if (this.aClass124_106.method3629(arg0) == 1) {
			return this.method8009(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}
}
