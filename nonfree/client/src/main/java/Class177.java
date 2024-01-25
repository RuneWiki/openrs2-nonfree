import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public final class Class177 {

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
	public int anInt5289;

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
	public int anInt5290;

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
	public int anInt5291;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V")
	public Class177() {
	}

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lclient!ll;)V")
	public Class177(@OriginalArg(0) Class177 arg0) {
		this.anInt5291 = arg0.anInt5291;
		this.anInt5290 = arg0.anInt5290;
		this.anInt5289 = arg0.anInt5289;
	}
}
