import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class173 implements Interface17 {

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "[C")
	private static final char[] aCharArray4 = new char[64];

	@OriginalMember(owner = "client!ka", name = "n", descriptor = "Lclient!mo;")
	private Class221 aClass221_15 = new Class221(128);

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "[I")
	private final int[] anIntArray285 = new int[Static152.aClass290_1.anInt8646];

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "[I")
	public final int[] anIntArray284 = new int[Static152.aClass290_1.anInt8646];

	static {
		for (@Pc(6) int local6 = 0; local6 < 26; local6++) {
			aCharArray4[local6] = (char) (local6 + 65);
		}
		for (@Pc(20) int local20 = 26; local20 < 52; local20++) {
			aCharArray4[local20] = (char) (local20 + 97 - 26);
		}
		for (@Pc(38) int local38 = 52; local38 < 62; local38++) {
			aCharArray4[local38] = (char) (local38 + 48 - 52);
		}
		aCharArray4[63] = '-';
		aCharArray4[62] = '*';
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
	public void method4070() {
		for (@Pc(11) int local11 = 0; local11 < Static152.aClass290_1.anInt8646; local11++) {
			@Pc(18) Class137 local18 = Static152.aClass290_1.method6668(local11);
			if (local18 != null && local18.anInt3893 == 0) {
				this.anIntArray285[local11] = 0;
				this.anIntArray284[local11] = 0;
			}
		}
		this.aClass221_15 = new Class221(128);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIB)V")
	public void method4071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class207 local14 = Static420.aClass60_1.method1598(arg1);
		@Pc(17) int local17 = local14.anInt6233;
		@Pc(20) int local20 = local14.anInt6232;
		@Pc(23) int local23 = local14.anInt6230;
		@Pc(30) int local30 = Class206.anIntArray344[local23 - local20];
		if (arg0 < 0 || local30 < arg0) {
			arg0 = 0;
		}
		local30 <<= local20;
		this.method4073(this.anIntArray284[local17] & ~local30 | arg0 << local20 & local30, local17);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZI)I")
	@Override
	public int method4068(@OriginalArg(1) int arg0) {
		return this.anIntArray284[arg0];
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)I")
	@Override
	public int method4069(@OriginalArg(1) int arg0) {
		@Pc(13) Class207 local13 = Static420.aClass60_1.method1598(arg0);
		@Pc(16) int local16 = local13.anInt6233;
		@Pc(19) int local19 = local13.anInt6232;
		@Pc(22) int local22 = local13.anInt6230;
		@Pc(29) int local29 = Class206.anIntArray344[local22 - local19];
		return local29 & this.anIntArray284[local16] >> local19;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)V")
	public void method4073(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray284[arg1] = arg0;
		@Pc(24) Class4_Sub33 local24 = (Class4_Sub33) this.aClass221_15.method5075((long) arg1);
		if (local24 == null) {
			local24 = new Class4_Sub33(Static112.method2047() + 500L);
			this.aClass221_15.method5073(local24, (long) arg1);
		} else {
			local24.aLong180 = Static112.method2047() + 500L;
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(ZI)I")
	public int method4074(@OriginalArg(0) boolean arg0) {
		@Pc(8) long local8 = Static112.method2047();
		for (@Pc(24) Class4_Sub33 local24 = arg0 ? (Class4_Sub33) this.aClass221_15.method5072() : (Class4_Sub33) this.aClass221_15.method5071(); local24 != null; local24 = (Class4_Sub33) this.aClass221_15.method5071()) {
			if ((local24.aLong180 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local24.aLong180 & 0x4000000000000000L) != 0L) {
					@Pc(48) int local48 = (int) local24.aLong295;
					this.anIntArray284[local48] = this.anIntArray285[local48];
					local24.method8193();
					return local48;
				}
				local24.method8193();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(III)V")
	public void method4075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class207 local8 = Static420.aClass60_1.method1598(arg0);
		@Pc(11) int local11 = local8.anInt6233;
		@Pc(14) int local14 = local8.anInt6232;
		@Pc(23) int local23 = local8.anInt6230;
		@Pc(30) int local30 = Class206.anIntArray344[local23 - local14];
		if (arg1 < 0 || arg1 > local30) {
			arg1 = 0;
		}
		local30 <<= local14;
		this.method4077(this.anIntArray285[local11] & ~local30 | arg1 << local14 & local30, local11);
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(III)V")
	public void method4077(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray285[arg1] = arg0;
		@Pc(21) Class4_Sub33 local21 = (Class4_Sub33) this.aClass221_15.method5075((long) arg1);
		if (local21 == null) {
			local21 = new Class4_Sub33(4611686018427387905L);
			this.aClass221_15.method5073(local21, (long) arg1);
		} else if (local21.aLong180 != 4611686018427387905L) {
			local21.aLong180 = Static112.method2047() + 500L | 0x4000000000000000L;
		}
	}
}
