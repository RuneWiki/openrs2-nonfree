import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public abstract class Class3_Sub1_Sub3 extends Class3_Sub1 {

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "Z")
	public final boolean aBoolean687;

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "S")
	public short aShort119;

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "B")
	public final byte aByte129;

	@OriginalMember(owner = "client!jb", name = "M", descriptor = "S")
	public short aShort121;

	@OriginalMember(owner = "client!jb", name = "L", descriptor = "S")
	public short aShort120;

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "S")
	public short aShort118;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
	protected Class3_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) byte arg10) {
		super.anInt10306 = arg3;
		this.aBoolean687 = arg9;
		this.aShort119 = (short) arg8;
		super.anInt10303 = arg2;
		this.aByte129 = arg10;
		this.aShort121 = (short) arg6;
		super.anInt10310 = arg4;
		super.aByte132 = (byte) arg0;
		this.aShort120 = (short) arg7;
		this.aShort118 = (short) arg5;
		super.aByte131 = (byte) arg1;
	}

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "(I)Z")
	@Override
	public final boolean method8602() {
		for (@Pc(13) int local13 = this.aShort118; local13 <= this.aShort121; local13++) {
			for (@Pc(18) int local18 = this.aShort120; local18 <= this.aShort119; local18++) {
				@Pc(27) int local27 = local13 + Static177.anInt4273 - Static120.anInt3199;
				if (local27 >= 0 && local27 < Static342.aBooleanArrayArray6.length) {
					@Pc(48) int local48 = Static177.anInt4273 + local18 - Static360.anInt7144;
					if (local48 >= 0 && local48 < Static342.aBooleanArrayArray6.length && Static342.aBooleanArrayArray6[local27][local48]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(B)Z")
	@Override
	public final boolean method8606() {
		return Static608.method8917(super.aByte131, this.aShort119, this.aShort120, this.method8618(), this.aShort118, this.aShort121);
	}

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "(B)V")
	public void method8219() {
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([Lclient!ab;I)I")
	@Override
	public final int method8608(@OriginalArg(0) Class2_Sub1[] arg0) {
		@Pc(7) int local7 = 0;
		@Pc(53) int local53;
		label113: for (@Pc(10) int local10 = this.aShort118; local10 <= this.aShort121; local10++) {
			label111: for (@Pc(15) int local15 = this.aShort120; local15 <= this.aShort119; local15++) {
				@Pc(26) long local26 = Static423.aLongArrayArrayArray1[super.aByte132][local10][local15];
				@Pc(28) long local28 = 0L;
				while (true) {
					label106: while (true) {
						if (local28 > 48L) {
							continue label111;
						}
						@Pc(38) int local38 = (int) (local26 >>> (int) local28 & 0xFFFFL);
						if (local38 <= 0) {
							continue label111;
						}
						@Pc(51) Class300 local51 = Static436.aClass300Array1[local38 - 1];
						for (local53 = 0; local53 < local7; local53++) {
							if (local51.aClass2_Sub1_2 == arg0[local53]) {
								local28 += 16L;
								continue label106;
							}
						}
						arg0[local7++] = local51.aClass2_Sub1_2;
						if (local7 == 4) {
							break label113;
						}
						local28 += 16L;
					}
				}
			}
		}
		for (@Pc(114) int local114 = local7; local114 < 4; local114++) {
			arg0[local114] = null;
		}
		if (this.aByte129 != 0) {
			@Pc(135) int local135 = this.aShort118 - Static120.anInt3199;
			local53 = this.aShort120 - Static360.anInt7144;
			@Pc(153) short local153;
			@Pc(166) int local166;
			@Pc(161) int local161;
			@Pc(156) short local156;
			if (this.aByte129 == 1) {
				if (local135 >= local53) {
					local153 = this.aShort118;
					local156 = this.aShort120;
					local161 = this.aShort120 + 1;
					local166 = this.aShort118 - 1;
				} else {
					local156 = this.aShort120;
					local161 = this.aShort120 - 1;
					local153 = this.aShort118;
					local166 = this.aShort118 + 1;
				}
			} else if (local53 > -local135) {
				local166 = this.aShort118 - 1;
				local156 = this.aShort120;
				local161 = this.aShort120 - 1;
				local153 = this.aShort118;
			} else {
				local161 = this.aShort120 + 1;
				local153 = this.aShort118;
				local156 = this.aShort120;
				local166 = this.aShort118 + 1;
			}
			label77: for (@Pc(230) int local230 = 0; local230 < local7; local230++) {
				@Pc(241) long local241 = Static423.aLongArrayArrayArray1[super.aByte132][local153][local161];
				@Pc(252) Class300 local252;
				while (local241 != 0L) {
					local252 = Static436.aClass300Array1[(int) ((local241 & 0xFFFFL) - 1L)];
					local241 >>>= 0x10;
					if (local252.aClass2_Sub1_2 == arg0[local230]) {
						continue label77;
					}
				}
				local241 = Static423.aLongArrayArrayArray1[super.aByte132][local166][local156];
				while (local241 != 0L) {
					local252 = Static436.aClass300Array1[(int) ((local241 & 0xFFFFL) - 1L)];
					local241 >>>= 0x10;
					if (arg0[local230] == local252.aClass2_Sub1_2) {
						continue label77;
					}
				}
				for (@Pc(308) int local308 = local230; local308 < local7 - 1; local308++) {
					arg0[local308] = arg0[local308 + 1];
				}
				local7--;
			}
		}
		return local7;
	}
}
