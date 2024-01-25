import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public final class Class47 {

	@OriginalMember(owner = "client!db", name = "c", descriptor = "B")
	public final byte aByte10;

	@OriginalMember(owner = "client!db", name = "h", descriptor = "S")
	public final short aShort5;

	@OriginalMember(owner = "client!db", name = "b", descriptor = "B")
	public byte aByte9;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "Lclient!ui;")
	public Interface12 anInterface12_1;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lclient!ui;III)V")
	public Class47(@OriginalArg(0) Interface12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte10 = (byte) arg2;
		this.aShort5 = (short) arg1;
		this.aByte9 = (byte) arg3;
		this.anInterface12_1 = arg0;
	}
}
