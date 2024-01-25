import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public final class Class214 {

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "B")
	public final byte aByte101;

	@OriginalMember(owner = "client!ls", name = "h", descriptor = "Lclient!vn;")
	public Interface26 anInterface26_2;

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "S")
	public final short aShort79;

	@OriginalMember(owner = "client!ls", name = "e", descriptor = "B")
	public byte aByte102;

	static {
		new Class357("", 73);
	}

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lclient!vn;III)V")
	public Class214(@OriginalArg(0) Interface26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte101 = (byte) arg2;
		this.anInterface26_2 = arg0;
		this.aShort79 = (short) arg1;
		this.aByte102 = (byte) arg3;
	}
}
