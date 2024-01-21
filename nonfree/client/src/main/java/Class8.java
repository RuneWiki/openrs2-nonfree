import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class8 {

	@OriginalMember(owner = "client!e", name = "a", descriptor = "[Lclient!e;")
	public static Class8[] aClass8Array1;

	@OriginalMember(owner = "client!e", name = "b", descriptor = "I")
	private int anInt255;

	@OriginalMember(owner = "client!e", name = "c", descriptor = "[I")
	public int[] anIntArray109;

	@OriginalMember(owner = "client!e", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BLclient!tb;)V")
	public static void method182(@OriginalArg(1) Class34 arg0) {
		@Pc(11) Class1_Sub3_Sub3 local11 = new Class1_Sub3_Sub3(arg0.method428(null, "base_head.dat"), (byte) 63);
		@Pc(21) Class1_Sub3_Sub3 local21 = new Class1_Sub3_Sub3(arg0.method428(null, "base_type.dat"), (byte) 63);
		@Pc(41) Class1_Sub3_Sub3 local41 = new Class1_Sub3_Sub3(arg0.method428(null, "base_label.dat"), (byte) 63);
		@Pc(44) int local44 = local11.method333();
		@Pc(47) int local47 = local11.method333();
		aClass8Array1 = new Class8[local47 + 1];
		for (@Pc(54) int local54 = 0; local54 < local44; local54++) {
			@Pc(59) int local59 = local11.method333();
			@Pc(62) int local62 = local11.method331();
			@Pc(65) int[] local65 = new int[local62];
			@Pc(68) int[][] local68 = new int[local62][];
			for (@Pc(70) int local70 = 0; local70 < local62; local70++) {
				local65[local70] = local21.method331();
				@Pc(80) int local80 = local41.method331();
				local68[local70] = new int[local80];
				for (@Pc(87) int local87 = 0; local87 < local80; local87++) {
					local68[local70][local87] = local41.method331();
				}
			}
			aClass8Array1[local59] = new Class8();
			aClass8Array1[local59].anInt255 = local62;
			aClass8Array1[local59].anIntArray109 = local65;
			aClass8Array1[local59].anIntArrayArray12 = local68;
		}
	}

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
	private Class8() {
	}
}
