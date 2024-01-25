import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public final class Class19 {

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "Lclient!ad;")
	private final Class7_Sub1_Sub1 aClass7_Sub1_Sub1_3;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "I")
	public final int anInt954;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lclient!ad;II)V")
	public Class19(@OriginalArg(0) Class7_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass7_Sub1_Sub1_3 = arg0;
		this.anInt954 = arg2;
	}

	@OriginalMember(owner = "client!ar", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass7_Sub1_Sub1_3.method637(this.anInt954);
		super.finalize();
	}
}
