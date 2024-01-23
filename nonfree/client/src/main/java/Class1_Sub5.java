import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public final class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!db", name = "y", descriptor = "[B")
	public byte[] aByteArray37;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "([B)V")
	public Class1_Sub5(@OriginalArg(0) byte[] arg0) {
		this.aByteArray37 = arg0;
	}
}
