import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!aa", name = "s", descriptor = "I")
	public final int anInt5669;

	@OriginalMember(owner = "client!aa", name = "o", descriptor = "Lclient!maa;")
	public final Interface6 anInterface6_3;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lclient!maa;I)V")
	protected Class1_Sub1_Sub1(@OriginalArg(0) Interface6 arg0, @OriginalArg(1) int arg1) {
		this.anInt5669 = arg1;
		this.anInterface6_3 = arg0;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)Z")
	public abstract boolean method4834();

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(Z)Ljava/lang/Object;")
	public abstract Object method4835();
}
