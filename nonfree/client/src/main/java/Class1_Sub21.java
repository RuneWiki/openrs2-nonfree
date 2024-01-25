import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public final class Class1_Sub21 extends Class1 {

	@OriginalMember(owner = "client!ju", name = "p", descriptor = "I")
	public final int anInt3694;

	@OriginalMember(owner = "client!ju", name = "o", descriptor = "I")
	public final int anInt3693;

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(II)V")
	public Class1_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3694 = arg0;
		this.anInt3693 = arg1;
	}
}
