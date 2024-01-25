import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public final class Class82 {

	@OriginalMember(owner = "client!eca", name = "d", descriptor = "B")
	public final byte aByte30;

	@OriginalMember(owner = "client!eca", name = "i", descriptor = "B")
	public byte aByte31;

	@OriginalMember(owner = "client!eca", name = "g", descriptor = "Lclient!hu;")
	public Interface12 anInterface12_2;

	@OriginalMember(owner = "client!eca", name = "h", descriptor = "S")
	public final short aShort26;

	@OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lclient!hu;III)V")
	public Class82(@OriginalArg(0) Interface12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte30 = (byte) arg2;
		this.aByte31 = (byte) arg3;
		this.anInterface12_2 = arg0;
		this.aShort26 = (short) arg1;
	}
}
