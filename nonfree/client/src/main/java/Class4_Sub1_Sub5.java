import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public abstract class Class4_Sub1_Sub5 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ck", name = "I", descriptor = "I")
	public final int anInt7609;

	@OriginalMember(owner = "client!ck", name = "J", descriptor = "Lclient!dt;")
	public final Interface2 anInterface2_3;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!dt;I)V")
	protected Class4_Sub1_Sub5(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1) {
		this.anInt7609 = arg1;
		this.anInterface2_3 = arg0;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)Z")
	public abstract boolean method5864();

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method5865();
}
