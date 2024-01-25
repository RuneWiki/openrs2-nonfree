import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public final class Class1_Sub37 extends Class1 {

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
	public final int anInt6970;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
	public int anInt6969;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(II)V")
	public Class1_Sub37(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6970 = arg0;
		this.anInt6969 = arg1;
	}
}
