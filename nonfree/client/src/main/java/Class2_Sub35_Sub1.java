import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class2_Sub35_Sub1 extends Class2_Sub35 {

	@OriginalMember(owner = "client!rn", name = "lb", descriptor = "[[[B")
	public static byte[][][] lb;

	@OriginalMember(owner = "client!rn", name = "vb", descriptor = "I")
	public int anInt7527;

	@OriginalMember(owner = "client!rn", name = "ib", descriptor = "Z")
	public boolean aBoolean643 = false;

	@OriginalMember(owner = "client!rn", name = "bb", descriptor = "Z")
	public boolean aBoolean642 = false;

	@OriginalMember(owner = "client!rn", name = "rb", descriptor = "Z")
	public boolean aBoolean644 = false;

	@OriginalMember(owner = "client!rn", name = "tb", descriptor = "Z")
	public boolean aBoolean645 = false;

	@OriginalMember(owner = "client!rn", name = "zb", descriptor = "Z")
	public boolean aBoolean647 = false;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lclient!ew;)V")
	public Class2_Sub35_Sub1(@OriginalArg(0) Class99 arg0) {
		super.anInt7487 = 3;
		super.anInt7508 = 3;
		this.method6050(true);
		super.aBoolean636 = false;
		super.anInt7512 = 127;
		super.anInt7495 = 127;
		super.aBoolean625 = true;
		super.anInt7490 = 127;
		super.aBoolean630 = true;
		super.anInt7502 = 0;
		super.aBoolean633 = true;
		super.anInt7504 = 2;
		super.aBoolean637 = true;
		super.anInt7494 = 0;
		super.anInt7498 = 0;
		super.anInt7503 = 0;
		super.aBoolean632 = true;
		super.aBoolean640 = true;
		super.anInt7499 = 127;
		super.anInt7505 = 127;
		super.anInt7510 = 1;
		super.aBoolean626 = true;
		super.anInt7511 = 0;
		super.aBoolean639 = true;
		super.aBoolean631 = true;
		super.aBoolean634 = true;
		if (Static326.anInt7462 < 96) {
			Static310.method4442(0);
		} else {
			Static310.method4442(2);
		}
		super.anInt7492 = Static346.anInt5966 == 1 ? 2 : 4;
		super.anInt7496 = 0;
		super.aBoolean635 = false;
		super.aBoolean629 = true;
		super.anInt7501 = 0;
		super.aBoolean641 = true;
		super.anInt7497 = 2;
		super.anInt7491 = 2;
		super.anInt7506 = 0;
		super.aBoolean638 = false;
		super.aBoolean628 = false;
		@Pc(148) Class317 local148 = null;
		try {
			@Pc(154) Class5 local154 = arg0.method1789(true, "");
			while (local154.anInt151 == 0) {
				Static263.method3671(1L);
			}
			if (local154.anInt151 == 1) {
				local148 = (Class317) local154.anObject1;
				@Pc(179) byte[] local179 = new byte[(int) local148.method6334()];
				@Pc(194) int local194;
				for (@Pc(181) int local181 = 0; local181 < local179.length; local181 += local194) {
					local194 = local148.method6331(local179.length - local181, local179, local181);
					if (local194 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method6054(new Class2_Sub7(local179));
			}
		} catch (@Pc(219) Exception local219) {
		}
		try {
			if (local148 != null) {
				local148.method6333();
			}
		} catch (@Pc(226) Exception local226) {
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
	public void method6039() {
		this.method6050(true);
		super.aBoolean636 = false;
		super.aBoolean631 = false;
		super.aBoolean632 = false;
		super.anInt7510 = 0;
		super.aBoolean640 = false;
		super.aBoolean637 = false;
		super.anInt7504 = super.anInt7503 = 0;
		super.aBoolean626 = false;
		super.aBoolean624 = false;
		super.aBoolean633 = false;
		super.aBoolean634 = false;
		super.aBoolean625 = false;
		super.aBoolean630 = true;
		super.anInt7494 = super.anInt7498 = 0;
		Static310.method4442(0);
		super.aBoolean628 = false;
		super.anInt7496 = 0;
		super.aBoolean629 = true;
		this.method6049();
		this.method6043(2);
		super.anInt7487 = 2;
		Static514.method6643();
		Static113.method1669();
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(B)V")
	public void method6040() {
		this.method6050(true);
		super.anInt7494 = super.anInt7498 = 0;
		super.aBoolean631 = true;
		super.anInt7510 = 1;
		super.aBoolean637 = true;
		super.aBoolean640 = true;
		super.aBoolean632 = true;
		super.aBoolean633 = true;
		super.aBoolean630 = true;
		super.anInt7504 = super.anInt7503 = 1;
		super.aBoolean624 = true;
		super.aBoolean626 = true;
		super.aBoolean636 = false;
		super.aBoolean625 = true;
		super.aBoolean634 = false;
		if (Static326.anInt7462 > 95) {
			Static310.method4442(1);
		} else {
			Static310.method4442(0);
		}
		super.aBoolean628 = false;
		super.aBoolean629 = true;
		super.anInt7496 = 0;
		this.method6049();
		this.method6043(1);
		super.anInt7487 = 3;
		Static514.method6643();
		Static113.method1669();
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(II)I")
	public int method6041(@OriginalArg(0) int arg0) {
		if (this.aBoolean642) {
			return 0;
		} else if (this.method6053(arg0)) {
			return super.aBoolean631 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "(II)V")
	public void method6043(@OriginalArg(1) int arg0) {
		Static6.aBoolean15 = true;
		super.anInt7501 = arg0;
		Static329.aClass311Array1 = null;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(BI)Z")
	public boolean method6045(@OriginalArg(1) int arg0) {
		return arg0 == 0 ? super.aBoolean627 : true;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(III)I")
	private int method6046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) byte local20;
		if (arg0 > 20000) {
			local20 = 4;
			this.method6055();
		} else if (arg0 > 10000) {
			this.method6040();
			local20 = 3;
		} else if (arg0 > 5000) {
			local20 = 2;
			this.method6039();
		} else {
			local20 = 1;
			this.method6047(true);
		}
		if (arg1 != Static226.anInt3318) {
			super.anInt7497 = arg1;
			Static368.method6714(arg1);
		}
		this.method6056(Static169.aClass99_2);
		return local20;
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(IZ)V")
	public void method6047(@OriginalArg(1) boolean arg0) {
		this.method6050(false);
		super.aBoolean631 = false;
		super.aBoolean630 = !Static18.aClass308_7.equals(Static278.aClass308_6);
		super.aBoolean625 = false;
		super.anInt7494 = super.anInt7498 = 0;
		super.aBoolean637 = false;
		super.aBoolean632 = false;
		super.aBoolean634 = false;
		super.aBoolean624 = false;
		super.aBoolean633 = false;
		super.aBoolean636 = false;
		super.aBoolean640 = false;
		super.anInt7510 = 0;
		super.aBoolean626 = false;
		super.anInt7504 = super.anInt7503 = 0;
		Static310.method4442(0);
		super.anInt7496 = 0;
		super.aBoolean629 = false;
		super.aBoolean628 = false;
		this.method6049();
		this.method6043(2);
		super.anInt7487 = 1;
		if (arg0) {
			Static514.method6643();
		}
		Static113.method1669();
	}

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "(I)I")
	public int method6048() {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(18) boolean local18 = false;
		if (Static169.aClass99_2.aBoolean151 && !Static169.aClass99_2.aBoolean149) {
			if (Static132.aString29.startsWith("win")) {
				local9 = true;
				if (!Static132.aString25.startsWith("amd64") && !Static132.aString25.startsWith("x86_64")) {
					local7 = true;
				}
				local18 = true;
			} else {
				local9 = true;
			}
		}
		if (this.aBoolean647) {
			local9 = false;
		}
		if (this.aBoolean644) {
			local7 = false;
		}
		if (this.aBoolean645) {
			local18 = false;
		}
		if (!local7 && !local9 && !local18) {
			return this.method6052();
		}
		@Pc(73) int local73 = -1;
		@Pc(75) int local75 = -1;
		@Pc(77) int local77 = -1;
		if (local7) {
			try {
				local73 = Static223.method2719(1000, 2);
			} catch (@Pc(86) Exception local86) {
			}
		}
		if (local18) {
			try {
				local77 = Static223.method2719(1000, 3);
				if (Static226.anInt3318 == 3) {
					@Pc(100) Class267 local100 = Static417.aClass162_17.method6863();
					@Pc(105) long local105 = local100.aLong186 & 0xFFFFFFFFFFFFL;
					@Pc(108) int local108 = local100.anInt6682;
					if (local108 == 4318) {
						local9 &= local105 >= 64425238954L;
					} else if (local108 == 4098) {
						local9 &= local105 >= 60129613779L;
					}
				}
			} catch (@Pc(142) Exception local142) {
			}
		}
		if (local9) {
			try {
				local75 = Static223.method2719(1000, 1);
			} catch (@Pc(152) Exception local152) {
			}
		}
		if (local73 == -1 && local75 == -1 && local77 == -1) {
			return this.method6052();
		}
		local77 = (int) ((float) local77 * 1.1F);
		local75 = (int) ((float) local75 * 1.1F);
		if (local73 > local77 && local75 < local73) {
			return this.method6057(local73);
		} else if (local75 >= local77) {
			return this.method6046(local75, 1);
		} else {
			return this.method6046(local77, 3);
		}
	}

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "(I)V")
	private void method6049() {
		if (Static346.anInt5966 <= 1) {
			super.anInt7492 = 2;
		} else {
			super.anInt7492 = 4;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZB)V")
	public void method6050(@OriginalArg(0) boolean arg0) {
		super.aBoolean627 = arg0;
		if (Static362.aClass290_2 != null) {
			Static362.aClass290_2.method5797(!this.method6053(Static226.anInt3318));
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZI)I")
	public int method6051(@OriginalArg(1) int arg0) {
		if (Static514.method6646(arg0) && !Static592.method7705(Static540.anInt8912)) {
			return Static326.anInt7462 < 96 && Static189.method2395(arg0) && super.anInt7501 == 0 ? 1 : super.anInt7501;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)I")
	private int method6052() {
		@Pc(15) byte local15;
		if (Static326.anInt7462 < 96) {
			local15 = 1;
			this.method6047(true);
		} else {
			@Pc(24) int local24 = Static410.method5541();
			if (local24 <= 100) {
				this.method6055();
				local15 = 4;
			} else if (local24 <= 500) {
				local15 = 3;
				this.method6040();
			} else if (local24 <= 1000) {
				local15 = 2;
				this.method6039();
			} else {
				this.method6047(true);
				local15 = 1;
			}
		}
		if (Static226.anInt3318 != 0) {
			super.anInt7497 = 0;
			Static368.method6714(0);
		}
		this.method6056(Static169.aClass99_2);
		return local15;
	}

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "(IZ)Z")
	public boolean method6053(@OriginalArg(0) int arg0) {
		return arg0 == 0 && !this.aBoolean643 ? super.aBoolean627 : true;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(BLclient!gk;)V")
	private void method6054(@OriginalArg(1) Class2_Sub7 arg0) {
		if (arg0.aByteArray52.length - arg0.anInt5186 < 1) {
			return;
		}
		@Pc(19) int local19 = arg0.method4464();
		if (local19 < 0 || local19 > 22) {
			return;
		}
		@Pc(32) byte local32;
		if (local19 == 22) {
			local32 = 45;
		} else if (local19 == 21) {
			local32 = 44;
		} else if (local19 == 20) {
			local32 = 43;
		} else if (local19 == 19) {
			local32 = 42;
		} else if (local19 == 18) {
			local32 = 41;
		} else if (local19 == 17) {
			local32 = 40;
		} else if (local19 == 16) {
			local32 = 38;
		} else if (local19 == 15) {
			local32 = 37;
		} else if (local19 == 14) {
			local32 = 36;
		} else if (local19 == 13) {
			local32 = 35;
		} else if (local19 == 12) {
			local32 = 34;
		} else if (local19 == 11) {
			local32 = 33;
		} else if (local19 == 10) {
			local32 = 32;
		} else if (local19 == 9) {
			local32 = 31;
		} else if (local19 == 8) {
			local32 = 30;
		} else if (local19 == 7) {
			local32 = 29;
		} else if (local19 == 6) {
			local32 = 28;
		} else if (local19 == 5) {
			local32 = 28;
		} else if (local19 == 4) {
			local32 = 24;
		} else if (local19 == 3) {
			local32 = 23;
		} else if (local19 == 2) {
			local32 = 22;
		} else if (local19 == 1) {
			local32 = 23;
		} else {
			local32 = 19;
		}
		if (arg0.aByteArray52.length - arg0.anInt5186 < local32) {
			return;
		}
		super.anInt7508 = arg0.method4464();
		if (super.anInt7508 < 1) {
			super.anInt7508 = 1;
		} else if (super.anInt7508 > 4) {
			super.anInt7508 = 4;
		}
		this.method6050(arg0.method4464() == 1);
		super.aBoolean631 = arg0.method4464() == 1;
		super.aBoolean630 = arg0.method4464() == 1;
		super.aBoolean632 = arg0.method4464() == 1;
		super.anInt7510 = arg0.method4464() == 1 ? 1 : 0;
		super.aBoolean625 = arg0.method4464() == 1;
		super.aBoolean637 = arg0.method4464() == 1;
		super.aBoolean640 = arg0.method4464() == 1;
		super.anInt7504 = arg0.method4464();
		if (super.anInt7504 > 2) {
			super.anInt7504 = 2;
		}
		if (local19 >= 17) {
			super.anInt7503 = arg0.method4464();
		}
		if (local19 >= 2) {
			super.aBoolean626 = arg0.method4464() == 1;
			if (local19 >= 17) {
				super.aBoolean636 = arg0.method4464() == 1;
			}
		} else {
			super.aBoolean626 = arg0.method4464() == 1;
			arg0.method4464();
		}
		super.aBoolean634 = arg0.method4464() == 1;
		super.aBoolean633 = arg0.method4464() == 1;
		super.anInt7494 = arg0.method4464();
		if (super.anInt7494 > 2) {
			super.anInt7494 = 2;
		}
		super.anInt7498 = super.anInt7494;
		super.aBoolean639 = arg0.method4464() == 1;
		super.anInt7505 = arg0.method4464();
		if (super.anInt7505 > 127) {
			super.anInt7505 = 127;
		}
		if (local19 >= 20) {
			super.anInt7495 = arg0.method4464();
			if (super.anInt7495 > 127) {
				super.anInt7495 = 127;
			}
		} else {
			super.anInt7495 = super.anInt7505;
		}
		super.anInt7490 = arg0.method4464();
		super.anInt7512 = arg0.method4464();
		if (super.anInt7512 > 127) {
			super.anInt7512 = 127;
		}
		if (local19 < 21) {
			super.anInt7499 = super.anInt7490;
		} else {
			super.anInt7499 = arg0.method4464();
			if (super.anInt7499 > 127) {
				super.anInt7499 = 127;
			}
		}
		if (local19 >= 1) {
			super.anInt7511 = arg0.method4518();
			super.anInt7502 = arg0.method4518();
		}
		if (local19 >= 3 && local19 < 6) {
			arg0.method4464();
		}
		@Pc(584) int local584;
		if (local19 >= 4) {
			local584 = arg0.method4464();
			if (local584 < 0 || local584 > 2) {
				local584 = 0;
			}
			if (Static326.anInt7462 < 96) {
				local584 = 0;
			}
			Static310.method4442(local584);
		}
		if (local19 >= 5) {
			super.anInt7506 = arg0.method4509();
		}
		local584 = 0;
		if (local19 >= 6) {
			super.anInt7491 = local584 = arg0.method4464();
		}
		if (super.anInt7491 != 1 && super.anInt7491 != 2) {
			super.anInt7491 = 2;
		}
		if (local19 >= 7) {
			super.aBoolean635 = arg0.method4464() == 1;
		}
		if (local19 >= 8) {
			super.aBoolean638 = arg0.method4464() == 1;
		}
		if (local19 >= 9) {
			super.anInt7496 = arg0.method4464();
		}
		if (super.anInt7496 < 0 || super.anInt7496 > Static253.method3610(Static326.anInt7462)) {
			super.anInt7496 = 0;
		}
		if (local19 >= 10) {
			super.aBoolean628 = arg0.method4464() != 0;
		}
		if (local19 >= 11) {
			super.aBoolean641 = arg0.method4464() != 0;
		}
		if (local19 >= 12) {
			super.anInt7510 = arg0.method4464();
		}
		if (super.anInt7510 < 0 || super.anInt7510 > 2) {
			super.anInt7510 = 1;
		}
		if (local19 >= 13) {
			super.aBoolean629 = arg0.method4464() == 1;
		}
		if (local19 >= 14) {
			super.anInt7497 = arg0.method4464();
		} else if (local584 == 0) {
			super.anInt7497 = 2;
		} else {
			super.anInt7497 = 1;
		}
		if (super.anInt7497 < 0 || super.anInt7497 > 5) {
			super.anInt7497 = 2;
		}
		if (local19 >= 15) {
			super.anInt7492 = arg0.method4464();
			if (super.anInt7492 < 0 || super.anInt7492 > 4) {
				super.anInt7492 = Static346.anInt5966 == 1 ? 2 : 4;
			}
		}
		if (local19 >= 16) {
			super.aBoolean624 = arg0.method4464() == 1;
			try {
				if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
					super.aBoolean624 = false;
				}
			} catch (@Pc(845) Throwable local845) {
			}
		}
		if (local19 < 17 && super.anInt7497 == 0) {
			super.anInt7497 = 2;
		}
		if (local19 >= 18) {
			super.anInt7487 = arg0.method4464();
			if (super.anInt7487 < 0 || super.anInt7487 > 4) {
				super.anInt7487 = 0;
			}
		}
		if (local19 >= 19) {
			super.anInt7501 = arg0.method4464();
		} else if (super.anInt7487 == 1 || super.anInt7487 == 2) {
			super.anInt7501 = 2;
		} else if (super.anInt7487 == 3) {
			super.anInt7501 = 1;
		} else {
			super.anInt7501 = 0;
		}
		if (local19 >= 22) {
			super.anInt7509 = arg0.method4464();
		}
		if (super.anInt7497 == 0 && Static326.anInt7462 < 96 && super.anInt7487 != 1 && super.anInt7487 != 0) {
			this.method6047(false);
		}
	}

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "(B)V")
	public void method6055() {
		this.method6050(true);
		super.aBoolean636 = true;
		super.anInt7504 = super.anInt7503 = 2;
		super.aBoolean640 = true;
		super.aBoolean634 = true;
		super.anInt7510 = 1;
		super.aBoolean631 = true;
		super.aBoolean624 = true;
		super.anInt7494 = super.anInt7498 = 0;
		super.aBoolean637 = true;
		super.aBoolean633 = true;
		super.aBoolean625 = true;
		super.aBoolean632 = true;
		super.aBoolean626 = true;
		super.aBoolean630 = true;
		if (Static326.anInt7462 > 95) {
			Static310.method4442(2);
		} else {
			Static310.method4442(0);
		}
		super.aBoolean628 = false;
		super.anInt7496 = 0;
		super.aBoolean629 = true;
		this.method6049();
		this.method6043(0);
		super.anInt7487 = 4;
		Static514.method6643();
		Static113.method1669();
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!ew;I)V")
	public void method6056(@OriginalArg(0) Class99 arg0) {
		@Pc(7) Class317 local7 = null;
		try {
			@Pc(13) Class5 local13 = arg0.method1789(true, "");
			while (local13.anInt151 == 0) {
				Static263.method3671(1L);
			}
			if (local13.anInt151 == 1) {
				local7 = (Class317) local13.anObject1;
				@Pc(42) Class2_Sub7 local42 = new Class2_Sub7(Static202.method2528());
				this.method6038(local42);
				local7.method6335(0, local42.anInt5186, local42.aByteArray52);
			}
		} catch (@Pc(56) Exception local56) {
		}
		try {
			if (local7 != null) {
				local7.method6333();
			}
		} catch (@Pc(63) Exception local63) {
		}
	}

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "(II)I")
	private int method6057(@OriginalArg(1) int arg0) {
		@Pc(16) byte local16;
		if (arg0 > 12000) {
			this.method6055();
			local16 = 4;
		} else if (arg0 > 5000) {
			this.method6040();
			local16 = 3;
		} else if (arg0 <= 2000) {
			local16 = 1;
			this.method6047(true);
		} else {
			this.method6039();
			local16 = 2;
		}
		if (Static226.anInt3318 != 2) {
			super.anInt7497 = 2;
			Static368.method6714(2);
		}
		this.method6056(Static169.aClass99_2);
		return local16;
	}
}
