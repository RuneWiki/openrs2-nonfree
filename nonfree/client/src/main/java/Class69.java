import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class69 {

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "[Lclient!oea;")
	public Interface18[] anInterface18Array1;

	@OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
	public int anInt2194;

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
	public int anInt2196;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!wv;ILclient!rba;)Lclient!oea;")
	private Interface18 method1960(@OriginalArg(0) Class409 arg0, @OriginalArg(2) Class3_Sub28 arg1) {
		if (arg0 == Static596.aClass409_14) {
			return Static672.method8906(arg1);
		} else if (Static223.aClass409_7 == arg0) {
			return Static560.method7830(arg1);
		} else if (arg0 == Static660.aClass409_15) {
			return Static122.method7552(arg1);
		} else if (Static247.aClass409_8 == arg0) {
			return Static216.method3469(arg1);
		} else if (Static198.aClass409_5 == arg0) {
			return Static449.method6665(arg1);
		} else if (arg0 == Static228.aClass409_13) {
			return Static66.method817(arg1);
		} else if (Static454.aClass409_12 == arg0) {
			return Static40.method588(arg1);
		} else if (Static248.aClass409_9 == arg0) {
			return Static276.method4224(arg1);
		} else if (Static703.aClass409_16 == arg0) {
			return Static557.method7802(arg1);
		} else if (Static188.aClass409_4 == arg0) {
			return Static455.method6749(arg1);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!rba;I)V")
	public void method1962(@OriginalArg(0) Class3_Sub28 arg0) {
		this.anInt2196 = arg0.method5307();
		this.anInt2194 = arg0.method5272();
		this.anInterface18Array1 = new Interface18[arg0.method5322(-75)];
		@Pc(28) Class409[] local28 = Static509.method7261();
		for (@Pc(30) int local30 = 0; local30 < this.anInterface18Array1.length; local30++) {
			this.anInterface18Array1[local30] = this.method1960(local28[arg0.method5322(-121)], arg0);
		}
	}
}
