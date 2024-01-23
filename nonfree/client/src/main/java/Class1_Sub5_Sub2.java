import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class1_Sub5_Sub2 extends Class1_Sub5 {

	@OriginalMember(owner = "client!gn", name = "Hb", descriptor = "J")
	private long aLong75;

	@OriginalMember(owner = "client!gn", name = "Ib", descriptor = "I")
	private int anInt2136;

	@OriginalMember(owner = "client!gn", name = "Kb", descriptor = "I")
	private int anInt2137;

	@OriginalMember(owner = "client!gn", name = "Lb", descriptor = "J")
	private long aLong76;

	@OriginalMember(owner = "client!gn", name = "Mb", descriptor = "Z")
	private boolean aBoolean149;

	@OriginalMember(owner = "client!gn", name = "Nb", descriptor = "I")
	private int anInt2138;

	@OriginalMember(owner = "client!gn", name = "Ob", descriptor = "Lclient!h;")
	private Class1_Sub16 aClass1_Sub16_1;

	@OriginalMember(owner = "client!gn", name = "Pb", descriptor = "Z")
	private boolean aBoolean150;

	@OriginalMember(owner = "client!gn", name = "w", descriptor = "[I")
	private int[] anIntArray188 = new int[16];

	@OriginalMember(owner = "client!gn", name = "B", descriptor = "[I")
	private int[] anIntArray189 = new int[16];

	@OriginalMember(owner = "client!gn", name = "I", descriptor = "[I")
	private int[] anIntArray192 = new int[16];

	@OriginalMember(owner = "client!gn", name = "H", descriptor = "[I")
	private int[] anIntArray191 = new int[16];

	@OriginalMember(owner = "client!gn", name = "J", descriptor = "[[Lclient!ea;")
	private Class1_Sub12[][] aClass1_Sub12ArrayArray1 = new Class1_Sub12[16][128];

	@OriginalMember(owner = "client!gn", name = "Q", descriptor = "[I")
	private int[] anIntArray194 = new int[16];

	@OriginalMember(owner = "client!gn", name = "D", descriptor = "[I")
	private int[] anIntArray190 = new int[16];

	@OriginalMember(owner = "client!gn", name = "cb", descriptor = "[[Lclient!ea;")
	private Class1_Sub12[][] aClass1_Sub12ArrayArray2 = new Class1_Sub12[16][128];

	@OriginalMember(owner = "client!gn", name = "r", descriptor = "I")
	private int anInt2092 = 1000000;

	@OriginalMember(owner = "client!gn", name = "kb", descriptor = "[I")
	private int[] anIntArray198 = new int[16];

	@OriginalMember(owner = "client!gn", name = "pb", descriptor = "[I")
	private int[] anIntArray199 = new int[16];

	@OriginalMember(owner = "client!gn", name = "jb", descriptor = "[I")
	public int[] anIntArray197 = new int[16];

	@OriginalMember(owner = "client!gn", name = "rb", descriptor = "[I")
	public int[] anIntArray200 = new int[16];

	@OriginalMember(owner = "client!gn", name = "Z", descriptor = "[I")
	private int[] anIntArray195 = new int[16];

	@OriginalMember(owner = "client!gn", name = "ab", descriptor = "[I")
	public int[] anIntArray196 = new int[16];

	@OriginalMember(owner = "client!gn", name = "Eb", descriptor = "[I")
	private int[] anIntArray201 = new int[16];

	@OriginalMember(owner = "client!gn", name = "A", descriptor = "I")
	private int anInt2098 = 256;

	@OriginalMember(owner = "client!gn", name = "L", descriptor = "[I")
	private int[] anIntArray193 = new int[16];

	@OriginalMember(owner = "client!gn", name = "Gb", descriptor = "[I")
	private int[] anIntArray202 = new int[16];

	@OriginalMember(owner = "client!gn", name = "t", descriptor = "[I")
	private int[] anIntArray187 = new int[16];

	@OriginalMember(owner = "client!gn", name = "M", descriptor = "Lclient!dg;")
	private Class29 aClass29_1 = new Class29();

	@OriginalMember(owner = "client!gn", name = "Jb", descriptor = "Lclient!un;")
	private Class1_Sub5_Sub3 aClass1_Sub5_Sub3_1 = new Class1_Sub5_Sub3(this);

	@OriginalMember(owner = "client!gn", name = "vb", descriptor = "Lclient!ik;")
	private Class70 aClass70_5 = new Class70(128);

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub2() {
		this.method1656();
		this.method1671(true);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method4372(@OriginalArg(0) int arg0) {
		if (this.aClass29_1.method916()) {
			@Pc(19) int local19 = this.aClass29_1.anInt1106 * this.anInt2092 / Static13.anInt256;
			do {
				@Pc(28) long local28 = (long) local19 * (long) arg0 + this.aLong75;
				if (this.aLong76 - local28 >= 0L) {
					this.aLong75 = local28;
					break;
				}
				@Pc(58) int local58 = (int) (((long) local19 + this.aLong76 - this.aLong75 - 1L) / (long) local19);
				this.aLong75 += (long) local58 * (long) local19;
				arg0 -= local58;
				this.aClass1_Sub5_Sub3_1.method4372(local58);
				this.method1641();
			} while (this.aClass29_1.method916());
		}
		this.aClass1_Sub5_Sub3_1.method4372(arg0);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(III)V")
	private void method1637() {
		this.anIntArray199[9] = 128;
		this.anIntArray195[9] = 128;
		this.method1665(9, 128);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)V")
	private void method1639(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(10) int local10 = 0; local10 < 16; local10++) {
				this.method1639(local10);
			}
			return;
		}
		this.anIntArray201[arg0] = 12800;
		this.anIntArray192[arg0] = 8192;
		this.anIntArray189[arg0] = 16383;
		this.anIntArray193[arg0] = 8192;
		this.anIntArray188[arg0] = 0;
		this.anIntArray187[arg0] = 8192;
		this.method1650(arg0);
		this.method1666(arg0);
		this.anIntArray200[arg0] = 0;
		this.anIntArray191[arg0] = 32767;
		this.anIntArray202[arg0] = 256;
		this.anIntArray197[arg0] = 0;
		this.method1643(8192, arg0);
	}

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)Z")
	public synchronized boolean method1640() {
		return this.aClass29_1.method916();
	}

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "(I)V")
	private void method1641() {
		@Pc(8) int local8 = this.anInt2136;
		@Pc(11) int local11 = this.anInt2137;
		@Pc(14) long local14 = this.aLong76;
		if (this.aClass1_Sub16_1 != null && this.anInt2138 == local8) {
			this.method1649(this.aBoolean149, this.aClass1_Sub16_1, this.aBoolean150);
			this.method1641();
			return;
		}
		while (this.anInt2136 == local8) {
			while (local8 == this.aClass29_1.anIntArray101[local11]) {
				this.aClass29_1.method922(local11);
				@Pc(69) int local69 = this.aClass29_1.method925(local11);
				if (local69 == 1) {
					this.aClass29_1.method927();
					this.aClass29_1.method924(local11);
					if (this.aClass29_1.method923()) {
						if (this.aClass1_Sub16_1 != null) {
							this.method1669(this.aBoolean149, this.aClass1_Sub16_1);
							this.method1641();
							return;
						}
						if (!this.aBoolean149 || local8 == 0) {
							this.method1671(true);
							this.aClass29_1.method919();
							return;
						}
						this.aClass29_1.method926(local14);
					}
					break;
				}
				if ((local69 & 0x80) != 0) {
					this.method1657(local69);
				}
				this.aClass29_1.method914(local11);
				this.aClass29_1.method924(local11);
			}
			local11 = this.aClass29_1.method921();
			local8 = this.aClass29_1.anIntArray101[local11];
			local14 = this.aClass29_1.method917(local8);
		}
		this.aLong76 = local14;
		this.anInt2137 = local11;
		this.anInt2136 = local8;
		if (this.aClass1_Sub16_1 != null && this.anInt2138 < local8) {
			this.anInt2136 = this.anInt2138;
			this.anInt2137 = -1;
			this.aLong76 = this.aClass29_1.method917(this.anInt2136);
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!ea;Z)I")
	private int method1642(@OriginalArg(0) Class1_Sub12 arg0) {
		@Pc(16) int local16 = this.anIntArray192[arg0.anInt1223];
		return local16 >= 8192 ? 16384 - ((128 - arg0.anInt1212) * (-local16 + 16384) + 32 >> 6) : arg0.anInt1212 * local16 - -32 >> 6;
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(III)V")
	private void method1643(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray190[arg1] = arg0;
		this.anIntArray196[arg1] = (int) (Math.pow((double) 2, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IBII)V")
	private void method1644(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIZ)V")
	public synchronized void method1645() {
		this.method1637();
	}

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "()I")
	@Override
	public synchronized int method4373() {
		return 0;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ZI)V")
	private synchronized void method1646(@OriginalArg(0) boolean arg0) {
		this.aClass29_1.method919();
		this.aClass1_Sub16_1 = null;
		this.method1671(arg0);
	}

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "(B)V")
	public synchronized void method1647() {
		this.method1646(true);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILclient!ea;)Z")
	public boolean method1648(@OriginalArg(1) Class1_Sub12 arg0) {
		if (arg0.aClass1_Sub5_Sub1_3 != null) {
			return false;
		}
		if (arg0.anInt1220 >= 0) {
			arg0.method4441();
			if (arg0.anInt1213 > 0 && this.aClass1_Sub12ArrayArray2[arg0.anInt1223][arg0.anInt1213] == arg0) {
				this.aClass1_Sub12ArrayArray2[arg0.anInt1223][arg0.anInt1213] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ZLclient!h;ZI)V")
	private synchronized void method1649(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub16 arg1, @OriginalArg(2) boolean arg2) {
		this.method1646(arg2);
		this.aClass29_1.method915(arg1.aByteArray34);
		this.aBoolean149 = arg0;
		this.aLong75 = 0L;
		@Pc(24) int local24 = this.aClass29_1.method912();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass29_1.method922(local26);
			this.aClass29_1.method914(local26);
			this.aClass29_1.method924(local26);
		}
		this.anInt2137 = this.aClass29_1.method921();
		this.anInt2136 = this.aClass29_1.anIntArray101[this.anInt2137];
		this.aLong76 = this.aClass29_1.method917(this.anInt2136);
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(II)V")
	private void method1650(@OriginalArg(0) int arg0) {
		if ((this.anIntArray200[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(28) Class1_Sub12 local28 = (Class1_Sub12) this.aClass1_Sub5_Sub3_1.aClass61_29.method1835(); local28 != null; local28 = (Class1_Sub12) this.aClass1_Sub5_Sub3_1.aClass61_29.method1836()) {
			if (arg0 == local28.anInt1223 && this.aClass1_Sub12ArrayArray1[arg0][local28.anInt1205] == null && local28.anInt1220 < 0) {
				local28.anInt1220 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(BLclient!ea;)I")
	private int method1651(@OriginalArg(1) Class1_Sub12 arg0) {
		if (this.anIntArray194[arg0.anInt1223] == 0) {
			return 0;
		}
		@Pc(18) Class76 local18 = arg0.aClass76_1;
		@Pc(34) int local34 = this.anIntArray201[arg0.anInt1223] * this.anIntArray189[arg0.anInt1223] + 4096 >> 13;
		@Pc(42) int local42 = local34 * local34 + 16384 >> 15;
		@Pc(51) int local51 = local42 * arg0.anInt1217 + 16384 >> 15;
		@Pc(67) int local67 = local51 * this.anInt2098 + 128 >> 8;
		local34 = this.anIntArray194[arg0.anInt1223] * local67 + 128 >> 8;
		if (local18.anInt2806 > 0) {
			local34 = (int) ((double) local34 * Math.pow(0.5D, (double) local18.anInt2806 * 1.953125E-5D * (double) arg0.anInt1211) + 0.5D);
		}
		@Pc(117) int local117;
		@Pc(114) int local114;
		@Pc(152) int local152;
		@Pc(142) int local142;
		if (local18.aByteArray42 != null) {
			local114 = local18.aByteArray42[arg0.anInt1221 + 1];
			local117 = arg0.anInt1200;
			if (local18.aByteArray42.length - 2 > arg0.anInt1221) {
				local142 = (local18.aByteArray42[arg0.anInt1221 + 2] & 0xFF) << 8;
				local152 = (local18.aByteArray42[arg0.anInt1221] & 0xFF) << 8;
				local114 += (local18.aByteArray42[arg0.anInt1221 + 3] - local114) * (-local152 + local117) / (local142 - local152);
			}
			local34 = local34 * local114 + 32 >> 6;
		}
		if (arg0.anInt1220 > 0 && local18.aByteArray43 != null) {
			local117 = arg0.anInt1220;
			local114 = local18.aByteArray43[arg0.anInt1203 + 1];
			if (local18.aByteArray43.length - 2 > arg0.anInt1203) {
				local152 = (local18.aByteArray43[arg0.anInt1203] & 0xFF) << 8;
				local142 = (local18.aByteArray43[arg0.anInt1203 + 2] & 0xFF) << 8;
				local114 += (local117 - local152) * (local18.aByteArray43[arg0.anInt1203 + 3] - local114) / (local142 - local152);
			}
			local34 = local114 * local34 + 32 >> 6;
		}
		return local34;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[IBLclient!ea;I)Z")
	public boolean method1652(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class1_Sub12 arg2, @OriginalArg(4) int arg3) {
		arg2.anInt1216 = Static13.anInt256 / 100;
		if (arg2.anInt1220 >= 0 && (arg2.aClass1_Sub5_Sub1_3 == null || arg2.aClass1_Sub5_Sub1_3.method1145())) {
			arg2.method1040();
			arg2.method4441();
			if (arg2.anInt1213 > 0 && arg2 == this.aClass1_Sub12ArrayArray2[arg2.anInt1223][arg2.anInt1213]) {
				this.aClass1_Sub12ArrayArray2[arg2.anInt1223][arg2.anInt1213] = null;
			}
			return true;
		}
		@Pc(57) int local57 = arg2.anInt1202;
		if (local57 > 0) {
			local57 -= (int) (Math.pow(2.0D, (double) this.anIntArray187[arg2.anInt1223] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local57 < 0) {
				local57 = 0;
			}
			arg2.anInt1202 = local57;
		}
		arg2.aClass1_Sub5_Sub1_3.method1167(this.method1667(arg2));
		@Pc(98) Class76 local98 = arg2.aClass76_1;
		arg2.anInt1204++;
		arg2.anInt1214 += local98.anInt2808;
		@Pc(129) double local129 = (double) ((arg2.anInt1205 - 60 << 8) + (arg2.anInt1202 * arg2.anInt1201 >> 12)) * 5.086263020833333E-6D;
		@Pc(131) boolean local131 = false;
		if (local98.anInt2806 > 0) {
			if (local98.anInt2813 <= 0) {
				arg2.anInt1211 += 128;
			} else {
				arg2.anInt1211 += (int) (Math.pow(2.0D, (double) local98.anInt2813 * local129) * 128.0D + 0.5D);
			}
			if (local98.anInt2806 * arg2.anInt1211 >= 819200) {
				local131 = true;
			}
		}
		if (local98.aByteArray42 != null) {
			if (local98.anInt2811 <= 0) {
				arg2.anInt1200 += 128;
			} else {
				arg2.anInt1200 += (int) (Math.pow(2.0D, local129 * (double) local98.anInt2811) * 128.0D + 0.5D);
			}
			while (arg2.anInt1221 < local98.aByteArray42.length - 2 && arg2.anInt1200 > (local98.aByteArray42[arg2.anInt1221 + 2] & 0xFF) << 8) {
				arg2.anInt1221 += 2;
			}
			if (arg2.anInt1221 == local98.aByteArray42.length - 2 && local98.aByteArray42[arg2.anInt1221 + 1] == 0) {
				local131 = true;
			}
		}
		if (arg2.anInt1220 >= 0 && local98.aByteArray43 != null && (this.anIntArray200[arg2.anInt1223] & 0x1) == 0 && (arg2.anInt1213 < 0 || arg2 != this.aClass1_Sub12ArrayArray2[arg2.anInt1223][arg2.anInt1213])) {
			if (local98.anInt2809 <= 0) {
				arg2.anInt1220 += 128;
			} else {
				arg2.anInt1220 += (int) (Math.pow(2.0D, local129 * (double) local98.anInt2809) * 128.0D + 0.5D);
			}
			while (arg2.anInt1203 < local98.aByteArray43.length - 2 && (local98.aByteArray43[arg2.anInt1203 + 2] & 0xFF) << 8 < arg2.anInt1220) {
				arg2.anInt1203 += 2;
			}
			if (arg2.anInt1203 == local98.aByteArray43.length - 2) {
				local131 = true;
			}
		}
		if (!local131) {
			arg2.aClass1_Sub5_Sub1_3.method1161(arg2.anInt1216, this.method1651(arg2), this.method1642(arg2));
			return false;
		}
		arg2.aClass1_Sub5_Sub1_3.method1160(arg2.anInt1216);
		if (arg1 == null) {
			arg2.aClass1_Sub5_Sub1_3.method4372(arg3);
		} else {
			arg2.aClass1_Sub5_Sub1_3.method4374(arg1, arg0, arg3);
		}
		if (arg2.aClass1_Sub5_Sub1_3.method1172()) {
			this.aClass1_Sub5_Sub3_1.aClass1_Sub5_Sub4_2.method4376(arg2.aClass1_Sub5_Sub1_3);
		}
		arg2.method1040();
		if (arg2.anInt1220 >= 0) {
			arg2.method4441();
			if (arg2.anInt1213 > 0 && arg2 == this.aClass1_Sub12ArrayArray2[arg2.anInt1223][arg2.anInt1213]) {
				this.aClass1_Sub12ArrayArray2[arg2.anInt1223][arg2.anInt1213] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!ea;BZ)V")
	public void method1653(@OriginalArg(0) Class1_Sub12 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(12) int local12 = arg0.aClass1_Sub10_Sub1_1.aByteArray10.length;
		@Pc(41) int local41;
		if (arg1 && arg0.aClass1_Sub10_Sub1_1.aBoolean52) {
			@Pc(28) int local28 = local12 + local12 - arg0.aClass1_Sub10_Sub1_1.anInt648;
			local41 = (int) ((long) local28 * (long) this.anIntArray197[arg0.anInt1223] >> 6);
			local12 <<= 0x8;
			if (local12 <= local41) {
				local41 = local12 + local12 - local41 - 1;
				arg0.aClass1_Sub5_Sub1_3.method1166();
			}
		} else {
			local41 = (int) ((long) local12 * (long) this.anIntArray197[arg0.anInt1223] >> 6);
		}
		arg0.aClass1_Sub5_Sub1_3.method1143(local41);
	}

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(II)V")
	private void method1654(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class1_Sub12 local12 = (Class1_Sub12) this.aClass1_Sub5_Sub3_1.aClass61_29.method1835(); local12 != null; local12 = (Class1_Sub12) this.aClass1_Sub5_Sub3_1.aClass61_29.method1836()) {
			if (arg0 < 0 || arg0 == local12.anInt1223) {
				if (local12.aClass1_Sub5_Sub1_3 != null) {
					local12.aClass1_Sub5_Sub1_3.method1160(Static13.anInt256 / 100);
					if (local12.aClass1_Sub5_Sub1_3.method1172()) {
						this.aClass1_Sub5_Sub3_1.aClass1_Sub5_Sub4_2.method4376(local12.aClass1_Sub5_Sub1_3);
					}
					local12.method1040();
				}
				if (local12.anInt1220 < 0) {
					this.aClass1_Sub12ArrayArray1[local12.anInt1223][local12.anInt1205] = null;
				}
				local12.method4441();
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILclient!h;Lclient!km;Lclient!nc;I)Z")
	public synchronized boolean method1655(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) Class91 arg1, @OriginalArg(3) Class109 arg2) {
		arg0.method1679();
		@Pc(9) boolean local9 = true;
		@Pc(24) int[] local24 = new int[] { 22050 };
		for (@Pc(32) Class1_Sub25 local32 = (Class1_Sub25) arg0.aClass70_6.method2074(); local32 != null; local32 = (Class1_Sub25) arg0.aClass70_6.method2079()) {
			@Pc(38) int local38 = (int) local32.aLong205;
			@Pc(48) Class1_Sub6 local48 = (Class1_Sub6) this.aClass70_5.method2075((long) local38);
			if (local48 == null) {
				local48 = Static172.method2936(arg1, local38);
				if (local48 == null) {
					local9 = false;
					continue;
				}
				this.aClass70_5.method2084((long) local38, local48);
			}
			if (!local48.method291(local32.aByteArray53, local24, arg2)) {
				local9 = false;
			}
		}
		if (local9) {
			arg0.method1680();
		}
		return local9;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIB)V")
	private synchronized void method1656() {
		for (@Pc(14) int local14 = 0; local14 < 16; local14++) {
			this.anIntArray194[local14] = 256;
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "()Lclient!an;")
	@Override
	public synchronized Class1_Sub5 method4370() {
		return this.aClass1_Sub5_Sub3_1;
	}

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "(II)V")
	private void method1657(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = arg0 & 0xF0;
		@Pc(24) int local24;
		@Pc(20) int local20;
		@Pc(30) int local30;
		if (local5 == 128) {
			local20 = arg0 >> 8 & 0x7F;
			local24 = arg0 & 0xF;
			local30 = arg0 >> 16 & 0x7F;
			this.method1660(local20, local30, local24);
		} else if (local5 == 144) {
			local24 = arg0 & 0xF;
			local20 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 <= 0) {
				this.method1660(local20, 64, local24);
			} else {
				this.method1668(local20, local24, local30);
			}
		} else if (local5 == 160) {
			local30 = arg0 >> 16 & 0x7F;
			local24 = arg0 & 0xF;
			local20 = arg0 >> 8 & 0x7F;
			this.method1644(local20, local30, local24);
		} else if (local5 == 176) {
			local24 = arg0 & 0xF;
			local20 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local20 == 0) {
				this.anIntArray195[local24] = (this.anIntArray195[local24] & 0xFFE03FFF) + (local30 << 14);
			}
			if (local20 == 32) {
				this.anIntArray195[local24] = (this.anIntArray195[local24] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local20 == 1) {
				this.anIntArray188[local24] = (local30 << 7) + (this.anIntArray188[local24] & 0xFFFFC07F);
			}
			if (local20 == 33) {
				this.anIntArray188[local24] = (this.anIntArray188[local24] & 0xFFFFFF80) + local30;
			}
			if (local20 == 5) {
				this.anIntArray187[local24] = (local30 << 7) + (this.anIntArray187[local24] & 0xFFFFC07F);
			}
			if (local20 == 37) {
				this.anIntArray187[local24] = (this.anIntArray187[local24] & 0xFFFFFF80) + local30;
			}
			if (local20 == 7) {
				this.anIntArray201[local24] = (this.anIntArray201[local24] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local20 == 39) {
				this.anIntArray201[local24] = local30 + (this.anIntArray201[local24] & 0xFFFFFF80);
			}
			if (local20 == 10) {
				this.anIntArray192[local24] = (this.anIntArray192[local24] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local20 == 42) {
				this.anIntArray192[local24] = local30 + (this.anIntArray192[local24] & 0xFFFFFF80);
			}
			if (local20 == 11) {
				this.anIntArray189[local24] = (this.anIntArray189[local24] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local20 == 43) {
				this.anIntArray189[local24] = (this.anIntArray189[local24] & 0xFFFFFF80) + local30;
			}
			if (local20 == 64) {
				if (local30 >= 64) {
					this.anIntArray200[local24] |= 0x1;
				} else {
					this.anIntArray200[local24] &= 0xFFFFFFFE;
				}
			}
			if (local20 == 65) {
				if (local30 < 64) {
					this.method1650(local24);
					this.anIntArray200[local24] &= 0xFFFFFFFD;
				} else {
					this.anIntArray200[local24] |= 0x2;
				}
			}
			if (local20 == 99) {
				this.anIntArray191[local24] = (this.anIntArray191[local24] & 0x7F) + (local30 << 7);
			}
			if (local20 == 98) {
				this.anIntArray191[local24] = local30 + (this.anIntArray191[local24] & 0x3F80);
			}
			if (local20 == 101) {
				this.anIntArray191[local24] = (this.anIntArray191[local24] & 0x7F) + (local30 << 7) + 16384;
			}
			if (local20 == 100) {
				this.anIntArray191[local24] = (this.anIntArray191[local24] & 0x3F80) + local30 + 16384;
			}
			if (local20 == 120) {
				this.method1654(local24);
			}
			if (local20 == 121) {
				this.method1639(local24);
			}
			if (local20 == 123) {
				this.method1662(local24);
			}
			@Pc(543) int local543;
			if (local20 == 6) {
				local543 = this.anIntArray191[local24];
				if (local543 == 16384) {
					this.anIntArray202[local24] = (this.anIntArray202[local24] & 0xFFFFC07F) + (local30 << 7);
				}
			}
			if (local20 == 38) {
				local543 = this.anIntArray191[local24];
				if (local543 == 16384) {
					this.anIntArray202[local24] = (this.anIntArray202[local24] & 0xFFFFFF80) + local30;
				}
			}
			if (local20 == 16) {
				this.anIntArray197[local24] = (local30 << 7) + (this.anIntArray197[local24] & 0xFFFFC07F);
			}
			if (local20 == 48) {
				this.anIntArray197[local24] = (this.anIntArray197[local24] & 0xFFFFFF80) + local30;
			}
			if (local20 == 81) {
				if (local30 >= 64) {
					this.anIntArray200[local24] |= 0x4;
				} else {
					this.method1666(local24);
					this.anIntArray200[local24] &= 0xFFFFFFFB;
				}
			}
			if (local20 == 17) {
				this.method1643((local30 << 7) + (this.anIntArray190[local24] & 0xFFFFC07F), local24);
			}
			if (local20 == 49) {
				this.method1643((this.anIntArray190[local24] & 0xFFFFFF80) + local30, local24);
			}
		} else if (local5 == 192) {
			local24 = arg0 & 0xF;
			local20 = arg0 >> 8 & 0x7F;
			this.method1665(local24, this.anIntArray195[local24] + local20);
		} else if (local5 == 208) {
			local24 = arg0 & 0xF;
			local20 = arg0 >> 8 & 0x7F;
			this.method1664(local24, local20);
		} else if (local5 == 224) {
			local24 = arg0 & 0xF;
			local20 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7F5C) >> 8);
			this.method1663(local20, local24);
		} else {
			local5 = arg0 & 0xFF;
			if (local5 == 255) {
				this.method1671(true);
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "(B)I")
	public int method1659() {
		return this.anInt2098;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIB)V")
	private void method1660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub12 local8 = this.aClass1_Sub12ArrayArray1[arg2][arg0];
		if (local8 == null) {
			return;
		}
		this.aClass1_Sub12ArrayArray1[arg2][arg0] = null;
		if ((this.anIntArray200[arg2] & 0x2) == 0) {
			local8.anInt1220 = 0;
			return;
		}
		for (@Pc(45) Class1_Sub12 local45 = (Class1_Sub12) this.aClass1_Sub5_Sub3_1.aClass61_29.method1835(); local45 != null; local45 = (Class1_Sub12) this.aClass1_Sub5_Sub3_1.aClass61_29.method1836()) {
			if (local45.anInt1223 == local8.anInt1223 && local45.anInt1220 < 0 && local45 != local8) {
				local8.anInt1220 = 0;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "(I)V")
	public synchronized void method1661() {
		for (@Pc(11) Class1_Sub6 local11 = (Class1_Sub6) this.aClass70_5.method2074(); local11 != null; local11 = (Class1_Sub6) this.aClass70_5.method2079()) {
			local11.method295();
		}
	}

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "(II)V")
	private void method1662(@OriginalArg(0) int arg0) {
		for (@Pc(16) Class1_Sub12 local16 = (Class1_Sub12) this.aClass1_Sub5_Sub3_1.aClass61_29.method1835(); local16 != null; local16 = (Class1_Sub12) this.aClass1_Sub5_Sub3_1.aClass61_29.method1836()) {
			if ((arg0 < 0 || local16.anInt1223 == arg0) && local16.anInt1220 < 0) {
				this.aClass1_Sub12ArrayArray1[local16.anInt1223][local16.anInt1205] = null;
				local16.anInt1220 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(III)V")
	private void method1663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray193[arg1] = arg0;
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(IIB)V")
	private void method1664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "(III)V")
	private void method1665(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anIntArray198[arg0]) {
			this.anIntArray198[arg0] = arg1;
			for (@Pc(27) int local27 = 0; local27 < 128; local27++) {
				this.aClass1_Sub12ArrayArray2[arg0][local27] = null;
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(ZI)V")
	private void method1666(@OriginalArg(1) int arg0) {
		if ((this.anIntArray200[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(26) Class1_Sub12 local26 = (Class1_Sub12) this.aClass1_Sub5_Sub3_1.aClass61_29.method1835(); local26 != null; local26 = (Class1_Sub12) this.aClass1_Sub5_Sub3_1.aClass61_29.method1836()) {
			if (local26.anInt1223 == arg0) {
				local26.anInt1206 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(BLclient!ea;)I")
	private int method1667(@OriginalArg(1) Class1_Sub12 arg0) {
		@Pc(10) int local10 = (arg0.anInt1201 * arg0.anInt1202 >> 12) + arg0.anInt1207;
		@Pc(13) Class76 local13 = arg0.aClass76_1;
		local10 += this.anIntArray202[arg0.anInt1223] * (this.anIntArray193[arg0.anInt1223] - 8192) >> 12;
		@Pc(58) int local58;
		if (local13.anInt2808 > 0 && (local13.anInt2814 > 0 || this.anIntArray188[arg0.anInt1223] > 0)) {
			local58 = local13.anInt2814 << 2;
			@Pc(63) int local63 = local13.anInt2812 << 1;
			if (arg0.anInt1204 < local63) {
				local58 = local58 * arg0.anInt1204 / local63;
			}
			local58 += this.anIntArray188[arg0.anInt1223] >> 7;
			@Pc(93) double local93 = Math.sin((double) (arg0.anInt1214 & 0x1FF) * 0.01227184630308513D);
			local10 += (int) ((double) local58 * local93);
		}
		local58 = (int) ((double) (arg0.aClass1_Sub10_Sub1_1.anInt650 * 256) * Math.pow(2.0D, (double) local10 * 3.255208333333333E-4D) / (double) Static13.anInt256 + 0.5D);
		return local58 >= 1 ? local58 : 1;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIII)V")
	private void method1668(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method1660(arg0, 64, arg1);
		if ((this.anIntArray200[arg1] & 0x2) != 0) {
			for (@Pc(28) Class1_Sub12 local28 = (Class1_Sub12) this.aClass1_Sub5_Sub3_1.aClass61_29.method1838(); local28 != null; local28 = (Class1_Sub12) this.aClass1_Sub5_Sub3_1.aClass61_29.method1848()) {
				if (local28.anInt1223 == arg1 && local28.anInt1220 < 0) {
					this.aClass1_Sub12ArrayArray1[arg1][local28.anInt1205] = null;
					this.aClass1_Sub12ArrayArray1[arg1][arg0] = local28;
					@Pc(69) int local69 = local28.anInt1207 + (local28.anInt1202 * local28.anInt1201 >> 12);
					local28.anInt1202 = 4096;
					local28.anInt1207 += arg0 - local28.anInt1205 << 8;
					local28.anInt1205 = arg0;
					local28.anInt1201 = local69 - local28.anInt1207;
					return;
				}
			}
		}
		@Pc(115) Class1_Sub6 local115 = (Class1_Sub6) this.aClass70_5.method2075((long) this.anIntArray198[arg1]);
		if (local115 == null) {
			return;
		}
		@Pc(124) Class1_Sub10_Sub1 local124 = local115.aClass1_Sub10_Sub1Array1[arg0];
		if (local124 == null) {
			return;
		}
		@Pc(143) Class1_Sub12 local143 = new Class1_Sub12();
		local143.aClass1_Sub10_Sub1_1 = local124;
		local143.anInt1223 = arg1;
		local143.aClass1_Sub6_1 = local115;
		local143.aClass76_1 = local115.aClass76Array1[arg0];
		local143.anInt1213 = local115.aByteArray5[arg0];
		local143.anInt1205 = arg0;
		local143.anInt1217 = local115.aByteArray4[arg0] * local115.anInt280 * arg2 * arg2 + 1024 >> 11;
		local143.anInt1212 = local115.aByteArray6[arg0] & 0xFF;
		local143.anInt1207 = (arg0 << 8) - (local115.aShortArray2[arg0] & 0x7FFF);
		local143.anInt1211 = 0;
		local143.anInt1203 = 0;
		local143.anInt1220 = -1;
		local143.anInt1200 = 0;
		local143.anInt1221 = 0;
		if (this.anIntArray197[arg1] == 0) {
			local143.aClass1_Sub5_Sub1_3 = Static301.method1173(local124, this.method1667(local143), this.method1651(local143), this.method1642(local143));
		} else {
			local143.aClass1_Sub5_Sub1_3 = Static301.method1173(local124, this.method1667(local143), 0, this.method1642(local143));
			this.method1653(local143, local115.aShortArray2[arg0] < 0);
		}
		if (local115.aShortArray2[arg0] < 0) {
			local143.aClass1_Sub5_Sub1_3.method1182(-1);
		}
		if (local143.anInt1213 >= 0) {
			@Pc(297) Class1_Sub12 local297 = this.aClass1_Sub12ArrayArray2[arg1][local143.anInt1213];
			if (local297 != null && local297.anInt1220 < 0) {
				this.aClass1_Sub12ArrayArray1[arg1][local297.anInt1205] = null;
				local297.anInt1220 = 0;
			}
			this.aClass1_Sub12ArrayArray2[arg1][local143.anInt1213] = local143;
		}
		this.aClass1_Sub5_Sub3_1.aClass61_29.method1839(local143);
		this.aClass1_Sub12ArrayArray1[arg1][arg0] = local143;
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4374(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass29_1.method916()) {
			@Pc(19) int local19 = this.anInt2092 * this.aClass29_1.anInt1106 / Static13.anInt256;
			do {
				@Pc(28) long local28 = (long) local19 * (long) arg2 + this.aLong75;
				if (this.aLong76 - local28 >= 0L) {
					this.aLong75 = local28;
					break;
				}
				@Pc(59) int local59 = (int) ((this.aLong76 + (long) local19 - this.aLong75 - 1L) / (long) local19);
				this.aLong75 += (long) local19 * (long) local59;
				arg2 -= local59;
				this.aClass1_Sub5_Sub3_1.method4374(arg0, arg1, local59);
				this.method1641();
				arg1 += local59;
			} while (this.aClass29_1.method916());
		}
		this.aClass1_Sub5_Sub3_1.method4374(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(BZLclient!h;)V")
	public synchronized void method1669(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		this.method1649(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!gn", name = "f", descriptor = "(I)V")
	public synchronized void method1670() {
		for (@Pc(18) Class1_Sub6 local18 = (Class1_Sub6) this.aClass70_5.method2074(); local18 != null; local18 = (Class1_Sub6) this.aClass70_5.method2079()) {
			local18.method4441();
		}
	}

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "()Lclient!an;")
	@Override
	public synchronized Class1_Sub5 method4375() {
		return null;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ZB)V")
	private void method1671(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method1654(-1);
		} else {
			this.method1662(-1);
		}
		this.method1639(-1);
		@Pc(25) int local25;
		for (local25 = 0; local25 < 16; local25++) {
			this.anIntArray198[local25] = this.anIntArray199[local25];
		}
		for (local25 = 0; local25 < 16; local25++) {
			this.anIntArray195[local25] = this.anIntArray199[local25] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!gn", name = "f", descriptor = "(II)V")
	public synchronized void method1672(@OriginalArg(0) int arg0) {
		this.anInt2098 = arg0;
	}
}
