import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class46 {

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "[I")
	public int[] anIntArray89;

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "[I")
	public int[] anIntArray90;

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "[I")
	private int[] anIntArray91;

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "[Z")
	public boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "[[I")
	public int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!dc", name = "q", descriptor = "Lclient!pp;")
	public Class194 aClass194_2;

	@OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
	public int anInt1768;

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
	public int anInt1762 = -1;

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
	public int anInt1763 = -1;

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
	public int anInt1765 = -1;

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
	public int anInt1764 = 2;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
	public int anInt1760 = 99;

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
	public int anInt1767 = 5;

	@OriginalMember(owner = "client!dc", name = "w", descriptor = "I")
	public int anInt1772 = -1;

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "Z")
	public boolean aBoolean149 = false;

	@OriginalMember(owner = "client!dc", name = "x", descriptor = "I")
	public int anInt1773 = -1;

	@OriginalMember(owner = "client!dc", name = "u", descriptor = "Z")
	public boolean aBoolean150 = false;

	@OriginalMember(owner = "client!dc", name = "B", descriptor = "Z")
	public boolean aBoolean152 = false;

	@OriginalMember(owner = "client!dc", name = "z", descriptor = "Z")
	public boolean aBoolean151 = false;

	static {
		new Class256("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILclient!md;)V")
	private void method1260(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		@Pc(10) int local10;
		@Pc(16) int local16;
		@Pc(35) int local35;
		@Pc(54) int local54;
		if (arg0 == 1) {
			local10 = arg1.method3711();
			this.anIntArray89 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray89[local16] = arg1.method3711();
			}
			this.anIntArray90 = new int[local10];
			for (local35 = 0; local35 < local10; local35++) {
				this.anIntArray90[local35] = arg1.method3711();
			}
			for (local54 = 0; local54 < local10; local54++) {
				this.anIntArray90[local54] += arg1.method3711() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt1763 = arg1.method3711();
		} else if (arg0 == 3) {
			this.aBooleanArray8 = new boolean[256];
			local10 = arg1.method3737();
			for (local16 = 0; local16 < local10; local16++) {
				this.aBooleanArray8[arg1.method3737()] = true;
			}
		} else if (arg0 == 4) {
			this.aBoolean151 = true;
		} else if (arg0 == 5) {
			this.anInt1767 = arg1.method3737();
		} else if (arg0 == 6) {
			this.anInt1762 = arg1.method3711();
		} else if (arg0 == 7) {
			this.anInt1773 = arg1.method3711();
		} else if (arg0 == 8) {
			this.anInt1760 = arg1.method3737();
		} else if (arg0 == 9) {
			this.anInt1765 = arg1.method3737();
		} else if (arg0 == 10) {
			this.anInt1772 = arg1.method3737();
		} else if (arg0 == 11) {
			this.anInt1764 = arg1.method3737();
		} else if (arg0 == 12) {
			local10 = arg1.method3737();
			this.anIntArray91 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray91[local16] = arg1.method3711();
			}
			for (local35 = 0; local35 < local10; local35++) {
				this.anIntArray91[local35] += arg1.method3711() << 16;
			}
		} else if (arg0 == 13) {
			local10 = arg1.method3711();
			this.anIntArrayArray8 = new int[local10][];
			for (local16 = 0; local16 < local10; local16++) {
				local35 = arg1.method3737();
				if (local35 > 0) {
					this.anIntArrayArray8[local16] = new int[local35];
					this.anIntArrayArray8[local16][0] = arg1.method3748();
					for (local54 = 1; local54 < local35; local54++) {
						this.anIntArrayArray8[local16][local54] = arg1.method3711();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean150 = true;
		} else if (arg0 == 15) {
			this.aBoolean152 = true;
		} else if (arg0 == 16) {
			this.aBoolean149 = true;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!c;IIIII)Lclient!c;")
	public Class32 method1261(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray89[arg4];
		@Pc(13) int local13 = this.anIntArray90[arg4];
		@Pc(21) Class2_Sub2_Sub7 local21 = this.aClass194_2.method4376(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg0.method5678((byte) 1, arg1, true);
		}
		@Pc(35) Class2_Sub2_Sub7 local35 = null;
		if ((this.aBoolean152 || Static431.aBoolean640) && arg2 != -1 && arg2 < this.anIntArray90.length) {
			@Pc(53) int local53 = this.anIntArray90[arg2];
			local35 = this.aClass194_2.method4376(local53 >> 16);
			arg2 = local53 & 0xFFFF;
		}
		@Pc(67) Class2_Sub2_Sub7 local67 = null;
		@Pc(69) Class2_Sub2_Sub7 local69 = null;
		@Pc(71) int local71 = 0;
		@Pc(73) int local73 = 0;
		if (this.anIntArray91 != null) {
			if (arg4 < this.anIntArray91.length) {
				local71 = this.anIntArray91[arg4];
				if (local71 != 65535) {
					local67 = this.aClass194_2.method4376(local71 >> 16);
					local71 &= 0xFFFF;
				}
			}
			if ((this.aBoolean152 || Static431.aBoolean640) && arg2 != -1 && this.anIntArray91.length > arg2) {
				local73 = this.anIntArray91[arg2];
				if (local73 != 65535) {
					local69 = this.aClass194_2.method4376(local73 >> 16);
					local73 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean150) {
			arg1 |= 0x200;
		}
		if (local21.method1407(local25)) {
			arg1 |= 0x80;
		}
		if (local21.method1411(local25)) {
			arg1 |= 0x100;
		}
		if (local21.method1409(local25)) {
			arg1 |= 0x400;
		}
		if (local67 != null) {
			if (local67.method1407(local71)) {
				arg1 |= 0x80;
			}
			if (local67.method1411(local71)) {
				arg1 |= 0x100;
			}
			if (local67.method1409(local71)) {
				arg1 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method1407(arg2)) {
				arg1 |= 0x80;
			}
			if (local35.method1411(arg2)) {
				arg1 |= 0x100;
			}
			if (local35.method1409(arg2)) {
				arg1 |= 0x400;
			}
		}
		if (local69 != null) {
			if (local69.method1407(local73)) {
				arg1 |= 0x80;
			}
			if (local69.method1411(local73)) {
				arg1 |= 0x100;
			}
			if (local69.method1409(local73)) {
				arg1 |= 0x400;
			}
		}
		arg1 |= 0x20;
		@Pc(272) Class32 local272 = arg0.method5678((byte) 1, arg1, true);
		local272.method5668(0, this.aBoolean150, local21, local25, local35, arg2, local8, arg3 - 1);
		if (local67 != null) {
			local272.method5668(0, this.aBoolean150, local67, local71, local69, local73, local8, arg3 - 1);
		}
		return local272;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
	public void method1262() {
		if (this.anInt1765 == -1) {
			if (this.aBooleanArray8 == null) {
				this.anInt1765 = 0;
			} else {
				this.anInt1765 = 2;
			}
		}
		if (this.anInt1772 != -1) {
			return;
		}
		if (this.aBooleanArray8 == null) {
			this.anInt1772 = 0;
		} else {
			this.anInt1772 = 2;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILclient!md;)V")
	public void method1263(@OriginalArg(1) Class2_Sub20 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method3737();
			if (local17 == 0) {
				return;
			}
			this.method1260(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLclient!c;IBIIII)Lclient!c;")
	public Class32 method1265(@OriginalArg(0) byte arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray89[arg3];
		@Pc(13) int local13 = this.anIntArray90[arg3];
		@Pc(21) Class2_Sub2_Sub7 local21 = this.aClass194_2.method4376(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg1.method5678(arg0, arg2, true);
		}
		@Pc(35) Class2_Sub2_Sub7 local35 = null;
		if ((this.aBoolean152 || Static431.aBoolean640) && arg5 != -1 && this.anIntArray90.length > arg5) {
			@Pc(54) int local54 = this.anIntArray90[arg5];
			local35 = this.aClass194_2.method4376(local54 >> 16);
			arg5 = local54 & 0xFFFF;
		}
		if (this.aBoolean150) {
			arg2 |= 0x200;
		}
		if (local21.method1407(local25)) {
			arg2 |= 0x80;
		}
		if (local21.method1411(local25)) {
			arg2 |= 0x100;
		}
		if (local21.method1409(local25)) {
			arg2 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method1407(arg5)) {
				arg2 |= 0x80;
			}
			if (local35.method1411(arg5)) {
				arg2 |= 0x100;
			}
			if (local35.method1409(arg5)) {
				arg2 |= 0x400;
			}
		}
		arg2 |= 0x20;
		@Pc(147) Class32 local147 = arg1.method5678(arg0, arg2, true);
		local147.method5668(arg6, this.aBoolean150, local21, local25, local35, arg5, local8, arg4 - 1);
		return local147;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZII)I")
	public int method1267(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray90[arg0];
		@Pc(14) Class2_Sub2_Sub7 local14 = null;
		@Pc(22) Class2_Sub2_Sub7 local22 = this.aClass194_2.method4376(local12 >> 16);
		@Pc(26) int local26 = local12 & 0xFFFF;
		if (local22 == null) {
			return 0;
		}
		if ((this.aBoolean152 || Static431.aBoolean640) && arg2 != -1 && this.anIntArray90.length > arg2) {
			local7 = this.anIntArray90[arg2];
			local14 = this.aClass194_2.method4376(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean150) {
			local5 = 512;
		}
		if (local22.method1407(local26)) {
			local5 |= 0x80;
		}
		if (local22.method1411(local26)) {
			local5 |= 0x100;
		}
		if (local22.method1409(local26)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method1407(local7)) {
				local5 |= 0x80;
			}
			if (local14.method1411(local7)) {
				local5 |= 0x100;
			}
			if (local14.method1409(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray91 != null && arg1) {
			@Pc(154) int local154;
			@Pc(167) Class2_Sub2_Sub7 local167;
			if (arg0 < this.anIntArray91.length) {
				local154 = this.anIntArray91[arg0];
				if (local154 != 65535) {
					local167 = this.aClass194_2.method4376(local154 >> 16);
					local154 &= 0xFFFF;
					if (local167 != null) {
						if (local167.method1407(local154)) {
							local5 |= 0x80;
						}
						if (local167.method1411(local154)) {
							local5 |= 0x100;
						}
						if (local167.method1409(local154)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean152 || Static431.aBoolean640) && arg2 != -1 && this.anIntArray91.length > arg2) {
				local154 = this.anIntArray91[arg2];
				if (local154 != 65535) {
					local167 = this.aClass194_2.method4376(local154 >> 16);
					local154 &= 0xFFFF;
					if (local167 != null) {
						if (local167.method1407(local154)) {
							local5 |= 0x80;
						}
						if (local167.method1411(local154)) {
							local5 |= 0x100;
						}
						if (local167.method1409(local154)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}
}
