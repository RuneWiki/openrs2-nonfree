import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class80 implements Interface1 {

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "Lclient!cv;")
	private Class51 aClass51_9 = new Class51(128);

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "[I")
	private final int[] anIntArray98 = new int[Static157.aClass255_1.anInt7551];

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "[I")
	public final int[] anIntArray99 = new int[Static157.aClass255_1.anInt7551];

	static {
		new Class96("From", "Von:", "De", "De");
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZ)I")
	public int method1615(@OriginalArg(1) boolean arg0) {
		@Pc(8) long local8 = Static107.method1707();
		for (@Pc(22) Class1_Sub28 local22 = arg0 ? (Class1_Sub28) this.aClass51_9.method928() : (Class1_Sub28) this.aClass51_9.method926(); local22 != null; local22 = (Class1_Sub28) this.aClass51_9.method926()) {
			if (local8 > (local22.aLong123 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local22.aLong123 & 0x4000000000000000L) != 0L) {
					@Pc(61) int local61 = (int) local22.aLong237;
					this.anIntArray99[local61] = this.anIntArray98[local61];
					local22.method5965();
					return local61;
				}
				local22.method5965();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(ZI)I")
	@Override
	public int method1613(@OriginalArg(1) int arg0) {
		return this.anIntArray99[arg0];
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)V")
	public void method1616(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray98[arg0] = arg1;
		@Pc(20) Class1_Sub28 local20 = (Class1_Sub28) this.aClass51_9.method930((long) arg0);
		if (local20 == null) {
			local20 = new Class1_Sub28(4611686018427387905L);
			this.aClass51_9.method931(local20, (long) arg0);
		} else if (local20.aLong123 != 4611686018427387905L) {
			local20.aLong123 = Static107.method1707() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BII)V")
	public void method1617(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class183 local16 = Static82.aClass260_1.method5916(arg0);
		@Pc(19) int local19 = local16.anInt4772;
		@Pc(22) int local22 = local16.anInt4774;
		@Pc(25) int local25 = local16.anInt4771;
		@Pc(32) int local32 = Class142.anIntArray298[local25 - local22];
		if (arg1 < 0 || arg1 > local32) {
			arg1 = 0;
		}
		local32 <<= local22;
		this.method1616(local19, local32 & arg1 << local22 | ~local32 & this.anIntArray98[local19]);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V")
	public void method1619() {
		for (@Pc(9) int local9 = 0; local9 < Static157.aClass255_1.anInt7551; local9++) {
			@Pc(16) Class245 local16 = Static157.aClass255_1.method5817(local9);
			if (local16 != null && local16.anInt7197 == 0) {
				this.anIntArray98[local9] = 0;
				this.anIntArray99[local9] = 0;
			}
		}
		this.aClass51_9 = new Class51(128);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZI)I")
	@Override
	public int method1612(@OriginalArg(1) int arg0) {
		@Pc(16) Class183 local16 = Static82.aClass260_1.method5916(arg0);
		@Pc(19) int local19 = local16.anInt4772;
		@Pc(22) int local22 = local16.anInt4774;
		@Pc(25) int local25 = local16.anInt4771;
		@Pc(31) int local31 = Class142.anIntArray298[local25 - local22];
		return local31 & this.anIntArray99[local19] >> local22;
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(III)V")
	public void method1621(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class183 local10 = Static82.aClass260_1.method5916(arg0);
		@Pc(13) int local13 = local10.anInt4772;
		@Pc(16) int local16 = local10.anInt4774;
		@Pc(19) int local19 = local10.anInt4771;
		@Pc(25) int local25 = Class142.anIntArray298[local19 - local16];
		if (arg1 < 0 || arg1 > local25) {
			arg1 = 0;
		}
		local25 <<= local16;
		this.method1624(local13, ~local25 & this.anIntArray99[local13] | local25 & arg1 << local16);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IBI)V")
	public void method1624(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray99[arg0] = arg1;
		@Pc(21) Class1_Sub28 local21 = (Class1_Sub28) this.aClass51_9.method930((long) arg0);
		if (local21 == null) {
			local21 = new Class1_Sub28(Static107.method1707() + 500L);
			this.aClass51_9.method931(local21, (long) arg0);
		} else {
			local21.aLong123 = Static107.method1707() + 500L;
		}
	}
}
