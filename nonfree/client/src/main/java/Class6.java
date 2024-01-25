import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public abstract class Class6 {

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
	protected volatile int anInt6225 = 0;

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray4 = new Object[5000];

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
	protected int anInt6223 = 0;

	@OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
	protected int anInt6227 = 0;

	@OriginalMember(owner = "client!aj", name = "g", descriptor = "[B")
	protected final byte[] aByteArray80 = new byte[5000];

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
	protected volatile int anInt6226 = 0;

	@OriginalMember(owner = "client!aj", name = "h", descriptor = "[F")
	protected final float[] aFloatArray28 = new float[5000];

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V")
	public abstract void method5185();

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!fq;I)V")
	public abstract void method5186(@OriginalArg(0) Class80 arg0);

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V")
	public abstract void method5188(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(FZILclient!ta;I)V")
	public abstract void method5189(@OriginalArg(0) float arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class149 arg3);

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(II)V")
	public abstract void method5191(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
	public abstract void method5192();

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(BLclient!fq;)V")
	public abstract void method5194(@OriginalArg(1) Class80 arg0);

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZLclient!fq;)V")
	public abstract void method5195(@OriginalArg(1) Class80 arg0);
}
