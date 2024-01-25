import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public final class Class21 {

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "S")
	public final short aShort1;

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "B")
	public byte aByte4;

	@OriginalMember(owner = "client!bg", name = "j", descriptor = "Lclient!nc;")
	public Interface10 anInterface10_2;

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "B")
	public final byte aByte5;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lclient!nc;III)V")
	public Class21(@OriginalArg(0) Interface10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aShort1 = (short) arg1;
		this.aByte4 = (byte) arg3;
		this.anInterface10_2 = arg0;
		this.aByte5 = (byte) arg2;
	}
}
