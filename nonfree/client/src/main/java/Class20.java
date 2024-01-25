import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public abstract class Class20 implements Interface1 {

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "Z")
	private boolean aBoolean273 = false;

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
	public final int anInt3919;

	@OriginalMember(owner = "client!fg", name = "l", descriptor = "Lclient!pg;")
	protected final Class163_Sub2 aClass163_Sub2_27;

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
	protected final int anInt3921;

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
	private final int anInt3918;

	@OriginalMember(owner = "client!fg", name = "k", descriptor = "Z")
	private boolean aBoolean274;

	@OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
	protected int anInt3922;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lclient!pg;IIIZ)V")
	protected Class20(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3919 = arg1;
		this.aClass163_Sub2_27 = arg0;
		this.anInt3921 = arg2;
		this.anInt3918 = arg3;
		this.aBoolean274 = arg4;
		OpenGL.glGenTextures(1, Static192.anIntArray265, 0);
		this.anInt3922 = Static192.anIntArray265[0];
		this.method3107(0);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)I")
	private int method3104() {
		@Pc(20) int local20 = this.aClass163_Sub2_27.method4160(this.anInt3921) * this.anInt3918;
		return this.aBoolean274 ? local20 * 4 / 3 : local20;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
	private void method3105() {
		this.aClass163_Sub2_27.method4118(this);
		if (this.aBoolean273) {
			OpenGL.glTexParameteri(this.anInt3919, 10241, this.aBoolean274 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt3919, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt3919, 10241, this.aBoolean274 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt3919, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IB)V")
	private void method3107(@OriginalArg(0) int arg0) {
		this.aClass163_Sub2_27.anInt5227 -= arg0;
		this.aClass163_Sub2_27.anInt5227 += this.method3104();
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V")
	public final void method3108() {
		if (this.anInt3922 > 0) {
			this.aClass163_Sub2_27.method4126(this.anInt3922, this.method3104());
			this.anInt3922 = 0;
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZI)V")
	protected final void method3109(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean274 != arg0) {
			@Pc(11) int local11 = this.method3104();
			this.aBoolean274 = true;
			this.method3105();
			this.method3107(local11);
		}
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(I)Z")
	public final boolean method3110() {
		if (!this.aClass163_Sub2_27.aBoolean368) {
			return false;
		}
		@Pc(13) int local13 = this.method3104();
		this.aClass163_Sub2_27.method4118(this);
		OpenGL.glGenerateMipmapEXT(this.anInt3919);
		this.aBoolean274 = true;
		this.method3105();
		this.method3107(local13);
		return true;
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(B)I")
	public final int method3112() {
		return this.anInt3922;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZ)V")
	public final void method3113(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean273 != arg0) {
			this.aBoolean273 = arg0;
			this.method3105();
		}
	}

	@OriginalMember(owner = "client!fg", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method3108();
		super.finalize();
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)V")
	public abstract void method4531();
}
