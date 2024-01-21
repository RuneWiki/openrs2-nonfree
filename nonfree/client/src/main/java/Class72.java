import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class72 {

	@OriginalMember(owner = "client!qf", name = "q", descriptor = "Lclient!l;")
	private final Class45 aClass45_12 = new Class45(256);

	@OriginalMember(owner = "client!qf", name = "t", descriptor = "Lclient!l;")
	private final Class45 aClass45_13 = new Class45(256);

	@OriginalMember(owner = "client!qf", name = "m", descriptor = "Lclient!ag;")
	private final Class4 aClass4_89;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "Lclient!ag;")
	private final Class4 aClass4_88;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!ag;Lclient!ag;)V")
	public Class72(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4 arg1) {
		this.aClass4_89 = arg0;
		this.aClass4_88 = arg1;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(B[II)Lclient!ai;")
	public Class1_Sub4_Sub1 method2503(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass4_89.method2248() == 1) {
			return this.method2505(arg0, 0, arg1);
		} else if (this.aClass4_89.method2260(arg1) == 1) {
			return this.method2505(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I[II)Lclient!ai;")
	public Class1_Sub4_Sub1 method2504(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass4_88.method2248() == 1) {
			return this.method2507(arg0, arg1, 0);
		} else if (this.aClass4_88.method2260(arg1) == 1) {
			return this.method2507(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "([IIBI)Lclient!ai;")
	private Class1_Sub4_Sub1 method2505(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 ^ (arg1 << 4 & 0xFFF4 | arg1 >>> 12);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class1_Sub4_Sub1 local31 = (Class1_Sub4_Sub1) this.aClass45_13.method1988(local24);
		if (local31 != null) {
			return local31;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(57) Class83 local57 = Static194.method2882(this.aClass4_89, arg1, arg2);
			if (local57 == null) {
				return null;
			}
			local31 = local57.method2884();
			this.aClass45_13.method1981(local31, local24);
			if (arg0 != null) {
				arg0[0] -= local31.aByteArray6.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "([IZII)Lclient!ai;")
	private Class1_Sub4_Sub1 method2507(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (arg2 >>> 12 | arg2 << 4 & 0xFFF7) ^ arg1;
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class1_Sub4_Sub1 local33 = (Class1_Sub4_Sub1) this.aClass45_13.method1988(local26);
		if (local33 != null) {
			return local33;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(52) Class1_Sub14 local52 = (Class1_Sub14) this.aClass45_12.method1988(local26);
			if (local52 == null) {
				local52 = Static92.method1927(this.aClass4_88, arg2, arg1);
				if (local52 == null) {
					return null;
				}
				this.aClass45_12.method1981(local52, local26);
			}
			local33 = local52.method1931(arg0);
			if (local33 == null) {
				return null;
			} else {
				local52.method3056();
				this.aClass45_13.method1981(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}
}
