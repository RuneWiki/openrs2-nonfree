import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tia")
public final class Class11_Sub9 extends Class11 {

	@OriginalMember(owner = "client!tia", name = "i", descriptor = "I")
	public final int anInt9058;

	@OriginalMember(owner = "client!tia", name = "<init>", descriptor = "(I)V")
	public Class11_Sub9(@OriginalArg(0) int arg0) {
		this.anInt9058 = arg0;
	}
}
