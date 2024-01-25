import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public abstract class Class19 {

	@OriginalMember(owner = "client!cg", name = "h", descriptor = "[F")
	protected final float[] aFloatArray27 = new float[5000];

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
	protected int anInt6070 = 0;

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
	protected volatile int anInt6071 = 0;

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
	protected volatile int anInt6072 = 0;

	@OriginalMember(owner = "client!cg", name = "i", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray35 = new Object[5000];

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "[B")
	protected final byte[] aByteArray93 = new byte[5000];

	@OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
	protected int anInt6073 = 0;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
	public abstract void method5298();

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!qa;I)V")
	public abstract void method5299(@OriginalArg(0) Class188 arg0);

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
	public abstract void method5300();

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V")
	public abstract void method5301(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(II)V")
	public abstract void method5303(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIZLclient!mi;F)V")
	public abstract void method5304(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class149 arg2, @OriginalArg(4) float arg3);

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILclient!qa;)V")
	public abstract void method5305(@OriginalArg(1) Class188 arg0);

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(Lclient!qa;I)V")
	public abstract void method5307(@OriginalArg(0) Class188 arg0);
}
