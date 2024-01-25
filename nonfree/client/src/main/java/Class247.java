import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class247 implements Interface1 {

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "Lclient!qr;")
	private Class306 aClass306_29 = new Class306(128);

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "[I")
	public final int[] anIntArray373 = new int[Static628.aClass348_1.anInt9003];

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "[I")
	private final int[] anIntArray374 = new int[Static628.aClass348_1.anInt9003];

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IB)I")
	@Override
	public int method5699(@OriginalArg(0) int arg0) {
		@Pc(10) Class143 local10 = Static284.aClass305_1.method6909(arg0);
		@Pc(13) int local13 = local10.anInt3669;
		@Pc(22) int local22 = local10.anInt3668;
		@Pc(25) int local25 = local10.anInt3667;
		@Pc(32) int local32 = Class260.anIntArray408[local25 - local22];
		return local32 & this.anIntArray373[local13] >> local22;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(IB)I")
	@Override
	public int method5700(@OriginalArg(0) int arg0) {
		return this.anIntArray373[arg0];
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(III)V")
	public void method5701(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class143 local10 = Static284.aClass305_1.method6909(arg1);
		@Pc(13) int local13 = local10.anInt3669;
		@Pc(16) int local16 = local10.anInt3668;
		@Pc(19) int local19 = local10.anInt3667;
		@Pc(26) int local26 = Class260.anIntArray408[local19 - local16];
		if (arg0 < 0 || local26 < arg0) {
			arg0 = 0;
		}
		local26 <<= local16;
		this.method5707(~local26 & this.anIntArray374[local13] | arg0 << local16 & local26, local13);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIB)V")
	public void method5702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class143 local8 = Static284.aClass305_1.method6909(arg1);
		@Pc(11) int local11 = local8.anInt3669;
		@Pc(14) int local14 = local8.anInt3668;
		@Pc(17) int local17 = local8.anInt3667;
		@Pc(24) int local24 = Class260.anIntArray408[local17 - local14];
		if (arg0 < 0 || arg0 > local24) {
			arg0 = 0;
		}
		local24 <<= local14;
		this.method5705(local11, ~local24 & this.anIntArray373[local11] | local24 & arg0 << local14);
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
	public void method5704() {
		for (@Pc(7) int local7 = 0; local7 < Static628.aClass348_1.anInt9003; local7++) {
			@Pc(23) Class333 local23 = Static628.aClass348_1.method7726(local7);
			if (local23 != null && local23.anInt8734 == 0) {
				this.anIntArray374[local7] = 0;
				this.anIntArray373[local7] = 0;
			}
		}
		this.aClass306_29 = new Class306(128);
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(IIB)V")
	public void method5705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray373[arg0] = arg1;
		@Pc(16) Class5_Sub44 local16 = (Class5_Sub44) this.aClass306_29.method6943((long) arg0);
		if (local16 == null) {
			local16 = new Class5_Sub44(Static480.method6763() + 500L);
			this.aClass306_29.method6944(local16, (long) arg0, -12002);
		} else {
			local16.aLong203 = Static480.method6763() + 500L;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZ)I")
	public int method5706(@OriginalArg(1) boolean arg0) {
		@Pc(10) long local10 = Static480.method6763();
		for (@Pc(37) Class5_Sub44 local37 = arg0 ? (Class5_Sub44) this.aClass306_29.method6941() : (Class5_Sub44) this.aClass306_29.method6940(); local37 != null; local37 = (Class5_Sub44) this.aClass306_29.method6940()) {
			if (local10 > (local37.aLong203 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local37.aLong203 & 0x4000000000000000L) != 0L) {
					@Pc(67) int local67 = (int) local37.aLong312;
					this.anIntArray373[local67] = this.anIntArray374[local67];
					local37.method9222();
					return local67;
				}
				local37.method9222();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)V")
	public void method5707(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray374[arg1] = arg0;
		@Pc(24) Class5_Sub44 local24 = (Class5_Sub44) this.aClass306_29.method6943((long) arg1);
		if (local24 == null) {
			local24 = new Class5_Sub44(4611686018427387905L);
			this.aClass306_29.method6944(local24, (long) arg1, -12002);
		} else if (local24.aLong203 != 4611686018427387905L) {
			local24.aLong203 = Static480.method6763() + 500L | 0x4000000000000000L;
			return;
		}
	}
}
