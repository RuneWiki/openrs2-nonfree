import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public final class Class186 implements Interface23 {

	@OriginalMember(owner = "client!kda", name = "e", descriptor = "I")
	public final int anInt5061;

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(I)V")
	public Class186(@OriginalArg(0) int arg0) {
		this.anInt5061 = arg0;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(B)Lclient!sq;")
	@Override
	public Class307 method8175() {
		return Static397.aClass307_11;
	}
}
