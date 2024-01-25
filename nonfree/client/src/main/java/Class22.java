import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public final class Class22 {

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
	public int anInt489;

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
	public int anInt490;

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
	public int anInt491;

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
	public int anInt492;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
	public Class22() {
	}

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lclient!bh;)V")
	public Class22(@OriginalArg(0) Class22 arg0) {
		this.anInt489 = arg0.anInt489;
		this.anInt490 = arg0.anInt490;
		this.anInt492 = arg0.anInt492;
		this.anInt491 = arg0.anInt491;
	}
}
