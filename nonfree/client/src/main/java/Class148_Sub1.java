import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public final class Class148_Sub1 extends Class148 {

	@OriginalMember(owner = "client!lp", name = "Z", descriptor = "Z")
	public boolean aBoolean264 = false;

	@OriginalMember(owner = "client!lp", name = "R", descriptor = "Z")
	public boolean aBoolean263 = false;

	static {
		new Class134("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
	}

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lclient!or;)V")
	public Class148_Sub1(@OriginalArg(0) Class183 arg0) {
		super.anInt3784 = 3;
		this.method3050(true);
		super.aBoolean258 = true;
		super.aBoolean259 = true;
		super.anInt3786 = 2;
		super.anInt3778 = 127;
		super.anInt3783 = 1;
		super.aBoolean249 = true;
		super.aBoolean251 = false;
		super.aBoolean248 = true;
		super.anInt3781 = 0;
		super.aBoolean256 = true;
		super.anInt3794 = 0;
		super.aBoolean255 = true;
		super.aBoolean250 = true;
		super.anInt3796 = 0;
		super.anInt3777 = 0;
		super.anInt3792 = 255;
		super.aBoolean254 = true;
		super.aBoolean247 = true;
		super.anInt3779 = 0;
		super.anInt3790 = 127;
		super.aBoolean253 = true;
		if (Static177.anInt3052 < 96) {
			Static199.method2678(0);
		} else {
			Static199.method2678(2);
		}
		super.aBoolean257 = true;
		super.anInt3791 = 0;
		super.aBoolean246 = true;
		super.anInt3787 = 2;
		super.aBoolean262 = false;
		super.aBoolean245 = false;
		super.anInt3776 = 0;
		super.anInt3793 = Static138.anInt2443 == 1 ? 2 : 4;
		super.aBoolean261 = false;
		super.anInt3795 = 2;
		@Pc(129) Class178 local129 = null;
		try {
			@Pc(135) Class91 local135 = arg0.method3921("", true);
			while (local135.anInt2446 == 0) {
				Static429.method5376(1L);
			}
			if (local135.anInt2446 == 1) {
				local129 = (Class178) local135.anObject3;
				@Pc(160) byte[] local160 = new byte[(int) local129.method3780()];
				@Pc(175) int local175;
				for (@Pc(162) int local162 = 0; local162 < local160.length; local162 += local175) {
					local175 = local129.method3777(local162, local160.length - local162, local160);
					if (local175 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method3048(new Class2_Sub13(local160));
			}
		} catch (@Pc(205) Exception local205) {
		}
		try {
			if (local129 != null) {
				local129.method3779();
			}
		} catch (@Pc(212) Exception local212) {
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILclient!or;)V")
	public void method3041(@OriginalArg(1) Class183 arg0) {
		@Pc(7) Class178 local7 = null;
		try {
			@Pc(15) Class91 local15 = arg0.method3921("", true);
			while (local15.anInt2446 == 0) {
				Static429.method5376(1L);
			}
			if (local15.anInt2446 == 1) {
				local7 = (Class178) local15.anObject3;
				@Pc(35) Class2_Sub13 local35 = this.method3044();
				local7.method3782(local35.anInt4347, local35.aByteArray52, 0);
			}
		} catch (@Pc(45) Exception local45) {
		}
		try {
			if (local7 != null) {
				local7.method3779();
			}
		} catch (@Pc(56) Exception local56) {
		}
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(II)Z")
	public boolean method3042(@OriginalArg(1) int arg0) {
		return arg0 == 0 ? super.aBoolean252 : true;
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)Lclient!sv;")
	public Class2_Sub13 method3044() {
		@Pc(8) Class2_Sub13 local8 = new Class2_Sub13(41);
		local8.method3602(17);
		local8.method3602(super.anInt3784);
		local8.method3602(super.aBoolean252 ? 1 : 0);
		local8.method3602(super.aBoolean256 ? 1 : 0);
		local8.method3602(super.aBoolean254 ? 1 : 0);
		local8.method3602(super.aBoolean258 ? 1 : 0);
		local8.method3602(0);
		local8.method3602(super.aBoolean250 ? 1 : 0);
		local8.method3602(super.aBoolean253 ? 1 : 0);
		local8.method3602(super.aBoolean255 ? 1 : 0);
		local8.method3602(super.anInt3786);
		local8.method3602(super.anInt3794);
		local8.method3602(super.aBoolean259 ? 1 : 0);
		local8.method3602(super.aBoolean251 ? 1 : 0);
		local8.method3602(super.aBoolean247 ? 1 : 0);
		local8.method3602(super.aBoolean248 ? 1 : 0);
		local8.method3602(super.anInt3781);
		local8.method3602(super.aBoolean249 ? 1 : 0);
		local8.method3602(super.anInt3778);
		local8.method3602(super.anInt3792);
		local8.method3602(super.anInt3790);
		local8.method3568(super.anInt3779);
		local8.method3568(super.anInt3777);
		local8.method3602(Static194.method2631());
		local8.method3569(super.anInt3791);
		local8.method3602(super.anInt3787);
		local8.method3602(super.aBoolean262 ? 1 : 0);
		local8.method3602(super.aBoolean245 ? 1 : 0);
		local8.method3602(super.anInt3776);
		local8.method3602(super.aBoolean261 ? 1 : 0);
		local8.method3602(super.aBoolean257 ? 1 : 0);
		local8.method3602(super.anInt3783);
		local8.method3602(super.aBoolean246 ? 1 : 0);
		local8.method3602(super.anInt3795);
		local8.method3602(super.anInt3793);
		local8.method3602(super.aBoolean260 ? 1 : 0);
		return local8;
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(II)Z")
	public boolean method3047(@OriginalArg(0) int arg0) {
		return arg0 == 0 && !this.aBoolean264 ? super.aBoolean252 : true;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILclient!sv;)V")
	private void method3048(@OriginalArg(1) Class2_Sub13 arg0) {
		if (arg0.aByteArray52.length - arg0.anInt4347 < 1) {
			return;
		}
		@Pc(26) int local26 = arg0.method3580();
		if (local26 < 0 || local26 > 17) {
			return;
		}
		@Pc(42) byte local42;
		if (local26 == 17) {
			local42 = 40;
		} else if (local26 == 16) {
			local42 = 38;
		} else if (local26 == 15) {
			local42 = 37;
		} else if (local26 == 14) {
			local42 = 36;
		} else if (local26 == 13) {
			local42 = 35;
		} else if (local26 == 12) {
			local42 = 34;
		} else if (local26 == 11) {
			local42 = 33;
		} else if (local26 == 10) {
			local42 = 32;
		} else if (local26 == 9) {
			local42 = 31;
		} else if (local26 == 8) {
			local42 = 30;
		} else if (local26 == 7) {
			local42 = 29;
		} else if (local26 == 6) {
			local42 = 28;
		} else if (local26 == 5) {
			local42 = 28;
		} else if (local26 == 4) {
			local42 = 24;
		} else if (local26 == 3) {
			local42 = 23;
		} else if (local26 == 2) {
			local42 = 22;
		} else if (local26 == 1) {
			local42 = 23;
		} else {
			local42 = 19;
		}
		if (arg0.aByteArray52.length - arg0.anInt4347 < local42) {
			return;
		}
		super.anInt3784 = arg0.method3580();
		if (super.anInt3784 < 1) {
			super.anInt3784 = 1;
		} else if (super.anInt3784 > 4) {
			super.anInt3784 = 4;
		}
		this.method3050(arg0.method3580() == 1);
		super.aBoolean256 = arg0.method3580() == 1;
		super.aBoolean254 = arg0.method3580() == 1;
		super.aBoolean258 = arg0.method3580() == 1;
		super.anInt3783 = arg0.method3580() == 1 ? 1 : 0;
		super.aBoolean250 = arg0.method3580() == 1;
		super.aBoolean253 = arg0.method3580() == 1;
		super.aBoolean255 = arg0.method3580() == 1;
		super.anInt3786 = arg0.method3580();
		if (super.anInt3786 > 2) {
			super.anInt3786 = 2;
		}
		if (local26 >= 17) {
			super.anInt3794 = arg0.method3580();
		}
		if (local26 < 2) {
			super.aBoolean259 = arg0.method3580() == 1;
			arg0.method3580();
		} else {
			super.aBoolean259 = arg0.method3580() == 1;
			if (local26 >= 17) {
				super.aBoolean251 = arg0.method3580() == 1;
			}
		}
		super.aBoolean247 = arg0.method3580() == 1;
		super.aBoolean248 = arg0.method3580() == 1;
		super.anInt3781 = arg0.method3580();
		if (super.anInt3781 > 2) {
			super.anInt3781 = 2;
		}
		super.anInt3796 = super.anInt3781;
		super.aBoolean249 = arg0.method3580() == 1;
		super.anInt3778 = arg0.method3580();
		if (super.anInt3778 > 127) {
			super.anInt3778 = 127;
		}
		super.anInt3792 = arg0.method3580();
		super.anInt3790 = arg0.method3580();
		if (super.anInt3790 > 127) {
			super.anInt3790 = 127;
		}
		if (local26 >= 1) {
			super.anInt3779 = arg0.method3555();
			super.anInt3777 = arg0.method3555();
		}
		if (local26 >= 3 && local26 < 6) {
			arg0.method3580();
		}
		@Pc(485) int local485;
		if (local26 >= 4) {
			local485 = arg0.method3580();
			if (local485 < 0 || local485 > 2) {
				local485 = 0;
			}
			if (Static177.anInt3052 < 96) {
				local485 = 0;
			}
			Static199.method2678(local485);
		}
		if (local26 >= 5) {
			super.anInt3791 = arg0.method3574();
		}
		local485 = 0;
		if (local26 >= 6) {
			super.anInt3787 = local485 = arg0.method3580();
		}
		if (super.anInt3787 != 1 && super.anInt3787 != 2) {
			super.anInt3787 = 2;
		}
		if (local26 >= 7) {
			super.aBoolean262 = arg0.method3580() == 1;
		}
		if (local26 >= 8) {
			super.aBoolean245 = arg0.method3580() == 1;
		}
		if (local26 >= 9) {
			super.anInt3776 = arg0.method3580();
		}
		if (super.anInt3776 < 0 || super.anInt3776 > Static82.method1188(Static177.anInt3052)) {
			super.anInt3776 = 0;
		}
		if (local26 >= 10) {
			super.aBoolean261 = arg0.method3580() != 0;
		}
		if (local26 >= 11) {
			super.aBoolean257 = arg0.method3580() != 0;
		}
		if (local26 >= 12) {
			super.anInt3783 = arg0.method3580();
		}
		if (super.anInt3783 < 0 || super.anInt3783 > 2) {
			super.anInt3783 = 1;
		}
		if (local26 >= 13) {
			super.aBoolean246 = arg0.method3580() == 1;
		}
		if (local26 >= 14) {
			super.anInt3795 = arg0.method3580();
		} else if (local485 == 0) {
			super.anInt3795 = 2;
		} else {
			super.anInt3795 = 1;
		}
		if (super.anInt3795 < 0 || super.anInt3795 > 3) {
			super.anInt3795 = 2;
		}
		if (local26 >= 15) {
			super.anInt3793 = arg0.method3580();
			if (super.anInt3793 < 0 || super.anInt3793 > 4) {
				super.anInt3793 = Static138.anInt2443 == 1 ? 2 : 4;
			}
		}
		if (local26 >= 16) {
			super.aBoolean260 = arg0.method3580() == 1;
			try {
				if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
					super.aBoolean260 = false;
				}
			} catch (@Pc(751) Throwable local751) {
			}
		}
		if (local26 < 17 && super.anInt3795 == 0) {
			super.anInt3795 = 2;
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IZ)V")
	public void method3050(@OriginalArg(1) boolean arg0) {
		super.aBoolean252 = arg0;
		if (Static50.aClass190_1 != null) {
			Static50.aClass190_1.method4214(!this.method3047(Static288.anInt4743));
		}
	}

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "(II)I")
	public int method3051(@OriginalArg(1) int arg0) {
		if (this.aBoolean263) {
			return 0;
		} else if (this.method3047(arg0)) {
			return super.aBoolean256 ? 2 : 1;
		} else {
			return 1;
		}
	}
}
