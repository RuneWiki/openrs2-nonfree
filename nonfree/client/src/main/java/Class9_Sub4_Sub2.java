import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public abstract class Class9_Sub4_Sub2 extends Class9_Sub4 {

	@OriginalMember(owner = "client!lr", name = "B", descriptor = "S")
	public short aShort115;

	@OriginalMember(owner = "client!lr", name = "K", descriptor = "Z")
	public final boolean aBoolean756;

	@OriginalMember(owner = "client!lr", name = "A", descriptor = "S")
	public short aShort114;

	@OriginalMember(owner = "client!lr", name = "G", descriptor = "B")
	public final byte aByte117;

	@OriginalMember(owner = "client!lr", name = "F", descriptor = "S")
	public short aShort117;

	@OriginalMember(owner = "client!lr", name = "E", descriptor = "S")
	public short aShort116;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
	protected Class9_Sub4_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) byte arg10) {
		this.aShort115 = (short) arg5;
		this.aBoolean756 = arg9;
		super.anInt10365 = arg3;
		super.aByte134 = (byte) arg1;
		this.aShort114 = (short) arg7;
		this.aByte117 = arg10;
		this.aShort117 = (short) arg6;
		super.anInt10360 = arg2;
		super.anInt10357 = arg4;
		this.aShort116 = (short) arg8;
		super.aByte135 = (byte) arg0;
	}

	@OriginalMember(owner = "client!lr", name = "i", descriptor = "(I)V")
	public void method7823() {
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(I[Lclient!cba;)I")
	@Override
	public final int method8415(@OriginalArg(1) Class6_Sub10[] arg0) {
		@Pc(7) int local7 = 0;
		@Pc(50) int local50;
		label113: for (@Pc(10) int local10 = this.aShort115; local10 <= this.aShort117; local10++) {
			label111: for (@Pc(15) int local15 = this.aShort114; local15 <= this.aShort116; local15++) {
				@Pc(26) long local26 = Static531.aLongArrayArrayArray1[super.aByte135][local10][local15];
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
						@Pc(48) Class3 local48 = Static489.aClass3Array1[local38 - 1];
						for (local50 = 0; local50 < local7; local50++) {
							if (local48.aClass6_Sub10_1 == arg0[local50]) {
								local28 += 16L;
								continue label106;
							}
						}
						arg0[local7++] = local48.aClass6_Sub10_1;
						if (local7 == 4) {
							break label113;
						}
						local28 += 16L;
					}
				}
			}
		}
		for (@Pc(105) int local105 = local7; local105 < 4; local105++) {
			arg0[local105] = null;
		}
		if (this.aByte117 != 0) {
			@Pc(123) int local123 = this.aShort115 - Static427.anInt7834;
			local50 = this.aShort114 - Static594.anInt10050;
			@Pc(142) short local142;
			@Pc(155) int local155;
			@Pc(150) int local150;
			@Pc(145) short local145;
			if (this.aByte117 == 1) {
				if (local123 < local50) {
					local155 = this.aShort115 + 1;
					local150 = this.aShort114 - 1;
					local142 = this.aShort115;
					local145 = this.aShort114;
				} else {
					local145 = this.aShort114;
					local150 = this.aShort114 + 1;
					local155 = this.aShort115 - 1;
					local142 = this.aShort115;
				}
			} else if (local50 <= -local123) {
				local142 = this.aShort115;
				local145 = this.aShort114;
				local150 = this.aShort114 + 1;
				local155 = this.aShort115 + 1;
			} else {
				local155 = this.aShort115 - 1;
				local150 = this.aShort114 - 1;
				local145 = this.aShort114;
				local142 = this.aShort115;
			}
			label77: for (@Pc(214) int local214 = 0; local214 < local7; local214++) {
				@Pc(225) long local225 = Static531.aLongArrayArrayArray1[super.aByte135][local142][local150];
				@Pc(236) Class3 local236;
				while (local225 != 0L) {
					local236 = Static489.aClass3Array1[(int) ((local225 & 0xFFFFL) - 1L)];
					local225 >>>= 0x10;
					if (local236.aClass6_Sub10_1 == arg0[local214]) {
						continue label77;
					}
				}
				local225 = Static531.aLongArrayArrayArray1[super.aByte135][local155][local145];
				while (local225 != 0L) {
					local236 = Static489.aClass3Array1[(int) ((local225 & 0xFFFFL) - 1L)];
					local225 >>>= 0x10;
					if (arg0[local214] == local236.aClass6_Sub10_1) {
						continue label77;
					}
				}
				for (@Pc(292) int local292 = local214; local292 < local7 - 1; local292++) {
					arg0[local292] = arg0[local292 + 1];
				}
				local7--;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!ha;B)Z")
	@Override
	public final boolean method8412(@OriginalArg(0) Class5 arg0) {
		return Static123.method2612(this.aShort115, this.aShort114, this.method8409(arg0), this.aShort117, this.aShort116, super.aByte134);
	}

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "(Z)Z")
	@Override
	public final boolean method8426() {
		for (@Pc(15) int local15 = this.aShort115; local15 <= this.aShort117; local15++) {
			for (@Pc(20) int local20 = this.aShort114; local20 <= this.aShort116; local20++) {
				@Pc(29) int local29 = Static456.anInt8195 + local15 - Static427.anInt7834;
				if (local29 >= 0 && local29 < Static137.aBooleanArrayArray1.length) {
					@Pc(49) int local49 = local20 + Static456.anInt8195 - Static594.anInt10050;
					if (local49 >= 0 && Static137.aBooleanArrayArray1.length > local49 && Static137.aBooleanArrayArray1[local29][local49]) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
