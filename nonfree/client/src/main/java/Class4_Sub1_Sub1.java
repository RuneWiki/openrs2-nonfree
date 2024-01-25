import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public abstract class Class4_Sub1_Sub1 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ac", name = "B", descriptor = "Lclient!tp;")
	public final Interface8 anInterface8_3;

	@OriginalMember(owner = "client!ac", name = "F", descriptor = "I")
	public final int anInt1339;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lclient!tp;I)V")
	protected Class4_Sub1_Sub1(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1) {
		this.anInterface8_3 = arg0;
		this.anInt1339 = arg1;
	}

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "(I)Z")
	public abstract boolean method1229();

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method1230();
}
