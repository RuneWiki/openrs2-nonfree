import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public abstract class Class4_Sub6_Sub4 extends Class4_Sub6 {

	@OriginalMember(owner = "client!tt", name = "D", descriptor = "I")
	public final int anInt4125;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(I)V")
	protected Class4_Sub6_Sub4(@OriginalArg(0) int arg0) {
		this.anInt4125 = arg0;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)Z")
	public abstract boolean method3254();

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public abstract Object method3257();
}
