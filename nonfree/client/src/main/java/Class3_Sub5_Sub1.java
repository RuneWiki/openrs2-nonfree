import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public abstract class Class3_Sub5_Sub1 extends Class3_Sub5 {

	@OriginalMember(owner = "client!qo", name = "x", descriptor = "I")
	public final int anInt10932;

	@OriginalMember(owner = "client!qo", name = "y", descriptor = "Lclient!st;")
	public final Interface24 anInterface24_3;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lclient!st;I)V")
	protected Class3_Sub5_Sub1(@OriginalArg(0) Interface24 arg0, @OriginalArg(1) int arg1) {
		this.anInt10932 = arg1;
		this.anInterface24_3 = arg0;
	}

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method9015();

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "(B)Z")
	public abstract boolean method9018();
}
