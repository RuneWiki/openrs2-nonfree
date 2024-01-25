import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public final class Class346 {

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "B")
	public final byte aByte105;

	@OriginalMember(owner = "client!vv", name = "d", descriptor = "B")
	public byte aByte106;

	@OriginalMember(owner = "client!vv", name = "i", descriptor = "S")
	public final short aShort127;

	@OriginalMember(owner = "client!vv", name = "c", descriptor = "Lclient!sj;")
	public Interface16 anInterface16_6;

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(Lclient!sj;III)V")
	public Class346(@OriginalArg(0) Interface16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte105 = (byte) arg2;
		this.aByte106 = (byte) arg3;
		this.aShort127 = (short) arg1;
		this.anInterface16_6 = arg0;
	}
}
