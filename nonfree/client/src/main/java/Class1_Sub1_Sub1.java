import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!aa", name = "s", descriptor = "Lclient!nba;")
	public final Interface9 anInterface9_3;

	@OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
	public final int anInt5589;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lclient!nba;I)V")
	protected Class1_Sub1_Sub1(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) int arg1) {
		this.anInterface9_3 = arg0;
		this.anInt5589 = arg1;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method4832();

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "(I)Z")
	public abstract boolean method4833();
}
