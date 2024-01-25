import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public final class Class118 {

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "S")
	public final short aShort40;

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "Lclient!us;")
	public Interface9 anInterface9_4;

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "B")
	public byte aByte24;

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "B")
	public final byte aByte23;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lclient!us;III)V")
	public Class118(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aShort40 = (short) arg1;
		this.anInterface9_4 = arg0;
		this.aByte24 = (byte) arg3;
		this.aByte23 = (byte) arg2;
	}
}
