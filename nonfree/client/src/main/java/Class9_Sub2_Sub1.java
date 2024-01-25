import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ht")
public abstract class Class9_Sub2_Sub1 extends Class9_Sub2 {

	@OriginalMember(owner = "client!ht", name = "E", descriptor = "Z")
	public final boolean aBoolean771;

	@OriginalMember(owner = "client!ht", name = "I", descriptor = "S")
	public short aShort125;

	@OriginalMember(owner = "client!ht", name = "H", descriptor = "B")
	public final byte aByte129;

	@OriginalMember(owner = "client!ht", name = "C", descriptor = "S")
	public short aShort124;

	@OriginalMember(owner = "client!ht", name = "M", descriptor = "S")
	public short aShort127;

	@OriginalMember(owner = "client!ht", name = "J", descriptor = "S")
	public short aShort126;

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
	protected Class9_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) byte arg10) {
		this.aBoolean771 = arg9;
		super.anInt10152 = arg2;
		this.aShort125 = (short) arg8;
		this.aByte129 = arg10;
		this.aShort124 = (short) arg7;
		super.aByte127 = (byte) arg0;
		this.aShort127 = (short) arg6;
		this.aShort126 = (short) arg5;
		super.anInt10158 = arg4;
		super.aByte128 = (byte) arg1;
		super.anInt10154 = arg3;
	}

	@OriginalMember(owner = "client!ht", name = "k", descriptor = "(I)Z")
	@Override
	public final boolean method8602() {
		for (@Pc(8) int local8 = this.aShort126; local8 <= this.aShort127; local8++) {
			for (@Pc(19) int local19 = this.aShort124; local19 <= this.aShort125; local19++) {
				@Pc(28) int local28 = local8 + Static361.anInt6683 - Static281.anInt5392;
				if (local28 >= 0 && Static140.aBooleanArrayArray2.length > local28) {
					@Pc(46) int local46 = Static361.anInt6683 + local19 - Static394.anInt7055;
					if (local46 >= 0 && Static140.aBooleanArrayArray2.length > local46 && Static140.aBooleanArrayArray2[local28][local46]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "([Lclient!tj;B)I")
	@Override
	public final int method8601(@OriginalArg(0) Class3_Sub22[] arg0) {
		@Pc(7) int local7 = 0;
		@Pc(21) int local21;
		@Pc(44) int local44;
		@Pc(59) int local59;
		label113: for (@Pc(16) int local16 = this.aShort126; local16 <= this.aShort127; local16++) {
			label111: for (local21 = this.aShort124; local21 <= this.aShort125; local21++) {
				@Pc(32) long local32 = Static387.aLongArrayArrayArray1[super.aByte127][local16][local21];
				@Pc(34) long local34 = 0L;
				while (true) {
					label106: while (true) {
						if (local34 > 48L) {
							continue label111;
						}
						local44 = (int) (local32 >>> (int) local34 & 0xFFFFL);
						if (local44 <= 0) {
							continue label111;
						}
						@Pc(57) Class339 local57 = Static209.aClass339Array1[local44 - 1];
						for (local59 = 0; local59 < local7; local59++) {
							if (local57.aClass3_Sub22_3 == arg0[local59]) {
								local34 += 16L;
								continue label106;
							}
						}
						arg0[local7++] = local57.aClass3_Sub22_3;
						if (local7 == 4) {
							break label113;
						}
						local34 += 16L;
					}
				}
			}
		}
		for (local21 = local7; local21 < 4; local21++) {
			arg0[local21] = null;
		}
		if (this.aByte129 != 0) {
			local44 = this.aShort126 - Static281.anInt5392;
			@Pc(135) int local135 = this.aShort124 - Static394.anInt7055;
			@Pc(155) int local155;
			@Pc(158) short local158;
			@Pc(145) short local145;
			@Pc(150) int local150;
			if (this.aByte129 == 1) {
				if (local44 >= local135) {
					local145 = this.aShort126;
					local150 = this.aShort126 - 1;
					local155 = this.aShort124 + 1;
					local158 = this.aShort124;
				} else {
					local158 = this.aShort124;
					local155 = this.aShort124 - 1;
					local145 = this.aShort126;
					local150 = this.aShort126 + 1;
				}
			} else if (-local44 < local135) {
				local150 = this.aShort126 - 1;
				local145 = this.aShort126;
				local158 = this.aShort124;
				local155 = this.aShort124 - 1;
			} else {
				local145 = this.aShort126;
				local158 = this.aShort124;
				local150 = this.aShort126 + 1;
				local155 = this.aShort124 + 1;
			}
			label77: for (local59 = 0; local59 < local7; local59++) {
				@Pc(229) long local229 = Static387.aLongArrayArrayArray1[super.aByte127][local145][local155];
				@Pc(240) Class339 local240;
				while (local229 != 0L) {
					local240 = Static209.aClass339Array1[(int) ((local229 & 0xFFFFL) - 1L)];
					local229 >>>= 0x10;
					if (local240.aClass3_Sub22_3 == arg0[local59]) {
						continue label77;
					}
				}
				local229 = Static387.aLongArrayArrayArray1[super.aByte127][local150][local158];
				while (local229 != 0L) {
					local240 = Static209.aClass339Array1[(int) ((local229 & 0xFFFFL) - 1L)];
					local229 >>>= 0x10;
					if (arg0[local59] == local240.aClass3_Sub22_3) {
						continue label77;
					}
				}
				for (@Pc(296) int local296 = local59; local296 < local7 - 1; local296++) {
					arg0[local296] = arg0[local296 + 1];
				}
				local7--;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "(Lclient!ha;B)Z")
	@Override
	public final boolean method8608(@OriginalArg(0) Class82 arg0) {
		return Static447.method6686(this.aShort127, this.aShort125, super.aByte128, this.aShort126, this.method8604(arg0), this.aShort124);
	}

	@OriginalMember(owner = "client!ht", name = "p", descriptor = "(I)V")
	public void method8616() {
	}
}
