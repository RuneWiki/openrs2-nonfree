import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public final class Class112 {

	@OriginalMember(owner = "client!gr", name = "f", descriptor = "B")
	public final byte aByte36;

	@OriginalMember(owner = "client!gr", name = "g", descriptor = "Lclient!bo;")
	public Interface1 anInterface1_4;

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "S")
	public final short aShort68;

	@OriginalMember(owner = "client!gr", name = "j", descriptor = "B")
	public byte aByte37;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lclient!bo;III)V")
	public Class112(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte36 = (byte) arg2;
		this.anInterface1_4 = arg0;
		this.aShort68 = (short) arg1;
		this.aByte37 = (byte) arg3;
	}
}
