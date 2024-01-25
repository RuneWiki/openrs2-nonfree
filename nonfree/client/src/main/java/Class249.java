import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class249 implements Interface9 {

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "Lclient!qh;")
	private Class199 aClass199_177 = new Class199(128);

	@OriginalMember(owner = "client!vc", name = "k", descriptor = "[I")
	private final int[] anIntArray474 = new int[Static208.aClass151_1.anInt4434];

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "[I")
	public final int[] anIntArray473 = new int[Static208.aClass151_1.anInt4434];

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)V")
	public void method5596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray474[arg0] = arg1;
		@Pc(24) Class1_Sub22 local24 = (Class1_Sub22) this.aClass199_177.method4387((long) arg0);
		if (local24 == null) {
			local24 = new Class1_Sub22(4611686018427387905L);
			this.aClass199_177.method4383((long) arg0, local24);
		} else if (local24.aLong96 != 4611686018427387905L) {
			local24.aLong96 = Static27.method359() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
	public void method5598() {
		for (@Pc(7) int local7 = 0; local7 < Static208.aClass151_1.anInt4434; local7++) {
			@Pc(14) Class203 local14 = Static208.aClass151_1.method3512(local7);
			if (local14 != null && local14.anInt5696 == 0) {
				this.anIntArray474[local7] = 0;
				this.anIntArray473[local7] = 0;
			}
		}
		this.aClass199_177 = new Class199(128);
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(III)V")
	public void method5600(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray473[arg0] = arg1;
		@Pc(16) Class1_Sub22 local16 = (Class1_Sub22) this.aClass199_177.method4387((long) arg0);
		if (local16 == null) {
			local16 = new Class1_Sub22(Static27.method359() + 500L);
			this.aClass199_177.method4383((long) arg0, local16);
		} else {
			local16.aLong96 = Static27.method359() + 500L;
		}
	}

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "(III)V")
	public void method5601(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class46 local8 = Static82.aClass105_4.method2293(arg0);
		@Pc(11) int local11 = local8.anInt1188;
		@Pc(14) int local14 = local8.anInt1186;
		@Pc(17) int local17 = local8.anInt1190;
		@Pc(23) int local23 = Class182.anIntArray335[local17 - local14];
		if (arg1 < 0 || arg1 > local23) {
			arg1 = 0;
		}
		local23 <<= local14;
		this.method5596(local11, this.anIntArray474[local11] & ~local23 | arg1 << local14 & local23);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)I")
	@Override
	public int method5593(@OriginalArg(0) int arg0) {
		return this.anIntArray473[arg0];
	}

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "(III)V")
	public void method5603(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class46 local8 = Static82.aClass105_4.method2293(arg0);
		@Pc(11) int local11 = local8.anInt1188;
		@Pc(14) int local14 = local8.anInt1186;
		@Pc(17) int local17 = local8.anInt1190;
		@Pc(23) int local23 = Class182.anIntArray335[local17 - local14];
		if (arg1 < 0 || arg1 > local23) {
			arg1 = 0;
		}
		local23 <<= local14;
		this.method5600(local11, ~local23 & this.anIntArray473[local11] | local23 & arg1 << local14);
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)I")
	@Override
	public int method5594(@OriginalArg(1) int arg0) {
		@Pc(12) Class46 local12 = Static82.aClass105_4.method2293(arg0);
		@Pc(15) int local15 = local12.anInt1188;
		@Pc(18) int local18 = local12.anInt1186;
		@Pc(21) int local21 = local12.anInt1190;
		@Pc(28) int local28 = Class182.anIntArray335[local21 - local18];
		return this.anIntArray473[local15] >> local18 & local28;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(BZ)I")
	public int method5604(@OriginalArg(1) boolean arg0) {
		@Pc(8) long local8 = Static27.method359();
		for (@Pc(30) Class1_Sub22 local30 = arg0 ? (Class1_Sub22) this.aClass199_177.method4392() : (Class1_Sub22) this.aClass199_177.method4393(); local30 != null; local30 = (Class1_Sub22) this.aClass199_177.method4393()) {
			if ((local30.aLong96 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local30.aLong96 & 0x4000000000000000L) != 0L) {
					@Pc(52) int local52 = (int) local30.aLong230;
					this.anIntArray473[local52] = this.anIntArray474[local52];
					local30.method5915();
					return local52;
				}
				local30.method5915();
			}
		}
		return -1;
	}
}
