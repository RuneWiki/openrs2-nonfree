import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public final class Class4_Sub31 extends Class4 {

	@OriginalMember(owner = "client!um", name = "n", descriptor = "[B")
	public byte[] aByteArray72;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "([B)V")
	public Class4_Sub31(@OriginalArg(0) byte[] arg0) {
		this.aByteArray72 = arg0;
	}
}
