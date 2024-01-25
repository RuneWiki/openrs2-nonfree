import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lda")
public final class Class192 {

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "[Lclient!uha;")
	public Interface24[] anInterface24Array1;

	@OriginalMember(owner = "client!lda", name = "e", descriptor = "I")
	public int anInt6057;

	@OriginalMember(owner = "client!lda", name = "j", descriptor = "I")
	public int anInt6062;

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lclient!ig;I)V")
	public void method4970(@OriginalArg(0) Class8_Sub8 arg0) {
		this.anInt6057 = arg0.method8560();
		this.anInt6062 = arg0.method8578();
		this.anInterface24Array1 = new Interface24[arg0.method8525()];
		@Pc(24) Class138[] local24 = Static361.method5667();
		for (@Pc(26) int local26 = 0; local26 < this.anInterface24Array1.length; local26++) {
			this.anInterface24Array1[local26] = this.method4971(arg0, local24[arg0.method8525()]);
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lclient!ig;BLclient!hs;)Lclient!uha;")
	private Interface24 method4971(@OriginalArg(0) Class8_Sub8 arg0, @OriginalArg(2) Class138 arg1) {
		if (Static336.aClass138_3 == arg1) {
			return Static426.method6635(arg0);
		} else if (Static520.aClass138_6 == arg1) {
			return Static566.method7876(arg0);
		} else if (Static124.aClass138_2 == arg1) {
			return Static33.method1196(arg0);
		} else if (Static619.aClass138_8 == arg1) {
			return Static379.method6038(arg0);
		} else if (arg1 == Static81.aClass138_1) {
			return Static22.method904(arg0);
		} else if (arg1 == Static641.aClass138_10) {
			return Static222.method4168(arg0);
		} else if (Static346.aClass138_4 == arg1) {
			return Static506.method7324(arg0);
		} else if (arg1 == Static540.aClass138_7) {
			return Static310.method5126(arg0);
		} else if (Static490.aClass138_5 == arg1) {
			return Static52.method1574(arg0);
		} else if (Static619.aClass138_9 == arg1) {
			return Static427.method6636(arg0);
		} else {
			return null;
		}
	}
}
