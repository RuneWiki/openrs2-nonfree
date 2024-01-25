import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public final class Class6_Sub1_Sub11_Sub1 extends Class6_Sub1_Sub11 {

	@OriginalMember(owner = "client!rj", name = "H", descriptor = "Ljava/lang/Object;")
	private final Object anObject8;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lclient!ah;Ljava/lang/Object;I)V")
	public Class6_Sub1_Sub11_Sub1(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject8 = arg1;
	}

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5719() {
		return false;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method5718() {
		return this.anObject8;
	}
}
