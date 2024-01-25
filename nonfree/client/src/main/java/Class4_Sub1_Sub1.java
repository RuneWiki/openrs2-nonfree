import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aba")
public abstract class Class4_Sub1_Sub1 extends Class4_Sub1 {

	@OriginalMember(owner = "client!aba", name = "y", descriptor = "S")
	public short aShort103;

	@OriginalMember(owner = "client!aba", name = "z", descriptor = "B")
	public byte aByte125;

	@OriginalMember(owner = "client!aba", name = "D", descriptor = "S")
	public short aShort102;

	@OriginalMember(owner = "client!aba", name = "E", descriptor = "S")
	public short aShort104;

	@OriginalMember(owner = "client!aba", name = "K", descriptor = "Z")
	public final boolean aBoolean582;

	@OriginalMember(owner = "client!aba", name = "C", descriptor = "S")
	public short aShort105;

	@OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
	protected Class4_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) byte arg10) {
		super.anInt9797 = arg3;
		this.aShort103 = (short) arg6;
		super.aByte139 = (byte) arg0;
		this.aByte125 = arg10;
		super.aByte138 = (byte) arg1;
		this.aShort102 = (short) arg8;
		super.anInt9805 = arg2;
		super.anInt9803 = arg4;
		this.aShort104 = (short) arg5;
		this.aBoolean582 = arg9;
		this.aShort105 = (short) arg7;
	}

	@OriginalMember(owner = "client!aba", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method8352(@OriginalArg(0) int arg0) {
		if (arg0 >= -19) {
			this.aByte125 = -10;
		}
		for (@Pc(16) int local16 = this.aShort104; local16 <= this.aShort103; local16++) {
			for (@Pc(23) int local23 = this.aShort105; local23 <= this.aShort102; local23++) {
				@Pc(32) int local32 = Static553.anInt8738 + local16 - Static220.anInt3838;
				if (local32 >= 0 && Static407.aBooleanArrayArray8.length > local32) {
					@Pc(58) int local58 = Static553.anInt8738 + local23 - Static377.anInt6335;
					if (local58 >= 0 && local58 < Static407.aBooleanArrayArray8.length && Static407.aBooleanArrayArray8[local32][local58]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method8343(@OriginalArg(1) Class100 arg0) {
		return Static518.method7073(super.aByte138, this.aShort105, this.method8350(arg0), this.aShort104, this.aShort103, this.aShort102);
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "([Lclient!ih;Z)I")
	@Override
	public final int method8349(@OriginalArg(0) Class5_Sub12[] arg0) {
		@Pc(7) int local7 = 0;
		@Pc(17) int local17;
		@Pc(40) int local40;
		@Pc(55) int local55;
		label117: for (@Pc(10) int local10 = this.aShort104; local10 <= this.aShort103; local10++) {
			label115: for (local17 = this.aShort105; local17 <= this.aShort102; local17++) {
				@Pc(28) long local28 = Static680.aLongArrayArrayArray1[super.aByte139][local10][local17];
				@Pc(30) long local30 = 0L;
				while (true) {
					label110: while (true) {
						if (local30 > 48L) {
							continue label115;
						}
						local40 = (int) (local28 >>> (int) local30 & 0xFFFFL);
						if (local40 <= 0) {
							continue label115;
						}
						@Pc(53) Class204 local53 = Static665.aClass204Array3[local40 - 1];
						for (local55 = 0; local55 < local7; local55++) {
							if (local53.aClass5_Sub12_2 == arg0[local55]) {
								local30 += 16L;
								continue label110;
							}
						}
						arg0[local7++] = local53.aClass5_Sub12_2;
						if (local7 == 4) {
							break label117;
						}
						local30 += 16L;
					}
				}
			}
		}
		if (false) {
			this.method8352(109);
		}
		for (local17 = local7; local17 < 4; local17++) {
			arg0[local17] = null;
		}
		if (this.aByte125 != 0) {
			local40 = this.aShort104 - Static220.anInt3838;
			@Pc(169) int local169 = this.aShort105 - Static377.anInt6335;
			@Pc(189) int local189;
			@Pc(184) short local184;
			@Pc(197) short local197;
			@Pc(194) int local194;
			if (this.aByte125 == 1) {
				if (local169 <= local40) {
					local194 = this.aShort104 - 1;
					local189 = this.aShort105 + 1;
					local197 = this.aShort104;
					local184 = this.aShort105;
				} else {
					local184 = this.aShort105;
					local189 = this.aShort105 - 1;
					local197 = this.aShort104;
					local194 = this.aShort104 + 1;
				}
			} else if (-local40 < local169) {
				local184 = this.aShort105;
				local189 = this.aShort105 - 1;
				local194 = this.aShort104 - 1;
				local197 = this.aShort104;
			} else {
				local189 = this.aShort105 + 1;
				local197 = this.aShort104;
				local194 = this.aShort104 + 1;
				local184 = this.aShort105;
			}
			label81: for (local55 = 0; local55 < local7; local55++) {
				@Pc(269) long local269 = Static680.aLongArrayArrayArray1[super.aByte139][local197][local189];
				@Pc(280) Class204 local280;
				while (local269 != 0L) {
					local280 = Static665.aClass204Array3[(int) ((local269 & 0xFFFFL) - 1L)];
					local269 >>>= 0x10;
					if (arg0[local55] == local280.aClass5_Sub12_2) {
						continue label81;
					}
				}
				local269 = Static680.aLongArrayArrayArray1[super.aByte139][local194][local184];
				while (local269 != 0L) {
					local280 = Static665.aClass204Array3[(int) ((local269 & 0xFFFFL) - 1L)];
					local269 >>>= 0x10;
					if (local280.aClass5_Sub12_2 == arg0[local55]) {
						continue label81;
					}
				}
				for (@Pc(344) int local344 = local55; local344 < local7 - 1; local344++) {
					arg0[local344] = arg0[local344 + 1];
				}
				local7--;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!aba", name = "j", descriptor = "(I)V")
	public void method7575() {
	}
}
