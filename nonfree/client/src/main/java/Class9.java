import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public final class Class9 {

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
	public int anInt191;

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
	public int anInt192;

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
	public int anInt193;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
	public Class9() {
	}

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lclient!ai;)V")
	public Class9(@OriginalArg(0) Class9 arg0) {
		this.anInt193 = arg0.anInt193;
		this.anInt192 = arg0.anInt192;
		this.anInt191 = arg0.anInt191;
	}
}
