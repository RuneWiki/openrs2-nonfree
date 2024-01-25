import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public abstract class Class103 {

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
	protected volatile int anInt6721 = 0;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
	protected volatile int anInt6720 = 0;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray35 = new Object[5000];

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
	protected int anInt6725 = 0;

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
	protected int anInt6719 = 0;

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "[F")
	protected final float[] aFloatArray30 = new float[5000];

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "[B")
	protected final byte[] aByteArray94 = new byte[5000];

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZFIILclient!da;)V")
	public abstract void method5627(@OriginalArg(0) boolean arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class22 arg3);

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)V")
	public abstract void method5629(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!dh;I)V")
	public abstract void method5630(@OriginalArg(0) Class45 arg0);

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLclient!dh;)V")
	public abstract void method5632(@OriginalArg(1) Class45 arg0);

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	public abstract void method5634();

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(II)V")
	public abstract void method5636(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
	public abstract void method5638();

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZLclient!dh;)V")
	public abstract void method5640(@OriginalArg(1) Class45 arg0);
}
