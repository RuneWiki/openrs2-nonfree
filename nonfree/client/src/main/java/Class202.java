import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class202 {

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "[Z")
	public boolean[] aBooleanArray26;

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "[I")
	private int[] anIntArray972;

	@OriginalMember(owner = "client!qp", name = "g", descriptor = "[I")
	public int[] anIntArray973;

	@OriginalMember(owner = "client!qp", name = "j", descriptor = "[I")
	public int[] anIntArray974;

	@OriginalMember(owner = "client!qp", name = "l", descriptor = "I")
	public int anInt4931;

	@OriginalMember(owner = "client!qp", name = "p", descriptor = "[[I")
	public int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!qp", name = "w", descriptor = "Lclient!vk;")
	public Class236 aClass236_2;

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "I")
	public int anInt4927 = 99;

	@OriginalMember(owner = "client!qp", name = "o", descriptor = "I")
	public int anInt4934 = -1;

	@OriginalMember(owner = "client!qp", name = "e", descriptor = "Z")
	public boolean aBoolean373 = false;

	@OriginalMember(owner = "client!qp", name = "u", descriptor = "Z")
	public boolean aBoolean375 = false;

	@OriginalMember(owner = "client!qp", name = "r", descriptor = "I")
	public int anInt4935 = -1;

	@OriginalMember(owner = "client!qp", name = "m", descriptor = "I")
	public int anInt4932 = 2;

	@OriginalMember(owner = "client!qp", name = "f", descriptor = "Z")
	public boolean aBoolean374 = false;

	@OriginalMember(owner = "client!qp", name = "t", descriptor = "I")
	public int anInt4937 = -1;

	@OriginalMember(owner = "client!qp", name = "D", descriptor = "I")
	public int anInt4944 = -1;

	@OriginalMember(owner = "client!qp", name = "B", descriptor = "I")
	public int anInt4942 = -1;

	@OriginalMember(owner = "client!qp", name = "x", descriptor = "Z")
	public boolean aBoolean376 = false;

	@OriginalMember(owner = "client!qp", name = "E", descriptor = "I")
	public int anInt4945 = 5;

	static {
		new Class32("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILclient!n;BIIBII)Lclient!n;")
	public Class66 method4325(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(16) int local16 = this.anIntArray973[arg5];
		@Pc(21) int local21 = this.anIntArray974[arg5];
		@Pc(29) Class2_Sub10_Sub12 local29 = this.aClass236_2.method5395(local21 >> 16);
		@Pc(33) int local33 = local21 & 0xFFFF;
		if (local29 == null) {
			return arg1.method5119(arg2, arg0, true);
		}
		@Pc(43) Class2_Sub10_Sub12 local43 = null;
		if ((this.aBoolean376 || Static298.aBoolean384) && arg6 != -1 && this.anIntArray974.length > arg6) {
			@Pc(66) int local66 = this.anIntArray974[arg6];
			local43 = this.aClass236_2.method5395(local66 >> 16);
			arg6 = local66 & 0xFFFF;
		}
		if (this.aBoolean373) {
			arg0 |= 0x200;
		}
		if (local29.method3682(local33)) {
			arg0 |= 0x80;
		}
		if (local29.method3683(local33)) {
			arg0 |= 0x100;
		}
		if (local43 != null) {
			if (local43.method3682(arg6)) {
				arg0 |= 0x80;
			}
			if (local43.method3683(arg6)) {
				arg0 |= 0x100;
			}
		}
		arg0 |= 0x20;
		@Pc(133) Class66 local133 = arg1.method5119(arg2, arg0, true);
		local133.method5143(arg6, this.aBoolean373, local33, local43, local16, local29, arg3, arg4 - 1);
		return local133;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Z)V")
	public void method4326() {
		if (this.anInt4937 == -1) {
			if (this.aBooleanArray26 == null) {
				this.anInt4937 = 0;
			} else {
				this.anInt4937 = 2;
			}
		}
		if (this.anInt4934 != -1) {
			return;
		}
		if (this.aBooleanArray26 == null) {
			this.anInt4934 = 0;
		} else {
			this.anInt4934 = 2;
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IILclient!n;III)Lclient!n;")
	public Class66 method4329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class66 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray973[arg4];
		@Pc(20) int local20 = this.anIntArray974[arg4];
		@Pc(28) Class2_Sub10_Sub12 local28 = this.aClass236_2.method5395(local20 >> 16);
		@Pc(32) int local32 = local20 & 0xFFFF;
		if (local28 == null) {
			return arg2.method5119((byte) 1, arg3, true);
		}
		@Pc(42) Class2_Sub10_Sub12 local42 = null;
		if ((this.aBoolean376 || Static298.aBoolean384) && arg0 != -1 && arg0 < this.anIntArray974.length) {
			@Pc(61) int local61 = this.anIntArray974[arg0];
			local42 = this.aClass236_2.method5395(local61 >> 16);
			arg0 = local61 & 0xFFFF;
		}
		@Pc(75) Class2_Sub10_Sub12 local75 = null;
		@Pc(77) Class2_Sub10_Sub12 local77 = null;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.anIntArray972 != null) {
			if (arg4 < this.anIntArray972.length) {
				local79 = this.anIntArray972[arg4];
				if (local79 != 65535) {
					local75 = this.aClass236_2.method5395(local79 >> 16);
					local79 &= 0xFFFF;
				}
			}
			if ((this.aBoolean376 || Static298.aBoolean384) && arg0 != -1 && arg0 < this.anIntArray972.length) {
				local81 = this.anIntArray972[arg0];
				if (local81 != 65535) {
					local77 = this.aClass236_2.method5395(local81 >> 16);
					local81 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean373) {
			arg3 |= 0x200;
		}
		if (local28.method3682(local32)) {
			arg3 |= 0x80;
		}
		if (local28.method3683(local32)) {
			arg3 |= 0x100;
		}
		if (local75 != null) {
			if (local75.method3682(local79)) {
				arg3 |= 0x80;
			}
			if (local75.method3683(local79)) {
				arg3 |= 0x100;
			}
		}
		if (local42 != null) {
			if (local42.method3682(arg0)) {
				arg3 |= 0x80;
			}
			if (local42.method3683(arg0)) {
				arg3 |= 0x100;
			}
		}
		if (local77 != null) {
			if (local77.method3682(local81)) {
				arg3 |= 0x80;
			}
			if (local77.method3683(local81)) {
				arg3 |= 0x100;
			}
		}
		arg3 |= 0x20;
		@Pc(251) Class66 local251 = arg2.method5119((byte) 1, arg3, true);
		local251.method5143(arg0, this.aBoolean373, local32, local42, local8, local28, 0, arg1 - 1);
		if (local75 != null) {
			local251.method5143(local81, this.aBoolean373, local79, local77, local8, local75, 0, arg1 - 1);
		}
		return local251;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZIII)I")
	public int method4330(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = 0;
		@Pc(12) int local12 = 0;
		@Pc(17) int local17 = this.anIntArray974[arg2];
		@Pc(19) Class2_Sub10_Sub12 local19 = null;
		@Pc(29) Class2_Sub10_Sub12 local29 = this.aClass236_2.method5395(local17 >> 16);
		@Pc(33) int local33 = local17 & 0xFFFF;
		if (local29 == null) {
			return 0;
		}
		if ((this.aBoolean376 || Static298.aBoolean384) && arg1 != -1 && this.anIntArray974.length > arg1) {
			local12 = this.anIntArray974[arg1];
			local19 = this.aClass236_2.method5395(local12 >> 16);
			local12 &= 0xFFFF;
		}
		if (this.aBoolean373) {
			local10 = 512;
		}
		if (local29.method3682(local33)) {
			local10 |= 0x80;
		}
		if (local29.method3683(local33)) {
			local10 |= 0x100;
		}
		if (local19 != null) {
			if (local19.method3682(local12)) {
				local10 |= 0x80;
			}
			if (local19.method3683(local12)) {
				local10 |= 0x100;
			}
		}
		if (this.anIntArray972 != null && arg0) {
			@Pc(131) int local131;
			@Pc(142) Class2_Sub10_Sub12 local142;
			if (arg2 < this.anIntArray972.length) {
				local131 = this.anIntArray972[arg2];
				if (local131 != 65535) {
					local142 = this.aClass236_2.method5395(local131 >> 16);
					local131 &= 0xFFFF;
					if (local142 != null) {
						if (local142.method3682(local131)) {
							local10 |= 0x80;
						}
						if (local142.method3683(local131)) {
							local10 |= 0x100;
						}
					}
				}
			}
			if ((this.aBoolean376 || Static298.aBoolean384) && arg1 != -1 && arg1 < this.anIntArray972.length) {
				local131 = this.anIntArray972[arg1];
				if (local131 != 65535) {
					local142 = this.aClass236_2.method5395(local131 >> 16);
					local131 &= 0xFFFF;
					if (local142 != null) {
						if (local142.method3682(local131)) {
							local10 |= 0x80;
						}
						if (local142.method3683(local131)) {
							local10 |= 0x100;
						}
					}
				}
			}
		}
		return local10 | 0x20;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!kk;II)V")
	private void method4331(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8;
		@Pc(14) int local14;
		@Pc(32) int local32;
		@Pc(50) int local50;
		if (arg1 == 1) {
			local8 = arg0.method5312();
			this.anIntArray973 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray973[local14] = arg0.method5312();
			}
			this.anIntArray974 = new int[local8];
			for (local32 = 0; local32 < local8; local32++) {
				this.anIntArray974[local32] = arg0.method5312();
			}
			for (local50 = 0; local50 < local8; local50++) {
				this.anIntArray974[local50] = (arg0.method5312() << 16) + this.anIntArray974[local50];
			}
		} else if (arg1 == 2) {
			this.anInt4942 = arg0.method5312();
		} else if (arg1 == 3) {
			this.aBooleanArray26 = new boolean[256];
			local8 = arg0.method5350();
			for (local14 = 0; local14 < local8; local14++) {
				this.aBooleanArray26[arg0.method5350()] = true;
			}
		} else if (arg1 == 4) {
			this.aBoolean375 = true;
		} else if (arg1 == 5) {
			this.anInt4945 = arg0.method5350();
		} else if (arg1 == 6) {
			this.anInt4935 = arg0.method5312();
		} else if (arg1 == 7) {
			this.anInt4944 = arg0.method5312();
		} else if (arg1 == 8) {
			this.anInt4927 = arg0.method5350();
		} else if (arg1 == 9) {
			this.anInt4937 = arg0.method5350();
		} else if (arg1 == 10) {
			this.anInt4934 = arg0.method5350();
		} else if (arg1 == 11) {
			this.anInt4932 = arg0.method5350();
		} else if (arg1 == 12) {
			local8 = arg0.method5350();
			this.anIntArray972 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray972[local14] = arg0.method5312();
			}
			for (local32 = 0; local32 < local8; local32++) {
				this.anIntArray972[local32] = (arg0.method5312() << 16) + this.anIntArray972[local32];
			}
		} else if (arg1 == 13) {
			local8 = arg0.method5312();
			this.anIntArrayArray39 = new int[local8][];
			for (local14 = 0; local14 < local8; local14++) {
				local32 = arg0.method5350();
				if (local32 > 0) {
					this.anIntArrayArray39[local14] = new int[local32];
					this.anIntArrayArray39[local14][0] = arg0.method5356();
					for (local50 = 1; local50 < local32; local50++) {
						this.anIntArrayArray39[local14][local50] = arg0.method5312();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean373 = true;
		} else if (arg1 == 15) {
			this.aBoolean376 = true;
		} else if (arg1 == 16) {
			this.aBoolean374 = true;
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!kk;I)V")
	public void method4332(@OriginalArg(0) Class2_Sub16 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method5350();
			if (local3 == 0) {
				return;
			}
			this.method4331(arg0, local3);
		}
	}
}
