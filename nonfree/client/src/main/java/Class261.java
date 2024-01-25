import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class261 {

	@OriginalMember(owner = "client!ng", name = "y", descriptor = "Lclient!pp;")
	public Class295 aClass295_2;

	@OriginalMember(owner = "client!ng", name = "w", descriptor = "I")
	public int anInt6644 = 0;

	@OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
	public int anInt6654 = 0;

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
	private int anInt6645 = -1;

	@OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
	private int anInt6655 = -1;

	@OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
	public int anInt6657 = 70;

	@OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
	private int anInt6658 = -1;

	@OriginalMember(owner = "client!ng", name = "i", descriptor = "Ljava/lang/String;")
	private String aString87 = "";

	@OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
	public int anInt6662 = -1;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
	private int anInt6664 = -1;

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
	public int anInt6648 = -1;

	@OriginalMember(owner = "client!ng", name = "t", descriptor = "I")
	public int anInt6661 = 0;

	@OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
	public int anInt6665 = 16777215;

	@OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
	public int anInt6666 = -1;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IILclient!ika;)V")
	private void method5766(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 1) {
			this.anInt6666 = arg1.method2028(-14795);
		} else if (arg0 == 2) {
			this.anInt6665 = arg1.method2061();
		} else if (arg0 == 3) {
			this.anInt6664 = arg1.method2028(-14795);
		} else if (arg0 == 4) {
			this.anInt6655 = arg1.method2028(-14795);
		} else if (arg0 == 5) {
			this.anInt6658 = arg1.method2028(-14795);
		} else if (arg0 == 6) {
			this.anInt6645 = arg1.method2028(-14795);
		} else if (arg0 == 7) {
			this.anInt6654 = arg1.method2017();
		} else if (arg0 == 8) {
			this.aString87 = arg1.method2027();
		} else if (arg0 == 9) {
			this.anInt6657 = arg1.method2028(-14795);
		} else if (arg0 == 10) {
			this.anInt6661 = arg1.method2017();
		} else if (arg0 == 11) {
			this.anInt6648 = 0;
		} else if (arg0 == 12) {
			this.anInt6662 = arg1.method2048(255);
		} else if (arg0 == 13) {
			this.anInt6644 = arg1.method2017();
		} else if (arg0 == 14) {
			this.anInt6648 = arg1.method2028(-14795);
			return;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!ika;Z)V")
	public void method5767(@OriginalArg(0) Class3_Sub2 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method2048(255);
			if (local14 == 0) {
				return;
			}
			this.method5766(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(II)Ljava/lang/String;")
	public String method5768(@OriginalArg(1) int arg0) {
		@Pc(14) String local14 = this.aString87;
		while (true) {
			@Pc(20) int local20 = local14.indexOf("%1");
			if (local20 < 0) {
				return local14;
			}
			local14 = local14.substring(0, local20) + Static619.method7940(false, arg0) + local14.substring(local20 + 2);
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!ha;B)Lclient!kw;")
	public Class178 method5771(@OriginalArg(0) Class22 arg0) {
		if (this.anInt6645 < 0) {
			return null;
		}
		@Pc(19) Class178 local19 = (Class178) this.aClass295_2.aClass307_77.method7002((long) this.anInt6645);
		if (local19 == null) {
			this.method5773(arg0);
			local19 = (Class178) this.aClass295_2.aClass307_77.method7002((long) this.anInt6645);
		}
		return local19;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!ha;I)V")
	private void method5773(@OriginalArg(0) Class22 arg0) {
		@Pc(7) Class182 local7 = this.aClass295_2.aClass182_101;
		@Pc(37) Class361 local37;
		if (this.anInt6664 >= 0 && this.aClass295_2.aClass307_77.method7002((long) this.anInt6664) == null && local7.method3964(this.anInt6664)) {
			local37 = Static735.method8272(local7, this.anInt6664);
			this.aClass295_2.aClass307_77.method7000(arg0.method9363(local37, true), (long) this.anInt6664);
		}
		if (this.anInt6658 >= 0 && this.aClass295_2.aClass307_77.method7002((long) this.anInt6658) == null && local7.method3964(this.anInt6658)) {
			local37 = Static735.method8272(local7, this.anInt6658);
			this.aClass295_2.aClass307_77.method7000(arg0.method9363(local37, true), (long) this.anInt6658);
		}
		if (this.anInt6655 >= 0 && this.aClass295_2.aClass307_77.method7002((long) this.anInt6655) == null && local7.method3964(this.anInt6655)) {
			local37 = Static735.method8272(local7, this.anInt6655);
			this.aClass295_2.aClass307_77.method7000(arg0.method9363(local37, true), (long) this.anInt6655);
		}
		if (this.anInt6645 >= 0 && this.aClass295_2.aClass307_77.method7002((long) this.anInt6645) == null && local7.method3964(this.anInt6645)) {
			local37 = Static735.method8272(local7, this.anInt6645);
			this.aClass295_2.aClass307_77.method7000(arg0.method9363(local37, true), (long) this.anInt6645);
		}
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(ILclient!ha;)Lclient!kw;")
	public Class178 method5774(@OriginalArg(1) Class22 arg0) {
		if (this.anInt6655 < 0) {
			return null;
		}
		@Pc(22) Class178 local22 = (Class178) this.aClass295_2.aClass307_77.method7002((long) this.anInt6655);
		if (local22 == null) {
			this.method5773(arg0);
			local22 = (Class178) this.aClass295_2.aClass307_77.method7002((long) this.anInt6655);
		}
		return local22;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILclient!ha;)Lclient!kw;")
	public Class178 method5775(@OriginalArg(1) Class22 arg0) {
		if (this.anInt6664 < 0) {
			return null;
		}
		@Pc(28) Class178 local28 = (Class178) this.aClass295_2.aClass307_77.method7002((long) this.anInt6664);
		if (local28 == null) {
			this.method5773(arg0);
			local28 = (Class178) this.aClass295_2.aClass307_77.method7002((long) this.anInt6664);
		}
		return local28;
	}

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "(ILclient!ha;)Lclient!kw;")
	public Class178 method5777(@OriginalArg(1) Class22 arg0) {
		if (this.anInt6658 < 0) {
			return null;
		}
		@Pc(26) Class178 local26 = (Class178) this.aClass295_2.aClass307_77.method7002((long) this.anInt6658);
		if (local26 == null) {
			this.method5773(arg0);
			local26 = (Class178) this.aClass295_2.aClass307_77.method7002((long) this.anInt6658);
		}
		return local26;
	}
}
