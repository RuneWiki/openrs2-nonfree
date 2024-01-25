import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public abstract class Class20 {

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "[Lclient!gn;")
	public static final Class97[] aClass97Array3 = new Class97[5];

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "[F")
	protected final float[] aFloatArray31 = new float[5000];

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
	protected volatile int anInt7090 = 0;

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
	protected int anInt7091 = 0;

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray36 = new Object[5000];

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "[B")
	protected final byte[] aByteArray87 = new byte[5000];

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
	protected volatile int anInt7088 = 0;

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
	protected int anInt7089 = 0;

	static {
		for (@Pc(6) int local6 = 0; local6 < aClass97Array3.length; local6++) {
			aClass97Array3[local6] = new Class97();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(FLclient!ya;BIZ)V")
	public abstract void method5675(@OriginalArg(0) float arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3);

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V")
	public abstract void method5677(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(II)V")
	public abstract void method5678(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLclient!ce;)V")
	public abstract void method5679(@OriginalArg(1) Class36 arg0);

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILclient!ce;)V")
	public abstract void method5680(@OriginalArg(1) Class36 arg0);

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(BLclient!ce;)V")
	public abstract void method5681(@OriginalArg(1) Class36 arg0);

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
	public abstract void method5682();

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V")
	public abstract void method5684();
}
