import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public final class Class237 {

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
	public final int anInt6534;

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "Lclient!vj;")
	private final Class172_Sub2 aClass172_Sub2_37;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lclient!vj;II)V")
	public Class237(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6534 = arg2;
		this.aClass172_Sub2_37 = arg0;
	}

	@OriginalMember(owner = "client!tq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass172_Sub2_37.method5617(this.anInt6534);
		super.finalize();
	}
}
