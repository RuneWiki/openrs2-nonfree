import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public final class Class127 {

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "Lclient!nh;")
	public Interface6 anInterface6_3;

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "S")
	public final short aShort68;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "B")
	public final byte aByte74;

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "B")
	public byte aByte75;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!nh;III)V")
	public Class127(@OriginalArg(0) Interface6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInterface6_3 = arg0;
		this.aShort68 = (short) arg1;
		this.aByte74 = (byte) arg2;
		this.aByte75 = (byte) arg3;
	}
}
