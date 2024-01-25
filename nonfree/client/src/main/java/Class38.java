import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public abstract class Class38 {

	@OriginalMember(owner = "client!de", name = "a", descriptor = "I")
	protected volatile int anInt4720 = 0;

	@OriginalMember(owner = "client!de", name = "c", descriptor = "I")
	protected int anInt4722 = 0;

	@OriginalMember(owner = "client!de", name = "e", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray35 = new Object[5000];

	@OriginalMember(owner = "client!de", name = "d", descriptor = "I")
	protected int anInt4723 = 0;

	@OriginalMember(owner = "client!de", name = "l", descriptor = "[B")
	protected final byte[] aByteArray82 = new byte[5000];

	@OriginalMember(owner = "client!de", name = "h", descriptor = "[F")
	protected final float[] aFloatArray23 = new float[5000];

	@OriginalMember(owner = "client!de", name = "o", descriptor = "I")
	protected volatile int anInt4725 = 0;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!jd;Z)V")
	public abstract void method4163(@OriginalArg(0) Class106 arg0);

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BLclient!jd;)V")
	public abstract void method4164(@OriginalArg(1) Class106 arg0);

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(FILclient!ij;ZI)V")
	public abstract void method4165(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!jd;)V")
	public abstract void method4166(@OriginalArg(1) Class106 arg0);

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BI)V")
	public abstract void method4167(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II)V")
	public abstract void method4168(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V")
	public abstract void method4169();

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
	public abstract void method4170();
}
