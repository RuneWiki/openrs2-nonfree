import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public final class Class89 {

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "B")
	public final byte aByte55;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "S")
	public final short aShort47;

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "Lclient!wu;")
	public Interface12 anInterface12_1;

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "B")
	public byte aByte54;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lclient!wu;III)V")
	public Class89(@OriginalArg(0) Interface12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte55 = (byte) arg2;
		this.aShort47 = (short) arg1;
		this.anInterface12_1 = arg0;
		this.aByte54 = (byte) arg3;
	}
}
