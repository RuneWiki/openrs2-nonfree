import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public abstract class Class42 {

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray33 = new Object[5000];

	@OriginalMember(owner = "client!tg", name = "h", descriptor = "[F")
	protected final float[] aFloatArray9 = new float[5000];

	@OriginalMember(owner = "client!tg", name = "j", descriptor = "[B")
	protected final byte[] aByteArray37 = new byte[5000];

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
	protected int anInt2313 = 0;

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
	protected int anInt2315 = 0;

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
	protected volatile int anInt2316 = 0;

	@OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
	protected volatile int anInt2317 = 0;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZLclient!ip;FZI)V")
	public abstract void method2029(@OriginalArg(1) Class53 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILclient!sq;)V")
	public abstract void method2030(@OriginalArg(1) Class194 arg0);

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)V")
	public abstract void method2031();

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLclient!sq;)V")
	public abstract void method2032(@OriginalArg(1) Class194 arg0);

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
	public abstract void method2033();

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)V")
	public abstract void method2034(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)V")
	public abstract void method2035(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!sq;I)V")
	public abstract void method2036(@OriginalArg(0) Class194 arg0);
}
