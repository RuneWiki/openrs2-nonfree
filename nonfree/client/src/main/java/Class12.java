import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public abstract class Class12 {

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
	protected volatile int anInt3608 = 0;

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "[B")
	protected final byte[] aByteArray72 = new byte[5000];

	@OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
	protected volatile int anInt3612 = 0;

	@OriginalMember(owner = "client!ij", name = "h", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray35 = new Object[5000];

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
	protected int anInt3611 = 0;

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "[F")
	protected final float[] aFloatArray20 = new float[5000];

	@OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
	protected int anInt3613 = 0;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!sn;I)V")
	public abstract void method3101(@OriginalArg(0) Class227 arg0);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)V")
	public abstract void method3103(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(Lclient!sn;I)V")
	public abstract void method3105(@OriginalArg(0) Class227 arg0);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
	public abstract void method3107();

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(II)V")
	public abstract void method3108(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZLclient!sn;)V")
	public abstract void method3109(@OriginalArg(1) Class227 arg0);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZFIILclient!o;)V")
	public abstract void method3110(@OriginalArg(0) boolean arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class55 arg3);

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)V")
	public abstract void method3111();
}
