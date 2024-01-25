import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!baa")
public abstract class Class19 implements Interface9 {

	@OriginalMember(owner = "client!baa", name = "k", descriptor = "Z")
	private boolean aBoolean415 = false;

	@OriginalMember(owner = "client!baa", name = "j", descriptor = "Lclient!os;")
	protected final Class39_Sub3 aClass39_Sub3_26;

	@OriginalMember(owner = "client!baa", name = "o", descriptor = "I")
	public final int anInt5629;

	@OriginalMember(owner = "client!baa", name = "q", descriptor = "I")
	private final int anInt5630;

	@OriginalMember(owner = "client!baa", name = "n", descriptor = "I")
	protected final int anInt5628;

	@OriginalMember(owner = "client!baa", name = "m", descriptor = "Z")
	private boolean aBoolean416;

	@OriginalMember(owner = "client!baa", name = "g", descriptor = "I")
	protected int anInt5624;

	@OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lclient!os;IIIZ)V")
	protected Class19(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass39_Sub3_26 = arg0;
		this.anInt5629 = arg1;
		this.anInt5630 = arg3;
		this.anInt5628 = arg2;
		this.aBoolean416 = arg4;
		OpenGL.glGenTextures(1, Static300.anIntArray474, 0);
		this.anInt5624 = Static300.anIntArray474[0];
		this.method4802(0);
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(ZI)V")
	public final void method4799(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean415 != arg0) {
			this.aBoolean415 = arg0;
			this.method4804();
		}
	}

	@OriginalMember(owner = "client!baa", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method4800();
		super.finalize();
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)V")
	public final void method4800() {
		if (this.anInt5624 > 0) {
			this.aClass39_Sub3_26.method5703(this.anInt5624, this.method4807());
			this.anInt5624 = 0;
		}
	}

	@OriginalMember(owner = "client!baa", name = "b", descriptor = "(I)I")
	public final int method4801() {
		return this.anInt5624;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(II)V")
	private void method4802(@OriginalArg(1) int arg0) {
		this.aClass39_Sub3_26.anInt6721 -= arg0;
		this.aClass39_Sub3_26.anInt6721 += this.method4807();
	}

	@OriginalMember(owner = "client!baa", name = "c", descriptor = "(I)V")
	private void method4804() {
		this.aClass39_Sub3_26.method5719(this);
		if (this.aBoolean415) {
			OpenGL.glTexParameteri(this.anInt5629, 10241, this.aBoolean416 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt5629, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt5629, 10241, this.aBoolean416 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt5629, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(ZB)V")
	protected final void method4806(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean416 != arg0) {
			@Pc(15) int local15 = this.method4807();
			this.aBoolean416 = true;
			this.method4804();
			this.method4802(local15);
		}
	}

	@OriginalMember(owner = "client!baa", name = "c", descriptor = "(B)I")
	private int method4807() {
		@Pc(13) int local13 = this.aClass39_Sub3_26.method5685(this.anInt5628) * this.anInt5630;
		return this.aBoolean416 ? local13 * 4 / 3 : local13;
	}

	@OriginalMember(owner = "client!baa", name = "d", descriptor = "(B)Z")
	public final boolean method4808() {
		if (!this.aClass39_Sub3_26.aBoolean484) {
			return false;
		}
		@Pc(11) int local11 = this.method4807();
		this.aClass39_Sub3_26.method5719(this);
		OpenGL.glGenerateMipmapEXT(this.anInt5629);
		this.aBoolean416 = true;
		this.method4804();
		this.method4802(local11);
		return true;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(B)V")
	public abstract void method4798();
}
