import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public abstract class Class51 implements Interface14 {

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "Z")
	private boolean aBoolean726 = false;

	@OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
	private final int anInt9466;

	@OriginalMember(owner = "client!tj", name = "g", descriptor = "Z")
	private boolean aBoolean727;

	@OriginalMember(owner = "client!tj", name = "f", descriptor = "Lclient!jaa;")
	protected final Class14_Sub3 aClass14_Sub3_43;

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
	public final int anInt9463;

	@OriginalMember(owner = "client!tj", name = "n", descriptor = "I")
	protected final int anInt9471;

	@OriginalMember(owner = "client!tj", name = "s", descriptor = "I")
	protected int anInt9474;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lclient!jaa;IIIZ)V")
	protected Class51(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt9466 = arg3;
		this.aBoolean727 = arg4;
		this.aClass14_Sub3_43 = arg0;
		this.anInt9463 = arg1;
		this.anInt9471 = arg2;
		OpenGL.glGenTextures(1, Static123.anIntArray173, 0);
		this.anInt9474 = Static123.anIntArray173[0];
		this.method7737(0);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BZ)V")
	protected final void method7727(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean727 != arg0) {
			@Pc(14) int local14 = this.method7733();
			this.aBoolean727 = true;
			this.method7729();
			this.method7737(local14);
		}
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)V")
	private void method7729() {
		this.aClass14_Sub3_43.method3985(this);
		if (this.aBoolean726) {
			OpenGL.glTexParameteri(this.anInt9463, 10241, this.aBoolean727 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt9463, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt9463, 10241, this.aBoolean727 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt9463, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)V")
	public final void method7730() {
		if (this.anInt9474 > 0) {
			this.aClass14_Sub3_43.method3928(this.anInt9474, this.method7733());
			this.anInt9474 = 0;
		}
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)I")
	public final int method7732() {
		return this.anInt9474;
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(Z)I")
	private int method7733() {
		@Pc(18) int local18 = this.aClass14_Sub3_43.method3953(this.anInt9471) * this.anInt9466;
		return this.aBoolean727 ? local18 * 4 / 3 : local18;
	}

	@OriginalMember(owner = "client!tj", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7730();
		super.finalize();
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZ)V")
	public final void method7734(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean726 != arg0) {
			this.aBoolean726 = arg0;
			this.method7729();
		}
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(Z)Z")
	public final boolean method7736() {
		if (!this.aClass14_Sub3_43.aBoolean302) {
			return false;
		}
		@Pc(11) int local11 = this.method7733();
		this.aClass14_Sub3_43.method3985(this);
		OpenGL.glGenerateMipmapEXT(this.anInt9463);
		this.aBoolean727 = true;
		this.method7729();
		this.method7737(local11);
		return true;
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(II)V")
	private void method7737(@OriginalArg(1) int arg0) {
		this.aClass14_Sub3_43.anInt4562 -= arg0;
		this.aClass14_Sub3_43.anInt4562 += this.method7733();
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
	public abstract void method7726();
}
