import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!is", name = "b", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_110 = new Class186(58, 6);

	@OriginalMember(owner = "client!is", name = "c", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_48 = new Class242("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!is", name = "d", descriptor = "Lclient!vr;")
	public static final Class258 aClass258_26 = new Class258();

	@OriginalMember(owner = "client!is", name = "e", descriptor = "[I")
	public static final int[] anIntArray276 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!is", name = "f", descriptor = "I")
	public static int anInt3302 = 0;

	@OriginalMember(owner = "client!is", name = "g", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_49 = new Class242("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(II)I")
	public static int method2595(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local23 > local14) {
			local46 = local23;
		}
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local46 + local32) / 2.0D;
		if (local46 != local32) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local32 + local46);
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (-local32 + local46);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
		}
		local60 /= 6.0D;
		@Pc(156) int local156 = (int) (local60 * 256.0D);
		@Pc(161) int local161 = (int) (local62 * 256.0D);
		if (local161 < 0) {
			local161 = 0;
		} else if (local161 > 255) {
			local161 = 255;
		}
		@Pc(177) int local177 = (int) (local68 * 256.0D);
		if (local177 < 0) {
			local177 = 0;
		} else if (local177 > 255) {
			local177 = 255;
		}
		if (local177 > 243) {
			local161 >>= 0x4;
		} else if (local177 > 217) {
			local161 >>= 0x3;
		} else if (local177 > 192) {
			local161 >>= 0x2;
		} else if (local177 > 179) {
			local161 >>= 0x1;
		}
		return (local177 >> 1) + ((local156 >> 2 & 0x3F) << 10) + (local161 >> 5 << 7);
	}
}
