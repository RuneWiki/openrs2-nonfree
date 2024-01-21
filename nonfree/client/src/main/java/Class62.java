import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class62 {

	@OriginalMember(owner = "client!oe", name = "o", descriptor = "Lclient!md;")
	private final Class51 aClass51_8 = new Class51(256);

	@OriginalMember(owner = "client!oe", name = "q", descriptor = "Lclient!md;")
	private final Class51 aClass51_9 = new Class51(256);

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "Lclient!pe;")
	private final Class13 aClass13_27;

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "Lclient!pe;")
	private final Class13 aClass13_26;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lclient!pe;Lclient!pe;)V")
	public Class62(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class13 arg1) {
		this.aClass13_27 = arg1;
		this.aClass13_26 = arg0;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "([IBI)Lclient!oa;")
	public Class2_Sub16_Sub1 method2737(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass13_27.method519() == 1) {
			return this.method2738(arg0, arg1, 0);
		} else if (this.aClass13_27.method513(arg1) == 1) {
			return this.method2738(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "([IIZI)Lclient!oa;")
	private Class2_Sub16_Sub1 method2738(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(20) int local20 = arg1 ^ ((arg2 & 0xB0000FFF) << 4 | arg2 >>> 12);
		@Pc(26) int local26 = local20 | arg2 << 16;
		@Pc(31) long local31 = (long) local26 ^ 0x100000000L;
		@Pc(38) Class2_Sub16_Sub1 local38 = (Class2_Sub16_Sub1) this.aClass51_9.method2458(local31);
		if (local38 != null) {
			return local38;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(57) Class2_Sub4 local57 = (Class2_Sub4) this.aClass51_8.method2458(local31);
			if (local57 == null) {
				local57 = Static28.method686(this.aClass13_27, arg2, arg1);
				if (local57 == null) {
					return null;
				}
				this.aClass51_8.method2463(local57, local31);
			}
			local38 = local57.method684(arg0);
			if (local38 == null) {
				return null;
			} else {
				local57.method3556();
				this.aClass51_9.method2463(local38, local31);
				return local38;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "([IBI)Lclient!oa;")
	public Class2_Sub16_Sub1 method2740(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass13_26.method519() == 1) {
			return this.method2741(arg1, arg0, 0);
		} else if (this.aClass13_26.method513(arg1) == 1) {
			return this.method2741(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZI[II)Lclient!oa;")
	private Class2_Sub16_Sub1 method2741(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = (arg2 >>> 12 | arg2 << 4 & 0xFFF1) ^ arg0;
		@Pc(17) int local17 = local11 | arg2 << 16;
		@Pc(20) long local20 = (long) local17;
		@Pc(31) Class2_Sub16_Sub1 local31 = (Class2_Sub16_Sub1) this.aClass51_9.method2458(local20);
		if (local31 != null) {
			return local31;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(52) Class23 local52 = Static199.method1101(this.aClass13_26, arg2, arg0);
			if (local52 == null) {
				return null;
			}
			local31 = local52.method1099();
			this.aClass51_9.method2463(local31, local20);
			if (arg1 != null) {
				arg1[0] -= local31.aByteArray38.length;
			}
			return local31;
		} else {
			return null;
		}
	}
}
