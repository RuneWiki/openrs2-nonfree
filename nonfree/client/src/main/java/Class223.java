import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public final class Class223 {

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "S")
	public final short aShort84;

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "B")
	public byte aByte110;

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "B")
	public final byte aByte111;

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "Lclient!hca;")
	public Interface11 anInterface11_2;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lclient!hca;III)V")
	public Class223(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aShort84 = (short) arg1;
		this.aByte110 = (byte) arg3;
		this.aByte111 = (byte) arg2;
		this.anInterface11_2 = arg0;
	}
}
