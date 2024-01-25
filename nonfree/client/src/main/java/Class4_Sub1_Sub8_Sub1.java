import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public final class Class4_Sub1_Sub8_Sub1 extends Class4_Sub1_Sub8 {

	@OriginalMember(owner = "client!ne", name = "M", descriptor = "Ljava/lang/Object;")
	private final Object anObject26;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class4_Sub1_Sub8_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject26 = arg0;
	}

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method3883() {
		return false;
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method3885() {
		return this.anObject26;
	}
}
