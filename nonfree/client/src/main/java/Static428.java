import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!ol", name = "r", descriptor = "Lclient!qda;")
	public static Class59 aClass59_23;

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "Lclient!ve;")
	public static final Class370 aClass370_6 = new Class370(5, 1);

	@OriginalMember(owner = "client!ol", name = "i", descriptor = "Lclient!hf;")
	public static final Class150 aClass150_8 = new Class150();

	@OriginalMember(owner = "client!ol", name = "j", descriptor = "I")
	public static final int anInt7580 = 50;

	@OriginalMember(owner = "client!ol", name = "k", descriptor = "[I")
	public static final int[] anIntArray419 = new int[anInt7580];

	@OriginalMember(owner = "client!ol", name = "l", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray27 = new String[anInt7580];

	@OriginalMember(owner = "client!ol", name = "m", descriptor = "[I")
	public static final int[] anIntArray420 = new int[anInt7580];

	@OriginalMember(owner = "client!ol", name = "n", descriptor = "[I")
	public static final int[] anIntArray421 = new int[anInt7580];

	@OriginalMember(owner = "client!ol", name = "o", descriptor = "[I")
	public static final int[] anIntArray422 = new int[anInt7580];

	@OriginalMember(owner = "client!ol", name = "p", descriptor = "[I")
	public static final int[] anIntArray423 = new int[anInt7580];

	@OriginalMember(owner = "client!ol", name = "q", descriptor = "[I")
	public static final int[] anIntArray424 = new int[anInt7580];

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IILclient!wq;I)V")
	public static void method6455(@OriginalArg(0) int arg0, @OriginalArg(2) Class394 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class1 local12 = arg1.method8731(Static563.aClass143_13);
		if (local12 == null) {
			return;
		}
		Static563.aClass143_13.KA(arg0, arg2, arg1.anInt10536 + arg0, arg2 + arg1.anInt10532);
		if (Static514.anInt8684 >= 3) {
			Static563.aClass143_13.A(-16777216, local12, arg0, arg2);
		} else {
			Static283.aClass59_12.method8069((float) arg1.anInt10536 / 2.0F + (float) arg0, (float) arg2 + (float) arg1.anInt10532 / 2.0F, ((int) -Static495.aFloat161 & 0x3FFF) << 2, local12, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
	public static void method6456() {
		Static360.aClass265_37.method6568();
	}
}
