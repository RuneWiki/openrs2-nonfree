import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class205 implements Interface1 {

	@OriginalMember(owner = "client!le", name = "d", descriptor = "Lclient!gca;")
	private Class118 aClass118_31 = new Class118(128);

	@OriginalMember(owner = "client!le", name = "q", descriptor = "[I")
	private final int[] anIntArray349 = new int[Static361.aClass106_1.anInt2695];

	@OriginalMember(owner = "client!le", name = "l", descriptor = "[I")
	public final int[] anIntArray348 = new int[Static361.aClass106_1.anInt2695];

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BII)V")
	public void method4255(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray349[arg1] = arg0;
		@Pc(21) Class2_Sub48 local21 = (Class2_Sub48) this.aClass118_31.method2595((long) arg1);
		if (local21 == null) {
			local21 = new Class2_Sub48(4611686018427387905L);
			this.aClass118_31.method2601(local21, (long) arg1);
		} else if (local21.aLong250 != 4611686018427387905L) {
			local21.aLong250 = Static476.method6413() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IBI)V")
	public void method4256(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray348[arg0] = arg1;
		@Pc(22) Class2_Sub48 local22 = (Class2_Sub48) this.aClass118_31.method2595((long) arg0);
		if (local22 == null) {
			local22 = new Class2_Sub48(Static476.method6413() + 500L);
			this.aClass118_31.method2601(local22, (long) arg0);
		} else {
			local22.aLong250 = Static476.method6413() + 500L;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(III)V")
	public void method4258(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class151 local8 = Static89.aClass330_3.method7452(arg1);
		@Pc(11) int local11 = local8.anInt3822;
		@Pc(14) int local14 = local8.anInt3818;
		@Pc(17) int local17 = local8.anInt3824;
		@Pc(24) int local24 = Class76_Sub1.anIntArray138[local17 - local14];
		if (arg0 < 0 || local24 < arg0) {
			arg0 = 0;
		}
		local24 <<= local14;
		this.method4256(local11, arg0 << local14 & local24 | ~local24 & this.anIntArray348[local11]);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IB)I")
	@Override
	public int method4252(@OriginalArg(0) int arg0) {
		return this.anIntArray348[arg0];
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(III)V")
	public void method4259(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class151 local8 = Static89.aClass330_3.method7452(arg0);
		@Pc(11) int local11 = local8.anInt3822;
		@Pc(14) int local14 = local8.anInt3818;
		@Pc(17) int local17 = local8.anInt3824;
		@Pc(23) int local23 = Class76_Sub1.anIntArray138[local17 - local14];
		if (arg1 < 0 || arg1 > local23) {
			arg1 = 0;
		}
		local23 <<= local14;
		this.method4255(arg1 << local14 & local23 | this.anIntArray349[local11] & ~local23, local11);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BI)I")
	@Override
	public int method4251(@OriginalArg(1) int arg0) {
		@Pc(8) Class151 local8 = Static89.aClass330_3.method7452(arg0);
		@Pc(16) int local16 = local8.anInt3822;
		@Pc(19) int local19 = local8.anInt3818;
		@Pc(22) int local22 = local8.anInt3824;
		@Pc(28) int local28 = Class76_Sub1.anIntArray138[local22 - local19];
		return local28 & this.anIntArray348[local16] >> local19;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IZ)I")
	public int method4261(@OriginalArg(1) boolean arg0) {
		@Pc(8) long local8 = Static476.method6413();
		for (@Pc(27) Class2_Sub48 local27 = arg0 ? (Class2_Sub48) this.aClass118_31.method2596() : (Class2_Sub48) this.aClass118_31.method2597(); local27 != null; local27 = (Class2_Sub48) this.aClass118_31.method2597()) {
			if ((local27.aLong250 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local27.aLong250 & 0x4000000000000000L) != 0L) {
					@Pc(51) int local51 = (int) local27.aLong280;
					this.anIntArray348[local51] = this.anIntArray349[local51];
					local27.method8653();
					return local51;
				}
				local27.method8653();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(Z)V")
	public void method4262() {
		for (@Pc(7) int local7 = 0; local7 < Static361.aClass106_1.anInt2695; local7++) {
			@Pc(14) Class296 local14 = Static361.aClass106_1.method2248(local7);
			if (local14 != null && local14.anInt7687 == 0) {
				this.anIntArray349[local7] = 0;
				this.anIntArray348[local7] = 0;
			}
		}
		this.aClass118_31 = new Class118(128);
	}
}
