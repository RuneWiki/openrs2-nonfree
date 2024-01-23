import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public final class Class1_Sub9 extends Class1 {

	@OriginalMember(owner = "client!dh", name = "l", descriptor = "[B")
	public byte[] aByteArray8;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "([B)V")
	public Class1_Sub9(@OriginalArg(0) byte[] arg0) {
		this.aByteArray8 = arg0;
	}
}
