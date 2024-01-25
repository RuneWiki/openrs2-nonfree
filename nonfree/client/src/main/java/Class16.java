import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public abstract class Class16 implements Interface18 {

	@OriginalMember(owner = "client!it", name = "o", descriptor = "Z")
	private boolean aBoolean665 = false;

	@OriginalMember(owner = "client!it", name = "s", descriptor = "Z")
	private boolean aBoolean666;

	@OriginalMember(owner = "client!it", name = "n", descriptor = "Lclient!en;")
	protected final Class90_Sub1 aClass90_Sub1_43;

	@OriginalMember(owner = "client!it", name = "m", descriptor = "I")
	private final int anInt9860;

	@OriginalMember(owner = "client!it", name = "c", descriptor = "I")
	protected final int anInt9852;

	@OriginalMember(owner = "client!it", name = "r", descriptor = "I")
	public final int anInt9862;

	@OriginalMember(owner = "client!it", name = "h", descriptor = "I")
	protected int anInt9857;

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lclient!en;IIIZ)V")
	protected Class16(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean666 = arg4;
		this.aClass90_Sub1_43 = arg0;
		this.anInt9860 = arg3;
		this.anInt9852 = arg2;
		this.anInt9862 = arg1;
		OpenGL.glGenTextures(1, Static68.anIntArray110, 0);
		this.anInt9857 = Static68.anIntArray110[0];
		this.method7848(0);
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(I)I")
	private int method7839() {
		@Pc(20) int local20 = this.aClass90_Sub1_43.method2076(this.anInt9852) * this.anInt9860;
		return this.aBoolean666 ? local20 * 4 / 3 : local20;
	}

	@OriginalMember(owner = "client!it", name = "c", descriptor = "(I)V")
	private void method7840() {
		this.aClass90_Sub1_43.method2126(this);
		if (this.aBoolean665) {
			OpenGL.glTexParameteri(this.anInt9862, 10241, this.aBoolean666 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt9862, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt9862, 10241, this.aBoolean666 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt9862, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!it", name = "d", descriptor = "(I)I")
	public final int method7841() {
		return this.anInt9857;
	}

	@OriginalMember(owner = "client!it", name = "e", descriptor = "(I)Z")
	public final boolean method7842() {
		if (!this.aClass90_Sub1_43.aBoolean153) {
			return false;
		}
		@Pc(16) int local16 = this.method7839();
		this.aClass90_Sub1_43.method2126(this);
		OpenGL.glGenerateMipmapEXT(this.anInt9862);
		this.aBoolean666 = true;
		this.method7840();
		this.method7848(local16);
		return true;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IZ)V")
	public final void method7843(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean665) {
			this.aBoolean665 = arg0;
			this.method7840();
		}
	}

	@OriginalMember(owner = "client!it", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7847();
		super.finalize();
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ZZ)V")
	protected final void method7844(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean666) {
			@Pc(14) int local14 = this.method7839();
			this.aBoolean666 = true;
			this.method7840();
			this.method7848(local14);
		}
	}

	@OriginalMember(owner = "client!it", name = "f", descriptor = "(I)V")
	public final void method7847() {
		if (this.anInt9857 > 0) {
			this.aClass90_Sub1_43.method2104(this.anInt9857, this.method7839());
			this.anInt9857 = 0;
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(II)V")
	private void method7848(@OriginalArg(1) int arg0) {
		this.aClass90_Sub1_43.anInt2440 -= arg0;
		this.aClass90_Sub1_43.anInt2440 += this.method7839();
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(I)V")
	public abstract void method7838();
}
