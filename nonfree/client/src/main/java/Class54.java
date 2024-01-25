import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public abstract class Class54 {

	@OriginalMember(owner = "client!jn", name = "g", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray3 = new Object[5000];

	@OriginalMember(owner = "client!jn", name = "j", descriptor = "I")
	protected volatile int anInt1351 = 0;

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "[B")
	protected final byte[] aByteArray28 = new byte[5000];

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "[F")
	protected final float[] aFloatArray6 = new float[5000];

	@OriginalMember(owner = "client!jn", name = "l", descriptor = "I")
	protected int anInt1352 = 0;

	@OriginalMember(owner = "client!jn", name = "m", descriptor = "I")
	protected volatile int anInt1353 = 0;

	@OriginalMember(owner = "client!jn", name = "n", descriptor = "I")
	protected int anInt1354 = 0;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
	public abstract void method1109();

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IB)V")
	public abstract void method1110(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)V")
	public abstract void method1111(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILclient!cl;ZIF)V")
	public abstract void method1114(@OriginalArg(0) int arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) float arg3);

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BLclient!ke;)V")
	public abstract void method1115(@OriginalArg(1) Class132 arg0);

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!ke;I)V")
	public abstract void method1116(@OriginalArg(0) Class132 arg0);

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V")
	public abstract void method1117();

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(BLclient!ke;)V")
	public abstract void method1120(@OriginalArg(1) Class132 arg0);
}
