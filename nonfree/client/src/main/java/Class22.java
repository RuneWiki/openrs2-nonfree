import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public abstract class Class22 {

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
	protected int anInt2460 = 0;

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
	protected volatile int anInt2461 = 0;

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray4 = new Object[5000];

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "[F")
	protected final float[] aFloatArray6 = new float[5000];

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
	protected volatile int anInt2465 = 0;

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
	protected int anInt2462 = 0;

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "[B")
	protected final byte[] aByteArray30 = new byte[5000];

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!iq;B)V")
	public abstract void method1888(@OriginalArg(0) Class118 arg0);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
	public abstract void method1889();

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(FZILclient!na;B)V")
	public abstract void method1891(@OriginalArg(0) float arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class159 arg3);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)V")
	public abstract void method1892(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
	public abstract void method1893();

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)V")
	public abstract void method1896(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLclient!iq;)V")
	public abstract void method1897(@OriginalArg(1) Class118 arg0);

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(BLclient!iq;)V")
	public abstract void method1898(@OriginalArg(1) Class118 arg0);
}
