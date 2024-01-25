import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public abstract class Class9 {

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "[B")
	public static final byte[] aByteArray98 = new byte[32896];

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "Lclient!fd;")
	protected final Class19_Sub2 aClass19_Sub2_41;

	static {
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			for (@Pc(18) int local18 = 0; local18 <= local15; local18++) {
				aByteArray98[local13++] = (byte) (255.0D / Math.sqrt((double) ((float) (local15 * local15 + local18 * local18 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lclient!fd;)V")
	public Class9(@OriginalArg(0) Class19_Sub2 arg0) {
		this.aClass19_Sub2_41 = arg0;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)V")
	public abstract void method5370(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZ)V")
	public abstract void method5371(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
	public abstract void method5373();

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)Z")
	public abstract boolean method5375();

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILclient!kj;Z)V")
	public abstract void method5376(@OriginalArg(0) int arg0, @OriginalArg(1) Class6 arg1);

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZB)V")
	public abstract void method5377(@OriginalArg(0) boolean arg0);
}
