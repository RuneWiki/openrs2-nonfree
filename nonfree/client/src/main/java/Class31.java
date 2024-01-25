import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public abstract class Class31 implements Interface4 {

	@OriginalMember(owner = "client!in", name = "k", descriptor = "Z")
	private boolean aBoolean392 = false;

	@OriginalMember(owner = "client!in", name = "p", descriptor = "I")
	private final int anInt5788;

	@OriginalMember(owner = "client!in", name = "j", descriptor = "Lclient!tt;")
	protected final Class200_Sub2 aClass200_Sub2_34;

	@OriginalMember(owner = "client!in", name = "q", descriptor = "I")
	protected final int anInt5789;

	@OriginalMember(owner = "client!in", name = "o", descriptor = "I")
	public final int anInt5787;

	@OriginalMember(owner = "client!in", name = "w", descriptor = "Z")
	private boolean aBoolean393;

	@OriginalMember(owner = "client!in", name = "l", descriptor = "I")
	protected int anInt5784;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lclient!tt;IIIZ)V")
	protected Class31(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5788 = arg3;
		this.aClass200_Sub2_34 = arg0;
		this.anInt5789 = arg2;
		this.anInt5787 = arg1;
		this.aBoolean393 = arg4;
		OpenGL.glGenTextures(1, Static306.anIntArray128, 0);
		this.anInt5784 = Static306.anIntArray128[0];
		this.method4590(0);
	}

	@OriginalMember(owner = "client!in", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method4582();
		super.finalize();
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(B)V")
	public final void method4582() {
		if (this.anInt5784 > 0) {
			this.aClass200_Sub2_34.method5303(this.method4593(), this.anInt5784);
			this.anInt5784 = 0;
		}
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "(B)I")
	public final int method4584() {
		return this.anInt5784;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ZB)V")
	protected final void method4587(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean393 != arg0) {
			@Pc(21) int local21 = this.method4593();
			this.aBoolean393 = true;
			this.method4592();
			this.method4590(local21);
		}
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "(I)Z")
	public final boolean method4588() {
		if (!this.aClass200_Sub2_34.aBoolean435) {
			return false;
		}
		@Pc(11) int local11 = this.method4593();
		this.aClass200_Sub2_34.method5312(this);
		OpenGL.glGenerateMipmapEXT(this.anInt5787);
		this.aBoolean393 = true;
		this.method4592();
		this.method4590(local11);
		return true;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ZI)V")
	private void method4590(@OriginalArg(1) int arg0) {
		this.aClass200_Sub2_34.anInt6727 -= arg0;
		this.aClass200_Sub2_34.anInt6727 += this.method4593();
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(BZ)V")
	public final void method4591(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean392 != arg0) {
			this.aBoolean392 = arg0;
			this.method4592();
		}
	}

	@OriginalMember(owner = "client!in", name = "d", descriptor = "(I)V")
	private void method4592() {
		this.aClass200_Sub2_34.method5312(this);
		if (this.aBoolean392) {
			OpenGL.glTexParameteri(this.anInt5787, 10241, this.aBoolean393 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt5787, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt5787, 10241, this.aBoolean393 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt5787, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Z)I")
	private int method4593() {
		@Pc(18) int local18 = this.aClass200_Sub2_34.method5307(this.anInt5789) * this.anInt5788;
		return this.aBoolean393 ? local18 * 4 / 3 : local18;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V")
	public abstract void method4581();
}
