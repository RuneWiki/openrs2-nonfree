import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public final class Class314 implements Interface9 {

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
	public final int anInt8761;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(I)V")
	public Class314(@OriginalArg(0) int arg0) {
		this.anInt8761 = arg0;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)Lclient!vj;")
	@Override
	public Class365 method9019() {
		return Static613.aClass365_17;
	}
}
