import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public abstract class Class8 implements Interface6 {

	@OriginalMember(owner = "client!kk", name = "j", descriptor = "Z")
	private boolean aBoolean243 = false;

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
	protected final int anInt3950;

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "Z")
	private boolean aBoolean242;

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
	private final int anInt3951;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
	public final int anInt3947;

	@OriginalMember(owner = "client!kk", name = "q", descriptor = "Lclient!ih;")
	protected final Class106_Sub2 aClass106_Sub2_25;

	@OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
	protected int anInt3959;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lclient!ih;IIIZ)V")
	protected Class8(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3950 = arg2;
		this.aBoolean242 = arg4;
		this.anInt3951 = arg3;
		this.anInt3947 = arg1;
		this.aClass106_Sub2_25 = arg0;
		OpenGL.glGenTextures(1, Static74.anIntArray175, 0);
		this.anInt3959 = Static74.anIntArray175[0];
		this.method3071(0);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)I")
	public final int method3069() {
		return this.anInt3959;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)Z")
	public final boolean method3070() {
		if (!this.aClass106_Sub2_25.aBoolean233) {
			return false;
		}
		@Pc(11) int local11 = this.method3077();
		this.aClass106_Sub2_25.method2912(this);
		OpenGL.glGenerateMipmapEXT(this.anInt3947);
		this.aBoolean242 = true;
		this.method3076();
		this.method3071(local11);
		return true;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZI)V")
	private void method3071(@OriginalArg(1) int arg0) {
		this.aClass106_Sub2_25.anInt3740 -= arg0;
		this.aClass106_Sub2_25.anInt3740 += this.method3077();
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(ZI)V")
	public final void method3073(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean243) {
			this.aBoolean243 = arg0;
			this.method3076();
		}
	}

	@OriginalMember(owner = "client!kk", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method3074();
		super.finalize();
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)V")
	public final void method3074() {
		if (this.anInt3959 > 0) {
			this.aClass106_Sub2_25.method2860(this.anInt3959, this.method3077());
			this.anInt3959 = 0;
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZB)V")
	protected final void method3075(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean242 != arg0) {
			@Pc(11) int local11 = this.method3077();
			this.aBoolean242 = true;
			this.method3076();
			this.method3071(local11);
		}
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)V")
	private void method3076() {
		this.aClass106_Sub2_25.method2912(this);
		if (this.aBoolean243) {
			OpenGL.glTexParameteri(this.anInt3947, 10241, this.aBoolean242 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt3947, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt3947, 10241, this.aBoolean242 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt3947, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(Z)I")
	private int method3077() {
		@Pc(18) int local18 = this.aClass106_Sub2_25.method2889(this.anInt3950) * this.anInt3951;
		return this.aBoolean242 ? local18 * 4 / 3 : local18;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
	public abstract void method3067();
}
