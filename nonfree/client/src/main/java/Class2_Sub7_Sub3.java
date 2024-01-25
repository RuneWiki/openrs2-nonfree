import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public final class Class2_Sub7_Sub3 extends Class2_Sub7 {

	@OriginalMember(owner = "client!ej", name = "A", descriptor = "[B")
	public final byte[] aByteArray26;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "([B)V")
	public Class2_Sub7_Sub3(@OriginalArg(0) byte[] arg0) {
		this.aByteArray26 = arg0;
	}
}
