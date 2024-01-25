import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class213 {

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "[S")
	private short[] aShortArray114;

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "[S")
	private short[] aShortArray115;

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
	private int anInt6650;

	@OriginalMember(owner = "client!wh", name = "i", descriptor = "[S")
	private short[] aShortArray116;

	@OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
	public int anInt6657;

	@OriginalMember(owner = "client!wh", name = "o", descriptor = "[S")
	private short[] aShortArray117;

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
	public int anInt6649 = -1;

	@OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
	private int anInt6654 = 0;

	@OriginalMember(owner = "client!wh", name = "m", descriptor = "Z")
	public boolean aBoolean423 = false;

	@OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
	private int anInt6656 = 128;

	@OriginalMember(owner = "client!wh", name = "u", descriptor = "Z")
	public boolean aBoolean424 = false;

	@OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
	private int anInt6663 = 0;

	@OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
	private int anInt6662 = 128;

	@OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
	private int anInt6659 = 0;

	static {
		new Class117("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!kh;I)V")
	public void method5640(@OriginalArg(0) Class11_Sub25 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method5185();
			if (local15 == 0) {
				return;
			}
			this.method5648(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IILclient!uo;III)Lclient!mj;")
	public Class126 method5646(@OriginalArg(0) int arg0, @OriginalArg(2) Class129 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = arg2;
		@Pc(22) Class111 local22 = this.anInt6649 == -1 || arg0 == -1 ? null : Static306.method5143(this.anInt6649);
		if (local22 != null) {
			local7 = arg2 | local22.method2268(false, arg0, arg3);
		}
		if (this.anInt6656 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt6662 != 128 || this.anInt6663 != 0) {
			local7 |= 0x5;
		}
		@Pc(65) Class26 local65 = Static11.aClass26_1;
		@Pc(83) Class126 local83;
		synchronized (Static11.aClass26_1) {
			local83 = (Class126) Static11.aClass26_1.method332((long) (this.anInt6657 |= arg1.anInt5876 << 29));
		}
		if (local83 == null || arg1.method4938(local83.method3142(), local7) != 0) {
			if (local83 != null) {
				local7 = arg1.method4989(local7, local83.method3142());
			}
			@Pc(110) int local110 = local7;
			if (this.aShortArray116 != null) {
				local110 = local7 | 0x2000;
			}
			if (this.aShortArray114 != null) {
				local110 |= 0x4000;
			}
			@Pc(131) Class31 local131 = Static119.method1790(Static221.aClass144_71, this.anInt6650);
			if (local131 == null) {
				return null;
			}
			local83 = arg1.method4929(local131, local110, Static192.anInt3950, this.anInt6654 + 64, this.anInt6659 + 850);
			@Pc(154) int local154;
			if (this.aShortArray116 != null) {
				for (local154 = 0; local154 < this.aShortArray116.length; local154++) {
					local83.method3162(this.aShortArray116[local154], this.aShortArray117[local154]);
				}
			}
			if (this.aShortArray114 != null) {
				for (local154 = 0; local154 < this.aShortArray114.length; local154++) {
					local83.method3146(this.aShortArray114[local154], this.aShortArray115[local154]);
				}
			}
			local83.method3143(local7);
			@Pc(204) Class26 local204 = Static11.aClass26_1;
			synchronized (Static11.aClass26_1) {
				Static11.aClass26_1.method330((long) (this.anInt6657 |= arg1.anInt5876 << 29), local83);
			}
		}
		@Pc(246) Class126 local246 = local22 == null ? local83.method3158((byte) 2, local7, true) : local22.method2270(arg0, (byte) 2, 0, arg3, local83, arg4, local7);
		if (this.anInt6662 != 128 || this.anInt6656 != 128) {
			local246.method3134(this.anInt6662, this.anInt6656, this.anInt6662);
		}
		if (this.anInt6663 != 0) {
			if (this.anInt6663 == 90) {
				local246.method3125(4096);
			}
			if (this.anInt6663 == 180) {
				local246.method3125(8192);
			}
			if (this.anInt6663 == 270) {
				local246.method3125(12288);
			}
		}
		local246.method3143(arg2);
		return local246;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!kh;BI)V")
	private void method5648(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt6650 = arg0.method5187();
		} else if (arg1 == 2) {
			this.anInt6649 = arg0.method5187();
		} else if (arg1 == 4) {
			this.anInt6662 = arg0.method5187();
		} else if (arg1 == 5) {
			this.anInt6656 = arg0.method5187();
		} else if (arg1 == 6) {
			this.anInt6663 = arg0.method5187();
		} else if (arg1 == 7) {
			this.anInt6654 = arg0.method5185();
		} else if (arg1 == 8) {
			this.anInt6659 = arg0.method5185();
		} else if (arg1 == 9) {
			this.aBoolean423 = true;
		} else if (arg1 == 10) {
			this.aBoolean424 = true;
		} else {
			@Pc(95) int local95;
			@Pc(105) int local105;
			if (arg1 == 40) {
				local95 = arg0.method5185();
				this.aShortArray117 = new short[local95];
				this.aShortArray116 = new short[local95];
				for (local105 = 0; local105 < local95; local105++) {
					this.aShortArray116[local105] = (short) arg0.method5187();
					this.aShortArray117[local105] = (short) arg0.method5187();
				}
			} else if (arg1 == 41) {
				local95 = arg0.method5185();
				this.aShortArray114 = new short[local95];
				this.aShortArray115 = new short[local95];
				for (local105 = 0; local105 < local95; local105++) {
					this.aShortArray114[local105] = (short) arg0.method5187();
					this.aShortArray115[local105] = (short) arg0.method5187();
				}
				return;
			}
		}
	}
}
