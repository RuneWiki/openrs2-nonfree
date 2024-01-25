import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public final class Class2_Sub2_Sub13 extends Class2_Sub2 {

	@OriginalMember(owner = "client!lp", name = "z", descriptor = "[B")
	public final byte[] aByteArray130;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "([B)V")
	public Class2_Sub2_Sub13(@OriginalArg(0) byte[] arg0) {
		this.aByteArray130 = arg0;
	}
}
