import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public final class Class7 {

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
	public int anInt388;

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
	public int anInt389;

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
	public int anInt390;

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
	public int anInt391;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
	public Class7() {
	}

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lclient!ba;)V")
	public Class7(@OriginalArg(0) Class7 arg0) {
		this.anInt389 = arg0.anInt389;
		this.anInt391 = arg0.anInt391;
		this.anInt390 = arg0.anInt390;
		this.anInt388 = arg0.anInt388;
	}
}
