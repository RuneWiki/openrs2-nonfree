import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class13 {

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "Lclient!vg;")
	private final Class252 aClass252_2 = new Class252(256);

	@OriginalMember(owner = "client!ao", name = "m", descriptor = "Lclient!vg;")
	private final Class252 aClass252_3 = new Class252(256);

	@OriginalMember(owner = "client!ao", name = "i", descriptor = "Lclient!um;")
	private final Class243 aClass243_13;

	@OriginalMember(owner = "client!ao", name = "k", descriptor = "Lclient!um;")
	private final Class243 aClass243_14;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lclient!um;Lclient!um;)V")
	public Class13(@OriginalArg(0) Class243 arg0, @OriginalArg(1) Class243 arg1) {
		this.aClass243_13 = arg1;
		this.aClass243_14 = arg0;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "([IIB)Lclient!rm;")
	public Class5_Sub5_Sub1 method269(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass243_14.method5478() == 1) {
			return this.method272(arg1, arg0, 0);
		} else if (this.aClass243_14.method5472(arg1) == 1) {
			return this.method272(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(II[I)Lclient!rm;")
	public Class5_Sub5_Sub1 method271(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass243_13.method5478() == 1) {
			return this.method274(arg0, arg1, 0);
		} else if (this.aClass243_13.method5472(arg0) == 1) {
			return this.method274(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(II[II)Lclient!rm;")
	private Class5_Sub5_Sub1 method272(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg0 ^ ((arg2 & 0xC0000FFF) << 4 | arg2 >>> 12);
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class5_Sub5_Sub1 local31 = (Class5_Sub5_Sub1) this.aClass252_3.method5659(local24);
		if (local31 != null) {
			return local31;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(52) Class90 local52 = Static465.method1968(this.aClass243_14, arg2, arg0);
			if (local52 == null) {
				return null;
			}
			local31 = local52.method1965();
			this.aClass252_3.method5658(local31, local24);
			if (arg1 != null) {
				arg1[0] -= local31.aByteArray74.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I[IBI)Lclient!rm;")
	private Class5_Sub5_Sub1 method274(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (arg2 >>> 12 | arg2 << 4 & 0xFFFE) ^ arg0;
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class5_Sub5_Sub1 local33 = (Class5_Sub5_Sub1) this.aClass252_3.method5659(local26);
		if (local33 != null) {
			return local33;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(52) Class5_Sub43 local52 = (Class5_Sub43) this.aClass252_2.method5659(local26);
			if (local52 == null) {
				local52 = Static416.method5497(this.aClass243_13, arg2, arg0);
				if (local52 == null) {
					return null;
				}
				this.aClass252_2.method5658(local52, local26);
			}
			local33 = local52.method5492(arg1);
			if (local33 == null) {
				return null;
			} else {
				local52.method6003();
				this.aClass252_3.method5658(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}
}
