import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public final class Class286 {

	@OriginalMember(owner = "client!rga", name = "e", descriptor = "Lclient!jq;")
	private final Class43_Sub1_Sub2 aClass43_Sub1_Sub2_11;

	@OriginalMember(owner = "client!rga", name = "b", descriptor = "I")
	public final int anInt7432;

	@OriginalMember(owner = "client!rga", name = "<init>", descriptor = "(Lclient!jq;II)V")
	public Class286(@OriginalArg(0) Class43_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass43_Sub1_Sub2_11 = arg0;
		this.anInt7432 = arg2;
	}

	@OriginalMember(owner = "client!rga", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass43_Sub1_Sub2_11.method4310(this.anInt7432);
		super.finalize();
	}
}
