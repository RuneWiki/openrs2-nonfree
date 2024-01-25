import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bla")
public final class Class41 implements Interface3 {

	@OriginalMember(owner = "client!bla", name = "c", descriptor = "I")
	public final int anInt1390;

	@OriginalMember(owner = "client!bla", name = "<init>", descriptor = "(I)V")
	public Class41(@OriginalArg(0) int arg0) {
		this.anInt1390 = arg0;
	}

	@OriginalMember(owner = "client!bla", name = "a", descriptor = "(I)Lclient!vf;")
	@Override
	public Class390 method7510() {
		return Static386.aClass390_8;
	}
}
