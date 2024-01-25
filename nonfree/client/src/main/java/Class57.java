import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public final class Class57 {

	@OriginalMember(owner = "client!cga", name = "c", descriptor = "I")
	public int anInt1077;

	@OriginalMember(owner = "client!cga", name = "b", descriptor = "I")
	public int anInt1078;

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "I")
	public int anInt1079;

	@OriginalMember(owner = "client!cga", name = "<init>", descriptor = "()V")
	public Class57() {
	}

	@OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(Lclient!cga;)V")
	public Class57(@OriginalArg(0) Class57 arg0) {
		this.anInt1079 = arg0.anInt1079;
		this.anInt1078 = arg0.anInt1078;
		this.anInt1077 = arg0.anInt1077;
	}
}
