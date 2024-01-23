import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class4_Sub6_Sub2 extends Class4_Sub6 {

	@OriginalMember(owner = "client!bg", name = "U", descriptor = "[S")
	private short[] aShortArray1;

	@OriginalMember(owner = "client!bg", name = "ab", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!bg", name = "J", descriptor = "Z")
	public boolean aBoolean27 = true;

	@OriginalMember(owner = "client!bg", name = "M", descriptor = "I")
	public int anInt408 = 4;

	@OriginalMember(owner = "client!bg", name = "R", descriptor = "I")
	public int anInt413 = 4;

	@OriginalMember(owner = "client!bg", name = "P", descriptor = "I")
	public int anInt411 = 1638;

	@OriginalMember(owner = "client!bg", name = "Q", descriptor = "I")
	public int anInt412 = 0;

	@OriginalMember(owner = "client!bg", name = "W", descriptor = "I")
	public int anInt417 = 4;

	@OriginalMember(owner = "client!bg", name = "L", descriptor = "[B")
	private byte[] aByteArray4 = new byte[512];

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIIII)I")
	private int method352(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg0 - 4096;
		@Pc(13) int local13 = arg1 >> 12;
		@Pc(17) int local17 = local13 + 1;
		if (arg4 <= local17) {
			local17 = 0;
		}
		@Pc(32) int local32 = arg1 & 0xFFF;
		local13 &= 0xFF;
		local17 &= 0xFF;
		@Pc(44) int local44 = local32 - 4096;
		@Pc(48) int local48 = Class32_Sub1_Sub1.anIntArray119[local32];
		@Pc(57) int local57 = this.aByteArray4[arg5 + local13] & 0x3;
		@Pc(72) int local72;
		if (local57 <= 1) {
			local72 = local57 == 0 ? arg0 + local32 : -local32 + arg0;
		} else {
			local72 = local57 == 2 ? local32 - arg0 : -local32 + -arg0;
		}
		local57 = this.aByteArray4[local17 + arg5] & 0x3;
		@Pc(117) int local117;
		if (local57 > 1) {
			local117 = local57 == 2 ? local44 - arg0 : -arg0 + -local44;
		} else {
			local117 = local57 == 0 ? local44 + arg0 : arg0 + -local44;
		}
		local57 = this.aByteArray4[local13 + arg2] & 0x3;
		@Pc(151) int local151 = (local48 * (local117 - local72) >> 12) + local72;
		if (local57 > 1) {
			local72 = local57 == 2 ? local32 - local9 : -local9 + -local32;
		} else {
			local72 = local57 == 0 ? local9 + local32 : local9 + -local32;
		}
		local57 = this.aByteArray4[arg2 + local17] & 0x3;
		if (local57 <= 1) {
			local117 = local57 == 0 ? local44 + local9 : -local44 + local9;
		} else {
			local117 = local57 == 2 ? local44 - local9 : -local44 + -local9;
		}
		@Pc(238) int local238 = local72 + (local48 * (local117 - local72) >> 12);
		return local151 + (arg3 * (local238 - local151) >> 12);
	}

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "(I)V")
	private void method353() {
		@Pc(33) int local33;
		if (this.anInt411 > 0) {
			this.aShortArray2 = new short[this.anInt413];
			this.aShortArray1 = new short[this.anInt413];
			for (local33 = 0; local33 < this.anInt413; local33++) {
				this.aShortArray2[local33] = (short) (Math.pow((double) ((float) this.anInt411 / 4096.0F), (double) local33) * 4096.0D);
				this.aShortArray1[local33] = (short) Math.pow(2.0D, (double) local33);
			}
		} else if (this.aShortArray2 != null && this.anInt413 == this.aShortArray2.length) {
			this.aShortArray1 = new short[this.anInt413];
			for (local33 = 0; local33 < this.anInt413; local33++) {
				this.aShortArray1[local33] = (short) Math.pow(2.0D, (double) local33);
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I[II)V")
	public void method354(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(18) int local18 = Static273.anIntArray127[arg0] * this.anInt408;
		@Pc(115) int local115;
		@Pc(129) int local129;
		@Pc(36) int local36;
		@Pc(29) short local29;
		@Pc(101) int local101;
		@Pc(56) int local56;
		@Pc(43) int local43;
		@Pc(50) int local50;
		@Pc(96) int local96;
		@Pc(60) int local60;
		@Pc(64) int local64;
		@Pc(79) int local79;
		@Pc(88) int local88;
		if (this.anInt413 == 1) {
			local29 = this.aShortArray2[0];
			local36 = this.aShortArray1[0] << 12;
			local43 = local36 * this.anInt417 >> 12;
			local50 = local36 * this.anInt408 >> 12;
			local56 = local36 * local18 >> 12;
			local60 = local56 >> 12;
			local64 = local60 + 1;
			if (local64 >= local50) {
				local64 = 0;
			}
			local79 = this.aByteArray4[local60 & 0xFF] & 0xFF;
			local88 = this.aByteArray4[local64 & 0xFF] & 0xFF;
			local56 &= 0xFFF;
			local96 = Class32_Sub1_Sub1.anIntArray119[local56];
			if (this.aBoolean27) {
				for (local101 = 0; local101 < Static2.anInt19; local101++) {
					local115 = this.anInt417 * Static192.anIntArray318[local101];
					local129 = this.method352(local56, local115 * local36 >> 12, local88, local96, local43, local79);
					local129 = local129 * local29 >> 12;
					arg1[local101] = (local129 >> 1) + 2048;
				}
			} else {
				for (local101 = 0; local101 < Static2.anInt19; local101++) {
					local115 = Static192.anIntArray318[local101] * this.anInt417;
					local129 = this.method352(local56, local36 * local115 >> 12, local88, local96, local43, local79);
					arg1[local101] = local129 * local29 >> 12;
				}
			}
			return;
		}
		local29 = this.aShortArray2[0];
		if (local29 > 8 || local29 < -8) {
			local36 = this.aShortArray1[0] << 12;
			local56 = local36 * local18 >> 12;
			local43 = this.anInt417 * local36 >> 12;
			local60 = local56 >> 12;
			local79 = this.aByteArray4[local60 & 0xFF] & 0xFF;
			local64 = local60 + 1;
			local50 = this.anInt408 * local36 >> 12;
			local56 &= 0xFFF;
			local96 = Class32_Sub1_Sub1.anIntArray119[local56];
			if (local50 <= local64) {
				local64 = 0;
			}
			local88 = this.aByteArray4[local64 & 0xFF] & 0xFF;
			for (local101 = 0; local101 < Static2.anInt19; local101++) {
				local115 = this.anInt417 * Static192.anIntArray318[local101];
				local129 = this.method352(local56, local36 * local115 >> 12, local88, local96, local43, local79);
				arg1[local101] = local29 * local129 >> 12;
			}
		}
		for (@Pc(301) int local301 = 1; local301 < this.anInt413; local301++) {
			local29 = this.aShortArray2[local301];
			if (local29 > 8 || local29 < -8) {
				local36 = this.aShortArray1[local301] << 12;
				local56 = local18 * local36 >> 12;
				local60 = local56 >> 12;
				local79 = this.aByteArray4[local60 & 0xFF] & 0xFF;
				local50 = this.anInt408 * local36 >> 12;
				local56 &= 0xFFF;
				local43 = local36 * this.anInt417 >> 12;
				local96 = Class32_Sub1_Sub1.anIntArray119[local56];
				local64 = local60 + 1;
				if (local64 >= local50) {
					local64 = 0;
				}
				local88 = this.aByteArray4[local64 & 0xFF] & 0xFF;
				if (this.aBoolean27 && this.anInt413 - 1 == local301) {
					for (local101 = 0; local101 < Static2.anInt19; local101++) {
						local115 = Static192.anIntArray318[local101] * this.anInt417;
						local129 = this.method352(local56, local115 * local36 >> 12, local88, local96, local43, local79);
						local129 = arg1[local101] + (local29 * local129 >> 12);
						arg1[local101] = (local129 >> 1) + 2048;
					}
				} else {
					for (local101 = 0; local101 < Static2.anInt19; local101++) {
						local115 = Static192.anIntArray318[local101] * this.anInt417;
						local129 = this.method352(local56, local115 * local36 >> 12, local88, local96, local43, local79);
						arg1[local101] += local29 * local129 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(Z)V")
	@Override
	public void method4370() {
		this.aByteArray4 = Static75.method1151(this.anInt412);
		this.method353();
		for (@Pc(19) int local19 = this.anInt413 - 1; local19 >= 1; local19--) {
			@Pc(29) short local29 = this.aShortArray2[local19];
			if (local29 > 8 || local29 < -8) {
				break;
			}
			this.anInt413--;
		}
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method4375(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = this.aClass156_41.method3763(arg0);
		if (this.aClass156_41.aBoolean307) {
			this.method354(arg0, local9);
		}
		return local9;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!p;II)V")
	@Override
	public void method4381(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean27 = arg0.method1874() == 1;
		} else if (arg1 == 1) {
			this.anInt413 = arg0.method1874();
		} else if (arg1 == 2) {
			this.anInt411 = arg0.method1869();
			if (this.anInt411 < 0) {
				this.aShortArray2 = new short[this.anInt413];
				for (@Pc(87) int local87 = 0; local87 < this.anInt413; local87++) {
					this.aShortArray2[local87] = (short) arg0.method1869();
				}
			}
		} else if (arg1 == 3) {
			this.anInt417 = this.anInt408 = arg0.method1874();
		} else if (arg1 == 4) {
			this.anInt412 = arg0.method1874();
		} else if (arg1 == 5) {
			this.anInt417 = arg0.method1874();
		} else if (arg1 == 6) {
			this.anInt408 = arg0.method1874();
		}
	}
}
