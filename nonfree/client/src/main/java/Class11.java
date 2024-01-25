import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public abstract class Class11 {

	@OriginalMember(owner = "client!ak", name = "i", descriptor = "[I")
	public static final int[] anIntArray418 = new int[32];

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "[B")
	protected final byte[] aByteArray35 = new byte[5000];

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
	protected int anInt3200 = 0;

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "[F")
	protected final float[] aFloatArray16 = new float[5000];

	@OriginalMember(owner = "client!ak", name = "h", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray33 = new Object[5000];

	@OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
	protected int anInt3204 = 0;

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
	protected volatile int anInt3199 = 0;

	@OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
	protected volatile int anInt3205 = 0;

	static {
		@Pc(6) int local6 = 2;
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			anIntArray418[local8] = local6 - 1;
			local6 += local6;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)V")
	public abstract void method2936(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILclient!dg;)V")
	public abstract void method2937(@OriginalArg(1) Class49 arg0);

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IFZILclient!sa;)V")
	public abstract void method2938(@OriginalArg(1) float arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class8 arg3);

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!dg;I)V")
	public abstract void method2939(@OriginalArg(0) Class49 arg0);

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZI)V")
	public abstract void method2940(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
	public abstract void method2942();

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BLclient!dg;)V")
	public abstract void method2943(@OriginalArg(1) Class49 arg0);

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V")
	public abstract void method2944();
}
