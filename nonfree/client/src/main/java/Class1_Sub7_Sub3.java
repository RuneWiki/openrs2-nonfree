import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class1_Sub7_Sub3 extends Class1_Sub7 {

	@OriginalMember(owner = "client!sf", name = "Hb", descriptor = "Z")
	private boolean aBoolean401;

	@OriginalMember(owner = "client!sf", name = "Jb", descriptor = "J")
	private long aLong186;

	@OriginalMember(owner = "client!sf", name = "Kb", descriptor = "I")
	private int anInt6200;

	@OriginalMember(owner = "client!sf", name = "Lb", descriptor = "I")
	private int anInt6201;

	@OriginalMember(owner = "client!sf", name = "Mb", descriptor = "J")
	private long aLong187;

	@OriginalMember(owner = "client!sf", name = "Nb", descriptor = "Lclient!tv;")
	private Class1_Sub41 aClass1_Sub41_2;

	@OriginalMember(owner = "client!sf", name = "Ob", descriptor = "I")
	private int anInt6202;

	@OriginalMember(owner = "client!sf", name = "Pb", descriptor = "Z")
	private boolean aBoolean402;

	@OriginalMember(owner = "client!sf", name = "r", descriptor = "[I")
	private final int[] anIntArray495 = new int[16];

	@OriginalMember(owner = "client!sf", name = "I", descriptor = "[I")
	public final int[] anIntArray499 = new int[16];

	@OriginalMember(owner = "client!sf", name = "u", descriptor = "[[Lclient!rr;")
	private final Class1_Sub39[][] aClass1_Sub39ArrayArray1 = new Class1_Sub39[16][128];

	@OriginalMember(owner = "client!sf", name = "D", descriptor = "[I")
	private final int[] anIntArray497 = new int[16];

	@OriginalMember(owner = "client!sf", name = "K", descriptor = "[I")
	private final int[] anIntArray500 = new int[16];

	@OriginalMember(owner = "client!sf", name = "G", descriptor = "I")
	private int anInt6163 = 256;

	@OriginalMember(owner = "client!sf", name = "P", descriptor = "[I")
	private final int[] anIntArray502 = new int[16];

	@OriginalMember(owner = "client!sf", name = "F", descriptor = "[I")
	private final int[] anIntArray498 = new int[16];

	@OriginalMember(owner = "client!sf", name = "db", descriptor = "[I")
	public final int[] anIntArray506 = new int[16];

	@OriginalMember(owner = "client!sf", name = "t", descriptor = "[I")
	public final int[] anIntArray496 = new int[16];

	@OriginalMember(owner = "client!sf", name = "W", descriptor = "[I")
	private final int[] anIntArray504 = new int[16];

	@OriginalMember(owner = "client!sf", name = "sb", descriptor = "[I")
	private final int[] anIntArray509 = new int[16];

	@OriginalMember(owner = "client!sf", name = "kb", descriptor = "[I")
	private final int[] anIntArray507 = new int[16];

	@OriginalMember(owner = "client!sf", name = "xb", descriptor = "[I")
	private final int[] anIntArray510 = new int[16];

	@OriginalMember(owner = "client!sf", name = "ab", descriptor = "[I")
	private final int[] anIntArray505 = new int[16];

	@OriginalMember(owner = "client!sf", name = "hb", descriptor = "[[Lclient!rr;")
	private final Class1_Sub39[][] aClass1_Sub39ArrayArray2 = new Class1_Sub39[16][128];

	@OriginalMember(owner = "client!sf", name = "O", descriptor = "[I")
	private final int[] anIntArray501 = new int[16];

	@OriginalMember(owner = "client!sf", name = "T", descriptor = "[I")
	private final int[] anIntArray503 = new int[16];

	@OriginalMember(owner = "client!sf", name = "rb", descriptor = "I")
	private final int anInt6186 = 1000000;

	@OriginalMember(owner = "client!sf", name = "nb", descriptor = "[I")
	private final int[] anIntArray508 = new int[16];

	@OriginalMember(owner = "client!sf", name = "N", descriptor = "Lclient!bl;")
	private final Class29 aClass29_1 = new Class29();

	@OriginalMember(owner = "client!sf", name = "Ib", descriptor = "Lclient!pf;")
	private final Class1_Sub7_Sub2 aClass1_Sub7_Sub2_1 = new Class1_Sub7_Sub2(this);

	@OriginalMember(owner = "client!sf", name = "eb", descriptor = "Lclient!bj;")
	private final Class27 aClass27_33 = new Class27(128);

	static {
		new Class84("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
	}

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
	public Class1_Sub7_Sub3() {
		this.method4999();
		this.method4990(true);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILclient!rr;[II)Z")
	public boolean method4979(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub39 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		arg1.anInt6043 = Static78.anInt1548 / 100;
		if (arg1.anInt6036 >= 0 && (arg1.aClass1_Sub7_Sub4_4 == null || arg1.aClass1_Sub7_Sub4_4.method5967())) {
			arg1.method4884();
			arg1.method6071();
			if (arg1.anInt6047 > 0 && this.aClass1_Sub39ArrayArray2[arg1.anInt6032][arg1.anInt6047] == arg1) {
				this.aClass1_Sub39ArrayArray2[arg1.anInt6032][arg1.anInt6047] = null;
			}
			return true;
		}
		@Pc(57) int local57 = arg1.anInt6045;
		if (local57 > 0) {
			local57 -= (int) (Math.pow(2.0D, (double) this.anIntArray505[arg1.anInt6032] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local57 < 0) {
				local57 = 0;
			}
			arg1.anInt6045 = local57;
		}
		arg1.aClass1_Sub7_Sub4_4.method5937(this.method5006(arg1));
		@Pc(97) Class68 local97 = arg1.aClass68_1;
		arg1.anInt6037++;
		@Pc(105) boolean local105 = false;
		arg1.anInt6031 += local97.anInt1727;
		@Pc(130) double local130 = (double) ((arg1.anInt6045 * arg1.anInt6038 >> 12) + (arg1.anInt6042 - 60 << 8)) * 5.086263020833333E-6D;
		if (local97.anInt1732 > 0) {
			if (local97.anInt1734 <= 0) {
				arg1.anInt6050 += 128;
			} else {
				arg1.anInt6050 += (int) (Math.pow(2.0D, (double) local97.anInt1734 * local130) * 128.0D + 0.5D);
			}
			if (arg1.anInt6050 * local97.anInt1732 >= 819200) {
				local105 = true;
			}
		}
		if (local97.aByteArray26 != null) {
			if (local97.anInt1729 <= 0) {
				arg1.anInt6046 += 128;
			} else {
				arg1.anInt6046 += (int) (Math.pow(2.0D, local130 * (double) local97.anInt1729) * 128.0D + 0.5D);
			}
			while (arg1.anInt6044 < local97.aByteArray26.length - 2 && (local97.aByteArray26[arg1.anInt6044 + 2] & 0xFF) << 8 < arg1.anInt6046) {
				arg1.anInt6044 += 2;
			}
			if (local97.aByteArray26.length - 2 == arg1.anInt6044 && local97.aByteArray26[arg1.anInt6044 + 1] == 0) {
				local105 = true;
			}
		}
		if (arg1.anInt6036 >= 0 && local97.aByteArray27 != null && (this.anIntArray499[arg1.anInt6032] & 0x1) == 0 && (arg1.anInt6047 < 0 || arg1 != this.aClass1_Sub39ArrayArray2[arg1.anInt6032][arg1.anInt6047])) {
			if (local97.anInt1735 > 0) {
				arg1.anInt6036 += (int) (Math.pow(2.0D, (double) local97.anInt1735 * local130) * 128.0D + 0.5D);
			} else {
				arg1.anInt6036 += 128;
			}
			while (arg1.anInt6035 < local97.aByteArray27.length - 2 && (local97.aByteArray27[arg1.anInt6035 + 2] & 0xFF) << 8 < arg1.anInt6036) {
				arg1.anInt6035 += 2;
			}
			if (arg1.anInt6035 == local97.aByteArray27.length - 2) {
				local105 = true;
			}
		}
		if (!local105) {
			arg1.aClass1_Sub7_Sub4_4.method5968(arg1.anInt6043, this.method5014(arg1), this.method4993(arg1));
			return false;
		}
		arg1.aClass1_Sub7_Sub4_4.method5938(arg1.anInt6043);
		if (arg2 == null) {
			arg1.aClass1_Sub7_Sub4_4.method5927(arg3);
		} else {
			arg1.aClass1_Sub7_Sub4_4.method5928(arg2, arg0, arg3);
		}
		if (arg1.aClass1_Sub7_Sub4_4.method5944()) {
			this.aClass1_Sub7_Sub2_1.aClass1_Sub7_Sub1_2.method3976(arg1.aClass1_Sub7_Sub4_4);
		}
		arg1.method4884();
		if (arg1.anInt6036 >= 0) {
			arg1.method6071();
			if (arg1.anInt6047 > 0 && this.aClass1_Sub39ArrayArray2[arg1.anInt6032][arg1.anInt6047] == arg1) {
				this.aClass1_Sub39ArrayArray2[arg1.anInt6032][arg1.anInt6047] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIB)V")
	private void method4980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method4986(arg2, arg1, 64);
		if ((this.anIntArray499[arg1] & 0x2) != 0) {
			for (@Pc(27) Class1_Sub39 local27 = (Class1_Sub39) this.aClass1_Sub7_Sub2_1.aClass266_41.method6005(); local27 != null; local27 = (Class1_Sub39) this.aClass1_Sub7_Sub2_1.aClass266_41.method6003()) {
				if (local27.anInt6032 == arg1 && local27.anInt6036 < 0) {
					this.aClass1_Sub39ArrayArray1[arg1][local27.anInt6042] = null;
					this.aClass1_Sub39ArrayArray1[arg1][arg2] = local27;
					@Pc(62) int local62 = (local27.anInt6045 * local27.anInt6038 >> 12) + local27.anInt6041;
					local27.anInt6041 += arg2 - local27.anInt6042 << 8;
					local27.anInt6038 = local62 - local27.anInt6041;
					local27.anInt6042 = arg2;
					local27.anInt6045 = 4096;
					return;
				}
			}
		}
		@Pc(108) Class1_Sub17 local108 = (Class1_Sub17) this.aClass27_33.method553((long) this.anIntArray500[arg1]);
		if (local108 == null) {
			return;
		}
		@Pc(116) Class1_Sub32_Sub1 local116 = local108.aClass1_Sub32_Sub1Array1[arg2];
		if (local116 == null) {
			return;
		}
		@Pc(123) Class1_Sub39 local123 = new Class1_Sub39();
		local123.aClass1_Sub32_Sub1_2 = local116;
		local123.anInt6032 = arg1;
		local123.aClass1_Sub17_1 = local108;
		local123.aClass68_1 = local108.aClass68Array1[arg2];
		local123.anInt6047 = local108.aByteArray49[arg2];
		local123.anInt6042 = arg2;
		local123.anInt6030 = local108.anInt3114 * arg0 * arg0 * local108.aByteArray47[arg2] + 1024 >> 11;
		local123.anInt6033 = local108.aByteArray48[arg2] & 0xFF;
		local123.anInt6041 = (arg2 << 8) - (local108.aShortArray50[arg2] & 0x7FFF);
		local123.anInt6046 = 0;
		local123.anInt6044 = 0;
		local123.anInt6036 = -1;
		local123.anInt6050 = 0;
		local123.anInt6035 = 0;
		if (this.anIntArray496[arg1] == 0) {
			local123.aClass1_Sub7_Sub4_4 = Static463.method5961(local116, this.method5006(local123), this.method5014(local123), this.method4993(local123));
		} else {
			local123.aClass1_Sub7_Sub4_4 = Static463.method5961(local116, this.method5006(local123), 0, this.method4993(local123));
			this.method5002(local108.aShortArray50[arg2] < 0, local123);
		}
		if (local108.aShortArray50[arg2] < 0) {
			local123.aClass1_Sub7_Sub4_4.method5933(-1);
		}
		if (local123.anInt6047 >= 0) {
			@Pc(282) Class1_Sub39 local282 = this.aClass1_Sub39ArrayArray2[arg1][local123.anInt6047];
			if (local282 != null && local282.anInt6036 < 0) {
				this.aClass1_Sub39ArrayArray1[arg1][local282.anInt6042] = null;
				local282.anInt6036 = 0;
			}
			this.aClass1_Sub39ArrayArray2[arg1][local123.anInt6047] = local123;
		}
		this.aClass1_Sub7_Sub2_1.aClass266_41.method5998(local123);
		this.aClass1_Sub39ArrayArray1[arg1][arg2] = local123;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)V")
	private void method4981(@OriginalArg(0) int arg0) {
		if ((this.anIntArray499[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(18) Class1_Sub39 local18 = (Class1_Sub39) this.aClass1_Sub7_Sub2_1.aClass266_41.method6000(); local18 != null; local18 = (Class1_Sub39) this.aClass1_Sub7_Sub2_1.aClass266_41.method5994()) {
			if (local18.anInt6032 == arg0) {
				local18.anInt6040 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)Z")
	public synchronized boolean method4982() {
		return this.aClass29_1.method581();
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)V")
	private void method4983(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(20) int local20 = 0; local20 < 16; local20++) {
				this.method4983(local20);
			}
			return;
		}
		this.anIntArray507[arg0] = 12800;
		this.anIntArray497[arg0] = 8192;
		this.anIntArray508[arg0] = 16383;
		this.anIntArray495[arg0] = 8192;
		this.anIntArray498[arg0] = 0;
		this.anIntArray505[arg0] = 8192;
		this.method5005(arg0);
		this.method4981(arg0);
		this.anIntArray499[arg0] = 0;
		this.anIntArray501[arg0] = 32767;
		this.anIntArray510[arg0] = 256;
		this.anIntArray496[arg0] = 0;
		this.method5013(8192, arg0);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BZ)V")
	private synchronized void method4984(@OriginalArg(1) boolean arg0) {
		this.aClass29_1.method582();
		this.aClass1_Sub41_2 = null;
		this.method4990(arg0);
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(II)V")
	private void method4985(@OriginalArg(0) int arg0) {
		for (@Pc(16) Class1_Sub39 local16 = (Class1_Sub39) this.aClass1_Sub7_Sub2_1.aClass266_41.method6000(); local16 != null; local16 = (Class1_Sub39) this.aClass1_Sub7_Sub2_1.aClass266_41.method5994()) {
			if ((arg0 < 0 || arg0 == local16.anInt6032) && local16.anInt6036 < 0) {
				this.aClass1_Sub39ArrayArray1[local16.anInt6032][local16.anInt6042] = null;
				local16.anInt6036 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIII)V")
	private void method4986(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class1_Sub39 local12 = this.aClass1_Sub39ArrayArray1[arg1][arg0];
		if (local12 == null) {
			return;
		}
		this.aClass1_Sub39ArrayArray1[arg1][arg0] = null;
		if ((this.anIntArray499[arg1] & 0x2) == 0) {
			local12.anInt6036 = 0;
			return;
		}
		for (@Pc(43) Class1_Sub39 local43 = (Class1_Sub39) this.aClass1_Sub7_Sub2_1.aClass266_41.method6000(); local43 != null; local43 = (Class1_Sub39) this.aClass1_Sub7_Sub2_1.aClass266_41.method5994()) {
			if (local43.anInt6032 == local12.anInt6032 && local43.anInt6036 < 0 && local12 != local43) {
				local12.anInt6036 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "()Lclient!dm;")
	@Override
	public synchronized Class1_Sub7 method5930() {
		return this.aClass1_Sub7_Sub2_1;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BII)V")
	private void method4987(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "()Lclient!dm;")
	@Override
	public synchronized Class1_Sub7 method5932() {
		return null;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZLclient!tv;)V")
	public synchronized void method4988(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class1_Sub41 arg1) {
		this.method5011(true, arg0, arg1);
	}

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)V")
	public synchronized void method4989() {
		for (@Pc(9) Class1_Sub17 local9 = (Class1_Sub17) this.aClass27_33.method555(); local9 != null; local9 = (Class1_Sub17) this.aClass27_33.method563()) {
			local9.method6071();
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method5927(@OriginalArg(0) int arg0) {
		if (this.aClass29_1.method581()) {
			@Pc(18) int local18 = this.aClass29_1.anInt634 * this.anInt6186 / Static78.anInt1548;
			do {
				@Pc(28) long local28 = this.aLong187 + (long) local18 * (long) arg0;
				if (this.aLong186 - local28 >= 0L) {
					this.aLong187 = local28;
					break;
				}
				@Pc(57) int local57 = (int) (((long) local18 + this.aLong186 - this.aLong187 - 1L) / (long) local18);
				this.aLong187 += (long) local57 * (long) local18;
				this.aClass1_Sub7_Sub2_1.method5927(local57);
				arg0 -= local57;
				this.method4992();
			} while (this.aClass29_1.method581());
		}
		this.aClass1_Sub7_Sub2_1.method5927(arg0);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZI)V")
	private void method4990(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method5010(-1);
		} else {
			this.method4985(-1);
		}
		this.method4983(-1);
		for (@Pc(31) int local31 = 0; local31 < 16; local31++) {
			this.anIntArray500[local31] = this.anIntArray502[local31];
		}
		for (@Pc(47) int local47 = 0; local47 < 16; local47++) {
			this.anIntArray503[local47] = this.anIntArray502[local47] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(B)V")
	private void method4992() {
		@Pc(8) int local8 = this.anInt6201;
		@Pc(11) int local11 = this.anInt6200;
		@Pc(14) long local14 = this.aLong186;
		if (this.aClass1_Sub41_2 != null && local11 == this.anInt6202) {
			this.method5011(this.aBoolean402, this.aBoolean401, this.aClass1_Sub41_2);
			this.method4992();
			return;
		}
		while (this.anInt6200 == local11) {
			while (local11 == this.aClass29_1.anIntArray37[local8]) {
				this.aClass29_1.method575(local8);
				@Pc(47) int local47 = this.aClass29_1.method583(local8);
				if (local47 == 1) {
					this.aClass29_1.method577();
					this.aClass29_1.method590(local8);
					if (this.aClass29_1.method580()) {
						if (this.aClass1_Sub41_2 != null) {
							this.method4988(this.aBoolean401, this.aClass1_Sub41_2);
							this.method4992();
							return;
						}
						if (!this.aBoolean401 || local11 == 0) {
							this.method4990(true);
							this.aClass29_1.method582();
							return;
						}
						this.aClass29_1.method579(local14);
					}
					break;
				}
				if ((local47 & 0x80) != 0) {
					this.method5004(local47);
				}
				this.aClass29_1.method578(local8);
				this.aClass29_1.method590(local8);
			}
			local8 = this.aClass29_1.method584();
			local11 = this.aClass29_1.anIntArray37[local8];
			local14 = this.aClass29_1.method586(local11);
		}
		this.anInt6201 = local8;
		this.aLong186 = local14;
		this.anInt6200 = local11;
		if (this.aClass1_Sub41_2 != null && local11 > this.anInt6202) {
			this.anInt6200 = this.anInt6202;
			this.anInt6201 = -1;
			this.aLong186 = this.aClass29_1.method586(this.anInt6200);
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLclient!rr;)I")
	private int method4993(@OriginalArg(1) Class1_Sub39 arg0) {
		@Pc(14) int local14 = this.anIntArray497[arg0.anInt6032];
		return local14 >= 8192 ? 16384 - ((16384 - local14) * (-arg0.anInt6033 + 128) + 32 >> 6) : local14 * arg0.anInt6033 - -32 >> 6;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)V")
	private void method4994() {
		this.anIntArray502[9] = 128;
		this.anIntArray503[9] = 128;
		this.method5001(128, 9);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!rr;B)Z")
	public boolean method4995(@OriginalArg(0) Class1_Sub39 arg0) {
		if (arg0.aClass1_Sub7_Sub4_4 != null) {
			return false;
		}
		if (arg0.anInt6036 >= 0) {
			arg0.method6071();
			if (arg0.anInt6047 > 0 && arg0 == this.aClass1_Sub39ArrayArray2[arg0.anInt6032][arg0.anInt6047]) {
				this.aClass1_Sub39ArrayArray2[arg0.anInt6032][arg0.anInt6047] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(IIII)V")
	private void method4996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IB)V")
	public synchronized void method4997(@OriginalArg(0) int arg0) {
		this.anInt6163 = arg0;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(III)V")
	private synchronized void method4999() {
		for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
			this.anIntArray509[local12] = 256;
		}
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(Z)I")
	public int method5000() {
		return this.anInt6163;
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(III)V")
	private void method5001(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray500[arg1] != arg0) {
			this.anIntArray500[arg1] = arg0;
			for (@Pc(14) int local14 = 0; local14 < 128; local14++) {
				this.aClass1_Sub39ArrayArray2[arg1][local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZLclient!rr;)V")
	public void method5002(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class1_Sub39 arg1) {
		@Pc(16) int local16 = arg1.aClass1_Sub32_Sub1_2.aByteArray62.length;
		@Pc(45) int local45;
		if (arg0 && arg1.aClass1_Sub32_Sub1_2.aBoolean329) {
			@Pc(32) int local32 = local16 + local16 - arg1.aClass1_Sub32_Sub1_2.anInt4941;
			local45 = (int) ((long) this.anIntArray496[arg1.anInt6032] * (long) local32 >> 6);
			local16 <<= 0x8;
			if (local16 <= local45) {
				arg1.aClass1_Sub7_Sub4_4.method5959();
				local45 = local16 + local16 - local45 - 1;
			}
		} else {
			local45 = (int) ((long) local16 * (long) this.anIntArray496[arg1.anInt6032] >> 6);
		}
		arg1.aClass1_Sub7_Sub4_4.method5940(local45);
	}

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "(III)V")
	public synchronized void method5003() {
		this.method4994();
	}

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "(II)V")
	private void method5004(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method4986(local22, local16, local28);
		} else if (local9 == 144) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 <= 0) {
				this.method4986(local22, local16, 64);
			} else {
				this.method4980(local28, local16, local22);
			}
		} else if (local9 == 160) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method4996(local16, local22, local28);
		} else if (local9 == 176) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local22 == 0) {
				this.anIntArray503[local16] = (local28 << 14) + (this.anIntArray503[local16] & 0xFFE03FFF);
			}
			if (local22 == 32) {
				this.anIntArray503[local16] = (this.anIntArray503[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 1) {
				this.anIntArray498[local16] = (local28 << 7) + (this.anIntArray498[local16] & 0xFFFFC07F);
			}
			if (local22 == 33) {
				this.anIntArray498[local16] = local28 + (this.anIntArray498[local16] & 0xFFFFFF80);
			}
			if (local22 == 5) {
				this.anIntArray505[local16] = (local28 << 7) + (this.anIntArray505[local16] & 0xFFFFC07F);
			}
			if (local22 == 37) {
				this.anIntArray505[local16] = local28 + (this.anIntArray505[local16] & 0xFFFFFF80);
			}
			if (local22 == 7) {
				this.anIntArray507[local16] = (this.anIntArray507[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 39) {
				this.anIntArray507[local16] = local28 + (this.anIntArray507[local16] & 0xFFFFFF80);
			}
			if (local22 == 10) {
				this.anIntArray497[local16] = (local28 << 7) + (this.anIntArray497[local16] & 0xFFFFC07F);
			}
			if (local22 == 42) {
				this.anIntArray497[local16] = local28 + (this.anIntArray497[local16] & 0xFFFFFF80);
			}
			if (local22 == 11) {
				this.anIntArray508[local16] = (local28 << 7) + (this.anIntArray508[local16] & 0xFFFFC07F);
			}
			if (local22 == 43) {
				this.anIntArray508[local16] = local28 + (this.anIntArray508[local16] & 0xFFFFFF80);
			}
			if (local22 == 64) {
				if (local28 < 64) {
					this.anIntArray499[local16] &= 0xFFFFFFFE;
				} else {
					this.anIntArray499[local16] |= 0x1;
				}
			}
			if (local22 == 65) {
				if (local28 < 64) {
					this.method5005(local16);
					this.anIntArray499[local16] &= 0xFFFFFFFD;
				} else {
					this.anIntArray499[local16] |= 0x2;
				}
			}
			if (local22 == 99) {
				this.anIntArray501[local16] = (this.anIntArray501[local16] & 0x7F) + (local28 << 7);
			}
			if (local22 == 98) {
				this.anIntArray501[local16] = (this.anIntArray501[local16] & 0x3F80) + local28;
			}
			if (local22 == 101) {
				this.anIntArray501[local16] = (local28 << 7) + (this.anIntArray501[local16] & 0x7F) + 16384;
			}
			if (local22 == 100) {
				this.anIntArray501[local16] = (this.anIntArray501[local16] & 0x3F80) + local28 + 16384;
			}
			if (local22 == 120) {
				this.method5010(local16);
			}
			if (local22 == 121) {
				this.method4983(local16);
			}
			if (local22 == 123) {
				this.method4985(local16);
			}
			@Pc(495) int local495;
			if (local22 == 6) {
				local495 = this.anIntArray501[local16];
				if (local495 == 16384) {
					this.anIntArray510[local16] = (local28 << 7) + (this.anIntArray510[local16] & 0xFFFFC07F);
				}
			}
			if (local22 == 38) {
				local495 = this.anIntArray501[local16];
				if (local495 == 16384) {
					this.anIntArray510[local16] = (this.anIntArray510[local16] & 0xFFFFFF80) + local28;
				}
			}
			if (local22 == 16) {
				this.anIntArray496[local16] = (local28 << 7) + (this.anIntArray496[local16] & 0xFFFFC07F);
			}
			if (local22 == 48) {
				this.anIntArray496[local16] = local28 + (this.anIntArray496[local16] & 0xFFFFFF80);
			}
			if (local22 == 81) {
				if (local28 < 64) {
					this.method4981(local16);
					this.anIntArray499[local16] &= 0xFFFFFFFB;
				} else {
					this.anIntArray499[local16] |= 0x4;
				}
			}
			if (local22 == 17) {
				this.method5013((local28 << 7) + (this.anIntArray504[local16] & 0xFFFFC07F), local16);
			}
			if (local22 == 49) {
				this.method5013((this.anIntArray504[local16] & 0xFFFFFF80) + local28, local16);
			}
		} else if (local9 == 192) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method5001(local22 + this.anIntArray503[local16], local16);
		} else if (local9 == 208) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method4987(local22, local16);
		} else if (local9 == 224) {
			local16 = arg0 & 0xF;
			local22 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7F5E) >> 8);
			this.method5012(local16, local22);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method4990(true);
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(IB)V")
	private void method5005(@OriginalArg(0) int arg0) {
		if ((this.anIntArray499[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(18) Class1_Sub39 local18 = (Class1_Sub39) this.aClass1_Sub7_Sub2_1.aClass266_41.method6000(); local18 != null; local18 = (Class1_Sub39) this.aClass1_Sub7_Sub2_1.aClass266_41.method5994()) {
			if (local18.anInt6032 == arg0 && this.aClass1_Sub39ArrayArray1[arg0][local18.anInt6042] == null && local18.anInt6036 < 0) {
				local18.anInt6036 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILclient!rr;)I")
	private int method5006(@OriginalArg(1) Class1_Sub39 arg0) {
		@Pc(21) int local21 = arg0.anInt6041 + (arg0.anInt6038 * arg0.anInt6045 >> 12);
		local21 += (this.anIntArray495[arg0.anInt6032] - 8192) * this.anIntArray510[arg0.anInt6032] >> 12;
		@Pc(42) Class68 local42 = arg0.aClass68_1;
		@Pc(62) int local62;
		if (local42.anInt1727 > 0 && (local42.anInt1730 > 0 || this.anIntArray498[arg0.anInt6032] > 0)) {
			local62 = local42.anInt1730 << 2;
			@Pc(67) int local67 = local42.anInt1731 << 1;
			if (local67 > arg0.anInt6037) {
				local62 = local62 * arg0.anInt6037 / local67;
			}
			local62 += this.anIntArray498[arg0.anInt6032] >> 7;
			@Pc(97) double local97 = Math.sin((double) (arg0.anInt6031 & 0x1FF) * 0.01227184630308513D);
			local21 += (int) ((double) local62 * local97);
		}
		local62 = (int) ((double) (arg0.aClass1_Sub32_Sub1_2.anInt4942 * 256) * Math.pow(2.0D, (double) local21 * 3.255208333333333E-4D) / (double) Static78.anInt1548 + 0.5D);
		return local62 >= 1 ? local62 : 1;
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(Z)V")
	public synchronized void method5007() {
		this.method4984(true);
	}

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "(B)V")
	public synchronized void method5008() {
		for (@Pc(15) Class1_Sub17 local15 = (Class1_Sub17) this.aClass27_33.method555(); local15 != null; local15 = (Class1_Sub17) this.aClass27_33.method563()) {
			local15.method2670();
		}
	}

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "(II)V")
	private void method5010(@OriginalArg(0) int arg0) {
		for (@Pc(16) Class1_Sub39 local16 = (Class1_Sub39) this.aClass1_Sub7_Sub2_1.aClass266_41.method6000(); local16 != null; local16 = (Class1_Sub39) this.aClass1_Sub7_Sub2_1.aClass266_41.method5994()) {
			if (arg0 < 0 || arg0 == local16.anInt6032) {
				if (local16.aClass1_Sub7_Sub4_4 != null) {
					local16.aClass1_Sub7_Sub4_4.method5938(Static78.anInt1548 / 100);
					if (local16.aClass1_Sub7_Sub4_4.method5944()) {
						this.aClass1_Sub7_Sub2_1.aClass1_Sub7_Sub1_2.method3976(local16.aClass1_Sub7_Sub4_4);
					}
					local16.method4884();
				}
				if (local16.anInt6036 < 0) {
					this.aClass1_Sub39ArrayArray1[local16.anInt6032][local16.anInt6042] = null;
				}
				local16.method6071();
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZZILclient!tv;)V")
	private synchronized void method5011(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class1_Sub41 arg2) {
		this.method4984(arg0);
		this.aClass29_1.method589(arg2.aByteArray83);
		this.aLong187 = 0L;
		this.aBoolean401 = arg1;
		@Pc(24) int local24 = this.aClass29_1.method588();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass29_1.method575(local26);
			this.aClass29_1.method578(local26);
			this.aClass29_1.method590(local26);
		}
		this.anInt6201 = this.aClass29_1.method584();
		this.anInt6200 = this.aClass29_1.anIntArray37[this.anInt6201];
		this.aLong186 = this.aClass29_1.method586(this.anInt6200);
	}

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "(III)V")
	private void method5012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray495[arg0] = arg1;
	}

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "(III)V")
	private void method5013(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray504[arg1] = arg0;
		this.anIntArray506[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5928(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass29_1.method581()) {
			@Pc(14) int local14 = this.aClass29_1.anInt634 * this.anInt6186 / Static78.anInt1548;
			do {
				@Pc(24) long local24 = this.aLong187 + (long) local14 * (long) arg2;
				if (this.aLong186 - local24 >= 0L) {
					this.aLong187 = local24;
					break;
				}
				@Pc(52) int local52 = (int) ((this.aLong186 + (long) local14 - this.aLong187 - 1L) / (long) local14);
				this.aLong187 += (long) local52 * (long) local14;
				this.aClass1_Sub7_Sub2_1.method5928(arg0, arg1, local52);
				arg2 -= local52;
				arg1 += local52;
				this.method4992();
			} while (this.aClass29_1.method581());
		}
		this.aClass1_Sub7_Sub2_1.method5928(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "()I")
	@Override
	public synchronized int method5926() {
		return 0;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!rr;I)I")
	private int method5014(@OriginalArg(0) Class1_Sub39 arg0) {
		if (this.anIntArray509[arg0.anInt6032] == 0) {
			return 0;
		}
		@Pc(25) Class68 local25 = arg0.aClass68_1;
		@Pc(41) int local41 = this.anIntArray508[arg0.anInt6032] * this.anIntArray507[arg0.anInt6032] + 4096 >> 13;
		@Pc(49) int local49 = local41 * local41 + 16384 >> 15;
		@Pc(58) int local58 = local49 * arg0.anInt6030 + 16384 >> 15;
		@Pc(67) int local67 = local58 * this.anInt6163 + 128 >> 8;
		local41 = this.anIntArray509[arg0.anInt6032] * local67 + 128 >> 8;
		if (local25.anInt1732 > 0) {
			local41 = (int) (Math.pow(0.5D, (double) arg0.anInt6050 * 1.953125E-5D * (double) local25.anInt1732) * (double) local41 + 0.5D);
		}
		@Pc(106) int local106;
		@Pc(114) int local114;
		@Pc(136) int local136;
		@Pc(148) int local148;
		if (local25.aByteArray26 != null) {
			local106 = arg0.anInt6046;
			local114 = local25.aByteArray26[arg0.anInt6044 + 1];
			if (arg0.anInt6044 < local25.aByteArray26.length - 2) {
				local136 = (local25.aByteArray26[arg0.anInt6044] & 0xFF) << 8;
				local148 = (local25.aByteArray26[arg0.anInt6044 + 2] & 0xFF) << 8;
				local114 += (local25.aByteArray26[arg0.anInt6044 + 3] - local114) * (-local136 + local106) / (local148 - local136);
			}
			local41 = local114 * local41 + 32 >> 6;
		}
		if (arg0.anInt6036 > 0 && local25.aByteArray27 != null) {
			local106 = arg0.anInt6036;
			local114 = local25.aByteArray27[arg0.anInt6035 + 1];
			if (local25.aByteArray27.length - 2 > arg0.anInt6035) {
				local136 = (local25.aByteArray27[arg0.anInt6035] & 0xFF) << 8;
				local148 = (local25.aByteArray27[arg0.anInt6035 + 2] & 0xFF) << 8;
				local114 += (local106 - local136) * (-local114 + local25.aByteArray27[arg0.anInt6035 - -3]) / (local148 - local136);
			}
			local41 = local114 * local41 + 32 >> 6;
		}
		return local41;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BILclient!tm;Lclient!tv;Lclient!vh;)Z")
	public synchronized boolean method5015(@OriginalArg(2) Class227 arg0, @OriginalArg(3) Class1_Sub41 arg1, @OriginalArg(4) Class250 arg2) {
		arg1.method5382();
		@Pc(17) boolean local17 = true;
		@Pc(28) int[] local28 = new int[] { 22050 };
		for (@Pc(34) Class1_Sub24 local34 = (Class1_Sub24) arg1.aClass27_38.method555(); local34 != null; local34 = (Class1_Sub24) arg1.aClass27_38.method563()) {
			@Pc(40) int local40 = (int) local34.aLong227;
			@Pc(48) Class1_Sub17 local48 = (Class1_Sub17) this.aClass27_33.method553((long) local40);
			if (local48 == null) {
				local48 = Static64.method1124(local40, arg2);
				if (local48 == null) {
					local17 = false;
					continue;
				}
				this.aClass27_33.method564((long) local40, local48);
			}
			if (!local48.method2669(local28, local34.aByteArray54, arg0)) {
				local17 = false;
			}
		}
		if (local17) {
			arg1.method5383();
		}
		return local17;
	}
}
