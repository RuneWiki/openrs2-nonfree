import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public final class Class259 {

	@OriginalMember(owner = "client!we", name = "e", descriptor = "Lclient!qg;")
	private final Class121_Sub2 aClass121_Sub2_42;

	@OriginalMember(owner = "client!we", name = "g", descriptor = "J")
	public final long aLong232;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lclient!qg;JI)V")
	public Class259(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass121_Sub2_42 = arg0;
		this.aLong232 = arg1;
	}

	@OriginalMember(owner = "client!we", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass121_Sub2_42.method4686(this.aLong232);
		super.finalize();
	}
}
