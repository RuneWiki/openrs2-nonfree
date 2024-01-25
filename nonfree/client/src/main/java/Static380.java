import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!mu", name = "e", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "Lclient!qea;")
	public static final Class288 aClass288_4 = new Class288();

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "I")
	public static int anInt6506 = 1;

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIII)I")
	public static int method5559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static242.aClass22Array3 == null) {
			return 0;
		}
		@Pc(12) int local12 = arg0 >> 9;
		@Pc(16) int local16 = arg2 >> 9;
		if (local12 < 0 || local16 < 0 || Static544.anInt9261 - 1 < local12 || local16 > Static282.anInt4887 - 1) {
			return 0;
		}
		if (arg3 != 0) {
			method5560((byte) 13);
		}
		@Pc(54) int local54 = arg1;
		if (arg1 < 3 && (Static220.aByteArrayArrayArray14[1][local12][local16] & 0x2) != 0) {
			local54 = arg1 + 1;
		}
		return Static242.aClass22Array3[local54].method8032(arg0, arg2);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIIIII)V")
	public static void method5561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg2 - arg1;
		@Pc(15) int local15 = arg4 - arg3;
		if (local10 == 0) {
			if (local15 != 0) {
				Static484.method7006(arg0, arg1, arg3, arg4);
			}
		} else if (local15 == 0) {
			Static200.method2866(arg0, arg1, arg2, arg3);
		} else {
			@Pc(49) int local49 = (local15 << 12) / local10;
			@Pc(57) int local57 = arg3 - (arg1 * local49 >> 12);
			@Pc(73) int local73;
			@Pc(71) int local71;
			if (arg2 < Static642.anInt10429) {
				local71 = local57 + (Static642.anInt10429 * local49 >> 12);
				local73 = Static642.anInt10429;
			} else if (arg2 <= Static456.anInt7806) {
				local71 = arg4;
				local73 = arg2;
			} else {
				local73 = Static456.anInt7806;
				local71 = (local49 * Static456.anInt7806 >> 12) + local57;
			}
			@Pc(112) int local112;
			@Pc(114) int local114;
			if (Static642.anInt10429 > arg1) {
				local112 = Static642.anInt10429;
				local114 = local57 + (local49 * Static642.anInt10429 >> 12);
			} else if (Static456.anInt7806 >= arg1) {
				local112 = arg1;
				local114 = arg3;
			} else {
				local114 = local57 + (local49 * Static456.anInt7806 >> 12);
				local112 = Static456.anInt7806;
			}
			if (local114 < Static456.anInt7815) {
				local114 = Static456.anInt7815;
				local112 = (Static456.anInt7815 - local57 << 12) / local49;
			} else if (Static604.anInt10083 < local114) {
				local112 = (Static604.anInt10083 - local57 << 12) / local49;
				local114 = Static604.anInt10083;
			}
			if (local71 < Static456.anInt7815) {
				local73 = (Static456.anInt7815 - local57 << 12) / local49;
				local71 = Static456.anInt7815;
			} else if (local71 > Static604.anInt10083) {
				local73 = (Static604.anInt10083 - local57 << 12) / local49;
				local71 = Static604.anInt10083;
			}
			Static196.method2830(local114, local112, local71, arg0, local73);
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(II)Z")
	public static boolean method5562(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 3;
	}
}
