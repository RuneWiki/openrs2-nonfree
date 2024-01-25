import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public final class Class198 implements Interface12 {

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
	public final int anInt5224;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(I)V")
	public Class198(@OriginalArg(0) int arg0) {
		this.anInt5224 = arg0;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)Lclient!hm;")
	@Override
	public Class151 method8831() {
		return Static272.aClass151_7;
	}
}
