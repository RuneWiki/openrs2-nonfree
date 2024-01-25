import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class321 implements Interface16 {

	@OriginalMember(owner = "client!tr", name = "j", descriptor = "Lclient!kea;")
	private Class187 aClass187_37 = new Class187(128);

	@OriginalMember(owner = "client!tr", name = "p", descriptor = "[I")
	public final int[] anIntArray654 = new int[Static409.aClass246_1.anInt6278];

	@OriginalMember(owner = "client!tr", name = "i", descriptor = "[I")
	private final int[] anIntArray653 = new int[Static409.aClass246_1.anInt6278];

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)V")
	public void method7085(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray654[arg0] = arg1;
		@Pc(19) Class1_Sub31 local19 = (Class1_Sub31) this.aClass187_37.method3797((long) arg0);
		if (local19 == null) {
			local19 = new Class1_Sub31(Static413.method5668() + 500L);
			this.aClass187_37.method3795(local19, (long) arg0);
		} else {
			local19.aLong161 = Static413.method5668() + 500L;
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)I")
	@Override
	public int method7083(@OriginalArg(0) int arg0) {
		@Pc(8) Class52 local8 = Static499.aClass241_5.method4888(arg0);
		@Pc(15) int local15 = local8.anInt1100;
		@Pc(18) int local18 = local8.anInt1098;
		@Pc(21) int local21 = local8.anInt1102;
		@Pc(28) int local28 = Class270.anIntArray547[local21 - local18];
		return local28 & this.anIntArray654[local15] >> local18;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZZ)I")
	public int method7087(@OriginalArg(1) boolean arg0) {
		@Pc(12) long local12 = Static413.method5668();
		for (@Pc(26) Class1_Sub31 local26 = arg0 ? (Class1_Sub31) this.aClass187_37.method3799() : (Class1_Sub31) this.aClass187_37.method3805(); local26 != null; local26 = (Class1_Sub31) this.aClass187_37.method3805()) {
			if ((local26.aLong161 & 0x3FFFFFFFFFFFFFFFL) < local12) {
				if ((local26.aLong161 & 0x4000000000000000L) != 0L) {
					@Pc(57) int local57 = (int) local26.aLong301;
					this.anIntArray654[local57] = this.anIntArray653[local57];
					local26.method7859();
					return local57;
				}
				local26.method7859();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IZI)V")
	public void method7088(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class52 local8 = Static499.aClass241_5.method4888(arg1);
		@Pc(11) int local11 = local8.anInt1100;
		@Pc(18) int local18 = local8.anInt1098;
		@Pc(21) int local21 = local8.anInt1102;
		@Pc(28) int local28 = Class270.anIntArray547[local21 - local18];
		if (arg0 < 0 || arg0 > local28) {
			arg0 = 0;
		}
		local28 <<= local18;
		this.method7085(local11, arg0 << local18 & local28 | ~local28 & this.anIntArray654[local11]);
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IBI)V")
	public void method7090(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class52 local16 = Static499.aClass241_5.method4888(arg1);
		@Pc(19) int local19 = local16.anInt1100;
		@Pc(22) int local22 = local16.anInt1098;
		@Pc(25) int local25 = local16.anInt1102;
		@Pc(31) int local31 = Class270.anIntArray547[local25 - local22];
		if (arg0 < 0 || local31 < arg0) {
			arg0 = 0;
		}
		local31 <<= local22;
		this.method7093(local19, local31 & arg0 << local22 | this.anIntArray653[local19] & ~local31);
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Z)V")
	public void method7091() {
		for (@Pc(7) int local7 = 0; local7 < Static409.aClass246_1.anInt6278; local7++) {
			@Pc(14) Class367 local14 = Static409.aClass246_1.method5040(local7);
			if (local14 != null && local14.anInt9662 == 0) {
				this.anIntArray653[local7] = 0;
				this.anIntArray654[local7] = 0;
			}
		}
		this.aClass187_37 = new Class187(128);
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZI)I")
	@Override
	public int method7084(@OriginalArg(1) int arg0) {
		return this.anIntArray654[arg0];
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(III)V")
	public void method7093(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray653[arg0] = arg1;
		@Pc(24) Class1_Sub31 local24 = (Class1_Sub31) this.aClass187_37.method3797((long) arg0);
		if (local24 == null) {
			local24 = new Class1_Sub31(4611686018427387905L);
			this.aClass187_37.method3795(local24, (long) arg0);
		} else if (local24.aLong161 != 4611686018427387905L) {
			local24.aLong161 = Static413.method5668() + 500L | 0x4000000000000000L;
		}
	}
}
