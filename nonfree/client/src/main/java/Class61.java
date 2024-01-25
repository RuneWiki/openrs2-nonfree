import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public final class Class61 {

	@OriginalMember(owner = "client!du", name = "c", descriptor = "Lclient!nm;")
	private final Class164_Sub1 aClass164_Sub1_10;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "I")
	public final int anInt1455;

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "(Lclient!nm;I[Lclient!nr;)V")
	public Class61(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class167[] arg2) {
		this.aClass164_Sub1_10 = arg0;
		this.anInt1455 = arg1;
	}

	@OriginalMember(owner = "client!du", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass164_Sub1_10.method3625(this.anInt1455);
		super.finalize();
	}
}
