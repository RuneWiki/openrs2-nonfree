import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public final class Class194 {

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "B")
	public byte aByte54;

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "B")
	public final byte aByte53;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "S")
	public final short aShort62;

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "Lclient!ic;")
	public Interface8 anInterface8_2;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!ic;III)V")
	public Class194(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte54 = (byte) arg3;
		this.aByte53 = (byte) arg2;
		this.aShort62 = (short) arg1;
		this.anInterface8_2 = arg0;
	}
}
