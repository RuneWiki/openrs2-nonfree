import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class300 {

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "[Lclient!vda;")
	public static final Class299[] aClass299Array1 = new Class299[5];

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
	public int anInt8615;

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "[I")
	public int[] anIntArray777;

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "Lclient!lda;")
	public Class1_Sub1_Sub10 aClass1_Sub1_Sub10_1;

	static {
		for (@Pc(12) int local12 = 0; local12 < aClass299Array1.length; local12++) {
			aClass299Array1[local12] = new Class299();
		}
	}
}
