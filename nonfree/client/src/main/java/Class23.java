import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public abstract class Class23 implements Interface17 {

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "Z")
	private boolean aBoolean718 = false;

	@OriginalMember(owner = "client!rg", name = "o", descriptor = "Lclient!qj;")
	protected final Class100_Sub3 aClass100_Sub3_42;

	@OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
	private final int anInt9357;

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "Z")
	private boolean aBoolean719;

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
	public final int anInt9352;

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
	protected final int anInt9354;

	@OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
	protected int anInt9359;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lclient!qj;IIIZ)V")
	protected Class23(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass100_Sub3_42 = arg0;
		this.anInt9357 = arg3;
		this.aBoolean719 = arg4;
		this.anInt9352 = arg1;
		this.anInt9354 = arg2;
		OpenGL.glGenTextures(1, Static276.anIntArray213, 0);
		this.anInt9359 = Static276.anIntArray213[0];
		this.method7780(0);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)I")
	public final int method7776() {
		return this.anInt9359;
	}

	@OriginalMember(owner = "client!rg", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7779();
		super.finalize();
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
	private void method7777() {
		this.aClass100_Sub3_42.method6277(this);
		if (this.aBoolean718) {
			OpenGL.glTexParameteri(this.anInt9352, 10241, this.aBoolean719 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt9352, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt9352, 10241, this.aBoolean719 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt9352, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)I")
	private int method7778() {
		@Pc(13) int local13 = this.aClass100_Sub3_42.method6280(this.anInt9354) * this.anInt9357;
		return this.aBoolean719 ? local13 * 4 / 3 : local13;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)V")
	public final void method7779() {
		if (this.anInt9359 > 0) {
			this.aClass100_Sub3_42.method6325(this.method7778(), this.anInt9359);
			this.anInt9359 = 0;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)V")
	private void method7780(@OriginalArg(0) int arg0) {
		this.aClass100_Sub3_42.anInt7672 -= arg0;
		this.aClass100_Sub3_42.anInt7672 += this.method7778();
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)Z")
	public final boolean method7781() {
		if (!this.aClass100_Sub3_42.aBoolean600) {
			return false;
		}
		@Pc(11) int local11 = this.method7778();
		this.aClass100_Sub3_42.method6277(this);
		OpenGL.glGenerateMipmapEXT(this.anInt9352);
		this.aBoolean719 = true;
		this.method7777();
		this.method7780(local11);
		return true;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZI)V")
	protected final void method7782(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean719) {
			@Pc(15) int local15 = this.method7778();
			this.aBoolean719 = true;
			this.method7777();
			this.method7780(local15);
		}
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(ZI)V")
	public final void method7783(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean718 != arg0) {
			this.aBoolean718 = arg0;
			this.method7777();
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
	public abstract void method7774();
}
