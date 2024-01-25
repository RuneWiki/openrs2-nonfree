import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pu")
public final class Class293 implements Interface4 {

	@OriginalMember(owner = "client!pu", name = "e", descriptor = "Lclient!dj;")
	private Class66 aClass66_34 = new Class66(128);

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "[I")
	public final int[] anIntArray509 = new int[Static522.aClass365_1.anInt9412];

	@OriginalMember(owner = "client!pu", name = "i", descriptor = "[I")
	private final int[] anIntArray510 = new int[Static522.aClass365_1.anInt9412];

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(III)V")
	public void method6531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray509[arg1] = arg0;
		@Pc(22) Class4_Sub50 local22 = (Class4_Sub50) this.aClass66_34.method1994((long) arg1);
		if (local22 == null) {
			local22 = new Class4_Sub50(Static429.method5935() + 500L);
			this.aClass66_34.method1985(local22, (long) arg1);
		} else {
			local22.aLong276 = Static429.method5935() + 500L;
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)V")
	public void method6532() {
		for (@Pc(3) int local3 = 0; local3 < Static522.aClass365_1.anInt9412; local3++) {
			@Pc(18) Class154 local18 = Static522.aClass365_1.method8030(local3);
			if (local18 != null && local18.anInt3663 == 0) {
				this.anIntArray510[local3] = 0;
				this.anIntArray509[local3] = 0;
			}
		}
		this.aClass66_34 = new Class66(128);
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(III)V")
	public void method6535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class114 local8 = Static110.aClass184_1.method4122(arg1);
		@Pc(11) int local11 = local8.anInt2904;
		@Pc(18) int local18 = local8.anInt2903;
		@Pc(21) int local21 = local8.anInt2901;
		@Pc(28) int local28 = Class306.anIntArray539[local21 - local18];
		if (arg0 < 0 || arg0 > local28) {
			arg0 = 0;
		}
		local28 <<= local18;
		this.method6539(local11, local28 & arg0 << local18 | ~local28 & this.anIntArray510[local11]);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(II)I")
	@Override
	public int method6530(@OriginalArg(1) int arg0) {
		return this.anIntArray509[arg0];
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IB)I")
	@Override
	public int method6529(@OriginalArg(0) int arg0) {
		@Pc(8) Class114 local8 = Static110.aClass184_1.method4122(arg0);
		@Pc(19) int local19 = local8.anInt2904;
		@Pc(22) int local22 = local8.anInt2903;
		@Pc(25) int local25 = local8.anInt2901;
		@Pc(32) int local32 = Class306.anIntArray539[local25 - local22];
		return this.anIntArray509[local19] >> local22 & local32;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(ZZ)I")
	public int method6537(@OriginalArg(1) boolean arg0) {
		@Pc(8) long local8 = Static429.method5935();
		for (@Pc(28) Class4_Sub50 local28 = arg0 ? (Class4_Sub50) this.aClass66_34.method1992() : (Class4_Sub50) this.aClass66_34.method1984(); local28 != null; local28 = (Class4_Sub50) this.aClass66_34.method1984()) {
			if ((local28.aLong276 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local28.aLong276 & 0x4000000000000000L) != 0L) {
					@Pc(55) int local55 = (int) local28.aLong307;
					this.anIntArray509[local55] = this.anIntArray510[local55];
					local28.method9000();
					return local55;
				}
				local28.method9000();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!pu", name = "d", descriptor = "(III)V")
	public void method6538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class114 local8 = Static110.aClass184_1.method4122(arg1);
		@Pc(11) int local11 = local8.anInt2904;
		@Pc(14) int local14 = local8.anInt2903;
		@Pc(17) int local17 = local8.anInt2901;
		@Pc(24) int local24 = Class306.anIntArray539[local17 - local14];
		if (arg0 < 0 || arg0 > local24) {
			arg0 = 0;
		}
		local24 <<= local14;
		this.method6531(local24 & arg0 << local14 | ~local24 & this.anIntArray509[local11], local11);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(ZII)V")
	public void method6539(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray510[arg0] = arg1;
		@Pc(21) Class4_Sub50 local21 = (Class4_Sub50) this.aClass66_34.method1994((long) arg0);
		if (local21 == null) {
			local21 = new Class4_Sub50(4611686018427387905L);
			this.aClass66_34.method1985(local21, (long) arg0);
		} else if (local21.aLong276 != 4611686018427387905L) {
			local21.aLong276 = Static429.method5935() + 500L | 0x4000000000000000L;
		}
	}
}
