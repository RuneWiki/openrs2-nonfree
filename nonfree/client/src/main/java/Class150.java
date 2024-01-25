import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public final class Class150 {

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "I")
	public int anInt5318;

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "I")
	public int anInt5319;

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "I")
	public int anInt5320;

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "I")
	public int anInt5321;

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "()V")
	public Class150() {
	}

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lclient!ir;)V")
	public Class150(@OriginalArg(0) Class150 arg0) {
		this.anInt5319 = arg0.anInt5319;
		this.anInt5321 = arg0.anInt5321;
		this.anInt5318 = arg0.anInt5318;
		this.anInt5320 = arg0.anInt5320;
	}
}
