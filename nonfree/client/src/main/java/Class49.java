import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class49 {

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "J")
	private long aLong94;

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "[I")
	private int[] anIntArray291;

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "Z")
	public boolean aBoolean123;

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "J")
	private long aLong95;

	@OriginalMember(owner = "client!ma", name = "w", descriptor = "[I")
	private int[] anIntArray293;

	@OriginalMember(owner = "client!ma", name = "A", descriptor = "I")
	private int anInt2998;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)V")
	public void method2214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = Static178.anIntArray425[arg0];
		if (this.anIntArray291[local7] != 0 && Static65.method1525(arg1) != null) {
			this.anIntArray291[local7] = Integer.MIN_VALUE | arg1;
			this.method2219();
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BLclient!re;I)Lclient!je;")
	public Class1_Sub1_Sub4_Sub1 method2216(@OriginalArg(1) Class1_Sub1_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt2998 != -1) {
			return Static41.method1031(this.anInt2998).method2428(arg1, arg0);
		}
		@Pc(31) Class1_Sub1_Sub4_Sub1 local31 = (Class1_Sub1_Sub4_Sub1) Static39.aClass25_5.method1302(this.aLong94);
		if (local31 == null) {
			@Pc(35) boolean local35 = false;
			for (@Pc(37) int local37 = 0; local37 < 12; local37++) {
				@Pc(44) int local44 = this.anIntArray291[local37];
				if ((local44 & 0x40000000) == 0) {
					if ((local44 & Integer.MIN_VALUE) != 0 && !Static65.method1525(local44 & 0x3FFFFFFF).method2799()) {
						local35 = true;
					}
				} else if (!Static90.method1963(local44 & 0x3FFFFFFF).method167(this.aBoolean123)) {
					local35 = true;
				}
			}
			if (local35) {
				return null;
			}
			@Pc(94) int local94 = 0;
			@Pc(97) Class1_Sub1_Sub4_Sub3[] local97 = new Class1_Sub1_Sub4_Sub3[12];
			for (@Pc(99) int local99 = 0; local99 < 12; local99++) {
				@Pc(106) int local106 = this.anIntArray291[local99];
				@Pc(125) Class1_Sub1_Sub4_Sub3 local125;
				if ((local106 & 0x40000000) != 0) {
					local125 = Static90.method1963(local106 & 0x3FFFFFFF).method160(this.aBoolean123);
					if (local125 != null) {
						local97[local94++] = local125;
					}
				} else if ((local106 & Integer.MIN_VALUE) != 0) {
					local125 = Static65.method1525(local106 & 0x3FFFFFFF).method2797();
					if (local125 != null) {
						local97[local94++] = local125;
					}
				}
			}
			@Pc(161) Class1_Sub1_Sub4_Sub3 local161 = new Class1_Sub1_Sub4_Sub3(local97, local94);
			for (@Pc(163) int local163 = 0; local163 < 5; local163++) {
				if (Static176.aShortArrayArray6[local163].length > this.anIntArray293[local163]) {
					local161.method1146(Static119.aShortArray31[local163], Static176.aShortArrayArray6[local163][this.anIntArray293[local163]]);
				}
				if (this.anIntArray293[local163] < Static109.aShortArrayArray3[local163].length) {
					local161.method1146(Static146.aShortArray36[local163], Static109.aShortArrayArray3[local163][this.anIntArray293[local163]]);
				}
			}
			local31 = local161.method1135(64, 768, -50, -10, -50, true);
			Static39.aClass25_5.method1299(local31, this.aLong94);
		}
		if (arg0 != null) {
			local31 = arg0.method2888(local31, arg1);
		}
		return local31;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BZ[I[II)V")
	public void method2217(@OriginalArg(1) boolean arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg2 == null) {
			arg2 = new int[12];
			for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
				for (@Pc(16) int local16 = 0; local16 < Static92.anInt2689; local16++) {
					@Pc(22) Class1_Sub1_Sub16 local22 = Static65.method1525(local16);
					if (local22 != null && !local22.aBoolean141 && local22.anInt3762 == local12 + (arg0 ? 7 : 0)) {
						arg2[Static178.anIntArray425[local12]] = local16 | Integer.MIN_VALUE;
						break;
					}
				}
			}
		}
		this.anIntArray293 = arg1;
		this.aBoolean123 = arg0;
		this.anInt2998 = arg3;
		this.anIntArray291 = arg2;
		this.method2219();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!re;Lclient!re;ZII)Lclient!je;")
	public Class1_Sub1_Sub4_Sub1 method2218(@OriginalArg(0) Class1_Sub1_Sub17 arg0, @OriginalArg(1) Class1_Sub1_Sub17 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInt2998 != -1) {
			return Static41.method1031(this.anInt2998).method2425(arg3, arg0, arg2, arg1);
		}
		@Pc(30) int[] local30 = this.anIntArray291;
		@Pc(33) long local33 = this.aLong94;
		if (arg0 != null && (arg0.anInt3868 >= 0 || arg0.anInt3867 >= 0)) {
			local30 = new int[12];
			for (@Pc(52) int local52 = 0; local52 < 12; local52++) {
				local30[local52] = this.anIntArray291[local52];
			}
			if (arg0.anInt3868 >= 0) {
				if (arg0.anInt3868 == 65535) {
					local33 ^= 0xFFFFFFFF00000000L;
					local30[5] = 0;
				} else {
					local30[5] = arg0.anInt3868 | 0x40000000;
					local33 ^= (long) local30[5] << 32;
				}
			}
			if (arg0.anInt3867 >= 0) {
				if (arg0.anInt3867 == 65535) {
					local33 ^= 0xFFFFFFFFL;
					local30[3] = 0;
				} else {
					local30[3] = arg0.anInt3867 | 0x40000000;
					local33 ^= local30[3];
				}
			}
		}
		@Pc(147) Class1_Sub1_Sub4_Sub1 local147 = (Class1_Sub1_Sub4_Sub1) Static16.aClass25_2.method1302(local33);
		if (local147 == null) {
			@Pc(151) boolean local151 = false;
			for (@Pc(153) int local153 = 0; local153 < 12; local153++) {
				@Pc(159) int local159 = local30[local153];
				if ((local159 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local159) != 0 && !Static65.method1525(local159 & 0x3FFFFFFF).method2802()) {
						local151 = true;
					}
				} else if (!Static90.method1963(local159 & 0x3FFFFFFF).method166(this.aBoolean123)) {
					local151 = true;
				}
			}
			if (local151) {
				if (this.aLong95 != -1L) {
					local147 = (Class1_Sub1_Sub4_Sub1) Static16.aClass25_2.method1302(this.aLong95);
				}
				if (local147 == null) {
					return null;
				}
			}
			if (local147 == null) {
				@Pc(226) Class1_Sub1_Sub4_Sub3[] local226 = new Class1_Sub1_Sub4_Sub3[12];
				@Pc(228) int local228 = 0;
				for (@Pc(230) int local230 = 0; local230 < 12; local230++) {
					@Pc(236) int local236 = local30[local230];
					@Pc(255) Class1_Sub1_Sub4_Sub3 local255;
					if ((local236 & 0x40000000) != 0) {
						local255 = Static90.method1963(local236 & 0x3FFFFFFF).method165(this.aBoolean123);
						if (local255 != null) {
							local226[local228++] = local255;
						}
					} else if ((local236 & Integer.MIN_VALUE) != 0) {
						local255 = Static65.method1525(local236 & 0x3FFFFFFF).method2801();
						if (local255 != null) {
							local226[local228++] = local255;
						}
					}
				}
				@Pc(293) Class1_Sub1_Sub4_Sub3 local293 = new Class1_Sub1_Sub4_Sub3(local226, local228);
				for (@Pc(295) int local295 = 0; local295 < 5; local295++) {
					if (Static176.aShortArrayArray6[local295].length > this.anIntArray293[local295]) {
						local293.method1146(Static119.aShortArray31[local295], Static176.aShortArrayArray6[local295][this.anIntArray293[local295]]);
					}
					if (Static109.aShortArrayArray3[local295].length > this.anIntArray293[local295]) {
						local293.method1146(Static146.aShortArray36[local295], Static109.aShortArrayArray3[local295][this.anIntArray293[local295]]);
					}
				}
				local147 = local293.method1135(64, 850, -30, -50, -30, true);
				Static16.aClass25_2.method1299(local147, local33);
				this.aLong95 = local33;
			}
		}
		if (arg0 == null && arg1 == null) {
			return local147;
		}
		@Pc(387) Class1_Sub1_Sub4_Sub1 local387;
		if (arg0 != null && arg1 != null) {
			local387 = arg0.method2881(arg1, local147, arg3, arg2);
		} else if (arg0 == null) {
			local387 = arg1.method2886(arg3, local147);
		} else {
			local387 = arg0.method2886(arg2, local147);
		}
		return local387;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
	private void method2219() {
		@Pc(4) long local4 = this.aLong94;
		this.aLong94 = -1L;
		@Pc(13) long[] local13 = Class1_Sub2_Sub37.aLongArray8;
		for (@Pc(15) int local15 = 0; local15 < 12; local15++) {
			this.aLong94 = this.aLong94 >>> 8 ^ local13[(int) ((this.aLong94 ^ (long) (this.anIntArray291[local15] >> 24)) & 0xFFL)];
			this.aLong94 = local13[(int) (((long) (this.anIntArray291[local15] >> 16) ^ this.aLong94) & 0xFFL)] ^ this.aLong94 >>> 8;
			this.aLong94 = this.aLong94 >>> 8 ^ local13[(int) (((long) (this.anIntArray291[local15] >> 8) ^ this.aLong94) & 0xFFL)];
			this.aLong94 = local13[(int) (((long) this.anIntArray291[local15] ^ this.aLong94) & 0xFFL)] ^ this.aLong94 >>> 8;
		}
		for (@Pc(119) int local119 = 0; local119 < 5; local119++) {
			this.aLong94 = local13[(int) ((this.aLong94 ^ (long) this.anIntArray293[local119]) & 0xFFL)] ^ this.aLong94 >>> 8;
		}
		this.aLong94 = this.aLong94 >>> 8 ^ local13[(int) (((long) (this.aBoolean123 ? 1 : 0) ^ this.aLong94) & 0xFFL)];
		if (local4 != 0L && this.aLong94 != local4) {
			Static16.aClass25_2.method1303(local4);
		}
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)I")
	public int method2220() {
		return this.anInt2998 == -1 ? (this.anIntArray291[11] << 5) + ((this.anIntArray293[4] << 20) + (this.anIntArray293[0] << 25) - (-(this.anIntArray291[0] << 15) + -(this.anIntArray291[8] << 10))) + this.anIntArray291[1] : Static41.method1031(this.anInt2998).anInt3243 + 305419896;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BLclient!fa;)V")
	public void method2221(@OriginalArg(1) Class1_Sub9 arg0) {
		arg0.method1260(this.aBoolean123 ? 1 : 0);
		@Pc(29) int local29;
		for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
			local29 = this.anIntArray291[Static178.anIntArray425[local12]];
			if ((Integer.MIN_VALUE & local29) == 0) {
				arg0.method1236(65535);
			} else {
				arg0.method1236(local29 & 0x3FFFFFFF);
			}
		}
		for (local29 = 0; local29 < 5; local29++) {
			arg0.method1260(this.anIntArray293[local29]);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZIB)V")
	public void method2222(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = this.anIntArray293[arg1];
		if (arg0) {
			local12++;
			if (local12 >= Static176.aShortArrayArray6[arg1].length) {
				local12 = 0;
			}
		} else {
			local12--;
			if (local12 < 0) {
				local12 = Static176.aShortArrayArray6[arg1].length - 1;
			}
		}
		this.anIntArray293[arg1] = local12;
		this.method2219();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIB)V")
	public void method2223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray293[arg1] = arg0;
		this.method2219();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZ)V")
	public void method2224(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean123) {
			this.method2217(arg0, this.anIntArray293, null, -1);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BZ)V")
	public void method2225(@OriginalArg(1) boolean arg0) {
		this.aBoolean123 = arg0;
		this.method2219();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIZ)V")
	public void method2226(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == 1 && this.aBoolean123) {
			return;
		}
		@Pc(23) int local23 = this.anIntArray291[Static178.anIntArray425[arg0]];
		if (local23 == 0) {
			return;
		}
		local23 &= 0x3FFFFFFF;
		@Pc(61) Class1_Sub1_Sub16 local61;
		do {
			if (arg1) {
				local23++;
				if (local23 >= Static92.anInt2689) {
					local23 = 0;
				}
			} else {
				local23--;
				if (local23 < 0) {
					local23 = Static92.anInt2689 - 1;
				}
			}
			local61 = Static65.method1525(local23);
		} while (local61 == null || local61.aBoolean141 || (this.aBoolean123 ? 7 : 0) + arg0 != local61.anInt3762);
		this.anIntArray291[Static178.anIntArray425[arg0]] = local23 | Integer.MIN_VALUE;
		this.method2219();
	}
}
