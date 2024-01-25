import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public abstract class Class135 {

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "I")
	protected volatile int anInt5774 = 0;

	@OriginalMember(owner = "client!lq", name = "g", descriptor = "I")
	protected volatile int anInt5780 = 0;

	@OriginalMember(owner = "client!lq", name = "j", descriptor = "[B")
	protected final byte[] aByteArray68 = new byte[5000];

	@OriginalMember(owner = "client!lq", name = "n", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray34 = new Object[5000];

	@OriginalMember(owner = "client!lq", name = "m", descriptor = "I")
	protected int anInt5782 = 0;

	@OriginalMember(owner = "client!lq", name = "r", descriptor = "I")
	protected int anInt5785 = 0;

	@OriginalMember(owner = "client!lq", name = "h", descriptor = "[F")
	protected final float[] aFloatArray28 = new float[5000];

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(BI)V")
	public abstract void method5037(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!gk;Z)V")
	public abstract void method5039(@OriginalArg(0) Class83 arg0);

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)V")
	public abstract void method5041();

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(FIZILclient!ck;)V")
	public abstract void method5042(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class12 arg3);

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(B)V")
	public abstract void method5043();

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(ZLclient!gk;)V")
	public abstract void method5044(@OriginalArg(1) Class83 arg0);

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!gk;B)V")
	public abstract void method5045(@OriginalArg(0) Class83 arg0);

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(BI)V")
	public abstract void method5047(@OriginalArg(1) int arg0);
}
