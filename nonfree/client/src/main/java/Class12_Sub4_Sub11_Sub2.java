import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public final class Class12_Sub4_Sub11_Sub2 extends Class12_Sub4_Sub11 {

	@OriginalMember(owner = "client!tm", name = "G", descriptor = "Ljava/lang/Object;")
	private final Object anObject18;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class12_Sub4_Sub11_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject18 = arg0;
	}

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method7120() {
		return this.anObject18;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7117() {
		return false;
	}
}
