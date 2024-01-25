import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class177 {

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "[I")
	public int[] anIntArray499;

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "Lclient!cn;")
	public Class43 aClass43_3;

	@OriginalMember(owner = "client!ok", name = "s", descriptor = "[[I")
	public int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!ok", name = "u", descriptor = "[I")
	private int[] anIntArray500;

	@OriginalMember(owner = "client!ok", name = "v", descriptor = "[I")
	public int[] anIntArray501;

	@OriginalMember(owner = "client!ok", name = "B", descriptor = "[Z")
	public boolean[] aBooleanArray107;

	@OriginalMember(owner = "client!ok", name = "E", descriptor = "I")
	public int anInt4515;

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
	public int anInt4500 = 2;

	@OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
	public int anInt4505 = -1;

	@OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
	public int anInt4504 = -1;

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
	public int anInt4497 = -1;

	@OriginalMember(owner = "client!ok", name = "y", descriptor = "I")
	public int anInt4510 = -1;

	@OriginalMember(owner = "client!ok", name = "k", descriptor = "Z")
	public boolean aBoolean351 = false;

	@OriginalMember(owner = "client!ok", name = "D", descriptor = "I")
	public int anInt4514 = 99;

	@OriginalMember(owner = "client!ok", name = "r", descriptor = "Z")
	public boolean aBoolean352 = false;

	@OriginalMember(owner = "client!ok", name = "G", descriptor = "I")
	public int anInt4517 = -1;

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "Z")
	public boolean aBoolean350 = false;

	@OriginalMember(owner = "client!ok", name = "x", descriptor = "Z")
	public boolean aBoolean353 = false;

	@OriginalMember(owner = "client!ok", name = "J", descriptor = "I")
	public int anInt4520 = 5;

	static {
		new Class57("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IILclient!f;III)Lclient!f;")
	public Class75 method4076(@OriginalArg(0) int arg0, @OriginalArg(2) Class75 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray501[arg4];
		@Pc(13) int local13 = this.anIntArray499[arg4];
		@Pc(21) Class3_Sub7_Sub15 local21 = this.aClass43_3.method931(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg1.method5473((byte) 1, arg3, true);
		}
		@Pc(35) Class3_Sub7_Sub15 local35 = null;
		if ((this.aBoolean351 || Static120.aBoolean173) && arg0 != -1 && arg0 < this.anIntArray499.length) {
			@Pc(58) int local58 = this.anIntArray499[arg0];
			local35 = this.aClass43_3.method931(local58 >> 16);
			arg0 = local58 & 0xFFFF;
		}
		@Pc(72) Class3_Sub7_Sub15 local72 = null;
		@Pc(74) Class3_Sub7_Sub15 local74 = null;
		@Pc(76) int local76 = 0;
		@Pc(78) int local78 = 0;
		if (this.anIntArray500 != null) {
			if (this.anIntArray500.length > arg4) {
				local76 = this.anIntArray500[arg4];
				if (local76 != 65535) {
					local72 = this.aClass43_3.method931(local76 >> 16);
					local76 &= 0xFFFF;
				}
			}
			if ((this.aBoolean351 || Static120.aBoolean173) && arg0 != -1 && this.anIntArray500.length > arg0) {
				local78 = this.anIntArray500[arg0];
				if (local78 != 65535) {
					local74 = this.aClass43_3.method931(local78 >> 16);
					local78 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean352) {
			arg3 |= 0x200;
		}
		if (local21.method5583(local25)) {
			arg3 |= 0x80;
		}
		if (local21.method5582(local25)) {
			arg3 |= 0x100;
		}
		if (local72 != null) {
			if (local72.method5583(local76)) {
				arg3 |= 0x80;
			}
			if (local72.method5582(local76)) {
				arg3 |= 0x100;
			}
		}
		if (local35 != null) {
			if (local35.method5583(arg0)) {
				arg3 |= 0x80;
			}
			if (local35.method5582(arg0)) {
				arg3 |= 0x100;
			}
		}
		if (local74 != null) {
			if (local74.method5583(local78)) {
				arg3 |= 0x80;
			}
			if (local74.method5582(local78)) {
				arg3 |= 0x100;
			}
		}
		arg3 |= 0x20;
		@Pc(249) Class75 local249 = arg1.method5473((byte) 1, arg3, true);
		local249.method5489(local25, local21, local8, 0, arg2 - 1, this.aBoolean352, arg0, local35);
		if (local72 != null) {
			local249.method5489(local76, local72, local8, 0, arg2 - 1, this.aBoolean352, local78, local74);
		}
		return local249;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIBLclient!f;IBI)Lclient!f;")
	public Class75 method4078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) Class75 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray501[arg6];
		@Pc(13) int local13 = this.anIntArray499[arg6];
		@Pc(21) Class3_Sub7_Sub15 local21 = this.aClass43_3.method931(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg4.method5473(arg3, arg5, true);
		}
		@Pc(35) Class3_Sub7_Sub15 local35 = null;
		if ((this.aBoolean351 || Static120.aBoolean173) && arg1 != -1 && this.anIntArray499.length > arg1) {
			@Pc(57) int local57 = this.anIntArray499[arg1];
			local35 = this.aClass43_3.method931(local57 >> 16);
			arg1 = local57 & 0xFFFF;
		}
		if (this.aBoolean352) {
			arg5 |= 0x200;
		}
		if (local21.method5583(local25)) {
			arg5 |= 0x80;
		}
		if (local21.method5582(local25)) {
			arg5 |= 0x100;
		}
		if (local35 != null) {
			if (local35.method5583(arg1)) {
				arg5 |= 0x80;
			}
			if (local35.method5582(arg1)) {
				arg5 |= 0x100;
			}
		}
		arg5 |= 0x20;
		@Pc(132) Class75 local132 = arg4.method5473(arg3, arg5, true);
		local132.method5489(local25, local21, local8, arg0, arg2 - 1, this.aBoolean352, arg1, local35);
		return local132;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!rp;II)V")
	private void method4081(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(1) int arg1) {
		@Pc(24) int local24;
		@Pc(26) int local26;
		@Pc(167) int local167;
		@Pc(189) int local189;
		if (arg1 == 1) {
			local24 = arg0.method2767();
			this.anIntArray501 = new int[local24];
			for (local26 = 0; local26 < local24; local26++) {
				this.anIntArray501[local26] = arg0.method2767();
			}
			this.anIntArray499 = new int[local24];
			for (local167 = 0; local167 < local24; local167++) {
				this.anIntArray499[local167] = arg0.method2767();
			}
			for (local189 = 0; local189 < local24; local189++) {
				this.anIntArray499[local189] = (arg0.method2767() << 16) + this.anIntArray499[local189];
			}
		} else if (arg1 == 2) {
			this.anInt4497 = arg0.method2767();
		} else if (arg1 == 3) {
			this.aBooleanArray107 = new boolean[256];
			local24 = arg0.method2739();
			for (local26 = 0; local26 < local24; local26++) {
				this.aBooleanArray107[arg0.method2739()] = true;
			}
		} else if (arg1 == 4) {
			this.aBoolean350 = true;
		} else if (arg1 == 5) {
			this.anInt4520 = arg0.method2739();
		} else if (arg1 == 6) {
			this.anInt4504 = arg0.method2767();
		} else if (arg1 == 7) {
			this.anInt4505 = arg0.method2767();
		} else if (arg1 == 8) {
			this.anInt4514 = arg0.method2739();
		} else if (arg1 == 9) {
			this.anInt4517 = arg0.method2739();
		} else if (arg1 == 10) {
			this.anInt4510 = arg0.method2739();
		} else if (arg1 == 11) {
			this.anInt4500 = arg0.method2739();
		} else if (arg1 == 12) {
			local24 = arg0.method2739();
			this.anIntArray500 = new int[local24];
			for (local26 = 0; local26 < local24; local26++) {
				this.anIntArray500[local26] = arg0.method2767();
			}
			for (local167 = 0; local167 < local24; local167++) {
				this.anIntArray500[local167] = (arg0.method2767() << 16) + this.anIntArray500[local167];
			}
		} else if (arg1 == 13) {
			local24 = arg0.method2767();
			this.anIntArrayArray43 = new int[local24][];
			for (local26 = 0; local26 < local24; local26++) {
				local167 = arg0.method2739();
				if (local167 > 0) {
					this.anIntArrayArray43[local26] = new int[local167];
					this.anIntArrayArray43[local26][0] = arg0.method2786();
					for (local189 = 1; local189 < local167; local189++) {
						this.anIntArrayArray43[local26][local189] = arg0.method2767();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean352 = true;
		} else if (arg1 == 15) {
			this.aBoolean351 = true;
		} else if (arg1 == 16) {
			this.aBoolean353 = true;
		}
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)V")
	public void method4082() {
		if (this.anInt4510 == -1) {
			if (this.aBooleanArray107 == null) {
				this.anInt4510 = 0;
			} else {
				this.anInt4510 = 2;
			}
		}
		if (this.anInt4517 != -1) {
			return;
		}
		if (this.aBooleanArray107 == null) {
			this.anInt4517 = 0;
		} else {
			this.anInt4517 = 2;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZIII)I")
	public int method4083(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray499[arg2];
		@Pc(21) Class3_Sub7_Sub15 local21 = null;
		@Pc(29) Class3_Sub7_Sub15 local29 = this.aClass43_3.method931(local12 >> 16);
		@Pc(33) int local33 = local12 & 0xFFFF;
		if (local29 == null) {
			return 0;
		}
		if ((this.aBoolean351 || Static120.aBoolean173) && arg1 != -1 && arg1 < this.anIntArray499.length) {
			local7 = this.anIntArray499[arg1];
			local21 = this.aClass43_3.method931(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean352) {
			local5 = 512;
		}
		if (local29.method5583(local33)) {
			local5 |= 0x80;
		}
		if (local29.method5582(local33)) {
			local5 |= 0x100;
		}
		if (local21 != null) {
			if (local21.method5583(local7)) {
				local5 |= 0x80;
			}
			if (local21.method5582(local7)) {
				local5 |= 0x100;
			}
		}
		if (this.anIntArray500 != null && arg0) {
			@Pc(140) int local140;
			@Pc(153) Class3_Sub7_Sub15 local153;
			if (this.anIntArray500.length > arg2) {
				local140 = this.anIntArray500[arg2];
				if (local140 != 65535) {
					local153 = this.aClass43_3.method931(local140 >> 16);
					local140 &= 0xFFFF;
					if (local153 != null) {
						if (local153.method5583(local140)) {
							local5 |= 0x80;
						}
						if (local153.method5582(local140)) {
							local5 |= 0x100;
						}
					}
				}
			}
			if ((this.aBoolean351 || Static120.aBoolean173) && arg1 != -1 && this.anIntArray500.length > arg1) {
				local140 = this.anIntArray500[arg1];
				if (local140 != 65535) {
					local153 = this.aClass43_3.method931(local140 >> 16);
					local140 &= 0xFFFF;
					if (local153 != null) {
						if (local153.method5583(local140)) {
							local5 |= 0x80;
						}
						if (local153.method5582(local140)) {
							local5 |= 0x100;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!rp;B)V")
	public void method4085(@OriginalArg(0) Class3_Sub5 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method2739();
			if (local7 == 0) {
				return;
			}
			this.method4081(arg0, local7);
		}
	}
}
