import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public final class Class4_Sub5_Sub7 extends Class4_Sub5 {

	@OriginalMember(owner = "client!gea", name = "y", descriptor = "[B")
	public final byte[] aByteArray39;

	@OriginalMember(owner = "client!gea", name = "<init>", descriptor = "([B)V")
	public Class4_Sub5_Sub7(@OriginalArg(0) byte[] arg0) {
		this.aByteArray39 = arg0;
	}
}
