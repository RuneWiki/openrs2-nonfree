import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ss")
public final class Class225 implements Interface11 {

	@OriginalMember(owner = "client!ss", name = "j", descriptor = "Lclient!ub;")
	private Class240 aClass240_31 = new Class240(128);

	@OriginalMember(owner = "client!ss", name = "g", descriptor = "[I")
	public final int[] anIntArray439 = new int[Static417.aClass237_1.anInt6868];

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "[I")
	private final int[] anIntArray438 = new int[Static417.aClass237_1.anInt6868];

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(III)V")
	public void method5147(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray439[arg1] = arg0;
		@Pc(16) Class2_Sub42 local16 = (Class2_Sub42) this.aClass240_31.method5439((long) arg1);
		if (local16 == null) {
			local16 = new Class2_Sub42(Static208.method3182() + 500L);
			this.aClass240_31.method5430((long) arg1, local16);
		} else {
			local16.aLong214 = Static208.method3182() + 500L;
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V")
	public void method5148() {
		for (@Pc(3) int local3 = 0; local3 < Static417.aClass237_1.anInt6868; local3++) {
			@Pc(10) Class181 local10 = Static417.aClass237_1.method5379(local3);
			if (local10 != null && local10.anInt5160 == 0) {
				this.anIntArray438[local3] = 0;
				this.anIntArray439[local3] = 0;
			}
		}
		this.aClass240_31 = new Class240(128);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IBI)V")
	public void method5149(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray438[arg0] = arg1;
		@Pc(24) Class2_Sub42 local24 = (Class2_Sub42) this.aClass240_31.method5439((long) arg0);
		if (local24 == null) {
			local24 = new Class2_Sub42(4611686018427387905L);
			this.aClass240_31.method5430((long) arg0, local24);
		} else if (local24.aLong214 != 4611686018427387905L) {
			local24.aLong214 = Static208.method3182() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(BZ)I")
	public int method5151(@OriginalArg(1) boolean arg0) {
		@Pc(13) long local13 = Static208.method3182();
		for (@Pc(27) Class2_Sub42 local27 = arg0 ? (Class2_Sub42) this.aClass240_31.method5438() : (Class2_Sub42) this.aClass240_31.method5436(); local27 != null; local27 = (Class2_Sub42) this.aClass240_31.method5436()) {
			if (local13 > (local27.aLong214 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local27.aLong214 & 0x4000000000000000L) != 0L) {
					@Pc(58) int local58 = (int) local27.aLong227;
					this.anIntArray439[local58] = this.anIntArray438[local58];
					local27.method6072();
					return local58;
				}
				local27.method6072();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(III)V")
	public void method5153(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class39 local8 = Static363.aClass165_1.method3913(arg0);
		@Pc(19) int local19 = local8.anInt1561;
		@Pc(22) int local22 = local8.anInt1559;
		@Pc(25) int local25 = local8.anInt1560;
		@Pc(32) int local32 = Class230.anIntArray444[local25 - local22];
		if (arg1 < 0 || arg1 > local32) {
			arg1 = 0;
		}
		local32 <<= local22;
		this.method5149(local19, ~local32 & this.anIntArray438[local19] | arg1 << local22 & local32);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)I")
	@Override
	public int method5145(@OriginalArg(1) int arg0) {
		return this.anIntArray439[arg0];
	}

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "(III)V")
	public void method5154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class39 local12 = Static363.aClass165_1.method3913(arg0);
		@Pc(15) int local15 = local12.anInt1561;
		@Pc(18) int local18 = local12.anInt1559;
		@Pc(21) int local21 = local12.anInt1560;
		@Pc(28) int local28 = Class230.anIntArray444[local21 - local18];
		if (arg1 < 0 || arg1 > local28) {
			arg1 = 0;
		}
		local28 <<= local18;
		this.method5147(~local28 & this.anIntArray439[local15] | arg1 << local18 & local28, local15);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IB)I")
	@Override
	public int method5146(@OriginalArg(0) int arg0) {
		@Pc(8) Class39 local8 = Static363.aClass165_1.method3913(arg0);
		@Pc(11) int local11 = local8.anInt1561;
		@Pc(14) int local14 = local8.anInt1559;
		@Pc(22) int local22 = local8.anInt1560;
		@Pc(28) int local28 = Class230.anIntArray444[local22 - local14];
		return this.anIntArray439[local11] >> local14 & local28;
	}
}
