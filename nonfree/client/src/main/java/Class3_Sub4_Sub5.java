import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class3_Sub4_Sub5 extends Class3_Sub4 {

	@OriginalMember(owner = "client!cj", name = "M", descriptor = "I")
	private int anInt1284 = 4096;

	@OriginalMember(owner = "client!cj", name = "P", descriptor = "I")
	private int anInt1287 = 0;

	static {
		new Class175("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
	}

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub5() {
		super(1, true);
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5966(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass146_41.method3700(arg0);
		if (super.aClass146_41.aBoolean342) {
			@Pc(29) int[] local29 = this.method5960(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static106.anInt2356; local31++) {
				@Pc(37) int local37 = local29[local31];
				local11[local31] = local37 >= this.anInt1287 && local37 <= this.anInt1284 ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IILclient!bt;)V")
	@Override
	public void method5958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt1287 = arg1.method6004();
		} else if (arg0 == 1) {
			this.anInt1284 = arg1.method6004();
		}
	}
}
