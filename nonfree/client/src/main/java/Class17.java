import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public final class Class17 {

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
	public int anInt469;

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
	public int anInt473;

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
	public int anInt475;

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
	public int anInt476;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V")
	public Class17() {
	}

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lclient!bg;)V")
	public Class17(@OriginalArg(0) Class17 arg0) {
		this.anInt475 = arg0.anInt475;
		this.anInt473 = arg0.anInt473;
		this.anInt469 = arg0.anInt469;
		this.anInt476 = arg0.anInt476;
	}
}
