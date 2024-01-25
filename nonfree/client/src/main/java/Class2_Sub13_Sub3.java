import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public abstract class Class2_Sub13_Sub3 extends Class2_Sub13 {

	@OriginalMember(owner = "client!vn", name = "t", descriptor = "Lclient!ws;")
	public final Interface20 anInterface20_3;

	@OriginalMember(owner = "client!vn", name = "s", descriptor = "I")
	public final int anInt3806;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lclient!ws;I)V")
	protected Class2_Sub13_Sub3(@OriginalArg(0) Interface20 arg0, @OriginalArg(1) int arg1) {
		this.anInterface20_3 = arg0;
		this.anInt3806 = arg1;
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(B)Z")
	public abstract boolean method3362();

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method3363();
}
