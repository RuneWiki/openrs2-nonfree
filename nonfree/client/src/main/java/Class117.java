import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public final class Class117 {

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "S")
	public final short aShort46;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "B")
	public final byte aByte34;

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "B")
	public byte aByte35;

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "Lclient!mp;")
	public Interface6 anInterface6_2;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lclient!se;Lclient!mp;III)V")
	public Class117(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) Interface6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aShort46 = (short) arg2;
		this.aByte34 = (byte) arg3;
		this.aByte35 = (byte) arg4;
		this.anInterface6_2 = arg1;
	}
}
