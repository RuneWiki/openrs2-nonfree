import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public final class Class3_Sub7_Sub15_Sub1 extends Class3_Sub7_Sub15 {

	@OriginalMember(owner = "client!kaa", name = "D", descriptor = "Ljava/lang/Object;")
	private final Object anObject10;

	@OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class3_Sub7_Sub15_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject10 = arg0;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method6553() {
		return this.anObject10;
	}

	@OriginalMember(owner = "client!kaa", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method6554() {
		return false;
	}
}
