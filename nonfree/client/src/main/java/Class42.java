import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public abstract class Class42 implements Interface9 {

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "Z")
	private boolean aBoolean436 = false;

	@OriginalMember(owner = "client!rh", name = "r", descriptor = "I")
	private final int anInt6244;

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "Lclient!gk;")
	protected final Class75_Sub2 aClass75_Sub2_37;

	@OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
	protected final int anInt6239;

	@OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
	public final int anInt6241;

	@OriginalMember(owner = "client!rh", name = "k", descriptor = "Z")
	private boolean aBoolean437;

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
	protected int anInt6233;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lclient!gk;IIIZ)V")
	protected Class42(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6244 = arg3;
		this.aClass75_Sub2_37 = arg0;
		this.anInt6239 = arg2;
		this.anInt6241 = arg1;
		this.aBoolean437 = arg4;
		OpenGL.glGenTextures(1, Static369.anIntArray469, 0);
		this.anInt6233 = Static369.anIntArray469[0];
		this.method4916(0);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z)V")
	private void method4909() {
		this.aClass75_Sub2_37.method2456(this);
		if (this.aBoolean436) {
			OpenGL.glTexParameteri(this.anInt6241, 10241, this.aBoolean437 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt6241, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt6241, 10241, this.aBoolean437 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt6241, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZB)V")
	public final void method4910(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean436) {
			this.aBoolean436 = arg0;
			this.method4909();
		}
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)I")
	private int method4911() {
		@Pc(18) int local18 = this.aClass75_Sub2_37.method2469(this.anInt6239) * this.anInt6244;
		return this.aBoolean437 ? local18 * 4 / 3 : local18;
	}

	@OriginalMember(owner = "client!rh", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method4919();
		super.finalize();
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)I")
	public final int method4914() {
		return this.anInt6233;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZI)V")
	protected final void method4915(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean437) {
			@Pc(15) int local15 = this.method4911();
			this.aBoolean437 = true;
			this.method4909();
			this.method4916(local15);
		}
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)V")
	private void method4916(@OriginalArg(0) int arg0) {
		this.aClass75_Sub2_37.anInt3085 -= arg0;
		this.aClass75_Sub2_37.anInt3085 += this.method4911();
	}

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "(I)Z")
	public final boolean method4917() {
		if (!this.aClass75_Sub2_37.aBoolean220) {
			return false;
		}
		@Pc(11) int local11 = this.method4911();
		this.aClass75_Sub2_37.method2456(this);
		OpenGL.glGenerateMipmapEXT(this.anInt6241);
		this.aBoolean437 = true;
		this.method4909();
		this.method4916(local11);
		return true;
	}

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "(I)V")
	public final void method4919() {
		if (this.anInt6233 > 0) {
			this.aClass75_Sub2_37.method2441(this.method4911(), this.anInt6233);
			this.anInt6233 = 0;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
	public abstract void method4908();
}
