import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class Class4 {

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
	public int anInt63;

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "Ljava/lang/Object;")
	public Object anObject2;

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "[Lclient!wc;")
	public final Class3_Sub13_Sub1[] aClass3_Sub13_Sub1Array2 = new Class3_Sub13_Sub1[8];

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "[I")
	public final int[] anIntArray5 = new int[100];

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "[I")
	public final int[] anIntArray4 = new int[3];

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "[Lclient!ro;")
	public final Class5_Sub4[] aClass5_Sub4Array2 = new Class5_Sub4[100];
}
