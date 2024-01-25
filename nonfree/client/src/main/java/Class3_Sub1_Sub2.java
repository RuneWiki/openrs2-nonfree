import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public abstract class Class3_Sub1_Sub2 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ar", name = "N", descriptor = "B")
	public final byte aByte143;

	@OriginalMember(owner = "client!ar", name = "K", descriptor = "Z")
	public final boolean aBoolean772;

	@OriginalMember(owner = "client!ar", name = "I", descriptor = "S")
	public short aShort122;

	@OriginalMember(owner = "client!ar", name = "J", descriptor = "S")
	public short aShort123;

	@OriginalMember(owner = "client!ar", name = "P", descriptor = "S")
	public short aShort125;

	@OriginalMember(owner = "client!ar", name = "M", descriptor = "S")
	public short aShort124;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
	protected Class3_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) byte arg10) {
		super.aByte141 = (byte) arg0;
		this.aByte143 = arg10;
		this.aBoolean772 = arg9;
		this.aShort122 = (short) arg8;
		this.aShort123 = (short) arg6;
		this.aShort125 = (short) arg7;
		super.anInt9915 = arg3;
		super.aByte142 = (byte) arg1;
		this.aShort124 = (short) arg5;
		super.anInt9917 = arg4;
		super.anInt9925 = arg2;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(B[Lclient!kp;)I")
	@Override
	public final int method8498(@OriginalArg(1) Class4_Sub29[] arg0) {
		@Pc(7) int local7 = 0;
		@Pc(15) int local15;
		@Pc(38) int local38;
		@Pc(50) int local50;
		label113: for (@Pc(10) int local10 = this.aShort124; local10 <= this.aShort123; local10++) {
			label111: for (local15 = this.aShort125; local15 <= this.aShort122; local15++) {
				@Pc(26) long local26 = Static432.aLongArrayArrayArray1[super.aByte141][local10][local15];
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
						@Pc(48) Class85 local48 = Static217.aClass85Array1[local38 - 1];
						for (local50 = 0; local50 < local7; local50++) {
							if (arg0[local50] == local48.aClass4_Sub29_2) {
								local28 += 16L;
								continue label106;
							}
						}
						arg0[local7++] = local48.aClass4_Sub29_2;
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
		if (this.aByte143 != 0) {
			local38 = this.aShort124 - Static323.anInt5049;
			@Pc(143) int local143 = this.aShort125 - Static417.anInt6041;
			@Pc(156) int local156;
			@Pc(164) short local164;
			@Pc(167) short local167;
			@Pc(161) int local161;
			if (this.aByte143 == 1) {
				if (local143 > local38) {
					local167 = this.aShort124;
					local164 = this.aShort125;
					local156 = this.aShort125 - 1;
					local161 = this.aShort124 + 1;
				} else {
					local164 = this.aShort125;
					local161 = this.aShort124 - 1;
					local167 = this.aShort124;
					local156 = this.aShort125 + 1;
				}
			} else if (-local38 < local143) {
				local156 = this.aShort125 - 1;
				local161 = this.aShort124 - 1;
				local164 = this.aShort125;
				local167 = this.aShort124;
			} else {
				local164 = this.aShort125;
				local156 = this.aShort125 + 1;
				local161 = this.aShort124 + 1;
				local167 = this.aShort124;
			}
			label77: for (local50 = 0; local50 < local7; local50++) {
				@Pc(241) long local241 = Static432.aLongArrayArrayArray1[super.aByte141][local167][local156];
				@Pc(252) Class85 local252;
				while (local241 != 0L) {
					local252 = Static217.aClass85Array1[(int) ((local241 & 0xFFFFL) - 1L)];
					local241 >>>= 0x10;
					if (arg0[local50] == local252.aClass4_Sub29_2) {
						continue label77;
					}
				}
				local241 = Static432.aLongArrayArrayArray1[super.aByte141][local161][local164];
				while (local241 != 0L) {
					local252 = Static217.aClass85Array1[(int) ((local241 & 0xFFFFL) - 1L)];
					local241 >>>= 0x10;
					if (arg0[local50] == local252.aClass4_Sub29_2) {
						continue label77;
					}
				}
				for (@Pc(308) int local308 = local50; local308 < local7 - 1; local308++) {
					arg0[local308] = arg0[local308 + 1];
				}
				local7--;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ar", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method8503() {
		for (@Pc(13) int local13 = this.aShort124; local13 <= this.aShort123; local13++) {
			for (@Pc(18) int local18 = this.aShort125; local18 <= this.aShort122; local18++) {
				@Pc(27) int local27 = local13 + Static112.anInt2200 - Static323.anInt5049;
				if (local27 >= 0 && Static537.aBooleanArrayArray32.length > local27) {
					@Pc(48) int local48 = local18 + Static112.anInt2200 - Static417.anInt6041;
					if (local48 >= 0 && Static537.aBooleanArrayArray32.length > local48 && Static537.aBooleanArrayArray32[local27][local48]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ar", name = "e", descriptor = "(B)V")
	public void method8508() {
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!ha;B)Z")
	@Override
	public final boolean method8490(@OriginalArg(0) Class33 arg0) {
		return Static216.method3226(this.aShort124, this.aShort123, super.aByte142, this.aShort122, this.method8507(arg0), this.aShort125);
	}
}
