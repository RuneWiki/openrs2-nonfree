import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public final class Class2_Sub9 extends Class2 {

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "[B")
	public final byte[] aByteArray20;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "([B)V")
	public Class2_Sub9(@OriginalArg(0) byte[] arg0) {
		this.aByteArray20 = arg0;
	}
}
