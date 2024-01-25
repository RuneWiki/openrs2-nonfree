import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class267 {

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "[I")
	public static final int[] anIntArray530 = new int[256];

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "Lclient!qe;")
	public Class267 aClass267_2;

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "Lclient!wda;")
	public Class4_Sub1 aClass4_Sub1_2;

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
	public int anInt7270;

	static {
		for (@Pc(9) int local9 = 0; local9 < 256; local9++) {
			@Pc(12) int local12 = local9;
			for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
				if ((local12 & 0x1) == 1) {
					local12 = local12 >>> 1 ^ 0xEDB88320;
				} else {
					local12 >>>= 0x1;
				}
			}
			anIntArray530[local9] = local12;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
	public void method5991() {
		if (Static6.anInt4018 >= 500) {
			return;
		}
		this.aClass267_2 = Static376.aClass267_1;
		this.aClass4_Sub1_2 = null;
		this.anInt7270 = 0;
		Static376.aClass267_1 = this;
		Static6.anInt4018++;
	}
}
