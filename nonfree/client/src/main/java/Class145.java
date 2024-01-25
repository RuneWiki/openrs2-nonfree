import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public final class Class145 {

	@OriginalMember(owner = "client!kp", name = "i", descriptor = "[I")
	public static final int[] anIntArray279 = new int[16384];

	@OriginalMember(owner = "client!kp", name = "k", descriptor = "[I")
	public static final int[] anIntArray280 = new int[16384];

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "Lclient!jo;")
	public Class3_Sub2 aClass3_Sub2_2;

	@OriginalMember(owner = "client!kp", name = "e", descriptor = "Lclient!kp;")
	public Class145 aClass145_2;

	@OriginalMember(owner = "client!kp", name = "h", descriptor = "I")
	public int anInt3942;

	static {
		@Pc(17) double local17 = 3.834951969714103E-4D;
		for (@Pc(19) int local19 = 0; local19 < 16384; local19++) {
			anIntArray279[local19] = (int) (Math.sin(local17 * (double) local19) * 32768.0D);
			anIntArray280[local19] = (int) (Math.cos((double) local19 * local17) * 32768.0D);
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V")
	public void method3260() {
		if (Static416.anInt7438 >= 500) {
			return;
		}
		this.aClass145_2 = Static241.aClass145_5;
		this.anInt3942 = 0;
		this.aClass3_Sub2_2 = null;
		Static416.anInt7438++;
		Static241.aClass145_5 = this;
	}
}
