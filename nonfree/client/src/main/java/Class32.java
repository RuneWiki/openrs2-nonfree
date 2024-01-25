import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public abstract class Class32 {

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "I")
	protected int anInt7415 = 0;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray36 = new Object[5000];

	@OriginalMember(owner = "client!hr", name = "f", descriptor = "[F")
	protected final float[] aFloatArray41 = new float[5000];

	@OriginalMember(owner = "client!hr", name = "k", descriptor = "[B")
	protected final byte[] aByteArray92 = new byte[5000];

	@OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
	protected volatile int anInt7422 = 0;

	@OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
	protected volatile int anInt7418 = 0;

	@OriginalMember(owner = "client!hr", name = "i", descriptor = "I")
	protected int anInt7420 = 0;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!o;ZFII)V")
	public abstract void method5955(@OriginalArg(0) Class14 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)V")
	public abstract void method5957();

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(BLclient!mm;)V")
	public abstract void method5958(@OriginalArg(1) Class162 arg0);

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)V")
	public abstract void method5959(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!mm;Z)V")
	public abstract void method5960(@OriginalArg(0) Class162 arg0);

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V")
	public abstract void method5962();

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(II)V")
	public abstract void method5963(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILclient!mm;)V")
	public abstract void method5966(@OriginalArg(1) Class162 arg0);
}
