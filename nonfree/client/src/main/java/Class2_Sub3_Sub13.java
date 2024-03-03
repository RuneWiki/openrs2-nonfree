import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public final class Class2_Sub3_Sub13 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ho", name = "Q", descriptor = "I")
	public static final int anInt2518 = 1338;

	@OriginalMember(owner = "client!ho", name = "R", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray20 = new String[100];

	@OriginalMember(owner = "client!ho", name = "S", descriptor = "Lclient!bc;")
	public static final Class16 aClass16_2 = new Class16("", 14);

	@OriginalMember(owner = "client!ho", name = "U", descriptor = "I")
	public static int anInt2520 = -1;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "()V", line = 200)
	public Class2_Sub3_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(BI)[I", line = 119)
	@Override
	public int[] method6486(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass158_41.method3997(arg0);
		if (super.aClass158_41.aBoolean265) {
			Static390.method4611(local14, 0, Static211.anInt4031, Static16.anIntArray322[arg0]);
		}
		return local14;
	}
}
