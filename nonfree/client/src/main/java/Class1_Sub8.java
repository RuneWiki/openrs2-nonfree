import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public final class Class1_Sub8 extends Class1 {

	@OriginalMember(owner = "client!cq", name = "o", descriptor = "I")
	public int anInt1021 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!cq", name = "p", descriptor = "I")
	public int anInt1022 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!cq", name = "q", descriptor = "I")
	public int anInt1023 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!cq", name = "v", descriptor = "I")
	public int anInt1028 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!cq", name = "r", descriptor = "I")
	public int anInt1024 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!cq", name = "x", descriptor = "I")
	public int anInt1029 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!cq", name = "z", descriptor = "I")
	public int anInt1030 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!cq", name = "B", descriptor = "I")
	public int anInt1031 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!cq", name = "w", descriptor = "Lclient!cn;")
	public final Class1_Sub7 aClass1_Sub7_1;

	static {
		new Class151("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
	}

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lclient!cn;)V")
	public Class1_Sub8(@OriginalArg(0) Class1_Sub7 arg0) {
		this.aClass1_Sub7_1 = arg0;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(III)Z")
	public boolean method863(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= this.anInt1022 && this.anInt1031 >= arg0 && arg1 >= this.anInt1029 && this.anInt1023 >= arg1) {
			return true;
		} else {
			return arg0 >= this.anInt1024 && arg0 <= this.anInt1030 && arg1 >= this.anInt1028 && arg1 <= this.anInt1021;
		}
	}
}
