import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public final class Class1_Sub8 extends Class1 {

	@OriginalMember(owner = "client!bl", name = "l", descriptor = "[B")
	public final byte[] aByteArray19;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "([B)V")
	public Class1_Sub8(@OriginalArg(0) byte[] arg0) {
		this.aByteArray19 = arg0;
	}
}
