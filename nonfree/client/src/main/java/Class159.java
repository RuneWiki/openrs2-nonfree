import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public final class Class159 {

	@OriginalMember(owner = "client!im", name = "d", descriptor = "B")
	public byte aByte79;

	@OriginalMember(owner = "client!im", name = "b", descriptor = "Lclient!cs;")
	public Interface7 anInterface7_2;

	@OriginalMember(owner = "client!im", name = "f", descriptor = "S")
	public final short aShort64;

	@OriginalMember(owner = "client!im", name = "h", descriptor = "B")
	public final byte aByte80;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lclient!cs;III)V")
	public Class159(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte79 = (byte) arg3;
		this.anInterface7_2 = arg0;
		this.aShort64 = (short) arg1;
		this.aByte80 = (byte) arg2;
	}
}
