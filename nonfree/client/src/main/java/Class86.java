import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class86 {

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "Lclient!gn;")
	private final Class136 aClass136_15 = new Class136(256);

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "Lclient!gn;")
	private final Class136 aClass136_16 = new Class136(256);

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "Lclient!lb;")
	private final Class221 aClass221_34;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "Lclient!lb;")
	private final Class221 aClass221_35;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lclient!lb;Lclient!lb;)V")
	public Class86(@OriginalArg(0) Class221 arg0, @OriginalArg(1) Class221 arg1) {
		this.aClass221_34 = arg1;
		this.aClass221_35 = arg0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II[II)Lclient!mca;")
	private Class3_Sub33_Sub1 method2221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(15) int local15 = ((arg1 & 0x70000FFF) << 4 | arg1 >>> 12) ^ arg0;
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(32) long local32 = (long) local21;
		@Pc(39) Class3_Sub33_Sub1 local39 = (Class3_Sub33_Sub1) this.aClass136_16.method3503(local32);
		if (local39 != null) {
			return local39;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(64) Class292 local64 = Static731.method7197(this.aClass221_35, arg1, arg0);
			if (local64 == null) {
				return null;
			}
			local39 = local64.method7195();
			this.aClass136_16.method3508(local32, local39);
			if (arg2 != null) {
				arg2[0] -= local39.aByteArray53.length;
			}
			return local39;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "([III)Lclient!mca;")
	public Class3_Sub33_Sub1 method2222(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass221_35.method5080() == 1) {
			return this.method2221(arg1, 0, arg0);
		} else if (this.aClass221_35.method5065(arg1) == 1) {
			return this.method2221(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "([IZII)Lclient!mca;")
	private Class3_Sub33_Sub1 method2228(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (arg1 >>> 12 | (arg1 & 0x60000FFF) << 4) ^ arg2;
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class3_Sub33_Sub1 local33 = (Class3_Sub33_Sub1) this.aClass136_16.method3503(local26);
		if (local33 != null) {
			return local33;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(56) Class3_Sub36 local56 = (Class3_Sub36) this.aClass136_15.method3503(local26);
			if (local56 == null) {
				local56 = Static446.method6553(this.aClass221_34, arg1, arg2);
				if (local56 == null) {
					return null;
				}
				this.aClass136_15.method3508(local26, local56);
			}
			local33 = local56.method6550(arg0);
			if (local33 == null) {
				return null;
			} else {
				local56.method9446();
				this.aClass136_16.method3508(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "([IIB)Lclient!mca;")
	public Class3_Sub33_Sub1 method2229(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass221_34.method5080() == 1) {
			return this.method2228(arg0, 0, arg1);
		} else if (this.aClass221_34.method5065(arg1) == 1) {
			return this.method2228(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}
}
