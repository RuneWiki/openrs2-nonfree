import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pda")
public final class Class254 {

	@OriginalMember(owner = "client!pda", name = "d", descriptor = "I")
	public int anInt6807;

	@OriginalMember(owner = "client!pda", name = "e", descriptor = "I")
	public int anInt6808;

	@OriginalMember(owner = "client!pda", name = "i", descriptor = "[Lclient!kd;")
	public Interface14[] anInterface14Array1;

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(ILclient!qh;)V")
	public void method5827(@OriginalArg(1) Class3_Sub11 arg0) {
		this.anInt6808 = arg0.method3126();
		this.anInt6807 = arg0.method3109();
		this.anInterface14Array1 = new Interface14[arg0.method3118()];
		@Pc(28) Class260[] local28 = Static391.method5753();
		for (@Pc(30) int local30 = 0; local30 < this.anInterface14Array1.length; local30++) {
			this.anInterface14Array1[local30] = this.method5828(local28[arg0.method3118()], arg0);
		}
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(ILclient!ph;Lclient!qh;)Lclient!kd;")
	private Interface14 method5828(@OriginalArg(1) Class260 arg0, @OriginalArg(2) Class3_Sub11 arg1) {
		if (arg0 == Static501.aClass260_11) {
			return Static180.method3144(arg1);
		} else if (Static360.aClass260_6 == arg0) {
			return Static233.method3927(arg1);
		} else if (Static347.aClass260_4 == arg0) {
			return Static182.method3151(arg1);
		} else if (Static395.aClass260_10 == arg0) {
			return Static502.method6768(arg1);
		} else if (arg0 == Static543.aClass260_12) {
			return Static12.method129(arg1);
		} else if (arg0 == Static415.aClass260_13) {
			return Static357.method5352(arg1);
		} else if (arg0 == Static595.aClass260_14) {
			return Static445.method6252(arg1);
		} else if (arg0 == Static9.aClass260_1) {
			return Static463.method6415(arg1);
		} else if (arg0 == Static351.aClass260_5) {
			return Static191.method3283(arg1);
		} else if (Static78.aClass260_3 == arg0) {
			return Static569.method7559(arg1);
		} else {
			return null;
		}
	}
}
