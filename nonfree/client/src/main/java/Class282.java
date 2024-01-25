import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class282 {

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "[Lclient!jo;")
	public Interface9[] anInterface9Array1;

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
	public int anInt7567;

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
	public int anInt7568;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!ofa;Lclient!vj;I)Lclient!jo;")
	private Interface9 method6693(@OriginalArg(0) Class5_Sub22 arg0, @OriginalArg(1) Class365 arg1) {
		if (arg1 == Static613.aClass365_17) {
			return Static304.method4758(arg0);
		} else if (Static21.aClass365_1 == arg1) {
			return Static348.method5210(arg0);
		} else if (arg1 == Static310.aClass365_11) {
			return Static258.method4242(arg0);
		} else if (Static76.aClass365_4 == arg1) {
			return Static277.method4437(arg0);
		} else if (arg1 == Static522.aClass365_15) {
			return Static607.method8163(arg0);
		} else if (arg1 == Static609.aClass365_16) {
			return Static497.method7440(arg0);
		} else if (arg1 == Static392.aClass365_14) {
			return Static443.method6695(arg0);
		} else if (Static343.aClass365_13 == arg1) {
			return Static398.method5922(arg0);
		} else if (arg1 == Static197.aClass365_18) {
			return Static2.method23(arg0);
		} else if (arg1 == Static516.aClass365_12) {
			return Static217.method3706(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLclient!ofa;)V")
	public void method6694(@OriginalArg(1) Class5_Sub22 arg0) {
		this.anInt7567 = arg0.method5931();
		this.anInt7568 = arg0.method5968();
		this.anInterface9Array1 = new Interface9[arg0.method5966()];
		@Pc(22) Class365[] local22 = Static16.method231();
		for (@Pc(24) int local24 = 0; local24 < this.anInterface9Array1.length; local24++) {
			this.anInterface9Array1[local24] = this.method6693(arg0, local22[arg0.method5966()]);
		}
	}
}
