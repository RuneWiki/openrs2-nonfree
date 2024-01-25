import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public abstract class Class2_Sub6_Sub2 extends Class2_Sub6 {

	@OriginalMember(owner = "client!rd", name = "z", descriptor = "Lclient!we;")
	public final Interface26 anInterface26_3;

	@OriginalMember(owner = "client!rd", name = "w", descriptor = "I")
	public final int anInt7009;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lclient!we;I)V")
	protected Class2_Sub6_Sub2(@OriginalArg(0) Interface26 arg0, @OriginalArg(1) int arg1) {
		this.anInterface26_3 = arg0;
		this.anInt7009 = arg1;
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method5984();

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(B)Z")
	public abstract boolean method5985();
}
