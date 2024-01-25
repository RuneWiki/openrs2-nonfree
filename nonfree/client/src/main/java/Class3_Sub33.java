import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public final class Class3_Sub33 extends Class3 {

	@OriginalMember(owner = "client!nr", name = "m", descriptor = "I")
	public final int anInt5102;

	@OriginalMember(owner = "client!nr", name = "q", descriptor = "I")
	public final int anInt5104;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(II)V")
	public Class3_Sub33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5102 = arg1;
		this.anInt5104 = arg0;
	}
}
