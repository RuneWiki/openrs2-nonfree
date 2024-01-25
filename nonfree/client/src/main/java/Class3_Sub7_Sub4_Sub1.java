import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public final class Class3_Sub7_Sub4_Sub1 extends Class3_Sub7_Sub4 {

	@OriginalMember(owner = "client!dj", name = "R", descriptor = "Ljava/lang/Object;")
	private final Object anObject7;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lclient!kw;Ljava/lang/Object;I)V")
	public Class3_Sub7_Sub4_Sub1(@OriginalArg(0) Interface10 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject7 = arg1;
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5376() {
		return false;
	}

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method5377() {
		return this.anObject7;
	}
}
