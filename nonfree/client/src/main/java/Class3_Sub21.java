import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public final class Class3_Sub21 extends Class3 {

	@OriginalMember(owner = "client!rf", name = "z", descriptor = "Lclient!rd;")
	public Class80 aClass80_1355;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
	public Class3_Sub21() {
	}

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lclient!rd;)V")
	public Class3_Sub21(@OriginalArg(0) Class80 arg0) {
		this.aClass80_1355 = arg0;
	}
}
