import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public final class Class356 {

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "B")
	public final byte aByte144;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "B")
	public byte aByte143;

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "Lclient!ml;")
	public Interface15 anInterface15_7;

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "S")
	public final short aShort115;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Lclient!ml;III)V")
	public Class356(@OriginalArg(0) Interface15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte144 = (byte) arg2;
		this.aByte143 = (byte) arg3;
		this.anInterface15_7 = arg0;
		this.aShort115 = (short) arg1;
	}
}
