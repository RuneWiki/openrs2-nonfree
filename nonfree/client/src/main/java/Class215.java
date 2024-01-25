import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class215 implements Interface17 {

	@OriginalMember(owner = "client!og", name = "f", descriptor = "Lclient!sd;")
	private Class267 aClass267_30 = new Class267(128);

	@OriginalMember(owner = "client!og", name = "n", descriptor = "[I")
	private final int[] anIntArray565 = new int[Static98.aClass309_1.anInt9031];

	@OriginalMember(owner = "client!og", name = "k", descriptor = "[I")
	public final int[] anIntArray564 = new int[Static98.aClass309_1.anInt9031];

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(IZ)I")
	public int method5537(@OriginalArg(1) boolean arg0) {
		@Pc(15) long local15 = Static12.method647();
		for (@Pc(29) Class3_Sub24 local29 = arg0 ? (Class3_Sub24) this.aClass267_30.method6643() : (Class3_Sub24) this.aClass267_30.method6650(); local29 != null; local29 = (Class3_Sub24) this.aClass267_30.method6650()) {
			if ((local29.aLong127 & 0x3FFFFFFFFFFFFFFFL) < local15) {
				if ((local29.aLong127 & 0x4000000000000000L) != 0L) {
					@Pc(56) int local56 = (int) local29.aLong285;
					this.anIntArray564[local56] = this.anIntArray565[local56];
					local29.method7820();
					return local56;
				}
				local29.method7820();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V")
	public void method5538() {
		for (@Pc(3) int local3 = 0; local3 < Static98.aClass309_1.anInt9031; local3++) {
			@Pc(10) Class38 local10 = Static98.aClass309_1.method7404(local3);
			if (local10 != null && local10.anInt1053 == 0) {
				this.anIntArray565[local3] = 0;
				this.anIntArray564[local3] = 0;
			}
		}
		this.aClass267_30 = new Class267(128);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IBI)V")
	public void method5540(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class194 local8 = Static231.aClass280_1.method6912(arg1);
		@Pc(11) int local11 = local8.anInt6002;
		@Pc(14) int local14 = local8.anInt6001;
		@Pc(25) int local25 = local8.anInt6004;
		@Pc(32) int local32 = Class12_Sub1.anIntArray659[local25 - local14];
		if (arg0 < 0 || arg0 > local32) {
			arg0 = 0;
		}
		local32 <<= local14;
		this.method5541(local11, arg0 << local14 & local32 | ~local32 & this.anIntArray564[local11]);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BII)V")
	public void method5541(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray564[arg0] = arg1;
		@Pc(24) Class3_Sub24 local24 = (Class3_Sub24) this.aClass267_30.method6644((long) arg0);
		if (local24 == null) {
			local24 = new Class3_Sub24(Static12.method647() + 500L);
			this.aClass267_30.method6640(local24, (long) arg0);
		} else {
			local24.aLong127 = Static12.method647() + 500L;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(II)I")
	@Override
	public int method5535(@OriginalArg(0) int arg0) {
		return this.anIntArray564[arg0];
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(III)V")
	public void method5542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray565[arg0] = arg1;
		@Pc(20) Class3_Sub24 local20 = (Class3_Sub24) this.aClass267_30.method6644((long) arg0);
		if (local20 == null) {
			local20 = new Class3_Sub24(4611686018427387905L);
			this.aClass267_30.method6640(local20, (long) arg0);
		} else if (local20.aLong127 != 4611686018427387905L) {
			local20.aLong127 = Static12.method647() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(BII)V")
	public void method5544(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class194 local14 = Static231.aClass280_1.method6912(arg0);
		@Pc(17) int local17 = local14.anInt6002;
		@Pc(20) int local20 = local14.anInt6001;
		@Pc(23) int local23 = local14.anInt6004;
		@Pc(29) int local29 = Class12_Sub1.anIntArray659[local23 - local20];
		if (arg1 < 0 || arg1 > local29) {
			arg1 = 0;
		}
		local29 <<= local20;
		this.method5542(local17, ~local29 & this.anIntArray565[local17] | arg1 << local20 & local29);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IZ)I")
	@Override
	public int method5534(@OriginalArg(0) int arg0) {
		@Pc(13) Class194 local13 = Static231.aClass280_1.method6912(arg0);
		@Pc(16) int local16 = local13.anInt6002;
		@Pc(19) int local19 = local13.anInt6001;
		@Pc(22) int local22 = local13.anInt6004;
		@Pc(28) int local28 = Class12_Sub1.anIntArray659[local22 - local19];
		return this.anIntArray564[local16] >> local19 & local28;
	}
}
