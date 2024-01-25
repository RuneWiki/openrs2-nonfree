import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class286 {

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "Lclient!sd;")
	private final Class267 aClass267_40 = new Class267(256);

	@OriginalMember(owner = "client!ts", name = "m", descriptor = "Lclient!sd;")
	private final Class267 aClass267_41 = new Class267(256);

	@OriginalMember(owner = "client!ts", name = "j", descriptor = "Lclient!kea;")
	private final Class161 aClass161_103;

	@OriginalMember(owner = "client!ts", name = "i", descriptor = "Lclient!kea;")
	private final Class161 aClass161_102;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lclient!kea;Lclient!kea;)V")
	public Class286(@OriginalArg(0) Class161 arg0, @OriginalArg(1) Class161 arg1) {
		this.aClass161_103 = arg1;
		this.aClass161_102 = arg0;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "([III)Lclient!te;")
	public Class3_Sub42_Sub1 method7052(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass161_103.method4239() == 1) {
			return this.method7057(0, arg0, arg1);
		} else if (this.aClass161_103.method4266(arg1) == 1) {
			return this.method7057(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "([IIBI)Lclient!te;")
	private Class3_Sub42_Sub1 method7054(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(23) int local23 = (arg1 << 4 & 0xFFF2 | arg1 >>> 12) ^ arg2;
		@Pc(29) int local29 = local23 | arg1 << 16;
		@Pc(32) long local32 = (long) local29;
		@Pc(39) Class3_Sub42_Sub1 local39 = (Class3_Sub42_Sub1) this.aClass267_41.method6644(local32);
		if (local39 != null) {
			return local39;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(57) Class31 local57 = Static552.method880(this.aClass161_102, arg1, arg2);
			if (local57 == null) {
				return null;
			}
			local39 = local57.method879();
			this.aClass267_41.method6640(local39, local32);
			if (arg0 != null) {
				arg0[0] -= local39.aByteArray97.length;
			}
			return local39;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I[II)Lclient!te;")
	public Class3_Sub42_Sub1 method7056(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass161_102.method4239() == 1) {
			return this.method7054(arg1, 0, arg0);
		} else if (this.aClass161_102.method4266(arg0) == 1) {
			return this.method7054(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I[IIB)Lclient!te;")
	private Class3_Sub42_Sub1 method7057(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = (arg0 << 4 & 0xFFF9 | arg0 >>> 12) ^ arg2;
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class3_Sub42_Sub1 local33 = (Class3_Sub42_Sub1) this.aClass267_41.method6644(local26);
		if (local33 != null) {
			return local33;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(55) Class3_Sub44 local55 = (Class3_Sub44) this.aClass267_40.method6644(local26);
			if (local55 == null) {
				local55 = Static433.method6590(this.aClass161_103, arg0, arg2);
				if (local55 == null) {
					return null;
				}
				this.aClass267_40.method6640(local55, local26);
			}
			local33 = local55.method6589(arg1);
			if (local33 == null) {
				return null;
			} else {
				local55.method7820();
				this.aClass267_41.method6640(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}
}
