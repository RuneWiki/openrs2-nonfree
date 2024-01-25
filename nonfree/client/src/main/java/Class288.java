import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public final class Class288 {

	@OriginalMember(owner = "client!rda", name = "d", descriptor = "Lclient!nv;")
	private final Class16_Sub3 aClass16_Sub3_36;

	@OriginalMember(owner = "client!rda", name = "g", descriptor = "J")
	public final long aLong223;

	@OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(Lclient!nv;J[Lclient!w;)V")
	public Class288(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class362[] arg2) {
		this.aClass16_Sub3_36 = arg0;
		this.aLong223 = arg1;
	}

	@OriginalMember(owner = "client!rda", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass16_Sub3_36.method5994(this.aLong223);
		super.finalize();
	}
}
