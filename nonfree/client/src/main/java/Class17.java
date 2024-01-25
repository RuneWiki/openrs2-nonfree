import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public final class Class17 {

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "Lclient!ig;")
	private final Class47_Sub2 aClass47_Sub2_4;

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
	public final int anInt395;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!ig;II)V")
	public Class17(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass47_Sub2_4 = arg0;
		this.anInt395 = arg1;
	}

	@OriginalMember(owner = "client!bd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass47_Sub2_4.method2770(this.anInt395);
		super.finalize();
	}
}
