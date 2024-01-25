import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public abstract class Class45 {

	@OriginalMember(owner = "client!sn", name = "h", descriptor = "I")
	protected int anInt4430 = 0;

	@OriginalMember(owner = "client!sn", name = "k", descriptor = "I")
	protected int anInt4432 = 0;

	@OriginalMember(owner = "client!sn", name = "i", descriptor = "I")
	protected volatile int anInt4431 = 0;

	@OriginalMember(owner = "client!sn", name = "m", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray33 = new Object[5000];

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
	protected volatile int anInt4427 = 0;

	@OriginalMember(owner = "client!sn", name = "l", descriptor = "[B")
	protected final byte[] aByteArray58 = new byte[5000];

	@OriginalMember(owner = "client!sn", name = "j", descriptor = "[F")
	protected final float[] aFloatArray25 = new float[5000];

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)V")
	public abstract void method3938(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!ls;Z)V")
	public abstract void method3941(@OriginalArg(0) Class128 arg0);

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(FBIZLclient!uh;)V")
	public abstract void method3945(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class60 arg3);

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
	public abstract void method3946();

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILclient!ls;)V")
	public abstract void method3947(@OriginalArg(1) Class128 arg0);

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Z)V")
	public abstract void method3950();

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IB)V")
	public abstract void method3951(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!ls;B)V")
	public abstract void method3952(@OriginalArg(0) Class128 arg0);
}
