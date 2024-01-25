import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public final class Class2_Sub6_Sub11_Sub1 extends Class2_Sub6_Sub11 {

	@OriginalMember(owner = "client!mn", name = "E", descriptor = "Ljava/lang/Object;")
	private final Object anObject11;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class2_Sub6_Sub11_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject11 = arg0;
	}

	@OriginalMember(owner = "client!mn", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method6204() {
		return false;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method6201() {
		return this.anObject11;
	}
}
