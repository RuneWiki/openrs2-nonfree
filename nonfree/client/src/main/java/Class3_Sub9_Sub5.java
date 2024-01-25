import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class Class3_Sub9_Sub5 extends Class3_Sub9 {

	@OriginalMember(owner = "client!pt", name = "Cb", descriptor = "Z")
	private boolean aBoolean605;

	@OriginalMember(owner = "client!pt", name = "Eb", descriptor = "J")
	private long aLong229;

	@OriginalMember(owner = "client!pt", name = "Fb", descriptor = "I")
	private int anInt8027;

	@OriginalMember(owner = "client!pt", name = "Gb", descriptor = "I")
	private int anInt8028;

	@OriginalMember(owner = "client!pt", name = "Hb", descriptor = "J")
	private long aLong230;

	@OriginalMember(owner = "client!pt", name = "Ib", descriptor = "Z")
	private boolean aBoolean606;

	@OriginalMember(owner = "client!pt", name = "Jb", descriptor = "Lclient!sh;")
	private Class3_Sub48 aClass3_Sub48_2;

	@OriginalMember(owner = "client!pt", name = "Kb", descriptor = "I")
	private int anInt8029;

	@OriginalMember(owner = "client!pt", name = "x", descriptor = "[[Lclient!mja;")
	private final Class3_Sub35[][] aClass3_Sub35ArrayArray1 = new Class3_Sub35[16][128];

	@OriginalMember(owner = "client!pt", name = "r", descriptor = "[I")
	private final int[] anIntArray485 = new int[16];

	@OriginalMember(owner = "client!pt", name = "v", descriptor = "[I")
	private final int[] anIntArray486 = new int[16];

	@OriginalMember(owner = "client!pt", name = "L", descriptor = "[I")
	private final int[] anIntArray489 = new int[16];

	@OriginalMember(owner = "client!pt", name = "I", descriptor = "[I")
	private final int[] anIntArray488 = new int[16];

	@OriginalMember(owner = "client!pt", name = "T", descriptor = "[I")
	public final int[] anIntArray493 = new int[16];

	@OriginalMember(owner = "client!pt", name = "m", descriptor = "[I")
	private final int[] anIntArray484 = new int[16];

	@OriginalMember(owner = "client!pt", name = "N", descriptor = "[[Lclient!mja;")
	private final Class3_Sub35[][] aClass3_Sub35ArrayArray2 = new Class3_Sub35[16][128];

	@OriginalMember(owner = "client!pt", name = "V", descriptor = "[I")
	private final int[] anIntArray494 = new int[16];

	@OriginalMember(owner = "client!pt", name = "P", descriptor = "[I")
	public final int[] anIntArray491 = new int[16];

	@OriginalMember(owner = "client!pt", name = "bb", descriptor = "[I")
	public final int[] anIntArray495 = new int[16];

	@OriginalMember(owner = "client!pt", name = "R", descriptor = "[I")
	private final int[] anIntArray492 = new int[16];

	@OriginalMember(owner = "client!pt", name = "C", descriptor = "I")
	private int anInt7993 = 256;

	@OriginalMember(owner = "client!pt", name = "xb", descriptor = "[I")
	private final int[] anIntArray497 = new int[16];

	@OriginalMember(owner = "client!pt", name = "zb", descriptor = "I")
	private final int anInt8025 = 1000000;

	@OriginalMember(owner = "client!pt", name = "Ab", descriptor = "[I")
	private final int[] anIntArray499 = new int[16];

	@OriginalMember(owner = "client!pt", name = "O", descriptor = "[I")
	private final int[] anIntArray490 = new int[16];

	@OriginalMember(owner = "client!pt", name = "tb", descriptor = "[I")
	private final int[] anIntArray496 = new int[16];

	@OriginalMember(owner = "client!pt", name = "yb", descriptor = "[I")
	private final int[] anIntArray498 = new int[16];

	@OriginalMember(owner = "client!pt", name = "B", descriptor = "[I")
	private final int[] anIntArray487 = new int[16];

	@OriginalMember(owner = "client!pt", name = "Z", descriptor = "Lclient!dea;")
	private final Class76 aClass76_1 = new Class76();

	@OriginalMember(owner = "client!pt", name = "Db", descriptor = "Lclient!oha;")
	private final Class3_Sub9_Sub4 aClass3_Sub9_Sub4_1 = new Class3_Sub9_Sub4(this);

	@OriginalMember(owner = "client!pt", name = "wb", descriptor = "Lclient!cja;")
	private final Class62 aClass62_35;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub5() {
		this.aClass62_35 = new Class62(128);
		this.method6713(256, -1);
		this.method6740(true);
	}

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lclient!pt;)V")
	public Class3_Sub9_Sub5(@OriginalArg(0) Class3_Sub9_Sub5 arg0) {
		this.aClass62_35 = arg0.aClass62_35;
		this.method6713(256, -1);
		this.method6740(true);
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(I)V")
	public synchronized void method6703() {
		for (@Pc(7) Class3_Sub38 local7 = (Class3_Sub38) this.aClass62_35.method1680(); local7 != null; local7 = (Class3_Sub38) this.aClass62_35.method1681()) {
			local7.method8770();
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(II)V")
	public synchronized void method6705(@OriginalArg(0) int arg0) {
		this.anInt7993 = arg0;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "([IIILclient!mja;I)Z")
	public boolean method6707(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub35 arg3) {
		arg3.anInt6593 = Static656.anInt1392 / 100;
		if (arg3.anInt6576 >= 0 && (arg3.aClass3_Sub9_Sub2_3 == null || arg3.aClass3_Sub9_Sub2_3.method3746())) {
			arg3.method5500();
			arg3.method8770();
			if (arg3.anInt6589 > 0 && this.aClass3_Sub35ArrayArray1[arg3.anInt6582][arg3.anInt6589] == arg3) {
				this.aClass3_Sub35ArrayArray1[arg3.anInt6582][arg3.anInt6589] = null;
			}
			return true;
		}
		@Pc(55) int local55 = arg3.anInt6590;
		if (local55 > 0) {
			local55 -= (int) (Math.pow(2.0D, (double) this.anIntArray485[arg3.anInt6582] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local55 < 0) {
				local55 = 0;
			}
			arg3.anInt6590 = local55;
		}
		arg3.aClass3_Sub9_Sub2_3.method3744(this.method6719(arg3));
		@Pc(95) Class296 local95 = arg3.aClass296_1;
		@Pc(97) boolean local97 = false;
		arg3.anInt6592 += local95.anInt8335;
		arg3.anInt6580++;
		@Pc(128) double local128 = (double) ((arg3.anInt6591 * arg3.anInt6590 >> 12) + (arg3.anInt6585 - 60 << 8)) * 5.086263020833333E-6D;
		if (local95.anInt8334 > 0) {
			if (local95.anInt8330 > 0) {
				arg3.anInt6584 += (int) (Math.pow(2.0D, local128 * (double) local95.anInt8330) * 128.0D + 0.5D);
			} else {
				arg3.anInt6584 += 128;
			}
			if (local95.anInt8334 * arg3.anInt6584 >= 819200) {
				local97 = true;
			}
		}
		if (local95.aByteArray79 != null) {
			if (local95.anInt8337 > 0) {
				arg3.anInt6583 += (int) (Math.pow(2.0D, local128 * (double) local95.anInt8337) * 128.0D + 0.5D);
			} else {
				arg3.anInt6583 += 128;
			}
			while (arg3.anInt6586 < local95.aByteArray79.length - 2 && (local95.aByteArray79[arg3.anInt6586 + 2] & 0xFF) << 8 < arg3.anInt6583) {
				arg3.anInt6586 += 2;
			}
			if (arg3.anInt6586 == local95.aByteArray79.length - 2 && local95.aByteArray79[arg3.anInt6586 + 1] == 0) {
				local97 = true;
			}
		}
		if (arg3.anInt6576 >= 0 && local95.aByteArray80 != null && (this.anIntArray491[arg3.anInt6582] & 0x1) == 0 && (arg3.anInt6589 < 0 || this.aClass3_Sub35ArrayArray1[arg3.anInt6582][arg3.anInt6589] != arg3)) {
			if (local95.anInt8332 > 0) {
				arg3.anInt6576 += (int) (Math.pow(2.0D, local128 * (double) local95.anInt8332) * 128.0D + 0.5D);
			} else {
				arg3.anInt6576 += 128;
			}
			while (local95.aByteArray80.length - 2 > arg3.anInt6581 && (local95.aByteArray80[arg3.anInt6581 + 2] & 0xFF) << 8 < arg3.anInt6576) {
				arg3.anInt6581 += 2;
			}
			if (arg3.anInt6581 == local95.aByteArray80.length - 2) {
				local97 = true;
			}
		}
		if (!local97) {
			arg3.aClass3_Sub9_Sub2_3.method3733(arg3.anInt6593, this.method6729(arg3), this.method6726(arg3));
			return false;
		}
		arg3.aClass3_Sub9_Sub2_3.method3757(arg3.anInt6593);
		if (arg0 == null) {
			arg3.aClass3_Sub9_Sub2_3.method6701(arg1);
		} else {
			arg3.aClass3_Sub9_Sub2_3.method6702(arg0, arg2, arg1);
		}
		if (arg3.aClass3_Sub9_Sub2_3.method3755()) {
			this.aClass3_Sub9_Sub4_1.aClass3_Sub9_Sub1_1.method1419(arg3.aClass3_Sub9_Sub2_3);
		}
		arg3.method5500();
		if (arg3.anInt6576 >= 0) {
			arg3.method8770();
			if (arg3.anInt6589 > 0 && this.aClass3_Sub35ArrayArray1[arg3.anInt6582][arg3.anInt6589] == arg3) {
				this.aClass3_Sub35ArrayArray1[arg3.anInt6582][arg3.anInt6589] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIII)V")
	private void method6708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) Class3_Sub35 local20 = this.aClass3_Sub35ArrayArray2[arg1][arg2];
		if (local20 == null) {
			return;
		}
		this.aClass3_Sub35ArrayArray2[arg1][arg2] = null;
		if ((this.anIntArray491[arg1] & 0x2) == 0) {
			local20.anInt6576 = 0;
			return;
		}
		for (@Pc(44) Class3_Sub35 local44 = (Class3_Sub35) this.aClass3_Sub9_Sub4_1.aClass193_38.method4457(); local44 != null; local44 = (Class3_Sub35) this.aClass3_Sub9_Sub4_1.aClass193_38.method4459()) {
			if (local20.anInt6582 == local44.anInt6582 && local44.anInt6576 < 0 && local20 != local44) {
				local20.anInt6576 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ZBLclient!sh;)V")
	public synchronized void method6709(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class3_Sub48 arg1) {
		this.method6730(true, arg1, arg0);
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(II)V")
	private void method6710(@OriginalArg(1) int arg0) {
		for (@Pc(10) Class3_Sub35 local10 = (Class3_Sub35) this.aClass3_Sub9_Sub4_1.aClass193_38.method4457(); local10 != null; local10 = (Class3_Sub35) this.aClass3_Sub9_Sub4_1.aClass193_38.method4459()) {
			if ((arg0 < 0 || local10.anInt6582 == arg0) && local10.anInt6576 < 0) {
				this.aClass3_Sub35ArrayArray2[local10.anInt6582][local10.anInt6585] = null;
				local10.anInt6576 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method6702(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass76_1.method1976()) {
			@Pc(14) int local14 = this.aClass76_1.anInt2129 * this.anInt8025 / Static656.anInt1392;
			do {
				@Pc(24) long local24 = this.aLong229 + (long) local14 * (long) arg2;
				if (this.aLong230 - local24 >= 0L) {
					this.aLong229 = local24;
					break;
				}
				@Pc(53) int local53 = (int) ((this.aLong230 + (long) local14 - this.aLong229 - 1L) / (long) local14);
				this.aLong229 += (long) local53 * (long) local14;
				this.aClass3_Sub9_Sub4_1.method6702(arg0, arg1, local53);
				arg1 += local53;
				arg2 -= local53;
				this.method6718();
			} while (this.aClass76_1.method1976());
		}
		this.aClass3_Sub9_Sub4_1.method6702(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!pt", name = "f", descriptor = "(I)Z")
	public synchronized boolean method6711() {
		return this.aClass76_1.method1976();
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IB)V")
	private void method6712(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(16) int local16 = 0; local16 < 16; local16++) {
				this.method6712(local16);
			}
			return;
		}
		this.anIntArray497[arg0] = 12800;
		this.anIntArray487[arg0] = 8192;
		this.anIntArray484[arg0] = 16383;
		this.anIntArray496[arg0] = 8192;
		this.anIntArray490[arg0] = 0;
		this.anIntArray485[arg0] = 8192;
		this.method6722(arg0);
		this.method6714(arg0);
		this.anIntArray491[arg0] = 0;
		this.anIntArray494[arg0] = 32767;
		this.anIntArray492[arg0] = 256;
		this.anIntArray495[arg0] = 0;
		this.method6728(arg0, 8192);
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(BII)V")
	public synchronized void method6713(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 0) {
			this.anIntArray499[arg1] = arg0;
		} else {
			for (@Pc(24) int local24 = 0; local24 < 16; local24++) {
				this.anIntArray499[local24] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "()I")
	@Override
	public synchronized int method6699() {
		return 0;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ZI)V")
	private void method6714(@OriginalArg(1) int arg0) {
		if ((this.anIntArray491[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(23) Class3_Sub35 local23 = (Class3_Sub35) this.aClass3_Sub9_Sub4_1.aClass193_38.method4457(); local23 != null; local23 = (Class3_Sub35) this.aClass3_Sub9_Sub4_1.aClass193_38.method4459()) {
			if (arg0 == local23.anInt6582) {
				local23.anInt6579 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(III)V")
	private void method6715() {
		this.anIntArray489[9] = 128;
		this.anIntArray486[9] = 128;
		this.method6721(9, 128);
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lclient!mja;B)Z")
	public boolean method6716(@OriginalArg(0) Class3_Sub35 arg0) {
		if (arg0.aClass3_Sub9_Sub2_3 != null) {
			return false;
		}
		if (arg0.anInt6576 >= 0) {
			arg0.method8770();
			if (arg0.anInt6589 > 0 && arg0 == this.aClass3_Sub35ArrayArray1[arg0.anInt6582][arg0.anInt6589]) {
				this.aClass3_Sub35ArrayArray1[arg0.anInt6582][arg0.anInt6589] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IZ)V")
	private void method6717(@OriginalArg(0) int arg0) {
		for (@Pc(16) Class3_Sub35 local16 = (Class3_Sub35) this.aClass3_Sub9_Sub4_1.aClass193_38.method4457(); local16 != null; local16 = (Class3_Sub35) this.aClass3_Sub9_Sub4_1.aClass193_38.method4459()) {
			if (arg0 < 0 || local16.anInt6582 == arg0) {
				if (local16.aClass3_Sub9_Sub2_3 != null) {
					local16.aClass3_Sub9_Sub2_3.method3757(Static656.anInt1392 / 100);
					if (local16.aClass3_Sub9_Sub2_3.method3755()) {
						this.aClass3_Sub9_Sub4_1.aClass3_Sub9_Sub1_1.method1419(local16.aClass3_Sub9_Sub2_3);
					}
					local16.method5500();
				}
				if (local16.anInt6576 < 0) {
					this.aClass3_Sub35ArrayArray2[local16.anInt6582][local16.anInt6585] = null;
				}
				local16.method8770();
			}
		}
	}

	@OriginalMember(owner = "client!pt", name = "g", descriptor = "(I)V")
	private void method6718() {
		@Pc(8) int local8 = this.anInt8028;
		@Pc(11) int local11 = this.anInt8027;
		@Pc(14) long local14 = this.aLong230;
		if (this.aClass3_Sub48_2 != null && this.anInt8029 == local11) {
			this.method6730(this.aBoolean606, this.aClass3_Sub48_2, this.aBoolean605);
			this.method6718();
			return;
		}
		while (this.anInt8027 == local11) {
			while (this.aClass76_1.anIntArray143[local8] == local11) {
				this.aClass76_1.method1970(local8);
				@Pc(43) int local43 = this.aClass76_1.method1972(local8);
				if (local43 == 1) {
					this.aClass76_1.method1974();
					this.aClass76_1.method1977(local8);
					if (this.aClass76_1.method1981()) {
						if (this.aClass3_Sub48_2 != null) {
							this.method6709(this.aBoolean605, this.aClass3_Sub48_2);
							this.method6718();
							return;
						}
						if (!this.aBoolean605 || local11 == 0) {
							this.method6740(true);
							this.aClass76_1.method1979();
							return;
						}
						this.aClass76_1.method1983(local14);
					}
					break;
				}
				if ((local43 & 0x80) != 0) {
					this.method6737(local43);
				}
				this.aClass76_1.method1984(local8);
				this.aClass76_1.method1977(local8);
			}
			local8 = this.aClass76_1.method1980();
			local11 = this.aClass76_1.anIntArray143[local8];
			local14 = this.aClass76_1.method1975(local11);
		}
		this.anInt8027 = local11;
		this.aLong230 = local14;
		this.anInt8028 = local8;
		if (this.aClass3_Sub48_2 != null && local11 > this.anInt8029) {
			this.anInt8027 = this.anInt8029;
			this.anInt8028 = -1;
			this.aLong230 = this.aClass76_1.method1975(this.anInt8027);
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ZLclient!mja;)I")
	private int method6719(@OriginalArg(1) Class3_Sub35 arg0) {
		@Pc(14) int local14 = (arg0.anInt6591 * arg0.anInt6590 >> 12) + arg0.anInt6587;
		local14 += this.anIntArray492[arg0.anInt6582] * (this.anIntArray496[arg0.anInt6582] - 8192) >> 12;
		@Pc(35) Class296 local35 = arg0.aClass296_1;
		@Pc(64) int local64;
		if (local35.anInt8335 > 0 && (local35.anInt8328 > 0 || this.anIntArray490[arg0.anInt6582] > 0)) {
			local64 = local35.anInt8328 << 2;
			@Pc(69) int local69 = local35.anInt8333 << 1;
			if (local69 > arg0.anInt6580) {
				local64 = local64 * arg0.anInt6580 / local69;
			}
			local64 += this.anIntArray490[arg0.anInt6582] >> 7;
			@Pc(103) double local103 = Math.sin((double) (arg0.anInt6592 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local103 * (double) local64);
		}
		local64 = (int) ((double) (arg0.aClass3_Sub12_Sub1_3.anInt8565 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static656.anInt1392 + 0.5D);
		return local64 < 1 ? 1 : local64;
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(III)V")
	public synchronized void method6720() {
		this.method6715();
	}

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "(III)V")
	private void method6721(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anIntArray488[arg0]) {
			this.anIntArray488[arg0] = arg1;
			for (@Pc(14) int local14 = 0; local14 < 128; local14++) {
				this.aClass3_Sub35ArrayArray1[arg0][local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "(II)V")
	private void method6722(@OriginalArg(0) int arg0) {
		if ((this.anIntArray491[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(15) Class3_Sub35 local15 = (Class3_Sub35) this.aClass3_Sub9_Sub4_1.aClass193_38.method4457(); local15 != null; local15 = (Class3_Sub35) this.aClass3_Sub9_Sub4_1.aClass193_38.method4459()) {
			if (local15.anInt6582 == arg0 && this.aClass3_Sub35ArrayArray2[arg0][local15.anInt6585] == null && local15.anInt6576 < 0) {
				local15.anInt6576 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(IIII)V")
	private void method6723(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method6708(64, arg0, arg1);
		if ((this.anIntArray491[arg0] & 0x2) != 0) {
			for (@Pc(25) Class3_Sub35 local25 = (Class3_Sub35) this.aClass3_Sub9_Sub4_1.aClass193_38.method4456(); local25 != null; local25 = (Class3_Sub35) this.aClass3_Sub9_Sub4_1.aClass193_38.method4460()) {
				if (arg0 == local25.anInt6582 && local25.anInt6576 < 0) {
					this.aClass3_Sub35ArrayArray2[arg0][local25.anInt6585] = null;
					this.aClass3_Sub35ArrayArray2[arg0][arg1] = local25;
					@Pc(63) int local63 = (local25.anInt6591 * local25.anInt6590 >> 12) + local25.anInt6587;
					local25.anInt6587 += arg1 - local25.anInt6585 << 8;
					local25.anInt6591 = local63 - local25.anInt6587;
					local25.anInt6585 = arg1;
					local25.anInt6590 = 4096;
					return;
				}
			}
		}
		@Pc(109) Class3_Sub38 local109 = (Class3_Sub38) this.aClass62_35.method1682((long) this.anIntArray488[arg0]);
		if (local109 == null) {
			return;
		}
		@Pc(117) Class3_Sub12_Sub1 local117 = local109.aClass3_Sub12_Sub1Array1[arg1];
		if (local117 == null) {
			return;
		}
		@Pc(124) Class3_Sub35 local124 = new Class3_Sub35();
		local124.aClass3_Sub38_1 = local109;
		local124.aClass3_Sub12_Sub1_3 = local117;
		local124.anInt6582 = arg0;
		local124.aClass296_1 = local109.aClass296Array1[arg1];
		local124.anInt6589 = local109.aByteArray65[arg1];
		local124.anInt6585 = arg1;
		local124.anInt6578 = arg2 * arg2 * local109.anInt6871 * local109.aByteArray63[arg1] + 1024 >> 11;
		local124.anInt6577 = local109.aByteArray64[arg1] & 0xFF;
		local124.anInt6587 = (arg1 << 8) - (local109.aShortArray136[arg1] & 0x7FFF);
		local124.anInt6576 = -1;
		local124.anInt6583 = 0;
		local124.anInt6586 = 0;
		local124.anInt6584 = 0;
		local124.anInt6581 = 0;
		if (this.anIntArray495[arg0] == 0) {
			local124.aClass3_Sub9_Sub2_3 = Static684.method3727(local117, this.method6719(local124), this.method6729(local124), this.method6726(local124));
		} else {
			local124.aClass3_Sub9_Sub2_3 = Static684.method3727(local117, this.method6719(local124), 0, this.method6726(local124));
			this.method6736(local109.aShortArray136[arg1] < 0, local124);
		}
		if (local109.aShortArray136[arg1] < 0) {
			local124.aClass3_Sub9_Sub2_3.method3730(-1);
		}
		if (local124.anInt6589 >= 0) {
			@Pc(277) Class3_Sub35 local277 = this.aClass3_Sub35ArrayArray1[arg0][local124.anInt6589];
			if (local277 != null && local277.anInt6576 < 0) {
				this.aClass3_Sub35ArrayArray2[arg0][local277.anInt6585] = null;
				local277.anInt6576 = 0;
			}
			this.aClass3_Sub35ArrayArray1[arg0][local124.anInt6589] = local124;
		}
		this.aClass3_Sub9_Sub4_1.aClass193_38.method4462(local124);
		this.aClass3_Sub35ArrayArray2[arg0][arg1] = local124;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "()Lclient!ri;")
	@Override
	public synchronized Class3_Sub9 method6696() {
		return null;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILclient!sh;Lclient!ea;ILclient!gj;)Z")
	public synchronized boolean method6724(@OriginalArg(1) Class3_Sub48 arg0, @OriginalArg(2) Class91 arg1, @OriginalArg(4) Class143 arg2) {
		arg0.method7519();
		@Pc(9) boolean local9 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(29) Class3_Sub39 local29 = (Class3_Sub39) arg0.aClass62_47.method1680(); local29 != null; local29 = (Class3_Sub39) arg0.aClass62_47.method1681()) {
			@Pc(35) int local35 = (int) local29.aLong309;
			@Pc(43) Class3_Sub38 local43 = (Class3_Sub38) this.aClass62_35.method1682((long) local35);
			if (local43 == null) {
				local43 = Static72.method1603(local35, arg2);
				if (local43 == null) {
					local9 = false;
					continue;
				}
				this.aClass62_35.method1686((long) local35, local43);
			}
			if (!local43.method5746(arg1, local29.aByteArray72, local23)) {
				local9 = false;
			}
		}
		if (local9) {
			arg0.method7520();
		}
		return local9;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIZ)V")
	private void method6725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray496[arg1] = arg0;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(BLclient!mja;)I")
	private int method6726(@OriginalArg(1) Class3_Sub35 arg0) {
		@Pc(15) int local15 = this.anIntArray487[arg0.anInt6582];
		return local15 < 8192 ? arg0.anInt6577 * local15 + 32 >> 6 : 16384 - ((128 - arg0.anInt6577) * (-local15 + 16384) + 32 >> 6);
	}

	@OriginalMember(owner = "client!pt", name = "d", descriptor = "(III)V")
	private void method6728(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray498[arg0] = arg1;
		this.anIntArray493[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(Lclient!mja;B)I")
	private int method6729(@OriginalArg(0) Class3_Sub35 arg0) {
		if (this.anIntArray499[arg0.anInt6582] == 0) {
			return 0;
		}
		@Pc(17) Class296 local17 = arg0.aClass296_1;
		@Pc(33) int local33 = this.anIntArray497[arg0.anInt6582] * this.anIntArray484[arg0.anInt6582] + 4096 >> 13;
		@Pc(47) int local47 = local33 * local33 + 16384 >> 15;
		@Pc(56) int local56 = local47 * arg0.anInt6578 + 16384 >> 15;
		@Pc(65) int local65 = this.anInt7993 * local56 + 128 >> 8;
		local33 = this.anIntArray499[arg0.anInt6582] * local65 + 128 >> 8;
		if (local17.anInt8334 > 0) {
			local33 = (int) (Math.pow(0.5D, (double) arg0.anInt6584 * 1.953125E-5D * (double) local17.anInt8334) * (double) local33 + 0.5D);
		}
		@Pc(107) int local107;
		@Pc(115) int local115;
		@Pc(133) int local133;
		@Pc(145) int local145;
		if (local17.aByteArray79 != null) {
			local107 = arg0.anInt6583;
			local115 = local17.aByteArray79[arg0.anInt6586 + 1];
			if (arg0.anInt6586 < local17.aByteArray79.length - 2) {
				local133 = (local17.aByteArray79[arg0.anInt6586] & 0xFF) << 8;
				local145 = (local17.aByteArray79[arg0.anInt6586 + 2] & 0xFF) << 8;
				local115 += (local17.aByteArray79[arg0.anInt6586 + 3] - local115) * (-local133 + local107) / (local145 - local133);
			}
			local33 = local33 * local115 + 32 >> 6;
		}
		if (arg0.anInt6576 > 0 && local17.aByteArray80 != null) {
			local107 = arg0.anInt6576;
			local115 = local17.aByteArray80[arg0.anInt6581 + 1];
			if (local17.aByteArray80.length - 2 > arg0.anInt6581) {
				local133 = (local17.aByteArray80[arg0.anInt6581] & 0xFF) << 8;
				local145 = (local17.aByteArray80[arg0.anInt6581 + 2] & 0xFF) << 8;
				local115 += (local17.aByteArray80[arg0.anInt6581 + 3] - local115) * (local107 + -local133) / (local145 - local133);
			}
			local33 = local33 * local115 + 32 >> 6;
		}
		return local33;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ZLclient!sh;ZB)V")
	private synchronized void method6730(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class3_Sub48 arg1, @OriginalArg(2) boolean arg2) {
		this.method6734(arg0);
		this.aClass76_1.method1971(arg1.aByteArray96);
		this.aBoolean605 = arg2;
		this.aLong229 = 0L;
		@Pc(26) int local26 = this.aClass76_1.method1978();
		for (@Pc(34) int local34 = 0; local34 < local26; local34++) {
			this.aClass76_1.method1970(local34);
			this.aClass76_1.method1984(local34);
			this.aClass76_1.method1977(local34);
		}
		this.anInt8028 = this.aClass76_1.method1980();
		this.anInt8027 = this.aClass76_1.anIntArray143[this.anInt8028];
		this.aLong230 = this.aClass76_1.method1975(this.anInt8027);
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ZJ)V")
	private void method6731(@OriginalArg(1) long arg0) {
		while (arg0 >= this.aLong230) {
			@Pc(10) int local10 = this.anInt8028;
			@Pc(13) int local13 = this.anInt8027;
			@Pc(16) long local16 = this.aLong230;
			while (local13 == this.anInt8027) {
				while (this.aClass76_1.anIntArray143[local10] == local13) {
					this.aClass76_1.method1970(local10);
					@Pc(27) int local27 = this.aClass76_1.method1972(local10);
					if (local27 == 1) {
						this.aClass76_1.method1974();
						this.aClass76_1.method1977(local10);
						if (this.aClass76_1.method1981()) {
							if (!this.aBoolean605 || local13 == 0) {
								this.method6740(true);
								this.aClass76_1.method1979();
								return;
							}
							this.aClass76_1.method1983(local16);
						}
						break;
					}
					if ((local27 & 0x80) != 0 && (local27 & 0xF0) != 144) {
						this.method6737(local27);
					}
					this.aClass76_1.method1984(local10);
					this.aClass76_1.method1977(local10);
				}
				this.aLong229 = local16;
				local10 = this.aClass76_1.method1980();
				local13 = this.aClass76_1.anIntArray143[local10];
				local16 = this.aClass76_1.method1975(local13);
			}
			this.anInt8028 = local10;
			this.aLong230 = local16;
			this.anInt8027 = local13;
		}
	}

	@OriginalMember(owner = "client!pt", name = "h", descriptor = "(I)V")
	public synchronized void method6732() {
		this.method6734(true);
	}

	@OriginalMember(owner = "client!pt", name = "d", descriptor = "()Lclient!ri;")
	@Override
	public synchronized Class3_Sub9 method6700() {
		return this.aClass3_Sub9_Sub4_1;
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(Z)V")
	public synchronized void method6733() {
		for (@Pc(11) Class3_Sub38 local11 = (Class3_Sub38) this.aClass62_35.method1680(); local11 != null; local11 = (Class3_Sub38) this.aClass62_35.method1681()) {
			local11.method5745();
		}
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(IZ)V")
	private synchronized void method6734(@OriginalArg(1) boolean arg0) {
		this.aClass76_1.method1979();
		this.aClass3_Sub48_2 = null;
		this.method6740(arg0);
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)I")
	public int method6735() {
		return this.anInt7993;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IZLclient!mja;)V")
	public void method6736(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class3_Sub35 arg1) {
		@Pc(12) int local12 = arg1.aClass3_Sub12_Sub1_3.aByteArray94.length;
		@Pc(40) int local40;
		if (arg0 && arg1.aClass3_Sub12_Sub1_3.aBoolean641) {
			@Pc(27) int local27 = local12 + local12 - arg1.aClass3_Sub12_Sub1_3.anInt8566;
			local40 = (int) ((long) local27 * (long) this.anIntArray495[arg1.anInt6582] >> 6);
			local12 <<= 0x8;
			if (local40 >= local12) {
				local40 = local12 + local12 - local40 - 1;
				arg1.aClass3_Sub9_Sub2_3.method3750();
			}
		} else {
			local40 = (int) ((long) this.anIntArray495[arg1.anInt6582] * (long) local12 >> 6);
		}
		arg1.aClass3_Sub9_Sub2_3.method3749(local40);
	}

	@OriginalMember(owner = "client!pt", name = "d", descriptor = "(II)V")
	private void method6737(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method6708(local30, local18, local24);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 > 0) {
				this.method6723(local18, local24, local30);
			} else {
				this.method6708(64, local18, local24);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method6741(local30, local24, local18);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray486[local18] = (this.anIntArray486[local18] & 0xFFE03FFF) + (local30 << 14);
			}
			if (local24 == 32) {
				this.anIntArray486[local18] = (local30 << 7) + (this.anIntArray486[local18] & 0xFFFFC07F);
			}
			if (local24 == 1) {
				this.anIntArray490[local18] = (local30 << 7) + (this.anIntArray490[local18] & 0xFFFFC07F);
			}
			if (local24 == 33) {
				this.anIntArray490[local18] = (this.anIntArray490[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 5) {
				this.anIntArray485[local18] = (this.anIntArray485[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 37) {
				this.anIntArray485[local18] = (this.anIntArray485[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 7) {
				this.anIntArray497[local18] = (local30 << 7) + (this.anIntArray497[local18] & 0xFFFFC07F);
			}
			if (local24 == 39) {
				this.anIntArray497[local18] = (this.anIntArray497[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 10) {
				this.anIntArray487[local18] = (local30 << 7) + (this.anIntArray487[local18] & 0xFFFFC07F);
			}
			if (local24 == 42) {
				this.anIntArray487[local18] = (this.anIntArray487[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 11) {
				this.anIntArray484[local18] = (this.anIntArray484[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 43) {
				this.anIntArray484[local18] = (this.anIntArray484[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 64) {
				if (local30 < 64) {
					this.anIntArray491[local18] &= 0xFFFFFFFE;
				} else {
					this.anIntArray491[local18] |= 0x1;
				}
			}
			if (local24 == 65) {
				if (local30 < 64) {
					this.method6722(local18);
					this.anIntArray491[local18] &= 0xFFFFFFFD;
				} else {
					this.anIntArray491[local18] |= 0x2;
				}
			}
			if (local24 == 99) {
				this.anIntArray494[local18] = (local30 << 7) + (this.anIntArray494[local18] & 0x7F);
			}
			if (local24 == 98) {
				this.anIntArray494[local18] = (this.anIntArray494[local18] & 0x3F80) + local30;
			}
			if (local24 == 101) {
				this.anIntArray494[local18] = (this.anIntArray494[local18] & 0x7F) + (local30 << 7) + 16384;
			}
			if (local24 == 100) {
				this.anIntArray494[local18] = local30 + (this.anIntArray494[local18] & 0x3F80) + 16384;
			}
			if (local24 == 120) {
				this.method6717(local18);
			}
			if (local24 == 121) {
				this.method6712(local18);
			}
			if (local24 == 123) {
				this.method6710(local18);
			}
			@Pc(501) int local501;
			if (local24 == 6) {
				local501 = this.anIntArray494[local18];
				if (local501 == 16384) {
					this.anIntArray492[local18] = (this.anIntArray492[local18] & 0xFFFFC07F) + (local30 << 7);
				}
			}
			if (local24 == 38) {
				local501 = this.anIntArray494[local18];
				if (local501 == 16384) {
					this.anIntArray492[local18] = local30 + (this.anIntArray492[local18] & 0xFFFFFF80);
				}
			}
			if (local24 == 16) {
				this.anIntArray495[local18] = (local30 << 7) + (this.anIntArray495[local18] & 0xFFFFC07F);
			}
			if (local24 == 48) {
				this.anIntArray495[local18] = (this.anIntArray495[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 81) {
				if (local30 < 64) {
					this.method6714(local18);
					this.anIntArray491[local18] &= 0xFFFFFFFB;
				} else {
					this.anIntArray491[local18] |= 0x4;
				}
			}
			if (local24 == 17) {
				this.method6728(local18, (local30 << 7) + (this.anIntArray498[local18] & 0xFFFFC07F));
			}
			if (local24 == 49) {
				this.method6728(local18, (this.anIntArray498[local18] & 0xFFFFFF80) + local30);
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method6721(local18, this.anIntArray486[local18] + local24);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method6738(local24, local18);
		} else if (local9 == 224) {
			local24 = arg0 & 0xF;
			local30 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			this.method6725(local30, local24);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method6740(true);
			}
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6701(@OriginalArg(0) int arg0) {
		if (this.aClass76_1.method1976()) {
			@Pc(14) int local14 = this.anInt8025 * this.aClass76_1.anInt2129 / Static656.anInt1392;
			do {
				@Pc(24) long local24 = this.aLong229 + (long) arg0 * (long) local14;
				if (this.aLong230 - local24 >= 0L) {
					this.aLong229 = local24;
					break;
				}
				@Pc(54) int local54 = (int) (((long) local14 + this.aLong230 - this.aLong229 - 1L) / (long) local14);
				this.aLong229 += (long) local14 * (long) local54;
				this.aClass3_Sub9_Sub4_1.method6701(local54);
				arg0 -= local54;
				this.method6718();
			} while (this.aClass76_1.method1976());
		}
		this.aClass3_Sub9_Sub4_1.method6701(arg0);
	}

	@OriginalMember(owner = "client!pt", name = "e", descriptor = "(III)V")
	private void method6738(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IJLclient!sh;ZZ)V")
	public synchronized void method6739(@OriginalArg(1) long arg0, @OriginalArg(2) Class3_Sub48 arg1, @OriginalArg(3) boolean arg2) {
		this.method6730(true, arg1, arg2);
		this.method6731((long) this.aClass76_1.anInt2129 * arg0);
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(ZI)V")
	private void method6740(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method6717(-1);
		} else {
			this.method6710(-1);
		}
		this.method6712(-1);
		for (@Pc(27) int local27 = 0; local27 < 16; local27++) {
			this.anIntArray488[local27] = this.anIntArray489[local27];
		}
		for (@Pc(43) int local43 = 0; local43 < 16; local43++) {
			this.anIntArray486[local43] = this.anIntArray489[local43] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIIB)V")
	private void method6741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}
}
