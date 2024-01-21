import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public final class Class3_Sub19 extends Class3 {

	@OriginalMember(owner = "client!qg", name = "q", descriptor = "[B")
	public final byte[] aByteArray38;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "([B)V")
	public Class3_Sub19(@OriginalArg(0) byte[] arg0) {
		this.aByteArray38 = arg0;
	}
}
