import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class335 implements Interface1 {

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "Lclient!jw;")
	private Class183 aClass183_38 = new Class183(128);

	@OriginalMember(owner = "client!ui", name = "n", descriptor = "[I")
	private final int[] anIntArray687 = new int[Static581.aClass270_1.anInt7161];

	@OriginalMember(owner = "client!ui", name = "l", descriptor = "[I")
	public final int[] anIntArray686 = new int[Static581.aClass270_1.anInt7161];

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IZ)I")
	public int method7425(@OriginalArg(1) boolean arg0) {
		@Pc(8) long local8 = Static184.method3422();
		for (@Pc(30) Class4_Sub47 local30 = arg0 ? (Class4_Sub47) this.aClass183_38.method4286() : (Class4_Sub47) this.aClass183_38.method4283(); local30 != null; local30 = (Class4_Sub47) this.aClass183_38.method4283()) {
			if ((local30.aLong267 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local30.aLong267 & 0x4000000000000000L) != 0L) {
					@Pc(55) int local55 = (int) local30.aLong307;
					this.anIntArray686[local55] = this.anIntArray687[local55];
					local30.method8013();
					return local55;
				}
				local30.method8013();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
	public void method7426() {
		for (@Pc(11) int local11 = 0; local11 < Static581.aClass270_1.anInt7161; local11++) {
			@Pc(18) Class136 local18 = Static581.aClass270_1.method5937(local11);
			if (local18 != null && local18.anInt3921 == 0) {
				this.anIntArray687[local11] = 0;
				this.anIntArray686[local11] = 0;
			}
		}
		this.aClass183_38 = new Class183(128);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)V")
	public void method7429(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray687[arg0] = arg1;
		@Pc(22) Class4_Sub47 local22 = (Class4_Sub47) this.aClass183_38.method4289((long) arg0);
		if (local22 == null) {
			local22 = new Class4_Sub47(4611686018427387905L);
			this.aClass183_38.method4282((long) arg0, local22);
		} else if (local22.aLong267 != 4611686018427387905L) {
			local22.aLong267 = Static184.method3422() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZI)I")
	@Override
	public int method7424(@OriginalArg(1) int arg0) {
		return this.anIntArray686[arg0];
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIZ)V")
	public void method7430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray686[arg0] = arg1;
		@Pc(20) Class4_Sub47 local20 = (Class4_Sub47) this.aClass183_38.method4289((long) arg0);
		if (local20 == null) {
			local20 = new Class4_Sub47(Static184.method3422() + 500L);
			this.aClass183_38.method4282((long) arg0, local20);
		} else {
			local20.aLong267 = Static184.method3422() + 500L;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)I")
	@Override
	public int method7423(@OriginalArg(0) int arg0) {
		@Pc(8) Class356 local8 = Static538.aClass101_1.method2819(arg0);
		@Pc(11) int local11 = local8.anInt9678;
		@Pc(14) int local14 = local8.anInt9680;
		@Pc(17) int local17 = local8.anInt9677;
		@Pc(32) int local32 = Class32.anIntArray124[local17 - local14];
		return this.anIntArray686[local11] >> local14 & local32;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IBI)V")
	public void method7431(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class356 local12 = Static538.aClass101_1.method2819(arg0);
		@Pc(15) int local15 = local12.anInt9678;
		@Pc(18) int local18 = local12.anInt9680;
		@Pc(21) int local21 = local12.anInt9677;
		@Pc(28) int local28 = Class32.anIntArray124[local21 - local18];
		if (arg1 < 0 || arg1 > local28) {
			arg1 = 0;
		}
		local28 <<= local18;
		this.method7429(local15, this.anIntArray687[local15] & ~local28 | arg1 << local18 & local28);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(BII)V")
	public void method7432(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class356 local8 = Static538.aClass101_1.method2819(arg1);
		@Pc(11) int local11 = local8.anInt9678;
		@Pc(14) int local14 = local8.anInt9680;
		@Pc(17) int local17 = local8.anInt9677;
		@Pc(28) int local28 = Class32.anIntArray124[local17 - local14];
		if (arg0 < 0 || local28 < arg0) {
			arg0 = 0;
		}
		local28 <<= local14;
		this.method7430(local11, ~local28 & this.anIntArray686[local11] | arg0 << local14 & local28);
	}
}
