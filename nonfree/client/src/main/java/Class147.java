import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class147 {

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "[B")
	public byte[] aByteArray45;

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "[I")
	public int[] anIntArray412;

	@OriginalMember(owner = "client!ko", name = "f", descriptor = "[S")
	public short[] aShortArray67;

	@OriginalMember(owner = "client!ko", name = "h", descriptor = "[I")
	public int[] anIntArray413;

	@OriginalMember(owner = "client!ko", name = "l", descriptor = "[S")
	public short[] aShortArray68;

	@OriginalMember(owner = "client!ko", name = "n", descriptor = "[B")
	public byte[] aByteArray46;

	@OriginalMember(owner = "client!ko", name = "u", descriptor = "[B")
	public byte[] aByteArray47;

	@OriginalMember(owner = "client!ko", name = "v", descriptor = "[S")
	public short[] aShortArray69;

	@OriginalMember(owner = "client!ko", name = "w", descriptor = "[S")
	public short[] aShortArray70;

	@OriginalMember(owner = "client!ko", name = "x", descriptor = "[I")
	public int[] anIntArray414;

	@OriginalMember(owner = "client!ko", name = "y", descriptor = "[S")
	public short[] aShortArray71;

	@OriginalMember(owner = "client!ko", name = "z", descriptor = "[B")
	public byte[] aByteArray48;

	@OriginalMember(owner = "client!ko", name = "B", descriptor = "[Lclient!hv;")
	public Class114[] aClass114Array3;

	@OriginalMember(owner = "client!ko", name = "C", descriptor = "[I")
	public int[] anIntArray415;

	@OriginalMember(owner = "client!ko", name = "D", descriptor = "[B")
	public byte[] aByteArray49;

	@OriginalMember(owner = "client!ko", name = "E", descriptor = "[B")
	public byte[] aByteArray50;

	@OriginalMember(owner = "client!ko", name = "F", descriptor = "[S")
	public short[] aShortArray72;

	@OriginalMember(owner = "client!ko", name = "H", descriptor = "[B")
	public byte[] aByteArray51;

	@OriginalMember(owner = "client!ko", name = "K", descriptor = "[S")
	public short[] aShortArray73;

	@OriginalMember(owner = "client!ko", name = "L", descriptor = "[I")
	public int[] anIntArray416;

	@OriginalMember(owner = "client!ko", name = "O", descriptor = "[I")
	public int[] anIntArray417;

	@OriginalMember(owner = "client!ko", name = "Q", descriptor = "[I")
	public int[] anIntArray418;

	@OriginalMember(owner = "client!ko", name = "R", descriptor = "[S")
	public short[] aShortArray74;

	@OriginalMember(owner = "client!ko", name = "S", descriptor = "[Lclient!gh;")
	public Class94[] aClass94Array3;

	@OriginalMember(owner = "client!ko", name = "T", descriptor = "[I")
	public int[] anIntArray419;

	@OriginalMember(owner = "client!ko", name = "V", descriptor = "[I")
	public int[] anIntArray420;

	@OriginalMember(owner = "client!ko", name = "W", descriptor = "[S")
	public short[] aShortArray75;

	@OriginalMember(owner = "client!ko", name = "X", descriptor = "[S")
	public short[] aShortArray76;

	@OriginalMember(owner = "client!ko", name = "Z", descriptor = "[I")
	public int[] anIntArray421;

	@OriginalMember(owner = "client!ko", name = "cb", descriptor = "[Lclient!t;")
	public Class237[] aClass237Array1;

	@OriginalMember(owner = "client!ko", name = "db", descriptor = "[I")
	public int[] anIntArray422;

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "B")
	public byte aByte50 = 0;

	@OriginalMember(owner = "client!ko", name = "G", descriptor = "I")
	public int anInt4361 = 0;

	@OriginalMember(owner = "client!ko", name = "M", descriptor = "I")
	public int anInt4364 = 0;

	@OriginalMember(owner = "client!ko", name = "s", descriptor = "I")
	public int anInt4358 = 12;

	@OriginalMember(owner = "client!ko", name = "U", descriptor = "I")
	public int anInt4367 = 0;

	@OriginalMember(owner = "client!ko", name = "I", descriptor = "I")
	public int anInt4362 = 0;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "([B)V")
	public Class147(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method3380(arg0);
		} else {
			this.method3375(arg0);
		}
	}

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(III)V")
	public Class147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShortArray71 = new short[arg1];
		if (arg2 > 0) {
			this.aByteArray51 = new byte[arg2];
			this.anIntArray414 = new int[arg2];
			this.aShortArray74 = new short[arg2];
			this.anIntArray413 = new int[arg2];
			this.aShortArray73 = new short[arg2];
			this.aByteArray49 = new byte[arg2];
			this.aByteArray50 = new byte[arg2];
			this.anIntArray417 = new int[arg2];
			this.aShortArray70 = new short[arg2];
			this.anIntArray412 = new int[arg2];
			this.anIntArray422 = new int[arg2];
			this.anIntArray419 = new int[arg2];
		}
		this.aByteArray45 = new byte[arg1];
		this.aShortArray75 = new short[arg1];
		this.aByteArray47 = new byte[arg1];
		this.anIntArray421 = new int[arg0];
		this.aByteArray46 = new byte[arg1];
		this.aShortArray69 = new short[arg1];
		this.aShortArray67 = new short[arg1];
		this.anIntArray416 = new int[arg0];
		this.aByteArray48 = new byte[arg1];
		this.anIntArray415 = new int[arg0];
		this.aShortArray72 = new short[arg1];
		this.anIntArray420 = new int[arg0];
		this.anIntArray418 = new int[arg1];
	}

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "([Lclient!ko;I)V")
	public Class147(@OriginalArg(0) Class147[] arg0, @OriginalArg(1) int arg1) {
		this.anInt4367 = 0;
		this.anInt4362 = 0;
		this.anInt4361 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) boolean local36 = false;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte50 = -1;
		for (@Pc(51) int local51 = 0; local51 < arg1; local51++) {
			@Pc(56) Class147 local56 = arg0[local51];
			if (local56 != null) {
				this.anInt4367 += local56.anInt4367;
				this.anInt4361 += local56.anInt4361;
				this.anInt4362 += local56.anInt4362;
				if (local56.aClass94Array3 != null) {
					local30 += local56.aClass94Array3.length;
				}
				if (local56.aClass237Array1 != null) {
					local34 += local56.aClass237Array1.length;
				}
				local36 |= local56.aByteArray46 != null;
				if (local56.aClass114Array3 != null) {
					local32 += local56.aClass114Array3.length;
				}
				if (local56.aByteArray48 == null) {
					if (this.aByte50 == -1) {
						this.aByte50 = local56.aByte50;
					}
					if (local56.aByte50 != this.aByte50) {
						local38 = true;
					}
				} else {
					local38 = true;
				}
				local42 |= local56.aByteArray45 != null;
				local40 |= local56.aByteArray47 != null;
				local44 |= local56.aShortArray69 != null;
				local46 |= local56.anIntArray418 != null;
			}
		}
		this.aShortArray71 = new short[this.anInt4367];
		if (this.anInt4361 > 0) {
			this.anIntArray422 = new int[this.anInt4361];
			this.aByteArray51 = new byte[this.anInt4361];
			this.anIntArray414 = new int[this.anInt4361];
			this.anIntArray413 = new int[this.anInt4361];
			this.anIntArray419 = new int[this.anInt4361];
			this.aShortArray70 = new short[this.anInt4361];
			this.aShortArray73 = new short[this.anInt4361];
			this.aShortArray74 = new short[this.anInt4361];
			this.anIntArray412 = new int[this.anInt4361];
			this.anIntArray417 = new int[this.anInt4361];
			this.aByteArray50 = new byte[this.anInt4361];
			this.aByteArray49 = new byte[this.anInt4361];
		}
		this.aShortArray68 = new short[this.anInt4367];
		if (local44) {
			this.aShortArray69 = new short[this.anInt4367];
		}
		this.aShortArray76 = new short[this.anInt4362];
		if (local32 > 0) {
			this.aClass114Array3 = new Class114[local32];
		}
		if (local34 > 0) {
			this.aClass237Array1 = new Class237[local34];
		}
		this.aShortArray67 = new short[this.anInt4367];
		if (local36) {
			this.aByteArray46 = new byte[this.anInt4367];
		}
		this.anIntArray420 = new int[this.anInt4362];
		this.anIntArray415 = new int[this.anInt4362];
		if (local42) {
			this.aByteArray45 = new byte[this.anInt4367];
		}
		if (local30 > 0) {
			this.aClass94Array3 = new Class94[local30];
		}
		if (local46) {
			this.anIntArray418 = new int[this.anInt4367];
		}
		this.aShortArray72 = new short[this.anInt4367];
		this.aShortArray75 = new short[this.anInt4367];
		this.anIntArray416 = new int[this.anInt4362];
		if (local38) {
			this.aByteArray48 = new byte[this.anInt4367];
		}
		if (local40) {
			this.aByteArray47 = new byte[this.anInt4367];
		}
		this.anIntArray421 = new int[this.anInt4362];
		local32 = 0;
		this.anInt4361 = 0;
		local34 = 0;
		this.anInt4367 = 0;
		this.anInt4362 = 0;
		local30 = 0;
		@Pc(601) int local601;
		@Pc(612) int local612;
		for (@Pc(376) int local376 = 0; local376 < arg1; local376++) {
			@Pc(382) short local382 = (short) (0x1 << local376);
			@Pc(386) Class147 local386 = arg0[local376];
			if (local386 != null) {
				@Pc(393) int local393;
				if (local386.aClass237Array1 != null) {
					for (local393 = 0; local393 < local386.aClass237Array1.length; local393++) {
						@Pc(399) Class237 local399 = local386.aClass237Array1[local393];
						this.aClass237Array1[local34++] = local399.method5246(local399.anInt6899 + this.anInt4367);
					}
				}
				for (local393 = 0; local393 < local386.anInt4367; local393++) {
					if (local36 && local386.aByteArray46 != null) {
						this.aByteArray46[this.anInt4367] = local386.aByteArray46[local393];
					}
					if (local38) {
						if (local386.aByteArray48 == null) {
							this.aByteArray48[this.anInt4367] = local386.aByte50;
						} else {
							this.aByteArray48[this.anInt4367] = local386.aByteArray48[local393];
						}
					}
					if (local40 && local386.aByteArray47 != null) {
						this.aByteArray47[this.anInt4367] = local386.aByteArray47[local393];
					}
					if (local44) {
						if (local386.aShortArray69 == null) {
							this.aShortArray69[this.anInt4367] = -1;
						} else {
							this.aShortArray69[this.anInt4367] = local386.aShortArray69[local393];
						}
					}
					if (local46) {
						if (local386.anIntArray418 == null) {
							this.anIntArray418[this.anInt4367] = -1;
						} else {
							this.anIntArray418[this.anInt4367] = local386.anIntArray418[local393];
						}
					}
					this.aShortArray71[this.anInt4367] = (short) this.method3376(local382, local386.aShortArray71[local393], local386);
					this.aShortArray75[this.anInt4367] = (short) this.method3376(local382, local386.aShortArray75[local393], local386);
					this.aShortArray72[this.anInt4367] = (short) this.method3376(local382, local386.aShortArray72[local393], local386);
					this.aShortArray68[this.anInt4367] = local382;
					this.aShortArray67[this.anInt4367] = local386.aShortArray67[local393];
					this.anInt4367++;
				}
				@Pc(589) int local589;
				if (local386.aClass94Array3 != null) {
					for (local589 = 0; local589 < local386.aClass94Array3.length; local589++) {
						local601 = this.method3376(local382, local386.aClass94Array3[local589].anInt2952, local386);
						local612 = this.method3376(local382, local386.aClass94Array3[local589].anInt2936, local386);
						@Pc(623) int local623 = this.method3376(local382, local386.aClass94Array3[local589].anInt2942, local386);
						this.aClass94Array3[local30] = local386.aClass94Array3[local589].method2162(local612, local623, local601);
						local30++;
					}
				}
				if (local386.aClass114Array3 != null) {
					for (local589 = 0; local589 < local386.aClass114Array3.length; local589++) {
						local601 = this.method3376(local382, local386.aClass114Array3[local589].anInt3455, local386);
						this.aClass114Array3[local32] = local386.aClass114Array3[local589].method2701(local601);
						local32++;
					}
				}
			}
		}
		@Pc(692) int local692 = 0;
		this.anInt4364 = this.anInt4362;
		for (@Pc(698) int local698 = 0; local698 < arg1; local698++) {
			@Pc(704) short local704 = (short) (0x1 << local698);
			@Pc(708) Class147 local708 = arg0[local698];
			if (local708 != null) {
				for (local601 = 0; local601 < local708.anInt4367; local601++) {
					if (local42) {
						this.aByteArray45[local692++] = (byte) (local708.aByteArray45 == null || local708.aByteArray45[local601] == -1 ? -1 : this.anInt4361 + local708.aByteArray45[local601]);
					}
				}
				for (local612 = 0; local612 < local708.anInt4361; local612++) {
					@Pc(759) byte local759 = this.aByteArray51[this.anInt4361] = local708.aByteArray51[local612];
					if (local759 == 0) {
						this.aShortArray74[this.anInt4361] = (short) this.method3376(local704, local708.aShortArray74[local612], local708);
						this.aShortArray73[this.anInt4361] = (short) this.method3376(local704, local708.aShortArray73[local612], local708);
						this.aShortArray70[this.anInt4361] = (short) this.method3376(local704, local708.aShortArray70[local612], local708);
					}
					if (local759 >= 1 && local759 <= 3) {
						this.aShortArray74[this.anInt4361] = local708.aShortArray74[local612];
						this.aShortArray73[this.anInt4361] = local708.aShortArray73[local612];
						this.aShortArray70[this.anInt4361] = local708.aShortArray70[local612];
						this.anIntArray419[this.anInt4361] = local708.anIntArray419[local612];
						this.anIntArray417[this.anInt4361] = local708.anIntArray417[local612];
						this.anIntArray413[this.anInt4361] = local708.anIntArray413[local612];
						this.aByteArray49[this.anInt4361] = local708.aByteArray49[local612];
						this.aByteArray50[this.anInt4361] = local708.aByteArray50[local612];
						this.anIntArray414[this.anInt4361] = local708.anIntArray414[local612];
					}
					if (local759 == 2) {
						this.anIntArray412[this.anInt4361] = local708.anIntArray412[local612];
						this.anIntArray422[this.anInt4361] = local708.anIntArray422[local612];
					}
					this.anInt4361++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIBI)V")
	public void method3368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4362; local1++) {
			this.anIntArray421[local1] += arg1;
			this.anIntArray415[local1] += arg2;
			this.anIntArray420[local1] += arg0;
		}
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)[[I")
	public int[][] method3370() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt4367; local12++) {
			@Pc(19) int local19 = this.anIntArray418[local12];
			if (local19 >= 0) {
				if (local19 > local10) {
					local10 = local19;
				}
				@Pc(37) int local37 = local8[local19]++;
			}
		}
		@Pc(50) int[][] local50 = new int[local10 + 1][];
		for (@Pc(52) int local52 = 0; local52 <= local10; local52++) {
			local50[local52] = new int[local8[local52]];
			local8[local52] = 0;
		}
		for (@Pc(75) int local75 = 0; local75 < this.anInt4367; local75++) {
			@Pc(82) int local82 = this.anIntArray418[local75];
			if (local82 >= 0) {
				local50[local82][local8[local82]++] = local75;
			}
		}
		return local50;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)[[I")
	public int[][] method3371() {
		@Pc(6) int[] local6 = new int[256];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < this.anInt4364; local10++) {
			@Pc(16) int local16 = this.anIntArray416[local10];
			if (local16 >= 0) {
				if (local16 > local8) {
					local8 = local16;
				}
				@Pc(30) int local30 = local6[local16]++;
			}
		}
		@Pc(47) int[][] local47 = new int[local8 + 1][];
		for (@Pc(49) int local49 = 0; local49 <= local8; local49++) {
			local47[local49] = new int[local6[local49]];
			local6[local49] = 0;
		}
		for (@Pc(71) int local71 = 0; local71 < this.anInt4364; local71++) {
			@Pc(77) int local77 = this.anIntArray416[local71];
			if (local77 >= 0) {
				local47[local77][local6[local77]++] = local71;
			}
		}
		return local47;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)V")
	public void method3372() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt4362; local15++) {
			this.anIntArray421[local15] <<= 0x0;
			this.anIntArray415[local15] <<= 0x0;
			this.anIntArray420[local15] <<= 0x0;
		}
		if (this.anInt4361 <= 0 || this.anIntArray419 == null) {
			return;
		}
		for (@Pc(53) int local53 = 0; local53 < this.anIntArray419.length; local53++) {
			this.anIntArray419[local53] <<= 0x0;
			this.anIntArray417[local53] <<= 0x0;
			if (this.aByteArray51[local53] != 1) {
				this.anIntArray413[local53] <<= 0x0;
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(I)[[I")
	public int[][] method3373() {
		@Pc(6) int[] local6 = new int[256];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < this.aClass237Array1.length; local10++) {
			@Pc(17) int local17 = this.aClass237Array1[local10].anInt6897;
			if (local17 >= 0) {
				@Pc(23) int local23 = local6[local17]++;
				if (local8 < local17) {
					local8 = local17;
				}
			}
		}
		@Pc(50) int[][] local50 = new int[local8 + 1][];
		for (@Pc(52) int local52 = 0; local52 <= local8; local52++) {
			local50[local52] = new int[local6[local52]];
			local6[local52] = 0;
		}
		for (@Pc(70) int local70 = 0; local70 < this.aClass237Array1.length; local70++) {
			@Pc(77) int local77 = this.aClass237Array1[local70].anInt6897;
			if (local77 >= 0) {
				local50[local77][local6[local77]++] = local70;
			}
		}
		return local50;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIII)I")
	public int method3374(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(5) int local5 = 0; local5 < this.anInt4362; local5++) {
			if (this.anIntArray421[local5] == arg0 && arg2 == this.anIntArray415[local5] && this.anIntArray420[local5] == arg1) {
				return local5;
			}
		}
		this.anIntArray421[this.anInt4362] = arg0;
		this.anIntArray415[this.anInt4362] = arg2;
		this.anIntArray420[this.anInt4362] = arg1;
		this.anInt4364 = this.anInt4362 + 1;
		return this.anInt4362++;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "([BI)V")
	private void method3375(@OriginalArg(0) byte[] arg0) {
		@Pc(5) boolean local5 = false;
		@Pc(7) boolean local7 = false;
		@Pc(16) Class1_Sub3 local16 = new Class1_Sub3(arg0);
		@Pc(21) Class1_Sub3 local21 = new Class1_Sub3(arg0);
		@Pc(26) Class1_Sub3 local26 = new Class1_Sub3(arg0);
		@Pc(31) Class1_Sub3 local31 = new Class1_Sub3(arg0);
		@Pc(36) Class1_Sub3 local36 = new Class1_Sub3(arg0);
		local16.anInt1710 = arg0.length - 18;
		this.anInt4362 = local16.method1177();
		this.anInt4367 = local16.method1177();
		this.anInt4361 = local16.method1171();
		@Pc(61) int local61 = local16.method1171();
		@Pc(65) int local65 = local16.method1171();
		@Pc(69) int local69 = local16.method1171();
		@Pc(73) int local73 = local16.method1171();
		@Pc(77) int local77 = local16.method1171();
		@Pc(81) int local81 = local16.method1177();
		@Pc(85) int local85 = local16.method1177();
		@Pc(89) int local89 = local16.method1177();
		@Pc(93) int local93 = local16.method1177();
		@Pc(102) int local102 = this.anInt4362;
		@Pc(104) int local104 = local102;
		local102 += this.anInt4367;
		@Pc(111) int local111 = local102;
		if (local65 == 255) {
			local102 += this.anInt4367;
		}
		@Pc(123) int local123 = local102;
		if (local73 == 1) {
			local102 += this.anInt4367;
		}
		@Pc(133) int local133 = local102;
		if (local61 == 1) {
			local102 += this.anInt4367;
		}
		@Pc(143) int local143 = local102;
		if (local77 == 1) {
			local102 += this.anInt4362;
		}
		@Pc(153) int local153 = local102;
		if (local69 == 1) {
			local102 += this.anInt4367;
		}
		@Pc(165) int local165 = local102;
		local102 += local93;
		@Pc(171) int local171 = local102;
		local102 += this.anInt4367 * 2;
		@Pc(180) int local180 = local102;
		local102 += this.anInt4361 * 6;
		@Pc(189) int local189 = local102;
		local102 += local81;
		@Pc(195) int local195 = local102;
		local102 += local85;
		this.anIntArray415 = new int[this.anInt4362];
		this.anIntArray421 = new int[this.anInt4362];
		if (local65 == 255) {
			this.aByteArray48 = new byte[this.anInt4367];
		} else {
			this.aByte50 = (byte) local65;
		}
		if (local77 == 1) {
			this.anIntArray416 = new int[this.anInt4362];
		}
		this.aShortArray71 = new short[this.anInt4367];
		this.aShortArray75 = new short[this.anInt4367];
		if (local61 == 1) {
			this.aByteArray45 = new byte[this.anInt4367];
			this.aShortArray69 = new short[this.anInt4367];
			this.aByteArray46 = new byte[this.anInt4367];
		}
		if (local73 == 1) {
			this.anIntArray418 = new int[this.anInt4367];
		}
		if (local69 == 1) {
			this.aByteArray47 = new byte[this.anInt4367];
		}
		this.aShortArray67 = new short[this.anInt4367];
		local16.anInt1710 = 0;
		if (this.anInt4361 > 0) {
			this.aShortArray70 = new short[this.anInt4361];
			this.aByteArray51 = new byte[this.anInt4361];
			this.aShortArray73 = new short[this.anInt4361];
			this.aShortArray74 = new short[this.anInt4361];
		}
		this.anIntArray420 = new int[this.anInt4362];
		this.aShortArray72 = new short[this.anInt4367];
		local21.anInt1710 = local189;
		local26.anInt1710 = local195;
		local31.anInt1710 = local102;
		local36.anInt1710 = local143;
		@Pc(344) int local344 = 0;
		@Pc(346) int local346 = 0;
		@Pc(348) int local348 = 0;
		@Pc(355) int local355;
		@Pc(357) int local357;
		for (@Pc(350) int local350 = 0; local350 < this.anInt4362; local350++) {
			local355 = local16.method1171();
			local357 = 0;
			if ((local355 & 0x1) != 0) {
				local357 = local21.method1182();
			}
			@Pc(367) int local367 = 0;
			if ((local355 & 0x2) != 0) {
				local367 = local26.method1182();
			}
			@Pc(380) int local380 = 0;
			if ((local355 & 0x4) != 0) {
				local380 = local31.method1182();
			}
			this.anIntArray421[local350] = local344 + local357;
			this.anIntArray415[local350] = local367 + local346;
			this.anIntArray420[local350] = local380 + local348;
			local348 = this.anIntArray420[local350];
			local346 = this.anIntArray415[local350];
			local344 = this.anIntArray421[local350];
			if (local77 == 1) {
				this.anIntArray416[local350] = local36.method1171();
			}
		}
		local16.anInt1710 = local171;
		local21.anInt1710 = local133;
		local26.anInt1710 = local111;
		local31.anInt1710 = local153;
		local36.anInt1710 = local123;
		for (local355 = 0; local355 < this.anInt4367; local355++) {
			this.aShortArray67[local355] = (short) local16.method1177();
			if (local61 == 1) {
				local357 = local21.method1171();
				if ((local357 & 0x1) == 1) {
					local5 = true;
					this.aByteArray46[local355] = 1;
				} else {
					this.aByteArray46[local355] = 0;
				}
				if ((local357 & 0x2) == 2) {
					this.aByteArray45[local355] = (byte) (local357 >> 2);
					this.aShortArray69[local355] = this.aShortArray67[local355];
					this.aShortArray67[local355] = 127;
					if (this.aShortArray69[local355] != -1) {
						local7 = true;
					}
				} else {
					this.aByteArray45[local355] = -1;
					this.aShortArray69[local355] = -1;
				}
			}
			if (local65 == 255) {
				this.aByteArray48[local355] = local26.method1212();
			}
			if (local69 == 1) {
				this.aByteArray47[local355] = local31.method1212();
			}
			if (local73 == 1) {
				this.anIntArray418[local355] = local36.method1171();
			}
		}
		this.anInt4364 = -1;
		local16.anInt1710 = local165;
		local21.anInt1710 = local104;
		@Pc(586) short local586 = 0;
		@Pc(588) short local588 = 0;
		@Pc(590) short local590 = 0;
		@Pc(592) short local592 = 0;
		@Pc(599) int local599;
		for (@Pc(594) int local594 = 0; local594 < this.anInt4367; local594++) {
			local599 = local21.method1171();
			if (local599 == 1) {
				local586 = (short) (local16.method1182() + local592);
				local588 = (short) (local586 + local16.method1182());
				local590 = (short) (local16.method1182() + local588);
				this.aShortArray71[local594] = local586;
				local592 = local590;
				this.aShortArray75[local594] = local588;
				this.aShortArray72[local594] = local590;
				if (this.anInt4364 < local586) {
					this.anInt4364 = local586;
				}
				if (this.anInt4364 < local588) {
					this.anInt4364 = local588;
				}
				if (local590 > this.anInt4364) {
					this.anInt4364 = local590;
				}
			}
			if (local599 == 2) {
				local588 = local590;
				local590 = (short) (local16.method1182() + local592);
				local592 = local590;
				this.aShortArray71[local594] = local586;
				this.aShortArray75[local594] = local588;
				this.aShortArray72[local594] = local590;
				if (this.anInt4364 < local590) {
					this.anInt4364 = local590;
				}
			}
			if (local599 == 3) {
				local586 = local590;
				local590 = (short) (local16.method1182() + local592);
				local592 = local590;
				this.aShortArray71[local594] = local586;
				this.aShortArray75[local594] = local588;
				this.aShortArray72[local594] = local590;
				if (local590 > this.anInt4364) {
					this.anInt4364 = local590;
				}
			}
			if (local599 == 4) {
				@Pc(756) short local756 = local586;
				local586 = local588;
				local590 = (short) (local592 + local16.method1182());
				local588 = local756;
				this.aShortArray71[local594] = local586;
				local592 = local590;
				this.aShortArray75[local594] = local756;
				this.aShortArray72[local594] = local590;
				if (local590 > this.anInt4364) {
					this.anInt4364 = local590;
				}
			}
		}
		this.anInt4364++;
		local16.anInt1710 = local180;
		for (local599 = 0; local599 < this.anInt4361; local599++) {
			this.aByteArray51[local599] = 0;
			this.aShortArray74[local599] = (short) local16.method1177();
			this.aShortArray73[local599] = (short) local16.method1177();
			this.aShortArray70[local599] = (short) local16.method1177();
		}
		if (this.aByteArray45 != null) {
			@Pc(851) boolean local851 = false;
			for (@Pc(853) int local853 = 0; local853 < this.anInt4367; local853++) {
				@Pc(861) int local861 = this.aByteArray45[local853] & 0xFF;
				if (local861 != 255) {
					if ((this.aShortArray74[local861] & 0xFFFF) == this.aShortArray71[local853] && (this.aShortArray73[local861] & 0xFFFF) == this.aShortArray75[local853] && this.aShortArray72[local853] == (this.aShortArray70[local861] & 0xFFFF)) {
						this.aByteArray45[local853] = -1;
					} else {
						local851 = true;
					}
				}
			}
			if (!local851) {
				this.aByteArray45 = null;
			}
		}
		if (!local7) {
			this.aShortArray69 = null;
		}
		if (!local5) {
			this.aByteArray46 = null;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ISILclient!ko;)I")
	private int method3376(@OriginalArg(1) short arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class147 arg2) {
		@Pc(8) int local8 = arg2.anIntArray421[arg1];
		@Pc(13) int local13 = arg2.anIntArray415[arg1];
		@Pc(18) int local18 = arg2.anIntArray420[arg1];
		for (@Pc(36) int local36 = 0; local36 < this.anInt4362; local36++) {
			if (local8 == this.anIntArray421[local36] && this.anIntArray415[local36] == local13 && local18 == this.anIntArray420[local36]) {
				this.aShortArray76[local36] |= arg0;
				return local36;
			}
		}
		this.anIntArray421[this.anInt4362] = local8;
		this.anIntArray415[this.anInt4362] = local13;
		this.anIntArray420[this.anInt4362] = local18;
		this.aShortArray76[this.anInt4362] = arg0;
		this.anIntArray416[this.anInt4362] = arg2.anIntArray416 == null ? -1 : arg2.anIntArray416[arg1];
		return this.anInt4362++;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIZ)V")
	public void method3377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9;
		@Pc(13) int local13;
		@Pc(15) int local15;
		@Pc(32) int local32;
		if (arg2 != 0) {
			local9 = Class90_Sub1.anIntArray304[arg2];
			local13 = Class90_Sub1.anIntArray303[arg2];
			for (local15 = 0; local15 < this.anInt4362; local15++) {
				local32 = this.anIntArray421[local15] * local13 + local9 * this.anIntArray415[local15] >> 15;
				this.anIntArray415[local15] = local13 * this.anIntArray415[local15] - this.anIntArray421[local15] * local9 >> 15;
				this.anIntArray421[local15] = local32;
			}
		}
		if (arg1 != 0) {
			local9 = Class90_Sub1.anIntArray304[arg1];
			local13 = Class90_Sub1.anIntArray303[arg1];
			for (local15 = 0; local15 < this.anInt4362; local15++) {
				local32 = this.anIntArray415[local15] * local13 - local9 * this.anIntArray420[local15] >> 15;
				this.anIntArray420[local15] = this.anIntArray420[local15] * local13 + local9 * this.anIntArray415[local15] >> 15;
				this.anIntArray415[local15] = local32;
			}
		}
		if (arg0 == 0) {
			return;
		}
		local9 = Class90_Sub1.anIntArray304[arg0];
		local13 = Class90_Sub1.anIntArray303[arg0];
		for (local15 = 0; local15 < this.anInt4362; local15++) {
			local32 = this.anIntArray420[local15] * local9 + this.anIntArray421[local15] * local13 >> 15;
			this.anIntArray420[local15] = this.anIntArray420[local15] * local13 - this.anIntArray421[local15] * local9 >> 15;
			this.anIntArray421[local15] = local32;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BBSISBIIB)I")
	public int method3378(@OriginalArg(1) byte arg0, @OriginalArg(2) short arg1, @OriginalArg(3) int arg2, @OriginalArg(4) short arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte arg7) {
		this.aShortArray71[this.anInt4367] = (short) arg2;
		this.aShortArray75[this.anInt4367] = (short) arg5;
		this.aShortArray72[this.anInt4367] = (short) arg6;
		this.aByteArray46[this.anInt4367] = arg0;
		this.aByteArray45[this.anInt4367] = arg4;
		this.aShortArray67[this.anInt4367] = arg3;
		this.aByteArray47[this.anInt4367] = arg7;
		this.aShortArray69[this.anInt4367] = arg1;
		return this.anInt4367++;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BSS)V")
	public void method3379(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray69 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < this.anInt4367; local13++) {
			if (this.aShortArray69[local13] == arg1) {
				this.aShortArray69[local13] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(I[B)V")
	private void method3380(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class1_Sub3 local8 = new Class1_Sub3(arg0);
		@Pc(13) Class1_Sub3 local13 = new Class1_Sub3(arg0);
		@Pc(18) Class1_Sub3 local18 = new Class1_Sub3(arg0);
		@Pc(23) Class1_Sub3 local23 = new Class1_Sub3(arg0);
		@Pc(28) Class1_Sub3 local28 = new Class1_Sub3(arg0);
		@Pc(33) Class1_Sub3 local33 = new Class1_Sub3(arg0);
		@Pc(38) Class1_Sub3 local38 = new Class1_Sub3(arg0);
		local8.anInt1710 = arg0.length - 23;
		this.anInt4362 = local8.method1177();
		this.anInt4367 = local8.method1177();
		this.anInt4361 = local8.method1171();
		@Pc(63) int local63 = local8.method1171();
		@Pc(74) boolean local74 = (local63 & 0x1) == 1;
		@Pc(83) boolean local83 = (local63 & 0x2) == 2;
		@Pc(94) boolean local94 = (local63 & 0x4) == 4;
		@Pc(103) boolean local103 = (local63 & 0x8) == 8;
		if (local103) {
			local8.anInt1710 -= 7;
			this.anInt4358 = local8.method1171();
			local8.anInt1710 += 6;
		}
		@Pc(126) int local126 = local8.method1171();
		@Pc(130) int local130 = local8.method1171();
		@Pc(134) int local134 = local8.method1171();
		@Pc(138) int local138 = local8.method1171();
		@Pc(142) int local142 = local8.method1171();
		@Pc(146) int local146 = local8.method1177();
		@Pc(150) int local150 = local8.method1177();
		@Pc(156) int local156 = local8.method1177();
		@Pc(162) int local162 = local8.method1177();
		@Pc(166) int local166 = local8.method1177();
		@Pc(168) int local168 = 0;
		@Pc(170) int local170 = 0;
		@Pc(172) int local172 = 0;
		@Pc(185) int local185;
		if (this.anInt4361 > 0) {
			this.aByteArray51 = new byte[this.anInt4361];
			local8.anInt1710 = 0;
			for (local185 = 0; local185 < this.anInt4361; local185++) {
				@Pc(195) byte local195 = this.aByteArray51[local185] = local8.method1212();
				if (local195 >= 1 && local195 <= 3) {
					local170++;
				}
				if (local195 == 0) {
					local168++;
				}
				if (local195 == 2) {
					local172++;
				}
			}
		}
		local185 = this.anInt4361;
		@Pc(228) int local228 = local185;
		local185 += this.anInt4362;
		@Pc(235) int local235 = local185;
		if (local74) {
			local185 += this.anInt4367;
		}
		@Pc(244) int local244 = local185;
		local185 += this.anInt4367;
		@Pc(251) int local251 = local185;
		if (local126 == 255) {
			local185 += this.anInt4367;
		}
		@Pc(261) int local261 = local185;
		if (local134 == 1) {
			local185 += this.anInt4367;
		}
		@Pc(271) int local271 = local185;
		if (local142 == 1) {
			local185 += this.anInt4362;
		}
		@Pc(281) int local281 = local185;
		if (local130 == 1) {
			local185 += this.anInt4367;
		}
		@Pc(293) int local293 = local185;
		local185 += local162;
		@Pc(299) int local299 = local185;
		if (local138 == 1) {
			local185 += this.anInt4367 * 2;
		}
		@Pc(311) int local311 = local185;
		local185 += local166;
		@Pc(317) int local317 = local185;
		local185 += this.anInt4367 * 2;
		@Pc(326) int local326 = local185;
		local185 += local146;
		@Pc(332) int local332 = local185;
		local185 += local150;
		@Pc(338) int local338 = local185;
		local185 += local156;
		@Pc(344) int local344 = local185;
		local185 += local168 * 6;
		@Pc(352) int local352 = local185;
		local185 += local170 * 6;
		@Pc(368) int local368 = this.anInt4358 < 14 ? 6 : 7;
		@Pc(370) int local370 = local185;
		local185 += local170 * local368;
		@Pc(378) int local378 = local185;
		local185 += local170;
		@Pc(384) int local384 = local185;
		local185 += local170;
		@Pc(390) int local390 = local185;
		local185 += local172 * 2 + local170;
		if (this.anInt4361 > 0) {
			if (local170 > 0) {
				this.anIntArray417 = new int[local170];
				this.anIntArray419 = new int[local170];
				this.anIntArray413 = new int[local170];
				this.aByteArray50 = new byte[local170];
				this.aByteArray49 = new byte[local170];
				this.anIntArray414 = new int[local170];
			}
			this.aShortArray73 = new short[this.anInt4361];
			this.aShortArray74 = new short[this.anInt4361];
			this.aShortArray70 = new short[this.anInt4361];
			if (local172 > 0) {
				this.anIntArray412 = new int[local172];
				this.anIntArray422 = new int[local172];
			}
		}
		this.anIntArray415 = new int[this.anInt4362];
		this.anIntArray420 = new int[this.anInt4362];
		if (local130 == 1) {
			this.aByteArray47 = new byte[this.anInt4367];
		}
		if (local138 == 1 && this.anInt4361 > 0) {
			this.aByteArray45 = new byte[this.anInt4367];
		}
		if (local126 == 255) {
			this.aByteArray48 = new byte[this.anInt4367];
		} else {
			this.aByte50 = (byte) local126;
		}
		this.aShortArray67 = new short[this.anInt4367];
		if (local134 == 1) {
			this.anIntArray418 = new int[this.anInt4367];
		}
		this.aShortArray75 = new short[this.anInt4367];
		if (local74) {
			this.aByteArray46 = new byte[this.anInt4367];
		}
		this.anIntArray421 = new int[this.anInt4362];
		if (local138 == 1) {
			this.aShortArray69 = new short[this.anInt4367];
		}
		local8.anInt1710 = local228;
		this.aShortArray72 = new short[this.anInt4367];
		if (local142 == 1) {
			this.anIntArray416 = new int[this.anInt4362];
		}
		this.aShortArray71 = new short[this.anInt4367];
		local13.anInt1710 = local326;
		local18.anInt1710 = local332;
		local23.anInt1710 = local338;
		local28.anInt1710 = local271;
		@Pc(586) int local586 = 0;
		@Pc(588) int local588 = 0;
		@Pc(590) int local590 = 0;
		@Pc(597) int local597;
		for (@Pc(592) int local592 = 0; local592 < this.anInt4362; local592++) {
			local597 = local8.method1171();
			@Pc(599) int local599 = 0;
			if ((local597 & 0x1) != 0) {
				local599 = local13.method1182();
			}
			@Pc(611) int local611 = 0;
			if ((local597 & 0x2) != 0) {
				local611 = local18.method1182();
			}
			@Pc(624) int local624 = 0;
			if ((local597 & 0x4) != 0) {
				local624 = local23.method1182();
			}
			this.anIntArray421[local592] = local599 + local586;
			this.anIntArray415[local592] = local588 + local611;
			this.anIntArray420[local592] = local590 + local624;
			local590 = this.anIntArray420[local592];
			local586 = this.anIntArray421[local592];
			local588 = this.anIntArray415[local592];
			if (local142 == 1) {
				this.anIntArray416[local592] = local28.method1171();
			}
		}
		local8.anInt1710 = local317;
		local13.anInt1710 = local235;
		local18.anInt1710 = local251;
		local23.anInt1710 = local281;
		local28.anInt1710 = local261;
		local33.anInt1710 = local299;
		local38.anInt1710 = local311;
		for (local597 = 0; local597 < this.anInt4367; local597++) {
			this.aShortArray67[local597] = (short) local8.method1177();
			if (local74) {
				this.aByteArray46[local597] = local13.method1212();
			}
			if (local126 == 255) {
				this.aByteArray48[local597] = local18.method1212();
			}
			if (local130 == 1) {
				this.aByteArray47[local597] = local23.method1212();
			}
			if (local134 == 1) {
				this.anIntArray418[local597] = local28.method1171();
			}
			if (local138 == 1) {
				this.aShortArray69[local597] = (short) (local33.method1177() - 1);
			}
			if (this.aByteArray45 != null) {
				if (this.aShortArray69[local597] == -1) {
					this.aByteArray45[local597] = -1;
				} else {
					this.aByteArray45[local597] = (byte) (local38.method1171() - 1);
				}
			}
		}
		this.anInt4364 = -1;
		local8.anInt1710 = local293;
		local13.anInt1710 = local244;
		@Pc(828) short local828 = 0;
		@Pc(830) short local830 = 0;
		@Pc(832) short local832 = 0;
		@Pc(834) short local834 = 0;
		@Pc(841) int local841;
		for (@Pc(836) int local836 = 0; local836 < this.anInt4367; local836++) {
			local841 = local13.method1171();
			if (local841 == 1) {
				local828 = (short) (local834 + local8.method1182());
				local830 = (short) (local828 + local8.method1182());
				local832 = (short) (local8.method1182() + local830);
				this.aShortArray71[local836] = local828;
				local834 = local832;
				this.aShortArray75[local836] = local830;
				this.aShortArray72[local836] = local832;
				if (local828 > this.anInt4364) {
					this.anInt4364 = local828;
				}
				if (this.anInt4364 < local830) {
					this.anInt4364 = local830;
				}
				if (this.anInt4364 < local832) {
					this.anInt4364 = local832;
				}
			}
			if (local841 == 2) {
				local830 = local832;
				local832 = (short) (local834 + local8.method1182());
				this.aShortArray71[local836] = local828;
				local834 = local832;
				this.aShortArray75[local836] = local830;
				this.aShortArray72[local836] = local832;
				if (local832 > this.anInt4364) {
					this.anInt4364 = local832;
				}
			}
			if (local841 == 3) {
				local828 = local832;
				local832 = (short) (local8.method1182() + local834);
				this.aShortArray71[local836] = local828;
				local834 = local832;
				this.aShortArray75[local836] = local830;
				this.aShortArray72[local836] = local832;
				if (local832 > this.anInt4364) {
					this.anInt4364 = local832;
				}
			}
			if (local841 == 4) {
				@Pc(1008) short local1008 = local828;
				local828 = local830;
				local830 = local1008;
				local832 = (short) (local8.method1182() + local834);
				local834 = local832;
				this.aShortArray71[local836] = local828;
				this.aShortArray75[local836] = local1008;
				this.aShortArray72[local836] = local832;
				if (this.anInt4364 < local832) {
					this.anInt4364 = local832;
				}
			}
		}
		this.anInt4364++;
		local8.anInt1710 = local344;
		local13.anInt1710 = local352;
		local18.anInt1710 = local370;
		local23.anInt1710 = local378;
		local28.anInt1710 = local384;
		local33.anInt1710 = local390;
		@Pc(1090) int local1090;
		for (local841 = 0; local841 < this.anInt4361; local841++) {
			local1090 = this.aByteArray51[local841] & 0xFF;
			if (local1090 == 0) {
				this.aShortArray74[local841] = (short) local8.method1177();
				this.aShortArray73[local841] = (short) local8.method1177();
				this.aShortArray70[local841] = (short) local8.method1177();
			}
			if (local1090 == 1) {
				this.aShortArray74[local841] = (short) local13.method1177();
				this.aShortArray73[local841] = (short) local13.method1177();
				this.aShortArray70[local841] = (short) local13.method1177();
				this.anIntArray419[local841] = local18.method1177();
				if (this.anInt4358 >= 14) {
					this.anIntArray417[local841] = local18.method1226();
				} else {
					this.anIntArray417[local841] = local18.method1177();
				}
				this.anIntArray413[local841] = local18.method1177();
				this.aByteArray49[local841] = local23.method1212();
				this.aByteArray50[local841] = local28.method1212();
				this.anIntArray414[local841] = local33.method1212();
			}
			if (local1090 == 2) {
				this.aShortArray74[local841] = (short) local13.method1177();
				this.aShortArray73[local841] = (short) local13.method1177();
				this.aShortArray70[local841] = (short) local13.method1177();
				this.anIntArray419[local841] = local18.method1177();
				if (this.anInt4358 < 14) {
					this.anIntArray417[local841] = local18.method1177();
				} else {
					this.anIntArray417[local841] = local18.method1226();
				}
				this.anIntArray413[local841] = local18.method1177();
				this.aByteArray49[local841] = local23.method1212();
				this.aByteArray50[local841] = local28.method1212();
				this.anIntArray414[local841] = local33.method1212();
				this.anIntArray412[local841] = local33.method1212();
				this.anIntArray422[local841] = local33.method1212();
			}
			if (local1090 == 3) {
				this.aShortArray74[local841] = (short) local13.method1177();
				this.aShortArray73[local841] = (short) local13.method1177();
				this.aShortArray70[local841] = (short) local13.method1177();
				this.anIntArray419[local841] = local18.method1177();
				if (this.anInt4358 >= 14) {
					this.anIntArray417[local841] = local18.method1226();
				} else {
					this.anIntArray417[local841] = local18.method1177();
				}
				this.anIntArray413[local841] = local18.method1177();
				this.aByteArray49[local841] = local23.method1212();
				this.aByteArray50[local841] = local28.method1212();
				this.anIntArray414[local841] = local33.method1212();
			}
		}
		local8.anInt1710 = local185;
		@Pc(1424) int local1424;
		@Pc(1431) int local1431;
		@Pc(1437) int local1437;
		@Pc(1499) int local1499;
		if (local83) {
			local1090 = local8.method1171();
			if (local1090 > 0) {
				this.aClass94Array3 = new Class94[local1090];
				for (local1424 = 0; local1424 < local1090; local1424++) {
					local1431 = local8.method1177();
					local1437 = local8.method1177();
					@Pc(1447) byte local1447;
					if (local126 == 255) {
						local1447 = this.aByteArray48[local1437];
					} else {
						local1447 = (byte) local126;
					}
					this.aClass94Array3[local1424] = new Class94(local1431, this.aShortArray71[local1437], this.aShortArray75[local1437], this.aShortArray72[local1437], local1447);
				}
			}
			local1424 = local8.method1171();
			if (local1424 > 0) {
				this.aClass114Array3 = new Class114[local1424];
				for (local1431 = 0; local1431 < local1424; local1431++) {
					local1437 = local8.method1177();
					local1499 = local8.method1177();
					this.aClass114Array3[local1431] = new Class114(local1437, local1499);
				}
			}
		}
		if (!local94) {
			return;
		}
		local1090 = local8.method1171();
		if (local1090 <= 0) {
			return;
		}
		this.aClass237Array1 = new Class237[local1090];
		for (local1424 = 0; local1424 < local1090; local1424++) {
			local1431 = local8.method1177();
			local1437 = local8.method1177();
			local1499 = local8.method1171();
			@Pc(1545) byte local1545 = local8.method1212();
			this.aClass237Array1[local1424] = new Class237(local1431, local1437, local1499, local1545);
		}
		return;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(SSB)V")
	public void method3381(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(5) int local5 = 0; local5 < this.anInt4367; local5++) {
			if (this.aShortArray67[local5] == arg1) {
				this.aShortArray67[local5] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(SBSSSSBIBS)B")
	public byte method3383() {
		if (this.anInt4361 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray51[this.anInt4361] = 3;
		this.aShortArray74[this.anInt4361] = 0;
		this.aShortArray73[this.anInt4361] = 32767;
		this.aShortArray70[this.anInt4361] = 0;
		this.anIntArray419[this.anInt4361] = 1024;
		this.anIntArray417[this.anInt4361] = 1024;
		this.anIntArray413[this.anInt4361] = 1024;
		this.aByteArray49[this.anInt4361] = 0;
		this.aByteArray50[this.anInt4361] = 0;
		this.anIntArray414[this.anInt4361] = 0;
		return (byte) this.anInt4361++;
	}
}
