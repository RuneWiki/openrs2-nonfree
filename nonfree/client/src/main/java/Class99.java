import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class99 implements Interface2 {

	@OriginalMember(owner = "client!ia", name = "o", descriptor = "Lclient!ld;")
	public static final Class135 aClass135_21;

	@OriginalMember(owner = "client!ia", name = "p", descriptor = "Lclient!h;")
	public static final Class89 aClass89_110;

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "Lclient!jm;")
	private final Class116 aClass116_4 = new Class116(256);

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "Lclient!r;")
	private final Class197 aClass197_36;

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "Lclient!r;")
	private final Class197 aClass197_38;

	@OriginalMember(owner = "client!ia", name = "m", descriptor = "[Lclient!uc;")
	private final Class229[] aClass229Array1;

	static {
		new Class79("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
		aClass135_21 = new Class135();
		aClass89_110 = new Class89(8, 2);
	}

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lclient!r;Lclient!r;Lclient!r;)V", line = 277)
	public Class99(@OriginalArg(0) Class197 arg0, @OriginalArg(1) Class197 arg1, @OriginalArg(2) Class197 arg2) {
		this.aClass197_36 = arg2;
		this.aClass197_38 = arg1;
		@Pc(24) Class2_Sub4 local24 = new Class2_Sub4(arg0.method5090(0, 0));
		@Pc(28) int local28 = local24.method4830();
		this.aClass229Array1 = new Class229[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method4816() == 1) {
				this.aClass229Array1[local34] = new Class229();
			}
		}
		for (@Pc(54) int local54 = 0; local54 < local28; local54++) {
			if (this.aClass229Array1[local54] != null) {
				this.aClass229Array1[local54].aBoolean438 = local24.method4816() == 0;
			}
		}
		for (@Pc(82) int local82 = 0; local82 < local28; local82++) {
			if (this.aClass229Array1[local82] != null) {
				this.aClass229Array1[local82].aBoolean442 = local24.method4816() == 1;
			}
		}
		for (@Pc(112) int local112 = 0; local112 < local28; local112++) {
			if (this.aClass229Array1[local112] != null) {
				this.aClass229Array1[local112].aBoolean441 = local24.method4816() == 1;
			}
		}
		for (@Pc(138) int local138 = 0; local138 < local28; local138++) {
			if (this.aClass229Array1[local138] != null) {
				this.aClass229Array1[local138].aBoolean435 = local24.method4816() == 1;
			}
		}
		for (@Pc(166) int local166 = 0; local166 < local28; local166++) {
			if (this.aClass229Array1[local166] != null) {
				this.aClass229Array1[local166].aByte70 = local24.method4826();
			}
		}
		for (@Pc(187) int local187 = 0; local187 < local28; local187++) {
			if (this.aClass229Array1[local187] != null) {
				this.aClass229Array1[local187].aByte71 = local24.method4826();
			}
		}
		for (@Pc(208) int local208 = 0; local208 < local28; local208++) {
			if (this.aClass229Array1[local208] != null) {
				this.aClass229Array1[local208].aByte67 = local24.method4826();
			}
		}
		for (@Pc(229) int local229 = 0; local229 < local28; local229++) {
			if (this.aClass229Array1[local229] != null) {
				this.aClass229Array1[local229].aByte72 = local24.method4826();
			}
		}
		for (@Pc(250) int local250 = 0; local250 < local28; local250++) {
			if (this.aClass229Array1[local250] != null) {
				this.aClass229Array1[local250].aShort87 = (short) local24.method4830();
			}
		}
		for (@Pc(272) int local272 = 0; local272 < local28; local272++) {
			if (this.aClass229Array1[local272] != null) {
				this.aClass229Array1[local272].aByte68 = local24.method4826();
			}
		}
		for (@Pc(297) int local297 = 0; local297 < local28; local297++) {
			if (this.aClass229Array1[local297] != null) {
				this.aClass229Array1[local297].aByte69 = local24.method4826();
			}
		}
		for (@Pc(322) int local322 = 0; local322 < local28; local322++) {
			if (this.aClass229Array1[local322] != null) {
				this.aClass229Array1[local322].aBoolean440 = local24.method4816() == 1;
			}
		}
		for (@Pc(354) int local354 = 0; local354 < local28; local354++) {
			if (this.aClass229Array1[local354] != null) {
				this.aClass229Array1[local354].aBoolean443 = local24.method4816() == 1;
			}
		}
		for (@Pc(382) int local382 = 0; local382 < local28; local382++) {
			if (this.aClass229Array1[local382] != null) {
				this.aClass229Array1[local382].aByte66 = local24.method4826();
			}
		}
		for (@Pc(403) int local403 = 0; local403 < local28; local403++) {
			if (this.aClass229Array1[local403] != null) {
				this.aClass229Array1[local403].aBoolean436 = local24.method4816() == 1;
			}
		}
		for (@Pc(433) int local433 = 0; local433 < local28; local433++) {
			if (this.aClass229Array1[local433] != null) {
				this.aClass229Array1[local433].aBoolean439 = local24.method4816() == 1;
			}
		}
		for (@Pc(465) int local465 = 0; local465 < local28; local465++) {
			if (this.aClass229Array1[local465] != null) {
				this.aClass229Array1[local465].aBoolean437 = local24.method4816() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(FIIZII)[I", line = 53)
	@Override
	public int[] method2658(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method2666(arg3).method4961(this, this.aClass197_36, (double) arg0, this.aClass229Array1[arg3].aBoolean443, arg2, arg1);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)Z", line = 69)
	@Override
	public boolean method2659(@OriginalArg(1) int arg0) {
		@Pc(13) Class2_Sub2_Sub14 local13 = this.method2666(arg0);
		return local13 != null && local13.method4958(this, this.aClass197_36);
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(II)Lclient!qm;", line = 250)
	private Class2_Sub2_Sub14 method2666(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub2 local15 = this.aClass116_4.method3153((long) arg0);
		if (local15 != null) {
			return (Class2_Sub2_Sub14) local15;
		}
		@Pc(26) byte[] local26 = this.aClass197_38.method5083(arg0);
		if (local26 == null) {
			return null;
		} else {
			@Pc(38) Class2_Sub2_Sub14 local38 = new Class2_Sub2_Sub14(new Class2_Sub4(local26));
			this.aClass116_4.method3156(local38, (long) arg0);
			return local38;
		}
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(II)Lclient!uc;", line = 473)
	@Override
	public Class229 method2660(@OriginalArg(1) int arg0) {
		return this.aClass229Array1[arg0];
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BZIIFI)[F", line = 491)
	@Override
	public float[] method2662(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3) {
		return this.method2666(arg0).method4957(this.aClass197_36, this, this.aClass229Array1[arg0].aBoolean443, arg1, arg3);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZIIFI)[I", line = 501)
	@Override
	public int[] method2661(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4) {
		return this.method2666(arg0).method4959(this.aClass229Array1[arg0].aBoolean443, (double) arg3, arg4, arg2, this.aClass197_36, arg1, this);
	}
}
