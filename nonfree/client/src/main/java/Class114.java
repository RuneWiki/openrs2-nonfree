import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public abstract class Class114 implements Interface6 {

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "Z")
	private boolean aBoolean440 = false;

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "Z")
	private boolean aBoolean439;

	@OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
	public final int anInt5902;

	@OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
	protected final int anInt5900;

	@OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
	private final int anInt5904;

	@OriginalMember(owner = "client!hf", name = "o", descriptor = "Lclient!no;")
	protected final Class66_Sub3 aClass66_Sub3_28;

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
	protected int anInt5897;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lclient!no;IIIZ)V")
	protected Class114(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean439 = arg4;
		this.anInt5902 = arg1;
		this.anInt5900 = arg2;
		this.anInt5904 = arg3;
		this.aClass66_Sub3_28 = arg0;
		OpenGL.glGenTextures(1, Static126.anIntArray263, 0);
		this.anInt5897 = Static126.anIntArray263[0];
		this.method5001(0);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BZ)V")
	protected final void method4997(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean439 != arg0) {
			@Pc(11) int local11 = this.method4998();
			this.aBoolean439 = true;
			this.method5005();
			this.method5001(local11);
		}
	}

	@OriginalMember(owner = "client!hf", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method5006();
		super.finalize();
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)I")
	private int method4998() {
		@Pc(13) int local13 = this.aClass66_Sub3_28.method5434(this.anInt5900) * this.anInt5904;
		return this.aBoolean439 ? local13 * 4 / 3 : local13;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZ)V")
	public final void method4999(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean440) {
			this.aBoolean440 = arg0;
			this.method5005();
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)V")
	private void method5001(@OriginalArg(0) int arg0) {
		this.aClass66_Sub3_28.anInt6447 -= arg0;
		this.aClass66_Sub3_28.anInt6447 += this.method4998();
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)I")
	public final int method5002() {
		return this.anInt5897;
	}

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)Z")
	public final boolean method5003() {
		if (!this.aClass66_Sub3_28.aBoolean482) {
			return false;
		}
		@Pc(11) int local11 = this.method4998();
		this.aClass66_Sub3_28.method5382(this);
		OpenGL.glGenerateMipmapEXT(this.anInt5902);
		this.aBoolean439 = true;
		this.method5005();
		this.method5001(local11);
		return true;
	}

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "(I)V")
	private void method5005() {
		this.aClass66_Sub3_28.method5382(this);
		if (this.aBoolean440) {
			OpenGL.glTexParameteri(this.anInt5902, 10241, this.aBoolean439 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt5902, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt5902, 10241, this.aBoolean439 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt5902, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "(I)V")
	public final void method5006() {
		if (this.anInt5897 > 0) {
			this.aClass66_Sub3_28.method5394(this.anInt5897, this.method4998());
			this.anInt5897 = 0;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
	public abstract void method4996();
}
