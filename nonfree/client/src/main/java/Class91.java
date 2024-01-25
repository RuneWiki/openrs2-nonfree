import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class91 {

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "Lclient!cja;")
	private final Class62 aClass62_13 = new Class62(256);

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "Lclient!cja;")
	private final Class62 aClass62_14 = new Class62(256);

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "Lclient!gj;")
	private final Class143 aClass143_31;

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "Lclient!gj;")
	private final Class143 aClass143_30;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!gj;Lclient!gj;)V")
	public Class91(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class143 arg1) {
		this.aClass143_31 = arg0;
		this.aClass143_30 = arg1;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II[I)Lclient!rea;")
	public Class3_Sub12_Sub1 method2189(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass143_31.method3116() == 1) {
			return this.method2194(0, arg0, arg1);
		} else if (this.aClass143_31.method3123(arg0) == 1) {
			return this.method2194(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZI[I)Lclient!rea;")
	private Class3_Sub12_Sub1 method2191(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = arg0 ^ (arg1 >>> 12 | (arg1 & 0xFFF) << 4);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class3_Sub12_Sub1 local33 = (Class3_Sub12_Sub1) this.aClass62_14.method1682(local26);
		if (local33 != null) {
			return local33;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(52) Class3_Sub51 local52 = (Class3_Sub51) this.aClass62_13.method1682(local26);
			if (local52 == null) {
				local52 = Static570.method7705(this.aClass143_30, arg1, arg0);
				if (local52 == null) {
					return null;
				}
				this.aClass62_13.method1686(local26, local52);
			}
			local33 = local52.method7708(arg2);
			if (local33 == null) {
				return null;
			} else {
				local52.method8770();
				this.aClass62_14.method1686(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[II)Lclient!rea;")
	public Class3_Sub12_Sub1 method2193(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass143_30.method3116() == 1) {
			return this.method2191(arg1, 0, arg0);
		} else if (this.aClass143_30.method3123(arg1) == 1) {
			return this.method2191(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIB[I)Lclient!rea;")
	private Class3_Sub12_Sub1 method2194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(20) int local20 = (arg0 >>> 12 | (arg0 & 0x50000FFF) << 4) ^ arg1;
		@Pc(26) int local26 = local20 | arg0 << 16;
		@Pc(29) long local29 = (long) local26;
		@Pc(36) Class3_Sub12_Sub1 local36 = (Class3_Sub12_Sub1) this.aClass62_14.method1682(local29);
		if (local36 != null) {
			return local36;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(57) Class36 local57 = Static681.method1237(this.aClass143_31, arg0, arg1);
			if (local57 == null) {
				return null;
			}
			local36 = local57.method1235();
			this.aClass62_14.method1686(local29, local36);
			if (arg2 != null) {
				arg2[0] -= local36.aByteArray94.length;
			}
			return local36;
		} else {
			return null;
		}
	}
}
