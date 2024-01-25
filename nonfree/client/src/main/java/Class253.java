import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public final class Class253 implements Interface3 {

	@OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
	public final int anInt6670;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(I)V")
	public Class253(@OriginalArg(0) int arg0) {
		this.anInt6670 = arg0;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z)Lclient!wh;")
	@Override
	public Class392 method8802() {
		return Static20.aClass392_1;
	}
}
