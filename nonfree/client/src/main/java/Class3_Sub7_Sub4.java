import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public abstract class Class3_Sub7_Sub4 extends Class3_Sub7 {

	@OriginalMember(owner = "client!en", name = "y", descriptor = "Lclient!so;")
	public final Interface18 anInterface18_3;

	@OriginalMember(owner = "client!en", name = "A", descriptor = "I")
	public final int anInt6998;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lclient!so;I)V")
	protected Class3_Sub7_Sub4(@OriginalArg(0) Interface18 arg0, @OriginalArg(1) int arg1) {
		this.anInterface18_3 = arg0;
		this.anInt6998 = arg1;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method5851();

	@OriginalMember(owner = "client!en", name = "f", descriptor = "(I)Z")
	public abstract boolean method5853();
}
