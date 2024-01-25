import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vv")
public abstract class Class8_Sub1_Sub3 extends Class8_Sub1 {

	@OriginalMember(owner = "client!vv", name = "M", descriptor = "B")
	public final byte aByte138;

	@OriginalMember(owner = "client!vv", name = "K", descriptor = "Z")
	public boolean aBoolean738;

	@OriginalMember(owner = "client!vv", name = "E", descriptor = "S")
	public short aShort110;

	@OriginalMember(owner = "client!vv", name = "N", descriptor = "S")
	public short aShort107;

	@OriginalMember(owner = "client!vv", name = "H", descriptor = "S")
	public short aShort109;

	@OriginalMember(owner = "client!vv", name = "C", descriptor = "S")
	public short aShort108;

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
	protected Class8_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) byte arg10) {
		super.aByte145 = (byte) arg0;
		this.aByte138 = arg10;
		this.aBoolean738 = arg9;
		super.anInt10357 = arg3;
		this.aShort110 = (short) arg6;
		super.aByte146 = (byte) arg1;
		this.aShort107 = (short) arg8;
		this.aShort109 = (short) arg5;
		this.aShort108 = (short) arg7;
		super.anInt10355 = arg2;
		super.anInt10363 = arg4;
	}

	@OriginalMember(owner = "client!vv", name = "m", descriptor = "(I)V")
	public void method8231() {
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "([Lclient!uf;Z)I")
	@Override
	public final int method8902(@OriginalArg(0) Class5_Sub43[] arg0, @OriginalArg(1) boolean arg1) {
		@Pc(7) int local7 = 0;
		@Pc(15) int local15;
		@Pc(38) int local38;
		@Pc(53) int local53;
		label117: for (@Pc(10) int local10 = this.aShort109; local10 <= this.aShort110; local10++) {
			label115: for (local15 = this.aShort108; local15 <= this.aShort107; local15++) {
				@Pc(26) long local26 = Static63.aLongArrayArrayArray1[super.aByte145][local10][local15];
				@Pc(28) long local28 = 0L;
				while (true) {
					label110: while (true) {
						if (local28 > 48L) {
							continue label115;
						}
						local38 = (int) (local26 >>> (int) local28 & 0xFFFFL);
						if (local38 <= 0) {
							continue label115;
						}
						@Pc(51) Class2 local51 = Static252.aClass2Array1[local38 - 1];
						for (local53 = 0; local53 < local7; local53++) {
							if (local51.aClass5_Sub43_1 == arg0[local53]) {
								local28 += 16L;
								continue label110;
							}
						}
						arg0[local7++] = local51.aClass5_Sub43_1;
						if (local7 == 4) {
							break label117;
						}
						local28 += 16L;
					}
				}
			}
		}
		for (local15 = local7; local15 < 4; local15++) {
			arg0[local15] = null;
		}
		if (!arg1) {
			this.aShort107 = 63;
		}
		if (this.aByte138 != 0) {
			local38 = this.aShort109 - Static128.anInt7021;
			@Pc(158) int local158 = this.aShort108 - Static97.anInt1574;
			@Pc(178) int local178;
			@Pc(184) short local184;
			@Pc(181) short local181;
			@Pc(189) int local189;
			if (this.aByte138 == 1) {
				if (local38 < local158) {
					local178 = this.aShort108 - 1;
					local181 = this.aShort109;
					local184 = this.aShort108;
					local189 = this.aShort109 + 1;
				} else {
					local189 = this.aShort109 - 1;
					local181 = this.aShort109;
					local184 = this.aShort108;
					local178 = this.aShort108 + 1;
				}
			} else if (-local38 < local158) {
				local178 = this.aShort108 - 1;
				local189 = this.aShort109 - 1;
				local181 = this.aShort109;
				local184 = this.aShort108;
			} else {
				local189 = this.aShort109 + 1;
				local181 = this.aShort109;
				local178 = this.aShort108 + 1;
				local184 = this.aShort108;
			}
			label80: for (local53 = 0; local53 < local7; local53++) {
				@Pc(262) long local262 = Static63.aLongArrayArrayArray1[super.aByte145][local181][local178];
				@Pc(273) Class2 local273;
				while (local262 != 0L) {
					local273 = Static252.aClass2Array1[(int) ((local262 & 0xFFFFL) - 1L)];
					local262 >>>= 0x10;
					if (local273.aClass5_Sub43_1 == arg0[local53]) {
						continue label80;
					}
				}
				local262 = Static63.aLongArrayArrayArray1[super.aByte145][local189][local184];
				while (local262 != 0L) {
					local273 = Static252.aClass2Array1[(int) ((local262 & 0xFFFFL) - 1L)];
					local262 >>>= 0x10;
					if (arg0[local53] == local273.aClass5_Sub43_1) {
						continue label80;
					}
				}
				for (@Pc(335) int local335 = local53; local335 < local7 - 1; local335++) {
					arg0[local335] = arg0[local335 + 1];
				}
				local7--;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!vv", name = "d", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method8896(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1) {
		if (arg0 != -10204) {
			this.aBoolean738 = false;
		}
		return Static560.method8116(super.aByte146, this.aShort109, this.aShort108, this.aShort107, this.method8904(arg1, arg0 ^ 0xFFFFD843), this.aShort110);
	}

	@OriginalMember(owner = "client!vv", name = "k", descriptor = "(I)Z")
	@Override
	public final boolean method8905() {
		for (@Pc(13) int local13 = this.aShort109; local13 <= this.aShort110; local13++) {
			for (@Pc(20) int local20 = this.aShort108; local20 <= this.aShort107; local20++) {
				@Pc(28) int local28 = Static28.anInt9243 + local13 - Static128.anInt7021;
				if (local28 >= 0 && local28 < Static300.aBooleanArrayArray6.length) {
					@Pc(52) int local52 = local20 + Static28.anInt9243 - Static97.anInt1574;
					if (local52 >= 0 && local52 < Static300.aBooleanArrayArray6.length && Static300.aBooleanArrayArray6[local28][local52]) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
