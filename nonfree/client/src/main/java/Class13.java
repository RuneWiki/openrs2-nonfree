import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public abstract class Class13 implements Interface9 {

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "Z")
	private boolean aBoolean185 = false;

	@OriginalMember(owner = "client!ao", name = "q", descriptor = "Lclient!ht;")
	protected final Class109_Sub1 aClass109_Sub1_22;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
	private final int anInt3195;

	@OriginalMember(owner = "client!ao", name = "o", descriptor = "I")
	public final int anInt3207;

	@OriginalMember(owner = "client!ao", name = "u", descriptor = "Z")
	private boolean aBoolean186;

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
	protected final int anInt3197;

	@OriginalMember(owner = "client!ao", name = "j", descriptor = "I")
	protected int anInt3202;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lclient!ht;IIIZ)V")
	protected Class13(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass109_Sub1_22 = arg0;
		this.anInt3195 = arg3;
		this.anInt3207 = arg1;
		this.aBoolean186 = arg4;
		this.anInt3197 = arg2;
		OpenGL.glGenTextures(1, Static122.anIntArray200, 0);
		this.anInt3202 = Static122.anIntArray200[0];
		this.method2749(0);
	}

	@OriginalMember(owner = "client!ao", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method2744();
		super.finalize();
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)Z")
	public final boolean method2740() {
		if (!this.aClass109_Sub1_22.aBoolean153) {
			return false;
		}
		@Pc(17) int local17 = this.method2748();
		this.aClass109_Sub1_22.method2578(this);
		OpenGL.glGenerateMipmapEXT(this.anInt3207);
		this.aBoolean186 = true;
		this.method2743();
		this.method2749(local17);
		return true;
	}

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "(I)V")
	private void method2743() {
		this.aClass109_Sub1_22.method2578(this);
		if (this.aBoolean185) {
			OpenGL.glTexParameteri(this.anInt3207, 10241, this.aBoolean186 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt3207, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt3207, 10241, this.aBoolean186 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt3207, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "(I)V")
	public final void method2744() {
		if (this.anInt3202 > 0) {
			this.aClass109_Sub1_22.method2539(this.method2748(), this.anInt3202);
			this.anInt3202 = 0;
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ZB)V")
	public final void method2745(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean185 != arg0) {
			this.aBoolean185 = arg0;
			this.method2743();
		}
	}

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "(I)I")
	public final int method2746() {
		return this.anInt3202;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(BZ)V")
	protected final void method2747(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean186 != arg0) {
			@Pc(11) int local11 = this.method2748();
			this.aBoolean186 = true;
			this.method2743();
			this.method2749(local11);
		}
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(B)I")
	private int method2748() {
		@Pc(18) int local18 = this.aClass109_Sub1_22.method2585(this.anInt3197) * this.anInt3195;
		return this.aBoolean186 ? local18 * 4 / 3 : local18;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(BI)V")
	private void method2749(@OriginalArg(1) int arg0) {
		this.aClass109_Sub1_22.anInt2982 -= arg0;
		this.aClass109_Sub1_22.anInt2982 += this.method2748();
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
	public abstract void method4467();
}
