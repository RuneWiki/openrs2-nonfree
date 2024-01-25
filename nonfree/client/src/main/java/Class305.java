import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public final class Class305 {

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "Lclient!bea;")
	private final Class31_Sub1_Sub1 aClass31_Sub1_Sub1_11;

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
	public final int anInt8443;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lclient!bea;II)V")
	public Class305(@OriginalArg(0) Class31_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass31_Sub1_Sub1_11 = arg0;
		this.anInt8443 = arg2;
	}

	@OriginalMember(owner = "client!sm", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass31_Sub1_Sub1_11.method1019(this.anInt8443);
		super.finalize();
	}
}
