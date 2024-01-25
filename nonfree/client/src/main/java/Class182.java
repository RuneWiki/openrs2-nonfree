import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public final class Class182 {

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
	public int anInt5180;

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
	public int anInt5181;

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
	public int anInt5182;

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "I")
	public int anInt5183;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "()V")
	public Class182() {
	}

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Lclient!oo;)V")
	public Class182(@OriginalArg(0) Class182 arg0) {
		this.anInt5180 = arg0.anInt5180;
		this.anInt5183 = arg0.anInt5183;
		this.anInt5181 = arg0.anInt5181;
		this.anInt5182 = arg0.anInt5182;
	}
}
