import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public final class Class110 {

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "B")
	public final byte aByte40;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "S")
	public final short aShort41;

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "B")
	public byte aByte41;

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "Lclient!uq;")
	public Interface8 anInterface8_2;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lclient!ge;Lclient!uq;III)V")
	public Class110(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) Interface8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aByte40 = (byte) arg3;
		this.aShort41 = (short) arg2;
		this.aByte41 = (byte) arg4;
		this.anInterface8_2 = arg1;
	}
}
