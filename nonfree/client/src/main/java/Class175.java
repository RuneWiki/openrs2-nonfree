import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public final class Class175 {

	@OriginalMember(owner = "client!le", name = "d", descriptor = "I")
	public final int anInt5580;

	@OriginalMember(owner = "client!le", name = "c", descriptor = "Lclient!gf;")
	private final Class5_Sub3_Sub1 aClass5_Sub3_Sub1_8;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lclient!gf;II)V")
	public Class175(@OriginalArg(0) Class5_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5580 = arg2;
		this.aClass5_Sub3_Sub1_8 = arg0;
	}

	@OriginalMember(owner = "client!le", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass5_Sub3_Sub1_8.method3096(this.anInt5580);
		super.finalize();
	}
}
