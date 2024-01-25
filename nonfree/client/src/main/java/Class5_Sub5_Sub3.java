import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public final class Class5_Sub5_Sub3 extends Class5_Sub5 {

	@OriginalMember(owner = "client!fc", name = "w", descriptor = "[B")
	public final byte[] aByteArray11;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "([B)V")
	public Class5_Sub5_Sub3(@OriginalArg(0) byte[] arg0) {
		this.aByteArray11 = arg0;
	}
}
