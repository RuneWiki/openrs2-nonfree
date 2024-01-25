import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public final class Class39 {

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "Lclient!ks;")
	private final Class63_Sub1 aClass63_Sub1_13;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "I")
	public final int anInt1512;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lclient!ks;II)V")
	public Class39(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass63_Sub1_13 = arg0;
		this.anInt1512 = arg2;
	}

	@OriginalMember(owner = "client!dr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass63_Sub1_13.method3338(this.anInt1512);
		super.finalize();
	}
}
