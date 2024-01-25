import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public abstract class Class80 {

	@OriginalMember(owner = "client!wr", name = "g", descriptor = "I")
	protected int anInt4509 = 0;

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "I")
	protected volatile int anInt4508 = 0;

	@OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
	protected int anInt4507 = 0;

	@OriginalMember(owner = "client!wr", name = "j", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray34 = new Object[5000];

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "I")
	protected volatile int anInt4506 = 0;

	@OriginalMember(owner = "client!wr", name = "k", descriptor = "[F")
	protected final float[] aFloatArray19 = new float[5000];

	@OriginalMember(owner = "client!wr", name = "i", descriptor = "[B")
	protected final byte[] aByteArray58 = new byte[5000];

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!dc;B)V")
	public abstract void method3920(@OriginalArg(0) Class51 arg0);

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IB)V")
	public abstract void method3922(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V")
	public abstract void method3923();

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Z)V")
	public abstract void method3924();

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(BI)V")
	public abstract void method3926(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IZZLclient!s;F)V")
	public abstract void method3927(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class105 arg2, @OriginalArg(4) float arg3);

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!dc;I)V")
	public abstract void method3929(@OriginalArg(0) Class51 arg0);

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILclient!dc;)V")
	public abstract void method3930(@OriginalArg(1) Class51 arg0);
}
