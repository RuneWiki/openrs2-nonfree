import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public final class Class4_Sub1_Sub3_Sub2 extends Class4_Sub1_Sub3 {

	@OriginalMember(owner = "client!kq", name = "N", descriptor = "Ljava/lang/Object;")
	private final Object anObject4;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lclient!wa;Ljava/lang/Object;)V")
	public Class4_Sub1_Sub3_Sub2(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) Object arg1) {
		super(arg0);
		this.anObject4 = arg1;
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method3144() {
		return this.anObject4;
	}

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method3143() {
		return false;
	}
}
