import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tha")
public abstract class Class20 implements Interface15 {

	@OriginalMember(owner = "client!tha", name = "s", descriptor = "Z")
	private boolean aBoolean665 = false;

	@OriginalMember(owner = "client!tha", name = "m", descriptor = "Z")
	private boolean aBoolean664;

	@OriginalMember(owner = "client!tha", name = "c", descriptor = "I")
	private final int anInt9334;

	@OriginalMember(owner = "client!tha", name = "f", descriptor = "I")
	public final int anInt9337;

	@OriginalMember(owner = "client!tha", name = "h", descriptor = "I")
	protected final int anInt9338;

	@OriginalMember(owner = "client!tha", name = "r", descriptor = "Lclient!nv;")
	protected final Class16_Sub3 aClass16_Sub3_40;

	@OriginalMember(owner = "client!tha", name = "d", descriptor = "I")
	protected int anInt9335;

	@OriginalMember(owner = "client!tha", name = "<init>", descriptor = "(Lclient!nv;IIIZ)V")
	protected Class20(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean664 = arg4;
		this.anInt9334 = arg3;
		this.anInt9337 = arg1;
		this.anInt9338 = arg2;
		this.aClass16_Sub3_40 = arg0;
		OpenGL.glGenTextures(1, Static242.anIntArray341, 0);
		this.anInt9335 = Static242.anIntArray341[0];
		this.method7618(0);
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(B)I")
	public final int method7612() {
		return this.anInt9335;
	}

	@OriginalMember(owner = "client!tha", name = "b", descriptor = "(I)I")
	private int method7613() {
		@Pc(18) int local18 = this.aClass16_Sub3_40.method5947(this.anInt9338) * this.anInt9334;
		return this.aBoolean664 ? local18 * 4 / 3 : local18;
	}

	@OriginalMember(owner = "client!tha", name = "c", descriptor = "(I)V")
	public final void method7614() {
		if (this.anInt9335 > 0) {
			this.aClass16_Sub3_40.method5953(this.anInt9335, this.method7613());
			this.anInt9335 = 0;
		}
	}

	@OriginalMember(owner = "client!tha", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7614();
		super.finalize();
	}

	@OriginalMember(owner = "client!tha", name = "d", descriptor = "(I)V")
	private void method7615() {
		this.aClass16_Sub3_40.method6020(this);
		if (this.aBoolean665) {
			OpenGL.glTexParameteri(this.anInt9337, 10241, this.aBoolean664 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt9337, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt9337, 10241, this.aBoolean664 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt9337, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(ZB)V")
	protected final void method7616(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean664 != arg0) {
			@Pc(19) int local19 = this.method7613();
			this.aBoolean664 = true;
			this.method7615();
			this.method7618(local19);
		}
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(IB)V")
	private void method7618(@OriginalArg(0) int arg0) {
		this.aClass16_Sub3_40.anInt7345 -= arg0;
		this.aClass16_Sub3_40.anInt7345 += this.method7613();
	}

	@OriginalMember(owner = "client!tha", name = "b", descriptor = "(B)Z")
	public final boolean method7619() {
		if (!this.aClass16_Sub3_40.aBoolean524) {
			return false;
		}
		@Pc(11) int local11 = this.method7613();
		this.aClass16_Sub3_40.method6020(this);
		OpenGL.glGenerateMipmapEXT(this.anInt9337);
		this.aBoolean664 = true;
		this.method7615();
		this.method7618(local11);
		return true;
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(ZI)V")
	public final void method7620(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean665) {
			this.aBoolean665 = arg0;
			this.method7615();
		}
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(I)V")
	public abstract void method7611();
}
