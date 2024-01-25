import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public final class Class2_Sub5_Sub3_Sub1 extends Class2_Sub5_Sub3 {

	@OriginalMember(owner = "client!ce", name = "H", descriptor = "Ljava/lang/Object;")
	private final Object anObject4;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class2_Sub5_Sub3_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject4 = arg0;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5417() {
		return false;
	}

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method5418() {
		return this.anObject4;
	}
}
