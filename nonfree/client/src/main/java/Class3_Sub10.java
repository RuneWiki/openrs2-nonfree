import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public final class Class3_Sub10 extends Class3 {

	@OriginalMember(owner = "client!ic", name = "C", descriptor = "I")
	public final int anInt2021;

	@OriginalMember(owner = "client!ic", name = "z", descriptor = "I")
	public final int anInt2019;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(II)V")
	public Class3_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2021 = arg1;
		this.anInt2019 = arg0;
	}
}
