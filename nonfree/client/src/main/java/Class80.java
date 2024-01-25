import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public abstract class Class80 {

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "I")
	protected volatile int anInt6865 = 0;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "[F")
	protected final float[] aFloatArray30 = new float[5000];

	@OriginalMember(owner = "client!gq", name = "j", descriptor = "I")
	protected volatile int anInt6871 = 0;

	@OriginalMember(owner = "client!gq", name = "i", descriptor = "[B")
	protected final byte[] aByteArray95 = new byte[5000];

	@OriginalMember(owner = "client!gq", name = "o", descriptor = "I")
	protected int anInt6876 = 0;

	@OriginalMember(owner = "client!gq", name = "h", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray35 = new Object[5000];

	@OriginalMember(owner = "client!gq", name = "q", descriptor = "I")
	protected int anInt6877 = 0;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!e;B)V")
	public abstract void method5700(@OriginalArg(0) Class57 arg0);

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)V")
	public abstract void method5701();

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IB)V")
	public abstract void method5702(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(B)V")
	public abstract void method5703();

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!e;I)V")
	public abstract void method5704(@OriginalArg(0) Class57 arg0);

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!bl;IFBZ)V")
	public abstract void method5708(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) boolean arg3);

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILclient!e;)V")
	public abstract void method5709(@OriginalArg(1) Class57 arg0);

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(IB)V")
	public abstract void method5711(@OriginalArg(0) int arg0);
}
