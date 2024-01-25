import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class150 implements Interface1 {

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "Lclient!qp;")
	private Class280 aClass280_21 = new Class280(128);

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "[I")
	public final int[] anIntArray227 = new int[Static92.aClass23_1.anInt1036];

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "[I")
	private final int[] anIntArray226 = new int[Static92.aClass23_1.anInt1036];

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BII)V")
	public void method3822(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray227[arg1] = arg0;
		@Pc(16) Class3_Sub18 local16 = (Class3_Sub18) this.aClass280_21.method7107((long) arg1);
		if (local16 == null) {
			local16 = new Class3_Sub18(Static374.method6036() + 500L);
			this.aClass280_21.method7109(local16, (long) arg1);
		} else {
			local16.aLong61 = Static374.method6036() + 500L;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)I")
	@Override
	public int method3821(@OriginalArg(0) int arg0) {
		@Pc(13) Class176 local13 = Static169.aClass187_1.method4661(arg0);
		@Pc(16) int local16 = local13.anInt4954;
		@Pc(19) int local19 = local13.anInt4953;
		@Pc(22) int local22 = local13.anInt4952;
		@Pc(29) int local29 = Class364.anIntArray647[local22 - local19];
		return local29 & this.anIntArray227[local16] >> local19;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)I")
	@Override
	public int method3820(@OriginalArg(0) int arg0) {
		return this.anIntArray227[arg0];
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
	public void method3823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray226[arg1] = arg0;
		@Pc(23) Class3_Sub18 local23 = (Class3_Sub18) this.aClass280_21.method7107((long) arg1);
		if (local23 == null) {
			local23 = new Class3_Sub18(4611686018427387905L);
			this.aClass280_21.method7109(local23, (long) arg1);
		} else if (local23.aLong61 != 4611686018427387905L) {
			local23.aLong61 = Static374.method6036() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIB)V")
	public void method3824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class176 local14 = Static169.aClass187_1.method4661(arg1);
		@Pc(17) int local17 = local14.anInt4954;
		@Pc(20) int local20 = local14.anInt4953;
		@Pc(23) int local23 = local14.anInt4952;
		@Pc(29) int local29 = Class364.anIntArray647[local23 - local20];
		if (arg0 < 0 || local29 < arg0) {
			arg0 = 0;
		}
		local29 <<= local20;
		this.method3822(arg0 << local20 & local29 | this.anIntArray227[local17] & ~local29, local17);
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(BII)V")
	public void method3825(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class176 local8 = Static169.aClass187_1.method4661(arg0);
		@Pc(11) int local11 = local8.anInt4954;
		@Pc(18) int local18 = local8.anInt4953;
		@Pc(21) int local21 = local8.anInt4952;
		@Pc(28) int local28 = Class364.anIntArray647[local21 - local18];
		if (arg1 < 0 || local28 < arg1) {
			arg1 = 0;
		}
		local28 <<= local18;
		this.method3823(local28 & arg1 << local18 | this.anIntArray226[local11] & ~local28, local11);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	public void method3826() {
		for (@Pc(7) int local7 = 0; local7 < Static92.aClass23_1.anInt1036; local7++) {
			@Pc(14) Class350 local14 = Static92.aClass23_1.method1115(local7);
			if (local14 != null && local14.anInt9684 == 0) {
				this.anIntArray226[local7] = 0;
				this.anIntArray227[local7] = 0;
			}
		}
		this.aClass280_21 = new Class280(128);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BZ)I")
	public int method3827(@OriginalArg(1) boolean arg0) {
		@Pc(8) long local8 = Static374.method6036();
		for (@Pc(30) Class3_Sub18 local30 = arg0 ? (Class3_Sub18) this.aClass280_21.method7110() : (Class3_Sub18) this.aClass280_21.method7108(); local30 != null; local30 = (Class3_Sub18) this.aClass280_21.method7108()) {
			if ((local30.aLong61 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local30.aLong61 & 0x4000000000000000L) != 0L) {
					@Pc(57) int local57 = (int) local30.aLong276;
					this.anIntArray227[local57] = this.anIntArray226[local57];
					local30.method8769();
					return local57;
				}
				local30.method8769();
			}
		}
		return -1;
	}
}
