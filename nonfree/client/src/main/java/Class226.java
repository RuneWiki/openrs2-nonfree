import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class226 implements Interface11 {

	@OriginalMember(owner = "client!ts", name = "e", descriptor = "I")
	public static int anInt6377 = -1;

	@OriginalMember(owner = "client!ts", name = "f", descriptor = "I")
	public static int anInt6378 = 0;

	@OriginalMember(owner = "client!ts", name = "p", descriptor = "[I")
	public static final int[] anIntArray432 = new int[4096];

	@OriginalMember(owner = "client!ts", name = "h", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_231 = new Class145(24, -1);

	@OriginalMember(owner = "client!ts", name = "r", descriptor = "Lclient!dn;")
	public static Class50 aClass50_4 = null;

	@OriginalMember(owner = "client!ts", name = "s", descriptor = "Z")
	public static boolean aBoolean431 = true;

	@OriginalMember(owner = "client!ts", name = "q", descriptor = "I")
	public static int anInt6386 = 0;

	@OriginalMember(owner = "client!ts", name = "d", descriptor = "Lclient!ad;")
	private Class4 aClass4_132 = new Class4(128);

	@OriginalMember(owner = "client!ts", name = "j", descriptor = "[I")
	private final int[] anIntArray431 = new int[Static52.aClass199_1.anInt5584];

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "[I")
	public final int[] anIntArray430 = new int[Static52.aClass199_1.anInt5584];

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(III)V", line = 8)
	public void method5780(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class134 local8 = Static299.aClass128_1.method3395(arg0);
		@Pc(11) int local11 = local8.anInt3550;
		@Pc(14) int local14 = local8.anInt3544;
		@Pc(17) int local17 = local8.anInt3545;
		@Pc(24) int local24 = Class2_Sub3_Sub28.anIntArray368[local17 - local14];
		if (arg1 < 0 || local24 < arg1) {
			arg1 = 0;
		}
		local24 <<= local14;
		this.method5781(local11, this.anIntArray430[local11] & ~local24 | local24 & arg1 << local14);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZII)V", line = 43)
	public void method5781(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray430[arg0] = arg1;
		@Pc(16) Class2_Sub35 local16 = (Class2_Sub35) this.aClass4_132.method90((long) arg0);
		if (local16 == null) {
			local16 = new Class2_Sub35(Static190.method3686() + 500L);
			this.aClass4_132.method87(local16, (long) arg0);
		} else {
			local16.aLong183 = Static190.method3686() + 500L;
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)V", line = 67)
	public void method5782() {
		for (@Pc(3) int local3 = 0; local3 < Static52.aClass199_1.anInt5584; local3++) {
			@Pc(10) Class171 local10 = Static52.aClass199_1.method5115(local3);
			if (local10 != null && local10.anInt4691 == 0) {
				this.anIntArray431[local3] = 0;
				this.anIntArray430[local3] = 0;
			}
		}
		this.aClass4_132 = new Class4(128);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(BI)I", line = 106)
	@Override
	public int method5779(@OriginalArg(1) int arg0) {
		@Pc(8) Class134 local8 = Static299.aClass128_1.method3395(arg0);
		@Pc(11) int local11 = local8.anInt3550;
		@Pc(20) int local20 = local8.anInt3544;
		@Pc(23) int local23 = local8.anInt3545;
		@Pc(30) int local30 = Class2_Sub3_Sub28.anIntArray368[local23 - local20];
		return this.anIntArray430[local11] >> local20 & local30;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IZ)I", line = 128)
	public int method5784(@OriginalArg(1) boolean arg0) {
		@Pc(13) long local13 = Static190.method3686();
		for (@Pc(27) Class2_Sub35 local27 = arg0 ? (Class2_Sub35) this.aClass4_132.method80() : (Class2_Sub35) this.aClass4_132.method79(); local27 != null; local27 = (Class2_Sub35) this.aClass4_132.method79()) {
			if (local13 > (local27.aLong183 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local27.aLong183 & 0x4000000000000000L) != 0L) {
					@Pc(54) int local54 = (int) local27.aLong232;
					this.anIntArray430[local54] = this.anIntArray431[local54];
					local27.method6469();
					return local54;
				}
				local27.method6469();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)I", line = 185)
	@Override
	public int method5778(@OriginalArg(1) int arg0) {
		return this.anIntArray430[arg0];
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IBI)V", line = 202)
	public void method5786(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray431[arg1] = arg0;
		@Pc(24) Class2_Sub35 local24 = (Class2_Sub35) this.aClass4_132.method90((long) arg1);
		if (local24 == null) {
			local24 = new Class2_Sub35(4611686018427387905L);
			this.aClass4_132.method87(local24, (long) arg1);
		} else if (local24.aLong183 != 4611686018427387905L) {
			local24.aLong183 = Static190.method3686() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(III)V", line = 250)
	public void method5787(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class134 local8 = Static299.aClass128_1.method3395(arg0);
		@Pc(11) int local11 = local8.anInt3550;
		@Pc(14) int local14 = local8.anInt3544;
		@Pc(17) int local17 = local8.anInt3545;
		@Pc(28) int local28 = Class2_Sub3_Sub28.anIntArray368[local17 - local14];
		if (arg1 < 0 || arg1 > local28) {
			arg1 = 0;
		}
		local28 <<= local14;
		this.method5786(this.anIntArray431[local11] & ~local28 | arg1 << local14 & local28, local11);
	}
}
