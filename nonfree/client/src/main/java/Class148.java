import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public final class Class148 {

	@OriginalMember(owner = "client!od", name = "b", descriptor = "I")
	public int anInt4439;

	@OriginalMember(owner = "client!od", name = "c", descriptor = "Lclient!ve;")
	public Class66 aClass66_3;

	@OriginalMember(owner = "client!od", name = "e", descriptor = "Lclient!od;")
	public Class148 aClass148_2;

	@OriginalMember(owner = "client!od", name = "f", descriptor = "I")
	public int anInt4441;

	@OriginalMember(owner = "client!od", name = "g", descriptor = "I")
	public int anInt4442;

	@OriginalMember(owner = "client!od", name = "d", descriptor = "I")
	public final int anInt4440;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "I")
	public final int anInt4438;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(II)V")
	public Class148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4440 = arg0;
		this.anInt4438 = arg1;
	}

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lclient!od;I)V")
	public Class148(@OriginalArg(0) Class148 arg0, @OriginalArg(1) int arg1) {
		this.aClass148_2 = arg0;
		this.anInt4438 = arg1 + this.aClass148_2.anInt4438;
		this.aClass66_3 = this.aClass148_2.aClass66_3;
		this.anInt4440 = this.aClass148_2.anInt4440;
	}
}
