import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public abstract class Class20 implements Interface9 {

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "Z")
	private boolean aBoolean643 = false;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "Lclient!h;")
	protected final Class32_Sub2 aClass32_Sub2_41;

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
	public final int anInt6563;

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
	protected final int anInt6561;

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "Z")
	private boolean aBoolean644;

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
	private final int anInt6562;

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
	protected int anInt6564;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lclient!h;IIIZ)V")
	protected Class20(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass32_Sub2_41 = arg0;
		this.anInt6563 = arg1;
		this.anInt6561 = arg2;
		this.aBoolean644 = arg4;
		this.anInt6562 = arg3;
		this.aClass32_Sub2_41.anOpengl2.glGenTextures(1, Static284.anIntArray524, 0);
		this.anInt6564 = Static284.anIntArray524[0];
		this.method5511(0);
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "()V")
	public final void method5500() {
		if (this.anInt6564 > 0) {
			this.aClass32_Sub2_41.method2317(this.anInt6564, this.method5509());
			this.anInt6564 = 0;
		}
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "()I")
	public final int method5505() {
		return this.anInt6564;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V")
	protected final void method5506(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean644 != arg0) {
			@Pc(6) int local6 = this.method5509();
			this.aBoolean644 = true;
			this.method5508();
			this.method5511(local6);
		}
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "()Z")
	public final boolean method5507() {
		@Pc(3) opengl local3 = this.aClass32_Sub2_41.anOpengl2;
		if (!this.aClass32_Sub2_41.aBoolean228) {
			return false;
		}
		@Pc(10) int local10 = this.method5509();
		this.aClass32_Sub2_41.method2287(this);
		local3.glGenerateMipmapEXT(this.anInt6563);
		this.aBoolean644 = true;
		this.method5508();
		this.method5511(local10);
		return true;
	}

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "()V")
	private void method5508() {
		@Pc(3) opengl local3 = this.aClass32_Sub2_41.anOpengl2;
		this.aClass32_Sub2_41.method2287(this);
		if (this.aBoolean643) {
			local3.glTexParameteri(this.anInt6563, 10241, this.aBoolean644 ? 9987 : 9729);
			local3.glTexParameteri(this.anInt6563, 10240, 9729);
		} else {
			local3.glTexParameteri(this.anInt6563, 10241, this.aBoolean644 ? 9984 : 9728);
			local3.glTexParameteri(this.anInt6563, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "()I")
	private int method5509() {
		@Pc(8) int local8 = this.aClass32_Sub2_41.method2261(this.anInt6561) * this.anInt6562;
		return this.aBoolean644 ? local8 * 4 / 3 : local8;
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)V")
	private void method5511(@OriginalArg(0) int arg0) {
		this.aClass32_Sub2_41.anInt2485 -= arg0;
		this.aClass32_Sub2_41.anInt2485 += this.method5509();
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(Z)V")
	public final void method5512(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean643 != arg0) {
			this.aBoolean643 = arg0;
			this.method5508();
		}
	}

	@OriginalMember(owner = "client!sd", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method5500();
		super.finalize();
	}
}
