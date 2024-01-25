import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class239 implements Interface1 {

	@OriginalMember(owner = "client!tp", name = "k", descriptor = "Lclient!mt;")
	private Class164 aClass164_36 = new Class164(128);

	@OriginalMember(owner = "client!tp", name = "f", descriptor = "[I")
	public final int[] anIntArray564 = new int[Static172.aClass123_1.anInt3366];

	@OriginalMember(owner = "client!tp", name = "j", descriptor = "[I")
	private final int[] anIntArray565 = new int[Static172.aClass123_1.anInt3366];

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(III)V")
	public void method4995(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray564[arg1] = arg0;
		@Pc(16) Class7_Sub32 local16 = (Class7_Sub32) this.aClass164_36.method3512((long) arg1);
		if (local16 == null) {
			local16 = new Class7_Sub32(Static158.method2342() + 500L);
			this.aClass164_36.method3508((long) arg1, local16);
		} else {
			local16.aLong150 = Static158.method2342() + 500L;
		}
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(III)V")
	public void method4996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class148 local8 = Static446.aClass53_1.method1177(arg0);
		@Pc(11) int local11 = local8.anInt4124;
		@Pc(14) int local14 = local8.anInt4118;
		@Pc(17) int local17 = local8.anInt4119;
		@Pc(32) int local32 = Class119_Sub1.anIntArray291[local17 - local14];
		if (arg1 < 0 || arg1 > local32) {
			arg1 = 0;
		}
		local32 <<= local14;
		this.method4999(local11, ~local32 & this.anIntArray565[local11] | arg1 << local14 & local32);
	}

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "(ZI)I")
	public int method4997(@OriginalArg(0) boolean arg0) {
		@Pc(8) long local8 = Static158.method2342();
		for (@Pc(27) Class7_Sub32 local27 = arg0 ? (Class7_Sub32) this.aClass164_36.method3514() : (Class7_Sub32) this.aClass164_36.method3519(); local27 != null; local27 = (Class7_Sub32) this.aClass164_36.method3519()) {
			if (local8 > (local27.aLong150 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local27.aLong150 & 0x4000000000000000L) != 0L) {
					@Pc(47) int local47 = (int) local27.aLong230;
					this.anIntArray564[local47] = this.anIntArray565[local47];
					local27.method5802();
					return local47;
				}
				local27.method5802();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IB)I")
	@Override
	public int method4992(@OriginalArg(0) int arg0) {
		@Pc(8) Class148 local8 = Static446.aClass53_1.method1177(arg0);
		@Pc(11) int local11 = local8.anInt4124;
		@Pc(19) int local19 = local8.anInt4118;
		@Pc(22) int local22 = local8.anInt4119;
		@Pc(29) int local29 = Class119_Sub1.anIntArray291[local22 - local19];
		return local29 & this.anIntArray564[local11] >> local19;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IBI)V")
	public void method4998(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class148 local8 = Static446.aClass53_1.method1177(arg1);
		@Pc(17) int local17 = local8.anInt4124;
		@Pc(20) int local20 = local8.anInt4118;
		@Pc(23) int local23 = local8.anInt4119;
		@Pc(30) int local30 = Class119_Sub1.anIntArray291[local23 - local20];
		if (arg0 < 0 || local30 < arg0) {
			arg0 = 0;
		}
		local30 <<= local20;
		this.method4995(arg0 << local20 & local30 | this.anIntArray564[local17] & ~local30, local17);
	}

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "(III)V")
	public void method4999(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray565[arg0] = arg1;
		@Pc(21) Class7_Sub32 local21 = (Class7_Sub32) this.aClass164_36.method3512((long) arg0);
		if (local21 == null) {
			local21 = new Class7_Sub32(4611686018427387905L);
			this.aClass164_36.method3508((long) arg0, local21);
		} else if (local21.aLong150 != 4611686018427387905L) {
			local21.aLong150 = Static158.method2342() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZI)I")
	@Override
	public int method4993(@OriginalArg(1) int arg0) {
		return this.anIntArray564[arg0];
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V")
	public void method5000() {
		for (@Pc(7) int local7 = 0; local7 < Static172.aClass123_1.anInt3366; local7++) {
			@Pc(14) Class174 local14 = Static172.aClass123_1.method2740(local7);
			if (local14 != null && local14.anInt4625 == 0) {
				this.anIntArray565[local7] = 0;
				this.anIntArray564[local7] = 0;
			}
		}
		this.aClass164_36 = new Class164(128);
	}
}
