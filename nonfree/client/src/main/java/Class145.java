import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class145 {

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "I")
	public int anInt4346;

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
	private int anInt4347;

	@OriginalMember(owner = "client!nr", name = "h", descriptor = "I")
	public int anInt4352;

	static {
		new Class85("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(BILclient!rg;I)V")
	private void method4013(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub12 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt4347 = arg1.method5106();
		} else if (arg2 == 2) {
			this.anInt4346 = arg1.method5115();
			this.anInt4352 = arg1.method5115();
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(BLclient!rg;I)V")
	public void method4018(@OriginalArg(1) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(12) int local12 = arg0.method5115();
			if (local12 == 0) {
				return;
			}
			this.method4013(arg1, arg0, local12);
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Z)Lclient!jf;")
	public Class100 method4019() {
		@Pc(16) Class100 local16 = (Class100) Static37.aClass109_10.method2857((long) this.anInt4347);
		if (local16 != null) {
			return local16;
		}
		local16 = Static363.method2672(Static357.aClass93_140, this.anInt4347, 0);
		if (local16 != null) {
			Static37.aClass109_10.method2855((long) this.anInt4347, local16);
		}
		return local16;
	}
}
