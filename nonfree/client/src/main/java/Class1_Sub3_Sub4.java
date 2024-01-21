import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class1_Sub3_Sub4 extends Class1_Sub3 {

	@OriginalMember(owner = "client!sb", name = "Kb", descriptor = "I")
	private int anInt3759;

	@OriginalMember(owner = "client!sb", name = "Mb", descriptor = "J")
	private long aLong119;

	@OriginalMember(owner = "client!sb", name = "Nb", descriptor = "J")
	private long aLong120;

	@OriginalMember(owner = "client!sb", name = "Ob", descriptor = "Z")
	private boolean aBoolean171;

	@OriginalMember(owner = "client!sb", name = "Pb", descriptor = "I")
	private int anInt3760;

	@OriginalMember(owner = "client!sb", name = "G", descriptor = "[I")
	private final int[] anIntArray306 = new int[16];

	@OriginalMember(owner = "client!sb", name = "C", descriptor = "[I")
	private final int[] anIntArray304 = new int[16];

	@OriginalMember(owner = "client!sb", name = "R", descriptor = "[I")
	private final int[] anIntArray309 = new int[16];

	@OriginalMember(owner = "client!sb", name = "D", descriptor = "[I")
	private final int[] anIntArray305 = new int[16];

	@OriginalMember(owner = "client!sb", name = "db", descriptor = "[I")
	private final int[] anIntArray311 = new int[16];

	@OriginalMember(owner = "client!sb", name = "Y", descriptor = "[I")
	private final int[] anIntArray310 = new int[16];

	@OriginalMember(owner = "client!sb", name = "N", descriptor = "[I")
	private final int[] anIntArray308 = new int[16];

	@OriginalMember(owner = "client!sb", name = "jb", descriptor = "[I")
	private final int[] anIntArray313 = new int[16];

	@OriginalMember(owner = "client!sb", name = "nb", descriptor = "[[Lclient!jg;")
	private final Class1_Sub12[][] aClass1_Sub12ArrayArray1 = new Class1_Sub12[16][128];

	@OriginalMember(owner = "client!sb", name = "A", descriptor = "[I")
	public final int[] anIntArray303 = new int[16];

	@OriginalMember(owner = "client!sb", name = "eb", descriptor = "I")
	private final int anInt3738 = 1000000;

	@OriginalMember(owner = "client!sb", name = "ib", descriptor = "[I")
	private final int[] anIntArray312 = new int[16];

	@OriginalMember(owner = "client!sb", name = "w", descriptor = "[I")
	public final int[] anIntArray302 = new int[16];

	@OriginalMember(owner = "client!sb", name = "wb", descriptor = "[I")
	private final int[] anIntArray315 = new int[16];

	@OriginalMember(owner = "client!sb", name = "vb", descriptor = "[I")
	private final int[] anIntArray314 = new int[16];

	@OriginalMember(owner = "client!sb", name = "K", descriptor = "[I")
	private final int[] anIntArray307 = new int[16];

	@OriginalMember(owner = "client!sb", name = "Bb", descriptor = "[[Lclient!jg;")
	private final Class1_Sub12[][] aClass1_Sub12ArrayArray2 = new Class1_Sub12[16][128];

	@OriginalMember(owner = "client!sb", name = "Eb", descriptor = "[I")
	public final int[] anIntArray316 = new int[16];

	@OriginalMember(owner = "client!sb", name = "Hb", descriptor = "I")
	private int anInt3756 = 256;

	@OriginalMember(owner = "client!sb", name = "mb", descriptor = "Lclient!qf;")
	private final Class83 aClass83_1 = new Class83();

	@OriginalMember(owner = "client!sb", name = "Lb", descriptor = "Lclient!md;")
	private final Class1_Sub3_Sub3 aClass1_Sub3_Sub3_1 = new Class1_Sub3_Sub3(this);

	@OriginalMember(owner = "client!sb", name = "P", descriptor = "Lclient!l;")
	private final Class57 aClass57_38 = new Class57(128);

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub4() {
		this.method2881();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!jg;B)Z")
	public boolean method2861(@OriginalArg(0) Class1_Sub12 arg0) {
		if (arg0.aClass1_Sub3_Sub2_3 != null) {
			return false;
		}
		if (arg0.anInt2192 >= 0) {
			arg0.method3563();
			if (arg0.anInt2184 > 0 && arg0 == this.aClass1_Sub12ArrayArray1[arg0.anInt2185][arg0.anInt2184]) {
				this.aClass1_Sub12ArrayArray1[arg0.anInt2185][arg0.anInt2184] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZ)V")
	private void method2862(@OriginalArg(0) int arg0) {
		for (@Pc(14) Class1_Sub12 local14 = (Class1_Sub12) this.aClass1_Sub3_Sub3_1.aClass87_19.method2827(); local14 != null; local14 = (Class1_Sub12) this.aClass1_Sub3_Sub3_1.aClass87_19.method2830()) {
			if (arg0 < 0 || arg0 == local14.anInt2185) {
				if (local14.aClass1_Sub3_Sub2_3 != null) {
					local14.aClass1_Sub3_Sub2_3.method1622(Static148.anInt3288 / 100);
					if (local14.aClass1_Sub3_Sub2_3.method1620()) {
						this.aClass1_Sub3_Sub3_1.aClass1_Sub3_Sub1_2.method275(local14.aClass1_Sub3_Sub2_3);
					}
					local14.method1702();
				}
				if (local14.anInt2192 < 0) {
					this.aClass1_Sub12ArrayArray2[local14.anInt2185][local14.anInt2191] = null;
				}
				local14.method3563();
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BI)V")
	private void method2863(@OriginalArg(1) int arg0) {
		if ((this.anIntArray302[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(28) Class1_Sub12 local28 = (Class1_Sub12) this.aClass1_Sub3_Sub3_1.aClass87_19.method2827(); local28 != null; local28 = (Class1_Sub12) this.aClass1_Sub3_Sub3_1.aClass87_19.method2830()) {
			if (local28.anInt2185 == arg0 && this.aClass1_Sub12ArrayArray2[arg0][local28.anInt2191] == null && local28.anInt2192 < 0) {
				local28.anInt2192 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)I")
	public int method2864() {
		return this.anInt3756;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2855(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass83_1.method2636()) {
			@Pc(14) int local14 = this.aClass83_1.anInt3424 * this.anInt3738 / Static148.anInt3288;
			do {
				@Pc(23) long local23 = (long) local14 * (long) arg2 + this.aLong120;
				if (this.aLong119 - local23 >= 0L) {
					this.aLong120 = local23;
					break;
				}
				@Pc(52) int local52 = (int) ((this.aLong119 + (long) local14 - this.aLong120 - 1L) / (long) local14);
				this.aLong120 += (long) local14 * (long) local52;
				arg2 -= local52;
				this.aClass1_Sub3_Sub3_1.method2855(arg0, arg1, local52);
				arg1 += local52;
				this.method2866();
			} while (this.aClass83_1.method2636());
		}
		this.aClass1_Sub3_Sub3_1.method2855(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BII)V")
	private void method2865() {
		this.anIntArray305[9] = 128;
		this.anIntArray306[9] = 128;
		this.method2890(128, 9);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "()Lclient!rd;")
	@Override
	public synchronized Class1_Sub3 method2854() {
		return this.aClass1_Sub3_Sub3_1;
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(B)V")
	private void method2866() {
		@Pc(8) int local8 = this.anInt3759;
		@Pc(11) int local11 = this.anInt3760;
		@Pc(14) long local14 = this.aLong119;
		while (this.anInt3760 == local11) {
			while (local11 == this.aClass83_1.anIntArray293[local8]) {
				this.aClass83_1.method2634(local8);
				@Pc(25) int local25 = this.aClass83_1.method2637(local8);
				if (local25 == 1) {
					this.aClass83_1.method2635();
					this.aClass83_1.method2630(local8);
					if (this.aClass83_1.method2638()) {
						if (!this.aBoolean171 || local11 == 0) {
							this.method2881();
							this.aClass83_1.method2629();
							return;
						}
						this.aClass83_1.method2625(local14);
					}
					break;
				}
				if ((local25 & 0x80) != 0) {
					this.method2878(local25);
				}
				this.aClass83_1.method2639(local8);
				this.aClass83_1.method2630(local8);
			}
			local8 = this.aClass83_1.method2628();
			local11 = this.aClass83_1.anIntArray293[local8];
			local14 = this.aClass83_1.method2632(local11);
		}
		this.anInt3759 = local8;
		this.aLong119 = local14;
		this.anInt3760 = local11;
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "()Lclient!rd;")
	@Override
	public synchronized Class1_Sub3 method2860() {
		return null;
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)V")
	public synchronized void method2867() {
		for (@Pc(9) Class1_Sub14 local9 = (Class1_Sub14) this.aClass57_38.method1876(); local9 != null; local9 = (Class1_Sub14) this.aClass57_38.method1873()) {
			local9.method1985();
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIII)V")
	private void method2868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub12 local8 = this.aClass1_Sub12ArrayArray2[arg0][arg2];
		if (local8 == null) {
			return;
		}
		this.aClass1_Sub12ArrayArray2[arg0][arg2] = null;
		if ((this.anIntArray302[arg0] & 0x2) == 0) {
			local8.anInt2192 = 0;
			return;
		}
		for (@Pc(40) Class1_Sub12 local40 = (Class1_Sub12) this.aClass1_Sub3_Sub3_1.aClass87_19.method2827(); local40 != null; local40 = (Class1_Sub12) this.aClass1_Sub3_Sub3_1.aClass87_19.method2830()) {
			if (local40.anInt2185 == local8.anInt2185 && local40.anInt2192 < 0 && local8 != local40) {
				local8.anInt2192 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIZ)V")
	private void method2869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZILclient!nh;)V")
	public synchronized void method2870(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1_Sub19 arg1) {
		this.method2888();
		this.aClass83_1.method2633(arg1.aByteArray28);
		this.aLong120 = 0;
		this.aBoolean171 = arg0;
		@Pc(24) int local24 = this.aClass83_1.method2631();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass83_1.method2634(local26);
			this.aClass83_1.method2639(local26);
			this.aClass83_1.method2630(local26);
		}
		this.anInt3759 = this.aClass83_1.method2628();
		this.anInt3760 = this.aClass83_1.anIntArray293[this.anInt3759];
		this.aLong119 = this.aClass83_1.method2632(this.anInt3760);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)V")
	private void method2871(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray308[arg0] = arg1;
		this.anIntArray316[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)V")
	public synchronized void method2872(@OriginalArg(1) int arg0) {
		this.anInt3756 = arg0;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(BI)V")
	private void method2873(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(10) int local10 = 0; local10 < 16; local10++) {
				this.method2873(local10);
			}
			return;
		}
		this.anIntArray304[arg0] = 12800;
		this.anIntArray310[arg0] = 8192;
		this.anIntArray312[arg0] = 16383;
		this.anIntArray309[arg0] = 8192;
		this.anIntArray315[arg0] = 0;
		this.anIntArray313[arg0] = 8192;
		this.method2863(arg0);
		this.method2894(arg0);
		this.anIntArray302[arg0] = 0;
		this.anIntArray307[arg0] = 32767;
		this.anIntArray314[arg0] = 256;
		this.anIntArray303[arg0] = 0;
		this.method2871(arg0, 8192);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZILclient!jg;)V")
	public void method2874(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1_Sub12 arg1) {
		@Pc(10) int local10 = arg1.aClass1_Sub9_Sub1_1.aByteArray53.length;
		@Pc(42) int local42;
		if (arg0 && arg1.aClass1_Sub9_Sub1_1.aBoolean196) {
			@Pc(25) int local25 = local10 + local10 - arg1.aClass1_Sub9_Sub1_1.anInt4140;
			local10 <<= 0x8;
			local42 = (int) ((long) this.anIntArray303[arg1.anInt2185] * (long) local25 >> 6);
			if (local42 >= local10) {
				local42 = local10 + local10 - local42 - 1;
				arg1.aClass1_Sub3_Sub2_3.method1624();
			}
		} else {
			local42 = (int) ((long) local10 * (long) this.anIntArray303[arg1.anInt2185] >> 6);
		}
		arg1.aClass1_Sub3_Sub2_3.method1628(local42);
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(B)Z")
	public synchronized boolean method2875() {
		return this.aClass83_1.method2636();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIBI)V")
	private void method2877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method2868(arg1, 64, arg2);
		if ((this.anIntArray302[arg1] & 0x2) != 0) {
			for (@Pc(33) Class1_Sub12 local33 = (Class1_Sub12) this.aClass1_Sub3_Sub3_1.aClass87_19.method2828(); local33 != null; local33 = (Class1_Sub12) this.aClass1_Sub3_Sub3_1.aClass87_19.method2832()) {
				if (local33.anInt2185 == arg1 && local33.anInt2192 < 0) {
					this.aClass1_Sub12ArrayArray2[arg1][local33.anInt2191] = null;
					this.aClass1_Sub12ArrayArray2[arg1][arg2] = local33;
					@Pc(71) int local71 = (local33.anInt2189 * local33.anInt2198 >> 12) + local33.anInt2193;
					local33.anInt2193 += arg2 - local33.anInt2191 << 8;
					local33.anInt2189 = local71 - local33.anInt2193;
					local33.anInt2191 = arg2;
					local33.anInt2198 = 4096;
					return;
				}
			}
		}
		@Pc(117) Class1_Sub14 local117 = (Class1_Sub14) this.aClass57_38.method1872((long) this.anIntArray311[arg1]);
		if (local117 == null) {
			return;
		}
		@Pc(125) Class1_Sub9_Sub1 local125 = local117.aClass1_Sub9_Sub1Array1[arg2];
		if (local125 == null) {
			return;
		}
		@Pc(132) Class1_Sub12 local132 = new Class1_Sub12();
		local132.aClass1_Sub14_1 = local117;
		local132.anInt2185 = arg1;
		local132.aClass1_Sub9_Sub1_1 = local125;
		local132.aClass43_1 = local117.aClass43Array1[arg2];
		local132.anInt2184 = local117.aByteArray27[arg2];
		local132.anInt2191 = arg2;
		local132.anInt2186 = local117.aByteArray26[arg2] * arg0 * arg0 * local117.anInt2580 + 1024 >> 11;
		local132.anInt2182 = local117.aByteArray25[arg2] & 0xFF;
		local132.anInt2193 = (arg2 << 8) - (local117.aShortArray30[arg2] & 0x7FFF);
		local132.anInt2183 = 0;
		local132.anInt2187 = 0;
		local132.anInt2199 = 0;
		local132.anInt2192 = -1;
		local132.anInt2197 = 0;
		if (this.anIntArray303[arg1] == 0) {
			local132.aClass1_Sub3_Sub2_3 = Static215.method1646(local125, this.method2895(local132), this.method2893(local132), this.method2884(local132));
		} else {
			local132.aClass1_Sub3_Sub2_3 = Static215.method1646(local125, this.method2895(local132), 0, this.method2884(local132));
			this.method2874(local117.aShortArray30[arg2] < 0, local132);
		}
		if (local117.aShortArray30[arg2] < 0) {
			local132.aClass1_Sub3_Sub2_3.method1618(-1);
		}
		if (local132.anInt2184 >= 0) {
			@Pc(288) Class1_Sub12 local288 = this.aClass1_Sub12ArrayArray1[arg1][local132.anInt2184];
			if (local288 != null && local288.anInt2192 < 0) {
				this.aClass1_Sub12ArrayArray2[arg1][local288.anInt2191] = null;
				local288.anInt2192 = 0;
			}
			this.aClass1_Sub12ArrayArray1[arg1][local132.anInt2184] = local132;
		}
		this.aClass1_Sub3_Sub3_1.aClass87_19.method2823(local132);
		this.aClass1_Sub12ArrayArray2[arg1][arg2] = local132;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IB)V")
	private void method2878(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method2868(local18, local30, local24);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 > 0) {
				this.method2877(local30, local18, local24);
			} else {
				this.method2868(local18, 64, local24);
			}
		} else if (local9 == 160) {
			local30 = arg0 >> 16 & 0x7F;
			local24 = arg0 >> 8 & 0x7F;
			local18 = arg0 & 0xF;
			this.method2892(local30, local24, local18);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray306[local18] = (this.anIntArray306[local18] & 0xFFE03FFF) + (local30 << 14);
			}
			if (local24 == 32) {
				this.anIntArray306[local18] = (this.anIntArray306[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 1) {
				this.anIntArray315[local18] = (this.anIntArray315[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 33) {
				this.anIntArray315[local18] = (this.anIntArray315[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 5) {
				this.anIntArray313[local18] = (this.anIntArray313[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 37) {
				this.anIntArray313[local18] = (this.anIntArray313[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 7) {
				this.anIntArray304[local18] = (local30 << 7) + (this.anIntArray304[local18] & 0xFFFFC07F);
			}
			if (local24 == 39) {
				this.anIntArray304[local18] = local30 + (this.anIntArray304[local18] & 0xFFFFFF80);
			}
			if (local24 == 10) {
				this.anIntArray310[local18] = (local30 << 7) + (this.anIntArray310[local18] & 0xFFFFC07F);
			}
			if (local24 == 42) {
				this.anIntArray310[local18] = (this.anIntArray310[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 11) {
				this.anIntArray312[local18] = (local30 << 7) + (this.anIntArray312[local18] & 0xFFFFC07F);
			}
			if (local24 == 43) {
				this.anIntArray312[local18] = local30 + (this.anIntArray312[local18] & 0xFFFFFF80);
			}
			if (local24 == 64) {
				if (local30 < 64) {
					this.anIntArray302[local18] &= 0xFFFFFFFE;
				} else {
					this.anIntArray302[local18] |= 0x1;
				}
			}
			if (local24 == 65) {
				if (local30 >= 64) {
					this.anIntArray302[local18] |= 0x2;
				} else {
					this.method2863(local18);
					this.anIntArray302[local18] &= 0xFFFFFFFD;
				}
			}
			if (local24 == 99) {
				this.anIntArray307[local18] = (local30 << 7) + (this.anIntArray307[local18] & 0x7F);
			}
			if (local24 == 98) {
				this.anIntArray307[local18] = (this.anIntArray307[local18] & 0x3F80) + local30;
			}
			if (local24 == 101) {
				this.anIntArray307[local18] = (this.anIntArray307[local18] & 0x7F) + (local30 << 7) + 16384;
			}
			if (local24 == 100) {
				this.anIntArray307[local18] = (this.anIntArray307[local18] & 0x3F80) + local30 + 16384;
			}
			if (local24 == 120) {
				this.method2862(local18);
			}
			if (local24 == 121) {
				this.method2873(local18);
			}
			if (local24 == 123) {
				this.method2889(local18);
			}
			@Pc(498) int local498;
			if (local24 == 6) {
				local498 = this.anIntArray307[local18];
				if (local498 == 16384) {
					this.anIntArray314[local18] = (local30 << 7) + (this.anIntArray314[local18] & 0xFFFFC07F);
				}
			}
			if (local24 == 38) {
				local498 = this.anIntArray307[local18];
				if (local498 == 16384) {
					this.anIntArray314[local18] = local30 + (this.anIntArray314[local18] & 0xFFFFFF80);
				}
			}
			if (local24 == 16) {
				this.anIntArray303[local18] = (this.anIntArray303[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 48) {
				this.anIntArray303[local18] = (this.anIntArray303[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 81) {
				if (local30 >= 64) {
					this.anIntArray302[local18] |= 0x4;
				} else {
					this.method2894(local18);
					this.anIntArray302[local18] &= 0xFFFFFFFB;
				}
			}
			if (local24 == 17) {
				this.method2871(local18, (this.anIntArray308[local18] & 0xFFFFC07F) + (local30 << 7));
			}
			if (local24 == 49) {
				this.method2871(local18, (this.anIntArray308[local18] & 0xFFFFFF80) + local30);
			}
		} else if (local9 == 192) {
			local24 = arg0 >> 8 & 0x7F;
			local18 = arg0 & 0xF;
			this.method2890(local24 + this.anIntArray306[local18], local18);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method2869(local24, local18);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method2879(local24, local18);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method2881();
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(III)V")
	private void method2879(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray309[arg1] = arg0;
	}

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "(I)V")
	public synchronized void method2880() {
		for (@Pc(15) Class1_Sub14 local15 = (Class1_Sub14) this.aClass57_38.method1876(); local15 != null; local15 = (Class1_Sub14) this.aClass57_38.method1873()) {
			local15.method3563();
		}
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method2858(@OriginalArg(0) int arg0) {
		if (this.aClass83_1.method2636()) {
			@Pc(14) int local14 = this.aClass83_1.anInt3424 * this.anInt3738 / Static148.anInt3288;
			do {
				@Pc(23) long local23 = this.aLong120 + (long) local14 * (long) arg0;
				if (this.aLong119 - local23 >= 0L) {
					this.aLong120 = local23;
					break;
				}
				@Pc(51) int local51 = (int) (((long) local14 + this.aLong119 - this.aLong120 - 1L) / (long) local14);
				arg0 -= local51;
				this.aLong120 += (long) local14 * (long) local51;
				this.aClass1_Sub3_Sub3_1.method2858(local51);
				this.method2866();
			} while (this.aClass83_1.method2636());
		}
		this.aClass1_Sub3_Sub3_1.method2858(arg0);
	}

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "(B)V")
	private void method2881() {
		this.method2862(-1);
		this.method2873(-1);
		for (@Pc(13) int local13 = 0; local13 < 16; local13++) {
			this.anIntArray311[local13] = this.anIntArray305[local13];
		}
		for (@Pc(36) int local36 = 0; local36 < 16; local36++) {
			this.anIntArray306[local36] = this.anIntArray305[local36] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(III)V")
	public synchronized void method2883() {
		this.method2865();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!jg;I)I")
	private int method2884(@OriginalArg(0) Class1_Sub12 arg0) {
		@Pc(14) int local14 = this.anIntArray310[arg0.anInt2185];
		return local14 >= 8192 ? 16384 - ((16384 - local14) * (-arg0.anInt2182 + 128) + 32 >> 6) : arg0.anInt2182 * local14 + 32 >> 6;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIILclient!jg;[I)Z")
	public boolean method2885(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub12 arg2, @OriginalArg(4) int[] arg3) {
		arg2.anInt2200 = Static148.anInt3288 / 100;
		if (arg2.anInt2192 >= 0 && (arg2.aClass1_Sub3_Sub2_3 == null || arg2.aClass1_Sub3_Sub2_3.method1627())) {
			arg2.method1702();
			arg2.method3563();
			if (arg2.anInt2184 > 0 && this.aClass1_Sub12ArrayArray1[arg2.anInt2185][arg2.anInt2184] == arg2) {
				this.aClass1_Sub12ArrayArray1[arg2.anInt2185][arg2.anInt2184] = null;
			}
			return true;
		}
		@Pc(61) int local61 = arg2.anInt2198;
		if (local61 > 0) {
			local61 -= (int) (Math.pow(2.0D, (double) this.anIntArray313[arg2.anInt2185] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local61 < 0) {
				local61 = 0;
			}
			arg2.anInt2198 = local61;
		}
		@Pc(90) boolean local90 = false;
		arg2.aClass1_Sub3_Sub2_3.method1630(this.method2895(arg2));
		@Pc(100) Class43 local100 = arg2.aClass43_1;
		arg2.anInt2201 += local100.anInt1882;
		@Pc(125) double local125 = (double) ((arg2.anInt2189 * arg2.anInt2198 >> 12) + (arg2.anInt2191 - 60 << 8)) * 5.086263020833333E-6D;
		arg2.anInt2188++;
		if (local100.anInt1883 > 0) {
			if (local100.anInt1880 <= 0) {
				arg2.anInt2197 += 128;
			} else {
				arg2.anInt2197 += (int) (Math.pow(2.0D, (double) local100.anInt1880 * local125) * 128.0D + 0.5D);
			}
			if (arg2.anInt2197 * local100.anInt1883 >= 819200) {
				local90 = true;
			}
		}
		if (local100.aByteArray19 != null) {
			if (local100.anInt1887 <= 0) {
				arg2.anInt2187 += 128;
			} else {
				arg2.anInt2187 += (int) (Math.pow(2.0D, local125 * (double) local100.anInt1887) * 128.0D + 0.5D);
			}
			while (arg2.anInt2183 < local100.aByteArray19.length - 2 && arg2.anInt2187 > (local100.aByteArray19[arg2.anInt2183 + 2] & 0xFF) << 8) {
				arg2.anInt2183 += 2;
			}
			if (arg2.anInt2183 == local100.aByteArray19.length - 2 && local100.aByteArray19[arg2.anInt2183 + 1] == 0) {
				local90 = true;
			}
		}
		if (arg2.anInt2192 >= 0 && local100.aByteArray20 != null && (this.anIntArray302[arg2.anInt2185] & 0x1) == 0 && (arg2.anInt2184 < 0 || arg2 != this.aClass1_Sub12ArrayArray1[arg2.anInt2185][arg2.anInt2184])) {
			if (local100.anInt1881 > 0) {
				arg2.anInt2192 += (int) (Math.pow(2.0D, local125 * (double) local100.anInt1881) * 128.0D + 0.5D);
			} else {
				arg2.anInt2192 += 128;
			}
			while (arg2.anInt2199 < local100.aByteArray20.length - 2 && arg2.anInt2192 > (local100.aByteArray20[arg2.anInt2199 + 2] & 0xFF) << 8) {
				arg2.anInt2199 += 2;
			}
			if (local100.aByteArray20.length - 2 == arg2.anInt2199) {
				local90 = true;
			}
		}
		if (!local90) {
			arg2.aClass1_Sub3_Sub2_3.method1640(arg2.anInt2200, this.method2893(arg2), this.method2884(arg2));
			return false;
		}
		arg2.aClass1_Sub3_Sub2_3.method1622(arg2.anInt2200);
		if (arg3 == null) {
			arg2.aClass1_Sub3_Sub2_3.method2858(arg1);
		} else {
			arg2.aClass1_Sub3_Sub2_3.method2855(arg3, arg0, arg1);
		}
		if (arg2.aClass1_Sub3_Sub2_3.method1620()) {
			this.aClass1_Sub3_Sub3_1.aClass1_Sub3_Sub1_2.method275(arg2.aClass1_Sub3_Sub2_3);
		}
		arg2.method1702();
		if (arg2.anInt2192 >= 0) {
			arg2.method3563();
			if (arg2.anInt2184 > 0 && this.aClass1_Sub12ArrayArray1[arg2.anInt2185][arg2.anInt2184] == arg2) {
				this.aClass1_Sub12ArrayArray1[arg2.anInt2185][arg2.anInt2184] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILclient!ve;ILclient!c;Lclient!nh;)Z")
	public synchronized boolean method2887(@OriginalArg(1) Class69 arg0, @OriginalArg(3) Class14 arg1, @OriginalArg(4) Class1_Sub19 arg2) {
		arg2.method2255();
		@Pc(16) boolean local16 = true;
		@Pc(25) int[] local25 = new int[] { 22050 };
		for (@Pc(31) Class1_Sub22 local31 = (Class1_Sub22) arg2.aClass57_28.method1876(); local31 != null; local31 = (Class1_Sub22) arg2.aClass57_28.method1873()) {
			@Pc(37) int local37 = (int) local31.aLong149;
			@Pc(45) Class1_Sub14 local45 = (Class1_Sub14) this.aClass57_38.method1872((long) local37);
			if (local45 == null) {
				local45 = Static71.method1357(arg0, local37);
				if (local45 == null) {
					local16 = false;
					continue;
				}
				this.aClass57_38.method1874(local45, (long) local37);
			}
			if (!local45.method1984(local31.aByteArray39, local25, arg1)) {
				local16 = false;
			}
		}
		if (local16) {
			arg2.method2257();
		}
		return local16;
	}

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "(I)V")
	public synchronized void method2888() {
		this.aClass83_1.method2629();
		this.method2881();
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(II)V")
	private void method2889(@OriginalArg(1) int arg0) {
		for (@Pc(8) Class1_Sub12 local8 = (Class1_Sub12) this.aClass1_Sub3_Sub3_1.aClass87_19.method2827(); local8 != null; local8 = (Class1_Sub12) this.aClass1_Sub3_Sub3_1.aClass87_19.method2830()) {
			if ((arg0 < 0 || local8.anInt2185 == arg0) && local8.anInt2192 < 0) {
				this.aClass1_Sub12ArrayArray2[local8.anInt2185][local8.anInt2191] = null;
				local8.anInt2192 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIB)V")
	private void method2890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != this.anIntArray311[arg1]) {
			this.anIntArray311[arg1] = arg0;
			for (@Pc(16) int local16 = 0; local16 < 128; local16++) {
				this.aClass1_Sub12ArrayArray1[arg1][local16] = null;
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(IIBI)V")
	private void method2892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(Lclient!jg;B)I")
	private int method2893(@OriginalArg(0) Class1_Sub12 arg0) {
		@Pc(6) Class43 local6 = arg0.aClass43_1;
		@Pc(22) int local22 = this.anIntArray304[arg0.anInt2185] * this.anIntArray312[arg0.anInt2185] + 4096 >> 13;
		@Pc(30) int local30 = local22 * local22 + 16384 >> 15;
		@Pc(39) int local39 = arg0.anInt2186 * local30 + 16384 >> 15;
		local22 = local39 * this.anInt3756 + 128 >> 8;
		if (local6.anInt1883 > 0) {
			local22 = (int) (Math.pow(0.5D, (double) local6.anInt1883 * 1.953125E-5D * (double) arg0.anInt2197) * (double) local22 + 0.5D);
		}
		@Pc(86) int local86;
		@Pc(94) int local94;
		@Pc(116) int local116;
		@Pc(128) int local128;
		if (local6.aByteArray19 != null) {
			local86 = arg0.anInt2187;
			local94 = local6.aByteArray19[arg0.anInt2183 + 1];
			if (local6.aByteArray19.length - 2 > arg0.anInt2183) {
				local116 = (local6.aByteArray19[arg0.anInt2183] & 0xFF) << 8;
				local128 = (local6.aByteArray19[arg0.anInt2183 + 2] & 0xFF) << 8;
				local94 += (local6.aByteArray19[arg0.anInt2183 + 3] - local94) * (local86 - local116) / (local128 - local116);
			}
			local22 = local94 * local22 + 32 >> 6;
		}
		if (arg0.anInt2192 > 0 && local6.aByteArray20 != null) {
			local86 = arg0.anInt2192;
			local94 = local6.aByteArray20[arg0.anInt2199 + 1];
			if (local6.aByteArray20.length - 2 > arg0.anInt2199) {
				local116 = (local6.aByteArray20[arg0.anInt2199] & 0xFF) << 8;
				local128 = (local6.aByteArray20[arg0.anInt2199 + 2] & 0xFF) << 8;
				local94 += (local86 - local116) * (local6.aByteArray20[arg0.anInt2199 + 3] - local94) / (local128 - local116);
			}
			local22 = local22 * local94 + 32 >> 6;
		}
		return local22;
	}

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "(II)V")
	private void method2894(@OriginalArg(0) int arg0) {
		if ((this.anIntArray302[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(23) Class1_Sub12 local23 = (Class1_Sub12) this.aClass1_Sub3_Sub3_1.aClass87_19.method2827(); local23 != null; local23 = (Class1_Sub12) this.aClass1_Sub3_Sub3_1.aClass87_19.method2830()) {
			if (local23.anInt2185 == arg0) {
				local23.anInt2190 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "()I")
	@Override
	public synchronized int method2856() {
		return 0;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(Lclient!jg;I)I")
	private int method2895(@OriginalArg(0) Class1_Sub12 arg0) {
		@Pc(10) int local10 = arg0.anInt2193 + (arg0.anInt2198 * arg0.anInt2189 >> 12);
		local10 += this.anIntArray314[arg0.anInt2185] * (this.anIntArray309[arg0.anInt2185] - 8192) >> 12;
		@Pc(35) Class43 local35 = arg0.aClass43_1;
		@Pc(63) int local63;
		if (local35.anInt1882 > 0 && (local35.anInt1888 > 0 || this.anIntArray315[arg0.anInt2185] > 0)) {
			@Pc(58) int local58 = local35.anInt1888 << 2;
			local63 = local35.anInt1884 << 1;
			if (local63 > arg0.anInt2188) {
				local58 = local58 * arg0.anInt2188 / local63;
			}
			local58 += this.anIntArray315[arg0.anInt2185] >> 7;
			@Pc(93) double local93 = Math.sin((double) (arg0.anInt2201 & 0x1FF) * 0.01227184630308513D);
			local10 += (int) ((double) local58 * local93);
		}
		local63 = (int) ((double) (arg0.aClass1_Sub9_Sub1_1.anInt4138 * 256) * Math.pow(2.0D, (double) local10 * 3.255208333333333E-4D) / (double) Static148.anInt3288 + 0.5D);
		return local63 < 1 ? 1 : local63;
	}
}
