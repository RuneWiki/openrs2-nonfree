import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public final class Class40 {

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "Lclient!hj;")
	private final Class2_Sub1 aClass2_Sub1_8;

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
	public final int anInt1366;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lclient!hj;II)V")
	public Class40(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub1_8 = arg0;
		this.anInt1366 = arg1;
	}

	@OriginalMember(owner = "client!dk", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass2_Sub1_8.method2319(this.anInt1366);
		super.finalize();
	}
}
