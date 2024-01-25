import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class14_Sub1_Sub4_Sub1 extends Class14_Sub1_Sub4 {

	@OriginalMember(owner = "client!em", name = "ab", descriptor = "[I")
	public static final int[] anIntArray175 = new int[32];

	@OriginalMember(owner = "client!em", name = "R", descriptor = "I")
	public int anInt2174;

	@OriginalMember(owner = "client!em", name = "X", descriptor = "I")
	public int anInt2180;

	@OriginalMember(owner = "client!em", name = "Z", descriptor = "I")
	public int anInt2182;

	@OriginalMember(owner = "client!em", name = "bb", descriptor = "I")
	public int anInt2183;

	@OriginalMember(owner = "client!em", name = "S", descriptor = "I")
	private int anInt2175 = 0;

	@OriginalMember(owner = "client!em", name = "W", descriptor = "I")
	public int anInt2179 = -1;

	@OriginalMember(owner = "client!em", name = "V", descriptor = "I")
	public int anInt2178 = -1;

	@OriginalMember(owner = "client!em", name = "Y", descriptor = "I")
	public int anInt2181 = 0;

	@OriginalMember(owner = "client!em", name = "eb", descriptor = "Z")
	private boolean aBoolean175 = false;

	static {
		@Pc(11) int local11 = 2;
		for (@Pc(13) int local13 = 0; local13 < 32; local13++) {
			anIntArray175[local13] = local11 - 1;
			local11 += local11;
		}
	}

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(IIIII)V")
	public Class14_Sub1_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(BLclient!ha;)Lclient!ck;")
	@Override
	public Class55 method7999(@OriginalArg(1) Class126 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!em", name = "h", descriptor = "(I)I")
	@Override
	public int method8004() {
		return -10;
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7987() {
		return this.aBoolean175;
	}

	@OriginalMember(owner = "client!em", name = "e", descriptor = "(B)I")
	@Override
	public int method7991(@OriginalArg(0) byte arg0) {
		if (arg0 < 81) {
			this.anInt2180 = 52;
		}
		return this.anInt2175;
	}

	@OriginalMember(owner = "client!em", name = "f", descriptor = "(I)I")
	@Override
	public int method7994() {
		@Pc(15) Class329 local15 = Static479.aClass348_1.method8197(this.anInt2180);
		@Pc(18) int local18 = local15.anInt9071;
		@Pc(28) Class329 local28;
		if (this.anInt2179 != -1) {
			local28 = Static479.aClass348_1.method8197(this.anInt2179);
			if (local18 < local28.anInt9071) {
				local18 = local28.anInt9071;
			}
		}
		if (this.anInt2178 != -1) {
			local28 = Static479.aClass348_1.method8197(this.anInt2178);
			if (local28.anInt9071 > local18) {
				local18 = local28.anInt9071;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(ILclient!ha;)Lclient!ww;")
	@Override
	public Class14_Sub10 method8002(@OriginalArg(1) Class126 arg0) {
		@Pc(17) Class66 local17 = Static501.method8160(super.aByte125, super.anInt9317 >> Static162.anInt2830, super.anInt9315 >> Static162.anInt2830);
		if (local17 != null && local17.aClass14_Sub1_Sub1_1.aBoolean376) {
			@Pc(28) int local28 = local17.aClass14_Sub1_Sub1_1.method8004();
			if (this.anInt2181 != local28) {
				super.anInt9321 -= this.anInt2181;
				super.anInt9321 += local28;
				this.anInt2181 = local28;
			}
		}
		@Pc(51) Class117 local51 = arg0.method7018();
		local51.method7251();
		if (local17 == null || !local17.aClass14_Sub1_Sub1_1.aBoolean376) {
			@Pc(70) Class40 local70 = Static299.aClass40Array1[super.aByte126];
			@Pc(75) int local75 = this.anInt2175 << 1;
			@Pc(82) int local82 = -local75 / 2;
			@Pc(87) int local87 = -local75 / 2;
			@Pc(99) int local99 = local70.method8447(super.anInt9317 + local82, local87 + super.anInt9315);
			@Pc(103) int local103 = local75 / 2;
			@Pc(108) int local108 = -local75 / 2;
			@Pc(121) int local121 = local70.method8447(super.anInt9317 + local103, local108 + super.anInt9315);
			@Pc(126) int local126 = -local75 / 2;
			@Pc(130) int local130 = local75 / 2;
			@Pc(143) int local143 = local70.method8447(super.anInt9317 + local126, local130 + super.anInt9315);
			@Pc(147) int local147 = local75 / 2;
			@Pc(151) int local151 = local75 / 2;
			@Pc(164) int local164 = local70.method8447(local147 + super.anInt9317, super.anInt9315 - -local151);
			@Pc(175) int local175 = local121 > local99 ? local99 : local121;
			@Pc(186) int local186 = local164 <= local143 ? local164 : local143;
			@Pc(197) int local197 = local121 >= local164 ? local164 : local121;
			@Pc(208) int local208 = local99 < local143 ? local99 : local143;
			if (local75 != 0) {
				@Pc(227) int local227 = (int) (Math.atan2((double) (local175 - local186), (double) local75) * 2607.5945876176133D) & 0x3FFF;
				if (local227 != 0) {
					local51.method7258(local227);
				}
			}
			@Pc(239) int local239 = local164 + local99;
			if (local75 != 0) {
				@Pc(258) int local258 = (int) (Math.atan2((double) (local208 - local197), (double) local75) * 2607.5945876176133D) & 0x3FFF;
				if (local258 != 0) {
					local51.method7257(-local258);
				}
			}
			if (local239 > local121 + local143) {
				local239 = local143 + local121;
			}
			local239 = (local239 >> 1) - super.anInt9321;
			if (local239 != 0) {
				local51.method7247(0, local239, 0);
			}
		}
		local51.method7247(super.anInt9317, super.anInt9321 - 10, super.anInt9315);
		@Pc(311) Class14_Sub10 local311 = Static443.method6589(true, 3);
		this.anInt2175 = 0;
		this.aBoolean175 = false;
		@Pc(340) Class180 local340;
		if (this.anInt2178 != -1) {
			local340 = Static479.aClass348_1.method8197(this.anInt2178).method7755((Class200) null, 0, (Class339) null, arg0, this.anInt2182, 0, 2048, -1);
			if (local340 != null) {
				if (Static605.aBoolean812) {
					local340.method7950(local51, local311.aClass14_Sub9Array1[2], Static461.anInt7840, 0);
				} else {
					local340.method7949(local51, local311.aClass14_Sub9Array1[2], 0);
				}
				this.aBoolean175 |= local340.F();
				this.anInt2175 = local340.ma();
			}
		}
		if (this.anInt2179 != -1) {
			local340 = Static479.aClass348_1.method8197(this.anInt2179).method7755((Class200) null, 0, (Class339) null, arg0, this.anInt2183, 0, 2048, -1);
			if (local340 != null) {
				if (Static605.aBoolean812) {
					local340.method7950(local51, local311.aClass14_Sub9Array1[1], Static461.anInt7840, 0);
				} else {
					local340.method7949(local51, local311.aClass14_Sub9Array1[1], 0);
				}
				this.aBoolean175 |= local340.F();
				if (local340.ma() > this.anInt2175) {
					this.anInt2175 = local340.ma();
				}
			}
		}
		local340 = Static479.aClass348_1.method8197(this.anInt2180).method7755((Class200) null, 0, (Class339) null, arg0, this.anInt2174, 0, 2048, -1);
		if (local340 != null) {
			if (Static605.aBoolean812) {
				local340.method7950(local51, local311.aClass14_Sub9Array1[0], Static461.anInt7840, 0);
			} else {
				local340.method7949(local51, local311.aClass14_Sub9Array1[0], 0);
			}
			this.aBoolean175 |= local340.F();
			if (local340.ma() > this.anInt2175) {
				this.anInt2175 = local340.ma();
			}
		}
		return local311;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!ha;IIB)Z")
	@Override
	public boolean method8003(@OriginalArg(0) Class126 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class117 local11 = arg0.method7018();
		local11.method7244(super.anInt9317, super.anInt9321 - 10, super.anInt9315);
		@Pc(27) Class329 local27 = Static479.aClass348_1.method8197(this.anInt2180);
		@Pc(40) Class180 local40 = local27.method7755((Class200) null, 0, (Class339) null, arg0, this.anInt2174, 0, 131072, -1);
		if (local40 != null && (Static605.aBoolean812 ? local40.method7929(arg2, arg1, local11, true, local27.anInt9071, Static461.anInt7840) : local40.method7946(arg2, arg1, local11, true, local27.anInt9071))) {
			return true;
		}
		@Pc(76) Class329 local76;
		if (this.anInt2179 != -1) {
			local76 = Static479.aClass348_1.method8197(this.anInt2179);
			local40 = local76.method7755((Class200) null, 0, (Class339) null, arg0, this.anInt2183, 0, 131072, -1);
			if (local40 != null && (Static605.aBoolean812 ? local40.method7929(arg2, arg1, local11, true, local76.anInt9071, Static461.anInt7840) : local40.method7946(arg2, arg1, local11, true, local76.anInt9071))) {
				return true;
			}
		}
		if (this.anInt2178 != -1) {
			local76 = Static479.aClass348_1.method8197(this.anInt2178);
			local40 = local76.method7755((Class200) null, 0, (Class339) null, arg0, this.anInt2182, 0, 131072, -1);
			if (local40 != null && (Static605.aBoolean812 ? local40.method7929(arg2, arg1, local11, true, local76.anInt9071, Static461.anInt7840) : local40.method7946(arg2, arg1, local11, true, local76.anInt9071))) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!em", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method7998() {
		return false;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method7997(@OriginalArg(0) Class126 arg0) {
	}
}
