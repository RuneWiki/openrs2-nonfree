import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public final class Class45 {

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "S")
	public final short aShort18;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "B")
	public final byte aByte22;

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "Lclient!ad;")
	public Interface1 anInterface1_1;

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "B")
	public byte aByte23;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lclient!ad;III)V")
	public Class45(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aShort18 = (short) arg1;
		this.aByte22 = (byte) arg2;
		this.anInterface1_1 = arg0;
		this.aByte23 = (byte) arg3;
	}
}
