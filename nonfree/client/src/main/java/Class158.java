import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public final class Class158 {

	@OriginalMember(owner = "client!id", name = "a", descriptor = "I")
	public int anInt4796;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "I")
	public int anInt4797;

	@OriginalMember(owner = "client!id", name = "c", descriptor = "I")
	public int anInt4798;

	@OriginalMember(owner = "client!id", name = "d", descriptor = "I")
	public int anInt4799;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
	public Class158() {
	}

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lclient!id;)V")
	public Class158(@OriginalArg(0) Class158 arg0) {
		this.anInt4798 = arg0.anInt4798;
		this.anInt4799 = arg0.anInt4799;
		this.anInt4796 = arg0.anInt4796;
		this.anInt4797 = arg0.anInt4797;
	}
}
