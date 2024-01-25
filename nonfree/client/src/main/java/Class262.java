import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class262 implements Interface6 {

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "Lclient!tca;")
	private Class333 aClass333_27 = new Class333(128);

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "[I")
	private final int[] anIntArray369 = new int[Static530.aClass237_1.anInt6393];

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "[I")
	public final int[] anIntArray368 = new int[Static530.aClass237_1.anInt6393];

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZI)I")
	public int method5778(@OriginalArg(0) boolean arg0) {
		@Pc(16) long local16 = Static15.method380();
		for (@Pc(30) Class3_Sub11 local30 = arg0 ? (Class3_Sub11) this.aClass333_27.method7490() : (Class3_Sub11) this.aClass333_27.method7487(); local30 != null; local30 = (Class3_Sub11) this.aClass333_27.method7487()) {
			if ((local30.aLong57 & 0x3FFFFFFFFFFFFFFFL) < local16) {
				if ((local30.aLong57 & 0x4000000000000000L) != 0L) {
					@Pc(55) int local55 = (int) local30.aLong313;
					this.anIntArray368[local55] = this.anIntArray369[local55];
					local30.method9034();
					return local55;
				}
				local30.method9034();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)I")
	@Override
	public int method5776(@OriginalArg(0) int arg0) {
		return this.anIntArray368[arg0];
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)V")
	public void method5780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class148 local12 = Static400.aClass36_1.method1021(arg1);
		@Pc(15) int local15 = local12.anInt3993;
		@Pc(18) int local18 = local12.anInt3991;
		@Pc(21) int local21 = local12.anInt3992;
		@Pc(28) int local28 = Class14_Sub26.anIntArray516[local21 - local18];
		if (arg0 < 0 || arg0 > local28) {
			arg0 = 0;
		}
		local28 <<= local18;
		this.method5781(local28 & arg0 << local18 | ~local28 & this.anIntArray369[local15], local15);
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(III)V")
	public void method5781(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray369[arg1] = arg0;
		@Pc(22) Class3_Sub11 local22 = (Class3_Sub11) this.aClass333_27.method7489((long) arg1);
		if (local22 == null) {
			local22 = new Class3_Sub11(4611686018427387905L);
			this.aClass333_27.method7488((long) arg1, local22);
		} else if (local22.aLong57 != 4611686018427387905L) {
			local22.aLong57 = Static15.method380() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(III)V")
	public void method5782(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray368[arg1] = arg0;
		@Pc(18) Class3_Sub11 local18 = (Class3_Sub11) this.aClass333_27.method7489((long) arg1);
		if (local18 == null) {
			local18 = new Class3_Sub11(Static15.method380() + 500L);
			this.aClass333_27.method7488((long) arg1, local18);
		} else {
			local18.aLong57 = Static15.method380() + 500L;
		}
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(III)V")
	public void method5783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class148 local8 = Static400.aClass36_1.method1021(arg0);
		@Pc(11) int local11 = local8.anInt3993;
		@Pc(14) int local14 = local8.anInt3991;
		@Pc(17) int local17 = local8.anInt3992;
		@Pc(24) int local24 = Class14_Sub26.anIntArray516[local17 - local14];
		if (arg1 < 0 || local24 < arg1) {
			arg1 = 0;
		}
		local24 <<= local14;
		this.method5782(this.anIntArray368[local11] & ~local24 | local24 & arg1 << local14, local11);
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)I")
	@Override
	public int method5777(@OriginalArg(1) int arg0) {
		@Pc(10) Class148 local10 = Static400.aClass36_1.method1021(arg0);
		@Pc(13) int local13 = local10.anInt3993;
		@Pc(16) int local16 = local10.anInt3991;
		@Pc(19) int local19 = local10.anInt3992;
		@Pc(26) int local26 = Class14_Sub26.anIntArray516[local19 - local16];
		return local26 & this.anIntArray368[local13] >> local16;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
	public void method5785() {
		for (@Pc(11) int local11 = 0; local11 < Static530.aClass237_1.anInt6393; local11++) {
			@Pc(18) Class253 local18 = Static530.aClass237_1.method5374(local11);
			if (local18 != null && local18.anInt6691 == 0) {
				this.anIntArray369[local11] = 0;
				this.anIntArray368[local11] = 0;
			}
		}
		this.aClass333_27 = new Class333(128);
	}
}
