import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public final class Class319 {

	@OriginalMember(owner = "client!tea", name = "i", descriptor = "Lclient!eea;")
	private final Class87_Sub1_Sub1 aClass87_Sub1_Sub1_11;

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "I")
	public final int anInt8990;

	@OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(Lclient!eea;II)V")
	public Class319(@OriginalArg(0) Class87_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass87_Sub1_Sub1_11 = arg0;
		this.anInt8990 = arg2;
	}

	@OriginalMember(owner = "client!tea", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass87_Sub1_Sub1_11.method2408(this.anInt8990);
		super.finalize();
	}
}
