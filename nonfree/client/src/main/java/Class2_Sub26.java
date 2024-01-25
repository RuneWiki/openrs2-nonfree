import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public final class Class2_Sub26 extends Class2 {

	@OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
	public int anInt4278;

	@OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
	public final int anInt4284;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(II)V")
	public Class2_Sub26(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4278 = arg1;
		this.anInt4284 = arg0;
	}
}
