import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public final class Class364 {

	@OriginalMember(owner = "client!ut", name = "i", descriptor = "B")
	public final byte aByte142;

	@OriginalMember(owner = "client!ut", name = "f", descriptor = "B")
	public byte aByte141;

	@OriginalMember(owner = "client!ut", name = "j", descriptor = "S")
	public final short aShort108;

	@OriginalMember(owner = "client!ut", name = "h", descriptor = "Lclient!ot;")
	public Interface21 anInterface21_6;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lclient!ot;III)V")
	public Class364(@OriginalArg(0) Interface21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte142 = (byte) arg2;
		this.aByte141 = (byte) arg3;
		this.aShort108 = (short) arg1;
		this.anInterface21_6 = arg0;
	}
}
