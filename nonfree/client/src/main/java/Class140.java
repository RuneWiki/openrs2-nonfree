import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class140 {

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "Lclient!an;")
	private final Class11 aClass11_26 = new Class11(256);

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "Lclient!an;")
	private final Class11 aClass11_27 = new Class11(256);

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "Lclient!bu;")
	private final Class32 aClass32_50;

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "Lclient!bu;")
	private final Class32 aClass32_49;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!bu;Lclient!bu;)V")
	public Class140(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class32 arg1) {
		this.aClass32_50 = arg0;
		this.aClass32_49 = arg1;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II[I)Lclient!bq;")
	public Class3_Sub6_Sub1 method3349(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass32_49.method809() == 1) {
			return this.method3350(arg1, arg0, 0);
		} else if (this.aClass32_49.method790(arg0) == 1) {
			return this.method3350(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "([IIIB)Lclient!bq;")
	private Class3_Sub6_Sub1 method3350(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = arg1 ^ (arg2 >>> 12 | (arg2 & 0xA0000FFF) << 4);
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class3_Sub6_Sub1 local33 = (Class3_Sub6_Sub1) this.aClass11_27.method324(local26);
		if (local33 != null) {
			return local33;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(55) Class3_Sub43 local55 = (Class3_Sub43) this.aClass11_26.method324(local26);
			if (local55 == null) {
				local55 = Static427.method5463(this.aClass32_49, arg2, arg1);
				if (local55 == null) {
					return null;
				}
				this.aClass11_26.method319(local55, local26);
			}
			local33 = local55.method5461(arg0);
			if (local33 == null) {
				return null;
			} else {
				local55.method5977();
				this.aClass11_27.method319(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(III[I)Lclient!bq;")
	private Class3_Sub6_Sub1 method3351(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = ((arg0 & 0x30000FFF) << 4 | arg0 >>> 12) ^ arg1;
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class3_Sub6_Sub1 local31 = (Class3_Sub6_Sub1) this.aClass11_27.method324(local24);
		if (local31 != null) {
			return local31;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(57) Class175 local57 = Static460.method4047(this.aClass32_50, arg0, arg1);
			if (local57 == null) {
				return null;
			}
			local31 = local57.method4046();
			this.aClass11_27.method319(local31, local24);
			if (arg2 != null) {
				arg2[0] -= local31.aByteArray16.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "([III)Lclient!bq;")
	public Class3_Sub6_Sub1 method3352(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass32_50.method809() == 1) {
			return this.method3351(0, arg1, arg0);
		} else if (this.aClass32_50.method790(arg1) == 1) {
			return this.method3351(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}
}
