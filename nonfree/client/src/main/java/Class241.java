import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public final class Class241 {

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "Lclient!pea;")
	private final Class121_Sub3 aClass121_Sub3_33;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "J")
	public final long aLong174;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!pea;JI)V")
	public Class241(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass121_Sub3_33 = arg0;
		this.aLong174 = arg1;
	}

	@OriginalMember(owner = "client!pc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass121_Sub3_33.method5697(this.aLong174);
		super.finalize();
	}
}
