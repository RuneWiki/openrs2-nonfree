import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public final class Class227 {

	@OriginalMember(owner = "client!og", name = "f", descriptor = "Lclient!pea;")
	private final Class121_Sub3 aClass121_Sub3_32;

	@OriginalMember(owner = "client!og", name = "c", descriptor = "J")
	public final long aLong166;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lclient!pea;J[Lclient!pc;)V")
	public Class227(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class241[] arg2) {
		this.aClass121_Sub3_32 = arg0;
		this.aLong166 = arg1;
	}

	@OriginalMember(owner = "client!og", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass121_Sub3_32.method5697(this.aLong166);
		super.finalize();
	}
}
