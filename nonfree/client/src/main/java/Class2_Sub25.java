import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public final class Class2_Sub25 extends Class2 {

	@OriginalMember(owner = "client!uh", name = "o", descriptor = "[B")
	public final byte[] aByteArray45;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "([B)V")
	public Class2_Sub25(@OriginalArg(0) byte[] arg0) {
		this.aByteArray45 = arg0;
	}
}
