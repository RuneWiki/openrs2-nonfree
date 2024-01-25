import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public final class Class6_Sub38 extends Class6 {

	@OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
	public final int anInt5948;

	@OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
	public int anInt5951;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(II)V")
	public Class6_Sub38(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5948 = arg0;
		this.anInt5951 = arg1;
	}
}
