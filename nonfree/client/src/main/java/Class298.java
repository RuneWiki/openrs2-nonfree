import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class298 {

	@OriginalMember(owner = "client!si", name = "a", descriptor = "I")
	public int anInt8969;

	@OriginalMember(owner = "client!si", name = "f", descriptor = "[Lclient!kr;")
	public Interface8[] anInterface8Array1;

	@OriginalMember(owner = "client!si", name = "g", descriptor = "I")
	public int anInt8973;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ILclient!fd;)V")
	public void method7347(@OriginalArg(1) Class3_Sub7 arg0) {
		this.anInt8973 = arg0.method6506();
		this.anInt8969 = arg0.method6535();
		this.anInterface8Array1 = new Interface8[arg0.method6538()];
		@Pc(26) Class103[] local26 = Static107.method2268();
		for (@Pc(28) int local28 = 0; local28 < this.anInterface8Array1.length; local28++) {
			this.anInterface8Array1[local28] = this.method7349(arg0, local26[arg0.method6538()]);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!fd;BLclient!fl;)Lclient!kr;")
	private Interface8 method7349(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) Class103 arg1) {
		if (Static501.aClass103_9 == arg1) {
			return Static264.method7035(arg0);
		} else if (Static244.aClass103_3 == arg1) {
			return Static181.method3222(arg0);
		} else if (arg1 == Static333.aClass103_4) {
			return Static145.method2901(arg0);
		} else if (arg1 == Static366.aClass103_5) {
			return Static338.method5800(arg0);
		} else if (arg1 == Static496.aClass103_8) {
			return Static250.method4495(arg0);
		} else if (arg1 == Static30.aClass103_2) {
			return Static390.method6231(arg0);
		} else if (Static5.aClass103_1 == arg1) {
			return Static309.method5149(arg0);
		} else if (arg1 == Static595.aClass103_10) {
			return Static181.method3226(arg0);
		} else if (arg1 == Static429.aClass103_6) {
			return Static333.method5776(arg0);
		} else if (arg1 == Static496.aClass103_7) {
			return Static256.method4566(arg0);
		} else {
			return null;
		}
	}
}
