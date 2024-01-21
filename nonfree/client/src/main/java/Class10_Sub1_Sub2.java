import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZOXDNIET")
public class Class10_Sub1_Sub2 extends Class10_Sub1 {

	@OriginalMember(owner = "client!ZOXDNIET", name = "h", descriptor = "B")
	private static byte aByte42 = 3;

	@OriginalMember(owner = "client!ZOXDNIET", name = "j", descriptor = "[Lclient!VOUTABRU;")
	public Class41[] aClass41Array10;

	@OriginalMember(owner = "client!ZOXDNIET", name = "i", descriptor = "Z")
	private boolean aBoolean194 = true;

	@OriginalMember(owner = "client!ZOXDNIET", name = "k", descriptor = "I")
	public int anInt713 = 1000;

	@OriginalMember(owner = "client!ZOXDNIET", name = "a", descriptor = "(IIIIIIIII)V")
	public void method536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class10_Sub1_Sub2_Sub4 local3 = this.method537(aByte42);
		if (local3 != null) {
			this.anInt713 = local3.anInt713;
			local3.method536(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!ZOXDNIET", name = "a", descriptor = "(B)Lclient!LZYQDKJV;")
	protected Class10_Sub1_Sub2_Sub4 method537(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != 3) {
				this.aBoolean194 = !this.aBoolean194;
			}
			return null;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("78559, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}
}
