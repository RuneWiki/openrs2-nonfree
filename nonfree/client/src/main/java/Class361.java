import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class361 {

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "I")
	public int anInt10684;

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "[Lclient!af;")
	public Interface2[] anInterface2Array1;

	@OriginalMember(owner = "client!vp", name = "f", descriptor = "I")
	public int anInt10686;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZLclient!ad;Lclient!cea;)Lclient!af;")
	private Interface2 method8922(@OriginalArg(1) Class6 arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (Static505.aClass6_11 == arg0) {
			return Static429.method6861(arg1);
		} else if (Static66.aClass6_12 == arg0) {
			return Static256.method4723(arg1);
		} else if (Static192.aClass6_4 == arg0) {
			return Static637.method9204(arg1);
		} else if (arg0 == Static225.aClass6_5) {
			return Static112.method2835(arg1);
		} else if (arg0 == Static496.aClass6_10) {
			return Static625.method9092(arg1);
		} else if (arg0 == Static70.aClass6_2) {
			return Static189.method9235(arg1);
		} else if (Static454.aClass6_8 == arg0) {
			return Static633.method9185(arg1);
		} else if (arg0 == Static435.aClass6_7) {
			return Static386.method6314(arg1);
		} else if (Static397.aClass6_6 == arg0) {
			return Static217.method2803(arg1);
		} else if (Static457.aClass6_9 == arg0) {
			return Static31.method766(arg1);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!cea;I)V")
	public void method8923(@OriginalArg(0) Class2_Sub11 arg0) {
		this.anInt10686 = arg0.method8347();
		this.anInt10684 = arg0.method8326();
		this.anInterface2Array1 = new Interface2[arg0.method8383()];
		@Pc(26) Class6[] local26 = Static212.method4178();
		for (@Pc(28) int local28 = 0; local28 < this.anInterface2Array1.length; local28++) {
			this.anInterface2Array1[local28] = this.method8922(local26[arg0.method8383()], arg0);
		}
	}
}
