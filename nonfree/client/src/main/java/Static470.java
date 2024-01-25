import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static470 {

	@OriginalMember(owner = "client!sa", name = "L", descriptor = "[I")
	public static int[] anIntArray518;

	@OriginalMember(owner = "client!sa", name = "M", descriptor = "I")
	public static int anInt8934;

	@OriginalMember(owner = "client!sa", name = "T", descriptor = "I")
	public static int anInt8940;

	@OriginalMember(owner = "client!sa", name = "X", descriptor = "[I")
	public static int[] anIntArray520;

	@OriginalMember(owner = "client!sa", name = "Q", descriptor = "[I")
	public static final int[] anIntArray519 = new int[250];

	@OriginalMember(owner = "client!sa", name = "U", descriptor = "Lclient!jb;")
	public static final Class161 aClass161_16 = new Class161(2);

	@OriginalMember(owner = "client!sa", name = "V", descriptor = "Lclient!kq;")
	public static final Class184 aClass184_13 = new Class184(6, 1);

	@OriginalMember(owner = "client!sa", name = "W", descriptor = "S")
	public static short aShort111 = 205;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method6857(@OriginalArg(1) String arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static516.aStringArray39.length; local12++) {
			if (Static516.aStringArray39[local12].equalsIgnoreCase(arg0)) {
				return local12;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "(B)V")
	public static void method6858() {
		if (Static117.anIntArray125 != null) {
			return;
		}
		Static117.anIntArray125 = new int[65536];
		@Pc(25) double local25 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < 512; local29++) {
			@Pc(43) float local43 = ((float) (local29 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(52) float local52 = (float) (local29 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(54) int local54 = 0; local54 < 128; local54++) {
				@Pc(61) float local61 = (float) local54 / 128.0F;
				@Pc(63) float local63 = 0.0F;
				@Pc(65) float local65 = 0.0F;
				@Pc(67) float local67 = 0.0F;
				@Pc(71) float local71 = local43 / 60.0F;
				@Pc(74) int local74 = (int) local71;
				@Pc(78) int local78 = local74 % 6;
				@Pc(83) float local83 = local71 - (float) local74;
				@Pc(90) float local90 = local61 * (1.0F - local52);
				@Pc(99) float local99 = local61 * (1.0F - local83 * local52);
				@Pc(109) float local109 = local61 * (1.0F - local52 * (1.0F - local83));
				if (local78 == 0) {
					local65 = local109;
					local63 = local61;
					local67 = local90;
				} else if (local78 == 1) {
					local65 = local61;
					local67 = local90;
					local63 = local99;
				} else if (local78 == 2) {
					local67 = local109;
					local63 = local90;
					local65 = local61;
				} else if (local78 == 3) {
					local65 = local99;
					local63 = local90;
					local67 = local61;
				} else if (local78 == 4) {
					local67 = local61;
					local65 = local90;
					local63 = local109;
				} else if (local78 == 5) {
					local65 = local90;
					local63 = local61;
					local67 = local99;
				}
				local63 = (float) Math.pow((double) local63, local25);
				local65 = (float) Math.pow((double) local65, local25);
				local67 = (float) Math.pow((double) local67, local25);
				@Pc(202) int local202 = (int) (local63 * 256.0F);
				@Pc(207) int local207 = (int) (local65 * 256.0F);
				@Pc(212) int local212 = (int) (local67 * 256.0F);
				@Pc(225) int local225 = (local202 << 16) + (local207 << 8) + local212 - 16777216;
				Static117.anIntArray125[local27++] = local225;
			}
		}
	}
}
