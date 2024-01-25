import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public abstract class Class14_Sub1_Sub1 extends Class14_Sub1 {

	@OriginalMember(owner = "client!fb", name = "I", descriptor = "S")
	public short aShort73;

	@OriginalMember(owner = "client!fb", name = "H", descriptor = "S")
	public short aShort72;

	@OriginalMember(owner = "client!fb", name = "O", descriptor = "S")
	public short aShort74;

	@OriginalMember(owner = "client!fb", name = "B", descriptor = "S")
	public short aShort71;

	@OriginalMember(owner = "client!fb", name = "M", descriptor = "Z")
	public final boolean aBoolean376;

	@OriginalMember(owner = "client!fb", name = "P", descriptor = "B")
	public final byte aByte86;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
	protected Class14_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) byte arg10) {
		this.aShort73 = (short) arg6;
		super.aByte126 = (byte) arg1;
		super.aByte125 = (byte) arg0;
		this.aShort72 = (short) arg8;
		super.anInt9315 = arg4;
		this.aShort74 = (short) arg5;
		this.aShort71 = (short) arg7;
		this.aBoolean376 = arg9;
		super.anInt9321 = arg3;
		super.anInt9317 = arg2;
		this.aByte86 = arg10;
	}

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "(I)Z")
	@Override
	public final boolean method7993() {
		for (@Pc(8) int local8 = this.aShort74; local8 <= this.aShort73; local8++) {
			for (@Pc(18) int local18 = this.aShort71; local18 <= this.aShort72; local18++) {
				@Pc(26) int local26 = local8 + Static597.anInt9765 - Static484.anInt8046;
				if (local26 >= 0 && Static601.aBooleanArrayArray17.length > local26) {
					@Pc(42) int local42 = local18 + Static597.anInt9765 - Static263.anInt4379;
					if (local42 >= 0 && local42 < Static601.aBooleanArrayArray17.length && Static601.aBooleanArrayArray17[local26][local42]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "([Lclient!tn;B)I")
	@Override
	public final int method7990(@OriginalArg(0) Class5_Sub27[] arg0) {
		@Pc(7) int local7 = 0;
		@Pc(20) int local20;
		@Pc(43) int local43;
		@Pc(55) int local55;
		label113: for (@Pc(15) int local15 = this.aShort74; local15 <= this.aShort73; local15++) {
			label111: for (local20 = this.aShort71; local20 <= this.aShort72; local20++) {
				@Pc(31) long local31 = Static484.aLongArrayArrayArray1[super.aByte125][local15][local20];
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
						@Pc(53) Class175 local53 = Static580.aClass175Array12[local43 - 1];
						for (local55 = 0; local55 < local7; local55++) {
							if (local53.aClass5_Sub27_2 == arg0[local55]) {
								local33 += 16L;
								continue label106;
							}
						}
						arg0[local7++] = local53.aClass5_Sub27_2;
						if (local7 == 4) {
							break label113;
						}
						local33 += 16L;
					}
				}
			}
		}
		for (local20 = local7; local20 < 4; local20++) {
			arg0[local20] = null;
		}
		if (this.aByte86 != 0) {
			local43 = this.aShort74 - Static484.anInt8046;
			@Pc(134) int local134 = this.aShort71 - Static263.anInt4379;
			@Pc(157) int local157;
			@Pc(147) short local147;
			@Pc(160) short local160;
			@Pc(152) int local152;
			if (this.aByte86 == 1) {
				if (local134 > local43) {
					local157 = this.aShort71 - 1;
					local160 = this.aShort74;
					local147 = this.aShort71;
					local152 = this.aShort74 + 1;
				} else {
					local157 = this.aShort71 + 1;
					local160 = this.aShort74;
					local147 = this.aShort71;
					local152 = this.aShort74 - 1;
				}
			} else if (local134 <= -local43) {
				local147 = this.aShort71;
				local152 = this.aShort74 + 1;
				local157 = this.aShort71 + 1;
				local160 = this.aShort74;
			} else {
				local147 = this.aShort71;
				local152 = this.aShort74 - 1;
				local160 = this.aShort74;
				local157 = this.aShort71 - 1;
			}
			label77: for (local55 = 0; local55 < local7; local55++) {
				@Pc(230) long local230 = Static484.aLongArrayArrayArray1[super.aByte125][local160][local157];
				@Pc(241) Class175 local241;
				while (local230 != 0L) {
					local241 = Static580.aClass175Array12[(int) ((local230 & 0xFFFFL) - 1L)];
					local230 >>>= 0x10;
					if (local241.aClass5_Sub27_2 == arg0[local55]) {
						continue label77;
					}
				}
				local230 = Static484.aLongArrayArrayArray1[super.aByte125][local152][local147];
				while (local230 != 0L) {
					local241 = Static580.aClass175Array12[(int) ((local230 & 0xFFFFL) - 1L)];
					local230 >>>= 0x10;
					if (local241.aClass5_Sub27_2 == arg0[local55]) {
						continue label77;
					}
				}
				for (@Pc(295) int local295 = local55; local295 < local7 - 1; local295++) {
					arg0[local295] = arg0[local295 + 1];
				}
				local7--;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "(B)V")
	public void method4226() {
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(Lclient!ha;B)Z")
	@Override
	public final boolean method8000(@OriginalArg(0) Class126 arg0) {
		return Static586.method8213(this.aShort74, super.aByte126, this.aShort73, this.method7999(arg0), this.aShort72, this.aShort71);
	}
}
