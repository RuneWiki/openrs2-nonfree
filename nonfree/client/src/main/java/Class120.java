import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class120 implements Interface10 {

	@OriginalMember(owner = "client!id", name = "m", descriptor = "Lclient!ru;")
	private Class220 aClass220_20 = new Class220(128);

	@OriginalMember(owner = "client!id", name = "l", descriptor = "[I")
	private final int[] anIntArray260 = new int[Static361.aClass267_1.anInt7442];

	@OriginalMember(owner = "client!id", name = "d", descriptor = "[I")
	public final int[] anIntArray259 = new int[Static361.aClass267_1.anInt7442];

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V")
	public void method2528(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class216 local10 = Static371.aClass211_1.method4908(arg1);
		@Pc(13) int local13 = local10.anInt6225;
		@Pc(16) int local16 = local10.anInt6229;
		@Pc(19) int local19 = local10.anInt6230;
		@Pc(26) int local26 = Class171.anIntArray395[local19 - local16];
		if (arg0 < 0 || arg0 > local26) {
			arg0 = 0;
		}
		local26 <<= local16;
		this.method2533(local26 & arg0 << local16 | this.anIntArray259[local13] & ~local26, local13);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(II)I")
	@Override
	public int method2526(@OriginalArg(0) int arg0) {
		@Pc(8) Class216 local8 = Static371.aClass211_1.method4908(arg0);
		@Pc(11) int local11 = local8.anInt6225;
		@Pc(14) int local14 = local8.anInt6229;
		@Pc(21) int local21 = local8.anInt6230;
		@Pc(28) int local28 = Class171.anIntArray395[local21 - local14];
		return this.anIntArray259[local11] >> local14 & local28;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IZ)I")
	public int method2530(@OriginalArg(1) boolean arg0) {
		@Pc(8) long local8 = Static432.method5870();
		for (@Pc(27) Class2_Sub21 local27 = arg0 ? (Class2_Sub21) this.aClass220_20.method5096() : (Class2_Sub21) this.aClass220_20.method5098(); local27 != null; local27 = (Class2_Sub21) this.aClass220_20.method5098()) {
			if ((local27.aLong159 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local27.aLong159 & 0x4000000000000000L) != 0L) {
					@Pc(49) int local49 = (int) local27.aLong401;
					this.anIntArray259[local49] = this.anIntArray260[local49];
					local27.method6260();
					return local49;
				}
				local27.method6260();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZI)I")
	@Override
	public int method2525(@OriginalArg(1) int arg0) {
		return this.anIntArray259[arg0];
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIB)V")
	public void method2531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class216 local8 = Static371.aClass211_1.method4908(arg1);
		@Pc(11) int local11 = local8.anInt6225;
		@Pc(14) int local14 = local8.anInt6229;
		@Pc(17) int local17 = local8.anInt6230;
		@Pc(32) int local32 = Class171.anIntArray395[local17 - local14];
		if (arg0 < 0 || local32 < arg0) {
			arg0 = 0;
		}
		local32 <<= local14;
		this.method2537(local11, this.anIntArray260[local11] & ~local32 | local32 & arg0 << local14);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BII)V")
	public void method2533(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray259[arg1] = arg0;
		@Pc(24) Class2_Sub21 local24 = (Class2_Sub21) this.aClass220_20.method5099((long) arg1);
		if (local24 == null) {
			local24 = new Class2_Sub21(Static432.method5870() + 500L);
			this.aClass220_20.method5104(local24, (long) arg1);
		} else {
			local24.aLong159 = Static432.method5870() + 500L;
		}
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(B)V")
	public void method2534() {
		for (@Pc(7) int local7 = 0; local7 < Static361.aClass267_1.anInt7442; local7++) {
			@Pc(14) Class7 local14 = Static361.aClass267_1.method6044(local7);
			if (local14 != null && local14.anInt105 == 0) {
				this.anIntArray260[local7] = 0;
				this.anIntArray259[local7] = 0;
			}
		}
		this.aClass220_20 = new Class220(128);
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(III)V")
	public void method2537(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray260[arg0] = arg1;
		@Pc(16) Class2_Sub21 local16 = (Class2_Sub21) this.aClass220_20.method5099((long) arg0);
		if (local16 == null) {
			local16 = new Class2_Sub21(4611686018427387905L);
			this.aClass220_20.method5104(local16, (long) arg0);
		} else if (local16.aLong159 != 4611686018427387905L) {
			local16.aLong159 = Static432.method5870() + 500L | 0x4000000000000000L;
		}
	}
}
