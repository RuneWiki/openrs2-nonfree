import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public final class Class6_Sub2_Sub3 extends Class6_Sub2 {

	@OriginalMember(owner = "client!ej", name = "B", descriptor = "[B")
	public final byte[] aByteArray28;

	static {
		new Class198("", 76);
	}

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "([B)V")
	public Class6_Sub2_Sub3(@OriginalArg(0) byte[] arg0) {
		this.aByteArray28 = arg0;
	}
}
