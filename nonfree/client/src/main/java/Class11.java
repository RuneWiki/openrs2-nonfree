import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public abstract class Class11 implements Interface7 {

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "Z")
	private boolean aBoolean662 = false;

	@OriginalMember(owner = "client!pm", name = "w", descriptor = "I")
	protected final int anInt8889;

	@OriginalMember(owner = "client!pm", name = "o", descriptor = "I")
	private final int anInt8882;

	@OriginalMember(owner = "client!pm", name = "q", descriptor = "I")
	public final int anInt8884;

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "Z")
	private boolean aBoolean663;

	@OriginalMember(owner = "client!pm", name = "u", descriptor = "Lclient!ad;")
	protected final Class5_Sub1 aClass5_Sub1_43;

	@OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
	protected int anInt8881;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lclient!ad;IIIZ)V")
	protected Class11(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt8889 = arg2;
		this.anInt8882 = arg3;
		this.anInt8884 = arg1;
		this.aBoolean663 = arg4;
		this.aClass5_Sub1_43 = arg0;
		OpenGL.glGenTextures(1, Static316.anIntArray540, 0);
		this.anInt8881 = Static316.anIntArray540[0];
		this.method7302(0);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IZ)V")
	protected final void method7298(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean663 != arg0) {
			@Pc(9) int local9 = this.method7308();
			this.aBoolean663 = true;
			this.method7304();
			this.method7302(local9);
		}
	}

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "(I)I")
	public final int method7300() {
		return this.anInt8881;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)V")
	private void method7302(@OriginalArg(0) int arg0) {
		this.aClass5_Sub1_43.anInt382 -= arg0;
		this.aClass5_Sub1_43.anInt382 += this.method7308();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZI)V")
	public final void method7303(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean662) {
			this.aBoolean662 = arg0;
			this.method7304();
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V")
	private void method7304() {
		this.aClass5_Sub1_43.method423(this);
		if (this.aBoolean662) {
			OpenGL.glTexParameteri(this.anInt8884, 10241, this.aBoolean663 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt8884, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt8884, 10241, this.aBoolean663 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt8884, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V")
	public final void method7306() {
		if (this.anInt8881 > 0) {
			this.aClass5_Sub1_43.method462(this.anInt8881, this.method7308());
			this.anInt8881 = 0;
		}
	}

	@OriginalMember(owner = "client!pm", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7306();
		super.finalize();
	}

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "(I)I")
	private int method7308() {
		@Pc(13) int local13 = this.aClass5_Sub1_43.method411(this.anInt8889) * this.anInt8882;
		return this.aBoolean663 ? local13 * 4 / 3 : local13;
	}

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "(I)Z")
	public final boolean method7309() {
		if (!this.aClass5_Sub1_43.aBoolean43) {
			return false;
		}
		@Pc(11) int local11 = this.method7308();
		this.aClass5_Sub1_43.method423(this);
		OpenGL.glGenerateMipmapEXT(this.anInt8884);
		this.aBoolean663 = true;
		this.method7304();
		this.method7302(local11);
		return true;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V")
	public abstract void method7295();
}
