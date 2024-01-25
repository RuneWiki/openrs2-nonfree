import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public final class Class1_Sub1_Sub14 extends Class1_Sub1 {

	@OriginalMember(owner = "client!oba", name = "o", descriptor = "[B")
	public final byte[] aByteArray95;

	@OriginalMember(owner = "client!oba", name = "<init>", descriptor = "([B)V")
	public Class1_Sub1_Sub14(@OriginalArg(0) byte[] arg0) {
		this.aByteArray95 = arg0;
	}
}
