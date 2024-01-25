import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public final class Class226 {

	@OriginalMember(owner = "client!mq", name = "h", descriptor = "S")
	public final short aShort64;

	@OriginalMember(owner = "client!mq", name = "e", descriptor = "B")
	public byte aByte85;

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "Lclient!eq;")
	public Interface8 anInterface8_4;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "B")
	public final byte aByte84;

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lclient!eq;III)V")
	public Class226(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aShort64 = (short) arg1;
		this.aByte85 = (byte) arg3;
		this.anInterface8_4 = arg0;
		this.aByte84 = (byte) arg2;
	}
}
