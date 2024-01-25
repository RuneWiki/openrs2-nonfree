import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public abstract class Class120 {

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "[B")
	protected final byte[] aByteArray91 = new byte[5000];

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "I")
	protected volatile int anInt7402 = 0;

	@OriginalMember(owner = "client!ir", name = "e", descriptor = "I")
	protected int anInt7403 = 0;

	@OriginalMember(owner = "client!ir", name = "g", descriptor = "[F")
	protected final float[] aFloatArray29 = new float[5000];

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "I")
	protected int anInt7401 = 0;

	@OriginalMember(owner = "client!ir", name = "h", descriptor = "I")
	protected volatile int anInt7404 = 0;

	@OriginalMember(owner = "client!ir", name = "f", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray35 = new Object[5000];

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!og;IIFZ)V")
	public abstract void method6071(@OriginalArg(0) Class86 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) boolean arg3);

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(BLclient!hg;)V")
	public abstract void method6072(@OriginalArg(1) Class101 arg0);

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!hg;I)V")
	public abstract void method6073(@OriginalArg(0) Class101 arg0);

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)V")
	public abstract void method6076(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(II)V")
	public abstract void method6077(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(BLclient!hg;)V")
	public abstract void method6078(@OriginalArg(1) Class101 arg0);

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)V")
	public abstract void method6079();

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)V")
	public abstract void method6080();
}
