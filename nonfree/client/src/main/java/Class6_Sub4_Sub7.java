import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cfa")
public final class Class6_Sub4_Sub7 extends Class6_Sub4 {

	@OriginalMember(owner = "client!cfa", name = "A", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!cfa", name = "E", descriptor = "[S")
	private short[] aShortArray10;

	@OriginalMember(owner = "client!cfa", name = "z", descriptor = "Z")
	public boolean aBoolean68 = true;

	@OriginalMember(owner = "client!cfa", name = "F", descriptor = "I")
	public int anInt1258 = 1638;

	@OriginalMember(owner = "client!cfa", name = "H", descriptor = "I")
	public int anInt1260 = 4;

	@OriginalMember(owner = "client!cfa", name = "L", descriptor = "I")
	public int anInt1263 = 4;

	@OriginalMember(owner = "client!cfa", name = "K", descriptor = "I")
	public int anInt1262 = 0;

	@OriginalMember(owner = "client!cfa", name = "P", descriptor = "[B")
	private byte[] aByteArray8 = new byte[512];

	@OriginalMember(owner = "client!cfa", name = "R", descriptor = "I")
	public int anInt1268 = 4;

	@OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IILclient!ji;)V")
	@Override
	public void method7750(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (arg0 == 0) {
			this.aBoolean68 = arg1.method6069() == 1;
		} else if (arg0 == 1) {
			this.anInt1260 = arg1.method6069();
		} else if (arg0 == 2) {
			this.anInt1258 = arg1.method6058();
			if (this.anInt1258 < 0) {
				this.aShortArray9 = new short[this.anInt1260];
				for (@Pc(75) int local75 = 0; local75 < this.anInt1260; local75++) {
					this.aShortArray9[local75] = (short) arg1.method6058();
				}
			}
		} else if (arg0 == 3) {
			this.anInt1268 = this.anInt1263 = arg1.method6069();
		} else if (arg0 == 4) {
			this.anInt1262 = arg1.method6069();
		} else if (arg0 == 5) {
			this.anInt1268 = arg1.method6069();
		} else if (arg0 == 6) {
			this.anInt1263 = arg1.method6069();
		}
	}

	@OriginalMember(owner = "client!cfa", name = "b", descriptor = "(B)V")
	@Override
	public void method7754() {
		this.aByteArray8 = Static285.method4648(this.anInt1262);
		this.method1250();
		for (@Pc(25) int local25 = this.anInt1260 - 1; local25 >= 1; local25--) {
			@Pc(32) short local32 = this.aShortArray9[local25];
			if (local32 > 8) {
				return;
			}
			if (local32 < -8) {
				return;
			}
			this.anInt1260--;
		}
	}

	@OriginalMember(owner = "client!cfa", name = "g", descriptor = "(I)V")
	private void method1250() {
		@Pc(27) int local27;
		if (this.anInt1258 > 0) {
			this.aShortArray10 = new short[this.anInt1260];
			this.aShortArray9 = new short[this.anInt1260];
			for (local27 = 0; local27 < this.anInt1260; local27++) {
				this.aShortArray9[local27] = (short) (Math.pow((double) ((float) this.anInt1258 / 4096.0F), (double) local27) * 4096.0D);
				this.aShortArray10[local27] = (short) Math.pow(2.0D, (double) local27);
			}
		} else if (this.aShortArray9 != null && this.aShortArray9.length == this.anInt1260) {
			this.aShortArray10 = new short[this.anInt1260];
			for (local27 = 0; local27 < this.anInt1260; local27++) {
				this.aShortArray10[local27] = (short) Math.pow(2.0D, (double) local27);
			}
		}
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIIIIII)I")
	private int method1251(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = arg3 >> 12;
		@Pc(19) int local19 = local15 + 1;
		if (local19 >= arg4) {
			local19 = 0;
		}
		local15 &= 0xFF;
		@Pc(36) int local36 = arg3 & 0xFFF;
		@Pc(40) int local40 = arg1 - 4096;
		@Pc(44) int local44 = local36 - 4096;
		local19 &= 0xFF;
		@Pc(58) int local58 = this.aByteArray8[local15 + arg5] & 0x3;
		@Pc(62) int local62 = Class174_Sub3_Sub1.anIntArray400[local36];
		@Pc(81) int local81;
		if (local58 > 1) {
			local81 = local58 == 2 ? local36 - arg1 : -local36 - arg1;
		} else {
			local81 = local58 == 0 ? arg1 + local36 : arg1 - local36;
		}
		local58 = this.aByteArray8[local19 + arg5] & 0x3;
		@Pc(125) int local125;
		if (local58 > 1) {
			local125 = local58 == 2 ? local44 - arg1 : -arg1 + -local44;
		} else {
			local125 = local58 == 0 ? arg1 + local44 : arg1 + -local44;
		}
		@Pc(148) int local148 = ((local125 - local81) * local62 >> 12) + local81;
		local58 = this.aByteArray8[local15 + arg2] & 0x3;
		if (local58 <= 1) {
			local81 = local58 == 0 ? local40 + local36 : local40 - local36;
		} else {
			local81 = local58 == 2 ? local36 - local40 : -local36 + -local40;
		}
		local58 = this.aByteArray8[local19 + arg2] & 0x3;
		if (local58 > 1) {
			local125 = local58 == 2 ? local44 - local40 : -local40 + -local44;
		} else {
			local125 = local58 == 0 ? local44 + local40 : -local44 + local40;
		}
		@Pc(248) int local248 = ((local125 - local81) * local62 >> 12) + local81;
		return (arg0 * (local248 - local148) >> 12) + local148;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(BI[I)V")
	public void method1252(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(12) int local12 = this.anInt1263 * Static501.anIntArray637[arg0];
		@Pc(109) int local109;
		@Pc(125) int local125;
		@Pc(36) int local36;
		@Pc(29) short local29;
		@Pc(100) int local100;
		@Pc(56) int local56;
		@Pc(43) int local43;
		@Pc(50) int local50;
		@Pc(86) int local86;
		@Pc(60) int local60;
		@Pc(64) int local64;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (this.anInt1260 == 1) {
			local29 = this.aShortArray9[0];
			local36 = this.aShortArray10[0] << 12;
			local43 = local36 * this.anInt1268 >> 12;
			local50 = local36 * this.anInt1263 >> 12;
			local56 = local12 * local36 >> 12;
			local60 = local56 >> 12;
			local64 = local60 + 1;
			local56 &= 0xFFF;
			if (local64 >= local50) {
				local64 = 0;
			}
			local82 = this.aByteArray8[local60 & 0xFF] & 0xFF;
			local86 = Class174_Sub3_Sub1.anIntArray400[local56];
			local95 = this.aByteArray8[local64 & 0xFF] & 0xFF;
			if (this.aBoolean68) {
				for (local100 = 0; local100 < Static408.anInt7209; local100++) {
					local109 = this.anInt1268 * Static398.anIntArray514[local100];
					local125 = this.method1251(local86, local56, local95, local109 * local36 >> 12, local43, local82);
					local125 = local29 * local125 >> 12;
					arg1[local100] = (local125 >> 1) + 2048;
				}
			} else {
				for (local100 = 0; local100 < Static408.anInt7209; local100++) {
					local109 = Static398.anIntArray514[local100] * this.anInt1268;
					local125 = this.method1251(local86, local56, local95, local36 * local109 >> 12, local43, local82);
					arg1[local100] = local125 * local29 >> 12;
				}
			}
			return;
		}
		local29 = this.aShortArray9[0];
		if (local29 > 8 || local29 < -8) {
			local36 = this.aShortArray10[0] << 12;
			local50 = local36 * this.anInt1263 >> 12;
			local43 = this.anInt1268 * local36 >> 12;
			local56 = local12 * local36 >> 12;
			local60 = local56 >> 12;
			local64 = local60 + 1;
			@Pc(234) int local234 = local56 & 0xFFF;
			if (local50 <= local64) {
				local64 = 0;
			}
			local95 = this.aByteArray8[local64 & 0xFF] & 0xFF;
			local86 = Class174_Sub3_Sub1.anIntArray400[local234];
			local82 = this.aByteArray8[local60 & 0xFF] & 0xFF;
			for (local100 = 0; local100 < Static408.anInt7209; local100++) {
				local109 = Static398.anIntArray514[local100] * this.anInt1268;
				local125 = this.method1251(local86, local234, local95, local109 * local36 >> 12, local43, local82);
				arg1[local100] = local29 * local125 >> 12;
			}
		}
		for (@Pc(308) int local308 = 1; local308 < this.anInt1260; local308++) {
			local29 = this.aShortArray9[local308];
			if (local29 > 8 || local29 < -8) {
				local36 = this.aShortArray10[local308] << 12;
				local56 = local12 * local36 >> 12;
				local43 = this.anInt1268 * local36 >> 12;
				local50 = local36 * this.anInt1263 >> 12;
				local60 = local56 >> 12;
				local64 = local60 + 1;
				local56 &= 0xFFF;
				if (local64 >= local50) {
					local64 = 0;
				}
				local82 = this.aByteArray8[local60 & 0xFF] & 0xFF;
				local86 = Class174_Sub3_Sub1.anIntArray400[local56];
				local95 = this.aByteArray8[local64 & 0xFF] & 0xFF;
				if (this.aBoolean68 && this.anInt1260 - 1 == local308) {
					for (local100 = 0; local100 < Static408.anInt7209; local100++) {
						local109 = this.anInt1268 * Static398.anIntArray514[local100];
						local125 = this.method1251(local86, local56, local95, local109 * local36 >> 12, local43, local82);
						local125 = (local29 * local125 >> 12) + arg1[local100];
						arg1[local100] = (local125 >> 1) + 2048;
					}
				} else {
					for (local100 = 0; local100 < Static408.anInt7209; local100++) {
						local109 = Static398.anIntArray514[local100] * this.anInt1268;
						local125 = this.method1251(local86, local56, local95, local36 * local109 >> 12, local43, local82);
						arg1[local100] += local125 * local29 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7753(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass187_41.method4558(arg0);
		if (super.aClass187_41.aBoolean374) {
			this.method1252(arg0, local17);
		}
		return local17;
	}
}
