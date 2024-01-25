import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public final class Class125 {

	@OriginalMember(owner = "client!m", name = "b", descriptor = "Lclient!po;")
	private final Class59_Sub1 aClass59_Sub1_29;

	@OriginalMember(owner = "client!m", name = "c", descriptor = "I")
	public final int anInt3668;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!po;II)V")
	public Class125(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass59_Sub1_29 = arg0;
		this.anInt3668 = arg2;
	}

	@OriginalMember(owner = "client!m", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass59_Sub1_29.method4314(this.anInt3668);
		super.finalize();
	}
}
