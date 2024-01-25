import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public abstract class Class2_Sub1_Sub3 extends Class2_Sub1 {

	@OriginalMember(owner = "client!tk", name = "G", descriptor = "Lclient!qj;")
	public final Interface14 anInterface14_3;

	@OriginalMember(owner = "client!tk", name = "C", descriptor = "I")
	public final int anInt6961;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lclient!qj;I)V")
	protected Class2_Sub1_Sub3(@OriginalArg(0) Interface14 arg0, @OriginalArg(1) int arg1) {
		this.anInterface14_3 = arg0;
		this.anInt6961 = arg1;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method6236();

	@OriginalMember(owner = "client!tk", name = "h", descriptor = "(I)Z")
	public abstract boolean method6239();
}
