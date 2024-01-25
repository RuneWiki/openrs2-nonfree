import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public abstract class Class8_Sub3_Sub3 extends Class8_Sub3 {

	@OriginalMember(owner = "client!mw", name = "t", descriptor = "B")
	public final byte aByte125;

	@OriginalMember(owner = "client!mw", name = "v", descriptor = "Z")
	public final boolean aBoolean731;

	@OriginalMember(owner = "client!mw", name = "A", descriptor = "S")
	public short aShort132;

	@OriginalMember(owner = "client!mw", name = "s", descriptor = "S")
	public short aShort130;

	@OriginalMember(owner = "client!mw", name = "x", descriptor = "S")
	public short aShort131;

	@OriginalMember(owner = "client!mw", name = "C", descriptor = "S")
	public short aShort133;

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
	protected Class8_Sub3_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) byte arg10) {
		this.aByte125 = arg10;
		this.aBoolean731 = arg9;
		super.anInt9361 = arg3;
		super.anInt9370 = arg4;
		super.aByte124 = (byte) arg1;
		super.aByte123 = (byte) arg0;
		this.aShort132 = (short) arg5;
		super.anInt9365 = arg2;
		this.aShort130 = (short) arg8;
		this.aShort131 = (short) arg7;
		this.aShort133 = (short) arg6;
	}

	@OriginalMember(owner = "client!mw", name = "k", descriptor = "(I)Z")
	@Override
	public final boolean method7631() {
		return Static66.method1183(this.aShort131, this.method7618(), this.aShort133, this.aShort130, this.aShort132, super.aByte124);
	}

	@OriginalMember(owner = "client!mw", name = "l", descriptor = "(I)V")
	public void method7633() {
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(I[Lclient!rc;)I")
	@Override
	public final int method7616(@OriginalArg(1) Class1_Sub18[] arg0) {
		@Pc(12) int local12 = 0;
		@Pc(20) int local20;
		@Pc(43) int local43;
		@Pc(55) int local55;
		label113: for (@Pc(15) int local15 = this.aShort132; local15 <= this.aShort133; local15++) {
			label111: for (local20 = this.aShort131; local20 <= this.aShort130; local20++) {
				@Pc(31) long local31 = Static91.aLongArrayArrayArray1[super.aByte123][local15][local20];
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
						@Pc(53) Class79 local53 = Static172.aClass79Array1[local43 - 1];
						for (local55 = 0; local55 < local12; local55++) {
							if (local53.aClass1_Sub18_2 == arg0[local55]) {
								local33 += 16L;
								continue label106;
							}
						}
						arg0[local12++] = local53.aClass1_Sub18_2;
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
		if (this.aByte125 != 0) {
			local43 = this.aShort132 - Static258.anInt4643;
			@Pc(139) int local139 = this.aShort131 - Static312.anInt5339;
			@Pc(157) int local157;
			@Pc(152) short local152;
			@Pc(165) short local165;
			@Pc(162) int local162;
			if (this.aByte125 == 1) {
				if (local43 >= local139) {
					local162 = this.aShort132 - 1;
					local165 = this.aShort132;
					local157 = this.aShort131 + 1;
					local152 = this.aShort131;
				} else {
					local165 = this.aShort132;
					local162 = this.aShort132 + 1;
					local157 = this.aShort131 - 1;
					local152 = this.aShort131;
				}
			} else if (local139 <= -local43) {
				local152 = this.aShort131;
				local157 = this.aShort131 + 1;
				local162 = this.aShort132 + 1;
				local165 = this.aShort132;
			} else {
				local152 = this.aShort131;
				local165 = this.aShort132;
				local157 = this.aShort131 - 1;
				local162 = this.aShort132 - 1;
			}
			label77: for (local55 = 0; local55 < local12; local55++) {
				@Pc(235) long local235 = Static91.aLongArrayArrayArray1[super.aByte123][local165][local157];
				@Pc(246) Class79 local246;
				while (local235 != 0L) {
					local246 = Static172.aClass79Array1[(int) ((local235 & 0xFFFFL) - 1L)];
					local235 >>>= 0x10;
					if (local246.aClass1_Sub18_2 == arg0[local55]) {
						continue label77;
					}
				}
				local235 = Static91.aLongArrayArrayArray1[super.aByte123][local162][local152];
				while (local235 != 0L) {
					local246 = Static172.aClass79Array1[(int) ((local235 & 0xFFFFL) - 1L)];
					local235 >>>= 0x10;
					if (local246.aClass1_Sub18_2 == arg0[local55]) {
						continue label77;
					}
				}
				for (@Pc(302) int local302 = local55; local302 < local12 - 1; local302++) {
					arg0[local302] = arg0[local302 + 1];
				}
				local12--;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "(Z)Z")
	@Override
	public final boolean method7624() {
		for (@Pc(8) int local8 = this.aShort132; local8 <= this.aShort133; local8++) {
			for (@Pc(13) int local13 = this.aShort131; local13 <= this.aShort130; local13++) {
				@Pc(22) int local22 = Static240.anInt4447 + local8 - Static258.anInt4643;
				if (local22 >= 0 && Static44.aBooleanArrayArray1.length > local22) {
					@Pc(37) int local37 = Static240.anInt4447 + local13 - Static312.anInt5339;
					if (local37 >= 0 && Static44.aBooleanArrayArray1.length > local37 && Static44.aBooleanArrayArray1[local22][local37]) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
