import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!taa")
public final class Class318 implements Interface9 {

	@OriginalMember(owner = "client!taa", name = "o", descriptor = "Lclient!wa;")
	private Class354 aClass354_39 = new Class354(128);

	@OriginalMember(owner = "client!taa", name = "p", descriptor = "[I")
	private final int[] anIntArray520 = new int[Static29.aClass130_2.anInt3710];

	@OriginalMember(owner = "client!taa", name = "f", descriptor = "[I")
	public final int[] anIntArray519 = new int[Static29.aClass130_2.anInt3710];

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(III)V")
	public void method6737(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class167 local8 = Static284.aClass207_1.method4720(arg0);
		@Pc(11) int local11 = local8.anInt4593;
		@Pc(14) int local14 = local8.anInt4587;
		@Pc(17) int local17 = local8.anInt4590;
		@Pc(24) int local24 = Class65_Sub2.anIntArray216[local17 - local14];
		if (arg1 < 0 || arg1 > local24) {
			arg1 = 0;
		}
		local24 <<= local14;
		this.method6748(local11, this.anIntArray520[local11] & ~local24 | arg1 << local14 & local24);
	}

	@OriginalMember(owner = "client!taa", name = "b", descriptor = "(II)I")
	@Override
	public int method6736(@OriginalArg(1) int arg0) {
		@Pc(8) Class167 local8 = Static284.aClass207_1.method4720(arg0);
		@Pc(11) int local11 = local8.anInt4593;
		@Pc(20) int local20 = local8.anInt4587;
		@Pc(23) int local23 = local8.anInt4590;
		@Pc(30) int local30 = Class65_Sub2.anIntArray216[local23 - local20];
		return this.anIntArray519[local11] >> local20 & local30;
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(BII)V")
	public void method6740(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray519[arg0] = arg1;
		@Pc(16) Class3_Sub39 local16 = (Class3_Sub39) this.aClass354_39.method7689((long) arg0);
		if (local16 == null) {
			local16 = new Class3_Sub39(Static158.method2936() + 500L);
			this.aClass354_39.method7691(local16, (long) arg0);
		} else {
			local16.aLong187 = Static158.method2936() + 500L;
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(ZB)I")
	public int method6742(@OriginalArg(0) boolean arg0) {
		@Pc(10) long local10 = Static158.method2936();
		for (@Pc(24) Class3_Sub39 local24 = arg0 ? (Class3_Sub39) this.aClass354_39.method7694() : (Class3_Sub39) this.aClass354_39.method7692(); local24 != null; local24 = (Class3_Sub39) this.aClass354_39.method7692()) {
			if (local10 > (local24.aLong187 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local24.aLong187 & 0x4000000000000000L) != 0L) {
					@Pc(49) int local49 = (int) local24.aLong273;
					this.anIntArray519[local49] = this.anIntArray520[local49];
					local24.method7825();
					return local49;
				}
				local24.method7825();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!taa", name = "b", descriptor = "(III)V")
	public void method6743(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class167 local8 = Static284.aClass207_1.method4720(arg1);
		@Pc(11) int local11 = local8.anInt4593;
		@Pc(14) int local14 = local8.anInt4587;
		@Pc(17) int local17 = local8.anInt4590;
		@Pc(23) int local23 = Class65_Sub2.anIntArray216[local17 - local14];
		if (arg0 < 0 || arg0 > local23) {
			arg0 = 0;
		}
		local23 <<= local14;
		this.method6740(local11, local23 & arg0 << local14 | ~local23 & this.anIntArray519[local11]);
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(II)I")
	@Override
	public int method6735(@OriginalArg(0) int arg0) {
		return this.anIntArray519[arg0];
	}

	@OriginalMember(owner = "client!taa", name = "b", descriptor = "(I)V")
	public void method6744() {
		for (@Pc(7) int local7 = 0; local7 < Static29.aClass130_2.anInt3710; local7++) {
			@Pc(14) Class251 local14 = Static29.aClass130_2.method3316(local7);
			if (local14 != null && local14.anInt6962 == 0) {
				this.anIntArray520[local7] = 0;
				this.anIntArray519[local7] = 0;
			}
		}
		this.aClass354_39 = new Class354(128);
	}

	@OriginalMember(owner = "client!taa", name = "d", descriptor = "(III)V")
	public void method6748(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray520[arg0] = arg1;
		@Pc(21) Class3_Sub39 local21 = (Class3_Sub39) this.aClass354_39.method7689((long) arg0);
		if (local21 == null) {
			local21 = new Class3_Sub39(4611686018427387905L);
			this.aClass354_39.method7691(local21, (long) arg0);
		} else if (local21.aLong187 != 4611686018427387905L) {
			local21.aLong187 = Static158.method2936() + 500L | 0x4000000000000000L;
			return;
		}
	}
}
