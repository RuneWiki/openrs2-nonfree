import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public final class Class2_Sub27 extends Class2 {

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "[B")
	public final byte[] aByteArray54;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "([B)V")
	public Class2_Sub27(@OriginalArg(0) byte[] arg0) {
		this.aByteArray54 = arg0;
	}
}
