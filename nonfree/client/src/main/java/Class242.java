import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class242 implements Interface7 {

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "Lclient!cb;")
	private Class42 aClass42_27 = new Class42(128);

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "[I")
	public final int[] anIntArray553 = new int[Static117.aClass287_1.anInt8350];

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "[I")
	private final int[] anIntArray552 = new int[Static117.aClass287_1.anInt8350];

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V")
	public void method5718() {
		for (@Pc(3) int local3 = 0; local3 < Static117.aClass287_1.anInt8350; local3++) {
			@Pc(10) Class123 local10 = Static117.aClass287_1.method6723(local3);
			if (local10 != null && local10.anInt3465 == 0) {
				this.anIntArray552[local3] = 0;
				this.anIntArray553[local3] = 0;
			}
		}
		this.aClass42_27 = new Class42(128);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)I")
	@Override
	public int method5716(@OriginalArg(0) int arg0) {
		return this.anIntArray553[arg0];
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)V")
	public void method5720(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class73 local8 = Static304.aClass162_1.method4086(arg0);
		@Pc(11) int local11 = local8.anInt2307;
		@Pc(14) int local14 = local8.anInt2305;
		@Pc(17) int local17 = local8.anInt2304;
		@Pc(24) int local24 = Class4.anIntArray501[local17 - local14];
		if (arg1 < 0 || arg1 > local24) {
			arg1 = 0;
		}
		local24 <<= local14;
		this.method5725(local11, ~local24 & this.anIntArray553[local11] | arg1 << local14 & local24);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZI)I")
	public int method5721(@OriginalArg(0) boolean arg0) {
		@Pc(8) long local8 = Static105.method2132();
		for (@Pc(22) Class5_Sub14 local22 = arg0 ? (Class5_Sub14) this.aClass42_27.method1103() : (Class5_Sub14) this.aClass42_27.method1105(); local22 != null; local22 = (Class5_Sub14) this.aClass42_27.method1105()) {
			if (local8 > (local22.aLong90 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local22.aLong90 & 0x4000000000000000L) != 0L) {
					@Pc(49) int local49 = (int) local22.aLong253;
					this.anIntArray553[local49] = this.anIntArray552[local49];
					local22.method7425();
					return local49;
				}
				local22.method7425();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(III)V")
	public void method5722(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class73 local8 = Static304.aClass162_1.method4086(arg1);
		@Pc(11) int local11 = local8.anInt2307;
		@Pc(14) int local14 = local8.anInt2305;
		@Pc(17) int local17 = local8.anInt2304;
		@Pc(24) int local24 = Class4.anIntArray501[local17 - local14];
		if (arg0 < 0 || arg0 > local24) {
			arg0 = 0;
		}
		local24 <<= local14;
		this.method5723(~local24 & this.anIntArray552[local11] | local24 & arg0 << local14, local11);
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(III)V")
	public void method5723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray552[arg1] = arg0;
		@Pc(22) Class5_Sub14 local22 = (Class5_Sub14) this.aClass42_27.method1109((long) arg1);
		if (local22 == null) {
			local22 = new Class5_Sub14(4611686018427387905L);
			this.aClass42_27.method1106((long) arg1, local22);
		} else if (local22.aLong90 != 4611686018427387905L) {
			local22.aLong90 = Static105.method2132() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IBI)V")
	public void method5725(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray553[arg0] = arg1;
		@Pc(24) Class5_Sub14 local24 = (Class5_Sub14) this.aClass42_27.method1109((long) arg0);
		if (local24 == null) {
			local24 = new Class5_Sub14(Static105.method2132() + 500L);
			this.aClass42_27.method1106((long) arg0, local24);
		} else {
			local24.aLong90 = Static105.method2132() + 500L;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)I")
	@Override
	public int method5717(@OriginalArg(1) int arg0) {
		@Pc(16) Class73 local16 = Static304.aClass162_1.method4086(arg0);
		@Pc(19) int local19 = local16.anInt2307;
		@Pc(22) int local22 = local16.anInt2305;
		@Pc(25) int local25 = local16.anInt2304;
		@Pc(32) int local32 = Class4.anIntArray501[local25 - local22];
		return this.anIntArray553[local19] >> local22 & local32;
	}
}
