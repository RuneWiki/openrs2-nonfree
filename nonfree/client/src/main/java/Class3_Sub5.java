import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public final class Class3_Sub5 extends Class3 {

	@OriginalMember(owner = "client!ef", name = "I", descriptor = "[B")
	public final byte[] aByteArray10;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "([B)V")
	public Class3_Sub5(@OriginalArg(0) byte[] arg0) {
		this.aByteArray10 = arg0;
	}
}
