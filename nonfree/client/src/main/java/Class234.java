import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oca")
public final class Class234 implements Interface15 {

	@OriginalMember(owner = "client!oca", name = "c", descriptor = "[C")
	public static final char[] aCharArray7 = new char[64];

	@OriginalMember(owner = "client!oca", name = "i", descriptor = "Lclient!tq;")
	private Class305 aClass305_29 = new Class305(128);

	@OriginalMember(owner = "client!oca", name = "j", descriptor = "[I")
	public final int[] anIntArray491 = new int[Static329.aClass294_1.anInt8756];

	@OriginalMember(owner = "client!oca", name = "e", descriptor = "[I")
	private final int[] anIntArray490 = new int[Static329.aClass294_1.anInt8756];

	static {
		for (@Pc(4) int local4 = 0; local4 < 26; local4++) {
			aCharArray7[local4] = (char) (local4 + 65);
		}
		for (@Pc(20) int local20 = 26; local20 < 52; local20++) {
			aCharArray7[local20] = (char) (local20 + 71);
		}
		for (@Pc(34) int local34 = 52; local34 < 62; local34++) {
			aCharArray7[local34] = (char) (local34 + 48 - 52);
		}
		aCharArray7[63] = '/';
		aCharArray7[62] = '+';
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(IIB)V")
	public void method5832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray491[arg1] = arg0;
		@Pc(16) Class6_Sub31 local16 = (Class6_Sub31) this.aClass305_29.method7447((long) arg1);
		if (local16 == null) {
			local16 = new Class6_Sub31(Static174.method3502() + 500L);
			this.aClass305_29.method7448((long) arg1, local16);
		} else {
			local16.aLong111 = Static174.method3502() + 500L;
		}
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(BII)V")
	public void method5833(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class126 local8 = Static177.aClass171_1.method4473(arg1);
		@Pc(11) int local11 = local8.anInt4078;
		@Pc(14) int local14 = local8.anInt4080;
		@Pc(17) int local17 = local8.anInt4077;
		@Pc(32) int local32 = Class132_Sub1.anIntArray276[local17 - local14];
		if (arg0 < 0 || arg0 > local32) {
			arg0 = 0;
		}
		local32 <<= local14;
		this.method5832(local32 & arg0 << local14 | ~local32 & this.anIntArray491[local11], local11);
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(III)V")
	public void method5834(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray490[arg1] = arg0;
		@Pc(24) Class6_Sub31 local24 = (Class6_Sub31) this.aClass305_29.method7447((long) arg1);
		if (local24 == null) {
			local24 = new Class6_Sub31(4611686018427387905L);
			this.aClass305_29.method7448((long) arg1, local24);
		} else if (local24.aLong111 != 4611686018427387905L) {
			local24.aLong111 = Static174.method3502() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Z)V")
	public void method5835() {
		for (@Pc(7) int local7 = 0; local7 < Static329.aClass294_1.anInt8756; local7++) {
			@Pc(14) Class208 local14 = Static329.aClass294_1.method7334(local7);
			if (local14 != null && local14.anInt5846 == 0) {
				this.anIntArray490[local7] = 0;
				this.anIntArray491[local7] = 0;
			}
		}
		this.aClass305_29 = new Class305(128);
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(IB)I")
	@Override
	public int method5829(@OriginalArg(0) int arg0) {
		@Pc(8) Class126 local8 = Static177.aClass171_1.method4473(arg0);
		@Pc(16) int local16 = local8.anInt4078;
		@Pc(19) int local19 = local8.anInt4080;
		@Pc(22) int local22 = local8.anInt4077;
		@Pc(29) int local29 = Class132_Sub1.anIntArray276[local22 - local19];
		return local29 & this.anIntArray491[local16] >> local19;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(ZB)I")
	public int method5836(@OriginalArg(0) boolean arg0) {
		@Pc(13) long local13 = Static174.method3502();
		for (@Pc(27) Class6_Sub31 local27 = arg0 ? (Class6_Sub31) this.aClass305_29.method7445() : (Class6_Sub31) this.aClass305_29.method7449(); local27 != null; local27 = (Class6_Sub31) this.aClass305_29.method7449()) {
			if (local13 > (local27.aLong111 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local27.aLong111 & 0x4000000000000000L) != 0L) {
					@Pc(49) int local49 = (int) local27.aLong252;
					this.anIntArray491[local49] = this.anIntArray490[local49];
					local27.method8151();
					return local49;
				}
				local27.method8151();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(II)I")
	@Override
	public int method5828(@OriginalArg(0) int arg0) {
		return this.anIntArray491[arg0];
	}

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "(III)V")
	public void method5837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class126 local8 = Static177.aClass171_1.method4473(arg1);
		@Pc(11) int local11 = local8.anInt4078;
		@Pc(19) int local19 = local8.anInt4080;
		@Pc(22) int local22 = local8.anInt4077;
		@Pc(29) int local29 = Class132_Sub1.anIntArray276[local22 - local19];
		if (arg0 < 0 || local29 < arg0) {
			arg0 = 0;
		}
		local29 <<= local19;
		this.method5834(local29 & arg0 << local19 | this.anIntArray490[local11] & ~local29, local11);
	}
}
