import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static531 {

	@OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
	public static int anInt9392;

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_136 = new Class45("Drop", "Fallen lassen", "Poser", "Largar");

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
	public static final int anInt9389 = 50;

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "[I")
	public static final int[] anIntArray818 = new int[anInt9389];

	@OriginalMember(owner = "client!wf", name = "j", descriptor = "[I")
	public static final int[] anIntArray819 = new int[anInt9389];

	@OriginalMember(owner = "client!wf", name = "k", descriptor = "[I")
	public static final int[] anIntArray820 = new int[anInt9389];

	@OriginalMember(owner = "client!wf", name = "m", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray40 = new String[anInt9389];

	@OriginalMember(owner = "client!wf", name = "o", descriptor = "[I")
	public static final int[] anIntArray821 = new int[anInt9389];

	@OriginalMember(owner = "client!wf", name = "p", descriptor = "[I")
	public static final int[] anIntArray822 = new int[anInt9389];

	@OriginalMember(owner = "client!wf", name = "q", descriptor = "[I")
	public static final int[] anIntArray823 = new int[anInt9389];

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)V")
	public static void method8097(@OriginalArg(1) int arg0) {
		Static361.anInt6516 = arg0;
		Static434.anInt7518 = 2;
		if (Static396.aString177 == null) {
			Static47.method5114(35);
		} else {
			@Pc(25) Class1_Sub17 local25 = new Class1_Sub17(Static416.method6539(Static187.method3598(Static396.aString177)));
			@Pc(31) long local31 = local25.method4465();
			Static409.aLong203 = local25.method4465();
			Static212.method3940(true, Static229.method4132(local31), "");
		}
	}
}
