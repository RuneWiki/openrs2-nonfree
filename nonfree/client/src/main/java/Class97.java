import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public final class Class97 {

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "B")
	public final byte aByte39;

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "B")
	public byte aByte38;

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "Lclient!cw;")
	public Interface1 anInterface1_4;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "S")
	public final short aShort34;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lclient!cw;III)V")
	public Class97(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte39 = (byte) arg2;
		this.aByte38 = (byte) arg3;
		this.anInterface1_4 = arg0;
		this.aShort34 = (short) arg1;
	}
}
