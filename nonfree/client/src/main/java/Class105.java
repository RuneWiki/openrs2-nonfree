import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public final class Class105 {

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
	public final int anInt3125;

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "Lclient!da;")
	private final Class50_Sub1 aClass50_Sub1_19;

	static {
		new Class182(null, "Dieses System darf nicht missbraucht werden!", null, null);
	}

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lclient!da;II)V")
	public Class105(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3125 = arg2;
		this.aClass50_Sub1_19 = arg0;
	}

	@OriginalMember(owner = "client!hh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass50_Sub1_19.method1310(this.anInt3125);
		super.finalize();
	}
}
