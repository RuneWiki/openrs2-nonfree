import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public final class Class67 {

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "Lclient!po;")
	private final Class59_Sub1 aClass59_Sub1_15;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
	public final int anInt2115;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lclient!po;I[Lclient!b;)V")
	public Class67(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16[] arg2) {
		this.aClass59_Sub1_15 = arg0;
		this.anInt2115 = arg1;
	}

	@OriginalMember(owner = "client!fj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass59_Sub1_15.method4270(this.anInt2115);
		super.finalize();
	}
}
