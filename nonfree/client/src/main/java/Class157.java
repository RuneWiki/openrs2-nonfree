import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class157 implements Interface6 {

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "Lclient!wr;")
	private Class380 aClass380_20 = new Class380(128);

	@OriginalMember(owner = "client!jk", name = "i", descriptor = "[I")
	public final int[] anIntArray257 = new int[Static259.aClass156_2.anInt5796];

	@OriginalMember(owner = "client!jk", name = "m", descriptor = "[I")
	private final int[] anIntArray258 = new int[Static259.aClass156_2.anInt5796];

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(III)V")
	public void method4853(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray258[arg1] = arg0;
		@Pc(24) Class6_Sub51 local24 = (Class6_Sub51) this.aClass380_20.method8747((long) arg1);
		if (local24 == null) {
			local24 = new Class6_Sub51(4611686018427387905L);
			this.aClass380_20.method8753(local24, (long) arg1);
		} else if (local24.aLong271 != 4611686018427387905L) {
			local24.aLong271 = Static582.method8056() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)I")
	@Override
	public int method4850(@OriginalArg(0) int arg0) {
		return this.anIntArray257[arg0];
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(II)I")
	@Override
	public int method4851(@OriginalArg(0) int arg0) {
		@Pc(8) Class370 local8 = Static39.aClass214_1.method5870(arg0);
		@Pc(11) int local11 = local8.anInt10488;
		@Pc(14) int local14 = local8.anInt10489;
		@Pc(17) int local17 = local8.anInt10491;
		@Pc(29) int local29 = Class6_Sub5_Sub1.anIntArray504[local17 - local14];
		return this.anIntArray257[local11] >> local14 & local29;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V")
	public void method4855() {
		for (@Pc(7) int local7 = 0; local7 < Static259.aClass156_2.anInt5796; local7++) {
			@Pc(22) Class181 local22 = Static259.aClass156_2.method4847(local7);
			if (local22 != null && local22.anInt6260 == 0) {
				this.anIntArray258[local7] = 0;
				this.anIntArray257[local7] = 0;
			}
		}
		this.aClass380_20 = new Class380(128);
	}

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "(III)V")
	public void method4856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class370 local8 = Static39.aClass214_1.method5870(arg1);
		@Pc(11) int local11 = local8.anInt10488;
		@Pc(14) int local14 = local8.anInt10489;
		@Pc(17) int local17 = local8.anInt10491;
		@Pc(23) int local23 = Class6_Sub5_Sub1.anIntArray504[local17 - local14];
		if (arg0 < 0 || arg0 > local23) {
			arg0 = 0;
		}
		local23 <<= local14;
		this.method4858(local11, local23 & arg0 << local14 | ~local23 & this.anIntArray257[local11]);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IZ)I")
	public int method4857(@OriginalArg(1) boolean arg0) {
		@Pc(8) long local8 = Static582.method8056();
		for (@Pc(22) Class6_Sub51 local22 = arg0 ? (Class6_Sub51) this.aClass380_20.method8755() : (Class6_Sub51) this.aClass380_20.method8752(); local22 != null; local22 = (Class6_Sub51) this.aClass380_20.method8752()) {
			if ((local22.aLong271 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local22.aLong271 & 0x4000000000000000L) != 0L) {
					@Pc(59) int local59 = (int) local22.aLong278;
					this.anIntArray257[local59] = this.anIntArray258[local59];
					local22.method8792();
					return local59;
				}
				local22.method8792();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "(III)V")
	public void method4858(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray257[arg0] = arg1;
		@Pc(16) Class6_Sub51 local16 = (Class6_Sub51) this.aClass380_20.method8747((long) arg0);
		if (local16 == null) {
			local16 = new Class6_Sub51(Static582.method8056() + 500L);
			this.aClass380_20.method8753(local16, (long) arg0);
		} else {
			local16.aLong271 = Static582.method8056() + 500L;
		}
	}

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "(III)V")
	public void method4859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class370 local8 = Static39.aClass214_1.method5870(arg0);
		@Pc(11) int local11 = local8.anInt10488;
		@Pc(18) int local18 = local8.anInt10489;
		@Pc(21) int local21 = local8.anInt10491;
		@Pc(28) int local28 = Class6_Sub5_Sub1.anIntArray504[local21 - local18];
		if (arg1 < 0 || local28 < arg1) {
			arg1 = 0;
		}
		local28 <<= local18;
		this.method4853(arg1 << local18 & local28 | this.anIntArray258[local11] & ~local28, local11);
	}
}
