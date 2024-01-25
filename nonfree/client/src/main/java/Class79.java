import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public final class Class79 {

	@OriginalMember(owner = "client!dea", name = "e", descriptor = "S")
	public final short aShort12;

	@OriginalMember(owner = "client!dea", name = "c", descriptor = "B")
	public byte aByte17;

	@OriginalMember(owner = "client!dea", name = "d", descriptor = "B")
	public final byte aByte18;

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "Lclient!nk;")
	public Interface17 anInterface17_4;

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lclient!nk;III)V")
	public Class79(@OriginalArg(0) Interface17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aShort12 = (short) arg1;
		this.aByte17 = (byte) arg3;
		this.aByte18 = (byte) arg2;
		this.anInterface17_4 = arg0;
	}
}
