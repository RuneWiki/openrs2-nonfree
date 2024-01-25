import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public final class Class287 {

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "B")
	public final byte aByte111;

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "B")
	public byte aByte112;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "S")
	public final short aShort83;

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "Lclient!lm;")
	public Interface13 anInterface13_5;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!lm;III)V")
	public Class287(@OriginalArg(0) Interface13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte111 = (byte) arg2;
		this.aByte112 = (byte) arg3;
		this.aShort83 = (short) arg1;
		this.anInterface13_5 = arg0;
	}
}
