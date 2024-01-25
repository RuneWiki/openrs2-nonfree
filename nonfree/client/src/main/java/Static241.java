import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!oq", name = "s", descriptor = "I")
	public static int anInt5135;

	@OriginalMember(owner = "client!oq", name = "E", descriptor = "I")
	public static int anInt5137;

	@OriginalMember(owner = "client!oq", name = "w", descriptor = "[I")
	public static final int[] anIntArray398 = new int[50];

	@OriginalMember(owner = "client!oq", name = "z", descriptor = "Lclient!ef;")
	public static final Class2_Sub12 aClass2_Sub12_5 = new Class2_Sub12(new byte[5000]);

	@OriginalMember(owner = "client!oq", name = "B", descriptor = "I")
	public static int anInt5136 = 255;

	@OriginalMember(owner = "client!oq", name = "D", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!oq", name = "F", descriptor = "[I")
	public static final int[] anIntArray399 = new int[32];

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILclient!ik;II)Lclient!mb;")
	public static Class2_Sub9_Sub13 method4348(@OriginalArg(1) Class102 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg0.anInt3008 | arg1 << 8;
		@Pc(24) Class2_Sub9_Sub13 local24 = (Class2_Sub9_Sub13) Static263.aClass144_8.method4186((long) local15 << 16);
		if (local24 != null) {
			return local24;
		}
		@Pc(36) byte[] local36 = Static151.aClass104_90.method2758(Static151.aClass104_90.method2744(local15));
		if (local36 == null) {
			local15 = arg0.anInt3008 | arg2 + 65536 << 8;
			local24 = (Class2_Sub9_Sub13) Static263.aClass144_8.method4186((long) local15 << 16);
			if (local24 != null) {
				return local24;
			}
			local36 = Static151.aClass104_90.method2758(Static151.aClass104_90.method2744(local15));
			if (local36 == null) {
				local15 = arg0.anInt3008 | 0xFFFF00;
				local24 = (Class2_Sub9_Sub13) Static263.aClass144_8.method4186((long) local15 << 16);
				if (local24 != null) {
					return local24;
				}
				local36 = Static151.aClass104_90.method2758(Static151.aClass104_90.method2744(local15));
				if (local36 == null) {
					return null;
				} else if (local36.length <= 1) {
					return null;
				} else {
					local24 = Static10.method155(local36);
					local24.aClass102_79 = arg0;
					Static263.aClass144_8.method4188((long) local15 << 16, local24);
					return local24;
				}
			} else if (local36.length <= 1) {
				return null;
			} else {
				local24 = Static10.method155(local36);
				local24.aClass102_79 = arg0;
				Static263.aClass144_8.method4188((long) local15 << 16, local24);
				return local24;
			}
		} else if (local36.length <= 1) {
			return null;
		} else {
			local24 = Static10.method155(local36);
			local24.aClass102_79 = arg0;
			Static263.aClass144_8.method4188((long) local15 << 16, local24);
			return local24;
		}
	}
}
