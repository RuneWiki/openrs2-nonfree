import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public final class Class178 {

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "Lclient!mm;")
	private final Class55_Sub1 aClass55_Sub1_37;

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
	public final int anInt5496;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lclient!mm;I[Lclient!qn;)V")
	public Class178(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class169[] arg2) {
		this.aClass55_Sub1_37 = arg0;
		this.anInt5496 = arg1;
	}

	@OriginalMember(owner = "client!rj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass55_Sub1_37.method3705(this.anInt5496);
		super.finalize();
	}
}
