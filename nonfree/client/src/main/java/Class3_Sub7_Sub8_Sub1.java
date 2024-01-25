import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public final class Class3_Sub7_Sub8_Sub1 extends Class3_Sub7_Sub8 {

	@OriginalMember(owner = "client!ev", name = "E", descriptor = "Ljava/lang/Object;")
	private final Object anObject7;

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class3_Sub7_Sub8_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject7 = arg0;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method2599() {
		return false;
	}

	@OriginalMember(owner = "client!ev", name = "c", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method2600() {
		return this.anObject7;
	}
}
