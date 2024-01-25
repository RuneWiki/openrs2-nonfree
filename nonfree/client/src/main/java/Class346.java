import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public final class Class346 implements Interface3 {

	@OriginalMember(owner = "client!tda", name = "f", descriptor = "I")
	public final int anInt8817;

	@OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(I)V")
	public Class346(@OriginalArg(0) int arg0) {
		this.anInt8817 = arg0;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(I)Lclient!lf;")
	@Override
	public Class210 method7539() {
		return Static169.aClass210_7;
	}
}
