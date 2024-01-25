import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public final class Class238 {

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "B")
	public byte aByte101;

	@OriginalMember(owner = "client!tp", name = "e", descriptor = "S")
	public final short aShort107;

	@OriginalMember(owner = "client!tp", name = "d", descriptor = "Lclient!se;")
	public Interface10 anInterface10_5;

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "B")
	public final byte aByte102;

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lclient!se;III)V")
	public Class238(@OriginalArg(0) Interface10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte101 = (byte) arg3;
		this.aShort107 = (short) arg1;
		this.anInterface10_5 = arg0;
		this.aByte102 = (byte) arg2;
	}
}
