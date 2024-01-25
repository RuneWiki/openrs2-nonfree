import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class190 implements Interface4 {

	@OriginalMember(owner = "client!or", name = "d", descriptor = "Lclient!bu;")
	private Class38 aClass38_27 = new Class38(128);

	@OriginalMember(owner = "client!or", name = "c", descriptor = "[I")
	public final int[] anIntArray520 = new int[Static204.aClass46_1.anInt1518];

	@OriginalMember(owner = "client!or", name = "j", descriptor = "[I")
	private final int[] anIntArray521 = new int[Static204.aClass46_1.anInt1518];

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IB)I")
	@Override
	public int method4299(@OriginalArg(0) int arg0) {
		@Pc(8) Class164 local8 = Static303.aClass152_1.method3461(arg0);
		@Pc(16) int local16 = local8.anInt4730;
		@Pc(19) int local19 = local8.anInt4729;
		@Pc(22) int local22 = local8.anInt4728;
		@Pc(29) int local29 = Class241.anIntArray677[local22 - local19];
		return this.anIntArray520[local16] >> local19 & local29;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(II)I")
	@Override
	public int method4300(@OriginalArg(1) int arg0) {
		return this.anIntArray520[arg0];
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IBI)V")
	public void method4302(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class164 local8 = Static303.aClass152_1.method3461(arg1);
		@Pc(11) int local11 = local8.anInt4730;
		@Pc(14) int local14 = local8.anInt4729;
		@Pc(23) int local23 = local8.anInt4728;
		@Pc(30) int local30 = Class241.anIntArray677[local23 - local14];
		if (arg0 < 0 || local30 < arg0) {
			arg0 = 0;
		}
		local30 <<= local14;
		this.method4309(~local30 & this.anIntArray520[local11] | arg0 << local14 & local30, local11);
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(IBI)V")
	public void method4304(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class164 local8 = Static303.aClass152_1.method3461(arg0);
		@Pc(11) int local11 = local8.anInt4730;
		@Pc(14) int local14 = local8.anInt4729;
		@Pc(17) int local17 = local8.anInt4728;
		@Pc(23) int local23 = Class241.anIntArray677[local17 - local14];
		if (arg1 < 0 || local23 < arg1) {
			arg1 = 0;
		}
		local23 <<= local14;
		this.method4308(local11, ~local23 & this.anIntArray521[local11] | local23 & arg1 << local14);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ZI)I")
	public int method4305(@OriginalArg(0) boolean arg0) {
		@Pc(15) long local15 = Static250.method3737();
		for (@Pc(29) Class1_Sub38 local29 = arg0 ? (Class1_Sub38) this.aClass38_27.method767() : (Class1_Sub38) this.aClass38_27.method773(); local29 != null; local29 = (Class1_Sub38) this.aClass38_27.method773()) {
			if (local15 > (local29.aLong175 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local29.aLong175 & 0x4000000000000000L) != 0L) {
					@Pc(49) int local49 = (int) local29.aLong228;
					this.anIntArray520[local49] = this.anIntArray521[local49];
					local29.method6178();
					return local49;
				}
				local29.method6178();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(B)V")
	public void method4307() {
		for (@Pc(5) int local5 = 0; local5 < Static204.aClass46_1.anInt1518; local5++) {
			@Pc(11) Class268 local11 = Static204.aClass46_1.method1072(local5);
			if (local11 != null && local11.anInt7886 == 0) {
				this.anIntArray521[local5] = 0;
				this.anIntArray520[local5] = 0;
			}
		}
		this.aClass38_27 = new Class38(128);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIB)V")
	public void method4308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray521[arg0] = arg1;
		@Pc(16) Class1_Sub38 local16 = (Class1_Sub38) this.aClass38_27.method765((long) arg0);
		if (local16 == null) {
			local16 = new Class1_Sub38(4611686018427387905L);
			this.aClass38_27.method766(local16, (long) arg0);
		} else if (local16.aLong175 != 4611686018427387905L) {
			local16.aLong175 = Static250.method3737() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(BII)V")
	public void method4309(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray520[arg1] = arg0;
		@Pc(24) Class1_Sub38 local24 = (Class1_Sub38) this.aClass38_27.method765((long) arg1);
		if (local24 == null) {
			local24 = new Class1_Sub38(Static250.method3737() + 500L);
			this.aClass38_27.method766(local24, (long) arg1);
		} else {
			local24.aLong175 = Static250.method3737() + 500L;
		}
	}
}
