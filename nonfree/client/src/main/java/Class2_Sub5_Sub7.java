import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public abstract class Class2_Sub5_Sub7 extends Class2_Sub5 {

	@OriginalMember(owner = "client!ir", name = "y", descriptor = "Lclient!rf;")
	public final Interface21 anInterface21_3;

	@OriginalMember(owner = "client!ir", name = "z", descriptor = "I")
	public final int anInt5374;

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lclient!rf;I)V")
	protected Class2_Sub5_Sub7(@OriginalArg(0) Interface21 arg0, @OriginalArg(1) int arg1) {
		this.anInterface21_3 = arg0;
		this.anInt5374 = arg1;
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(B)Z")
	public abstract boolean method4486();

	@OriginalMember(owner = "client!ir", name = "h", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method4488();
}
