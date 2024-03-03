import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public abstract class Class11_Sub3 extends Class11 {

	@OriginalMember(owner = "client!cj", name = "h", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_230 = new Class145(55, 0);

	@OriginalMember(owner = "client!cj", name = "k", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray59 = new String[100];

	@OriginalMember(owner = "client!cj", name = "n", descriptor = "Lclient!h;")
	public static final Class89 aClass89_226 = new Class89(62, 6);

	@OriginalMember(owner = "client!cj", name = "q", descriptor = "I")
	protected final int anInt6336;

	@OriginalMember(owner = "client!cj", name = "s", descriptor = "I")
	public int anInt6338;

	@OriginalMember(owner = "client!cj", name = "p", descriptor = "I")
	public int anInt6335;

	@OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
	public int anInt6330;

	@OriginalMember(owner = "client!cj", name = "l", descriptor = "I")
	public int anInt6332;

	@OriginalMember(owner = "client!cj", name = "o", descriptor = "I")
	public final int anInt6334;

	@OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
	public final int anInt6329;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(IIIIIII)V", line = 101)
	protected Class11_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt6336 = arg1;
		this.anInt6338 = arg5;
		this.anInt6335 = arg4;
		this.anInt6330 = arg2;
		this.anInt6332 = arg0;
		this.anInt6334 = arg6;
		this.anInt6329 = arg3;
	}

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "(I)V", line = 11)
	@Override
	public final void method6070() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cj", name = "g", descriptor = "(I)Z", line = 23)
	@Override
	public final boolean method6077() {
		return false;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIILclient!wm;ZLclient!hp;Z)V", line = 34)
	@Override
	public final void method6076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class11 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cj", name = "h", descriptor = "(I)I")
	public abstract int method5749();
}
