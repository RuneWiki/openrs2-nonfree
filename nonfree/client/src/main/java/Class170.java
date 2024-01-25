import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public final class Class170 {

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "B")
	public final byte aByte71;

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "S")
	public final short aShort56;

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "B")
	public byte aByte70;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "Lclient!kw;")
	public Interface13 anInterface13_4;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!kw;III)V")
	public Class170(@OriginalArg(0) Interface13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte71 = (byte) arg2;
		this.aShort56 = (short) arg1;
		this.aByte70 = (byte) arg3;
		this.anInterface13_4 = arg0;
	}
}
