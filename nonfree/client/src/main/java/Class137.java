import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public abstract class Class137 {

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "[F")
	protected final float[] aFloatArray68 = new float[5000];

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "I")
	protected int anInt7816 = 0;

	@OriginalMember(owner = "client!uo", name = "g", descriptor = "[B")
	protected final byte[] aByteArray104 = new byte[5000];

	@OriginalMember(owner = "client!uo", name = "h", descriptor = "I")
	protected int anInt7820 = 0;

	@OriginalMember(owner = "client!uo", name = "j", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray5 = new Object[5000];

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "I")
	protected volatile int anInt7819 = 0;

	@OriginalMember(owner = "client!uo", name = "i", descriptor = "I")
	protected volatile int anInt7821 = 0;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(FIIZLclient!sa;)V")
	public abstract void method6545(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class75 arg3);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(BLclient!sk;)V")
	public abstract void method6546(@OriginalArg(1) Class262 arg0);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)V")
	public abstract void method6547();

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IZ)V")
	public abstract void method6550(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(BLclient!sk;)V")
	public abstract void method6551(@OriginalArg(1) Class262 arg0);

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)V")
	public abstract void method6552();

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)V")
	public abstract void method6553(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!sk;B)V")
	public abstract void method6554(@OriginalArg(0) Class262 arg0);
}
