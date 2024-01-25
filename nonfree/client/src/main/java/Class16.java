import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public abstract class Class16 {

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
	protected volatile int anInt6758 = 0;

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
	protected int anInt6762 = 0;

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "[B")
	protected final byte[] aByteArray88 = new byte[5000];

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
	protected volatile int anInt6764 = 0;

	@OriginalMember(owner = "client!jf", name = "j", descriptor = "[F")
	protected final float[] aFloatArray24 = new float[5000];

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray34 = new Object[5000];

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
	protected int anInt6760 = 0;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZI)V")
	public abstract void method5250(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILclient!dr;)V")
	public abstract void method5251(@OriginalArg(1) Class53 arg0);

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
	public abstract void method5252();

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!dr;B)V")
	public abstract void method5253(@OriginalArg(0) Class53 arg0);

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)V")
	public abstract void method5256(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
	public abstract void method5257();

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!na;ZFIZ)V")
	public abstract void method5258(@OriginalArg(0) Class146 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3);

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(Lclient!dr;B)V")
	public abstract void method5259(@OriginalArg(0) Class53 arg0);
}
