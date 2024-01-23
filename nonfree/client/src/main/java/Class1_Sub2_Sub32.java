import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class1_Sub2_Sub32 extends Class1_Sub2 {

	@OriginalMember(owner = "client!td", name = "gb", descriptor = "[S")
	private short[] aShortArray56;

	@OriginalMember(owner = "client!td", name = "lb", descriptor = "[S")
	private short[] aShortArray57;

	@OriginalMember(owner = "client!td", name = "U", descriptor = "I")
	private int anInt4063 = 1638;

	@OriginalMember(owner = "client!td", name = "Z", descriptor = "Z")
	private boolean aBoolean227 = true;

	@OriginalMember(owner = "client!td", name = "X", descriptor = "I")
	private int anInt4066 = 0;

	@OriginalMember(owner = "client!td", name = "cb", descriptor = "I")
	private int anInt4070 = 4;

	@OriginalMember(owner = "client!td", name = "db", descriptor = "[B")
	private byte[] aByteArray58 = new byte[512];

	@OriginalMember(owner = "client!td", name = "eb", descriptor = "I")
	private int anInt4071 = 4;

	@OriginalMember(owner = "client!td", name = "W", descriptor = "I")
	private int anInt4065 = 4;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIBIIII)I")
	private int method2973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg4 - 4096;
		@Pc(21) int local21 = arg5 >> 12;
		@Pc(25) int local25 = local21 + 1;
		@Pc(29) int local29 = local21 & 0xFF;
		if (local25 >= arg1) {
			local25 = 0;
		}
		@Pc(48) int local48 = this.aByteArray58[local29 + arg3] & 0x3;
		local25 &= 0xFF;
		@Pc(56) int local56 = arg5 & 0xFFF;
		@Pc(73) int local73;
		if (local48 <= 1) {
			local73 = local48 == 0 ? local56 + arg4 : -local56 + arg4;
		} else {
			local73 = local48 == 2 ? local56 - arg4 : -local56 + -arg4;
		}
		@Pc(93) int local93 = Class1_Sub1_Sub14_Sub1.anIntArray593[local56];
		local48 = this.aByteArray58[arg3 + local25] & 0x3;
		@Pc(106) int local106 = local56 - 4096;
		@Pc(125) int local125;
		if (local48 <= 1) {
			local125 = local48 == 0 ? local106 + arg4 : -local106 + arg4;
		} else {
			local125 = local48 == 2 ? local106 - arg4 : -local106 + -arg4;
		}
		local48 = this.aByteArray58[arg0 + local29] & 0x3;
		@Pc(161) int local161 = local73 + (local93 * (local125 - local73) >> 12);
		if (local48 <= 1) {
			local73 = local48 == 0 ? local9 + local56 : local9 - local56;
		} else {
			local73 = local48 == 2 ? local56 - local9 : -local56 + -local9;
		}
		local48 = this.aByteArray58[local25 + arg0] & 0x3;
		if (local48 <= 1) {
			local125 = local48 == 0 ? local9 + local106 : local9 + -local106;
		} else {
			local125 = local48 == 2 ? local106 - local9 : -local9 + -local106;
		}
		@Pc(246) int local246 = local73 + ((local125 - local73) * local93 >> 12);
		return ((local246 - local161) * arg2 >> 12) + local161;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3505(@OriginalArg(1) int arg0) {
		@Pc(5) int[] local5 = super.aClass102_41.method3129(arg0);
		if (super.aClass102_41.aBoolean239) {
			this.method2976(local5, arg0);
		}
		return local5;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "([IBI)V")
	private void method2976(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = Static128.anIntArray362[arg1] * this.anInt4071;
		@Pc(108) int local108;
		@Pc(122) int local122;
		@Pc(30) int local30;
		@Pc(48) short local48;
		@Pc(99) int local99;
		@Pc(43) int local43;
		@Pc(37) int local37;
		@Pc(72) int local72;
		@Pc(94) int local94;
		@Pc(52) int local52;
		@Pc(65) int local65;
		@Pc(61) int local61;
		@Pc(86) int local86;
		if (this.anInt4070 == 1) {
			local30 = this.aShortArray56[0] << 12;
			local37 = this.anInt4065 * local30 >> 12;
			local43 = local8 * local30 >> 12;
			local48 = this.aShortArray57[0];
			local52 = local43 >> 12;
			local61 = this.aByteArray58[local52 & 0xFF] & 0xFF;
			local65 = local52 + 1;
			local72 = local30 * this.anInt4071 >> 12;
			if (local65 >= local72) {
				local65 = 0;
			}
			local86 = this.aByteArray58[local65 & 0xFF] & 0xFF;
			local43 &= 0xFFF;
			local94 = Class1_Sub1_Sub14_Sub1.anIntArray593[local43];
			if (this.aBoolean227) {
				for (local99 = 0; local99 < Static105.anInt2391; local99++) {
					local108 = this.anInt4065 * Static63.anIntArray182[local99];
					local122 = this.method2973(local86, local37, local94, local61, local43, local108 * local30 >> 12);
					local122 = local48 * local122 >> 12;
					arg0[local99] = (local122 >> 1) + 2048;
				}
			} else {
				for (local99 = 0; local99 < Static105.anInt2391; local99++) {
					local108 = Static63.anIntArray182[local99] * this.anInt4065;
					local122 = this.method2973(local86, local37, local94, local61, local43, local30 * local108 >> 12);
					arg0[local99] = local48 * local122 >> 12;
				}
			}
			return;
		}
		local48 = this.aShortArray57[0];
		if (local48 > 8 || local48 < -8) {
			local30 = this.aShortArray56[0] << 12;
			local43 = local30 * local8 >> 12;
			local72 = local30 * this.anInt4071 >> 12;
			local52 = local43 >> 12;
			local65 = local52 + 1;
			if (local65 >= local72) {
				local65 = 0;
			}
			local86 = this.aByteArray58[local65 & 0xFF] & 0xFF;
			local61 = this.aByteArray58[local52 & 0xFF] & 0xFF;
			local37 = this.anInt4065 * local30 >> 12;
			local43 &= 0xFFF;
			local94 = Class1_Sub1_Sub14_Sub1.anIntArray593[local43];
			for (local99 = 0; local99 < Static105.anInt2391; local99++) {
				local108 = this.anInt4065 * Static63.anIntArray182[local99];
				local122 = this.method2973(local86, local37, local94, local61, local43, local108 * local30 >> 12);
				arg0[local99] = local48 * local122 >> 12;
			}
		}
		for (@Pc(306) int local306 = 1; local306 < this.anInt4070; local306++) {
			local48 = this.aShortArray57[local306];
			if (local48 > 8 || local48 < -8) {
				local30 = this.aShortArray56[local306] << 12;
				local43 = local8 * local30 >> 12;
				local72 = local30 * this.anInt4071 >> 12;
				local52 = local43 >> 12;
				local37 = this.anInt4065 * local30 >> 12;
				local43 &= 0xFFF;
				local94 = Class1_Sub1_Sub14_Sub1.anIntArray593[local43];
				local61 = this.aByteArray58[local52 & 0xFF] & 0xFF;
				local65 = local52 + 1;
				if (local65 >= local72) {
					local65 = 0;
				}
				local86 = this.aByteArray58[local65 & 0xFF] & 0xFF;
				if (this.aBoolean227 && local306 == this.anInt4070 - 1) {
					for (local99 = 0; local99 < Static105.anInt2391; local99++) {
						local108 = this.anInt4065 * Static63.anIntArray182[local99];
						local122 = this.method2973(local86, local37, local94, local61, local43, local108 * local30 >> 12);
						local122 = (local122 * local48 >> 12) + arg0[local99];
						arg0[local99] = (local122 >> 1) + 2048;
					}
				} else {
					for (local99 = 0; local99 < Static105.anInt2391; local99++) {
						local108 = this.anInt4065 * Static63.anIntArray182[local99];
						local122 = this.method2973(local86, local37, local94, local61, local43, local108 * local30 >> 12);
						arg0[local99] += local48 * local122 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!nc;ZI)V")
	@Override
	public void method3513(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean227 = arg0.method895() == 1;
		} else if (arg1 == 1) {
			this.anInt4070 = arg0.method895();
		} else if (arg1 == 2) {
			this.anInt4063 = arg0.method932();
			if (this.anInt4063 < 0) {
				this.aShortArray57 = new short[this.anInt4070];
				for (@Pc(68) int local68 = 0; local68 < this.anInt4070; local68++) {
					this.aShortArray57[local68] = (short) arg0.method932();
				}
			}
		} else if (arg1 == 3) {
			this.anInt4065 = this.anInt4071 = arg0.method895();
		} else if (arg1 == 4) {
			this.anInt4066 = arg0.method895();
		} else if (arg1 == 5) {
			this.anInt4065 = arg0.method895();
		} else if (arg1 == 6) {
			this.anInt4071 = arg0.method895();
		}
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V")
	@Override
	public void method3503() {
		this.aByteArray58 = Static115.method1970(this.anInt4066);
		this.method2978();
		for (@Pc(15) int local15 = this.anInt4070 - 1; local15 >= 1; local15--) {
			@Pc(30) short local30 = this.aShortArray57[local15];
			if (local30 > 8 || local30 < -8) {
				break;
			}
			this.anInt4070--;
		}
	}

	@OriginalMember(owner = "client!td", name = "g", descriptor = "(I)V")
	private void method2978() {
		@Pc(16) int local16;
		if (this.anInt4063 > 0) {
			this.aShortArray56 = new short[this.anInt4070];
			this.aShortArray57 = new short[this.anInt4070];
			for (local16 = 0; local16 < this.anInt4070; local16++) {
				this.aShortArray57[local16] = (short) (Math.pow((double) ((float) this.anInt4063 / 4096.0F), (double) local16) * 4096.0D);
				this.aShortArray56[local16] = (short) Math.pow(2.0D, (double) local16);
			}
		} else if (this.aShortArray57 != null && this.aShortArray57.length == this.anInt4070) {
			this.aShortArray56 = new short[this.anInt4070];
			for (local16 = 0; local16 < this.anInt4070; local16++) {
				this.aShortArray56[local16] = (short) Math.pow(2.0D, (double) local16);
			}
		}
	}
}
