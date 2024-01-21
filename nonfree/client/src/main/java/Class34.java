import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class34 {

	@OriginalMember(owner = "client!i", name = "f", descriptor = "I")
	private int anInt1244;

	@OriginalMember(owner = "client!i", name = "g", descriptor = "J")
	private long aLong47;

	@OriginalMember(owner = "client!i", name = "i", descriptor = "J")
	private long aLong48;

	@OriginalMember(owner = "client!i", name = "j", descriptor = "[I")
	private int[] anIntArray148;

	@OriginalMember(owner = "client!i", name = "z", descriptor = "[I")
	private int[] anIntArray149;

	@OriginalMember(owner = "client!i", name = "E", descriptor = "Z")
	public boolean aBoolean45;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ZBI[I[I)V")
	public void method871(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg2 == null) {
			arg2 = new int[12];
			for (@Pc(8) int local8 = 0; local8 < 7; local8++) {
				for (@Pc(12) int local12 = 0; local12 < Static81.anInt2044; local12++) {
					@Pc(18) Class3_Sub1_Sub16 local18 = Static121.method1941(local12);
					if (local18 != null && !local18.aBoolean127 && local18.anInt2828 == local8 + (arg0 ? 7 : 0)) {
						arg2[Static22.anIntArray71[local8]] = local12 + 256;
						break;
					}
				}
			}
		}
		this.anIntArray149 = arg3;
		this.anIntArray148 = arg2;
		this.anInt1244 = arg1;
		this.aBoolean45 = arg0;
		this.method875();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ob;I)V")
	public void method873(@OriginalArg(0) Class3_Sub7 arg0) {
		arg0.method625(this.aBoolean45 ? 1 : 0);
		@Pc(21) int local21;
		for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
			local21 = this.anIntArray148[Static22.anIntArray71[local12]];
			if (local21 == 0) {
				arg0.method625(-1);
			} else {
				arg0.method625(local21 - 256);
			}
		}
		for (local21 = 0; local21 < 5; local21++) {
			arg0.method625(this.anIntArray149[local21]);
		}
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(I)V")
	private void method875() {
		@Pc(8) long local8 = this.aLong48;
		@Pc(13) int local13 = this.anIntArray148[5];
		@Pc(18) int local18 = this.anIntArray148[9];
		this.anIntArray148[5] = local18;
		this.aLong48 = 0L;
		this.anIntArray148[9] = local13;
		for (@Pc(33) int local33 = 0; local33 < 12; local33++) {
			this.aLong48 <<= 0x4;
			if (this.anIntArray148[local33] >= 256) {
				this.aLong48 += this.anIntArray148[local33] - 256;
			}
		}
		if (this.anIntArray148[0] >= 256) {
			this.aLong48 += this.anIntArray148[0] - 256 >> 4;
		}
		if (this.anIntArray148[1] >= 256) {
			this.aLong48 += this.anIntArray148[1] - 256 >> 8;
		}
		for (@Pc(111) int local111 = 0; local111 < 5; local111++) {
			this.aLong48 <<= 0x3;
			this.aLong48 += this.anIntArray149[local111];
		}
		this.aLong48 <<= 0x1;
		this.anIntArray148[5] = local13;
		this.aLong48 += this.aBoolean45 ? 1 : 0;
		this.anIntArray148[9] = local18;
		if (local8 != 0L && local8 != this.aLong48) {
			Static124.aClass75_80.method1727(local8);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IZ)V")
	public void method876(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean45 != arg0) {
			this.method871(arg0, -1, null, this.anIntArray149);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ZIZ)V")
	public void method877(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(12) int local12 = this.anIntArray149[arg0];
		if (arg1) {
			local12++;
			if (local12 >= Static78.aShortArrayArray1[arg0].length) {
				local12 = 0;
			}
		} else {
			local12--;
			if (local12 < 0) {
				local12 = Static78.aShortArrayArray1[arg0].length - 1;
			}
		}
		this.anIntArray149[arg0] = local12;
		this.method875();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIZ)V")
	public void method878(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == 1 && this.aBoolean45) {
			return;
		}
		@Pc(27) int local27 = this.anIntArray148[Static22.anIntArray71[arg0]];
		if (local27 == 0) {
			return;
		}
		local27 -= 256;
		@Pc(62) Class3_Sub1_Sub16 local62;
		do {
			if (arg1) {
				local27++;
				if (Static81.anInt2044 <= local27) {
					local27 = 0;
				}
			} else {
				local27--;
				if (local27 < 0) {
					local27 = Static81.anInt2044 - 1;
				}
			}
			local62 = Static121.method1941(local27);
		} while (local62 == null || local62.aBoolean127 || local62.anInt2828 != arg0 + (this.aBoolean45 ? 7 : 0));
		this.anIntArray148[Static22.anIntArray71[arg0]] = local27 + 256;
		this.method875();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!qc;ILclient!qc;BI)Lclient!ua;")
	public Class3_Sub1_Sub4_Sub7 method879(@OriginalArg(0) Class3_Sub1_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub11 arg2, @OriginalArg(4) int arg3) {
		if (this.anInt1244 != -1) {
			return Static101.method1666(this.anInt1244).method83(arg1, arg2, arg3, arg0);
		}
		@Pc(28) long local28 = this.aLong48;
		@Pc(37) int[] local37 = this.anIntArray148;
		if (arg2 != null && (arg2.anInt2255 >= 0 || arg2.anInt2263 >= 0)) {
			local37 = new int[12];
			for (@Pc(53) int local53 = 0; local53 < 12; local53++) {
				local37[local53] = this.anIntArray148[local53];
			}
			if (arg2.anInt2255 >= 0) {
				local28 += arg2.anInt2255 - this.anIntArray148[5] << 8;
				local37[5] = arg2.anInt2255;
			}
			if (arg2.anInt2263 >= 0) {
				local28 += arg2.anInt2263 - this.anIntArray148[3] << 16;
				local37[3] = arg2.anInt2263;
			}
		}
		@Pc(121) Class3_Sub1_Sub4_Sub7 local121 = (Class3_Sub1_Sub4_Sub7) Static124.aClass75_80.method1728(local28);
		if (local121 == null) {
			@Pc(125) boolean local125 = false;
			for (@Pc(127) int local127 = 0; local127 < 12; local127++) {
				@Pc(133) int local133 = local37[local127];
				if (local133 >= 256 && local133 < 512 && !Static121.method1941(local133 - 256).method1937()) {
					local125 = true;
				}
				if (local133 >= 512 && !Static2.method38(local133 - 512).method1098(this.aBoolean45)) {
					local125 = true;
				}
			}
			if (local125) {
				if (this.aLong47 != -1L) {
					local121 = (Class3_Sub1_Sub4_Sub7) Static124.aClass75_80.method1728(this.aLong47);
				}
				if (local121 == null) {
					return null;
				}
			}
			if (local121 == null) {
				@Pc(197) Class3_Sub1_Sub4_Sub5[] local197 = new Class3_Sub1_Sub4_Sub5[12];
				@Pc(199) int local199 = 0;
				for (@Pc(201) int local201 = 0; local201 < 12; local201++) {
					@Pc(207) int local207 = local37[local201];
					@Pc(223) Class3_Sub1_Sub4_Sub5 local223;
					if (local207 >= 256 && local207 < 512) {
						local223 = Static121.method1941(local207 - 256).method1933();
						if (local223 != null) {
							local197[local199++] = local223;
						}
					}
					if (local207 >= 512) {
						local223 = Static2.method38(local207 - 512).method1101(this.aBoolean45);
						if (local223 != null) {
							local197[local199++] = local223;
						}
					}
				}
				@Pc(264) Class3_Sub1_Sub4_Sub5 local264 = new Class3_Sub1_Sub4_Sub5(local197, local199);
				for (@Pc(266) int local266 = 0; local266 < 5; local266++) {
					if (this.anIntArray149[local266] != 0) {
						local264.method1172(Static78.aShortArrayArray1[local266][0], Static78.aShortArrayArray1[local266][this.anIntArray149[local266]]);
						if (local266 == 1) {
							local264.method1172(Static12.aShortArray5[0], Static12.aShortArray5[this.anIntArray149[local266]]);
						}
					}
				}
				local121 = local264.method1156(64, 850, -30, -50, -30);
				Static124.aClass75_80.method1730(local121, local28);
				this.aLong47 = local28;
			}
		}
		if (arg2 == null && arg0 == null) {
			return local121;
		}
		@Pc(340) Class3_Sub1_Sub4_Sub7 local340;
		if (arg2 != null && arg0 != null) {
			local340 = arg2.method1564(arg3, local121, arg0, arg1);
		} else if (arg2 == null) {
			local340 = arg0.method1559(local121, arg3);
		} else {
			local340 = arg2.method1559(local121, arg1);
		}
		return local340;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(B)Lclient!lc;")
	public Class3_Sub1_Sub4_Sub5 method881() {
		if (this.anInt1244 != -1) {
			return Static101.method1666(this.anInt1244).method81();
		}
		@Pc(18) boolean local18 = false;
		for (@Pc(20) int local20 = 0; local20 < 12; local20++) {
			@Pc(27) int local27 = this.anIntArray148[local20];
			if (local27 >= 256 && local27 < 512 && !Static121.method1941(local27 - 256).method1940()) {
				local18 = true;
			}
			if (local27 >= 512 && !Static2.method38(local27 - 512).method1097(this.aBoolean45)) {
				local18 = true;
			}
		}
		if (local18) {
			return null;
		}
		@Pc(75) Class3_Sub1_Sub4_Sub5[] local75 = new Class3_Sub1_Sub4_Sub5[12];
		@Pc(77) int local77 = 0;
		for (@Pc(79) int local79 = 0; local79 < 12; local79++) {
			@Pc(86) int local86 = this.anIntArray148[local79];
			@Pc(102) Class3_Sub1_Sub4_Sub5 local102;
			if (local86 >= 256 && local86 < 512) {
				local102 = Static121.method1941(local86 - 256).method1942();
				if (local102 != null) {
					local75[local77++] = local102;
				}
			}
			if (local86 >= 512) {
				local102 = Static2.method38(local86 - 512).method1096(this.aBoolean45);
				if (local102 != null) {
					local75[local77++] = local102;
				}
			}
		}
		@Pc(146) Class3_Sub1_Sub4_Sub5 local146 = new Class3_Sub1_Sub4_Sub5(local75, local77);
		for (@Pc(148) int local148 = 0; local148 < 5; local148++) {
			if (this.anIntArray149[local148] != 0) {
				local146.method1172(Static78.aShortArrayArray1[local148][0], Static78.aShortArrayArray1[local148][this.anIntArray149[local148]]);
				if (local148 == 1) {
					local146.method1172(Static12.aShortArray5[0], Static12.aShortArray5[this.anIntArray149[local148]]);
				}
			}
		}
		return local146;
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "(I)I")
	public int method882() {
		return this.anInt1244 == -1 ? this.anIntArray148[1] + (this.anIntArray148[11] << 5) + (this.anIntArray148[0] << 15) + (this.anIntArray149[4] << 20) + (this.anIntArray149[0] << 25) + (this.anIntArray148[8] << 10) : Static101.method1666(this.anInt1244).anInt118 + 305419896;
	}
}
