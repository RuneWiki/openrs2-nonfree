import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public abstract class Class29 {

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
	protected int anInt4737 = 0;

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
	protected int anInt4738 = 0;

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray35 = new Object[5000];

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "[B")
	protected final byte[] aByteArray84 = new byte[5000];

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
	protected volatile int anInt4740 = 0;

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "[F")
	protected final float[] aFloatArray28 = new float[5000];

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
	protected volatile int anInt4739 = 0;

	static {
		new Class32("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!wr;B)V")
	public abstract void method4183(@OriginalArg(0) Class251 arg0);

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V")
	public abstract void method4184();

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
	public abstract void method4188();

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILclient!wr;)V")
	public abstract void method4189(@OriginalArg(1) Class251 arg0);

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IB)V")
	public abstract void method4190(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!wr;I)V")
	public abstract void method4191(@OriginalArg(0) Class251 arg0);

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(FIZLclient!ij;B)V")
	public abstract void method4193(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class107 arg3);

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)V")
	public abstract void method4194(@OriginalArg(1) int arg0);
}
