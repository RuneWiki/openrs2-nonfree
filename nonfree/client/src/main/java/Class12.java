import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public abstract class Class12 {

	@OriginalMember(owner = "client!ak", name = "f", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray36 = new Object[5000];

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
	protected int anInt5114 = 0;

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "[B")
	protected final byte[] aByteArray76 = new byte[5000];

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
	protected volatile int anInt5115 = 0;

	@OriginalMember(owner = "client!ak", name = "j", descriptor = "[F")
	protected final float[] aFloatArray33 = new float[5000];

	@OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
	protected volatile int anInt5120 = 0;

	@OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
	protected int anInt5117 = 0;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
	public abstract void method4082();

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V")
	public abstract void method4085();

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BLclient!rb;)V")
	public abstract void method4086(@OriginalArg(1) Class216 arg0);

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZILclient!ya;FI)V")
	public abstract void method4087(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class139 arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BI)V")
	public abstract void method4090(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILclient!rb;)V")
	public abstract void method4091(@OriginalArg(1) Class216 arg0);

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)V")
	public abstract void method4092(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(ILclient!rb;)V")
	public abstract void method4093(@OriginalArg(1) Class216 arg0);
}
