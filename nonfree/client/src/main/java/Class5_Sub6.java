import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class5_Sub6 extends Class5 {

	@OriginalMember(owner = "client!se", name = "l", descriptor = "I")
	public int anInt3815;

	@OriginalMember(owner = "client!se", name = "m", descriptor = "[Lclient!gg;")
	public Class35[] aClass35Array1;

	@OriginalMember(owner = "client!se", name = "n", descriptor = "[I")
	public int[] anIntArray319;

	@OriginalMember(owner = "client!se", name = "o", descriptor = "S")
	private short aShort11;

	@OriginalMember(owner = "client!se", name = "p", descriptor = "[B")
	public byte[] aByteArray40;

	@OriginalMember(owner = "client!se", name = "r", descriptor = "[S")
	private short[] aShortArray42;

	@OriginalMember(owner = "client!se", name = "s", descriptor = "[S")
	public short[] aShortArray43;

	@OriginalMember(owner = "client!se", name = "t", descriptor = "[B")
	private byte[] aByteArray41;

	@OriginalMember(owner = "client!se", name = "u", descriptor = "[I")
	public int[] anIntArray320;

	@OriginalMember(owner = "client!se", name = "w", descriptor = "[B")
	public byte[] aByteArray42;

	@OriginalMember(owner = "client!se", name = "x", descriptor = "[I")
	public int[] anIntArray322;

	@OriginalMember(owner = "client!se", name = "y", descriptor = "S")
	private short aShort12;

	@OriginalMember(owner = "client!se", name = "z", descriptor = "[B")
	private byte[] aByteArray43;

	@OriginalMember(owner = "client!se", name = "A", descriptor = "[I")
	public int[] anIntArray323;

	@OriginalMember(owner = "client!se", name = "B", descriptor = "[I")
	private int[] anIntArray324;

	@OriginalMember(owner = "client!se", name = "C", descriptor = "S")
	public short aShort13;

	@OriginalMember(owner = "client!se", name = "D", descriptor = "[[I")
	public int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!se", name = "E", descriptor = "[B")
	public byte[] aByteArray44;

	@OriginalMember(owner = "client!se", name = "F", descriptor = "[[I")
	public int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!se", name = "G", descriptor = "[Lclient!gj;")
	public Class38[] aClass38Array1;

	@OriginalMember(owner = "client!se", name = "H", descriptor = "S")
	private short aShort14;

	@OriginalMember(owner = "client!se", name = "J", descriptor = "[B")
	private byte[] aByteArray45;

	@OriginalMember(owner = "client!se", name = "K", descriptor = "S")
	private short aShort15;

	@OriginalMember(owner = "client!se", name = "L", descriptor = "[B")
	private byte[] aByteArray46;

	@OriginalMember(owner = "client!se", name = "O", descriptor = "[S")
	private short[] aShortArray44;

	@OriginalMember(owner = "client!se", name = "Q", descriptor = "S")
	private short aShort16;

	@OriginalMember(owner = "client!se", name = "R", descriptor = "[I")
	public int[] anIntArray327;

	@OriginalMember(owner = "client!se", name = "S", descriptor = "[S")
	public short[] aShortArray45;

	@OriginalMember(owner = "client!se", name = "V", descriptor = "[S")
	public short[] aShortArray46;

	@OriginalMember(owner = "client!se", name = "W", descriptor = "[S")
	public short[] aShortArray47;

	@OriginalMember(owner = "client!se", name = "X", descriptor = "S")
	public short aShort17;

	@OriginalMember(owner = "client!se", name = "Y", descriptor = "[S")
	public short[] aShortArray48;

	@OriginalMember(owner = "client!se", name = "ab", descriptor = "[Lclient!gj;")
	public Class38[] aClass38Array2;

	@OriginalMember(owner = "client!se", name = "bb", descriptor = "[S")
	private short[] aShortArray49;

	@OriginalMember(owner = "client!se", name = "cb", descriptor = "[B")
	public byte[] aByteArray47;

	@OriginalMember(owner = "client!se", name = "db", descriptor = "[B")
	public byte[] aByteArray48;

	@OriginalMember(owner = "client!se", name = "eb", descriptor = "[B")
	private byte[] aByteArray49;

	@OriginalMember(owner = "client!se", name = "fb", descriptor = "S")
	private short aShort18;

	@OriginalMember(owner = "client!se", name = "gb", descriptor = "[I")
	private int[] anIntArray329;

	@OriginalMember(owner = "client!se", name = "hb", descriptor = "[I")
	public int[] anIntArray330;

	@OriginalMember(owner = "client!se", name = "P", descriptor = "I")
	public int anInt3817 = 0;

	@OriginalMember(owner = "client!se", name = "T", descriptor = "Z")
	private boolean aBoolean174 = false;

	@OriginalMember(owner = "client!se", name = "q", descriptor = "B")
	public byte aByte7 = 0;

	@OriginalMember(owner = "client!se", name = "M", descriptor = "I")
	public int anInt3816 = 0;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
	private Class5_Sub6() {
	}

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "([B)V")
	public Class5_Sub6(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method2937(arg0);
		} else {
			this.method2952(arg0);
		}
	}

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "([Lclient!se;I)V")
	public Class5_Sub6(@OriginalArg(0) Class5_Sub6[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		this.anInt3816 = 0;
		this.anInt3817 = 0;
		this.anInt3815 = 0;
		this.aByte7 = -1;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
			@Pc(44) Class5_Sub6 local44 = arg0[local39];
			if (local44 != null) {
				this.anInt3816 += local44.anInt3816;
				this.anInt3817 += local44.anInt3817;
				this.anInt3815 += local44.anInt3815;
				if (local44.aByteArray40 == null) {
					if (this.aByte7 == -1) {
						this.aByte7 = local44.aByte7;
					}
					if (this.aByte7 != local44.aByte7) {
						local17 = true;
					}
				} else {
					local17 = true;
				}
				local15 |= local44.aByteArray47 != null;
				local19 |= local44.aByteArray42 != null;
				local21 |= local44.anIntArray329 != null;
				local23 |= local44.aShortArray48 != null;
				local25 |= local44.aByteArray44 != null;
			}
		}
		this.anIntArray322 = new int[this.anInt3816];
		this.anIntArray330 = new int[this.anInt3816];
		this.anIntArray327 = new int[this.anInt3816];
		this.anIntArray324 = new int[this.anInt3816];
		this.anIntArray319 = new int[this.anInt3817];
		this.anIntArray320 = new int[this.anInt3817];
		this.anIntArray323 = new int[this.anInt3817];
		if (local15) {
			this.aByteArray47 = new byte[this.anInt3817];
		}
		if (local17) {
			this.aByteArray40 = new byte[this.anInt3817];
		}
		if (local19) {
			this.aByteArray42 = new byte[this.anInt3817];
		}
		if (local21) {
			this.anIntArray329 = new int[this.anInt3817];
		}
		if (local23) {
			this.aShortArray48 = new short[this.anInt3817];
		}
		if (local25) {
			this.aByteArray44 = new byte[this.anInt3817];
		}
		this.aShortArray43 = new short[this.anInt3817];
		if (this.anInt3815 > 0) {
			this.aByteArray48 = new byte[this.anInt3815];
			this.aShortArray45 = new short[this.anInt3815];
			this.aShortArray47 = new short[this.anInt3815];
			this.aShortArray46 = new short[this.anInt3815];
			this.aShortArray44 = new short[this.anInt3815];
			this.aShortArray42 = new short[this.anInt3815];
			this.aShortArray49 = new short[this.anInt3815];
			this.aByteArray45 = new byte[this.anInt3815];
			this.aByteArray49 = new byte[this.anInt3815];
			this.aByteArray46 = new byte[this.anInt3815];
			this.aByteArray43 = new byte[this.anInt3815];
			this.aByteArray41 = new byte[this.anInt3815];
		}
		this.anInt3816 = 0;
		this.anInt3817 = 0;
		this.anInt3815 = 0;
		for (@Pc(293) int local293 = 0; local293 < arg1; local293++) {
			@Pc(298) Class5_Sub6 local298 = arg0[local293];
			if (local298 != null) {
				for (@Pc(302) int local302 = 0; local302 < local298.anInt3817; local302++) {
					if (local15 && local298.aByteArray47 != null) {
						this.aByteArray47[this.anInt3817] = local298.aByteArray47[local302];
					}
					if (local17) {
						if (local298.aByteArray40 == null) {
							this.aByteArray40[this.anInt3817] = local298.aByte7;
						} else {
							this.aByteArray40[this.anInt3817] = local298.aByteArray40[local302];
						}
					}
					if (local19 && local298.aByteArray42 != null) {
						this.aByteArray42[this.anInt3817] = local298.aByteArray42[local302];
					}
					if (local21 && local298.anIntArray329 != null) {
						this.anIntArray329[this.anInt3817] = local298.anIntArray329[local302];
					}
					if (local23) {
						if (local298.aShortArray48 == null) {
							this.aShortArray48[this.anInt3817] = -1;
						} else {
							this.aShortArray48[this.anInt3817] = local298.aShortArray48[local302];
						}
					}
					if (local25) {
						if (local298.aByteArray44 == null || local298.aByteArray44[local302] == -1) {
							this.aByteArray44[this.anInt3817] = -1;
						} else {
							this.aByteArray44[this.anInt3817] = (byte) (local298.aByteArray44[local302] + this.anInt3815);
						}
					}
					this.aShortArray43[this.anInt3817] = local298.aShortArray43[local302];
					this.anIntArray319[this.anInt3817] = this.method2935(local298, local298.anIntArray319[local302]);
					this.anIntArray320[this.anInt3817] = this.method2935(local298, local298.anIntArray320[local302]);
					this.anIntArray323[this.anInt3817] = this.method2935(local298, local298.anIntArray323[local302]);
					this.anInt3817++;
				}
				for (@Pc(477) int local477 = 0; local477 < local298.anInt3815; local477++) {
					@Pc(489) byte local489 = this.aByteArray48[this.anInt3815] = local298.aByteArray48[local477];
					if (local489 == 0) {
						this.aShortArray45[this.anInt3815] = (short) this.method2935(local298, local298.aShortArray45[local477]);
						this.aShortArray47[this.anInt3815] = (short) this.method2935(local298, local298.aShortArray47[local477]);
						this.aShortArray46[this.anInt3815] = (short) this.method2935(local298, local298.aShortArray46[local477]);
					}
					if (local489 >= 1 && local489 <= 3) {
						this.aShortArray45[this.anInt3815] = local298.aShortArray45[local477];
						this.aShortArray47[this.anInt3815] = local298.aShortArray47[local477];
						this.aShortArray46[this.anInt3815] = local298.aShortArray46[local477];
						this.aShortArray44[this.anInt3815] = local298.aShortArray44[local477];
						this.aShortArray42[this.anInt3815] = local298.aShortArray42[local477];
						this.aShortArray49[this.anInt3815] = local298.aShortArray49[local477];
						this.aByteArray45[this.anInt3815] = local298.aByteArray45[local477];
						this.aByteArray49[this.anInt3815] = local298.aByteArray49[local477];
						this.aByteArray46[this.anInt3815] = local298.aByteArray46[local477];
					}
					if (local489 == 2) {
						this.aByteArray43[this.anInt3815] = local298.aByteArray43[local477];
						this.aByteArray41[this.anInt3815] = local298.aByteArray41[local477];
					}
					this.anInt3815++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lclient!se;ZZZZ)V")
	public Class5_Sub6(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3816 = arg0.anInt3816;
		this.anInt3817 = arg0.anInt3817;
		this.anInt3815 = arg0.anInt3815;
		@Pc(57) int local57;
		if (arg1) {
			this.anIntArray322 = arg0.anIntArray322;
			this.anIntArray330 = arg0.anIntArray330;
			this.anIntArray327 = arg0.anIntArray327;
		} else {
			this.anIntArray322 = new int[this.anInt3816];
			this.anIntArray330 = new int[this.anInt3816];
			this.anIntArray327 = new int[this.anInt3816];
			for (local57 = 0; local57 < this.anInt3816; local57++) {
				this.anIntArray322[local57] = arg0.anIntArray322[local57];
				this.anIntArray330[local57] = arg0.anIntArray330[local57];
				this.anIntArray327[local57] = arg0.anIntArray327[local57];
			}
		}
		if (arg2) {
			this.aShortArray43 = arg0.aShortArray43;
		} else {
			this.aShortArray43 = new short[this.anInt3817];
			for (local57 = 0; local57 < this.anInt3817; local57++) {
				this.aShortArray43[local57] = arg0.aShortArray43[local57];
			}
		}
		if (arg3 || arg0.aShortArray48 == null) {
			this.aShortArray48 = arg0.aShortArray48;
		} else {
			this.aShortArray48 = new short[this.anInt3817];
			for (local57 = 0; local57 < this.anInt3817; local57++) {
				this.aShortArray48[local57] = arg0.aShortArray48[local57];
			}
		}
		this.aByteArray42 = arg0.aByteArray42;
		this.anIntArray319 = arg0.anIntArray319;
		this.anIntArray320 = arg0.anIntArray320;
		this.anIntArray323 = arg0.anIntArray323;
		this.aByteArray47 = arg0.aByteArray47;
		this.aByteArray40 = arg0.aByteArray40;
		this.aByteArray44 = arg0.aByteArray44;
		this.aByte7 = arg0.aByte7;
		this.aByteArray48 = arg0.aByteArray48;
		this.aShortArray45 = arg0.aShortArray45;
		this.aShortArray47 = arg0.aShortArray47;
		this.aShortArray46 = arg0.aShortArray46;
		this.aShortArray44 = arg0.aShortArray44;
		this.aShortArray42 = arg0.aShortArray42;
		this.aShortArray49 = arg0.aShortArray49;
		this.aByteArray45 = arg0.aByteArray45;
		this.aByteArray49 = arg0.aByteArray49;
		this.aByteArray46 = arg0.aByteArray46;
		this.aByteArray43 = arg0.aByteArray43;
		this.aByteArray41 = arg0.aByteArray41;
		this.anIntArray324 = arg0.anIntArray324;
		this.anIntArray329 = arg0.anIntArray329;
		this.anIntArrayArray31 = arg0.anIntArrayArray31;
		this.anIntArrayArray32 = arg0.anIntArrayArray32;
		this.aClass38Array2 = arg0.aClass38Array2;
		this.aClass35Array1 = arg0.aClass35Array1;
		this.aClass38Array1 = arg0.aClass38Array1;
		this.aShort17 = arg0.aShort17;
		this.aShort13 = arg0.aShort13;
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "()V")
	public void method2933() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3816; local1++) {
			@Pc(7) int local7 = this.anIntArray327[local1];
			this.anIntArray327[local1] = this.anIntArray322[local1];
			this.anIntArray322[local1] = -local7;
		}
		this.method2945();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(SS)V")
	public void method2934(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray48 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt3817; local5++) {
			if (this.aShortArray48[local5] == arg0) {
				this.aShortArray48[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!se;I)I")
	private int method2935(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray322[arg1];
		@Pc(11) int local11 = arg0.anIntArray330[arg1];
		@Pc(16) int local16 = arg0.anIntArray327[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt3816; local18++) {
			if (local6 == this.anIntArray322[local18] && local11 == this.anIntArray330[local18] && local16 == this.anIntArray327[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray322[this.anInt3816] = local6;
			this.anIntArray330[this.anInt3816] = local11;
			this.anIntArray327[this.anInt3816] = local16;
			if (arg0.anIntArray324 != null) {
				this.anIntArray324[this.anInt3816] = arg0.anIntArray324[arg1];
			}
			local1 = this.anInt3816++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(SS)V")
	public void method2936(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3817; local1++) {
			if (this.aShortArray43[local1] == arg0) {
				this.aShortArray43[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "([B)V")
	private void method2937(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class1_Sub7 local4 = new Class1_Sub7(arg0);
		@Pc(9) Class1_Sub7 local9 = new Class1_Sub7(arg0);
		@Pc(14) Class1_Sub7 local14 = new Class1_Sub7(arg0);
		@Pc(19) Class1_Sub7 local19 = new Class1_Sub7(arg0);
		@Pc(24) Class1_Sub7 local24 = new Class1_Sub7(arg0);
		@Pc(29) Class1_Sub7 local29 = new Class1_Sub7(arg0);
		@Pc(34) Class1_Sub7 local34 = new Class1_Sub7(arg0);
		local4.anInt3592 = arg0.length - 23;
		@Pc(44) int local44 = local4.method2765();
		@Pc(48) int local48 = local4.method2765();
		@Pc(52) int local52 = local4.method2771();
		@Pc(56) int local56 = local4.method2771();
		@Pc(60) int local60 = local4.method2771();
		@Pc(64) int local64 = local4.method2771();
		@Pc(68) int local68 = local4.method2771();
		@Pc(72) int local72 = local4.method2771();
		@Pc(76) int local76 = local4.method2771();
		@Pc(80) int local80 = local4.method2765();
		@Pc(84) int local84 = local4.method2765();
		@Pc(88) int local88 = local4.method2765();
		@Pc(92) int local92 = local4.method2765();
		@Pc(96) int local96 = local4.method2765();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		@Pc(113) int local113;
		if (local52 > 0) {
			this.aByteArray48 = new byte[local52];
			local4.anInt3592 = 0;
			for (local113 = 0; local113 < local52; local113++) {
				@Pc(123) byte local123 = this.aByteArray48[local113] = local4.method2770();
				if (local123 == 0) {
					local98++;
				}
				if (local123 >= 1 && local123 <= 3) {
					local100++;
				}
				if (local123 == 2) {
					local102++;
				}
			}
		}
		local113 = local52 + local44;
		@Pc(151) int local151 = local113;
		if (local56 == 1) {
			local113 += local48;
		}
		@Pc(160) int local160 = local113;
		local113 += local48;
		@Pc(166) int local166 = local113;
		if (local60 == 255) {
			local113 += local48;
		}
		@Pc(175) int local175 = local113;
		if (local68 == 1) {
			local113 += local48;
		}
		@Pc(184) int local184 = local113;
		if (local76 == 1) {
			local113 += local44;
		}
		@Pc(193) int local193 = local113;
		if (local64 == 1) {
			local113 += local48;
		}
		@Pc(202) int local202 = local113;
		local113 += local92;
		@Pc(208) int local208 = local113;
		if (local72 == 1) {
			local113 += local48 * 2;
		}
		@Pc(219) int local219 = local113;
		local113 += local96;
		@Pc(225) int local225 = local113;
		local113 += local48 * 2;
		@Pc(233) int local233 = local113;
		local113 += local80;
		@Pc(239) int local239 = local113;
		local113 += local84;
		@Pc(245) int local245 = local113;
		local113 += local88;
		@Pc(251) int local251 = local113;
		local113 += local98 * 6;
		@Pc(259) int local259 = local113;
		local113 += local100 * 6;
		@Pc(267) int local267 = local113;
		local113 += local100 * 6;
		@Pc(275) int local275 = local113;
		local113 += local100;
		@Pc(281) int local281 = local113;
		local113 += local100;
		@Pc(287) int local287 = local113;
		local113 += local100 + local102 * 2;
		this.anInt3816 = local44;
		this.anInt3817 = local48;
		this.anInt3815 = local52;
		this.anIntArray322 = new int[local44];
		this.anIntArray330 = new int[local44];
		this.anIntArray327 = new int[local44];
		this.anIntArray319 = new int[local48];
		this.anIntArray320 = new int[local48];
		this.anIntArray323 = new int[local48];
		if (local76 == 1) {
			this.anIntArray324 = new int[local44];
		}
		if (local56 == 1) {
			this.aByteArray47 = new byte[local48];
		}
		if (local60 == 255) {
			this.aByteArray40 = new byte[local48];
		} else {
			this.aByte7 = (byte) local60;
		}
		if (local64 == 1) {
			this.aByteArray42 = new byte[local48];
		}
		if (local68 == 1) {
			this.anIntArray329 = new int[local48];
		}
		if (local72 == 1) {
			this.aShortArray48 = new short[local48];
		}
		if (local72 == 1 && local52 > 0) {
			this.aByteArray44 = new byte[local48];
		}
		this.aShortArray43 = new short[local48];
		if (local52 > 0) {
			this.aShortArray45 = new short[local52];
			this.aShortArray47 = new short[local52];
			this.aShortArray46 = new short[local52];
			if (local100 > 0) {
				this.aShortArray44 = new short[local100];
				this.aShortArray42 = new short[local100];
				this.aShortArray49 = new short[local100];
				this.aByteArray45 = new byte[local100];
				this.aByteArray49 = new byte[local100];
				this.aByteArray46 = new byte[local100];
			}
			if (local102 > 0) {
				this.aByteArray43 = new byte[local102];
				this.aByteArray41 = new byte[local102];
			}
		}
		local4.anInt3592 = local52;
		local9.anInt3592 = local233;
		local14.anInt3592 = local239;
		local19.anInt3592 = local245;
		local24.anInt3592 = local184;
		@Pc(457) int local457 = 0;
		@Pc(459) int local459 = 0;
		@Pc(461) int local461 = 0;
		@Pc(468) int local468;
		@Pc(470) int local470;
		@Pc(480) int local480;
		@Pc(490) int local490;
		for (@Pc(463) int local463 = 0; local463 < local44; local463++) {
			local468 = local4.method2771();
			local470 = 0;
			if ((local468 & 0x1) != 0) {
				local470 = local9.method2759();
			}
			local480 = 0;
			if ((local468 & 0x2) != 0) {
				local480 = local14.method2759();
			}
			local490 = 0;
			if ((local468 & 0x4) != 0) {
				local490 = local19.method2759();
			}
			this.anIntArray322[local463] = local457 + local470;
			this.anIntArray330[local463] = local459 + local480;
			this.anIntArray327[local463] = local461 + local490;
			local457 = this.anIntArray322[local463];
			local459 = this.anIntArray330[local463];
			local461 = this.anIntArray327[local463];
			if (local76 == 1) {
				this.anIntArray324[local463] = local24.method2771();
			}
		}
		local4.anInt3592 = local225;
		local9.anInt3592 = local151;
		local14.anInt3592 = local166;
		local19.anInt3592 = local193;
		local24.anInt3592 = local175;
		local29.anInt3592 = local208;
		local34.anInt3592 = local219;
		for (local468 = 0; local468 < local48; local468++) {
			this.aShortArray43[local468] = (short) local4.method2765();
			if (local56 == 1) {
				this.aByteArray47[local468] = local9.method2770();
			}
			if (local60 == 255) {
				this.aByteArray40[local468] = local14.method2770();
			}
			if (local64 == 1) {
				this.aByteArray42[local468] = local19.method2770();
			}
			if (local68 == 1) {
				this.anIntArray329[local468] = local24.method2771();
			}
			if (local72 == 1) {
				this.aShortArray48[local468] = (short) (local29.method2765() - 1);
			}
			if (this.aByteArray44 != null) {
				if (this.aShortArray48[local468] == -1) {
					this.aByteArray44[local468] = -1;
				} else {
					this.aByteArray44[local468] = (byte) (local34.method2771() - 1);
				}
			}
		}
		local4.anInt3592 = local202;
		local9.anInt3592 = local160;
		local470 = 0;
		local480 = 0;
		local490 = 0;
		@Pc(676) int local676 = 0;
		@Pc(683) int local683;
		@Pc(786) int local786;
		for (@Pc(678) int local678 = 0; local678 < local48; local678++) {
			local683 = local9.method2771();
			if (local683 == 1) {
				local470 = local4.method2759() + local676;
				local480 = local4.method2759() + local470;
				local490 = local4.method2759() + local480;
				local676 = local490;
				this.anIntArray319[local678] = local470;
				this.anIntArray320[local678] = local480;
				this.anIntArray323[local678] = local490;
			}
			if (local683 == 2) {
				local480 = local490;
				local490 = local4.method2759() + local676;
				local676 = local490;
				this.anIntArray319[local678] = local470;
				this.anIntArray320[local678] = local480;
				this.anIntArray323[local678] = local490;
			}
			if (local683 == 3) {
				local470 = local490;
				local490 = local4.method2759() + local676;
				local676 = local490;
				this.anIntArray319[local678] = local470;
				this.anIntArray320[local678] = local480;
				this.anIntArray323[local678] = local490;
			}
			if (local683 == 4) {
				local786 = local470;
				local470 = local480;
				local480 = local786;
				local490 = local4.method2759() + local676;
				local676 = local490;
				this.anIntArray319[local678] = local470;
				this.anIntArray320[local678] = local786;
				this.anIntArray323[local678] = local490;
			}
		}
		local4.anInt3592 = local251;
		local9.anInt3592 = local259;
		local14.anInt3592 = local267;
		local19.anInt3592 = local275;
		local24.anInt3592 = local281;
		local29.anInt3592 = local287;
		for (local683 = 0; local683 < local52; local683++) {
			local786 = this.aByteArray48[local683] & 0xFF;
			if (local786 == 0) {
				this.aShortArray45[local683] = (short) local4.method2765();
				this.aShortArray47[local683] = (short) local4.method2765();
				this.aShortArray46[local683] = (short) local4.method2765();
			}
			if (local786 == 1) {
				this.aShortArray45[local683] = (short) local9.method2765();
				this.aShortArray47[local683] = (short) local9.method2765();
				this.aShortArray46[local683] = (short) local9.method2765();
				this.aShortArray44[local683] = (short) local14.method2765();
				this.aShortArray42[local683] = (short) local14.method2765();
				this.aShortArray49[local683] = (short) local14.method2765();
				this.aByteArray45[local683] = local19.method2770();
				this.aByteArray49[local683] = local24.method2770();
				this.aByteArray46[local683] = local29.method2770();
			}
			if (local786 == 2) {
				this.aShortArray45[local683] = (short) local9.method2765();
				this.aShortArray47[local683] = (short) local9.method2765();
				this.aShortArray46[local683] = (short) local9.method2765();
				this.aShortArray44[local683] = (short) local14.method2765();
				this.aShortArray42[local683] = (short) local14.method2765();
				this.aShortArray49[local683] = (short) local14.method2765();
				this.aByteArray45[local683] = local19.method2770();
				this.aByteArray49[local683] = local24.method2770();
				this.aByteArray46[local683] = local29.method2770();
				this.aByteArray43[local683] = local29.method2770();
				this.aByteArray41[local683] = local29.method2770();
			}
			if (local786 == 3) {
				this.aShortArray45[local683] = (short) local9.method2765();
				this.aShortArray47[local683] = (short) local9.method2765();
				this.aShortArray46[local683] = (short) local9.method2765();
				this.aShortArray44[local683] = (short) local14.method2765();
				this.aShortArray42[local683] = (short) local14.method2765();
				this.aShortArray49[local683] = (short) local14.method2765();
				this.aByteArray45[local683] = local19.method2770();
				this.aByteArray49[local683] = local24.method2770();
				this.aByteArray46[local683] = local29.method2770();
			}
		}
		local4.anInt3592 = local113;
		local786 = local4.method2771();
		if (local786 != 0) {
			local4.method2765();
			local4.method2765();
			local4.method2765();
			local4.method2793();
		}
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "()V")
	public void method2938() {
		this.anIntArray324 = null;
		this.anIntArray329 = null;
		this.anIntArrayArray31 = null;
		this.anIntArrayArray32 = null;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(III)Lclient!wd;")
	@Override
	public Class5 method3161() {
		return this.method2942(this.aShort17, this.aShort13, -50, -10, -50);
	}

	@OriginalMember(owner = "client!se", name = "e", descriptor = "()V")
	public void method2939() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3816; local1++) {
			@Pc(7) int local7 = this.anIntArray322[local1];
			this.anIntArray322[local1] = this.anIntArray327[local1];
			this.anIntArray327[local1] = -local7;
		}
		this.method2945();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!wd;IIIZ)V")
	@Override
	public void method3165(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class5_Sub6 local2 = (Class5_Sub6) arg0;
		local2.method2940();
		local2.method2944();
		Static171.anInt3818++;
		@Pc(12) int local12 = 0;
		@Pc(15) int[] local15 = local2.anIntArray322;
		@Pc(18) int local18 = local2.anInt3816;
		@Pc(36) int local36;
		for (@Pc(20) int local20 = 0; local20 < this.anInt3816; local20++) {
			@Pc(26) Class38 local26 = this.aClass38Array2[local20];
			if (local26.anInt1691 != 0) {
				local36 = this.anIntArray330[local20] - arg2;
				if (local36 >= local2.aShort15 && local36 <= local2.aShort14) {
					@Pc(52) int local52 = this.anIntArray322[local20] - arg1;
					if (local52 >= local2.aShort11 && local52 <= local2.aShort18) {
						@Pc(68) int local68 = this.anIntArray327[local20] - arg3;
						if (local68 >= local2.aShort12 && local68 <= local2.aShort16) {
							for (@Pc(79) int local79 = 0; local79 < local18; local79++) {
								@Pc(85) Class38 local85 = local2.aClass38Array2[local79];
								if (local52 == local15[local79] && local68 == local2.anIntArray327[local79] && local36 == local2.anIntArray330[local79] && local85.anInt1691 != 0) {
									if (this.aClass38Array1 == null) {
										this.aClass38Array1 = new Class38[this.anInt3816];
									}
									if (local2.aClass38Array1 == null) {
										local2.aClass38Array1 = new Class38[local18];
									}
									@Pc(125) Class38 local125 = this.aClass38Array1[local20];
									if (local125 == null) {
										local125 = this.aClass38Array1[local20] = new Class38(local26);
									}
									@Pc(142) Class38 local142 = local2.aClass38Array1[local79];
									if (local142 == null) {
										local142 = local2.aClass38Array1[local79] = new Class38(local85);
									}
									local125.anInt1688 += local85.anInt1688;
									local125.anInt1689 += local85.anInt1689;
									local125.anInt1690 += local85.anInt1690;
									local125.anInt1691 += local85.anInt1691;
									local142.anInt1688 += local26.anInt1688;
									local142.anInt1689 += local26.anInt1689;
									local142.anInt1690 += local26.anInt1690;
									local142.anInt1691 += local26.anInt1691;
									local12++;
									Static171.anIntArray321[local20] = Static171.anInt3818;
									Static171.anIntArray326[local79] = Static171.anInt3818;
								}
							}
						}
					}
				}
			}
		}
		if (local12 < 3 || !arg4) {
			return;
		}
		for (@Pc(236) int local236 = 0; local236 < this.anInt3817; local236++) {
			if (Static171.anIntArray321[this.anIntArray319[local236]] == Static171.anInt3818 && Static171.anIntArray321[this.anIntArray320[local236]] == Static171.anInt3818 && Static171.anIntArray321[this.anIntArray323[local236]] == Static171.anInt3818) {
				if (this.aByteArray47 == null) {
					this.aByteArray47 = new byte[this.anInt3817];
				}
				this.aByteArray47[local236] = 2;
			}
		}
		for (local36 = 0; local36 < local2.anInt3817; local36++) {
			if (Static171.anIntArray326[local2.anIntArray319[local36]] == Static171.anInt3818 && Static171.anIntArray326[local2.anIntArray320[local36]] == Static171.anInt3818 && Static171.anIntArray326[local2.anIntArray323[local36]] == Static171.anInt3818) {
				if (local2.aByteArray47 == null) {
					local2.aByteArray47 = new byte[local2.anInt3817];
				}
				local2.aByteArray47[local36] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "f", descriptor = "()V")
	private void method2940() {
		if (this.aBoolean174) {
			return;
		}
		this.aBoolean174 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt3816; local20++) {
			@Pc(26) int local26 = this.anIntArray322[local20];
			@Pc(31) int local31 = this.anIntArray330[local20];
			@Pc(36) int local36 = this.anIntArray327[local20];
			if (local26 < local8) {
				local8 = local26;
			}
			if (local26 > local14) {
				local14 = local26;
			}
			if (local31 < local10) {
				local10 = local31;
			}
			if (local31 > local16) {
				local16 = local31;
			}
			if (local36 < local12) {
				local12 = local36;
			}
			if (local36 > local18) {
				local18 = local36;
			}
		}
		this.aShort11 = (short) local8;
		this.aShort18 = (short) local14;
		this.aShort15 = (short) local10;
		this.aShort14 = (short) local16;
		this.aShort12 = (short) local12;
		this.aShort16 = (short) local18;
	}

	@OriginalMember(owner = "client!se", name = "g", descriptor = "()Lclient!se;")
	public Class5_Sub6 method2941() {
		@Pc(3) Class5_Sub6 local3 = new Class5_Sub6();
		if (this.aByteArray47 != null) {
			local3.aByteArray47 = new byte[this.anInt3817];
			for (@Pc(13) int local13 = 0; local13 < this.anInt3817; local13++) {
				local3.aByteArray47[local13] = this.aByteArray47[local13];
			}
		}
		local3.anInt3816 = this.anInt3816;
		local3.anInt3817 = this.anInt3817;
		local3.anInt3815 = this.anInt3815;
		local3.anIntArray322 = this.anIntArray322;
		local3.anIntArray330 = this.anIntArray330;
		local3.anIntArray327 = this.anIntArray327;
		local3.anIntArray319 = this.anIntArray319;
		local3.anIntArray320 = this.anIntArray320;
		local3.anIntArray323 = this.anIntArray323;
		local3.aByteArray40 = this.aByteArray40;
		local3.aByteArray42 = this.aByteArray42;
		local3.aByteArray44 = this.aByteArray44;
		local3.aShortArray43 = this.aShortArray43;
		local3.aShortArray48 = this.aShortArray48;
		local3.aByte7 = this.aByte7;
		local3.aByteArray48 = this.aByteArray48;
		local3.aShortArray45 = this.aShortArray45;
		local3.aShortArray47 = this.aShortArray47;
		local3.aShortArray46 = this.aShortArray46;
		local3.aShortArray44 = this.aShortArray44;
		local3.aShortArray42 = this.aShortArray42;
		local3.aShortArray49 = this.aShortArray49;
		local3.aByteArray45 = this.aByteArray45;
		local3.aByteArray49 = this.aByteArray49;
		local3.aByteArray46 = this.aByteArray46;
		local3.aByteArray43 = this.aByteArray43;
		local3.aByteArray41 = this.aByteArray41;
		local3.anIntArray324 = this.anIntArray324;
		local3.anIntArray329 = this.anIntArray329;
		local3.anIntArrayArray31 = this.anIntArrayArray31;
		local3.anIntArrayArray32 = this.anIntArrayArray32;
		local3.aClass38Array2 = this.aClass38Array2;
		local3.aClass35Array1 = this.aClass35Array1;
		local3.aShort17 = this.aShort17;
		local3.aShort13 = this.aShort13;
		return local3;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIII)Lclient!lg;")
	public Class5_Sub1 method2942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class5_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
	public void method2943() {
		@Pc(3) int local3 = Static171.anIntArray325[256];
		@Pc(7) int local7 = Static171.anIntArray328[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3816; local9++) {
			@Pc(26) int local26 = this.anIntArray327[local9] * local3 + this.anIntArray322[local9] * local7 >> 16;
			this.anIntArray327[local9] = this.anIntArray327[local9] * local7 - this.anIntArray322[local9] * local3 >> 16;
			this.anIntArray322[local9] = local26;
		}
		this.method2945();
	}

	@OriginalMember(owner = "client!se", name = "h", descriptor = "()V")
	public void method2944() {
		if (this.aClass38Array2 != null) {
			return;
		}
		this.aClass38Array2 = new Class38[this.anInt3816];
		for (@Pc(10) int local10 = 0; local10 < this.anInt3816; local10++) {
			this.aClass38Array2[local10] = new Class38();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt3817; local25++) {
			@Pc(31) int local31 = this.anIntArray319[local25];
			@Pc(36) int local36 = this.anIntArray320[local25];
			@Pc(41) int local41 = this.anIntArray323[local25];
			@Pc(51) int local51 = this.anIntArray322[local36] - this.anIntArray322[local31];
			@Pc(61) int local61 = this.anIntArray330[local36] - this.anIntArray330[local31];
			@Pc(71) int local71 = this.anIntArray327[local36] - this.anIntArray327[local31];
			@Pc(81) int local81 = this.anIntArray322[local41] - this.anIntArray322[local31];
			@Pc(91) int local91 = this.anIntArray330[local41] - this.anIntArray330[local31];
			@Pc(101) int local101 = this.anIntArray327[local41] - this.anIntArray327[local31];
			@Pc(109) int local109 = local61 * local101 - local91 * local71;
			@Pc(117) int local117 = local71 * local81 - local101 * local51;
			@Pc(125) int local125;
			for (local125 = local51 * local91 - local81 * local61; local109 > 8192 || local117 > 8192 || local125 > 8192 || local109 < -8192 || local117 < -8192 || local125 < -8192; local125 >>= 0x1) {
				local109 >>= 0x1;
				local117 >>= 0x1;
			}
			@Pc(171) int local171 = (int) Math.sqrt((double) (local109 * local109 + local117 * local117 + local125 * local125));
			if (local171 <= 0) {
				local171 = 1;
			}
			local109 = local109 * 256 / local171;
			local117 = local117 * 256 / local171;
			local125 = local125 * 256 / local171;
			@Pc(198) byte local198;
			if (this.aByteArray47 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray47[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class38 local211 = this.aClass38Array2[local31];
				local211.anInt1688 += local109;
				local211.anInt1689 += local117;
				local211.anInt1690 += local125;
				local211.anInt1691++;
				@Pc(240) Class38 local240 = this.aClass38Array2[local36];
				local240.anInt1688 += local109;
				local240.anInt1689 += local117;
				local240.anInt1690 += local125;
				local240.anInt1691++;
				@Pc(269) Class38 local269 = this.aClass38Array2[local41];
				local269.anInt1688 += local109;
				local269.anInt1689 += local117;
				local269.anInt1690 += local125;
				local269.anInt1691++;
			} else if (local198 == 1) {
				if (this.aClass35Array1 == null) {
					this.aClass35Array1 = new Class35[this.anInt3817];
				}
				@Pc(314) Class35 local314 = this.aClass35Array1[local25] = new Class35();
				local314.anInt1659 = local109;
				local314.anInt1658 = local117;
				local314.anInt1652 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "i", descriptor = "()V")
	private void method2945() {
		this.aClass38Array2 = null;
		this.aClass38Array1 = null;
		this.aClass35Array1 = null;
		this.aBoolean174 = false;
	}

	@OriginalMember(owner = "client!se", name = "j", descriptor = "()V")
	public void method2946() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3816; local1++) {
			this.anIntArray322[local1] = -this.anIntArray322[local1];
			this.anIntArray327[local1] = -this.anIntArray327[local1];
		}
		this.method2945();
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(III)V")
	public void method2947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3816; local1++) {
			this.anIntArray322[local1] = this.anIntArray322[local1] * arg0 / 128;
			this.anIntArray330[local1] = this.anIntArray330[local1] * arg1 / 128;
			this.anIntArray327[local1] = this.anIntArray327[local1] * arg2 / 128;
		}
		this.method2945();
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(IIIII)Lclient!ae;")
	public Class5_Sub1_Sub1 method2948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class5_Sub1_Sub1(this, arg0, arg1, -50, -10, -50);
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(III)V")
	public void method2950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3816; local1++) {
			this.anIntArray322[local1] += arg0;
			this.anIntArray330[local1] += arg1;
			this.anIntArray327[local1] += arg2;
		}
		this.method2945();
	}

	@OriginalMember(owner = "client!se", name = "l", descriptor = "()V")
	public void method2951() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3816; local1++) {
			this.anIntArray327[local1] = -this.anIntArray327[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt3817; local18++) {
			@Pc(24) int local24 = this.anIntArray319[local18];
			this.anIntArray319[local18] = this.anIntArray323[local18];
			this.anIntArray323[local18] = local24;
		}
		this.method2945();
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "([B)V")
	private void method2952(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class1_Sub7 local8 = new Class1_Sub7(arg0);
		@Pc(13) Class1_Sub7 local13 = new Class1_Sub7(arg0);
		@Pc(18) Class1_Sub7 local18 = new Class1_Sub7(arg0);
		@Pc(23) Class1_Sub7 local23 = new Class1_Sub7(arg0);
		@Pc(28) Class1_Sub7 local28 = new Class1_Sub7(arg0);
		local8.anInt3592 = arg0.length - 18;
		@Pc(38) int local38 = local8.method2765();
		@Pc(42) int local42 = local8.method2765();
		@Pc(46) int local46 = local8.method2771();
		@Pc(50) int local50 = local8.method2771();
		@Pc(54) int local54 = local8.method2771();
		@Pc(58) int local58 = local8.method2771();
		@Pc(62) int local62 = local8.method2771();
		@Pc(66) int local66 = local8.method2771();
		@Pc(70) int local70 = local8.method2765();
		@Pc(74) int local74 = local8.method2765();
		@Pc(78) int local78 = local8.method2765();
		@Pc(82) int local82 = local8.method2765();
		@Pc(90) int local90 = local38;
		@Pc(92) int local92 = local90;
		local90 += local42;
		@Pc(98) int local98 = local90;
		if (local54 == 255) {
			local90 += local42;
		}
		@Pc(107) int local107 = local90;
		if (local62 == 1) {
			local90 += local42;
		}
		@Pc(116) int local116 = local90;
		if (local50 == 1) {
			local90 += local42;
		}
		@Pc(125) int local125 = local90;
		if (local66 == 1) {
			local90 += local38;
		}
		@Pc(134) int local134 = local90;
		if (local58 == 1) {
			local90 += local42;
		}
		@Pc(143) int local143 = local90;
		local90 += local82;
		@Pc(149) int local149 = local90;
		local90 += local42 * 2;
		@Pc(157) int local157 = local90;
		local90 += local46 * 6;
		@Pc(165) int local165 = local90;
		local90 += local70;
		@Pc(171) int local171 = local90;
		local90 += local74;
		this.anInt3816 = local38;
		this.anInt3817 = local42;
		this.anInt3815 = local46;
		this.anIntArray322 = new int[local38];
		this.anIntArray330 = new int[local38];
		this.anIntArray327 = new int[local38];
		this.anIntArray319 = new int[local42];
		this.anIntArray320 = new int[local42];
		this.anIntArray323 = new int[local42];
		if (local46 > 0) {
			this.aByteArray48 = new byte[local46];
			this.aShortArray45 = new short[local46];
			this.aShortArray47 = new short[local46];
			this.aShortArray46 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray324 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray47 = new byte[local42];
			this.aByteArray44 = new byte[local42];
			this.aShortArray48 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray40 = new byte[local42];
		} else {
			this.aByte7 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray42 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray329 = new int[local42];
		}
		this.aShortArray43 = new short[local42];
		local8.anInt3592 = 0;
		local13.anInt3592 = local165;
		local18.anInt3592 = local171;
		local23.anInt3592 = local90;
		local28.anInt3592 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(312) int local312;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(334) int local334;
		for (@Pc(307) int local307 = 0; local307 < local38; local307++) {
			local312 = local8.method2771();
			local314 = 0;
			if ((local312 & 0x1) != 0) {
				local314 = local13.method2759();
			}
			local324 = 0;
			if ((local312 & 0x2) != 0) {
				local324 = local18.method2759();
			}
			local334 = 0;
			if ((local312 & 0x4) != 0) {
				local334 = local23.method2759();
			}
			this.anIntArray322[local307] = local301 + local314;
			this.anIntArray330[local307] = local303 + local324;
			this.anIntArray327[local307] = local305 + local334;
			local301 = this.anIntArray322[local307];
			local303 = this.anIntArray330[local307];
			local305 = this.anIntArray327[local307];
			if (local66 == 1) {
				this.anIntArray324[local307] = local28.method2771();
			}
		}
		local8.anInt3592 = local149;
		local13.anInt3592 = local116;
		local18.anInt3592 = local98;
		local23.anInt3592 = local134;
		local28.anInt3592 = local107;
		for (local312 = 0; local312 < local42; local312++) {
			this.aShortArray43[local312] = (short) local8.method2765();
			if (local50 == 1) {
				local314 = local13.method2771();
				if ((local314 & 0x1) == 1) {
					this.aByteArray47[local312] = 1;
					local1 = true;
				} else {
					this.aByteArray47[local312] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray44[local312] = (byte) (local314 >> 2);
					this.aShortArray48[local312] = this.aShortArray43[local312];
					this.aShortArray43[local312] = 127;
					if (this.aShortArray48[local312] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray44[local312] = -1;
					this.aShortArray48[local312] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray40[local312] = local18.method2770();
			}
			if (local58 == 1) {
				this.aByteArray42[local312] = local23.method2770();
			}
			if (local62 == 1) {
				this.anIntArray329[local312] = local28.method2771();
			}
		}
		local8.anInt3592 = local143;
		local13.anInt3592 = local92;
		local314 = 0;
		local324 = 0;
		local334 = 0;
		@Pc(536) int local536 = 0;
		@Pc(543) int local543;
		for (@Pc(538) int local538 = 0; local538 < local42; local538++) {
			local543 = local13.method2771();
			if (local543 == 1) {
				local314 = local8.method2759() + local536;
				local324 = local8.method2759() + local314;
				local334 = local8.method2759() + local324;
				local536 = local334;
				this.anIntArray319[local538] = local314;
				this.anIntArray320[local538] = local324;
				this.anIntArray323[local538] = local334;
			}
			if (local543 == 2) {
				local324 = local334;
				local334 = local8.method2759() + local536;
				local536 = local334;
				this.anIntArray319[local538] = local314;
				this.anIntArray320[local538] = local324;
				this.anIntArray323[local538] = local334;
			}
			if (local543 == 3) {
				local314 = local334;
				local334 = local8.method2759() + local536;
				local536 = local334;
				this.anIntArray319[local538] = local314;
				this.anIntArray320[local538] = local324;
				this.anIntArray323[local538] = local334;
			}
			if (local543 == 4) {
				@Pc(646) int local646 = local314;
				local314 = local324;
				local324 = local646;
				local334 = local8.method2759() + local536;
				local536 = local334;
				this.anIntArray319[local538] = local314;
				this.anIntArray320[local538] = local646;
				this.anIntArray323[local538] = local334;
			}
		}
		local8.anInt3592 = local157;
		for (local543 = 0; local543 < local46; local543++) {
			this.aByteArray48[local543] = 0;
			this.aShortArray45[local543] = (short) local8.method2765();
			this.aShortArray47[local543] = (short) local8.method2765();
			this.aShortArray46[local543] = (short) local8.method2765();
		}
		if (this.aByteArray44 != null) {
			@Pc(721) boolean local721 = false;
			for (@Pc(723) int local723 = 0; local723 < local42; local723++) {
				@Pc(731) int local731 = this.aByteArray44[local723] & 0xFF;
				if (local731 != 255) {
					if ((this.aShortArray45[local731] & 0xFFFF) == this.anIntArray319[local723] && (this.aShortArray47[local731] & 0xFFFF) == this.anIntArray320[local723] && (this.aShortArray46[local731] & 0xFFFF) == this.anIntArray323[local723]) {
						this.aByteArray44[local723] = -1;
					} else {
						local721 = true;
					}
				}
			}
			if (!local721) {
				this.aByteArray44 = null;
			}
		}
		if (!local3) {
			this.aShortArray48 = null;
		}
		if (!local1) {
			this.aByteArray47 = null;
		}
	}

	@OriginalMember(owner = "client!se", name = "m", descriptor = "()V")
	public void method2953() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray324 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt3816; local9++) {
				local15 = this.anIntArray324[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray31 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray31[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt3816) {
				local65 = this.anIntArray324[local59];
				this.anIntArrayArray31[local65][local5[local65]++] = local59++;
			}
			this.anIntArray324 = null;
		}
		if (this.anIntArray329 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt3817; local9++) {
			local15 = this.anIntArray329[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray32 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray32[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt3817) {
			local65 = this.anIntArray329[local59];
			this.anIntArrayArray32[local65][local5[local65]++] = local59++;
		}
		this.anIntArray329 = null;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "()Z")
	@Override
	public boolean method3166() {
		return true;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "([[IIIIZIZ)Lclient!se;")
	public Class5_Sub6 method2954(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method2940();
		@Pc(6) int local6 = arg1 + this.aShort11;
		@Pc(11) int local11 = arg1 + this.aShort18;
		@Pc(16) int local16 = arg3 + this.aShort12;
		@Pc(21) int local21 = arg3 + this.aShort16;
		if (local6 < 0 || local11 + 128 >> 7 >= arg0.length || local16 < 0 || local21 + 128 >> 7 >= arg0[0].length) {
			return this;
		}
		local6 >>= 0x7;
		local11 = local11 + 127 >> 7;
		local16 >>= 0x7;
		local21 = local21 + 127 >> 7;
		if (arg0[local6][local16] == arg2 && arg0[local11][local16] == arg2 && arg0[local6][local21] == arg2 && arg0[local11][local21] == arg2) {
			return this;
		}
		@Pc(101) Class5_Sub6 local101 = new Class5_Sub6();
		local101.anInt3816 = this.anInt3816;
		local101.anInt3817 = this.anInt3817;
		local101.anInt3815 = this.anInt3815;
		local101.anIntArray322 = this.anIntArray322;
		local101.anIntArray327 = this.anIntArray327;
		local101.anIntArray319 = this.anIntArray319;
		local101.anIntArray320 = this.anIntArray320;
		local101.anIntArray323 = this.anIntArray323;
		local101.aByteArray47 = this.aByteArray47;
		local101.aByteArray40 = this.aByteArray40;
		local101.aByteArray42 = this.aByteArray42;
		local101.aByteArray44 = this.aByteArray44;
		local101.aShortArray43 = this.aShortArray43;
		local101.aShortArray48 = this.aShortArray48;
		local101.aByte7 = this.aByte7;
		local101.aByteArray48 = this.aByteArray48;
		local101.aShortArray45 = this.aShortArray45;
		local101.aShortArray47 = this.aShortArray47;
		local101.aShortArray46 = this.aShortArray46;
		local101.aShortArray44 = this.aShortArray44;
		local101.aShortArray42 = this.aShortArray42;
		local101.aShortArray49 = this.aShortArray49;
		local101.aByteArray45 = this.aByteArray45;
		local101.aByteArray49 = this.aByteArray49;
		local101.aByteArray46 = this.aByteArray46;
		local101.aByteArray43 = this.aByteArray43;
		local101.aByteArray41 = this.aByteArray41;
		local101.anIntArray324 = this.anIntArray324;
		local101.anIntArray329 = this.anIntArray329;
		local101.anIntArrayArray31 = this.anIntArrayArray31;
		local101.anIntArrayArray32 = this.anIntArrayArray32;
		local101.aShort17 = this.aShort17;
		local101.aShort13 = this.aShort13;
		local101.aClass38Array2 = this.aClass38Array2;
		local101.aClass35Array1 = this.aClass35Array1;
		local101.aClass38Array1 = this.aClass38Array1;
		local101.anIntArray330 = new int[local101.anInt3816];
		@Pc(257) int local257;
		@Pc(265) int local265;
		@Pc(272) int local272;
		@Pc(276) int local276;
		@Pc(280) int local280;
		@Pc(284) int local284;
		@Pc(288) int local288;
		@Pc(310) int local310;
		@Pc(336) int local336;
		@Pc(348) int local348;
		if (arg4 == 0) {
			for (local257 = 0; local257 < local101.anInt3816; local257++) {
				local265 = this.anIntArray322[local257] + arg1;
				local272 = this.anIntArray327[local257] + arg3;
				local276 = local265 & 0x7F;
				local280 = local272 & 0x7F;
				local284 = local265 >> 7;
				local288 = local272 >> 7;
				local310 = arg0[local284][local288] * (128 - local276) + arg0[local284 + 1][local288] * local276 >> 7;
				local336 = arg0[local284][local288 + 1] * (128 - local276) + arg0[local284 + 1][local288 + 1] * local276 >> 7;
				local348 = local310 * (128 - local280) + local336 * local280 >> 7;
				local101.anIntArray330[local257] = this.anIntArray330[local257] + local348 - arg2;
			}
		} else {
			for (local257 = 0; local257 < local101.anInt3816; local257++) {
				local265 = (this.anIntArray330[local257] << 16) / this.aShort15;
				if (local265 < arg4) {
					local272 = this.anIntArray322[local257] + arg1;
					local276 = this.anIntArray327[local257] + arg3;
					local280 = local272 & 0x7F;
					local284 = local276 & 0x7F;
					local288 = local272 >> 7;
					local310 = local276 >> 7;
					local336 = arg0[local288][local310] * (128 - local280) + arg0[local288 + 1][local310] * local280 >> 7;
					local348 = arg0[local288][local310 + 1] * (128 - local280) + arg0[local288 + 1][local310 + 1] * local280 >> 7;
					@Pc(472) int local472 = local336 * (128 - local284) + local348 * local284 >> 7;
					local101.anIntArray330[local257] = this.anIntArray330[local257] + (local472 - arg2) * (arg4 - local265) / arg4;
				} else {
					local101.anIntArray330[local257] = this.anIntArray330[local257];
				}
			}
		}
		this.aBoolean174 = false;
		return local101;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "()I")
	@Override
	public int method3163() {
		if (!this.aBoolean174) {
			this.method2940();
		}
		return this.aShort15;
	}
}
