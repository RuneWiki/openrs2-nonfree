import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public final class Class47 {

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
	public int anInt2206;

	@OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
	public int anInt2207;

	@OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
	public int anInt2210;

	@OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
	public int anInt2212;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
	public Class47() {
	}

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lclient!kg;)V")
	public Class47(@OriginalArg(0) Class47 arg0) {
		this.anInt2206 = arg0.anInt2206;
		this.anInt2207 = arg0.anInt2207;
		this.anInt2212 = arg0.anInt2212;
		this.anInt2210 = arg0.anInt2210;
	}
}
