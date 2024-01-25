import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iaa")
public abstract class Class25_Sub2_Sub2 extends Class25_Sub2 {

	@OriginalMember(owner = "client!iaa", name = "v", descriptor = "S")
	public short aShort106;

	@OriginalMember(owner = "client!iaa", name = "H", descriptor = "Z")
	public final boolean aBoolean576;

	@OriginalMember(owner = "client!iaa", name = "E", descriptor = "B")
	public final byte aByte119;

	@OriginalMember(owner = "client!iaa", name = "B", descriptor = "S")
	public short aShort109;

	@OriginalMember(owner = "client!iaa", name = "A", descriptor = "S")
	public short aShort108;

	@OriginalMember(owner = "client!iaa", name = "z", descriptor = "S")
	public short aShort107;

	@OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
	protected Class25_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) byte arg10) {
		this.aShort106 = (short) arg5;
		super.aByte117 = (byte) arg0;
		this.aBoolean576 = arg9;
		this.aByte119 = arg10;
		this.aShort109 = (short) arg8;
		this.aShort108 = (short) arg6;
		super.anInt8482 = arg4;
		super.anInt8480 = arg3;
		this.aShort107 = (short) arg7;
		super.anInt8476 = arg2;
		super.aByte118 = (byte) arg1;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(B[Lclient!cp;)I")
	@Override
	public final int method6658(@OriginalArg(1) Class3_Sub9[] arg0) {
		@Pc(7) int local7 = 0;
		@Pc(15) int local15;
		@Pc(38) int local38;
		@Pc(53) int local53;
		label113: for (@Pc(10) int local10 = this.aShort106; local10 <= this.aShort108; local10++) {
			label111: for (local15 = this.aShort107; local15 <= this.aShort109; local15++) {
				@Pc(26) long local26 = Static31.aLongArrayArrayArray1[super.aByte117][local10][local15];
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
						@Pc(51) Class235 local51 = Static196.aClass235Array1[local38 - 1];
						for (local53 = 0; local53 < local7; local53++) {
							if (local51.aClass3_Sub9_2 == arg0[local53]) {
								local28 += 16L;
								continue label106;
							}
						}
						arg0[local7++] = local51.aClass3_Sub9_2;
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
		if (this.aByte119 != 0) {
			local38 = this.aShort106 - Static261.anInt5023;
			@Pc(134) int local134 = this.aShort107 - Static216.anInt4499;
			@Pc(152) int local152;
			@Pc(160) short local160;
			@Pc(163) short local163;
			@Pc(157) int local157;
			if (this.aByte119 == 1) {
				if (local38 >= local134) {
					local152 = this.aShort107 + 1;
					local157 = this.aShort106 - 1;
					local160 = this.aShort107;
					local163 = this.aShort106;
				} else {
					local160 = this.aShort107;
					local152 = this.aShort107 - 1;
					local163 = this.aShort106;
					local157 = this.aShort106 + 1;
				}
			} else if (local134 <= -local38) {
				local152 = this.aShort107 + 1;
				local163 = this.aShort106;
				local157 = this.aShort106 + 1;
				local160 = this.aShort107;
			} else {
				local157 = this.aShort106 - 1;
				local160 = this.aShort107;
				local152 = this.aShort107 - 1;
				local163 = this.aShort106;
			}
			label77: for (local53 = 0; local53 < local7; local53++) {
				@Pc(234) long local234 = Static31.aLongArrayArrayArray1[super.aByte117][local163][local152];
				@Pc(245) Class235 local245;
				while (local234 != 0L) {
					local245 = Static196.aClass235Array1[(int) ((local234 & 0xFFFFL) - 1L)];
					local234 >>>= 0x10;
					if (local245.aClass3_Sub9_2 == arg0[local53]) {
						continue label77;
					}
				}
				local234 = Static31.aLongArrayArrayArray1[super.aByte117][local157][local160];
				while (local234 != 0L) {
					local245 = Static196.aClass235Array1[(int) ((local234 & 0xFFFFL) - 1L)];
					local234 >>>= 0x10;
					if (local245.aClass3_Sub9_2 == arg0[local53]) {
						continue label77;
					}
				}
				for (@Pc(303) int local303 = local53; local303 < local7 - 1; local303++) {
					arg0[local303] = arg0[local303 + 1];
				}
				local7--;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!iaa", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method6651() {
		return Static208.method3559(super.aByte118, this.aShort106, this.aShort108, this.aShort109, this.aShort107, this.method6652());
	}

	@OriginalMember(owner = "client!iaa", name = "e", descriptor = "(I)Z")
	@Override
	public final boolean method6646() {
		for (@Pc(8) int local8 = this.aShort106; local8 <= this.aShort108; local8++) {
			for (@Pc(18) int local18 = this.aShort107; local18 <= this.aShort109; local18++) {
				@Pc(26) int local26 = Static219.anInt4585 + local8 - Static261.anInt5023;
				if (local26 >= 0 && Static209.aBooleanArrayArray11.length > local26) {
					@Pc(44) int local44 = Static219.anInt4585 + local18 - Static216.anInt4499;
					if (local44 >= 0 && local44 < Static209.aBooleanArrayArray11.length && Static209.aBooleanArrayArray11[local26][local44]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Z)V")
	public void method6661() {
	}
}
