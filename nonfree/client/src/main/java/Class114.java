import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public final class Class114 implements Interface12 {

	@OriginalMember(owner = "client!it", name = "i", descriptor = "Lclient!ib;")
	private Class102 aClass102_16 = new Class102(128);

	@OriginalMember(owner = "client!it", name = "h", descriptor = "[I")
	private final int[] anIntArray221 = new int[Static183.aClass223_1.anInt6400];

	@OriginalMember(owner = "client!it", name = "f", descriptor = "[I")
	public final int[] anIntArray220 = new int[Static183.aClass223_1.anInt6400];

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(III)V")
	public void method2828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class126 local10 = Static26.aClass26_1.method647(arg1);
		@Pc(13) int local13 = local10.anInt3914;
		@Pc(16) int local16 = local10.anInt3919;
		@Pc(19) int local19 = local10.anInt3915;
		@Pc(26) int local26 = Class4_Sub1_Sub3.anIntArray17[local19 - local16];
		if (arg0 < 0 || local26 < arg0) {
			arg0 = 0;
		}
		local26 <<= local16;
		this.method2830(local13, local26 & arg0 << local16 | ~local26 & this.anIntArray221[local13]);
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(I)V")
	public void method2829() {
		for (@Pc(7) int local7 = 0; local7 < Static183.aClass223_1.anInt6400; local7++) {
			@Pc(14) Class111 local14 = Static183.aClass223_1.method5004(local7);
			if (local14 != null && local14.anInt3365 == 0) {
				this.anIntArray221[local7] = 0;
				this.anIntArray220[local7] = 0;
			}
		}
		this.aClass102_16 = new Class102(128);
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(III)V")
	public void method2830(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray221[arg0] = arg1;
		@Pc(24) Class4_Sub29 local24 = (Class4_Sub29) this.aClass102_16.method2700((long) arg0);
		if (local24 == null) {
			local24 = new Class4_Sub29(4611686018427387905L);
			this.aClass102_16.method2703((long) arg0, local24);
		} else if (local24.aLong153 != 4611686018427387905L) {
			local24.aLong153 = Static282.method3962() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!it", name = "c", descriptor = "(III)V")
	public void method2831(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray220[arg1] = arg0;
		@Pc(23) Class4_Sub29 local23 = (Class4_Sub29) this.aClass102_16.method2700((long) arg1);
		if (local23 == null) {
			local23 = new Class4_Sub29(Static282.method3962() + 500L);
			this.aClass102_16.method2703((long) arg1, local23);
		} else {
			local23.aLong153 = Static282.method3962() + 500L;
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(BI)I")
	@Override
	public int method2825(@OriginalArg(1) int arg0) {
		@Pc(15) Class126 local15 = Static26.aClass26_1.method647(arg0);
		@Pc(18) int local18 = local15.anInt3914;
		@Pc(21) int local21 = local15.anInt3919;
		@Pc(24) int local24 = local15.anInt3915;
		@Pc(30) int local30 = Class4_Sub1_Sub3.anIntArray17[local24 - local21];
		return this.anIntArray220[local18] >> local21 & local30;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ZI)I")
	public int method2832(@OriginalArg(0) boolean arg0) {
		@Pc(8) long local8 = Static282.method3962();
		for (@Pc(22) Class4_Sub29 local22 = arg0 ? (Class4_Sub29) this.aClass102_16.method2705() : (Class4_Sub29) this.aClass102_16.method2704(); local22 != null; local22 = (Class4_Sub29) this.aClass102_16.method2704()) {
			if ((local22.aLong153 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local22.aLong153 & 0x4000000000000000L) != 0L) {
					@Pc(54) int local54 = (int) local22.aLong224;
					this.anIntArray220[local54] = this.anIntArray221[local54];
					local22.method5684();
					return local54;
				}
				local22.method5684();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IBI)V")
	public void method2835(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class126 local16 = Static26.aClass26_1.method647(arg0);
		@Pc(19) int local19 = local16.anInt3914;
		@Pc(22) int local22 = local16.anInt3919;
		@Pc(25) int local25 = local16.anInt3915;
		@Pc(32) int local32 = Class4_Sub1_Sub3.anIntArray17[local25 - local22];
		if (arg1 < 0 || arg1 > local32) {
			arg1 = 0;
		}
		local32 <<= local22;
		this.method2831(local32 & arg1 << local22 | ~local32 & this.anIntArray220[local19], local19);
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(II)I")
	@Override
	public int method2826(@OriginalArg(0) int arg0) {
		return this.anIntArray220[arg0];
	}
}
