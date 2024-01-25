import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public final class Class53 {

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "B")
	public byte aByte14;

	@OriginalMember(owner = "client!cm", name = "e", descriptor = "S")
	public final short aShort13;

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "Lclient!av;")
	public Interface2 anInterface2_1;

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "B")
	public final byte aByte15;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lclient!av;III)V")
	public Class53(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte14 = (byte) arg3;
		this.aShort13 = (short) arg1;
		this.anInterface2_1 = arg0;
		this.aByte15 = (byte) arg2;
	}
}
