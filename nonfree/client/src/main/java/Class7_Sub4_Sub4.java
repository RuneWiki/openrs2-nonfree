import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public abstract class Class7_Sub4_Sub4 extends Class7_Sub4 {

	@OriginalMember(owner = "client!cm", name = "q", descriptor = "Lclient!rb;")
	public final Interface12 anInterface12_3;

	@OriginalMember(owner = "client!cm", name = "r", descriptor = "I")
	public final int anInt3264;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lclient!rb;I)V")
	protected Class7_Sub4_Sub4(@OriginalArg(0) Interface12 arg0, @OriginalArg(1) int arg1) {
		this.anInterface12_3 = arg0;
		this.anInt3264 = arg1;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method2643();

	@OriginalMember(owner = "client!cm", name = "e", descriptor = "(I)Z")
	public abstract boolean method2644();
}
