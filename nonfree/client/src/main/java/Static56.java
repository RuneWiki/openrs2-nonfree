import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!bw", name = "h", descriptor = "[Lclient!io;")
	public static Class60_Sub4[] aClass60_Sub4Array1;

	@OriginalMember(owner = "client!bw", name = "e", descriptor = "I")
	public static int anInt979 = 0;

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Ljava/lang/String;[BZI)I")
	public static int method824(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = arg2;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 <= '\u007f') {
				arg1[local10++] = (byte) local23;
			} else if (local23 > '\u07ff') {
				arg1[local10++] = (byte) (local23 >> 12 | 0xE0);
				arg1[local10++] = (byte) (local23 >> 6 & 0x3F | 0x80);
				arg1[local10++] = (byte) (local23 & 0x3F | 0x80);
			} else {
				arg1[local10++] = (byte) (local23 >> 6 | 0xC0);
				arg1[local10++] = (byte) (local23 & 0x3F | 0x80);
			}
		}
		return local10 - arg2;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(ZLclient!tt;)[Lclient!l;")
	public static Class178[] method825(@OriginalArg(1) Class313 arg0) {
		if (!arg0.method6997()) {
			return new Class178[0];
		}
		@Pc(16) Class224 local16 = arg0.method6985();
		while (local16.anInt6632 == 0) {
			Static183.method3079(10L);
		}
		if (local16.anInt6632 == 2) {
			return new Class178[0];
		}
		@Pc(35) int[] local35 = (int[]) local16.anObject14;
		@Pc(41) Class178[] local41 = new Class178[local35.length >> 2];
		for (@Pc(48) int local48 = 0; local48 < local41.length; local48++) {
			@Pc(54) Class178 local54 = new Class178();
			local41[local48] = local54;
			local54.anInt5209 = local35[local48 << 2];
			local54.anInt5208 = local35[(local48 << 2) + 1];
			local54.anInt5210 = local35[(local48 << 2) + 2];
			local54.anInt5206 = local35[(local48 << 2) + 3];
		}
		return local41;
	}
}
