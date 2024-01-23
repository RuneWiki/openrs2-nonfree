import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public final class Class1_Sub12 extends Class1 {

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "[B")
	public byte[] aByteArray25;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "([B)V")
	public Class1_Sub12(@OriginalArg(0) byte[] arg0) {
		this.aByteArray25 = arg0;
	}
}
