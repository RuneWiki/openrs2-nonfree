import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public abstract class Class143 {

	@OriginalMember(owner = "client!kp", name = "f", descriptor = "I")
	protected volatile int anInt6456 = 0;

	@OriginalMember(owner = "client!kp", name = "h", descriptor = "I")
	protected int anInt6458 = 0;

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "[F")
	protected final float[] aFloatArray40 = new float[5000];

	@OriginalMember(owner = "client!kp", name = "k", descriptor = "[B")
	protected final byte[] aByteArray74 = new byte[5000];

	@OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
	protected volatile int anInt6460 = 0;

	@OriginalMember(owner = "client!kp", name = "l", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray5 = new Object[5000];

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "I")
	protected int anInt6454 = 0;

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!kf;I)V")
	public abstract void method5049(@OriginalArg(0) Class137 arg0);

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(Lclient!kf;I)V")
	public abstract void method5050(@OriginalArg(0) Class137 arg0);

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZFBLclient!na;I)V")
	public abstract void method5051(@OriginalArg(0) boolean arg0, @OriginalArg(1) float arg1, @OriginalArg(3) Class70 arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZI)V")
	public abstract void method5052(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IZ)V")
	public abstract void method5053(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)V")
	public abstract void method5054();

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!kf;B)V")
	public abstract void method5056(@OriginalArg(0) Class137 arg0);

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Z)V")
	public abstract void method5057();
}
