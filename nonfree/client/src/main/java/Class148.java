import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class148 implements Interface21 {

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "Lclient!waa;")
	private Class350 aClass350_16 = new Class350(128);

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "[I")
	private final int[] anIntArray187 = new int[Static121.aClass141_1.anInt3743];

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "[I")
	public final int[] anIntArray188 = new int[Static121.aClass141_1.anInt3743];

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZII)V")
	public void method3449(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class13 local8 = Static381.aClass2_4.method67(arg1);
		@Pc(11) int local11 = local8.anInt237;
		@Pc(20) int local20 = local8.anInt232;
		@Pc(23) int local23 = local8.anInt236;
		@Pc(30) int local30 = Class38_Sub10.anIntArray482[local23 - local20];
		if (arg0 < 0 || arg0 > local30) {
			arg0 = 0;
		}
		local30 <<= local20;
		this.method3454(this.anIntArray188[local11] & ~local30 | local30 & arg0 << local20, local11);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IB)I")
	@Override
	public int method3447(@OriginalArg(0) int arg0) {
		return this.anIntArray188[arg0];
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)V")
	public void method3451(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class13 local10 = Static381.aClass2_4.method67(arg1);
		@Pc(13) int local13 = local10.anInt237;
		@Pc(16) int local16 = local10.anInt232;
		@Pc(24) int local24 = local10.anInt236;
		@Pc(31) int local31 = Class38_Sub10.anIntArray482[local24 - local16];
		if (arg0 < 0 || local31 < arg0) {
			arg0 = 0;
		}
		local31 <<= local16;
		this.method3456(local31 & arg0 << local16 | this.anIntArray187[local13] & ~local31, local13);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZI)I")
	public int method3452(@OriginalArg(0) boolean arg0) {
		@Pc(8) long local8 = Static574.method8210();
		for (@Pc(22) Class4_Sub21 local22 = arg0 ? (Class4_Sub21) this.aClass350_16.method8198() : (Class4_Sub21) this.aClass350_16.method8205(); local22 != null; local22 = (Class4_Sub21) this.aClass350_16.method8205()) {
			if ((local22.aLong106 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local22.aLong106 & 0x4000000000000000L) != 0L) {
					@Pc(54) int local54 = (int) local22.aLong268;
					this.anIntArray188[local54] = this.anIntArray187[local54];
					local22.method8379();
					return local54;
				}
				local22.method8379();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(III)V")
	public void method3454(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray188[arg1] = arg0;
		@Pc(16) Class4_Sub21 local16 = (Class4_Sub21) this.aClass350_16.method8207((long) arg1);
		if (local16 == null) {
			local16 = new Class4_Sub21(Static574.method8210() + 500L);
			this.aClass350_16.method8199((long) arg1, local16);
		} else {
			local16.aLong106 = Static574.method8210() + 500L;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)I")
	@Override
	public int method3448(@OriginalArg(1) int arg0) {
		@Pc(8) Class13 local8 = Static381.aClass2_4.method67(arg0);
		@Pc(16) int local16 = local8.anInt237;
		@Pc(19) int local19 = local8.anInt232;
		@Pc(22) int local22 = local8.anInt236;
		@Pc(28) int local28 = Class38_Sub10.anIntArray482[local22 - local19];
		return local28 & this.anIntArray188[local16] >> local19;
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(III)V")
	public void method3456(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray187[arg1] = arg0;
		@Pc(20) Class4_Sub21 local20 = (Class4_Sub21) this.aClass350_16.method8207((long) arg1);
		if (local20 == null) {
			local20 = new Class4_Sub21(4611686018427387905L);
			this.aClass350_16.method8199((long) arg1, local20);
		} else if (local20.aLong106 != 4611686018427387905L) {
			local20.aLong106 = Static574.method8210() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(Z)V")
	public void method3457() {
		for (@Pc(3) int local3 = 0; local3 < Static121.aClass141_1.anInt3743; local3++) {
			@Pc(10) Class150 local10 = Static121.aClass141_1.method3346(local3);
			if (local10 != null && local10.anInt3875 == 0) {
				this.anIntArray187[local3] = 0;
				this.anIntArray188[local3] = 0;
			}
		}
		this.aClass350_16 = new Class350(128);
	}
}
