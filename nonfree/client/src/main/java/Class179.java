import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public final class Class179 {

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "Lclient!ig;")
	public Interface3 anInterface3_7;

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "B")
	public byte aByte70;

	@OriginalMember(owner = "client!nn", name = "f", descriptor = "S")
	public final short aShort77;

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "B")
	public final byte aByte69;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lclient!ig;III)V")
	public Class179(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInterface3_7 = arg0;
		this.aByte70 = (byte) arg3;
		this.aShort77 = (short) arg1;
		this.aByte69 = (byte) arg2;
	}
}
