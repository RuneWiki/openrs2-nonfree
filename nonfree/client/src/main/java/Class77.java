import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class77 {

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "Z")
	public boolean aBoolean188;

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "I")
	public int anInt2520;

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "I")
	public int anInt2521;

	@OriginalMember(owner = "client!eq", name = "g", descriptor = "I")
	public int anInt2522;

	@OriginalMember(owner = "client!eq", name = "i", descriptor = "I")
	public int anInt2524;

	@OriginalMember(owner = "client!eq", name = "l", descriptor = "I")
	public int anInt2526;

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "I")
	public int anInt2518 = 8;

	@OriginalMember(owner = "client!eq", name = "h", descriptor = "I")
	public int anInt2523 = 16777215;

	static {
		new Class67(null, "geschickt werden.", null, null);
		new Class67("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IILclient!rt;)V")
	private void method2160(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 == 1) {
			this.anInt2518 = arg1.method7591();
		} else if (arg0 == 2) {
			this.aBoolean188 = true;
		} else if (arg0 == 3) {
			this.anInt2522 = arg1.method7604();
			this.anInt2521 = arg1.method7604();
			this.anInt2520 = arg1.method7604();
		} else if (arg0 == 4) {
			this.anInt2524 = arg1.method7548();
		} else if (arg0 == 5) {
			this.anInt2526 = arg1.method7591();
		} else if (arg0 == 6) {
			this.anInt2523 = arg1.method7551();
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!rt;I)V")
	public void method2162(@OriginalArg(0) Class3_Sub27 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method7548();
			if (local7 == 0) {
				return;
			}
			this.method2160(local7, arg0);
		}
	}
}
