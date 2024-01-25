import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qda")
public abstract class Class6_Sub1_Sub1 extends Class6_Sub1 {

	@OriginalMember(owner = "client!qda", name = "J", descriptor = "B")
	public final byte aByte97;

	@OriginalMember(owner = "client!qda", name = "w", descriptor = "Z")
	public final boolean aBoolean568;

	@OriginalMember(owner = "client!qda", name = "I", descriptor = "S")
	public short aShort86;

	@OriginalMember(owner = "client!qda", name = "B", descriptor = "S")
	public short aShort85;

	@OriginalMember(owner = "client!qda", name = "x", descriptor = "S")
	public short aShort83;

	@OriginalMember(owner = "client!qda", name = "y", descriptor = "S")
	public short aShort84;

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
	protected Class6_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) byte arg10) {
		this.aByte97 = arg10;
		this.aBoolean568 = arg9;
		super.anInt8761 = arg2;
		this.aShort86 = (short) arg6;
		super.aByte112 = (byte) arg0;
		this.aShort85 = (short) arg5;
		this.aShort83 = (short) arg7;
		super.anInt8759 = arg3;
		super.aByte111 = (byte) arg1;
		this.aShort84 = (short) arg8;
		super.anInt8764 = arg4;
	}

	@OriginalMember(owner = "client!qda", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method7327() {
		for (@Pc(14) int local14 = this.aShort85; local14 <= this.aShort86; local14++) {
			for (@Pc(19) int local19 = this.aShort83; local19 <= this.aShort84; local19++) {
				@Pc(28) int local28 = Static74.anInt1648 + local14 - Static350.anInt6287;
				if (local28 >= 0 && local28 < Static557.aBooleanArrayArray9.length) {
					@Pc(46) int local46 = Static74.anInt1648 + local19 - Static148.anInt3061;
					if (local46 >= 0 && local46 < Static557.aBooleanArrayArray9.length && Static557.aBooleanArrayArray9[local28][local46]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qda", name = "f", descriptor = "(B)Z")
	@Override
	public final boolean method7320() {
		return Static560.method7634(this.method7328(), this.aShort83, this.aShort86, super.aByte111, this.aShort84, this.aShort85);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "([Lclient!gga;I)I")
	@Override
	public final int method7315(@OriginalArg(0) Class2_Sub14[] arg0) {
		@Pc(15) int local15 = 0;
		@Pc(23) int local23;
		@Pc(46) int local46;
		@Pc(56) int local56;
		label112: for (@Pc(18) int local18 = this.aShort85; local18 <= this.aShort86; local18++) {
			label110: for (local23 = this.aShort83; local23 <= this.aShort84; local23++) {
				@Pc(34) long local34 = Static501.aLongArrayArrayArray1[super.aByte112][local18][local23];
				@Pc(36) long local36 = 0L;
				while (true) {
					label105: while (true) {
						if (local36 > 48L) {
							continue label110;
						}
						local46 = (int) (local34 >>> (int) local36 & 0xFFFFL);
						if (local46 <= 0) {
							continue label110;
						}
						@Pc(54) Class265 local54 = Static237.aClass265Array2[local46 - 1];
						for (local56 = 0; local56 < local15; local56++) {
							if (arg0[local56] == local54.aClass2_Sub14_3) {
								local36 += 16L;
								continue label105;
							}
						}
						arg0[local15++] = local54.aClass2_Sub14_3;
						if (local15 == 4) {
							break label112;
						}
						local36 += 16L;
					}
				}
			}
		}
		for (local23 = local15; local23 < 4; local23++) {
			arg0[local23] = null;
		}
		if (this.aByte97 != 0) {
			local46 = this.aShort85 - Static350.anInt6287;
			@Pc(144) int local144 = this.aShort83 - Static148.anInt3061;
			@Pc(168) int local168;
			@Pc(160) short local160;
			@Pc(163) short local163;
			@Pc(157) int local157;
			if (this.aByte97 == 1) {
				if (local144 <= local46) {
					local160 = this.aShort83;
					local157 = this.aShort85 - 1;
					local163 = this.aShort85;
					local168 = this.aShort83 + 1;
				} else {
					local157 = this.aShort85 + 1;
					local168 = this.aShort83 - 1;
					local163 = this.aShort85;
					local160 = this.aShort83;
				}
			} else if (local144 <= -local46) {
				local157 = this.aShort85 + 1;
				local160 = this.aShort83;
				local163 = this.aShort85;
				local168 = this.aShort83 + 1;
			} else {
				local168 = this.aShort83 - 1;
				local157 = this.aShort85 - 1;
				local163 = this.aShort85;
				local160 = this.aShort83;
			}
			label76: for (local56 = 0; local56 < local15; local56++) {
				@Pc(238) long local238 = Static501.aLongArrayArrayArray1[super.aByte112][local163][local168];
				@Pc(249) Class265 local249;
				while (local238 != 0L) {
					local249 = Static237.aClass265Array2[(int) ((local238 & 0xFFFFL) - 1L)];
					local238 >>>= 0x10;
					if (local249.aClass2_Sub14_3 == arg0[local56]) {
						continue label76;
					}
				}
				local238 = Static501.aLongArrayArrayArray1[super.aByte112][local157][local160];
				while (local238 != 0L) {
					local249 = Static237.aClass265Array2[(int) ((local238 & 0xFFFFL) - 1L)];
					local238 >>>= 0x10;
					if (local249.aClass2_Sub14_3 == arg0[local56]) {
						continue label76;
					}
				}
				for (@Pc(305) int local305 = local56; local305 < local15 - 1; local305++) {
					arg0[local305] = arg0[local305 + 1];
				}
				local15--;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!qda", name = "h", descriptor = "(I)V")
	public void method6152() {
	}
}
