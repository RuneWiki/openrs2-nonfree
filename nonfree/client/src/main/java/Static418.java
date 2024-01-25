import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!ve", name = "E", descriptor = "Ljava/awt/Image;")
	public static Image anImage3;

	@OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
	public static int anInt7095;

	@OriginalMember(owner = "client!ve", name = "r", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_129 = new Class36(17, 11);

	@OriginalMember(owner = "client!ve", name = "B", descriptor = "[I")
	public static final int[] anIntArray624 = new int[6];

	@OriginalMember(owner = "client!ve", name = "G", descriptor = "I")
	public static int anInt7096 = -1;

	@OriginalMember(owner = "client!ve", name = "H", descriptor = "[I")
	public static final int[] anIntArray625 = new int[5];

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZIIIIIIF)[[I")
	public static int[][] method5471(@OriginalArg(8) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(21) Class4_Sub2_Sub10 local21 = new Class4_Sub2_Sub10();
		local21.anInt2453 = 4;
		local21.anInt2449 = 8;
		local21.anInt2451 = 3;
		local21.anInt2447 = (int) (arg0 * 4096.0F);
		local21.aBoolean188 = false;
		local21.method5845();
		Static105.method1659(64, 256);
		for (@Pc(48) int local48 = 0; local48 < 256; local48++) {
			local21.method1841(local48, local9[local48]);
		}
		return local9;
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)[Lclient!si;")
	public static Class217[] method5472() {
		return new Class217[] { Static285.aClass217_27, Static192.aClass217_42, Static294.aClass217_30, Static289.aClass217_28, Static348.aClass217_34, Static15.aClass217_3, Static17.aClass217_4, Static332.aClass217_33, Static266.aClass217_25, Static448.aClass217_41, Static440.aClass217_40, Static236.aClass217_17, Static415.aClass217_39, Static68.aClass217_21, Static289.aClass217_29 };
	}
}
