import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public final class Class2_Sub7_Sub7_Sub2 extends Class2_Sub7_Sub7 {

	@OriginalMember(owner = "client!kl", name = "x", descriptor = "Ljava/lang/Object;")
	private final Object anObject11;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lclient!hh;Ljava/lang/Object;I)V")
	public Class2_Sub7_Sub7_Sub2(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject11 = arg1;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4728() {
		return this.anObject11;
	}

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method4730() {
		return false;
	}
}
