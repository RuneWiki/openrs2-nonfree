import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class189 {

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "Lclient!d;")
	private final Class44 aClass44_50 = new Class44(128);

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "Lclient!um;")
	private final Class243 aClass243_171;

	static {
		new Class198("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!pt;ILclient!um;)V")
	public Class189(@OriginalArg(0) Class197 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class243 arg2) {
		this.aClass243_171 = arg2;
		if (this.aClass243_171 != null) {
			@Pc(20) int local20 = this.aClass243_171.method5478() - 1;
			this.aClass243_171.method5472(local20);
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)Lclient!s;")
	public Class218 method3856(@OriginalArg(1) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_50;
		@Pc(16) Class218 local16;
		synchronized (this.aClass44_50) {
			local16 = (Class218) this.aClass44_50.method1028((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(42) byte[] local42 = this.aClass243_171.method5455(Static259.method3338(arg0), Static125.method1760(arg0));
		local16 = new Class218();
		if (local42 != null) {
			local16.method4715(new Class5_Sub15(local42));
		}
		@Pc(58) Class44 local58 = this.aClass44_50;
		synchronized (this.aClass44_50) {
			this.aClass44_50.method1017((long) arg0, local16);
			return local16;
		}
	}
}
