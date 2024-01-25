import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public final class Class11 {

	@OriginalMember(owner = "client!af", name = "j", descriptor = "B")
	public final byte aByte6;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "B")
	public byte aByte5;

	@OriginalMember(owner = "client!af", name = "e", descriptor = "Lclient!lq;")
	public Interface10 anInterface10_1;

	@OriginalMember(owner = "client!af", name = "i", descriptor = "S")
	public final short aShort10;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lclient!lq;III)V")
	public Class11(@OriginalArg(0) Interface10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte6 = (byte) arg2;
		this.aByte5 = (byte) arg3;
		this.anInterface10_1 = arg0;
		this.aShort10 = (short) arg1;
	}
}
