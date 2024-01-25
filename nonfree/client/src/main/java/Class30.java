import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bga")
public final class Class30 implements Interface5 {

	@OriginalMember(owner = "client!bga", name = "m", descriptor = "Lclient!nj;")
	private Class212 aClass212_2 = new Class212(128);

	@OriginalMember(owner = "client!bga", name = "d", descriptor = "[I")
	private final int[] anIntArray44 = new int[Static333.aClass187_1.anInt4743];

	@OriginalMember(owner = "client!bga", name = "h", descriptor = "[I")
	public final int[] anIntArray46 = new int[Static333.aClass187_1.anInt4743];

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(II)I")
	@Override
	public int method494(@OriginalArg(1) int arg0) {
		return this.anIntArray46[arg0];
	}

	@OriginalMember(owner = "client!bga", name = "b", descriptor = "(II)I")
	@Override
	public int method495(@OriginalArg(0) int arg0) {
		@Pc(8) Class182 local8 = Static386.aClass91_1.method1860(arg0);
		@Pc(11) int local11 = local8.anInt4680;
		@Pc(19) int local19 = local8.anInt4678;
		@Pc(22) int local22 = local8.anInt4683;
		@Pc(29) int local29 = Class52_Sub3.anIntArray383[local22 - local19];
		return this.anIntArray46[local11] >> local19 & local29;
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(III)V")
	public void method497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray46[arg1] = arg0;
		@Pc(21) Class6_Sub25 local21 = (Class6_Sub25) this.aClass212_2.method5106((long) arg1);
		if (local21 == null) {
			local21 = new Class6_Sub25(Static137.method2058() + 500L);
			this.aClass212_2.method5104((long) arg1, local21);
		} else {
			local21.aLong107 = Static137.method2058() + 500L;
		}
	}

	@OriginalMember(owner = "client!bga", name = "b", descriptor = "(III)V")
	public void method498(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class182 local8 = Static386.aClass91_1.method1860(arg0);
		@Pc(17) int local17 = local8.anInt4680;
		@Pc(20) int local20 = local8.anInt4678;
		@Pc(23) int local23 = local8.anInt4683;
		@Pc(30) int local30 = Class52_Sub3.anIntArray383[local23 - local20];
		if (arg1 < 0 || arg1 > local30) {
			arg1 = 0;
		}
		local30 <<= local20;
		this.method497(~local30 & this.anIntArray46[local17] | arg1 << local20 & local30, local17);
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(Z)V")
	public void method499() {
		for (@Pc(7) int local7 = 0; local7 < Static333.aClass187_1.anInt4743; local7++) {
			@Pc(14) Class123 local14 = Static333.aClass187_1.method4092(local7);
			if (local14 != null && local14.anInt3045 == 0) {
				this.anIntArray44[local7] = 0;
				this.anIntArray46[local7] = 0;
			}
		}
		this.aClass212_2 = new Class212(128);
	}

	@OriginalMember(owner = "client!bga", name = "c", descriptor = "(III)V")
	public void method500(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray44[arg0] = arg1;
		@Pc(16) Class6_Sub25 local16 = (Class6_Sub25) this.aClass212_2.method5106((long) arg0);
		if (local16 == null) {
			local16 = new Class6_Sub25(4611686018427387905L);
			this.aClass212_2.method5104((long) arg0, local16);
		} else if (local16.aLong107 != 4611686018427387905L) {
			local16.aLong107 = Static137.method2058() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(IBI)V")
	public void method501(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class182 local8 = Static386.aClass91_1.method1860(arg0);
		@Pc(11) int local11 = local8.anInt4680;
		@Pc(14) int local14 = local8.anInt4678;
		@Pc(22) int local22 = local8.anInt4683;
		@Pc(29) int local29 = Class52_Sub3.anIntArray383[local22 - local14];
		if (arg1 < 0 || arg1 > local29) {
			arg1 = 0;
		}
		local29 <<= local14;
		this.method500(local11, arg1 << local14 & local29 | ~local29 & this.anIntArray44[local11]);
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(ZZ)I")
	public int method502(@OriginalArg(1) boolean arg0) {
		@Pc(16) long local16 = Static137.method2058();
		for (@Pc(30) Class6_Sub25 local30 = arg0 ? (Class6_Sub25) this.aClass212_2.method5099() : (Class6_Sub25) this.aClass212_2.method5103(); local30 != null; local30 = (Class6_Sub25) this.aClass212_2.method5103()) {
			if (local16 > (local30.aLong107 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local30.aLong107 & 0x4000000000000000L) != 0L) {
					@Pc(61) int local61 = (int) local30.aLong249;
					this.anIntArray46[local61] = this.anIntArray44[local61];
					local30.method7849();
					return local61;
				}
				local30.method7849();
			}
		}
		return -1;
	}
}
