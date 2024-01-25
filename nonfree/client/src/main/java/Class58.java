import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public abstract class Class58 {

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "[B")
	protected final byte[] aByteArray68 = new byte[5000];

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "I")
	protected int anInt5935 = 0;

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
	protected volatile int anInt5937 = 0;

	@OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
	protected volatile int anInt5938 = 0;

	@OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
	protected int anInt5940 = 0;

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray35 = new Object[5000];

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
	public abstract void method5088();

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZLclient!ne;)V")
	public abstract void method5089(@OriginalArg(1) Class224 arg0);

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)V")
	public abstract void method5090(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILclient!ne;)V")
	public abstract void method5091(@OriginalArg(1) Class224 arg0);

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(ILclient!ne;)V")
	public abstract void method5092(@OriginalArg(1) Class224 arg0);

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!d;IZI)V")
	public abstract void method5094(@OriginalArg(0) Class62 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)V")
	public abstract void method5095();

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(II)V")
	public abstract void method5096(@OriginalArg(1) int arg0);
}
