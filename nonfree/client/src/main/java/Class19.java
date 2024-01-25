import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public abstract class Class19 implements Interface7 {

	@OriginalMember(owner = "client!tu", name = "n", descriptor = "Z")
	private boolean aBoolean311 = false;

	@OriginalMember(owner = "client!tu", name = "o", descriptor = "I")
	protected final int anInt5062;

	@OriginalMember(owner = "client!tu", name = "r", descriptor = "Z")
	private boolean aBoolean312;

	@OriginalMember(owner = "client!tu", name = "l", descriptor = "I")
	public final int anInt5060;

	@OriginalMember(owner = "client!tu", name = "h", descriptor = "Lclient!rl;")
	protected final Class66_Sub2 aClass66_Sub2_28;

	@OriginalMember(owner = "client!tu", name = "g", descriptor = "I")
	private final int anInt5056;

	@OriginalMember(owner = "client!tu", name = "A", descriptor = "I")
	protected int anInt5072;

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lclient!rl;IIIZ)V")
	protected Class19(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5062 = arg2;
		this.aBoolean312 = arg4;
		this.anInt5060 = arg1;
		this.aClass66_Sub2_28 = arg0;
		this.anInt5056 = arg3;
		OpenGL.glGenTextures(1, Static353.anIntArray405, 0);
		this.anInt5072 = Static353.anIntArray405[0];
		this.method4248(0);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZB)V")
	public final void method4238(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean311) {
			this.aBoolean311 = arg0;
			this.method4242();
		}
	}

	@OriginalMember(owner = "client!tu", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method4252();
		super.finalize();
	}

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "(Z)V")
	private void method4242() {
		this.aClass66_Sub2_28.method5109(this);
		if (this.aBoolean311) {
			OpenGL.glTexParameteri(this.anInt5060, 10241, this.aBoolean312 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt5060, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt5060, 10241, this.aBoolean312 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt5060, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)I")
	public final int method4243() {
		return this.anInt5072;
	}

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "(Z)I")
	private int method4246() {
		@Pc(18) int local18 = this.aClass66_Sub2_28.method5131(this.anInt5062) * this.anInt5056;
		return this.aBoolean312 ? local18 * 4 / 3 : local18;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IZ)V")
	protected final void method4247(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean312 != arg0) {
			@Pc(15) int local15 = this.method4246();
			this.aBoolean312 = true;
			this.method4242();
			this.method4248(local15);
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)V")
	private void method4248(@OriginalArg(1) int arg0) {
		this.aClass66_Sub2_28.anInt6148 -= arg0;
		this.aClass66_Sub2_28.anInt6148 += this.method4246();
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)Z")
	public final boolean method4250() {
		if (!this.aClass66_Sub2_28.aBoolean372) {
			return false;
		}
		@Pc(17) int local17 = this.method4246();
		this.aClass66_Sub2_28.method5109(this);
		OpenGL.glGenerateMipmapEXT(this.anInt5060);
		this.aBoolean312 = true;
		this.method4242();
		this.method4248(local17);
		return true;
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(B)V")
	public final void method4252() {
		if (this.anInt5072 > 0) {
			this.aClass66_Sub2_28.method5118(this.anInt5072, this.method4246());
			this.anInt5072 = 0;
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V")
	public abstract void method4235();
}
