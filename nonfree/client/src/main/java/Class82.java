import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class82 {

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "Lclient!nc;")
	private final Class63 aClass63_11 = new Class63(256);

	@OriginalMember(owner = "client!pj", name = "q", descriptor = "Lclient!nc;")
	private final Class63 aClass63_12 = new Class63(256);

	@OriginalMember(owner = "client!pj", name = "o", descriptor = "Lclient!eh;")
	private final Class28 aClass28_147;

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "Lclient!eh;")
	private final Class28 aClass28_146;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lclient!eh;Lclient!eh;)V")
	public Class82(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class28 arg1) {
		this.aClass28_147 = arg0;
		this.aClass28_146 = arg1;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "([IIB)Lclient!cb;")
	public Class2_Sub6_Sub1 method2343(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass28_146.method849() == 1) {
			return this.method2345(0, arg0, arg1);
		} else if (this.aClass28_146.method846(arg1) == 1) {
			return this.method2345(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "([IIB)Lclient!cb;")
	public Class2_Sub6_Sub1 method2344(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass28_147.method849() == 1) {
			return this.method2348(0, arg0, arg1);
		} else if (this.aClass28_147.method846(arg1) == 1) {
			return this.method2348(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IB[II)Lclient!cb;")
	private Class2_Sub6_Sub1 method2345(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = (arg0 >>> 12 | arg0 << 4 & 0xFFFC) ^ arg2;
		@Pc(21) int local21 = local11 | arg0 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class2_Sub6_Sub1 local33 = (Class2_Sub6_Sub1) this.aClass63_12.method2110(local26);
		if (local33 != null) {
			return local33;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(52) Class2_Sub5 local52 = (Class2_Sub5) this.aClass63_11.method2110(local26);
			if (local52 == null) {
				local52 = Static20.method399(this.aClass28_146, arg0, arg2);
				if (local52 == null) {
					return null;
				}
				this.aClass63_11.method2115(local26, local52);
			}
			local33 = local52.method406(arg1);
			if (local33 == null) {
				return null;
			} else {
				local52.method3254();
				this.aClass63_12.method2115(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(II[II)Lclient!cb;")
	private Class2_Sub6_Sub1 method2348(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = arg2 ^ ((arg0 & 0x20000FFF) << 4 | arg0 >>> 12);
		@Pc(17) int local17 = local11 | arg0 << 16;
		@Pc(20) long local20 = (long) local17;
		@Pc(33) Class2_Sub6_Sub1 local33 = (Class2_Sub6_Sub1) this.aClass63_12.method2110(local20);
		if (local33 != null) {
			return local33;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(51) Class90 local51 = Static224.method2701(this.aClass28_147, arg0, arg2);
			if (local51 == null) {
				return null;
			}
			local33 = local51.method2699();
			this.aClass63_12.method2115(local20, local33);
			if (arg1 != null) {
				arg1[0] -= local33.aByteArray5.length;
			}
			return local33;
		} else {
			return null;
		}
	}
}
