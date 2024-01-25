import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class5_Sub9 extends Class5 {

	@OriginalMember(owner = "client!c", name = "u", descriptor = "[I")
	public static final int[] anIntArray80 = new int[32];

	@OriginalMember(owner = "client!c", name = "k", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!c", name = "l", descriptor = "[Lclient!eha;")
	public Class91[] aClass91Array1;

	@OriginalMember(owner = "client!c", name = "m", descriptor = "[I")
	public int[] anIntArray77;

	@OriginalMember(owner = "client!c", name = "o", descriptor = "[Lclient!eha;")
	public Class91[] aClass91Array2;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "[I")
	public int[] anIntArray78;

	@OriginalMember(owner = "client!c", name = "q", descriptor = "I")
	public int anInt1144;

	@OriginalMember(owner = "client!c", name = "r", descriptor = "[I")
	public int[] anIntArray79;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "I")
	public int anInt1146;

	static {
		@Pc(8) int local8 = 2;
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			anIntArray80[local10] = local8 - 1;
			local8 += local8;
		}
	}
}
