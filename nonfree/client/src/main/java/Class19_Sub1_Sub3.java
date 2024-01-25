import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qfa")
public abstract class Class19_Sub1_Sub3 extends Class19_Sub1 {

	@OriginalMember(owner = "client!qfa", name = "u", descriptor = "Z")
	public final boolean aBoolean697;

	@OriginalMember(owner = "client!qfa", name = "D", descriptor = "S")
	public short aShort121;

	@OriginalMember(owner = "client!qfa", name = "x", descriptor = "S")
	public short aShort123;

	@OriginalMember(owner = "client!qfa", name = "G", descriptor = "B")
	public final byte aByte140;

	@OriginalMember(owner = "client!qfa", name = "I", descriptor = "S")
	public short aShort124;

	@OriginalMember(owner = "client!qfa", name = "E", descriptor = "S")
	public short aShort122;

	@OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
	protected Class19_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) byte arg10) {
		super.aByte146 = (byte) arg0;
		this.aBoolean697 = arg9;
		this.aShort121 = (short) arg5;
		super.anInt11208 = arg3;
		this.aShort123 = (short) arg6;
		this.aByte140 = arg10;
		this.aShort124 = (short) arg7;
		super.aByte145 = (byte) arg1;
		super.anInt11211 = arg4;
		super.anInt11204 = arg2;
		this.aShort122 = (short) arg8;
	}

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "(Z)V")
	public void method8182() {
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "([Lclient!vj;B)I")
	@Override
	public final int method9376(@OriginalArg(0) Class3_Sub16[] arg0) {
		@Pc(7) int local7 = 0;
		@Pc(15) int local15;
		@Pc(38) int local38;
		@Pc(53) int local53;
		label113: for (@Pc(10) int local10 = this.aShort121; local10 <= this.aShort123; local10++) {
			label111: for (local15 = this.aShort124; local15 <= this.aShort122; local15++) {
				@Pc(26) long local26 = Static353.aLongArrayArrayArray1[super.aByte146][local10][local15];
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
						@Pc(51) Class246 local51 = Static458.aClass246Array1[local38 - 1];
						for (local53 = 0; local53 < local7; local53++) {
							if (local51.aClass3_Sub16_3 == arg0[local53]) {
								local28 += 16L;
								continue label106;
							}
						}
						arg0[local7++] = local51.aClass3_Sub16_3;
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
		if (this.aByte140 != 0) {
			local38 = this.aShort121 - Static296.anInt3655;
			@Pc(175) int local175 = this.aShort124 - Static450.anInt7928;
			@Pc(202) int local202;
			@Pc(205) short local205;
			@Pc(197) short local197;
			@Pc(194) int local194;
			if (this.aByte140 == 1) {
				if (local38 < local175) {
					local202 = this.aShort124 - 1;
					local205 = this.aShort124;
					local197 = this.aShort121;
					local194 = this.aShort121 + 1;
				} else {
					local205 = this.aShort124;
					local197 = this.aShort121;
					local194 = this.aShort121 - 1;
					local202 = this.aShort124 + 1;
				}
			} else if (local175 <= -local38) {
				local194 = this.aShort121 + 1;
				local197 = this.aShort121;
				local202 = this.aShort124 + 1;
				local205 = this.aShort124;
			} else {
				local202 = this.aShort124 - 1;
				local205 = this.aShort124;
				local197 = this.aShort121;
				local194 = this.aShort121 - 1;
			}
			label77: for (local53 = 0; local53 < local7; local53++) {
				@Pc(277) long local277 = Static353.aLongArrayArrayArray1[super.aByte146][local197][local202];
				@Pc(288) Class246 local288;
				while (local277 != 0L) {
					local288 = Static458.aClass246Array1[(int) ((local277 & 0xFFFFL) - 1L)];
					local277 >>>= 0x10;
					if (local288.aClass3_Sub16_3 == arg0[local53]) {
						continue label77;
					}
				}
				local277 = Static353.aLongArrayArrayArray1[super.aByte146][local194][local205];
				while (local277 != 0L) {
					local288 = Static458.aClass246Array1[(int) ((local277 & 0xFFFFL) - 1L)];
					local277 >>>= 0x10;
					if (arg0[local53] == local288.aClass3_Sub16_3) {
						continue label77;
					}
				}
				for (@Pc(350) int local350 = local53; local350 < local7 - 1; local350++) {
					arg0[local350] = arg0[local350 + 1];
				}
				local7--;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!qfa", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method9365() {
		for (@Pc(14) int local14 = this.aShort121; local14 <= this.aShort123; local14++) {
			for (@Pc(21) int local21 = this.aShort124; local21 <= this.aShort122; local21++) {
				@Pc(30) int local30 = local14 + Static726.anInt11312 - Static296.anInt3655;
				if (local30 >= 0 && Static624.aBooleanArrayArray7.length > local30) {
					@Pc(57) int local57 = local21 + Static726.anInt11312 - Static450.anInt7928;
					if (local57 >= 0 && local57 < Static624.aBooleanArrayArray7.length && Static624.aBooleanArrayArray7[local30][local57]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ZLclient!ha;)Z")
	@Override
	public final boolean method9370(@OriginalArg(1) Class67 arg0) {
		return Static625.method8474(this.aShort124, this.aShort123, this.method9371(arg0), this.aShort122, super.aByte145, this.aShort121);
	}
}
