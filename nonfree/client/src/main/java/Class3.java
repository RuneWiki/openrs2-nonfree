import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public abstract class Class3 implements Interface22 {

	@OriginalMember(owner = "client!jo", name = "g", descriptor = "Z")
	private boolean aBoolean251 = false;

	@OriginalMember(owner = "client!jo", name = "q", descriptor = "Lclient!kfa;")
	protected final Class7_Sub2 aClass7_Sub2_19;

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "I")
	public final int anInt3442;

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "Z")
	private boolean aBoolean250;

	@OriginalMember(owner = "client!jo", name = "i", descriptor = "I")
	private final int anInt3445;

	@OriginalMember(owner = "client!jo", name = "f", descriptor = "I")
	protected final int anInt3443;

	@OriginalMember(owner = "client!jo", name = "h", descriptor = "I")
	protected int anInt3444;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Lclient!kfa;IIIZ)V")
	protected Class3(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass7_Sub2_19 = arg0;
		this.anInt3442 = arg1;
		this.aBoolean250 = arg4;
		this.anInt3445 = arg3;
		this.anInt3443 = arg2;
		OpenGL.glGenTextures(1, Static139.anIntArray144, 0);
		this.anInt3444 = Static139.anIntArray144[0];
		this.method2741(0);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IZ)V")
	public final void method2739(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean251) {
			this.aBoolean251 = arg0;
			this.method2743();
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)V")
	private void method2741(@OriginalArg(0) int arg0) {
		this.aClass7_Sub2_19.anInt5606 -= arg0;
		this.aClass7_Sub2_19.anInt5606 += this.method2742();
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Z)I")
	private int method2742() {
		@Pc(13) int local13 = this.aClass7_Sub2_19.method4341(this.anInt3443) * this.anInt3445;
		return this.aBoolean250 ? local13 * 4 / 3 : local13;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V")
	private void method2743() {
		this.aClass7_Sub2_19.method4313(this);
		if (this.aBoolean251) {
			OpenGL.glTexParameteri(this.anInt3442, 10241, this.aBoolean250 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt3442, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt3442, 10241, this.aBoolean250 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt3442, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)I")
	public final int method2745() {
		return this.anInt3444;
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)V")
	public final void method2746() {
		if (this.anInt3444 > 0) {
			this.aClass7_Sub2_19.method4324(this.method2742(), this.anInt3444);
			this.anInt3444 = 0;
		}
	}

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "(I)Z")
	public final boolean method2747() {
		if (!this.aClass7_Sub2_19.aBoolean390) {
			return false;
		}
		@Pc(18) int local18 = this.method2742();
		this.aClass7_Sub2_19.method4313(this);
		OpenGL.glGenerateMipmapEXT(this.anInt3442);
		this.aBoolean250 = true;
		this.method2743();
		this.method2741(local18);
		return true;
	}

	@OriginalMember(owner = "client!jo", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method2746();
		super.finalize();
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(IZ)V")
	protected final void method2749(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean250) {
			@Pc(11) int local11 = this.method2742();
			this.aBoolean250 = true;
			this.method2743();
			this.method2741(local11);
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
	public abstract void method4191();
}
