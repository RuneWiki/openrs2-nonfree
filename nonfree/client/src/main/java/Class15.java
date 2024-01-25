import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public final class Class15 {

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "I")
	public int anInt538;

	@OriginalMember(owner = "client!aq", name = "f", descriptor = "I")
	public int anInt541;

	@OriginalMember(owner = "client!aq", name = "i", descriptor = "Lclient!aq;")
	public Class15 aClass15_1;

	@OriginalMember(owner = "client!aq", name = "j", descriptor = "Lclient!q;")
	public Class109 aClass109_1;

	@OriginalMember(owner = "client!aq", name = "q", descriptor = "I")
	public int anInt549;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "I")
	public final int anInt537;

	@OriginalMember(owner = "client!aq", name = "p", descriptor = "I")
	public final int anInt548;

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(II)V")
	public Class15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt537 = arg0;
		this.anInt548 = arg1;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)Lclient!aq;")
	public Class15 method440(@OriginalArg(1) int arg0) {
		return new Class15(this.anInt537, arg0);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Z)Lclient!gaa;")
	public Class110 method442() {
		return Static69.method1634(this.anInt537);
	}
}
