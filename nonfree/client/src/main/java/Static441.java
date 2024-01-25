import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!pba", name = "e", descriptor = "I")
	public static int anInt7472;

	@OriginalMember(owner = "client!pba", name = "f", descriptor = "[Lclient!ho;")
	public static Class9[] aClass9Array128;

	@OriginalMember(owner = "client!pba", name = "h", descriptor = "[[[Lclient!ug;")
	public static Class351[][][] aClass351ArrayArrayArray1;

	@OriginalMember(owner = "client!pba", name = "c", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_107 = new Class289(46, 3);

	@OriginalMember(owner = "client!pba", name = "d", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_108 = new Class289(76, 3);

	@OriginalMember(owner = "client!pba", name = "g", descriptor = "J")
	public static volatile long aLong218 = 0L;

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(III)V")
	public static void method6455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = Static173.aClass151_4.method3323(Static52.aClass41_24.method1007(Static616.anInt10077));
		@Pc(61) int local61;
		@Pc(32) int local32;
		if (Static217.aBoolean218) {
			for (@Pc(20) Class6_Sub4_Sub10 local20 = (Class6_Sub4_Sub10) Static258.aClass384_7.method8910(); local20 != null; local20 = (Class6_Sub4_Sub10) Static258.aClass384_7.method8908()) {
				if (local20.anInt5448 == 1) {
					local32 = Static3.method1019((Class6_Sub4_Sub12) local20.aClass384_11.aClass6_Sub4_62.aClass6_Sub4_67);
				} else {
					local32 = Static104.method1706(local20);
				}
				if (local13 < local32) {
					local13 = local32;
				}
			}
			local13 += 8;
			local61 = Static305.anInt5201 * 16 + 21;
			Static122.anInt2157 = Static305.anInt5201 * 16 + (Static292.aBoolean317 ? 26 : 22);
		} else {
			for (@Pc(81) Class6_Sub4_Sub12 local81 = (Class6_Sub4_Sub12) Static31.aClass362_3.method8538(); local81 != null; local81 = (Class6_Sub4_Sub12) Static31.aClass362_3.method8530()) {
				local32 = Static3.method1019(local81);
				if (local13 < local32) {
					local13 = local32;
				}
			}
			Static122.anInt2157 = (Static292.aBoolean317 ? 26 : 22) + Static183.anInt3155 * 16;
			local13 += 8;
			local61 = Static183.anInt3155 * 16 + 21;
		}
		@Pc(127) int local127 = arg1 - local13 / 2;
		if (Static449.anInt7506 < local13 + local127) {
			local127 = Static449.anInt7506 - local13;
		}
		if (local127 < 0) {
			local127 = 0;
		}
		local32 = arg0;
		if (local61 + arg0 > Static348.anInt5935) {
			local32 = Static348.anInt5935 - local61;
		}
		if (local32 < 0) {
			local32 = 0;
		}
		Static643.anInt10391 = local127;
		Static32.anInt784 = local32;
		Static279.anInt4804 = local13;
		Static277.aBoolean303 = true;
	}
}
