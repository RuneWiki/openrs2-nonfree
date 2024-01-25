import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public final class Class66 {

	@OriginalMember(owner = "client!dda", name = "i", descriptor = "B")
	public final byte aByte44;

	@OriginalMember(owner = "client!dda", name = "f", descriptor = "Lclient!tda;")
	public Interface23 anInterface23_1;

	@OriginalMember(owner = "client!dda", name = "d", descriptor = "B")
	public byte aByte43;

	@OriginalMember(owner = "client!dda", name = "g", descriptor = "S")
	public final short aShort40;

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lclient!tda;III)V")
	public Class66(@OriginalArg(0) Interface23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte44 = (byte) arg2;
		this.anInterface23_1 = arg0;
		this.aByte43 = (byte) arg3;
		this.aShort40 = (short) arg1;
	}
}
