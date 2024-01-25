import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public final class Class2_Sub6_Sub2_Sub1 extends Class2_Sub6_Sub2 {

	@OriginalMember(owner = "client!ct", name = "B", descriptor = "Ljava/lang/Object;")
	private final Object anObject10;

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lclient!we;Ljava/lang/Object;I)V")
	public Class2_Sub6_Sub2_Sub1(@OriginalArg(0) Interface26 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject10 = arg1;
	}

	@OriginalMember(owner = "client!ct", name = "d", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method5984() {
		return this.anObject10;
	}

	@OriginalMember(owner = "client!ct", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method5985() {
		return false;
	}
}
