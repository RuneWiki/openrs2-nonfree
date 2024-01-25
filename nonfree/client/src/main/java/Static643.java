import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static643 {

	@OriginalMember(owner = "client!vp", name = "f", descriptor = "[Z")
	public static boolean[] aBooleanArray35;

	@OriginalMember(owner = "client!vp", name = "j", descriptor = "I")
	public static int anInt10390;

	@OriginalMember(owner = "client!vp", name = "k", descriptor = "I")
	public static int anInt10391;

	@OriginalMember(owner = "client!vp", name = "o", descriptor = "I")
	public static int anInt10394;

	@OriginalMember(owner = "client!vp", name = "t", descriptor = "[Lclient!oq;")
	public static Class2_Sub1[] aClass2_Sub1Array5;

	@OriginalMember(owner = "client!vp", name = "l", descriptor = "[F")
	public static final float[] aFloatArray77 = new float[4];

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIBLclient!pq;[I[I)Lclient!kn;")
	public static Class1_Sub2 method8779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class132_Sub3 arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4) {
		@Pc(15) byte[] local15 = new byte[arg1 * arg0];
		for (@Pc(17) int local17 = 0; local17 < arg0; local17++) {
			@Pc(27) int local27 = arg3[local17] + local17 * arg1;
			for (@Pc(29) int local29 = 0; local29 < arg4[local17]; local29++) {
				local15[local27++] = -1;
			}
		}
		return new Class1_Sub2(arg2, arg1, arg0, local15);
	}
}
