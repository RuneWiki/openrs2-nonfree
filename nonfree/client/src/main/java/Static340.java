import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static340 {

	@OriginalMember(owner = "client!nca", name = "c", descriptor = "I")
	public static int anInt6985;

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_68 = new Class230(50, 3);

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lclient!fd;Z)Lclient!rg;")
	public static Class43_Sub4 method5814(@OriginalArg(0) Class3_Sub7 arg0) {
		return new Class43_Sub4(arg0.method6525(), arg0.method6525(), arg0.method6525(), arg0.method6525(), arg0.method6506(), arg0.method6506(), arg0.method6538());
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(II)I")
	public static int method5816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static67.aByteArrayArray32 == null ? 0 : Static67.aByteArrayArray32[arg0][arg1] & 0xFF;
	}
}
