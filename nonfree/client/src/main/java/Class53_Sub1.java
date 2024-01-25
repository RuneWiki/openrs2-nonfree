import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class Class53_Sub1 extends Class53 {

	@OriginalMember(owner = "client!eh", name = "V", descriptor = "Lclient!tl;")
	private final Class4_Sub2 aClass4_Sub2_16;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lclient!tl;Z)V")
	public Class53_Sub1(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		super(arg1);
		this.aClass4_Sub2_16 = arg0;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILclient!qea;I)V")
	@Override
	protected final void method4076(@OriginalArg(0) int arg0, @OriginalArg(1) Class307 arg1) {
		Static512.method7252(arg1, this.aClass4_Sub2_16, arg0);
	}
}
