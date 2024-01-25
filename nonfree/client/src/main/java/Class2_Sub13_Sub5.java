import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public final class Class2_Sub13_Sub5 extends Class2_Sub13 {

	@OriginalMember(owner = "client!ff", name = "z", descriptor = "[B")
	public final byte[] aByteArray64;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "([B)V")
	public Class2_Sub13_Sub5(@OriginalArg(0) byte[] arg0) {
		this.aByteArray64 = arg0;
	}
}
