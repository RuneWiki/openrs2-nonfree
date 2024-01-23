import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public final class Class1_Sub24 extends Class1 {

	@OriginalMember(owner = "client!sd", name = "v", descriptor = "I")
	public int anInt5116;

	@OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
	public int anInt5115;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(II)V")
	public Class1_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5116 = arg1;
		this.anInt5115 = arg0;
	}
}
