import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public final class Class1_Sub6 extends Class1 {

	@OriginalMember(owner = "client!bo", name = "r", descriptor = "[B")
	public final byte[] aByteArray2;

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "([B)V")
	public Class1_Sub6(@OriginalArg(0) byte[] arg0) {
		this.aByteArray2 = arg0;
	}
}
