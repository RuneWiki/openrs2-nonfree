import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public final class Class195 {

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "Lclient!ql;")
	public Interface12 anInterface12_3;

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "B")
	public byte aByte60;

	@OriginalMember(owner = "client!pp", name = "f", descriptor = "S")
	public final short aShort58;

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "B")
	public final byte aByte61;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lclient!ql;III)V")
	public Class195(@OriginalArg(0) Interface12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInterface12_3 = arg0;
		this.aByte60 = (byte) arg3;
		this.aShort58 = (short) arg1;
		this.aByte61 = (byte) arg2;
	}
}
