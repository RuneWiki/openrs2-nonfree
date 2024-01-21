import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public final class Class1_Sub15 extends Class1 {

	@OriginalMember(owner = "client!la", name = "M", descriptor = "[B")
	public final byte[] aByteArray29;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "([B)V")
	public Class1_Sub15(@OriginalArg(0) byte[] arg0) {
		this.aByteArray29 = arg0;
	}
}
