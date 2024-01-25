import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class206 {

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "I")
	private int anInt6586;

	@OriginalMember(owner = "client!vp", name = "f", descriptor = "I")
	private int anInt6589;

	@OriginalMember(owner = "client!vp", name = "h", descriptor = "Lclient!wn;")
	private Class95 aClass95_15;

	@OriginalMember(owner = "client!vp", name = "i", descriptor = "I")
	private int anInt6590;

	@OriginalMember(owner = "client!vp", name = "j", descriptor = "I")
	private int anInt6591;

	@OriginalMember(owner = "client!vp", name = "o", descriptor = "I")
	public int anInt6594;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "I")
	private final int anInt6585;

	@OriginalMember(owner = "client!vp", name = "e", descriptor = "I")
	private final int anInt6588;

	@OriginalMember(owner = "client!vp", name = "q", descriptor = "I")
	private final int anInt6596;

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "Z")
	private final boolean aBoolean572;

	@OriginalMember(owner = "client!vp", name = "n", descriptor = "I")
	private final int anInt6593;

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "I")
	private final int anInt6587;

	@OriginalMember(owner = "client!vp", name = "l", descriptor = "I")
	private final int anInt6592;

	@OriginalMember(owner = "client!vp", name = "p", descriptor = "I")
	private final int anInt6595;

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt6585 = arg2;
		this.anInt6588 = arg3;
		this.anInt6596 = arg4;
		this.aBoolean572 = arg7;
		this.anInt6593 = arg1;
		this.anInt6587 = arg6;
		this.anInt6592 = arg5;
		this.anInt6595 = arg0;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!ea;Lclient!vp;)V")
	private void method5867(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class206 arg1) {
		Static341.method5870(arg0);
		Static341.method5866(arg0);
		arg0.method5203(Static341.anIntArray617);
		arg0.method5258(0, 0, this.anInt6591, this.anInt6591);
		arg0.method5256();
		arg0.method5205(0, 0, this.anInt6591, this.anInt6591, this.anInt6587 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean572) {
				local31 = -arg1.anInt6585;
				local33 = -arg1.anInt6588;
				local35 = -arg1.anInt6596;
			} else {
				local31 = arg1.anInt6585 - this.anInt6585;
				local33 = arg1.anInt6588 - this.anInt6588;
				local35 = arg1.anInt6596 - this.anInt6596;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt6586 != 0) {
			local79 = Class187.anIntArray571[this.anInt6586];
			local84 = Class187.anIntArray570[this.anInt6586];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt6589 != 0) {
			local79 = Class187.anIntArray571[this.anInt6589];
			local84 = Class187.anIntArray570[this.anInt6589];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class112 local147 = Static341.aClass112_7.method4349((byte) 0, 25600, true);
		if (arg0.method5170()) {
			local147.method4319((short) 0, (short) this.anInt6593);
		} else {
			local147.method4351((short) 127, Static27.anInterface3_1.method1511(this.anInt6593).aShort84);
			local147.method4319((short) 0, (short) -1);
		}
		arg0.method5223(1.0F);
		arg0.method5221(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt6591 * 1024 / (local147.method4326() - local147.method4310());
		if (this.anInt6587 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.method5161(this.anInt6591 / 2, this.anInt6591 / 2, local84, local84);
		arg0.method5252(arg0.method5173());
		@Pc(223) Class66 local223 = arg0.method5173();
		local223.method5822(0, 0, arg0.method5217() - local147.method4305());
		local147.method4323(local223, null, 1024);
		@Pc(245) int local245 = this.anInt6591 * 13 / 16;
		@Pc(252) int local252 = (this.anInt6591 - local245) / 2;
		Static341.aClass95_16.method5493(local252, local252, local245, local245, 1, this.anInt6587 | 0xFF000000, 1);
		this.aClass95_15 = arg0.method5157(0, 0, this.anInt6591, this.anInt6591, true);
		arg0.method5256();
		arg0.method5205(0, 0, this.anInt6591, this.anInt6591, 0, 0);
		Static341.aClass95_17.method5493(0, 0, this.anInt6591, this.anInt6591, 0, 0, 0);
		this.aClass95_15.method5499(0);
		arg0.method5258(Static341.anIntArray617[0], Static341.anIntArray617[1], Static341.anIntArray617[2], Static341.anIntArray617[3]);
	}

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "()V")
	public void method5868() {
		this.aClass95_15 = null;
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(Lclient!ea;Lclient!vp;)Z")
	public boolean method5869(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class206 arg1) {
		return this.aClass95_15 != null || this.method5872(arg0, arg1);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!ea;IIIIII)V")
	public void method5871(@OriginalArg(0) Class55 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass95_15 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt6586 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt6589 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt6590) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt6590) / 2;
		if (local38 < arg4 && local38 + this.anInt6590 > 0 && local51 < arg3 && local51 + this.anInt6590 > 0) {
			this.aClass95_15.method5490(local51 + arg1, local38 + arg2, this.anInt6590, this.anInt6590);
		}
	}

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "(Lclient!ea;Lclient!vp;)Z")
	private boolean method5872(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class206 arg1) {
		if (this.aClass95_15 == null) {
			if (this.anInt6595 == 0) {
				if (Static27.anInterface3_1.method1509(this.anInt6593)) {
					@Pc(23) int[] local23 = Static27.anInterface3_1.method1512(0.7F, this.anInt6591, this.anInt6591, this.anInt6593);
					this.aClass95_15 = arg0.method5210(local23, this.anInt6591, this.anInt6591, this.anInt6591);
				}
			} else if (this.anInt6595 == 2) {
				this.method5874(arg0, arg1);
			} else if (this.anInt6595 == 1) {
				this.method5867(arg0, arg1);
			}
		}
		return this.aClass95_15 != null;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIII)Z")
	public boolean method5873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean572) {
			this.anInt6594 = 1073741823;
			local7 = this.anInt6585;
			local12 = this.anInt6588;
			local17 = this.anInt6596;
		} else {
			local7 = this.anInt6585 - arg0;
			local12 = this.anInt6588 - arg1;
			local17 = this.anInt6596 - arg2;
			this.anInt6594 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt6594 == 0) {
				this.anInt6594 = 1;
			}
			local7 = (local7 << 8) / this.anInt6594;
			local12 = (local12 << 8) / this.anInt6594;
			local17 = (local17 << 8) / this.anInt6594;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt6590 = this.anInt6592 * arg3 / (this.aBoolean572 ? 1024 : this.anInt6594);
		} else {
			this.anInt6590 = 0;
		}
		if (this.anInt6590 < 8) {
			this.aClass95_15 = null;
			return false;
		}
		@Pc(143) int local143 = Static109.method1929(this.anInt6590);
		if (local143 > arg3) {
			local143 = Static74.method1366(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt6591) {
			this.anInt6591 = local143;
		}
		this.anInt6586 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt6589 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass95_15 = null;
		return true;
	}

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "(Lclient!ea;Lclient!vp;)V")
	private void method5874(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class206 arg1) {
		@Pc(6) Class177 local6 = Static292.method2236(this.anInt6593, Static332.aClass93_139);
		if (local6 == null) {
			return;
		}
		arg0.method5203(Static341.anIntArray617);
		arg0.method5258(0, 0, this.anInt6591, this.anInt6591);
		arg0.method5205(0, 0, this.anInt6591, this.anInt6591, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean572) {
				local32 = -arg1.anInt6585;
				local34 = -arg1.anInt6588;
				local36 = -arg1.anInt6596;
			} else {
				local32 = this.anInt6585 - arg1.anInt6585;
				local34 = this.anInt6588 - arg1.anInt6588;
				local36 = this.anInt6596 - arg1.anInt6596;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt6586 != 0) {
			local81 = -this.anInt6586 & 0x3FFF;
			local85 = Class187.anIntArray571[local81];
			local89 = Class187.anIntArray570[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt6589 != 0) {
			local81 = -this.anInt6589 & 0x3FFF;
			local85 = Class187.anIntArray571[local81];
			local89 = Class187.anIntArray570[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.method5223(1.0F);
		arg0.method5221(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class112 local172 = arg0.method5201(local6, 1024, 0, 64, 768);
		local85 = local172.method4326() - local172.method4310();
		local89 = local172.method4335() - local172.method4331();
		local99 = local172.method4310() + local85 / 2;
		@Pc(198) int local198 = local172.method4331() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.method5161(local99, local198, local205, local205);
		arg0.method5252(arg0.method5173());
		@Pc(218) Class66 local218 = arg0.method5195();
		local218.method5822(0, 0, arg0.method5217() - local172.method4305());
		local172.method4323(local218, null, arg0.method5217());
		this.aClass95_15 = arg0.method5157(0, 0, this.anInt6591, this.anInt6591, true);
		this.aClass95_15.method5499(3);
		arg0.method5258(Static341.anIntArray617[0], Static341.anIntArray617[1], Static341.anIntArray617[2], Static341.anIntArray617[3]);
	}
}
