import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class2_Sub13 extends Class2 {

	@OriginalMember(owner = "client!ib", name = "E", descriptor = "[I")
	public static int[] anIntArray199 = new int[99];

	@OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
	public int anInt2044;

	@OriginalMember(owner = "client!ib", name = "w", descriptor = "Lclient!bj;")
	public Class15_Sub1 aClass15_Sub1_51;

	@OriginalMember(owner = "client!ib", name = "z", descriptor = "[B")
	public byte[] aByteArray27;

	@OriginalMember(owner = "client!ib", name = "H", descriptor = "Lclient!ud;")
	public Class96 aClass96_3;

	static {
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < 99; local14++) {
			@Pc(19) int local19 = local14 + 1;
			@Pc(32) int local32 = (int) ((double) local19 + Math.pow(2.0D, (double) local19 / 7.0D) * 300.0D);
			local12 += local32;
			anIntArray199[local14] = local12 / 4;
		}
	}
}
