import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public final class Class5_Sub16 extends Class5 {

	@OriginalMember(owner = "client!je", name = "w", descriptor = "[B")
	public final byte[] aByteArray25;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "([B)V")
	public Class5_Sub16(@OriginalArg(0) byte[] arg0) {
		this.aByteArray25 = arg0;
	}
}
