import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class13 {

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "Lclient!eh;")
	private final Class25 aClass25_4 = new Class25(256);

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "Lclient!eh;")
	private final Class25 aClass25_5 = new Class25(256);

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "Lclient!bg;")
	private final Class11 aClass11_22;

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "Lclient!bg;")
	private final Class11 aClass11_23;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lclient!bg;Lclient!bg;)V")
	public Class13(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1) {
		this.aClass11_22 = arg0;
		this.aClass11_23 = arg1;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "([IIII)Lclient!k;")
	private Class2_Sub5_Sub1 method400(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 ^ (arg1 >>> 12 | (arg1 & 0xD0000FFF) << 4);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class2_Sub5_Sub1 local33 = (Class2_Sub5_Sub1) this.aClass25_5.method836(local26);
		if (local33 != null) {
			return local33;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(57) Class2_Sub7 local57 = (Class2_Sub7) this.aClass25_4.method836(local26);
			if (local57 == null) {
				local57 = Static52.method921(this.aClass11_23, arg1, arg2);
				if (local57 == null) {
					return null;
				}
				this.aClass25_4.method838(local26, local57);
			}
			local33 = local57.method918(arg0);
			if (local33 == null) {
				return null;
			} else {
				local57.method3007();
				this.aClass25_5.method838(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "([IBI)Lclient!k;")
	public Class2_Sub5_Sub1 method402(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass11_22.method2070() == 1) {
			return this.method405(arg0, arg1, 0);
		} else if (this.aClass11_22.method2069(arg1) == 1) {
			return this.method405(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II[I)Lclient!k;")
	public Class2_Sub5_Sub1 method404(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass11_23.method2070() == 1) {
			return this.method400(arg1, 0, arg0);
		} else if (this.aClass11_23.method2069(arg0) == 1) {
			return this.method400(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "([IIII)Lclient!k;")
	private Class2_Sub5_Sub1 method405(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) int local11 = (arg2 >>> 12 | (arg2 & 0xB0000FFF) << 4) ^ arg1;
		@Pc(21) int local21 = local11 | arg2 << 16;
		@Pc(29) long local29 = (long) local21;
		@Pc(36) Class2_Sub5_Sub1 local36 = (Class2_Sub5_Sub1) this.aClass25_5.method836(local29);
		if (local36 != null) {
			return local36;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(57) Class53 local57 = Static190.method1807(this.aClass11_22, arg2, arg1);
			if (local57 == null) {
				return null;
			}
			local36 = local57.method1808();
			this.aClass25_5.method838(local29, local36);
			if (arg0 != null) {
				arg0[0] -= local36.aByteArray25.length;
			}
			return local36;
		} else {
			return null;
		}
	}
}
