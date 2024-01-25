import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public final class Class352 {

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "S")
	public final short aShort119;

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "B")
	public final byte aByte129;

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "Lclient!ju;")
	public Interface14 anInterface14_7;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "B")
	public byte aByte128;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Lclient!ju;III)V")
	public Class352(@OriginalArg(0) Interface14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aShort119 = (short) arg1;
		this.aByte129 = (byte) arg2;
		this.anInterface14_7 = arg0;
		this.aByte128 = (byte) arg3;
	}
}
