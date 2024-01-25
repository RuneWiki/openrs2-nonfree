import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public abstract class Class4_Sub2_Sub1 extends Class4_Sub2 {

	@OriginalMember(owner = "client!vp", name = "A", descriptor = "B")
	public final byte aByte124;

	@OriginalMember(owner = "client!vp", name = "B", descriptor = "S")
	public short aShort107;

	@OriginalMember(owner = "client!vp", name = "E", descriptor = "S")
	public short aShort108;

	@OriginalMember(owner = "client!vp", name = "I", descriptor = "S")
	public short aShort110;

	@OriginalMember(owner = "client!vp", name = "C", descriptor = "Z")
	public final boolean aBoolean678;

	@OriginalMember(owner = "client!vp", name = "F", descriptor = "S")
	public short aShort109;

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
	protected Class4_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) byte arg10) {
		this.aByte124 = arg10;
		this.aShort107 = (short) arg5;
		super.aByte131 = (byte) arg1;
		super.anInt10231 = arg2;
		this.aShort108 = (short) arg7;
		this.aShort110 = (short) arg8;
		super.aByte132 = (byte) arg0;
		this.aBoolean678 = arg9;
		super.anInt10228 = arg3;
		this.aShort109 = (short) arg6;
		super.anInt10229 = arg4;
	}

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "(B)Z")
	@Override
	public final boolean method8717() {
		for (@Pc(13) int local13 = this.aShort107; local13 <= this.aShort109; local13++) {
			for (@Pc(18) int local18 = this.aShort108; local18 <= this.aShort110; local18++) {
				@Pc(27) int local27 = Static51.anInt1064 + local13 - Static260.anInt4712;
				if (local27 >= 0 && Static475.aBooleanArrayArray8.length > local27) {
					@Pc(49) int local49 = local18 + Static51.anInt1064 - Static598.anInt10044;
					if (local49 >= 0 && local49 < Static475.aBooleanArrayArray8.length && Static475.aBooleanArrayArray8[local27][local49]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "([Lclient!vt;I)I")
	@Override
	public final int method8729(@OriginalArg(0) Class5_Sub11[] arg0) {
		@Pc(7) int local7 = 0;
		@Pc(18) int local18;
		@Pc(41) int local41;
		@Pc(53) int local53;
		label113: for (@Pc(10) int local10 = this.aShort107; local10 <= this.aShort109; local10++) {
			label111: for (local18 = this.aShort108; local18 <= this.aShort110; local18++) {
				@Pc(29) long local29 = Static26.aLongArrayArrayArray1[super.aByte132][local10][local18];
				@Pc(31) long local31 = 0L;
				while (true) {
					label106: while (true) {
						if (local31 > 48L) {
							continue label111;
						}
						local41 = (int) (local29 >>> (int) local31 & 0xFFFFL);
						if (local41 <= 0) {
							continue label111;
						}
						@Pc(51) Class174 local51 = Static278.aClass174Array1[local41 - 1];
						for (local53 = 0; local53 < local7; local53++) {
							if (arg0[local53] == local51.aClass5_Sub11_2) {
								local31 += 16L;
								continue label106;
							}
						}
						arg0[local7++] = local51.aClass5_Sub11_2;
						if (local7 == 4) {
							break label113;
						}
						local31 += 16L;
					}
				}
			}
		}
		for (local18 = local7; local18 < 4; local18++) {
			arg0[local18] = null;
		}
		if (this.aByte124 != 0) {
			local41 = this.aShort107 - Static260.anInt4712;
			@Pc(134) int local134 = this.aShort108 - Static598.anInt10044;
			@Pc(150) int local150;
			@Pc(153) short local153;
			@Pc(161) short local161;
			@Pc(158) int local158;
			if (this.aByte124 == 1) {
				if (local134 > local41) {
					local150 = this.aShort108 - 1;
					local153 = this.aShort108;
					local158 = this.aShort107 + 1;
					local161 = this.aShort107;
				} else {
					local153 = this.aShort108;
					local158 = this.aShort107 - 1;
					local161 = this.aShort107;
					local150 = this.aShort108 + 1;
				}
			} else if (-local41 >= local134) {
				local153 = this.aShort108;
				local158 = this.aShort107 + 1;
				local150 = this.aShort108 + 1;
				local161 = this.aShort107;
			} else {
				local150 = this.aShort108 - 1;
				local161 = this.aShort107;
				local153 = this.aShort108;
				local158 = this.aShort107 - 1;
			}
			label77: for (local53 = 0; local53 < local7; local53++) {
				@Pc(232) long local232 = Static26.aLongArrayArrayArray1[super.aByte132][local161][local150];
				@Pc(243) Class174 local243;
				while (local232 != 0L) {
					local243 = Static278.aClass174Array1[(int) ((local232 & 0xFFFFL) - 1L)];
					local232 >>>= 0x10;
					if (local243.aClass5_Sub11_2 == arg0[local53]) {
						continue label77;
					}
				}
				local232 = Static26.aLongArrayArrayArray1[super.aByte132][local158][local153];
				while (local232 != 0L) {
					local243 = Static278.aClass174Array1[(int) ((local232 & 0xFFFFL) - 1L)];
					local232 >>>= 0x10;
					if (arg0[local53] == local243.aClass5_Sub11_2) {
						continue label77;
					}
				}
				for (@Pc(299) int local299 = local53; local299 < local7 - 1; local299++) {
					arg0[local299] = arg0[local299 + 1];
				}
				local7--;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method8714(@OriginalArg(1) Class133 arg0) {
		return Static335.method5013(super.aByte131, this.aShort107, this.aShort109, this.aShort110, this.aShort108, this.method8720(arg0));
	}

	@OriginalMember(owner = "client!vp", name = "l", descriptor = "(I)V")
	public void method8165() {
	}
}
