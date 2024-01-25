import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class337 {

	@OriginalMember(owner = "client!sh", name = "z", descriptor = "Lclient!fl;")
	public Class116 aClass116_1;

	@OriginalMember(owner = "client!sh", name = "y", descriptor = "I")
	public int anInt9514 = 0;

	@OriginalMember(owner = "client!sh", name = "B", descriptor = "I")
	public int anInt9520 = 0;

	@OriginalMember(owner = "client!sh", name = "x", descriptor = "I")
	public int anInt9518 = 70;

	@OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
	public int anInt9519 = -1;

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "Ljava/lang/String;")
	private String aString123 = "";

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
	public int anInt9524 = 0;

	@OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
	private int anInt9525 = -1;

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
	public int anInt9532 = -1;

	@OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
	private int anInt9531 = -1;

	@OriginalMember(owner = "client!sh", name = "w", descriptor = "I")
	public int anInt9523 = 16777215;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
	private int anInt9534 = -1;

	@OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
	private int anInt9521 = -1;

	@OriginalMember(owner = "client!sh", name = "q", descriptor = "I")
	public int anInt9535 = -1;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IBLclient!rba;)V")
	private void method8025(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub28 arg1) {
		if (arg0 == 1) {
			this.anInt9519 = arg1.method5272();
		} else if (arg0 == 2) {
			this.anInt9523 = arg1.method5307();
		} else if (arg0 == 3) {
			this.anInt9534 = arg1.method5272();
		} else if (arg0 == 4) {
			this.anInt9521 = arg1.method5272();
		} else if (arg0 == 5) {
			this.anInt9531 = arg1.method5272();
		} else if (arg0 == 6) {
			this.anInt9525 = arg1.method5272();
		} else if (arg0 == 7) {
			this.anInt9524 = arg1.method5281();
		} else if (arg0 == 8) {
			this.aString123 = arg1.method5269();
		} else if (arg0 == 9) {
			this.anInt9518 = arg1.method5272();
		} else if (arg0 == 10) {
			this.anInt9520 = arg1.method5281();
		} else if (arg0 == 11) {
			this.anInt9535 = 0;
		} else if (arg0 == 12) {
			this.anInt9532 = arg1.method5322(-30);
		} else if (arg0 == 13) {
			this.anInt9514 = arg1.method5281();
		} else if (arg0 == 14) {
			this.anInt9535 = arg1.method5272();
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!ha;Z)Lclient!bka;")
	public Class9 method8026(@OriginalArg(0) Class67 arg0) {
		if (this.anInt9521 < 0) {
			return null;
		}
		@Pc(19) Class9 local19 = (Class9) this.aClass116_1.aClass338_13.method8049((long) this.anInt9521);
		if (local19 == null) {
			this.method8035(arg0);
			local19 = (Class9) this.aClass116_1.aClass338_13.method8049((long) this.anInt9521);
		}
		return local19;
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(ILclient!ha;)Lclient!bka;")
	public Class9 method8027(@OriginalArg(1) Class67 arg0) {
		if (this.anInt9534 < 0) {
			return null;
		}
		@Pc(28) Class9 local28 = (Class9) this.aClass116_1.aClass338_13.method8049((long) this.anInt9534);
		if (local28 == null) {
			this.method8035(arg0);
			local28 = (Class9) this.aClass116_1.aClass338_13.method8049((long) this.anInt9534);
		}
		return local28;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILclient!ha;)Lclient!bka;")
	public Class9 method8029(@OriginalArg(1) Class67 arg0) {
		if (this.anInt9531 < 0) {
			return null;
		}
		@Pc(22) Class9 local22 = (Class9) this.aClass116_1.aClass338_13.method8049((long) this.anInt9531);
		if (local22 == null) {
			this.method8035(arg0);
			local22 = (Class9) this.aClass116_1.aClass338_13.method8049((long) this.anInt9531);
		}
		return local22;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method8030(@OriginalArg(1) int arg0) {
		@Pc(8) String local8 = this.aString123;
		while (true) {
			@Pc(19) int local19 = local8.indexOf("%1");
			if (local19 < 0) {
				return local8;
			}
			local8 = local8.substring(0, local19) + Static350.method5060(false, arg0) + local8.substring(local19 + 2);
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BLclient!rba;)V")
	public void method8031(@OriginalArg(1) Class3_Sub28 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5322(-75);
			if (local5 == 0) {
				return;
			}
			this.method8025(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BLclient!ha;)Lclient!bka;")
	public Class9 method8034(@OriginalArg(1) Class67 arg0) {
		if (this.anInt9525 < 0) {
			return null;
		}
		@Pc(25) Class9 local25 = (Class9) this.aClass116_1.aClass338_13.method8049((long) this.anInt9525);
		if (local25 == null) {
			this.method8035(arg0);
			local25 = (Class9) this.aClass116_1.aClass338_13.method8049((long) this.anInt9525);
		}
		return local25;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!ha;I)V")
	private void method8035(@OriginalArg(0) Class67 arg0) {
		@Pc(7) Class221 local7 = this.aClass116_1.aClass221_49;
		@Pc(34) Class194 local34;
		if (this.anInt9534 >= 0 && this.aClass116_1.aClass338_13.method8049((long) this.anInt9534) == null && local7.method5068(this.anInt9534)) {
			local34 = Static728.method4751(local7, this.anInt9534);
			this.aClass116_1.aClass338_13.method8044((long) this.anInt9534, arg0.method7659(local34, true));
		}
		if (this.anInt9531 >= 0 && this.aClass116_1.aClass338_13.method8049((long) this.anInt9531) == null && local7.method5068(this.anInt9531)) {
			local34 = Static728.method4751(local7, this.anInt9531);
			this.aClass116_1.aClass338_13.method8044((long) this.anInt9531, arg0.method7659(local34, true));
		}
		if (this.anInt9521 >= 0 && this.aClass116_1.aClass338_13.method8049((long) this.anInt9521) == null && local7.method5068(this.anInt9521)) {
			local34 = Static728.method4751(local7, this.anInt9521);
			this.aClass116_1.aClass338_13.method8044((long) this.anInt9521, arg0.method7659(local34, true));
		}
		if (this.anInt9525 >= 0 && this.aClass116_1.aClass338_13.method8049((long) this.anInt9525) == null && local7.method5068(this.anInt9525)) {
			local34 = Static728.method4751(local7, this.anInt9525);
			this.aClass116_1.aClass338_13.method8044((long) this.anInt9525, arg0.method7659(local34, true));
		}
	}
}
