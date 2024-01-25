import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public abstract class Class2_Sub1_Sub4 extends Class2_Sub1 {

	@OriginalMember(owner = "client!oh", name = "E", descriptor = "Lclient!ig;")
	public final Interface4 anInterface4_3;

	@OriginalMember(owner = "client!oh", name = "G", descriptor = "I")
	public final int anInt1791;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!ig;I)V")
	protected Class2_Sub1_Sub4(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) int arg1) {
		this.anInterface4_3 = arg0;
		this.anInt1791 = arg1;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)Z")
	public abstract boolean method1616();

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method1618();
}
