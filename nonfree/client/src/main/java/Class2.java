import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class Class2 {

	@OriginalMember(owner = "client!cga", name = "d", descriptor = "Ljava/lang/Object;")
	public Object anObject2;

	@OriginalMember(owner = "client!cga", name = "j", descriptor = "I")
	public int anInt29;

	@OriginalMember(owner = "client!cga", name = "f", descriptor = "[I")
	public final int[] anIntArray3 = new int[100];

	@OriginalMember(owner = "client!cga", name = "h", descriptor = "[Lclient!hc;")
	public final Class29_Sub2[] aClass29_Sub2Array2 = new Class29_Sub2[100];

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "[Lclient!hj;")
	public final Class6_Sub7[] aClass6_Sub7Array2 = new Class6_Sub7[8];

	@OriginalMember(owner = "client!cga", name = "k", descriptor = "[I")
	public final int[] anIntArray4 = new int[3];
}
