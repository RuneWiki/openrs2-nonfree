import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public final class Class1_Sub27 extends Class1 {

	@OriginalMember(owner = "client!we", name = "x", descriptor = "[B")
	public byte[] aByteArray60;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "([B)V")
	public Class1_Sub27(@OriginalArg(0) byte[] arg0) {
		this.aByteArray60 = arg0;
	}
}
