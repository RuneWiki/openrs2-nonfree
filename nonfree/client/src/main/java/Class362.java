import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class362 implements Interface10 {

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "Lclient!gn;")
	private Class136 aClass136_46 = new Class136(128);

	@OriginalMember(owner = "client!ud", name = "n", descriptor = "[I")
	public final int[] anIntArray584 = new int[Static494.aClass45_1.anInt1100];

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "[I")
	private final int[] anIntArray585 = new int[Static494.aClass45_1.anInt1100];

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)V")
	public void method8661() {
		for (@Pc(7) int local7 = 0; local7 < Static494.aClass45_1.anInt1100; local7++) {
			@Pc(14) Class102 local14 = Static494.aClass45_1.method898(local7);
			if (local14 != null && local14.anInt2952 == 0) {
				this.anIntArray585[local7] = 0;
				this.anIntArray584[local7] = 0;
			}
		}
		this.aClass136_46 = new Class136(128);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIZ)V")
	public void method8662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray585[arg0] = arg1;
		@Pc(16) Class3_Sub43 local16 = (Class3_Sub43) this.aClass136_46.method3503((long) arg0);
		if (local16 == null) {
			local16 = new Class3_Sub43(4611686018427387905L);
			this.aClass136_46.method3508((long) arg0, local16);
		} else if (local16.aLong282 != 4611686018427387905L) {
			local16.aLong282 = Static626.method8479() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZ)I")
	@Override
	public int method8659(@OriginalArg(0) int arg0) {
		@Pc(14) Class345 local14 = Static135.aClass248_1.method6082(arg0);
		@Pc(17) int local17 = local14.anInt9671;
		@Pc(20) int local20 = local14.anInt9670;
		@Pc(23) int local23 = local14.anInt9669;
		@Pc(30) int local30 = Class67_Sub1.anIntArray361[local23 - local20];
		return local30 & this.anIntArray584[local17] >> local20;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZI)I")
	public int method8666(@OriginalArg(0) boolean arg0) {
		@Pc(18) long local18 = Static626.method8479();
		for (@Pc(33) Class3_Sub43 local33 = arg0 ? (Class3_Sub43) this.aClass136_46.method3509() : (Class3_Sub43) this.aClass136_46.method3506(); local33 != null; local33 = (Class3_Sub43) this.aClass136_46.method3506()) {
			if ((local33.aLong282 & 0x3FFFFFFFFFFFFFFFL) < local18) {
				if ((local33.aLong282 & 0x4000000000000000L) != 0L) {
					@Pc(57) int local57 = (int) local33.aLong382;
					this.anIntArray584[local57] = this.anIntArray585[local57];
					local33.method9446();
					return local57;
				}
				local33.method9446();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)V")
	public void method8667(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray584[arg1] = arg0;
		@Pc(24) Class3_Sub43 local24 = (Class3_Sub43) this.aClass136_46.method3503((long) arg1);
		if (local24 == null) {
			local24 = new Class3_Sub43(Static626.method8479() + 500L);
			this.aClass136_46.method3508((long) arg1, local24);
		} else {
			local24.aLong282 = Static626.method8479() + 500L;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIB)V")
	public void method8668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class345 local8 = Static135.aClass248_1.method6082(arg0);
		@Pc(11) int local11 = local8.anInt9671;
		@Pc(14) int local14 = local8.anInt9670;
		@Pc(17) int local17 = local8.anInt9669;
		@Pc(24) int local24 = Class67_Sub1.anIntArray361[local17 - local14];
		if (arg1 < 0 || local24 < arg1) {
			arg1 = 0;
		}
		local24 <<= local14;
		this.method8662(local11, arg1 << local14 & local24 | this.anIntArray585[local11] & ~local24);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BI)I")
	@Override
	public int method8660(@OriginalArg(1) int arg0) {
		return this.anIntArray584[arg0];
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(III)V")
	public void method8669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class345 local8 = Static135.aClass248_1.method6082(arg0);
		@Pc(11) int local11 = local8.anInt9671;
		@Pc(14) int local14 = local8.anInt9670;
		@Pc(17) int local17 = local8.anInt9669;
		@Pc(23) int local23 = Class67_Sub1.anIntArray361[local17 - local14];
		if (arg1 < 0 || local23 < arg1) {
			arg1 = 0;
		}
		local23 <<= local14;
		this.method8667(~local23 & this.anIntArray584[local11] | arg1 << local14 & local23, local11);
	}
}
