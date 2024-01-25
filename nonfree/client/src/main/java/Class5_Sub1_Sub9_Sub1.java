import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public final class Class5_Sub1_Sub9_Sub1 extends Class5_Sub1_Sub9 {

	@OriginalMember(owner = "client!iga", name = "F", descriptor = "Ljava/lang/Object;")
	private final Object anObject10;

	@OriginalMember(owner = "client!iga", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class5_Sub1_Sub9_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject10 = arg0;
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5528() {
		return false;
	}

	@OriginalMember(owner = "client!iga", name = "c", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method5526() {
		return this.anObject10;
	}
}
