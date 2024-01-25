import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public abstract class Class3_Sub1_Sub7 extends Class3_Sub1 {

	@OriginalMember(owner = "client!rba", name = "y", descriptor = "Lclient!qq;")
	public final Interface20 anInterface20_3;

	@OriginalMember(owner = "client!rba", name = "t", descriptor = "I")
	public final int anInt9170;

	@OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lclient!qq;I)V")
	protected Class3_Sub1_Sub7(@OriginalArg(0) Interface20 arg0, @OriginalArg(1) int arg1) {
		this.anInterface20_3 = arg0;
		this.anInt9170 = arg1;
	}

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method7560();

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(Z)Z")
	public abstract boolean method7563();
}
