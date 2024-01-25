import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public final class Class3_Sub4_Sub13_Sub2 extends Class3_Sub4_Sub13 {

	@OriginalMember(owner = "client!vda", name = "E", descriptor = "Ljava/lang/Object;")
	private final Object anObject21;

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class3_Sub4_Sub13_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject21 = arg0;
	}

	@OriginalMember(owner = "client!vda", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8057() {
		return false;
	}

	@OriginalMember(owner = "client!vda", name = "i", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method8058() {
		return this.anObject21;
	}
}
