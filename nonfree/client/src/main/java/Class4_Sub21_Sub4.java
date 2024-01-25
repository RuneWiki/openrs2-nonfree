import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class4_Sub21_Sub4 extends Class4_Sub21 {

	@OriginalMember(owner = "client!pn", name = "Jb", descriptor = "J")
	private long aLong209;

	@OriginalMember(owner = "client!pn", name = "Kb", descriptor = "I")
	private int anInt7922;

	@OriginalMember(owner = "client!pn", name = "Lb", descriptor = "I")
	private int anInt7923;

	@OriginalMember(owner = "client!pn", name = "Mb", descriptor = "J")
	private long aLong210;

	@OriginalMember(owner = "client!pn", name = "Nb", descriptor = "Z")
	private boolean aBoolean568;

	@OriginalMember(owner = "client!pn", name = "Ob", descriptor = "Z")
	private boolean aBoolean569;

	@OriginalMember(owner = "client!pn", name = "Pb", descriptor = "I")
	private int anInt7924;

	@OriginalMember(owner = "client!pn", name = "Qb", descriptor = "Lclient!bl;")
	private Class4_Sub5 aClass4_Sub5_4;

	@OriginalMember(owner = "client!pn", name = "F", descriptor = "[I")
	private final int[] anIntArray427 = new int[16];

	@OriginalMember(owner = "client!pn", name = "Y", descriptor = "I")
	private int anInt7897 = 256;

	@OriginalMember(owner = "client!pn", name = "A", descriptor = "[I")
	public final int[] anIntArray425 = new int[16];

	@OriginalMember(owner = "client!pn", name = "V", descriptor = "[I")
	public final int[] anIntArray429 = new int[16];

	@OriginalMember(owner = "client!pn", name = "X", descriptor = "[I")
	private final int[] anIntArray431 = new int[16];

	@OriginalMember(owner = "client!pn", name = "Z", descriptor = "[[Lclient!rr;")
	private final Class4_Sub44[][] aClass4_Sub44ArrayArray1 = new Class4_Sub44[16][128];

	@OriginalMember(owner = "client!pn", name = "D", descriptor = "[I")
	private final int[] anIntArray426 = new int[16];

	@OriginalMember(owner = "client!pn", name = "fb", descriptor = "I")
	private final int anInt7903 = 1000000;

	@OriginalMember(owner = "client!pn", name = "nb", descriptor = "[I")
	private final int[] anIntArray433 = new int[16];

	@OriginalMember(owner = "client!pn", name = "ub", descriptor = "[I")
	private final int[] anIntArray435 = new int[16];

	@OriginalMember(owner = "client!pn", name = "x", descriptor = "[I")
	private final int[] anIntArray423 = new int[16];

	@OriginalMember(owner = "client!pn", name = "kb", descriptor = "[I")
	private final int[] anIntArray432 = new int[16];

	@OriginalMember(owner = "client!pn", name = "pb", descriptor = "[I")
	private final int[] anIntArray434 = new int[16];

	@OriginalMember(owner = "client!pn", name = "W", descriptor = "[I")
	private final int[] anIntArray430 = new int[16];

	@OriginalMember(owner = "client!pn", name = "y", descriptor = "[I")
	private final int[] anIntArray424 = new int[16];

	@OriginalMember(owner = "client!pn", name = "wb", descriptor = "[I")
	public final int[] anIntArray436 = new int[16];

	@OriginalMember(owner = "client!pn", name = "O", descriptor = "[I")
	private final int[] anIntArray428 = new int[16];

	@OriginalMember(owner = "client!pn", name = "Eb", descriptor = "[I")
	private final int[] anIntArray437 = new int[16];

	@OriginalMember(owner = "client!pn", name = "Fb", descriptor = "[[Lclient!rr;")
	private final Class4_Sub44[][] aClass4_Sub44ArrayArray2 = new Class4_Sub44[16][128];

	@OriginalMember(owner = "client!pn", name = "Hb", descriptor = "[I")
	private final int[] anIntArray438 = new int[16];

	@OriginalMember(owner = "client!pn", name = "v", descriptor = "Lclient!mu;")
	private final Class226 aClass226_1 = new Class226();

	@OriginalMember(owner = "client!pn", name = "Ib", descriptor = "Lclient!gf;")
	private final Class4_Sub21_Sub1 aClass4_Sub21_Sub1_1 = new Class4_Sub21_Sub1(this);

	@OriginalMember(owner = "client!pn", name = "vb", descriptor = "Lclient!mo;")
	private final Class221 aClass221_28;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "()V")
	public Class4_Sub21_Sub4() {
		this.aClass221_28 = new Class221(128);
		this.method6164(256, -1);
		this.method6183(true);
	}

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lclient!pn;)V")
	public Class4_Sub21_Sub4(@OriginalArg(0) Class4_Sub21_Sub4 arg0) {
		this.aClass221_28 = arg0.aClass221_28;
		this.method6164(256, -1);
		this.method6183(true);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)V")
	public synchronized void method6163() {
		for (@Pc(16) Class4_Sub16 local16 = (Class4_Sub16) this.aClass221_28.method5072(); local16 != null; local16 = (Class4_Sub16) this.aClass221_28.method5071()) {
			local16.method2532();
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(BII)V")
	public synchronized void method6164(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.anIntArray431[local9] = arg0;
			}
		} else {
			this.anIntArray431[arg1] = arg0;
		}
	}

	@OriginalMember(owner = "client!pn", name = "d", descriptor = "()Lclient!nr;")
	@Override
	public synchronized Class4_Sub21 method6162() {
		return null;
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(IB)V")
	public synchronized void method6165(@OriginalArg(0) int arg0) {
		this.anInt7897 = arg0;
	}

	@OriginalMember(owner = "client!pn", name = "e", descriptor = "(B)Z")
	public synchronized boolean method6166() {
		return this.aClass226_1.method5135();
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!bl;Lclient!vo;Lclient!ap;ZI)Z")
	public synchronized boolean method6167(@OriginalArg(0) Class4_Sub5 arg0, @OriginalArg(1) Class348 arg1, @OriginalArg(2) Class17 arg2) {
		arg0.method1124();
		@Pc(9) boolean local9 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(29) Class4_Sub41 local29 = (Class4_Sub41) arg0.aClass221_4.method5072(); local29 != null; local29 = (Class4_Sub41) arg0.aClass221_4.method5071()) {
			@Pc(35) int local35 = (int) local29.aLong295;
			@Pc(43) Class4_Sub16 local43 = (Class4_Sub16) this.aClass221_28.method5075((long) local35);
			if (local43 == null) {
				local43 = Static203.method3296(arg1, local35);
				if (local43 == null) {
					local9 = false;
					continue;
				}
				this.aClass221_28.method5073(local43, (long) local35);
			}
			if (!local43.method2533(local29.aByteArray80, arg2, local23)) {
				local9 = false;
			}
		}
		if (local9) {
			arg0.method1123();
		}
		return local9;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IZLclient!bl;)V")
	public synchronized void method6168(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class4_Sub5 arg1) {
		this.method6184(arg0, true, arg1);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!rr;I)Z")
	public boolean method6169(@OriginalArg(0) Class4_Sub44 arg0) {
		if (arg0.aClass4_Sub21_Sub2_4 != null) {
			return false;
		}
		if (arg0.anInt8871 >= 0) {
			arg0.method8193();
			if (arg0.anInt8862 > 0 && this.aClass4_Sub44ArrayArray2[arg0.anInt8854][arg0.anInt8862] == arg0) {
				this.aClass4_Sub44ArrayArray2[arg0.anInt8854][arg0.anInt8862] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIB)V")
	private void method6170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "()Lclient!nr;")
	@Override
	public synchronized Class4_Sub21 method6157() {
		return this.aClass4_Sub21_Sub1_1;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IJ)V")
	private void method6172(@OriginalArg(1) long arg0) {
		while (this.aLong209 <= arg0) {
			@Pc(16) int local16 = this.anInt7923;
			@Pc(19) int local19 = this.anInt7922;
			@Pc(22) long local22 = this.aLong209;
			while (local19 == this.anInt7922) {
				while (this.aClass226_1.anIntArray355[local16] == local19) {
					this.aClass226_1.method5134(local16);
					@Pc(33) int local33 = this.aClass226_1.method5125(local16);
					if (local33 == 1) {
						this.aClass226_1.method5137();
						this.aClass226_1.method5136(local16);
						if (this.aClass226_1.method5130()) {
							if (!this.aBoolean568 || local19 == 0) {
								this.method6183(true);
								this.aClass226_1.method5138();
								return;
							}
							this.aClass226_1.method5127(local22);
						}
						break;
					}
					if ((local33 & 0x80) != 0 && (local33 & 0xF0) != 144) {
						this.method6191(local33);
					}
					this.aClass226_1.method5131(local16);
					this.aClass226_1.method5136(local16);
				}
				this.aLong210 = local22;
				local16 = this.aClass226_1.method5123();
				local19 = this.aClass226_1.anIntArray355[local16];
				local22 = this.aClass226_1.method5129(local19);
			}
			this.anInt7923 = local16;
			this.aLong209 = local22;
			this.anInt7922 = local19;
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IBI)V")
	private void method6173(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray427[arg1] = arg0;
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(Lclient!rr;I)I")
	private int method6174(@OriginalArg(0) Class4_Sub44 arg0) {
		if (this.anIntArray431[arg0.anInt8854] == 0) {
			return 0;
		}
		@Pc(17) Class24 local17 = arg0.aClass24_1;
		@Pc(33) int local33 = this.anIntArray426[arg0.anInt8854] * this.anIntArray423[arg0.anInt8854] + 4096 >> 13;
		@Pc(41) int local41 = local33 * local33 + 16384 >> 15;
		@Pc(50) int local50 = local41 * arg0.anInt8869 + 16384 >> 15;
		@Pc(59) int local59 = this.anInt7897 * local50 + 128 >> 8;
		local33 = this.anIntArray431[arg0.anInt8854] * local59 + 128 >> 8;
		if (local17.anInt1027 > 0) {
			local33 = (int) ((double) local33 * Math.pow(0.5D, (double) arg0.anInt8856 * 1.953125E-5D * (double) local17.anInt1027) + 0.5D);
		}
		@Pc(103) int local103;
		@Pc(111) int local111;
		@Pc(129) int local129;
		@Pc(141) int local141;
		if (local17.aByteArray2 != null) {
			local103 = arg0.anInt8860;
			local111 = local17.aByteArray2[arg0.anInt8863 + 1];
			if (arg0.anInt8863 < local17.aByteArray2.length - 2) {
				local129 = (local17.aByteArray2[arg0.anInt8863] & 0xFF) << 8;
				local141 = (local17.aByteArray2[arg0.anInt8863 + 2] & 0xFF) << 8;
				local111 += (local17.aByteArray2[arg0.anInt8863 + 3] - local111) * (local103 - local129) / (local141 - local129);
			}
			local33 = local111 * local33 + 32 >> 6;
		}
		if (arg0.anInt8871 > 0 && local17.aByteArray3 != null) {
			local103 = arg0.anInt8871;
			local111 = local17.aByteArray3[arg0.anInt8861 + 1];
			if (local17.aByteArray3.length - 2 > arg0.anInt8861) {
				local129 = (local17.aByteArray3[arg0.anInt8861] & 0xFF) << 8;
				local141 = (local17.aByteArray3[arg0.anInt8861 + 2] & 0xFF) << 8;
				local111 += (local17.aByteArray3[arg0.anInt8861 + 3] - local111) * (local103 + -local129) / (local141 - local129);
			}
			local33 = local111 * local33 + 32 >> 6;
		}
		return local33;
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)V")
	public synchronized void method6175() {
		this.method6201(true);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIII)V")
	private void method6176(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method6192(arg2, 64, arg1);
		if ((this.anIntArray425[arg1] & 0x2) != 0) {
			for (@Pc(28) Class4_Sub44 local28 = (Class4_Sub44) this.aClass4_Sub21_Sub1_1.aClass22_20.method885(); local28 != null; local28 = (Class4_Sub44) this.aClass4_Sub21_Sub1_1.aClass22_20.method891()) {
				if (local28.anInt8854 == arg1 && local28.anInt8871 < 0) {
					this.aClass4_Sub44ArrayArray1[arg1][local28.anInt8853] = null;
					this.aClass4_Sub44ArrayArray1[arg1][arg2] = local28;
					@Pc(67) int local67 = local28.anInt8851 + (local28.anInt8868 * local28.anInt8870 >> 12);
					local28.anInt8851 += arg2 - local28.anInt8853 << 8;
					local28.anInt8868 = local67 - local28.anInt8851;
					local28.anInt8853 = arg2;
					local28.anInt8870 = 4096;
					return;
				}
			}
		}
		@Pc(115) Class4_Sub16 local115 = (Class4_Sub16) this.aClass221_28.method5075((long) this.anIntArray432[arg1]);
		if (local115 == null) {
			return;
		}
		@Pc(123) Class4_Sub42_Sub1 local123 = local115.aClass4_Sub42_Sub1Array1[arg2];
		if (local123 == null) {
			return;
		}
		@Pc(130) Class4_Sub44 local130 = new Class4_Sub44();
		local130.aClass4_Sub16_1 = local115;
		local130.aClass4_Sub42_Sub1_4 = local123;
		local130.anInt8854 = arg1;
		local130.aClass24_1 = local115.aClass24Array1[arg2];
		local130.anInt8862 = local115.aByteArray26[arg2];
		local130.anInt8853 = arg2;
		local130.anInt8869 = arg0 * arg0 * local115.anInt3125 * local115.aByteArray24[arg2] + 1024 >> 11;
		local130.anInt8872 = local115.aByteArray25[arg2] & 0xFF;
		local130.anInt8851 = (arg2 << 8) - (local115.aShortArray25[arg2] & 0x7FFF);
		local130.anInt8871 = -1;
		local130.anInt8856 = 0;
		local130.anInt8860 = 0;
		local130.anInt8861 = 0;
		local130.anInt8863 = 0;
		if (this.anIntArray429[arg1] == 0) {
			local130.aClass4_Sub21_Sub2_4 = Static601.method4643(local123, this.method6196(local130), this.method6174(local130), this.method6199(local130));
		} else {
			local130.aClass4_Sub21_Sub2_4 = Static601.method4643(local123, this.method6196(local130), 0, this.method6199(local130));
			this.method6181(local115.aShortArray25[arg2] < 0, local130);
		}
		if (local115.aShortArray25[arg2] < 0) {
			local130.aClass4_Sub21_Sub2_4.method4624(-1);
		}
		if (local130.anInt8862 >= 0) {
			@Pc(278) Class4_Sub44 local278 = this.aClass4_Sub44ArrayArray2[arg1][local130.anInt8862];
			if (local278 != null && local278.anInt8871 < 0) {
				this.aClass4_Sub44ArrayArray1[arg1][local278.anInt8853] = null;
				local278.anInt8871 = 0;
			}
			this.aClass4_Sub44ArrayArray2[arg1][local130.anInt8862] = local130;
		}
		this.aClass4_Sub21_Sub1_1.aClass22_20.method894(local130);
		this.aClass4_Sub44ArrayArray1[arg1][arg2] = local130;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIB)V")
	private void method6177() {
		this.anIntArray437[9] = 128;
		this.anIntArray434[9] = 128;
		this.method6194(9, 128);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)V")
	private void method6178(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method6178(local9);
			}
			return;
		}
		this.anIntArray423[arg0] = 12800;
		this.anIntArray430[arg0] = 8192;
		this.anIntArray426[arg0] = 16383;
		this.anIntArray427[arg0] = 8192;
		this.anIntArray424[arg0] = 0;
		this.anIntArray428[arg0] = 8192;
		this.method6189(arg0);
		this.method6200(arg0);
		this.anIntArray425[arg0] = 0;
		this.anIntArray433[arg0] = 32767;
		this.anIntArray435[arg0] = 256;
		this.anIntArray429[arg0] = 0;
		this.method6195(8192, arg0);
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(II)V")
	private void method6179(@OriginalArg(0) int arg0) {
		for (@Pc(8) Class4_Sub44 local8 = (Class4_Sub44) this.aClass4_Sub21_Sub1_1.aClass22_20.method895(); local8 != null; local8 = (Class4_Sub44) this.aClass4_Sub21_Sub1_1.aClass22_20.method889()) {
			if ((arg0 < 0 || local8.anInt8854 == arg0) && local8.anInt8871 < 0) {
				this.aClass4_Sub44ArrayArray1[local8.anInt8854][local8.anInt8853] = null;
				local8.anInt8871 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)V")
	private void method6180(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZILclient!rr;)V")
	public void method6181(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class4_Sub44 arg1) {
		@Pc(14) int local14 = arg1.aClass4_Sub42_Sub1_4.aByteArray90.length;
		@Pc(33) int local33;
		if (arg0 && arg1.aClass4_Sub42_Sub1_4.aBoolean646) {
			@Pc(44) int local44 = local14 + local14 - arg1.aClass4_Sub42_Sub1_4.anInt9493;
			local14 <<= 0x8;
			local33 = (int) ((long) local44 * (long) this.anIntArray429[arg1.anInt8854] >> 6);
			if (local33 >= local14) {
				local33 = local14 + local14 - local33 - 1;
				arg1.aClass4_Sub21_Sub2_4.method4650();
			}
		} else {
			local33 = (int) ((long) local14 * (long) this.anIntArray429[arg1.anInt8854] >> 6);
		}
		arg1.aClass4_Sub21_Sub2_4.method4641(local33);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!bl;IZJZ)V")
	public synchronized void method6182(@OriginalArg(0) Class4_Sub5 arg0, @OriginalArg(3) long arg1, @OriginalArg(4) boolean arg2) {
		this.method6184(arg2, true, arg0);
		this.method6172(arg1 * (long) this.aClass226_1.anInt6489);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZI)V")
	private void method6183(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method6188(-1);
		} else {
			this.method6179(-1);
		}
		this.method6178(-1);
		for (@Pc(29) int local29 = 0; local29 < 16; local29++) {
			this.anIntArray432[local29] = this.anIntArray437[local29];
		}
		for (@Pc(47) int local47 = 0; local47 < 16; local47++) {
			this.anIntArray434[local47] = this.anIntArray437[local47] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method6158(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass226_1.method5135()) {
			@Pc(18) int local18 = this.aClass226_1.anInt6489 * this.anInt7903 / Static544.anInt9957;
			do {
				@Pc(27) long local27 = this.aLong210 + (long) arg2 * (long) local18;
				if (this.aLong209 - local27 >= 0L) {
					this.aLong210 = local27;
					break;
				}
				@Pc(58) int local58 = (int) (((long) local18 + this.aLong209 - this.aLong210 - 1L) / (long) local18);
				this.aLong210 += (long) local58 * (long) local18;
				this.aClass4_Sub21_Sub1_1.method6158(arg0, arg1, local58);
				arg2 -= local58;
				this.method6190();
				arg1 += local58;
			} while (this.aClass226_1.method5135());
		}
		this.aClass4_Sub21_Sub1_1.method6158(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZZLclient!bl;B)V")
	private synchronized void method6184(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class4_Sub5 arg2) {
		this.method6201(arg1);
		this.aClass226_1.method5132(arg2.aByteArray4);
		this.aLong210 = 0L;
		this.aBoolean568 = arg0;
		@Pc(32) int local32 = this.aClass226_1.method5128();
		for (@Pc(34) int local34 = 0; local34 < local32; local34++) {
			this.aClass226_1.method5134(local34);
			this.aClass226_1.method5131(local34);
			this.aClass226_1.method5136(local34);
		}
		this.anInt7923 = this.aClass226_1.method5123();
		this.anInt7922 = this.aClass226_1.anIntArray355[this.anInt7923];
		this.aLong209 = this.aClass226_1.method5129(this.anInt7922);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(II[IILclient!rr;)Z")
	public boolean method6185(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class4_Sub44 arg3) {
		arg3.anInt8859 = Static544.anInt9957 / 100;
		if (arg3.anInt8871 >= 0 && (arg3.aClass4_Sub21_Sub2_4 == null || arg3.aClass4_Sub21_Sub2_4.method4631())) {
			arg3.method6796();
			arg3.method8193();
			if (arg3.anInt8862 > 0 && this.aClass4_Sub44ArrayArray2[arg3.anInt8854][arg3.anInt8862] == arg3) {
				this.aClass4_Sub44ArrayArray2[arg3.anInt8854][arg3.anInt8862] = null;
			}
			return true;
		}
		@Pc(53) int local53 = arg3.anInt8870;
		if (local53 > 0) {
			local53 -= (int) (Math.pow(2.0D, (double) this.anIntArray428[arg3.anInt8854] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local53 < 0) {
				local53 = 0;
			}
			arg3.anInt8870 = local53;
		}
		arg3.aClass4_Sub21_Sub2_4.method4626(this.method6196(arg3));
		@Pc(93) Class24 local93 = arg3.aClass24_1;
		@Pc(100) boolean local100 = false;
		arg3.anInt8866 += local93.anInt1026;
		arg3.anInt8865++;
		@Pc(131) double local131 = (double) ((arg3.anInt8853 - 60 << 8) + (arg3.anInt8870 * arg3.anInt8868 >> 12)) * 5.086263020833333E-6D;
		if (local93.anInt1027 > 0) {
			if (local93.anInt1025 > 0) {
				arg3.anInt8856 += (int) (Math.pow(2.0D, (double) local93.anInt1025 * local131) * 128.0D + 0.5D);
			} else {
				arg3.anInt8856 += 128;
			}
			if (local93.anInt1027 * arg3.anInt8856 >= 819200) {
				local100 = true;
			}
		}
		if (local93.aByteArray2 != null) {
			if (local93.anInt1020 <= 0) {
				arg3.anInt8860 += 128;
			} else {
				arg3.anInt8860 += (int) (Math.pow(2.0D, (double) local93.anInt1020 * local131) * 128.0D + 0.5D);
			}
			while (local93.aByteArray2.length - 2 > arg3.anInt8863 && (local93.aByteArray2[arg3.anInt8863 + 2] & 0xFF) << 8 < arg3.anInt8860) {
				arg3.anInt8863 += 2;
			}
			if (local93.aByteArray2.length - 2 == arg3.anInt8863 && local93.aByteArray2[arg3.anInt8863 + 1] == 0) {
				local100 = true;
			}
		}
		if (arg3.anInt8871 >= 0 && local93.aByteArray3 != null && (this.anIntArray425[arg3.anInt8854] & 0x1) == 0 && (arg3.anInt8862 < 0 || arg3 != this.aClass4_Sub44ArrayArray2[arg3.anInt8854][arg3.anInt8862])) {
			if (local93.anInt1022 <= 0) {
				arg3.anInt8871 += 128;
			} else {
				arg3.anInt8871 += (int) (Math.pow(2.0D, local131 * (double) local93.anInt1022) * 128.0D + 0.5D);
			}
			while (arg3.anInt8861 < local93.aByteArray3.length - 2 && arg3.anInt8871 > (local93.aByteArray3[arg3.anInt8861 + 2] & 0xFF) << 8) {
				arg3.anInt8861 += 2;
			}
			if (arg3.anInt8861 == local93.aByteArray3.length - 2) {
				local100 = true;
			}
		}
		if (!local100) {
			arg3.aClass4_Sub21_Sub2_4.method4653(arg3.anInt8859, this.method6174(arg3), this.method6199(arg3));
			return false;
		}
		arg3.aClass4_Sub21_Sub2_4.method4620(arg3.anInt8859);
		if (arg1 == null) {
			arg3.aClass4_Sub21_Sub2_4.method6156(arg0);
		} else {
			arg3.aClass4_Sub21_Sub2_4.method6158(arg1, arg2, arg0);
		}
		if (arg3.aClass4_Sub21_Sub2_4.method4644()) {
			this.aClass4_Sub21_Sub1_1.aClass4_Sub21_Sub3_1.method5927(arg3.aClass4_Sub21_Sub2_4);
		}
		arg3.method6796();
		if (arg3.anInt8871 >= 0) {
			arg3.method8193();
			if (arg3.anInt8862 > 0 && arg3 == this.aClass4_Sub44ArrayArray2[arg3.anInt8854][arg3.anInt8862]) {
				this.aClass4_Sub44ArrayArray2[arg3.anInt8854][arg3.anInt8862] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pn", name = "d", descriptor = "(I)I")
	public int method6187() {
		return this.anInt7897;
	}

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "(II)V")
	private void method6188(@OriginalArg(0) int arg0) {
		for (@Pc(10) Class4_Sub44 local10 = (Class4_Sub44) this.aClass4_Sub21_Sub1_1.aClass22_20.method895(); local10 != null; local10 = (Class4_Sub44) this.aClass4_Sub21_Sub1_1.aClass22_20.method889()) {
			if (arg0 < 0 || arg0 == local10.anInt8854) {
				if (local10.aClass4_Sub21_Sub2_4 != null) {
					local10.aClass4_Sub21_Sub2_4.method4620(Static544.anInt9957 / 100);
					if (local10.aClass4_Sub21_Sub2_4.method4644()) {
						this.aClass4_Sub21_Sub1_1.aClass4_Sub21_Sub3_1.method5927(local10.aClass4_Sub21_Sub2_4);
					}
					local10.method6796();
				}
				if (local10.anInt8871 < 0) {
					this.aClass4_Sub44ArrayArray1[local10.anInt8854][local10.anInt8853] = null;
				}
				local10.method8193();
			}
		}
	}

	@OriginalMember(owner = "client!pn", name = "d", descriptor = "(II)V")
	private void method6189(@OriginalArg(0) int arg0) {
		if ((this.anIntArray425[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(20) Class4_Sub44 local20 = (Class4_Sub44) this.aClass4_Sub21_Sub1_1.aClass22_20.method895(); local20 != null; local20 = (Class4_Sub44) this.aClass4_Sub21_Sub1_1.aClass22_20.method889()) {
			if (local20.anInt8854 == arg0 && this.aClass4_Sub44ArrayArray1[arg0][local20.anInt8853] == null && local20.anInt8871 < 0) {
				local20.anInt8871 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "()I")
	@Override
	public synchronized int method6160() {
		return 0;
	}

	@OriginalMember(owner = "client!pn", name = "f", descriptor = "(I)V")
	private void method6190() {
		@Pc(8) int local8 = this.anInt7923;
		@Pc(19) int local19 = this.anInt7922;
		@Pc(22) long local22 = this.aLong209;
		if (this.aClass4_Sub5_4 != null && local19 == this.anInt7924) {
			this.method6184(this.aBoolean568, this.aBoolean569, this.aClass4_Sub5_4);
			this.method6190();
			return;
		}
		while (this.anInt7922 == local19) {
			while (this.aClass226_1.anIntArray355[local8] == local19) {
				this.aClass226_1.method5134(local8);
				@Pc(55) int local55 = this.aClass226_1.method5125(local8);
				if (local55 == 1) {
					this.aClass226_1.method5137();
					this.aClass226_1.method5136(local8);
					if (this.aClass226_1.method5130()) {
						if (this.aClass4_Sub5_4 != null) {
							this.method6168(this.aBoolean568, this.aClass4_Sub5_4);
							this.method6190();
							return;
						}
						if (!this.aBoolean568 || local19 == 0) {
							this.method6183(true);
							this.aClass226_1.method5138();
							return;
						}
						this.aClass226_1.method5127(local22);
					}
					break;
				}
				if ((local55 & 0x80) != 0) {
					this.method6191(local55);
				}
				this.aClass226_1.method5131(local8);
				this.aClass226_1.method5136(local8);
			}
			local8 = this.aClass226_1.method5123();
			local19 = this.aClass226_1.anIntArray355[local8];
			local22 = this.aClass226_1.method5129(local19);
		}
		this.aLong209 = local22;
		this.anInt7922 = local19;
		this.anInt7923 = local8;
		if (this.aClass4_Sub5_4 != null && local19 > this.anInt7924) {
			this.anInt7922 = this.anInt7924;
			this.anInt7923 = -1;
			this.aLong209 = this.aClass226_1.method5129(this.anInt7922);
		}
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(ZI)V")
	private void method6191(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(25) int local25;
		@Pc(31) int local31;
		@Pc(37) int local37;
		if (local9 == 128) {
			local25 = arg0 & 0xF;
			local31 = arg0 >> 8 & 0x7F;
			local37 = arg0 >> 16 & 0x7F;
			this.method6192(local31, local37, local25);
		} else if (local9 == 144) {
			local25 = arg0 & 0xF;
			local31 = arg0 >> 8 & 0x7F;
			local37 = arg0 >> 16 & 0x7F;
			if (local37 > 0) {
				this.method6176(local37, local25, local31);
			} else {
				this.method6192(local31, 64, local25);
			}
		} else if (local9 == 160) {
			local25 = arg0 & 0xF;
			local31 = arg0 >> 8 & 0x7F;
			local37 = arg0 >> 16 & 0x7F;
			this.method6170(local25, local37, local31);
		} else if (local9 == 176) {
			local25 = arg0 & 0xF;
			local31 = arg0 >> 8 & 0x7F;
			local37 = arg0 >> 16 & 0x7F;
			if (local31 == 0) {
				this.anIntArray434[local25] = (this.anIntArray434[local25] & 0xFFE03FFF) + (local37 << 14);
			}
			if (local31 == 32) {
				this.anIntArray434[local25] = (local37 << 7) + (this.anIntArray434[local25] & 0xFFFFC07F);
			}
			if (local31 == 1) {
				this.anIntArray424[local25] = (this.anIntArray424[local25] & 0xFFFFC07F) + (local37 << 7);
			}
			if (local31 == 33) {
				this.anIntArray424[local25] = (this.anIntArray424[local25] & 0xFFFFFF80) + local37;
			}
			if (local31 == 5) {
				this.anIntArray428[local25] = (local37 << 7) + (this.anIntArray428[local25] & 0xFFFFC07F);
			}
			if (local31 == 37) {
				this.anIntArray428[local25] = (this.anIntArray428[local25] & 0xFFFFFF80) + local37;
			}
			if (local31 == 7) {
				this.anIntArray423[local25] = (local37 << 7) + (this.anIntArray423[local25] & 0xFFFFC07F);
			}
			if (local31 == 39) {
				this.anIntArray423[local25] = (this.anIntArray423[local25] & 0xFFFFFF80) + local37;
			}
			if (local31 == 10) {
				this.anIntArray430[local25] = (this.anIntArray430[local25] & 0xFFFFC07F) + (local37 << 7);
			}
			if (local31 == 42) {
				this.anIntArray430[local25] = (this.anIntArray430[local25] & 0xFFFFFF80) + local37;
			}
			if (local31 == 11) {
				this.anIntArray426[local25] = (this.anIntArray426[local25] & 0xFFFFC07F) + (local37 << 7);
			}
			if (local31 == 43) {
				this.anIntArray426[local25] = (this.anIntArray426[local25] & 0xFFFFFF80) + local37;
			}
			if (local31 == 64) {
				if (local37 < 64) {
					this.anIntArray425[local25] &= 0xFFFFFFFE;
				} else {
					this.anIntArray425[local25] |= 0x1;
				}
			}
			if (local31 == 65) {
				if (local37 >= 64) {
					this.anIntArray425[local25] |= 0x2;
				} else {
					this.method6189(local25);
					this.anIntArray425[local25] &= 0xFFFFFFFD;
				}
			}
			if (local31 == 99) {
				this.anIntArray433[local25] = (local37 << 7) + (this.anIntArray433[local25] & 0x7F);
			}
			if (local31 == 98) {
				this.anIntArray433[local25] = local37 + (this.anIntArray433[local25] & 0x3F80);
			}
			if (local31 == 101) {
				this.anIntArray433[local25] = (this.anIntArray433[local25] & 0x7F) + (local37 << 7) + 16384;
			}
			if (local31 == 100) {
				this.anIntArray433[local25] = (this.anIntArray433[local25] & 0x3F80) + local37 + 16384;
			}
			if (local31 == 120) {
				this.method6188(local25);
			}
			if (local31 == 121) {
				this.method6178(local25);
			}
			if (local31 == 123) {
				this.method6179(local25);
			}
			@Pc(511) int local511;
			if (local31 == 6) {
				local511 = this.anIntArray433[local25];
				if (local511 == 16384) {
					this.anIntArray435[local25] = (local37 << 7) + (this.anIntArray435[local25] & 0xFFFFC07F);
				}
			}
			if (local31 == 38) {
				local511 = this.anIntArray433[local25];
				if (local511 == 16384) {
					this.anIntArray435[local25] = local37 + (this.anIntArray435[local25] & 0xFFFFFF80);
				}
			}
			if (local31 == 16) {
				this.anIntArray429[local25] = (local37 << 7) + (this.anIntArray429[local25] & 0xFFFFC07F);
			}
			if (local31 == 48) {
				this.anIntArray429[local25] = local37 + (this.anIntArray429[local25] & 0xFFFFFF80);
			}
			if (local31 == 81) {
				if (local37 >= 64) {
					this.anIntArray425[local25] |= 0x4;
				} else {
					this.method6200(local25);
					this.anIntArray425[local25] &= 0xFFFFFFFB;
				}
			}
			if (local31 == 17) {
				this.method6195((local37 << 7) + (this.anIntArray438[local25] & 0xFFFFC07F), local25);
			}
			if (local31 == 49) {
				this.method6195((this.anIntArray438[local25] & 0xFFFFFF80) + local37, local25);
			}
		} else if (local9 == 192) {
			local25 = arg0 & 0xF;
			local31 = arg0 >> 8 & 0x7F;
			this.method6194(local25, local31 + this.anIntArray434[local25]);
		} else if (local9 == 208) {
			local25 = arg0 & 0xF;
			local31 = arg0 >> 8 & 0x7F;
			this.method6180(local25, local31);
		} else if (local9 == 224) {
			local25 = arg0 & 0xF;
			local31 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F0125) >> 9);
			this.method6173(local31, local25);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method6183(true);
			}
		}
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(IIII)V")
	private void method6192(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class4_Sub44 local12 = this.aClass4_Sub44ArrayArray1[arg2][arg0];
		if (local12 == null) {
			return;
		}
		this.aClass4_Sub44ArrayArray1[arg2][arg0] = null;
		if ((this.anIntArray425[arg2] & 0x2) == 0) {
			local12.anInt8871 = 0;
			return;
		}
		for (@Pc(42) Class4_Sub44 local42 = (Class4_Sub44) this.aClass4_Sub21_Sub1_1.aClass22_20.method895(); local42 != null; local42 = (Class4_Sub44) this.aClass4_Sub21_Sub1_1.aClass22_20.method889()) {
			if (local12.anInt8854 == local42.anInt8854 && local42.anInt8871 < 0 && local12 != local42) {
				local12.anInt8871 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(III)V")
	public synchronized void method6193() {
		this.method6177();
	}

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "(III)V")
	private void method6194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray432[arg0] != arg1) {
			this.anIntArray432[arg0] = arg1;
			for (@Pc(23) int local23 = 0; local23 < 128; local23++) {
				this.aClass4_Sub44ArrayArray2[arg0][local23] = null;
			}
		}
	}

	@OriginalMember(owner = "client!pn", name = "d", descriptor = "(III)V")
	private void method6195(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray438[arg1] = arg0;
		this.anIntArray436[arg1] = (int) ((double) 2097152 * Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) + 0.5D);
	}

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "(Lclient!rr;I)I")
	private int method6196(@OriginalArg(0) Class4_Sub44 arg0) {
		@Pc(22) int local22 = arg0.anInt8851 + (arg0.anInt8868 * arg0.anInt8870 >> 12);
		local22 += this.anIntArray435[arg0.anInt8854] * (this.anIntArray427[arg0.anInt8854] - 8192) >> 12;
		@Pc(43) Class24 local43 = arg0.aClass24_1;
		@Pc(63) int local63;
		if (local43.anInt1026 > 0 && (local43.anInt1021 > 0 || this.anIntArray424[arg0.anInt8854] > 0)) {
			local63 = local43.anInt1021 << 2;
			@Pc(68) int local68 = local43.anInt1024 << 1;
			if (local68 > arg0.anInt8865) {
				local63 = arg0.anInt8865 * local63 / local68;
			}
			local63 += this.anIntArray424[arg0.anInt8854] >> 7;
			@Pc(102) double local102 = Math.sin((double) (arg0.anInt8866 & 0x1FF) * 0.01227184630308513D);
			local22 += (int) (local102 * (double) local63);
		}
		local63 = (int) ((double) (arg0.aClass4_Sub42_Sub1_4.anInt9491 * 256) * Math.pow(2.0D, (double) local22 * 3.255208333333333E-4D) / (double) Static544.anInt9957 + 0.5D);
		return local63 >= 1 ? local63 : 1;
	}

	@OriginalMember(owner = "client!pn", name = "f", descriptor = "(B)V")
	public synchronized void method6198() {
		for (@Pc(13) Class4_Sub16 local13 = (Class4_Sub16) this.aClass221_28.method5072(); local13 != null; local13 = (Class4_Sub16) this.aClass221_28.method5071()) {
			local13.method8193();
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ILclient!rr;)I")
	private int method6199(@OriginalArg(1) Class4_Sub44 arg0) {
		@Pc(17) int local17 = this.anIntArray430[arg0.anInt8854];
		return local17 < 8192 ? arg0.anInt8872 * local17 + 32 >> 6 : 16384 - ((128 - arg0.anInt8872) * (16384 - local17) + 32 >> 6);
	}

	@OriginalMember(owner = "client!pn", name = "e", descriptor = "(II)V")
	private void method6200(@OriginalArg(1) int arg0) {
		if ((this.anIntArray425[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(26) Class4_Sub44 local26 = (Class4_Sub44) this.aClass4_Sub21_Sub1_1.aClass22_20.method895(); local26 != null; local26 = (Class4_Sub44) this.aClass4_Sub21_Sub1_1.aClass22_20.method889()) {
			if (arg0 == local26.anInt8854) {
				local26.anInt8855 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6156(@OriginalArg(0) int arg0) {
		if (this.aClass226_1.method5135()) {
			@Pc(14) int local14 = this.anInt7903 * this.aClass226_1.anInt6489 / Static544.anInt9957;
			do {
				@Pc(23) long local23 = (long) arg0 * (long) local14 + this.aLong210;
				if (this.aLong209 - local23 >= 0L) {
					this.aLong210 = local23;
					break;
				}
				@Pc(54) int local54 = (int) ((this.aLong209 + (long) local14 - this.aLong210 - 1L) / (long) local14);
				this.aLong210 += (long) local14 * (long) local54;
				arg0 -= local54;
				this.aClass4_Sub21_Sub1_1.method6156(local54);
				this.method6190();
			} while (this.aClass226_1.method5135());
		}
		this.aClass4_Sub21_Sub1_1.method6156(arg0);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZB)V")
	private synchronized void method6201(@OriginalArg(0) boolean arg0) {
		this.aClass226_1.method5138();
		this.aClass4_Sub5_4 = null;
		this.method6183(arg0);
	}
}
