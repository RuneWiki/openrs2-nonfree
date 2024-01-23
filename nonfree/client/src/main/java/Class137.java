import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public final class Class137 {

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
	public int anInt4382;

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
	public int anInt4383;

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
	public int anInt4384;

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
	public int anInt4385;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
	public Class137() {
	}

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!qf;)V")
	public Class137(@OriginalArg(0) Class137 arg0) {
		this.anInt4382 = arg0.anInt4382;
		this.anInt4384 = arg0.anInt4384;
		this.anInt4383 = arg0.anInt4383;
		this.anInt4385 = arg0.anInt4385;
	}
}
