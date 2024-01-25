import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rba")
public final class Class4_Sub41 extends Class4 {

	@OriginalMember(owner = "client!rba", name = "o", descriptor = "[F")
	public static final float[] aFloatArray48 = new float[16384];

	@OriginalMember(owner = "client!rba", name = "r", descriptor = "[F")
	public static final float[] aFloatArray49 = new float[16384];

	@OriginalMember(owner = "client!rba", name = "j", descriptor = "Lclient!cu;")
	public Class61 aClass61_104;

	@OriginalMember(owner = "client!rba", name = "l", descriptor = "I")
	public int anInt7684;

	@OriginalMember(owner = "client!rba", name = "m", descriptor = "I")
	public int anInt7685;

	@OriginalMember(owner = "client!rba", name = "q", descriptor = "Lclient!cea;")
	public Class4_Sub9_Sub1 aClass4_Sub9_Sub1_3;

	static {
		@Pc(13) double local13 = 3.834951969714103E-4D;
		for (@Pc(15) int local15 = 0; local15 < 16384; local15++) {
			aFloatArray49[local15] = (float) Math.sin(local13 * (double) local15);
			aFloatArray48[local15] = (float) Math.cos((double) local15 * local13);
		}
	}

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "(I)V")
	public void method6353() {
		if (Static213.anInt4353 < Static516.aClass4_Sub41Array2.length) {
			Static516.aClass4_Sub41Array2[Static213.anInt4353++] = this;
		}
	}
}
