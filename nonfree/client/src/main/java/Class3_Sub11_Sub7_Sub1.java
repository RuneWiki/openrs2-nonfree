import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fia")
public final class Class3_Sub11_Sub7_Sub1 extends Class3_Sub11_Sub7 {

	@OriginalMember(owner = "client!fia", name = "M", descriptor = "Ljava/lang/Object;")
	private final Object anObject6;

	@OriginalMember(owner = "client!fia", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class3_Sub11_Sub7_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject6 = arg0;
	}

	@OriginalMember(owner = "client!fia", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method4486() {
		return false;
	}

	@OriginalMember(owner = "client!fia", name = "d", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method4483() {
		return this.anObject6;
	}
}
