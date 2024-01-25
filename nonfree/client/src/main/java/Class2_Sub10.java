import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uw")
public abstract class Class2_Sub10 extends Class2 {

	@OriginalMember(owner = "client!uw", name = "m", descriptor = "[B")
	public static final byte[] aByteArray118 = new byte[32896];

	static {
		@Pc(55) int local55 = 0;
		for (@Pc(57) int local57 = 0; local57 < 256; local57++) {
			for (@Pc(60) int local60 = 0; local60 <= local57; local60++) {
				aByteArray118[local55++] = (byte) (int) (255.0D / Math.sqrt((double) ((float) (local60 * local60 + local57 * local57 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lclient!wc;Z)V")
	public abstract void method9198(@OriginalArg(0) Class394 arg0);

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(ZLclient!et;)V")
	public abstract void method9199(@OriginalArg(1) Class2_Sub20 arg0);
}
