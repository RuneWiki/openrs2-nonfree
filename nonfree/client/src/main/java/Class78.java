import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public final class Class78 {

	@OriginalMember(owner = "client!eca", name = "c", descriptor = "Lclient!oaa;")
	private final Class132_Sub1_Sub1 aClass132_Sub1_Sub1_4;

	@OriginalMember(owner = "client!eca", name = "d", descriptor = "I")
	public final int anInt2150;

	@OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lclient!oaa;II)V")
	public Class78(@OriginalArg(0) Class132_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass132_Sub1_Sub1_4 = arg0;
		this.anInt2150 = arg2;
	}

	@OriginalMember(owner = "client!eca", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass132_Sub1_Sub1_4.method6162(this.anInt2150);
		super.finalize();
	}
}
