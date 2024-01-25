import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class4 {

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
	public int anInt22;

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
	public int anInt25;

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "[Lclient!jfa;")
	public Interface9[] anInterface9Array1;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZLclient!ie;)V")
	public void method42(@OriginalArg(1) Class3_Sub26 arg0) {
		this.anInt25 = arg0.method6830();
		this.anInt22 = arg0.method6811();
		this.anInterface9Array1 = new Interface9[arg0.method6814()];
		@Pc(30) Class95[] local30 = Static389.method6681();
		for (@Pc(32) int local32 = 0; local32 < this.anInterface9Array1.length; local32++) {
			this.anInterface9Array1[local32] = this.method44(arg0, local30[arg0.method6814()]);
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!ie;ILclient!eu;)Lclient!jfa;")
	private Interface9 method44(@OriginalArg(0) Class3_Sub26 arg0, @OriginalArg(2) Class95 arg1) {
		if (arg1 == Static138.aClass95_2) {
			return Static575.method7823(arg0);
		} else if (Static431.aClass95_7 == arg1) {
			return Static593.method8140(arg0);
		} else if (arg1 == Static591.aClass95_10) {
			return Static180.method3205(arg0);
		} else if (Static590.aClass95_9 == arg1) {
			return Static77.method1828(arg0);
		} else if (Static6.aClass95_1 == arg1) {
			return Static211.method6660(arg0);
		} else if (Static337.aClass95_5 == arg1) {
			return Static4.method52(arg0);
		} else if (Static418.aClass95_6 == arg1) {
			return Static81.method1882(arg0);
		} else if (arg1 == Static549.aClass95_8) {
			return Static554.method7605(arg0);
		} else if (arg1 == Static150.aClass95_3) {
			return Static302.method1700(arg0);
		} else if (Static153.aClass95_4 == arg1) {
			return Static3.method46(arg0);
		} else {
			return null;
		}
	}
}
