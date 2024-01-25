import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public final class Class274 {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "B")
	public byte aByte108;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "Lclient!cq;")
	public Interface2 anInterface2_6;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "S")
	public final short aShort76;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "B")
	public final byte aByte109;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!cq;III)V")
	public Class274(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte108 = (byte) arg3;
		this.anInterface2_6 = arg0;
		this.aShort76 = (short) arg1;
		this.aByte109 = (byte) arg2;
	}
}
