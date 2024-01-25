import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public abstract class Class1_Sub6_Sub2 extends Class1_Sub6 {

	@OriginalMember(owner = "client!mn", name = "t", descriptor = "Lclient!vk;")
	public final Interface11 anInterface11_3;

	@OriginalMember(owner = "client!mn", name = "u", descriptor = "I")
	public final int anInt3855;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lclient!vk;I)V")
	protected Class1_Sub6_Sub2(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) int arg1) {
		this.anInterface11_3 = arg0;
		this.anInt3855 = arg1;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)Z")
	public abstract boolean method3184();

	@OriginalMember(owner = "client!mn", name = "g", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method3188();
}
