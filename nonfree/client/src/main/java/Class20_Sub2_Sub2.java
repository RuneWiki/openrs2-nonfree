import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oda")
public abstract class Class20_Sub2_Sub2 extends Class20_Sub2 {

	@OriginalMember(owner = "client!oda", name = "B", descriptor = "S")
	public short aShort122;

	@OriginalMember(owner = "client!oda", name = "D", descriptor = "S")
	public short aShort123;

	@OriginalMember(owner = "client!oda", name = "J", descriptor = "S")
	public short aShort125;

	@OriginalMember(owner = "client!oda", name = "F", descriptor = "S")
	public short aShort124;

	@OriginalMember(owner = "client!oda", name = "H", descriptor = "B")
	public final byte aByte132;

	@OriginalMember(owner = "client!oda", name = "G", descriptor = "Z")
	public final boolean aBoolean729;

	@OriginalMember(owner = "client!oda", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
	protected Class20_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) byte arg10) {
		this.aShort122 = (short) arg8;
		this.aShort123 = (short) arg7;
		super.aByte130 = (byte) arg1;
		super.anInt10729 = arg4;
		this.aShort125 = (short) arg6;
		this.aShort124 = (short) arg5;
		super.anInt10725 = arg2;
		super.anInt10724 = arg3;
		this.aByte132 = arg10;
		this.aBoolean729 = arg9;
		super.aByte131 = (byte) arg0;
	}

	@OriginalMember(owner = "client!oda", name = "m", descriptor = "(B)V")
	public void method9025() {
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(I[Lclient!raa;)I")
	@Override
	public final int method9008(@OriginalArg(1) Class6_Sub1[] arg0) {
		@Pc(7) int local7 = 0;
		@Pc(15) int local15;
		@Pc(38) int local38;
		@Pc(53) int local53;
		label113: for (@Pc(10) int local10 = this.aShort124; local10 <= this.aShort125; local10++) {
			label111: for (local15 = this.aShort123; local15 <= this.aShort122; local15++) {
				@Pc(26) long local26 = Static85.aLongArrayArrayArray1[super.aByte131][local10][local15];
				@Pc(28) long local28 = 0L;
				while (true) {
					label106: while (true) {
						if (local28 > 48L) {
							continue label111;
						}
						local38 = (int) (local26 >>> (int) local28 & 0xFFFFL);
						if (local38 <= 0) {
							continue label111;
						}
						@Pc(51) Class68 local51 = Static105.aClass68Array1[local38 - 1];
						for (local53 = 0; local53 < local7; local53++) {
							if (local51.aClass6_Sub1_1 == arg0[local53]) {
								local28 += 16L;
								continue label106;
							}
						}
						arg0[local7++] = local51.aClass6_Sub1_1;
						if (local7 == 4) {
							break label113;
						}
						local28 += 16L;
					}
				}
			}
		}
		for (local15 = local7; local15 < 4; local15++) {
			arg0[local15] = null;
		}
		if (this.aByte132 != 0) {
			local38 = this.aShort124 - Static162.anInt3371;
			@Pc(144) int local144 = this.aShort123 - Static313.anInt5975;
			@Pc(161) int local161;
			@Pc(167) short local167;
			@Pc(164) short local164;
			@Pc(156) int local156;
			if (this.aByte132 == 1) {
				if (local144 <= local38) {
					local156 = this.aShort124 - 1;
					local161 = this.aShort123 + 1;
					local164 = this.aShort124;
					local167 = this.aShort123;
				} else {
					local156 = this.aShort124 + 1;
					local164 = this.aShort124;
					local167 = this.aShort123;
					local161 = this.aShort123 - 1;
				}
			} else if (-local38 >= local144) {
				local164 = this.aShort124;
				local167 = this.aShort123;
				local161 = this.aShort123 + 1;
				local156 = this.aShort124 + 1;
			} else {
				local161 = this.aShort123 - 1;
				local156 = this.aShort124 - 1;
				local164 = this.aShort124;
				local167 = this.aShort123;
			}
			label77: for (local53 = 0; local53 < local7; local53++) {
				@Pc(242) long local242 = Static85.aLongArrayArrayArray1[super.aByte131][local164][local161];
				@Pc(253) Class68 local253;
				while (local242 != 0L) {
					local253 = Static105.aClass68Array1[(int) ((local242 & 0xFFFFL) - 1L)];
					local242 >>>= 0x10;
					if (local253.aClass6_Sub1_1 == arg0[local53]) {
						continue label77;
					}
				}
				local242 = Static85.aLongArrayArrayArray1[super.aByte131][local156][local167];
				while (local242 != 0L) {
					local253 = Static105.aClass68Array1[(int) ((local242 & 0xFFFFL) - 1L)];
					local242 >>>= 0x10;
					if (arg0[local53] == local253.aClass6_Sub1_1) {
						continue label77;
					}
				}
				for (@Pc(311) int local311 = local53; local311 < local7 - 1; local311++) {
					arg0[local311] = arg0[local311 + 1];
				}
				local7--;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!oda", name = "b", descriptor = "(Lclient!ha;I)Z")
	@Override
	public final boolean method9015(@OriginalArg(0) Class100 arg0) {
		return Static562.method8098(super.aByte130, this.aShort123, this.method9007(arg0), this.aShort125, this.aShort124, this.aShort122);
	}

	@OriginalMember(owner = "client!oda", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method9010() {
		for (@Pc(8) int local8 = this.aShort124; local8 <= this.aShort125; local8++) {
			for (@Pc(21) int local21 = this.aShort123; local21 <= this.aShort122; local21++) {
				@Pc(30) int local30 = Static197.anInt10372 + local8 - Static162.anInt3371;
				if (local30 >= 0 && Static460.aBooleanArrayArray6.length > local30) {
					@Pc(51) int local51 = local21 + Static197.anInt10372 - Static313.anInt5975;
					if (local51 >= 0 && local51 < Static460.aBooleanArrayArray6.length && Static460.aBooleanArrayArray6[local30][local51]) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
