import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public abstract class Class43 {

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
	protected int anInt4078 = 0;

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "[F")
	protected final float[] aFloatArray35 = new float[5000];

	@OriginalMember(owner = "client!cd", name = "k", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray3 = new Object[5000];

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
	protected int anInt4085 = 0;

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "[B")
	protected final byte[] aByteArray62 = new byte[5000];

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
	protected volatile int anInt4083 = 0;

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
	protected volatile int anInt4082 = 0;

	static {
		new Class114("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V")
	public abstract void method3633();

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IFLclient!sa;ZI)V")
	public abstract void method3634(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class10 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)V")
	public abstract void method3636();

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!nj;B)V")
	public abstract void method3638(@OriginalArg(0) Class206 arg0);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)V")
	public abstract void method3639(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)V")
	public abstract void method3640(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!nj;I)V")
	public abstract void method3642(@OriginalArg(0) Class206 arg0);

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(Lclient!nj;B)V")
	public abstract void method3643(@OriginalArg(0) Class206 arg0);
}
