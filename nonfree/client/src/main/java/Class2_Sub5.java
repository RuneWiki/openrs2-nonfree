import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public final class Class2_Sub5 extends Class2 {

	@OriginalMember(owner = "client!ba", name = "E", descriptor = "[B")
	public final byte[] aByteArray5;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "([B)V")
	public Class2_Sub5(@OriginalArg(0) byte[] arg0) {
		this.aByteArray5 = arg0;
	}
}
