import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public final class Class19 {

	@OriginalMember(owner = "client!as", name = "g", descriptor = "S")
	public final short aShort1;

	@OriginalMember(owner = "client!as", name = "f", descriptor = "B")
	public final byte aByte2;

	@OriginalMember(owner = "client!as", name = "b", descriptor = "Lclient!pi;")
	public Interface11 anInterface11_1;

	@OriginalMember(owner = "client!as", name = "d", descriptor = "B")
	public byte aByte1;

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lclient!pi;III)V")
	public Class19(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aShort1 = (short) arg1;
		this.aByte2 = (byte) arg2;
		this.anInterface11_1 = arg0;
		this.aByte1 = (byte) arg3;
	}
}
