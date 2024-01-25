import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class116 {

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "[B")
	public static final byte[] aByteArray38 = new byte[32896];

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "Lclient!mn;")
	private final Class171 aClass171_42;

	@OriginalMember(owner = "client!hq", name = "i", descriptor = "I")
	public final int anInt2907;

	static {
		@Pc(432) int local432 = 0;
		for (@Pc(434) int local434 = 0; local434 < 256; local434++) {
			for (@Pc(437) int local437 = 0; local437 <= local434; local437++) {
				aByteArray38[local432++] = (byte) (255.0D / Math.sqrt((double) ((float) (local434 * local434 + local437 * local437 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!pr;ILclient!mn;)V")
	public Class116(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		new Class188(64);
		this.aClass171_42 = arg2;
		this.anInt2907 = this.aClass171_42.method3662(15);
	}
}
