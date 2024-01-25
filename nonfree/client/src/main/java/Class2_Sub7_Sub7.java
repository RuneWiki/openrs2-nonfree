import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public abstract class Class2_Sub7_Sub7 extends Class2_Sub7 {

	@OriginalMember(owner = "client!ni", name = "s", descriptor = "I")
	public final int anInt5394;

	@OriginalMember(owner = "client!ni", name = "t", descriptor = "Lclient!hh;")
	public final Interface9 anInterface9_3;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lclient!hh;I)V")
	protected Class2_Sub7_Sub7(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) int arg1) {
		this.anInt5394 = arg1;
		this.anInterface9_3 = arg0;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method4728();

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)Z")
	public abstract boolean method4730();
}
