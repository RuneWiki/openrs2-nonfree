import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public abstract class Class28 {

	@OriginalMember(owner = "client!tp", name = "e", descriptor = "[F")
	protected final float[] aFloatArray29 = new float[5000];

	@OriginalMember(owner = "client!tp", name = "h", descriptor = "I")
	protected int anInt6462 = 0;

	@OriginalMember(owner = "client!tp", name = "f", descriptor = "I")
	protected int anInt6460 = 0;

	@OriginalMember(owner = "client!tp", name = "d", descriptor = "[B")
	protected final byte[] aByteArray93 = new byte[5000];

	@OriginalMember(owner = "client!tp", name = "n", descriptor = "I")
	protected volatile int anInt6468 = 0;

	@OriginalMember(owner = "client!tp", name = "o", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray35 = new Object[5000];

	@OriginalMember(owner = "client!tp", name = "m", descriptor = "I")
	protected volatile int anInt6467 = 0;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(ILclient!dn;)V")
	public abstract void method5710(@OriginalArg(1) Class51 arg0);

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(BI)V")
	public abstract void method5711(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IFLclient!ac;ZI)V")
	public abstract void method5712(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class3 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!dn;I)V")
	public abstract void method5715(@OriginalArg(0) Class51 arg0);

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(B)V")
	public abstract void method5716();

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!dn;B)V")
	public abstract void method5717(@OriginalArg(0) Class51 arg0);

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(B)V")
	public abstract void method5718();

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(II)V")
	public abstract void method5719(@OriginalArg(0) int arg0);
}
