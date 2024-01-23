import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public final class Class1_Sub2_Sub15 extends Class1_Sub2 {

	@OriginalMember(owner = "client!sb", name = "B", descriptor = "[B")
	public byte[] aByteArray50;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "([B)V")
	public Class1_Sub2_Sub15(@OriginalArg(0) byte[] arg0) {
		this.aByteArray50 = arg0;
	}
}
