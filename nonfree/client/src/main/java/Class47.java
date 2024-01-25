import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class47 implements Interface6 {

	@OriginalMember(owner = "client!di", name = "a", descriptor = "Lclient!lp;")
	private Class140 aClass140_11 = new Class140(128);

	@OriginalMember(owner = "client!di", name = "d", descriptor = "[I")
	public final int[] anIntArray67 = new int[Static208.aClass159_1.anInt4532];

	@OriginalMember(owner = "client!di", name = "o", descriptor = "[I")
	private final int[] anIntArray68 = new int[Static208.aClass159_1.anInt4532];

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(III)V")
	public void method1269(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray68[arg0] = arg1;
		@Pc(24) Class3_Sub41 local24 = (Class3_Sub41) this.aClass140_11.method3490((long) arg0);
		if (local24 == null) {
			local24 = new Class3_Sub41(4611686018427387905L);
			this.aClass140_11.method3494((long) arg0, local24);
		} else if (local24.aLong207 != 4611686018427387905L) {
			local24.aLong207 = Static354.method4966() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(III)V")
	public void method1270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class223 local8 = Static256.aClass112_1.method2863(arg1);
		@Pc(11) int local11 = local8.anInt6330;
		@Pc(14) int local14 = local8.anInt6329;
		@Pc(17) int local17 = local8.anInt6328;
		@Pc(23) int local23 = Class7.anIntArray1[local17 - local14];
		if (arg0 < 0 || local23 < arg0) {
			arg0 = 0;
		}
		local23 <<= local14;
		this.method1271(local11, ~local23 & this.anIntArray67[local11] | arg0 << local14 & local23);
	}

	@OriginalMember(owner = "client!di", name = "c", descriptor = "(III)V")
	public void method1271(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray67[arg0] = arg1;
		@Pc(16) Class3_Sub41 local16 = (Class3_Sub41) this.aClass140_11.method3490((long) arg0);
		if (local16 == null) {
			local16 = new Class3_Sub41(Static354.method4966() + 500L);
			this.aClass140_11.method3494((long) arg0, local16);
		} else {
			local16.aLong207 = Static354.method4966() + 500L;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
	public void method1272() {
		for (@Pc(3) int local3 = 0; local3 < Static208.aClass159_1.anInt4532; local3++) {
			@Pc(18) Class247 local18 = Static208.aClass159_1.method3765(local3);
			if (local18 != null && local18.anInt6991 == 0) {
				this.anIntArray68[local3] = 0;
				this.anIntArray67[local3] = 0;
			}
		}
		this.aClass140_11 = new Class140(128);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(II)I")
	@Override
	public int method1268(@OriginalArg(0) int arg0) {
		@Pc(8) Class223 local8 = Static256.aClass112_1.method2863(arg0);
		@Pc(11) int local11 = local8.anInt6330;
		@Pc(14) int local14 = local8.anInt6329;
		@Pc(17) int local17 = local8.anInt6328;
		@Pc(24) int local24 = Class7.anIntArray1[local17 - local14];
		return this.anIntArray67[local11] >> local14 & local24;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IZI)V")
	public void method1274(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class223 local16 = Static256.aClass112_1.method2863(arg1);
		@Pc(19) int local19 = local16.anInt6330;
		@Pc(22) int local22 = local16.anInt6329;
		@Pc(25) int local25 = local16.anInt6328;
		@Pc(32) int local32 = Class7.anIntArray1[local25 - local22];
		if (arg0 < 0 || arg0 > local32) {
			arg0 = 0;
		}
		local32 <<= local22;
		this.method1269(local19, this.anIntArray68[local19] & ~local32 | arg0 << local22 & local32);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ZI)I")
	public int method1275(@OriginalArg(0) boolean arg0) {
		@Pc(8) long local8 = Static354.method4966();
		for (@Pc(22) Class3_Sub41 local22 = arg0 ? (Class3_Sub41) this.aClass140_11.method3486() : (Class3_Sub41) this.aClass140_11.method3485(); local22 != null; local22 = (Class3_Sub41) this.aClass140_11.method3485()) {
			if ((local22.aLong207 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local22.aLong207 & 0x4000000000000000L) != 0L) {
					@Pc(51) int local51 = (int) local22.aLong248;
					this.anIntArray67[local51] = this.anIntArray68[local51];
					local22.method6288();
					return local51;
				}
				local22.method6288();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IB)I")
	@Override
	public int method1267(@OriginalArg(0) int arg0) {
		return this.anIntArray67[arg0];
	}
}
