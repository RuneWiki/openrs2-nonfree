import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class86_Sub2 extends Class86 {

	@OriginalMember(owner = "client!td", name = "j", descriptor = "[B")
	public static final byte[] aByteArray107;

	@OriginalMember(owner = "client!td", name = "h", descriptor = "Lclient!em;")
	public final Interface6 anInterface6_3;

	static {
		@Pc(15) int local15 = 0;
		aByteArray107 = new byte[32896];
		for (@Pc(20) int local20 = 0; local20 < 256; local20++) {
			for (@Pc(23) int local23 = 0; local23 <= local20; local23++) {
				aByteArray107[local15++] = (byte) (255.0D / Math.sqrt((double) ((float) (local20 * local20 + local23 * local23 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lclient!kea;II[B)V")
	public Class86_Sub2(@OriginalArg(0) Class14_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface6_3 = arg0.method6934(arg2, arg3, false, Static145.aClass219_10, arg1);
		this.anInterface6_3.method7606(false, false);
	}

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lclient!kea;II[I)V")
	public Class86_Sub2(@OriginalArg(0) Class14_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface6_3 = arg0.method6950(arg1, arg3, arg2, false);
		this.anInterface6_3.method7606(false, false);
	}
}
