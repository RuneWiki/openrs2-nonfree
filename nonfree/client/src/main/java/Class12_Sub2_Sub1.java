import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public abstract class Class12_Sub2_Sub1 extends Class12_Sub2 {

	@OriginalMember(owner = "client!wo", name = "G", descriptor = "S")
	public short aShort122;

	@OriginalMember(owner = "client!wo", name = "B", descriptor = "S")
	public short aShort121;

	@OriginalMember(owner = "client!wo", name = "D", descriptor = "B")
	public final byte aByte129;

	@OriginalMember(owner = "client!wo", name = "A", descriptor = "S")
	public short aShort120;

	@OriginalMember(owner = "client!wo", name = "w", descriptor = "Z")
	public final boolean aBoolean783;

	@OriginalMember(owner = "client!wo", name = "v", descriptor = "S")
	public short aShort119;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
	protected Class12_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) byte arg10) {
		super.anInt9374 = arg2;
		this.aShort122 = (short) arg8;
		this.aShort121 = (short) arg7;
		super.aByte127 = (byte) arg1;
		this.aByte129 = arg10;
		this.aShort120 = (short) arg5;
		this.aBoolean783 = arg9;
		super.anInt9375 = arg4;
		super.anInt9373 = arg3;
		super.aByte128 = (byte) arg0;
		this.aShort119 = (short) arg6;
	}

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "(B)V")
	public void method7514() {
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(Z)Z")
	@Override
	public final boolean method7506() {
		return Static555.method7263(super.aByte127, this.aShort122, this.aShort120, this.method7501(), this.aShort119, this.aShort121);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I[Lclient!tg;)I")
	@Override
	public final int method7505(@OriginalArg(1) Class2_Sub11[] arg0) {
		@Pc(7) int local7 = 0;
		@Pc(15) int local15;
		@Pc(38) int local38;
		@Pc(50) int local50;
		label113: for (@Pc(10) int local10 = this.aShort120; local10 <= this.aShort119; local10++) {
			label111: for (local15 = this.aShort121; local15 <= this.aShort122; local15++) {
				@Pc(26) long local26 = Static94.aLongArrayArrayArray1[super.aByte128][local10][local15];
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
						@Pc(48) Class141 local48 = Static375.aClass141Array1[local38 - 1];
						for (local50 = 0; local50 < local7; local50++) {
							if (local48.aClass2_Sub11_1 == arg0[local50]) {
								local28 += 16L;
								continue label106;
							}
						}
						arg0[local7++] = local48.aClass2_Sub11_1;
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
		if (this.aByte129 != 0) {
			local38 = this.aShort120 - Static258.anInt4281;
			@Pc(131) int local131 = this.aShort121 - Static505.anInt8016;
			@Pc(151) int local151;
			@Pc(143) short local143;
			@Pc(146) short local146;
			@Pc(156) int local156;
			if (this.aByte129 == 1) {
				if (local38 < local131) {
					local143 = this.aShort121;
					local146 = this.aShort120;
					local151 = this.aShort121 - 1;
					local156 = this.aShort120 + 1;
				} else {
					local146 = this.aShort120;
					local143 = this.aShort121;
					local156 = this.aShort120 - 1;
					local151 = this.aShort121 + 1;
				}
			} else if (local131 <= -local38) {
				local156 = this.aShort120 + 1;
				local151 = this.aShort121 + 1;
				local143 = this.aShort121;
				local146 = this.aShort120;
			} else {
				local146 = this.aShort120;
				local151 = this.aShort121 - 1;
				local143 = this.aShort121;
				local156 = this.aShort120 - 1;
			}
			label77: for (local50 = 0; local50 < local7; local50++) {
				@Pc(227) long local227 = Static94.aLongArrayArrayArray1[super.aByte128][local146][local151];
				@Pc(238) Class141 local238;
				while (local227 != 0L) {
					local238 = Static375.aClass141Array1[(int) ((local227 & 0xFFFFL) - 1L)];
					local227 >>>= 0x10;
					if (arg0[local50] == local238.aClass2_Sub11_1) {
						continue label77;
					}
				}
				local227 = Static94.aLongArrayArrayArray1[super.aByte128][local156][local143];
				while (local227 != 0L) {
					local238 = Static375.aClass141Array1[(int) ((local227 & 0xFFFFL) - 1L)];
					local227 >>>= 0x10;
					if (arg0[local50] == local238.aClass2_Sub11_1) {
						continue label77;
					}
				}
				for (@Pc(292) int local292 = local50; local292 < local7 - 1; local292++) {
					arg0[local292] = arg0[local292 + 1];
				}
				local7--;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method7499() {
		for (@Pc(13) int local13 = this.aShort120; local13 <= this.aShort119; local13++) {
			for (@Pc(18) int local18 = this.aShort121; local18 <= this.aShort122; local18++) {
				@Pc(27) int local27 = Static351.anInt6012 + local13 - Static258.anInt4281;
				if (local27 >= 0 && local27 < Static590.aBooleanArrayArray10.length) {
					@Pc(44) int local44 = Static351.anInt6012 + local18 - Static505.anInt8016;
					if (local44 >= 0 && local44 < Static590.aBooleanArrayArray10.length && Static590.aBooleanArrayArray10[local27][local44]) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
