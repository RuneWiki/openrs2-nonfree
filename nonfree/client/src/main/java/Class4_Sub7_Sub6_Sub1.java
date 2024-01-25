import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public final class Class4_Sub7_Sub6_Sub1 extends Class4_Sub7_Sub6 {

	@OriginalMember(owner = "client!gi", name = "z", descriptor = "Ljava/lang/Object;")
	private final Object anObject18;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class4_Sub7_Sub6_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject18 = arg0;
	}

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method7124() {
		return false;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method7127() {
		return this.anObject18;
	}
}
