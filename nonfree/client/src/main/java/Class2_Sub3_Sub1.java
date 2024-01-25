import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public abstract class Class2_Sub3_Sub1 extends Class2_Sub3 {

	@OriginalMember(owner = "client!rq", name = "G", descriptor = "S")
	public short aShort124;

	@OriginalMember(owner = "client!rq", name = "A", descriptor = "S")
	public short aShort122;

	@OriginalMember(owner = "client!rq", name = "B", descriptor = "B")
	public final byte aByte130;

	@OriginalMember(owner = "client!rq", name = "H", descriptor = "Z")
	public final boolean aBoolean874;

	@OriginalMember(owner = "client!rq", name = "C", descriptor = "S")
	public short aShort123;

	@OriginalMember(owner = "client!rq", name = "z", descriptor = "S")
	public short aShort121;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
	protected Class2_Sub3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) byte arg10) {
		super.anInt10429 = arg3;
		this.aShort124 = (short) arg7;
		this.aShort122 = (short) arg6;
		this.aByte130 = arg10;
		super.aByte128 = (byte) arg0;
		super.aByte129 = (byte) arg1;
		super.anInt10424 = arg4;
		this.aBoolean874 = arg9;
		super.anInt10428 = arg2;
		this.aShort123 = (short) arg8;
		this.aShort121 = (short) arg5;
	}

	@OriginalMember(owner = "client!rq", name = "i", descriptor = "(I)Z")
	@Override
	public final boolean method8580() {
		for (@Pc(13) int local13 = this.aShort121; local13 <= this.aShort122; local13++) {
			for (@Pc(18) int local18 = this.aShort124; local18 <= this.aShort123; local18++) {
				@Pc(28) int local28 = local13 + Static157.anInt3831 - Static607.anInt10024;
				if (local28 >= 0 && Static622.aBooleanArrayArray11.length > local28) {
					@Pc(46) int local46 = Static157.anInt3831 + local18 - Static23.anInt369;
					if (local46 >= 0 && local46 < Static622.aBooleanArrayArray11.length && Static622.aBooleanArrayArray11[local28][local46]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(I[Lclient!pk;)I")
	@Override
	public final int method8577(@OriginalArg(1) Class3_Sub27[] arg0) {
		@Pc(7) int local7 = 0;
		@Pc(18) int local18;
		@Pc(41) int local41;
		@Pc(54) int local54;
		label112: for (@Pc(10) int local10 = this.aShort121; local10 <= this.aShort122; local10++) {
			label110: for (local18 = this.aShort124; local18 <= this.aShort123; local18++) {
				@Pc(29) long local29 = Static408.aLongArrayArrayArray1[super.aByte128][local10][local18];
				@Pc(31) long local31 = 0L;
				while (true) {
					label105: while (true) {
						if (local31 > 48L) {
							continue label110;
						}
						local41 = (int) (local29 >>> (int) local31 & 0xFFFFL);
						if (local41 <= 0) {
							continue label110;
						}
						@Pc(52) Class93 local52 = Static523.aClass93Array1[local41 - 1];
						for (local54 = 0; local54 < local7; local54++) {
							if (arg0[local54] == local52.aClass3_Sub27_2) {
								local31 += 16L;
								continue label105;
							}
						}
						arg0[local7++] = local52.aClass3_Sub27_2;
						if (local7 == 4) {
							break label112;
						}
						local31 += 16L;
					}
				}
			}
		}
		for (local18 = local7; local18 < 4; local18++) {
			arg0[local18] = null;
		}
		if (this.aByte130 != 0) {
			local41 = this.aShort121 - Static607.anInt10024;
			@Pc(134) int local134 = this.aShort124 - Static23.anInt369;
			@Pc(157) int local157;
			@Pc(152) short local152;
			@Pc(149) short local149;
			@Pc(146) int local146;
			if (this.aByte130 == 1) {
				if (local134 <= local41) {
					local146 = this.aShort121 - 1;
					local149 = this.aShort121;
					local152 = this.aShort124;
					local157 = this.aShort124 + 1;
				} else {
					local157 = this.aShort124 - 1;
					local149 = this.aShort121;
					local152 = this.aShort124;
					local146 = this.aShort121 + 1;
				}
			} else if (-local41 < local134) {
				local157 = this.aShort124 - 1;
				local149 = this.aShort121;
				local146 = this.aShort121 - 1;
				local152 = this.aShort124;
			} else {
				local157 = this.aShort124 + 1;
				local152 = this.aShort124;
				local149 = this.aShort121;
				local146 = this.aShort121 + 1;
			}
			label76: for (local54 = 0; local54 < local7; local54++) {
				@Pc(228) long local228 = Static408.aLongArrayArrayArray1[super.aByte128][local149][local157];
				@Pc(239) Class93 local239;
				while (local228 != 0L) {
					local239 = Static523.aClass93Array1[(int) ((local228 & 0xFFFFL) - 1L)];
					local228 >>>= 0x10;
					if (local239.aClass3_Sub27_2 == arg0[local54]) {
						continue label76;
					}
				}
				local228 = Static408.aLongArrayArrayArray1[super.aByte128][local146][local152];
				while (local228 != 0L) {
					local239 = Static523.aClass93Array1[(int) ((local228 & 0xFFFFL) - 1L)];
					local228 >>>= 0x10;
					if (arg0[local54] == local239.aClass3_Sub27_2) {
						continue label76;
					}
				}
				for (@Pc(297) int local297 = local54; local297 < local7 - 1; local297++) {
					arg0[local297] = arg0[local297 + 1];
				}
				local7--;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!rq", name = "g", descriptor = "(B)V")
	public void method8581() {
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method8567(@OriginalArg(1) Class33 arg0) {
		return Static123.method2857(this.aShort123, this.aShort124, this.aShort121, this.aShort122, super.aByte129, this.method8572(arg0));
	}
}
