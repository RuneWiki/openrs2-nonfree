import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public final class Class260 {

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "B")
	public byte aByte98;

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "S")
	public final short aShort96;

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "Lclient!ap;")
	public Interface1 anInterface1_7;

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "B")
	public final byte aByte99;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lclient!ap;III)V")
	public Class260(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte98 = (byte) arg3;
		this.aShort96 = (short) arg1;
		this.anInterface1_7 = arg0;
		this.aByte99 = (byte) arg2;
	}
}
