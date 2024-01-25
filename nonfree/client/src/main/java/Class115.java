import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class115 implements Interface4 {

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "Lclient!wb;")
	private Class243 aClass243_12 = new Class243(128);

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "[I")
	public final int[] anIntArray257 = new int[Static179.aClass204_1.anInt5672];

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "[I")
	private final int[] anIntArray258 = new int[Static179.aClass204_1.anInt5672];

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)I")
	@Override
	public int method2775(@OriginalArg(0) int arg0) {
		return this.anIntArray257[arg0];
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIZ)V")
	public void method2776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class250 local8 = Static19.aClass132_1.method3438(arg0);
		@Pc(17) int local17 = local8.anInt7090;
		@Pc(20) int local20 = local8.anInt7095;
		@Pc(23) int local23 = local8.anInt7088;
		@Pc(30) int local30 = Class164.anIntArray386[local23 - local20];
		if (arg1 < 0 || arg1 > local30) {
			arg1 = 0;
		}
		local30 <<= local20;
		this.method2780(~local30 & this.anIntArray257[local17] | local30 & arg1 << local20, local17);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BZ)I")
	public int method2777(@OriginalArg(1) boolean arg0) {
		@Pc(8) long local8 = Static101.method1805();
		for (@Pc(30) Class2_Sub9 local30 = arg0 ? (Class2_Sub9) this.aClass243_12.method5975() : (Class2_Sub9) this.aClass243_12.method5973(); local30 != null; local30 = (Class2_Sub9) this.aClass243_12.method5973()) {
			if ((local30.aLong31 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local30.aLong31 & 0x4000000000000000L) != 0L) {
					@Pc(61) int local61 = (int) local30.aLong213;
					this.anIntArray257[local61] = this.anIntArray258[local61];
					local30.method6130();
					return local61;
				}
				local30.method6130();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)I")
	@Override
	public int method2774(@OriginalArg(0) int arg0) {
		@Pc(8) Class250 local8 = Static19.aClass132_1.method3438(arg0);
		@Pc(16) int local16 = local8.anInt7090;
		@Pc(19) int local19 = local8.anInt7095;
		@Pc(22) int local22 = local8.anInt7088;
		@Pc(28) int local28 = Class164.anIntArray386[local22 - local19];
		return local28 & this.anIntArray257[local16] >> local19;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V")
	public void method2779(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class250 local8 = Static19.aClass132_1.method3438(arg1);
		@Pc(11) int local11 = local8.anInt7090;
		@Pc(18) int local18 = local8.anInt7095;
		@Pc(21) int local21 = local8.anInt7088;
		@Pc(28) int local28 = Class164.anIntArray386[local21 - local18];
		if (arg0 < 0 || arg0 > local28) {
			arg0 = 0;
		}
		local28 <<= local18;
		this.method2781(local11, arg0 << local18 & local28 | this.anIntArray258[local11] & ~local28);
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(III)V")
	public void method2780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray257[arg1] = arg0;
		@Pc(21) Class2_Sub9 local21 = (Class2_Sub9) this.aClass243_12.method5967((long) arg1);
		if (local21 == null) {
			local21 = new Class2_Sub9(Static101.method1805() + 500L);
			this.aClass243_12.method5968((long) arg1, local21);
		} else {
			local21.aLong31 = Static101.method1805() + 500L;
		}
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(III)V")
	public void method2781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray258[arg0] = arg1;
		@Pc(24) Class2_Sub9 local24 = (Class2_Sub9) this.aClass243_12.method5967((long) arg0);
		if (local24 == null) {
			local24 = new Class2_Sub9(4611686018427387905L);
			this.aClass243_12.method5968((long) arg0, local24);
		} else if (local24.aLong31 != 4611686018427387905L) {
			local24.aLong31 = Static101.method1805() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
	public void method2783() {
		for (@Pc(11) int local11 = 0; local11 < Static179.aClass204_1.anInt5672; local11++) {
			@Pc(20) Class95 local20 = Static179.aClass204_1.method5029(local11);
			if (local20 != null && local20.anInt2853 == 0) {
				this.anIntArray258[local11] = 0;
				this.anIntArray257[local11] = 0;
			}
		}
		this.aClass243_12 = new Class243(128);
	}
}
