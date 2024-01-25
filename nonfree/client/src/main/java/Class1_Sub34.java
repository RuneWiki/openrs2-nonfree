import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public final class Class1_Sub34 extends Class1 {

	@OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
	public int anInt6204;

	@OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
	public final int anInt6203;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(II)V")
	public Class1_Sub34(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6204 = arg1;
		this.anInt6203 = arg0;
	}
}
