import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public abstract class Class12_Sub2_Sub2 extends Class12_Sub2 {

	@OriginalMember(owner = "client!it", name = "F", descriptor = "S")
	public short aShort110;

	@OriginalMember(owner = "client!it", name = "J", descriptor = "S")
	public short aShort111;

	@OriginalMember(owner = "client!it", name = "M", descriptor = "S")
	public short aShort112;

	@OriginalMember(owner = "client!it", name = "B", descriptor = "S")
	public short aShort109;

	@OriginalMember(owner = "client!it", name = "L", descriptor = "B")
	public final byte aByte143;

	@OriginalMember(owner = "client!it", name = "A", descriptor = "Z")
	public final boolean aBoolean738;

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
	protected Class12_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) byte arg10) {
		super.aByte146 = (byte) arg0;
		this.aShort110 = (short) arg7;
		this.aShort111 = (short) arg5;
		super.anInt10997 = arg3;
		this.aShort112 = (short) arg6;
		this.aShort109 = (short) arg8;
		this.aByte143 = arg10;
		this.aBoolean738 = arg9;
		super.aByte145 = (byte) arg1;
		super.anInt11002 = arg4;
		super.anInt10998 = arg2;
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method9155(@OriginalArg(1) Class137 arg0) {
		return Static406.method6038(this.aShort111, this.method9156(arg0), this.aShort112, this.aShort110, super.aByte145, this.aShort109);
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(I[Lclient!qm;)I")
	@Override
	public final int method9165(@OriginalArg(1) Class14_Sub37[] arg0) {
		@Pc(7) int local7 = 0;
		@Pc(15) int local15;
		@Pc(38) int local38;
		@Pc(48) int local48;
		label112: for (@Pc(10) int local10 = this.aShort111; local10 <= this.aShort112; local10++) {
			label110: for (local15 = this.aShort110; local15 <= this.aShort109; local15++) {
				@Pc(26) long local26 = Static295.aLongArrayArrayArray1[super.aByte146][local10][local15];
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
						@Pc(46) Class328 local46 = Static260.aClass328Array1[local38 - 1];
						for (local48 = 0; local48 < local7; local48++) {
							if (arg0[local48] == local46.aClass14_Sub37_3) {
								local28 += 16L;
								continue label105;
							}
						}
						arg0[local7++] = local46.aClass14_Sub37_3;
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
		if (this.aByte143 != 0) {
			local38 = this.aShort111 - Static358.anInt6609;
			@Pc(127) int local127 = this.aShort110 - Static297.anInt5235;
			@Pc(148) int local148;
			@Pc(151) short local151;
			@Pc(154) short local154;
			@Pc(143) int local143;
			if (this.aByte143 == 1) {
				if (local127 <= local38) {
					local143 = this.aShort111 - 1;
					local148 = this.aShort110 + 1;
					local151 = this.aShort110;
					local154 = this.aShort111;
				} else {
					local148 = this.aShort110 - 1;
					local151 = this.aShort110;
					local143 = this.aShort111 + 1;
					local154 = this.aShort111;
				}
			} else if (-local38 < local127) {
				local151 = this.aShort110;
				local143 = this.aShort111 - 1;
				local154 = this.aShort111;
				local148 = this.aShort110 - 1;
			} else {
				local154 = this.aShort111;
				local148 = this.aShort110 + 1;
				local151 = this.aShort110;
				local143 = this.aShort111 + 1;
			}
			label76: for (local48 = 0; local48 < local7; local48++) {
				@Pc(229) long local229 = Static295.aLongArrayArrayArray1[super.aByte146][local154][local148];
				@Pc(240) Class328 local240;
				while (local229 != 0L) {
					local240 = Static260.aClass328Array1[(int) ((local229 & 0xFFFFL) - 1L)];
					local229 >>>= 0x10;
					if (arg0[local48] == local240.aClass14_Sub37_3) {
						continue label76;
					}
				}
				local229 = Static295.aLongArrayArrayArray1[super.aByte146][local143][local151];
				while (local229 != 0L) {
					local240 = Static260.aClass328Array1[(int) ((local229 & 0xFFFFL) - 1L)];
					local229 >>>= 0x10;
					if (local240.aClass14_Sub37_3 == arg0[local48]) {
						continue label76;
					}
				}
				for (@Pc(296) int local296 = local48; local296 < local7 - 1; local296++) {
					arg0[local296] = arg0[local296 + 1];
				}
				local7--;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!it", name = "g", descriptor = "(B)Z")
	@Override
	public final boolean method9167() {
		for (@Pc(13) int local13 = this.aShort111; local13 <= this.aShort112; local13++) {
			for (@Pc(18) int local18 = this.aShort110; local18 <= this.aShort109; local18++) {
				@Pc(27) int local27 = local13 + Static64.anInt1476 - Static358.anInt6609;
				if (local27 >= 0 && local27 < Static255.aBooleanArrayArray2.length) {
					@Pc(42) int local42 = Static64.anInt1476 + local18 - Static297.anInt5235;
					if (local42 >= 0 && Static255.aBooleanArrayArray2.length > local42 && Static255.aBooleanArrayArray2[local27][local42]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!it", name = "j", descriptor = "(I)V")
	public void method8969() {
	}
}
