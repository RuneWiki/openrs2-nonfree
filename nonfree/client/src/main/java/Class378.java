import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public final class Class378 {

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "I")
	public int anInt10419;

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "I")
	public int anInt10420;

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "I")
	public int anInt10421;

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "I")
	public int anInt10422;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "()V")
	public Class378() {
	}

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lclient!vr;)V")
	public Class378(@OriginalArg(0) Class378 arg0) {
		this.anInt10422 = arg0.anInt10422;
		this.anInt10421 = arg0.anInt10421;
		this.anInt10419 = arg0.anInt10419;
		this.anInt10420 = arg0.anInt10420;
	}
}
