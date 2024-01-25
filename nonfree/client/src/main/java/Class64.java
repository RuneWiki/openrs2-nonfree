import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jca")
public abstract class Class64 implements Interface19 {

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "Z")
	private boolean aBoolean427 = false;

	@OriginalMember(owner = "client!jca", name = "q", descriptor = "I")
	protected final int anInt4992;

	@OriginalMember(owner = "client!jca", name = "t", descriptor = "I")
	public final int anInt4996;

	@OriginalMember(owner = "client!jca", name = "j", descriptor = "Z")
	private boolean aBoolean426;

	@OriginalMember(owner = "client!jca", name = "i", descriptor = "I")
	private final int anInt4991;

	@OriginalMember(owner = "client!jca", name = "g", descriptor = "Lclient!uja;")
	protected final Class145_Sub3 aClass145_Sub3_27;

	@OriginalMember(owner = "client!jca", name = "h", descriptor = "I")
	protected int anInt4988;

	@OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(Lclient!uja;IIIZ)V")
	protected Class64(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4992 = arg2;
		this.anInt4996 = arg1;
		this.aBoolean426 = arg4;
		this.anInt4991 = arg3;
		this.aClass145_Sub3_27 = arg0;
		OpenGL.glGenTextures(1, Static56.anIntArray88, 0);
		this.anInt4988 = Static56.anIntArray88[0];
		this.method4539(0);
	}

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "(B)I")
	private int method4537() {
		@Pc(13) int local13 = this.aClass145_Sub3_27.method8877(this.anInt4992) * this.anInt4991;
		return this.aBoolean426 ? local13 * 4 / 3 : local13;
	}

	@OriginalMember(owner = "client!jca", name = "d", descriptor = "(I)Z")
	public final boolean method4538() {
		if (!this.aClass145_Sub3_27.aBoolean876) {
			return false;
		}
		@Pc(18) int local18 = this.method4537();
		this.aClass145_Sub3_27.method8872(this);
		OpenGL.glGenerateMipmapEXT(this.anInt4996);
		this.aBoolean426 = true;
		this.method4544();
		this.method4539(local18);
		return true;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(ZI)V")
	private void method4539(@OriginalArg(1) int arg0) {
		this.aClass145_Sub3_27.anInt10150 -= arg0;
		this.aClass145_Sub3_27.anInt10150 += this.method4537();
	}

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "(ZZ)V")
	public final void method4540(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean427 != arg0) {
			this.aBoolean427 = arg0;
			this.method4544();
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Z)I")
	public final int method4542() {
		return this.anInt4988;
	}

	@OriginalMember(owner = "client!jca", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method4545();
		super.finalize();
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(B)V")
	private void method4544() {
		this.aClass145_Sub3_27.method8872(this);
		if (this.aBoolean427) {
			OpenGL.glTexParameteri(this.anInt4996, 10241, this.aBoolean426 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt4996, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt4996, 10241, this.aBoolean426 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt4996, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "(B)V")
	public final void method4545() {
		if (this.anInt4988 > 0) {
			this.aClass145_Sub3_27.method8882(this.method4537(), this.anInt4988);
			this.anInt4988 = 0;
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(ZZ)V")
	protected final void method4546(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean426 != arg0) {
			@Pc(12) int local12 = this.method4537();
			this.aBoolean426 = true;
			this.method4544();
			this.method4539(local12);
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)V")
	public abstract void method4536();
}
