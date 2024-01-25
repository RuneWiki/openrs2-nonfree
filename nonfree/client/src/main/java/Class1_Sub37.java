import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public final class Class1_Sub37 extends Class1 {

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "[B")
	public final byte[] aByteArray84;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "([B)V")
	public Class1_Sub37(@OriginalArg(0) byte[] arg0) {
		this.aByteArray84 = arg0;
	}
}
