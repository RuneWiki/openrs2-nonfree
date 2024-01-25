import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public final class Class211 implements Interface8 {

	@OriginalMember(owner = "client!rr", name = "f", descriptor = "Lclient!wk;")
	private Class246 aClass246_26 = new Class246(128);

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "[I")
	private final int[] anIntArray1018 = new int[Static215.aClass114_1.anInt3021];

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "[I")
	public final int[] anIntArray1019 = new int[Static215.aClass114_1.anInt3021];

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(II)I")
	@Override
	public int method4464(@OriginalArg(0) int arg0) {
		@Pc(16) Class153 local16 = Static341.aClass36_1.method799(arg0);
		@Pc(19) int local19 = local16.anInt3788;
		@Pc(22) int local22 = local16.anInt3789;
		@Pc(25) int local25 = local16.anInt3786;
		@Pc(32) int local32 = Class1_Sub1_Sub1.anIntArray441[local25 - local22];
		return this.anIntArray1019[local19] >> local22 & local32;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZI)I")
	public int method4466(@OriginalArg(0) boolean arg0) {
		@Pc(13) long local13 = Static39.method699();
		for (@Pc(27) Class2_Sub36 local27 = arg0 ? (Class2_Sub36) this.aClass246_26.method5606() : (Class2_Sub36) this.aClass246_26.method5614(); local27 != null; local27 = (Class2_Sub36) this.aClass246_26.method5614()) {
			if ((local27.aLong167 & 0x3FFFFFFFFFFFFFFFL) < local13) {
				if ((local27.aLong167 & 0x4000000000000000L) != 0L) {
					@Pc(60) int local60 = (int) local27.aLong209;
					this.anIntArray1019[local60] = this.anIntArray1018[local60];
					local27.method5617();
					return local60;
				}
				local27.method5617();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(III)V")
	public void method4467(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class153 local10 = Static341.aClass36_1.method799(arg0);
		@Pc(13) int local13 = local10.anInt3788;
		@Pc(16) int local16 = local10.anInt3789;
		@Pc(19) int local19 = local10.anInt3786;
		@Pc(26) int local26 = Class1_Sub1_Sub1.anIntArray441[local19 - local16];
		if (arg1 < 0 || local26 < arg1) {
			arg1 = 0;
		}
		local26 <<= local16;
		this.method4472(local26 & arg1 << local16 | this.anIntArray1019[local13] & ~local26, local13);
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)V")
	public void method4469() {
		for (@Pc(3) int local3 = 0; local3 < Static215.aClass114_1.anInt3021; local3++) {
			@Pc(10) Class177 local10 = Static215.aClass114_1.method2843(local3);
			if (local10 != null && local10.anInt4344 == 0) {
				this.anIntArray1018[local3] = 0;
				this.anIntArray1019[local3] = 0;
			}
		}
		this.aClass246_26 = new Class246(128);
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(II)I")
	@Override
	public int method4463(@OriginalArg(1) int arg0) {
		return this.anIntArray1019[arg0];
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IBI)V")
	public void method4470(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray1018[arg0] = arg1;
		@Pc(22) Class2_Sub36 local22 = (Class2_Sub36) this.aClass246_26.method5613((long) arg0);
		if (local22 == null) {
			local22 = new Class2_Sub36(4611686018427387905L);
			this.aClass246_26.method5609(local22, (long) arg0);
		} else if (local22.aLong167 != 4611686018427387905L) {
			local22.aLong167 = Static39.method699() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(III)V")
	public void method4472(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray1019[arg1] = arg0;
		@Pc(26) Class2_Sub36 local26 = (Class2_Sub36) this.aClass246_26.method5613((long) arg1);
		if (local26 == null) {
			local26 = new Class2_Sub36(Static39.method699() + 500L);
			this.aClass246_26.method5609(local26, (long) arg1);
		} else {
			local26.aLong167 = Static39.method699() + 500L;
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIB)V")
	public void method4473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class153 local8 = Static341.aClass36_1.method799(arg0);
		@Pc(11) int local11 = local8.anInt3788;
		@Pc(22) int local22 = local8.anInt3789;
		@Pc(25) int local25 = local8.anInt3786;
		@Pc(32) int local32 = Class1_Sub1_Sub1.anIntArray441[local25 - local22];
		if (arg1 < 0 || local32 < arg1) {
			arg1 = 0;
		}
		local32 <<= local22;
		this.method4470(local11, ~local32 & this.anIntArray1018[local11] | local32 & arg1 << local22);
	}
}
