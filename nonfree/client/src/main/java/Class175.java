import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public final class Class175 {

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "Lclient!rl;")
	public Class175 aClass175_2;

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
	public int anInt5501;

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "Lclient!s;")
	public Class57 aClass57_3;

	@OriginalMember(owner = "client!rl", name = "i", descriptor = "I")
	public int anInt5505;

	@OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
	public int anInt5507;

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
	public final int anInt5503;

	@OriginalMember(owner = "client!rl", name = "m", descriptor = "I")
	public final int anInt5509;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(II)V")
	public Class175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5503 = arg1;
		this.anInt5509 = arg0;
	}

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lclient!rl;I)V")
	public Class175(@OriginalArg(0) Class175 arg0, @OriginalArg(1) int arg1) {
		this.aClass175_2 = arg0;
		this.anInt5503 = arg1 + this.aClass175_2.anInt5503;
		this.anInt5509 = this.aClass175_2.anInt5509;
		this.aClass57_3 = this.aClass175_2.aClass57_3;
	}
}
