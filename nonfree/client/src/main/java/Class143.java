import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class143 implements Interface7 {

	@OriginalMember(owner = "client!ih", name = "q", descriptor = "Lclient!sba;")
	private Class297 aClass297_19 = new Class297(128);

	@OriginalMember(owner = "client!ih", name = "p", descriptor = "[I")
	private final int[] anIntArray214 = new int[Static406.aClass144_1.anInt4613];

	@OriginalMember(owner = "client!ih", name = "o", descriptor = "[I")
	public final int[] anIntArray213 = new int[Static406.aClass144_1.anInt4613];

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIB)V")
	public void method3691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class78 local8 = Static333.aClass177_1.method4305(arg0);
		@Pc(11) int local11 = local8.anInt2630;
		@Pc(14) int local14 = local8.anInt2628;
		@Pc(23) int local23 = local8.anInt2631;
		@Pc(30) int local30 = Class347.anIntArray566[local23 - local14];
		if (arg1 < 0 || arg1 > local30) {
			arg1 = 0;
		}
		local30 <<= local14;
		this.method3694(arg1 << local14 & local30 | ~local30 & this.anIntArray213[local11], local11);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)V")
	public void method3692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray214[arg0] = arg1;
		@Pc(20) Class3_Sub1 local20 = (Class3_Sub1) this.aClass297_19.method6531((long) arg0);
		if (local20 == null) {
			local20 = new Class3_Sub1(4611686018427387905L);
			this.aClass297_19.method6537((long) arg0, local20);
		} else if (local20.aLong3 != 4611686018427387905L) {
			local20.aLong3 = Static96.method2000() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)I")
	@Override
	public int method3687(@OriginalArg(1) int arg0) {
		@Pc(8) Class78 local8 = Static333.aClass177_1.method4305(arg0);
		@Pc(11) int local11 = local8.anInt2630;
		@Pc(14) int local14 = local8.anInt2628;
		@Pc(17) int local17 = local8.anInt2631;
		@Pc(32) int local32 = Class347.anIntArray566[local17 - local14];
		return local32 & this.anIntArray213[local11] >> local14;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
	public void method3693() {
		for (@Pc(12) int local12 = 0; local12 < Static406.aClass144_1.anInt4613; local12++) {
			@Pc(19) Class118 local19 = Static406.aClass144_1.method3700(local12);
			if (local19 != null && local19.anInt3920 == 0) {
				this.anIntArray214[local12] = 0;
				this.anIntArray213[local12] = 0;
			}
		}
		this.aClass297_19 = new Class297(128);
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(III)V")
	public void method3694(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray213[arg1] = arg0;
		@Pc(21) Class3_Sub1 local21 = (Class3_Sub1) this.aClass297_19.method6531((long) arg1);
		if (local21 == null) {
			local21 = new Class3_Sub1(Static96.method2000() + 500L);
			this.aClass297_19.method6537((long) arg1, local21);
		} else {
			local21.aLong3 = Static96.method2000() + 500L;
		}
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(III)V")
	public void method3695(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class78 local14 = Static333.aClass177_1.method4305(arg0);
		@Pc(17) int local17 = local14.anInt2630;
		@Pc(20) int local20 = local14.anInt2628;
		@Pc(23) int local23 = local14.anInt2631;
		@Pc(30) int local30 = Class347.anIntArray566[local23 - local20];
		if (arg1 < 0 || local30 < arg1) {
			arg1 = 0;
		}
		local30 <<= local20;
		this.method3692(local17, this.anIntArray214[local17] & ~local30 | arg1 << local20 & local30);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BZ)I")
	public int method3696(@OriginalArg(1) boolean arg0) {
		@Pc(15) long local15 = Static96.method2000();
		for (@Pc(29) Class3_Sub1 local29 = arg0 ? (Class3_Sub1) this.aClass297_19.method6529() : (Class3_Sub1) this.aClass297_19.method6532(); local29 != null; local29 = (Class3_Sub1) this.aClass297_19.method6532()) {
			if ((local29.aLong3 & 0x3FFFFFFFFFFFFFFFL) < local15) {
				if ((local29.aLong3 & 0x4000000000000000L) != 0L) {
					@Pc(55) int local55 = (int) local29.aLong262;
					this.anIntArray213[local55] = this.anIntArray214[local55];
					local29.method8128();
					return local55;
				}
				local29.method8128();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(BI)I")
	@Override
	public int method3688(@OriginalArg(1) int arg0) {
		return this.anIntArray213[arg0];
	}
}
