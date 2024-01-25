import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public final class Class96 {

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "Lclient!cf;")
	private Class1 aClass1_101;

	@OriginalMember(owner = "client!gu", name = "k", descriptor = "J")
	private long aLong87;

	@OriginalMember(owner = "client!gu", name = "p", descriptor = "Lclient!cf;")
	private Class1 aClass1_102;

	@OriginalMember(owner = "client!gu", name = "o", descriptor = "I")
	private int anInt2724 = 0;

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "I")
	public final int anInt2715;

	@OriginalMember(owner = "client!gu", name = "g", descriptor = "[Lclient!cf;")
	public final Class1[] aClass1Array1;

	static {
		new Class7("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
		new Class7("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
	}

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(I)V")
	public Class96(@OriginalArg(0) int arg0) {
		this.anInt2715 = arg0;
		this.aClass1Array1 = new Class1[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_262 = local23;
			local23.aClass1_261 = local23;
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)I")
	public int method2333() {
		return this.anInt2715;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(B[Lclient!cf;)I")
	public int method2334(@OriginalArg(1) Class1[] arg0) {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2715; local7++) {
			@Pc(13) Class1 local13 = this.aClass1Array1[local7];
			for (@Pc(16) Class1 local16 = local13.aClass1_261; local16 != local13; local16 = local16.aClass1_261) {
				arg0[local5++] = local16;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(BJ)Lclient!cf;")
	public Class1 method2335(@OriginalArg(1) long arg0) {
		this.aLong87 = arg0;
		@Pc(18) Class1 local18 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt2715 - 1))];
		for (this.aClass1_101 = local18.aClass1_261; this.aClass1_101 != local18; this.aClass1_101 = this.aClass1_101.aClass1_261) {
			if (arg0 == this.aClass1_101.aLong222) {
				@Pc(36) Class1 local36 = this.aClass1_101;
				this.aClass1_101 = this.aClass1_101.aClass1_261;
				return local36;
			}
		}
		this.aClass1_101 = null;
		return null;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)V")
	public void method2338() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2715; local1++) {
			@Pc(7) Class1 local7 = this.aClass1Array1[local1];
			while (true) {
				@Pc(10) Class1 local10 = local7.aClass1_261;
				if (local10 == local7) {
					break;
				}
				local10.method6020();
			}
		}
		this.aClass1_101 = null;
		this.aClass1_102 = null;
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)Lclient!cf;")
	public Class1 method2339() {
		@Pc(22) Class1 local22;
		if (this.anInt2724 > 0 && this.aClass1Array1[this.anInt2724 - 1] != this.aClass1_102) {
			local22 = this.aClass1_102;
			this.aClass1_102 = local22.aClass1_261;
			return local22;
		}
		while (this.anInt2724 < this.anInt2715) {
			local22 = this.aClass1Array1[this.anInt2724++].aClass1_261;
			if (local22 != this.aClass1Array1[this.anInt2724 - 1]) {
				this.aClass1_102 = local22.aClass1_261;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(B)Lclient!cf;")
	public Class1 method2340() {
		if (this.aClass1_101 == null) {
			return null;
		}
		@Pc(21) Class1 local21 = this.aClass1Array1[(int) ((long) (this.anInt2715 - 1) & this.aLong87)];
		while (this.aClass1_101 != local21) {
			if (this.aClass1_101.aLong222 == this.aLong87) {
				@Pc(43) Class1 local43 = this.aClass1_101;
				this.aClass1_101 = this.aClass1_101.aClass1_261;
				return local43;
			}
			this.aClass1_101 = this.aClass1_101.aClass1_261;
		}
		this.aClass1_101 = null;
		return null;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(JLclient!cf;B)V")
	public void method2341(@OriginalArg(0) long arg0, @OriginalArg(1) Class1 arg1) {
		if (arg1.aClass1_262 != null) {
			arg1.method6020();
		}
		@Pc(21) Class1 local21 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt2715 - 1))];
		arg1.aClass1_261 = local21;
		arg1.aClass1_262 = local21.aClass1_262;
		arg1.aClass1_262.aClass1_261 = arg1;
		arg1.aClass1_261.aClass1_262 = arg1;
		arg1.aLong222 = arg0;
	}

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "(I)Lclient!cf;")
	public Class1 method2342() {
		this.anInt2724 = 0;
		return this.method2339();
	}

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "(I)I")
	public int method2343() {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2715; local7++) {
			@Pc(13) Class1 local13 = this.aClass1Array1[local7];
			@Pc(16) Class1 local16 = local13.aClass1_261;
			while (local16 != local13) {
				local16 = local16.aClass1_261;
				local5++;
			}
		}
		return local5;
	}
}
