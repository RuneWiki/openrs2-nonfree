import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public final class Class2_Sub28 extends Class2 {

	@OriginalMember(owner = "client!pj", name = "u", descriptor = "Lclient!h;")
	public static final Class89 aClass89_182 = new Class89(50, -1);

	@OriginalMember(owner = "client!pj", name = "v", descriptor = "J")
	public static long aLong146 = -1L;

	@OriginalMember(owner = "client!pj", name = "w", descriptor = "S")
	public static short aShort79 = 256;

	@OriginalMember(owner = "client!pj", name = "t", descriptor = "Ljava/lang/String;")
	public String aString54;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V", line = 11)
	private Class2_Sub28() {
	}

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 38)
	public Class2_Sub28(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString54 = arg0;
	}
}
