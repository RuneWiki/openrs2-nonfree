import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public final class Class20_Sub9 extends Class20 {

	@OriginalMember(owner = "client!qda", name = "m", descriptor = "I")
	public final int anInt8115;

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(I)V")
	public Class20_Sub9(@OriginalArg(0) int arg0) {
		this.anInt8115 = arg0;
	}
}
