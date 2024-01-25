import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public final class Class1_Sub27 extends Class1 {

	@OriginalMember(owner = "client!jm", name = "m", descriptor = "[B")
	public final byte[] aByteArray51;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "([B)V")
	public Class1_Sub27(@OriginalArg(0) byte[] arg0) {
		this.aByteArray51 = arg0;
	}
}
