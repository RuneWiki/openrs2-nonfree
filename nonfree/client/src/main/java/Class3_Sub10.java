import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public final class Class3_Sub10 extends Class3 {

	@OriginalMember(owner = "client!db", name = "h", descriptor = "[S")
	public final short[] aShortArray25;

	@OriginalMember(owner = "client!db", name = "g", descriptor = "[B")
	public final byte[] aByteArray11;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "([S[B)V")
	public Class3_Sub10(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray25 = arg0;
		this.aByteArray11 = arg1;
	}
}
