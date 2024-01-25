import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class198 implements Interface5 {

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "Lclient!mp;")
	private Class222 aClass222_21 = new Class222(128);

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "[I")
	public final int[] anIntArray386 = new int[Static18.aClass244_1.anInt7444];

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "[I")
	private final int[] anIntArray385 = new int[Static18.aClass244_1.anInt7444];

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZI)I")
	public int method4746(@OriginalArg(0) boolean arg0) {
		@Pc(10) long local10 = Static438.method6517();
		for (@Pc(24) Class2_Sub26 local24 = arg0 ? (Class2_Sub26) this.aClass222_21.method5474() : (Class2_Sub26) this.aClass222_21.method5472(); local24 != null; local24 = (Class2_Sub26) this.aClass222_21.method5472()) {
			if ((local24.aLong128 & 0x3FFFFFFFFFFFFFFFL) < local10) {
				if ((local24.aLong128 & 0x4000000000000000L) != 0L) {
					@Pc(53) int local53 = (int) local24.aLong287;
					this.anIntArray386[local53] = this.anIntArray385[local53];
					local24.method8599();
					return local53;
				}
				local24.method8599();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZI)V")
	public void method4747(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray385[arg0] = arg1;
		@Pc(24) Class2_Sub26 local24 = (Class2_Sub26) this.aClass222_21.method5468((long) arg0);
		if (local24 == null) {
			local24 = new Class2_Sub26(4611686018427387905L);
			this.aClass222_21.method5476(local24, (long) arg0);
		} else if (local24.aLong128 != 4611686018427387905L) {
			local24.aLong128 = Static438.method6517() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)V")
	public void method4748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray386[arg1] = arg0;
		@Pc(16) Class2_Sub26 local16 = (Class2_Sub26) this.aClass222_21.method5468((long) arg1);
		if (local16 == null) {
			local16 = new Class2_Sub26(Static438.method6517() + 500L);
			this.aClass222_21.method5476(local16, (long) arg1);
		} else {
			local16.aLong128 = Static438.method6517() + 500L;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IBI)V")
	public void method4749(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class332 local8 = Static23.aClass296_1.method7023(arg1);
		@Pc(11) int local11 = local8.anInt9273;
		@Pc(14) int local14 = local8.anInt9267;
		@Pc(17) int local17 = local8.anInt9269;
		@Pc(23) int local23 = Class11_Sub1_Sub5.anIntArray303[local17 - local14];
		if (arg0 < 0 || local23 < arg0) {
			arg0 = 0;
		}
		local23 <<= local14;
		this.method4747(local11, arg0 << local14 & local23 | ~local23 & this.anIntArray385[local11]);
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(III)V")
	public void method4751(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class332 local16 = Static23.aClass296_1.method7023(arg1);
		@Pc(19) int local19 = local16.anInt9273;
		@Pc(22) int local22 = local16.anInt9267;
		@Pc(25) int local25 = local16.anInt9269;
		@Pc(32) int local32 = Class11_Sub1_Sub5.anIntArray303[local25 - local22];
		if (arg0 < 0 || local32 < arg0) {
			arg0 = 0;
		}
		local32 <<= local22;
		this.method4748(local32 & arg0 << local22 | this.anIntArray386[local19] & ~local32, local19);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)I")
	@Override
	public int method4744(@OriginalArg(0) int arg0) {
		return this.anIntArray386[arg0];
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)I")
	@Override
	public int method4743(@OriginalArg(1) int arg0) {
		@Pc(13) Class332 local13 = Static23.aClass296_1.method7023(arg0);
		@Pc(16) int local16 = local13.anInt9273;
		@Pc(19) int local19 = local13.anInt9267;
		@Pc(22) int local22 = local13.anInt9269;
		@Pc(29) int local29 = Class11_Sub1_Sub5.anIntArray303[local22 - local19];
		return local29 & this.anIntArray386[local16] >> local19;
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V")
	public void method4753() {
		for (@Pc(1) int local1 = 0; local1 < Static18.aClass244_1.anInt7444; local1++) {
			@Pc(7) Class96 local7 = Static18.aClass244_1.method6259(local1);
			if (local7 != null && local7.anInt2980 == 0) {
				this.anIntArray385[local1] = 0;
				this.anIntArray386[local1] = 0;
			}
		}
		this.aClass222_21 = new Class222(128);
	}
}
