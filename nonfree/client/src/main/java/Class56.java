import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public final class Class56 {

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
	public int anInt2197;

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
	public int anInt2199;

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
	public int anInt2201;

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
	public int anInt2202;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
	public Class56() {
	}

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!ob;)V")
	public Class56(@OriginalArg(0) Class56 arg0) {
		this.anInt2201 = arg0.anInt2201;
		this.anInt2202 = arg0.anInt2202;
		this.anInt2197 = arg0.anInt2197;
		this.anInt2199 = arg0.anInt2199;
	}
}
