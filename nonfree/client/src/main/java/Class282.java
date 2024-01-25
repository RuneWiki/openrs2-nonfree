import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class282 implements Interface15 {

	@OriginalMember(owner = "client!ph", name = "k", descriptor = "Lclient!si;")
	private Class335 aClass335_30 = new Class335(128);

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "[I")
	private final int[] anIntArray411 = new int[Static288.aClass187_1.anInt5395];

	@OriginalMember(owner = "client!ph", name = "m", descriptor = "[I")
	public final int[] anIntArray412 = new int[Static288.aClass187_1.anInt5395];

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)I")
	@Override
	public int method7361(@OriginalArg(1) int arg0) {
		return this.anIntArray412[arg0];
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)V")
	public void method7362(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class224 local8 = Static395.aClass140_1.method4039(arg0);
		@Pc(11) int local11 = local8.anInt6799;
		@Pc(14) int local14 = local8.anInt6798;
		@Pc(17) int local17 = local8.anInt6796;
		@Pc(23) int local23 = Class85.anIntArray146[local17 - local14];
		if (arg1 < 0 || local23 < arg1) {
			arg1 = 0;
		}
		local23 <<= local14;
		this.method7369(local11, local23 & arg1 << local14 | this.anIntArray411[local11] & ~local23);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IZI)V")
	public void method7364(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class224 local12 = Static395.aClass140_1.method4039(arg1);
		@Pc(15) int local15 = local12.anInt6799;
		@Pc(18) int local18 = local12.anInt6798;
		@Pc(21) int local21 = local12.anInt6796;
		@Pc(28) int local28 = Class85.anIntArray146[local21 - local18];
		if (arg0 < 0 || arg0 > local28) {
			arg0 = 0;
		}
		local28 <<= local18;
		this.method7367(local15, this.anIntArray412[local15] & ~local28 | arg0 << local18 & local28);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
	public void method7366() {
		for (@Pc(7) int local7 = 0; local7 < Static288.aClass187_1.anInt5395; local7++) {
			@Pc(14) Class111 local14 = Static288.aClass187_1.method4891(local7);
			if (local14 != null && local14.anInt3605 == 0) {
				this.anIntArray411[local7] = 0;
				this.anIntArray412[local7] = 0;
			}
		}
		this.aClass335_30 = new Class335(128);
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(III)V")
	public void method7367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray412[arg0] = arg1;
		@Pc(25) Class2_Sub17 local25 = (Class2_Sub17) this.aClass335_30.method8357((long) arg0);
		if (local25 == null) {
			local25 = new Class2_Sub17(Static99.method1701() + 500L);
			this.aClass335_30.method8356(local25, (long) arg0);
		} else {
			local25.aLong54 = Static99.method1701() + 500L;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BI)I")
	@Override
	public int method7360(@OriginalArg(1) int arg0) {
		@Pc(8) Class224 local8 = Static395.aClass140_1.method4039(arg0);
		@Pc(11) int local11 = local8.anInt6799;
		@Pc(19) int local19 = local8.anInt6798;
		@Pc(22) int local22 = local8.anInt6796;
		@Pc(29) int local29 = Class85.anIntArray146[local22 - local19];
		return local29 & this.anIntArray412[local11] >> local19;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZB)I")
	public int method7368(@OriginalArg(0) boolean arg0) {
		@Pc(8) long local8 = Static99.method1701();
		for (@Pc(30) Class2_Sub17 local30 = arg0 ? (Class2_Sub17) this.aClass335_30.method8358() : (Class2_Sub17) this.aClass335_30.method8355(); local30 != null; local30 = (Class2_Sub17) this.aClass335_30.method8355()) {
			if (local8 > (local30.aLong54 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local30.aLong54 & 0x4000000000000000L) != 0L) {
					@Pc(59) int local59 = (int) local30.aLong313;
					this.anIntArray412[local59] = this.anIntArray411[local59];
					local30.method9825();
					return local59;
				}
				local30.method9825();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IBI)V")
	public void method7369(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray411[arg0] = arg1;
		@Pc(26) Class2_Sub17 local26 = (Class2_Sub17) this.aClass335_30.method8357((long) arg0);
		if (local26 == null) {
			local26 = new Class2_Sub17(4611686018427387905L);
			this.aClass335_30.method8356(local26, (long) arg0);
		} else if (local26.aLong54 != 4611686018427387905L) {
			local26.aLong54 = Static99.method1701() + 500L | 0x4000000000000000L;
		}
	}
}
