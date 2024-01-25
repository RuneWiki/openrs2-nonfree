import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public abstract class Class2_Sub5_Sub9 extends Class2_Sub5 {

	@OriginalMember(owner = "client!jp", name = "w", descriptor = "I")
	public final int anInt6412;

	@OriginalMember(owner = "client!jp", name = "x", descriptor = "Lclient!sl;")
	public final Interface11 anInterface11_3;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lclient!sl;I)V")
	protected Class2_Sub5_Sub9(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) int arg1) {
		this.anInt6412 = arg1;
		this.anInterface11_3 = arg0;
	}

	@OriginalMember(owner = "client!jp", name = "f", descriptor = "(I)Z")
	public abstract boolean method5075();

	@OriginalMember(owner = "client!jp", name = "g", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method5077();
}
