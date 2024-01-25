import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bba")
public abstract class Class11_Sub1_Sub1 extends Class11_Sub1 {

	@OriginalMember(owner = "client!bba", name = "C", descriptor = "B")
	public final byte aByte94;

	@OriginalMember(owner = "client!bba", name = "L", descriptor = "S")
	public short aShort97;

	@OriginalMember(owner = "client!bba", name = "M", descriptor = "Z")
	public final boolean aBoolean497;

	@OriginalMember(owner = "client!bba", name = "B", descriptor = "S")
	public short aShort94;

	@OriginalMember(owner = "client!bba", name = "F", descriptor = "S")
	public short aShort95;

	@OriginalMember(owner = "client!bba", name = "J", descriptor = "S")
	public short aShort96;

	@OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
	protected Class11_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) byte arg10) {
		super.anInt9925 = arg2;
		this.aByte94 = arg10;
		super.anInt9930 = arg3;
		this.aShort97 = (short) arg7;
		this.aBoolean497 = arg9;
		super.aByte125 = (byte) arg1;
		super.anInt9929 = arg4;
		super.aByte124 = (byte) arg0;
		this.aShort94 = (short) arg8;
		this.aShort95 = (short) arg5;
		this.aShort96 = (short) arg6;
	}

	@OriginalMember(owner = "client!bba", name = "e", descriptor = "(I)Z")
	@Override
	public final boolean method8302() {
		return Static605.method8279(this.aShort94, this.aShort95, super.aByte125, this.aShort97, this.aShort96, this.method8315());
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "([Lclient!bh;I)I")
	@Override
	public final int method8318(@OriginalArg(0) Class2_Sub4[] arg0) {
		@Pc(7) int local7 = 0;
		@Pc(15) int local15;
		@Pc(38) int local38;
		@Pc(48) int local48;
		label112: for (@Pc(10) int local10 = this.aShort95; local10 <= this.aShort96; local10++) {
			label110: for (local15 = this.aShort97; local15 <= this.aShort94; local15++) {
				@Pc(26) long local26 = Static192.aLongArrayArrayArray1[super.aByte124][local10][local15];
				@Pc(28) long local28 = 0L;
				while (true) {
					label105: while (true) {
						if (local28 > 48L) {
							continue label110;
						}
						local38 = (int) (local26 >>> (int) local28 & 0xFFFFL);
						if (local38 <= 0) {
							continue label110;
						}
						@Pc(46) Class93 local46 = Static302.aClass93Array1[local38 - 1];
						for (local48 = 0; local48 < local7; local48++) {
							if (arg0[local48] == local46.aClass2_Sub4_3) {
								local28 += 16L;
								continue label105;
							}
						}
						arg0[local7++] = local46.aClass2_Sub4_3;
						if (local7 == 4) {
							break label112;
						}
						local28 += 16L;
					}
				}
			}
		}
		for (local15 = local7; local15 < 4; local15++) {
			arg0[local15] = null;
		}
		if (this.aByte94 != 0) {
			local38 = this.aShort95 - Static623.anInt9563;
			@Pc(131) int local131 = this.aShort97 - Static507.anInt8547;
			@Pc(146) int local146;
			@Pc(141) short local141;
			@Pc(154) short local154;
			@Pc(151) int local151;
			if (this.aByte94 == 1) {
				if (local131 > local38) {
					local141 = this.aShort97;
					local146 = this.aShort97 - 1;
					local151 = this.aShort95 + 1;
					local154 = this.aShort95;
				} else {
					local146 = this.aShort97 + 1;
					local141 = this.aShort97;
					local154 = this.aShort95;
					local151 = this.aShort95 - 1;
				}
			} else if (local131 > -local38) {
				local154 = this.aShort95;
				local146 = this.aShort97 - 1;
				local151 = this.aShort95 - 1;
				local141 = this.aShort97;
			} else {
				local154 = this.aShort95;
				local146 = this.aShort97 + 1;
				local141 = this.aShort97;
				local151 = this.aShort95 + 1;
			}
			label76: for (local48 = 0; local48 < local7; local48++) {
				@Pc(225) long local225 = Static192.aLongArrayArrayArray1[super.aByte124][local154][local146];
				@Pc(236) Class93 local236;
				while (local225 != 0L) {
					local236 = Static302.aClass93Array1[(int) ((local225 & 0xFFFFL) - 1L)];
					local225 >>>= 0x10;
					if (local236.aClass2_Sub4_3 == arg0[local48]) {
						continue label76;
					}
				}
				local225 = Static192.aLongArrayArrayArray1[super.aByte124][local151][local141];
				while (local225 != 0L) {
					local236 = Static302.aClass93Array1[(int) ((local225 & 0xFFFFL) - 1L)];
					local225 >>>= 0x10;
					if (local236.aClass2_Sub4_3 == arg0[local48]) {
						continue label76;
					}
				}
				for (@Pc(292) int local292 = local48; local292 < local7 - 1; local292++) {
					arg0[local292] = arg0[local292 + 1];
				}
				local7--;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!bba", name = "i", descriptor = "(I)V")
	public void method5637() {
	}

	@OriginalMember(owner = "client!bba", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method8314() {
		for (@Pc(8) int local8 = this.aShort95; local8 <= this.aShort96; local8++) {
			for (@Pc(21) int local21 = this.aShort97; local21 <= this.aShort94; local21++) {
				@Pc(29) int local29 = Static319.anInt5795 + local8 - Static623.anInt9563;
				if (local29 >= 0 && Static36.aBooleanArrayArray2.length > local29) {
					@Pc(51) int local51 = local21 + Static319.anInt5795 - Static507.anInt8547;
					if (local51 >= 0 && local51 < Static36.aBooleanArrayArray2.length && Static36.aBooleanArrayArray2[local29][local51]) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
