import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class136 {

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "Lclient!ek;")
	private final Class67 aClass67_20 = new Class67(256);

	@OriginalMember(owner = "client!jj", name = "k", descriptor = "Lclient!ek;")
	private final Class67 aClass67_21 = new Class67(256);

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "Lclient!qn;")
	private final Class211 aClass211_51;

	@OriginalMember(owner = "client!jj", name = "j", descriptor = "Lclient!qn;")
	private final Class211 aClass211_52;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lclient!qn;Lclient!qn;)V")
	public Class136(@OriginalArg(0) Class211 arg0, @OriginalArg(1) Class211 arg1) {
		this.aClass211_51 = arg0;
		this.aClass211_52 = arg1;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(III[I)Lclient!jc;")
	private Class4_Sub15_Sub1 method2726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = (arg1 >>> 12 | arg1 << 4 & 0xFFF9) ^ arg0;
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(35) Class4_Sub15_Sub1 local35 = (Class4_Sub15_Sub1) this.aClass67_21.method1429(local24);
		if (local35 != null) {
			return local35;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(56) Class38 local56 = Static459.method614(this.aClass211_51, arg1, arg0);
			if (local56 == null) {
				return null;
			}
			local35 = local56.method615();
			this.aClass67_21.method1426(local35, local24);
			if (arg2 != null) {
				arg2[0] -= local35.aByteArray34.length;
			}
			return local35;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "([IIB)Lclient!jc;")
	public Class4_Sub15_Sub1 method2727(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass211_52.method4368() == 1) {
			return this.method2729(0, arg0, arg1);
		} else if (this.aClass211_52.method4365(arg1) == 1) {
			return this.method2729(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I[IIB)Lclient!jc;")
	private Class4_Sub15_Sub1 method2729(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = (arg0 >>> 12 | arg0 << 4 & 0xFFF2) ^ arg2;
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class4_Sub15_Sub1 local33 = (Class4_Sub15_Sub1) this.aClass67_21.method1429(local26);
		if (local33 != null) {
			return local33;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(52) Class4_Sub35 local52 = (Class4_Sub35) this.aClass67_20.method1429(local26);
			if (local52 == null) {
				local52 = Static316.method4091(this.aClass211_52, arg0, arg2);
				if (local52 == null) {
					return null;
				}
				this.aClass67_20.method1426(local52, local26);
			}
			local33 = local52.method4095(arg1);
			if (local33 == null) {
				return null;
			} else {
				local52.method6059();
				this.aClass67_21.method1426(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I[II)Lclient!jc;")
	public Class4_Sub15_Sub1 method2731(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass211_51.method4368() == 1) {
			return this.method2726(arg1, 0, arg0);
		} else if (this.aClass211_51.method4365(arg1) == 1) {
			return this.method2726(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}
}
