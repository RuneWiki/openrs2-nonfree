import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class61 {

	@OriginalMember(owner = "client!of", name = "j", descriptor = "Lclient!md;")
	private final Class54 aClass54_8 = new Class54(256);

	@OriginalMember(owner = "client!of", name = "t", descriptor = "Lclient!md;")
	private final Class54 aClass54_9 = new Class54(256);

	@OriginalMember(owner = "client!of", name = "h", descriptor = "Lclient!jg;")
	private final Class44 aClass44_22;

	@OriginalMember(owner = "client!of", name = "k", descriptor = "Lclient!jg;")
	private final Class44 aClass44_23;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lclient!jg;Lclient!jg;)V")
	public Class61(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Class44 arg1) {
		this.aClass44_22 = arg1;
		this.aClass44_23 = arg0;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "([IIB)Lclient!wc;")
	public Class3_Sub9_Sub1 method1956(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass44_22.method1625() == 1) {
			return this.method1964(arg0, arg1, 0);
		} else if (this.aClass44_22.method1619(arg1) == 1) {
			return this.method1964(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIB[I)Lclient!wc;")
	private Class3_Sub9_Sub1 method1958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(11) int local11 = (arg0 >>> 12 | arg0 << 4 & 0xFFF1) ^ arg1;
		@Pc(30) int local30 = local11 | arg0 << 16;
		@Pc(33) long local33 = (long) local30;
		@Pc(40) Class3_Sub9_Sub1 local40 = (Class3_Sub9_Sub1) this.aClass54_9.method1602(local33);
		if (local40 != null) {
			return local40;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(58) Class24 local58 = Static183.method846(this.aClass44_23, arg0, arg1);
			if (local58 == null) {
				return null;
			}
			local40 = local58.method849();
			this.aClass54_9.method1603(local33, local40);
			if (arg2 != null) {
				arg2[0] -= local40.aByteArray48.length;
			}
			return local40;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "([IIZ)Lclient!wc;")
	public Class3_Sub9_Sub1 method1962(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass44_23.method1625() == 1) {
			return this.method1958(0, arg1, arg0);
		} else if (this.aClass44_23.method1619(arg1) == 1) {
			return this.method1958(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "([IIII)Lclient!wc;")
	private Class3_Sub9_Sub1 method1964(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) int local11 = ((arg2 & 0x20000FFF) << 4 | arg2 >>> 12) ^ arg1;
		@Pc(21) int local21 = local11 | arg2 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class3_Sub9_Sub1 local33 = (Class3_Sub9_Sub1) this.aClass54_9.method1602(local26);
		if (local33 != null) {
			return local33;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(55) Class3_Sub3 local55 = (Class3_Sub3) this.aClass54_8.method1602(local26);
			if (local55 == null) {
				local55 = Static5.method98(this.aClass44_22, arg2, arg1);
				if (local55 == null) {
					return null;
				}
				this.aClass54_8.method1603(local26, local55);
			}
			local33 = local55.method93(arg0);
			if (local33 == null) {
				return null;
			} else {
				local55.method2900();
				this.aClass54_9.method1603(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}
}
