import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public abstract class Class3_Sub4_Sub6 extends Class3_Sub4 {

	@OriginalMember(owner = "client!wm", name = "v", descriptor = "I")
	public final int anInt7500;

	@OriginalMember(owner = "client!wm", name = "u", descriptor = "Lclient!ue;")
	public final Interface11 anInterface11_3;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lclient!ue;I)V")
	protected Class3_Sub4_Sub6(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) int arg1) {
		this.anInt7500 = arg1;
		this.anInterface11_3 = arg0;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)Z")
	public abstract boolean method5832();

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method5833();
}
