import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public final class Class115 implements Interface3 {

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
	public final int anInt3080;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(I)V")
	public Class115(@OriginalArg(0) int arg0) {
		this.anInt3080 = arg0;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)Lclient!vf;")
	@Override
	public Class390 method7510() {
		return Static9.aClass390_1;
	}
}
