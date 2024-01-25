import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wga")
public abstract class Class41_Sub1_Sub1 extends Class41_Sub1 {

	@OriginalMember(owner = "client!wga", name = "N", descriptor = "B")
	public final byte aByte127;

	@OriginalMember(owner = "client!wga", name = "D", descriptor = "S")
	public short aShort107;

	@OriginalMember(owner = "client!wga", name = "M", descriptor = "S")
	public short aShort110;

	@OriginalMember(owner = "client!wga", name = "G", descriptor = "S")
	public short aShort108;

	@OriginalMember(owner = "client!wga", name = "I", descriptor = "Z")
	public final boolean aBoolean689;

	@OriginalMember(owner = "client!wga", name = "J", descriptor = "S")
	public short aShort109;

	@OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
	protected Class41_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) byte arg10) {
		this.aByte127 = arg10;
		this.aShort107 = (short) arg6;
		this.aShort110 = (short) arg8;
		super.anInt10366 = arg2;
		super.aByte150 = (byte) arg1;
		super.aByte149 = (byte) arg0;
		super.anInt10367 = arg4;
		this.aShort108 = (short) arg7;
		this.aBoolean689 = arg9;
		this.aShort109 = (short) arg5;
		super.anInt10370 = arg3;
	}

	@OriginalMember(owner = "client!wga", name = "m", descriptor = "(I)V")
	public void method7909() {
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(Z[Lclient!jw;)I")
	@Override
	public final int method8649(@OriginalArg(1) Class5_Sub3[] arg0) {
		@Pc(12) int local12 = 0;
		@Pc(20) int local20;
		@Pc(43) int local43;
		@Pc(55) int local55;
		label113: for (@Pc(15) int local15 = this.aShort109; local15 <= this.aShort107; local15++) {
			label111: for (local20 = this.aShort108; local20 <= this.aShort110; local20++) {
				@Pc(31) long local31 = Static98.aLongArrayArrayArray1[super.aByte149][local15][local20];
				@Pc(33) long local33 = 0L;
				while (true) {
					label106: while (true) {
						if (local33 > 48L) {
							continue label111;
						}
						local43 = (int) (local31 >>> (int) local33 & 0xFFFFL);
						if (local43 <= 0) {
							continue label111;
						}
						@Pc(53) Class371 local53 = Static602.aClass371Array5[local43 - 1];
						for (local55 = 0; local55 < local12; local55++) {
							if (local53.aClass5_Sub3_3 == arg0[local55]) {
								local33 += 16L;
								continue label106;
							}
						}
						arg0[local12++] = local53.aClass5_Sub3_3;
						if (local12 == 4) {
							break label113;
						}
						local33 += 16L;
					}
				}
			}
		}
		for (local20 = local12; local20 < 4; local20++) {
			arg0[local20] = null;
		}
		if (this.aByte127 != 0) {
			local43 = this.aShort109 - Static281.anInt4404;
			@Pc(138) int local138 = this.aShort108 - Static411.anInt7045;
			@Pc(162) int local162;
			@Pc(154) short local154;
			@Pc(157) short local157;
			@Pc(167) int local167;
			if (this.aByte127 == 1) {
				if (local138 <= local43) {
					local154 = this.aShort108;
					local157 = this.aShort109;
					local162 = this.aShort108 + 1;
					local167 = this.aShort109 - 1;
				} else {
					local167 = this.aShort109 + 1;
					local162 = this.aShort108 - 1;
					local157 = this.aShort109;
					local154 = this.aShort108;
				}
			} else if (-local43 >= local138) {
				local157 = this.aShort109;
				local167 = this.aShort109 + 1;
				local162 = this.aShort108 + 1;
				local154 = this.aShort108;
			} else {
				local157 = this.aShort109;
				local167 = this.aShort109 - 1;
				local154 = this.aShort108;
				local162 = this.aShort108 - 1;
			}
			label77: for (local55 = 0; local55 < local12; local55++) {
				@Pc(242) long local242 = Static98.aLongArrayArrayArray1[super.aByte149][local157][local162];
				@Pc(253) Class371 local253;
				while (local242 != 0L) {
					local253 = Static602.aClass371Array5[(int) ((local242 & 0xFFFFL) - 1L)];
					local242 >>>= 0x10;
					if (local253.aClass5_Sub3_3 == arg0[local55]) {
						continue label77;
					}
				}
				local242 = Static98.aLongArrayArrayArray1[super.aByte149][local167][local154];
				while (local242 != 0L) {
					local253 = Static602.aClass371Array5[(int) ((local242 & 0xFFFFL) - 1L)];
					local242 >>>= 0x10;
					if (local253.aClass5_Sub3_3 == arg0[local55]) {
						continue label77;
					}
				}
				for (@Pc(311) int local311 = local55; local311 < local12 - 1; local311++) {
					arg0[local311] = arg0[local311 + 1];
				}
				local12--;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!wga", name = "l", descriptor = "(I)Z")
	@Override
	public final boolean method8664() {
		for (@Pc(12) int local12 = this.aShort109; local12 <= this.aShort107; local12++) {
			for (@Pc(16) int local16 = this.aShort108; local16 <= this.aShort110; local16++) {
				@Pc(25) int local25 = local12 + Static537.anInt10357 - Static281.anInt4404;
				if (local25 >= 0 && Static10.aBooleanArrayArray1.length > local25) {
					@Pc(46) int local46 = Static537.anInt10357 + local16 - Static411.anInt7045;
					if (local46 >= 0 && Static10.aBooleanArrayArray1.length > local46 && Static10.aBooleanArrayArray1[local25][local46]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wga", name = "c", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method8651(@OriginalArg(1) Class143 arg0) {
		return Static616.method8263(super.aByte150, this.aShort109, this.method8656(arg0), this.aShort110, this.aShort107, this.aShort108);
	}
}
