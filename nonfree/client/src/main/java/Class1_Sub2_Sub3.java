import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class1_Sub2_Sub3 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ap", name = "x", descriptor = "Lclient!bj;")
	private Class27 aClass27_3;

	static {
		new Class84("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(III)I")
	public int method334(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass27_3 == null) {
			return arg0;
		} else {
			@Pc(24) Class1_Sub13 local24 = (Class1_Sub13) this.aClass27_3.method553((long) arg1);
			return local24 == null ? arg0 : local24.anInt2277;
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String method335(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass27_3 == null) {
			return arg1;
		} else {
			@Pc(16) Class1_Sub35 local16 = (Class1_Sub35) this.aClass27_3.method553((long) arg0);
			return local16 == null ? arg1 : local16.aString41;
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!lh;B)V")
	public void method337(@OriginalArg(0) Class1_Sub1 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4130();
			if (local5 == 0) {
				return;
			}
			this.method339(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILclient!lh;B)V")
	private void method339(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(23) int local23 = arg1.method4130();
		@Pc(30) int local30;
		if (this.aClass27_3 == null) {
			local30 = Static100.method1552(local23);
			this.aClass27_3 = new Class27(local30);
		}
		for (local30 = 0; local30 < local23; local30++) {
			@Pc(49) boolean local49 = arg1.method4130() == 1;
			@Pc(55) int local55 = arg1.method4142();
			@Pc(64) Class1 local64;
			if (local49) {
				local64 = new Class1_Sub35(arg1.method4137());
			} else {
				local64 = new Class1_Sub13(arg1.method4087());
			}
			this.aClass27_3.method564((long) local55, local64);
		}
	}
}
