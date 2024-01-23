import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public final class Class1_Sub6 extends Class1 {

	@OriginalMember(owner = "client!cj", name = "z", descriptor = "Lclient!kh;")
	public Class60 aClass60_251;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
	public Class1_Sub6() {
	}

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lclient!kh;)V")
	public Class1_Sub6(@OriginalArg(0) Class60 arg0) {
		this.aClass60_251 = arg0;
	}
}
