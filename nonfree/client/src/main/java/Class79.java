import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public abstract class Class79 implements Interface7 {

	@OriginalMember(owner = "client!mw", name = "p", descriptor = "Z")
	private boolean aBoolean469 = false;

	@OriginalMember(owner = "client!mw", name = "u", descriptor = "I")
	private final int anInt6304;

	@OriginalMember(owner = "client!mw", name = "d", descriptor = "I")
	public final int anInt6293;

	@OriginalMember(owner = "client!mw", name = "e", descriptor = "Lclient!gi;")
	protected final Class42_Sub3 aClass42_Sub3_23;

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "Z")
	private boolean aBoolean467;

	@OriginalMember(owner = "client!mw", name = "k", descriptor = "I")
	protected final int anInt6298;

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "I")
	protected int anInt6292;

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lclient!gi;IIIZ)V")
	protected Class79(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6304 = arg3;
		this.anInt6293 = arg1;
		this.aClass42_Sub3_23 = arg0;
		this.aBoolean467 = arg4;
		this.anInt6298 = arg2;
		OpenGL.glGenTextures(1, Static456.anIntArray618, 0);
		this.anInt6292 = Static456.anIntArray618[0];
		this.method5279(0);
	}

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "(B)V")
	public final void method5271() {
		if (this.anInt6292 > 0) {
			this.aClass42_Sub3_23.method3196(this.anInt6292, this.method5276());
			this.anInt6292 = 0;
		}
	}

	@OriginalMember(owner = "client!mw", name = "c", descriptor = "(B)V")
	private void method5272() {
		this.aClass42_Sub3_23.method3219(this);
		if (this.aBoolean469) {
			OpenGL.glTexParameteri(this.anInt6293, 10241, this.aBoolean467 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt6293, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt6293, 10241, this.aBoolean467 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt6293, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!mw", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method5271();
		super.finalize();
	}

	@OriginalMember(owner = "client!mw", name = "d", descriptor = "(B)I")
	public final int method5273() {
		return this.anInt6292;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IZ)V")
	protected final void method5274(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean467 != arg0) {
			@Pc(13) int local13 = this.method5276();
			this.aBoolean467 = true;
			this.method5272();
			this.method5279(local13);
		}
	}

	@OriginalMember(owner = "client!mw", name = "e", descriptor = "(B)Z")
	public final boolean method5275() {
		if (!this.aClass42_Sub3_23.aBoolean305) {
			return false;
		}
		@Pc(16) int local16 = this.method5276();
		this.aClass42_Sub3_23.method3219(this);
		OpenGL.glGenerateMipmapEXT(this.anInt6293);
		this.aBoolean467 = true;
		this.method5272();
		this.method5279(local16);
		return true;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)I")
	private int method5276() {
		@Pc(13) int local13 = this.aClass42_Sub3_23.method3228(this.anInt6298) * this.anInt6304;
		return this.aBoolean467 ? local13 * 4 / 3 : local13;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(ZZ)V")
	public final void method5278(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean469) {
			this.aBoolean469 = arg0;
			this.method5272();
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(ZI)V")
	private void method5279(@OriginalArg(1) int arg0) {
		this.aClass42_Sub3_23.anInt3680 -= arg0;
		this.aClass42_Sub3_23.anInt3680 += this.method5276();
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(B)V")
	public abstract void method5270();
}
