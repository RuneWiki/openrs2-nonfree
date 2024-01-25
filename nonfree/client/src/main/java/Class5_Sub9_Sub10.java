import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public final class Class5_Sub9_Sub10 extends Class5_Sub9 {

	@OriginalMember(owner = "client!hp", name = "t", descriptor = "[B")
	public final byte[] aByteArray22;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "([B)V")
	public Class5_Sub9_Sub10(@OriginalArg(0) byte[] arg0) {
		this.aByteArray22 = arg0;
	}
}
