import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public final class Class4_Sub2_Sub14 extends Class4_Sub2 {

	@OriginalMember(owner = "client!lo", name = "F", descriptor = "[B")
	public byte[] aByteArray39;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "([B)V")
	public Class4_Sub2_Sub14(@OriginalArg(0) byte[] arg0) {
		this.aByteArray39 = arg0;
	}
}
