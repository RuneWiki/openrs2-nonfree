import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public final class Class216 {

	@OriginalMember(owner = "client!m", name = "b", descriptor = "I")
	public final int anInt5651;

	@OriginalMember(owner = "client!m", name = "g", descriptor = "Lclient!no;")
	private final Class66_Sub3 aClass66_Sub3_24;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!no;II)V")
	public Class216(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5651 = arg2;
		this.aClass66_Sub3_24 = arg0;
	}

	@OriginalMember(owner = "client!m", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass66_Sub3_24.method5392(this.anInt5651);
		super.finalize();
	}
}
