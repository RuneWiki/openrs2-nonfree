import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public final class Class2_Sub2_Sub6_Sub2 extends Class2_Sub2_Sub6 {

	@OriginalMember(owner = "client!up", name = "P", descriptor = "Z")
	public static boolean aBoolean456 = false;

	@OriginalMember(owner = "client!up", name = "R", descriptor = "[I")
	public static final int[] anIntArray461 = new int[14];

	@OriginalMember(owner = "client!up", name = "C", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_10 = new Class36();

	@OriginalMember(owner = "client!up", name = "N", descriptor = "Ljava/lang/Object;")
	private final Object anObject6;

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 47)
	public Class2_Sub2_Sub6_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject6 = arg0;
	}

	@OriginalMember(owner = "client!up", name = "d", descriptor = "(B)Ljava/lang/Object;", line = 22)
	@Override
	public Object method5952() {
		return this.anObject6;
	}

	@OriginalMember(owner = "client!up", name = "e", descriptor = "(B)Z", line = 33)
	@Override
	public boolean method5955() {
		return false;
	}
}
