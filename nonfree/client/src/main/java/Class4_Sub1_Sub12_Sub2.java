import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public final class Class4_Sub1_Sub12_Sub2 extends Class4_Sub1_Sub12 {

	@OriginalMember(owner = "client!sf", name = "L", descriptor = "Ljava/lang/Object;")
	private final Object anObject9;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class4_Sub1_Sub12_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject9 = arg0;
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method5267() {
		return this.anObject9;
	}

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5269() {
		return false;
	}
}
