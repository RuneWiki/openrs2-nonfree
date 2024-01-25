import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class63 implements Interface23 {

	@OriginalMember(owner = "client!cl", name = "i", descriptor = "Lclient!tga;")
	private Class335 aClass335_9 = new Class335(128);

	@OriginalMember(owner = "client!cl", name = "m", descriptor = "[I")
	public final int[] anIntArray70 = new int[Static532.aClass260_1.anInt7572];

	@OriginalMember(owner = "client!cl", name = "j", descriptor = "[I")
	private final int[] anIntArray69 = new int[Static532.aClass260_1.anInt7572];

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(BI)I")
	@Override
	public int method1213(@OriginalArg(1) int arg0) {
		@Pc(8) Class274 local8 = Static480.aClass298_2.method7195(arg0);
		@Pc(16) int local16 = local8.anInt7918;
		@Pc(19) int local19 = local8.anInt7912;
		@Pc(22) int local22 = local8.anInt7914;
		@Pc(29) int local29 = Class2_Sub13.anIntArray438[local22 - local19];
		return local29 & this.anIntArray70[local16] >> local19;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)V")
	public void method1215(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray69[arg1] = arg0;
		@Pc(22) Class5_Sub50 local22 = (Class5_Sub50) this.aClass335_9.method7766((long) arg1);
		if (local22 == null) {
			local22 = new Class5_Sub50(4611686018427387905L);
			this.aClass335_9.method7770((long) arg1, local22);
		} else if (local22.aLong293 != 4611686018427387905L) {
			local22.aLong293 = Static124.method1947() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZI)I")
	public int method1217(@OriginalArg(0) boolean arg0) {
		@Pc(8) long local8 = Static124.method1947();
		for (@Pc(22) Class5_Sub50 local22 = arg0 ? (Class5_Sub50) this.aClass335_9.method7768() : (Class5_Sub50) this.aClass335_9.method7777(); local22 != null; local22 = (Class5_Sub50) this.aClass335_9.method7777()) {
			if (local8 > (local22.aLong293 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local22.aLong293 & 0x4000000000000000L) != 0L) {
					@Pc(42) int local42 = (int) local22.aLong329;
					this.anIntArray70[local42] = this.anIntArray69[local42];
					local22.method8829();
					return local42;
				}
				local22.method8829();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(III)V")
	public void method1219(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray70[arg0] = arg1;
		@Pc(21) Class5_Sub50 local21 = (Class5_Sub50) this.aClass335_9.method7766((long) arg0);
		if (local21 == null) {
			local21 = new Class5_Sub50(Static124.method1947() + 500L);
			this.aClass335_9.method7770((long) arg0, local21);
		} else {
			local21.aLong293 = Static124.method1947() + 500L;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
	public void method1220() {
		for (@Pc(9) int local9 = 0; local9 < Static532.aClass260_1.anInt7572; local9++) {
			@Pc(15) Class229 local15 = Static532.aClass260_1.method6449(local9);
			if (local15 != null && local15.anInt6240 == 0) {
				this.anIntArray69[local9] = 0;
				this.anIntArray70[local9] = 0;
			}
		}
		this.aClass335_9 = new Class335(128);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIZ)V")
	public void method1222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class274 local8 = Static480.aClass298_2.method7195(arg0);
		@Pc(11) int local11 = local8.anInt7918;
		@Pc(19) int local19 = local8.anInt7912;
		@Pc(22) int local22 = local8.anInt7914;
		@Pc(29) int local29 = Class2_Sub13.anIntArray438[local22 - local19];
		if (arg1 < 0 || local29 < arg1) {
			arg1 = 0;
		}
		local29 <<= local19;
		this.method1219(local11, ~local29 & this.anIntArray70[local11] | arg1 << local19 & local29);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)I")
	@Override
	public int method1214(@OriginalArg(0) int arg0) {
		return this.anIntArray70[arg0];
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIB)V")
	public void method1225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class274 local8 = Static480.aClass298_2.method7195(arg0);
		@Pc(11) int local11 = local8.anInt7918;
		@Pc(14) int local14 = local8.anInt7912;
		@Pc(17) int local17 = local8.anInt7914;
		@Pc(27) int local27 = Class2_Sub13.anIntArray438[local17 - local14];
		if (arg1 < 0 || local27 < arg1) {
			arg1 = 0;
		}
		local27 <<= local14;
		this.method1215(arg1 << local14 & local27 | ~local27 & this.anIntArray69[local11], local11);
	}
}
