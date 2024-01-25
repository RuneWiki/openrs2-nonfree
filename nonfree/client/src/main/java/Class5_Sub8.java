import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public final class Class5_Sub8 extends Class5 {

	@OriginalMember(owner = "client!bo", name = "l", descriptor = "I")
	public final int anInt768;

	@OriginalMember(owner = "client!bo", name = "i", descriptor = "I")
	public final int anInt767;

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(II)V")
	public Class5_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt768 = arg0;
		this.anInt767 = arg1;
	}
}
