import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public final class Class20_Sub9 extends Class20 {

	@OriginalMember(owner = "client!su", name = "o", descriptor = "I")
	public final int anInt8296;

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(I)V")
	public Class20_Sub9(@OriginalArg(0) int arg0) {
		this.anInt8296 = arg0;
	}
}
