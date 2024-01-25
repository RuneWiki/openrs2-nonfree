import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public final class Class1_Sub8_Sub14_Sub1 extends Class1_Sub8_Sub14 {

	@OriginalMember(owner = "client!rj", name = "G", descriptor = "Ljava/lang/Object;")
	private final Object anObject20;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class1_Sub8_Sub14_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject20 = arg0;
	}

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method7008() {
		return this.anObject20;
	}

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7012() {
		return false;
	}
}
