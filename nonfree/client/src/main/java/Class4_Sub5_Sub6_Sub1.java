import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dha")
public final class Class4_Sub5_Sub6_Sub1 extends Class4_Sub5_Sub6 {

	@OriginalMember(owner = "client!dha", name = "C", descriptor = "Ljava/lang/Object;")
	private final Object anObject3;

	@OriginalMember(owner = "client!dha", name = "<init>", descriptor = "(Lclient!we;Ljava/lang/Object;I)V")
	public Class4_Sub5_Sub6_Sub1(@OriginalArg(0) Interface27 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject3 = arg1;
	}

	@OriginalMember(owner = "client!dha", name = "d", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method7154() {
		return this.anObject3;
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7153() {
		return false;
	}
}
