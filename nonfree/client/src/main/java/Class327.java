import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public final class Class327 {

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "B")
	public byte aByte118;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "B")
	public final byte aByte117;

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "Lclient!en;")
	public Interface11 anInterface11_7;

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "S")
	public final short aShort108;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lclient!en;III)V")
	public Class327(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte118 = (byte) arg3;
		this.aByte117 = (byte) arg2;
		this.anInterface11_7 = arg0;
		this.aShort108 = (short) arg1;
	}
}
