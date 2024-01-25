import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public final class Class6_Sub21 extends Class6 {

	@OriginalMember(owner = "client!ga", name = "k", descriptor = "[B")
	public final byte[] aByteArray28;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "([B)V")
	public Class6_Sub21(@OriginalArg(0) byte[] arg0) {
		this.aByteArray28 = arg0;
	}
}
