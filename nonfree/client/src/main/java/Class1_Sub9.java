import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public final class Class1_Sub9 extends Class1 {

	@OriginalMember(owner = "client!hf", name = "u", descriptor = "I")
	public final int anInt1798;

	@OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
	public final int anInt1797;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(II)V")
	public Class1_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1798 = arg0;
		this.anInt1797 = arg1;
	}
}
