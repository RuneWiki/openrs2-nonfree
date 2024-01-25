import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public abstract class Class46 implements Interface7 {

	@OriginalMember(owner = "client!vf", name = "l", descriptor = "Z")
	private boolean aBoolean501 = false;

	@OriginalMember(owner = "client!vf", name = "t", descriptor = "I")
	protected final int anInt6354;

	@OriginalMember(owner = "client!vf", name = "p", descriptor = "I")
	private final int anInt6351;

	@OriginalMember(owner = "client!vf", name = "o", descriptor = "I")
	public final int anInt6350;

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "Z")
	private boolean aBoolean500;

	@OriginalMember(owner = "client!vf", name = "q", descriptor = "Lclient!lj;")
	protected final Class78_Sub3 aClass78_Sub3_26;

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
	protected int anInt6344;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lclient!lj;IIIZ)V")
	protected Class46(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6354 = arg2;
		this.anInt6351 = arg3;
		this.anInt6350 = arg1;
		this.aBoolean500 = arg4;
		this.aClass78_Sub3_26 = arg0;
		OpenGL.glGenTextures(1, Static353.anIntArray386, 0);
		this.anInt6344 = Static353.anIntArray386[0];
		this.method5144(0);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BZ)V")
	public final void method5134(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean501 != arg0) {
			this.aBoolean501 = arg0;
			this.method5143();
		}
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)I")
	public final int method5136() {
		return this.anInt6344;
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(B)Z")
	public final boolean method5138() {
		if (!this.aClass78_Sub3_26.aBoolean428) {
			return false;
		}
		@Pc(17) int local17 = this.method5142();
		this.aClass78_Sub3_26.method4535(this);
		OpenGL.glGenerateMipmapEXT(this.anInt6350);
		this.aBoolean500 = true;
		this.method5143();
		this.method5144(local17);
		return true;
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(B)V")
	public final void method5139() {
		if (this.anInt6344 > 0) {
			this.aClass78_Sub3_26.method4528(this.method5142(), this.anInt6344);
			this.anInt6344 = 0;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZ)V")
	protected final void method5141(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean500 != arg0) {
			@Pc(19) int local19 = this.method5142();
			this.aBoolean500 = true;
			this.method5143();
			this.method5144(local19);
		}
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)I")
	private int method5142() {
		@Pc(19) int local19 = this.aClass78_Sub3_26.method4512(this.anInt6354) * this.anInt6351;
		return this.aBoolean500 ? local19 * 4 / 3 : local19;
	}

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "(B)V")
	private void method5143() {
		this.aClass78_Sub3_26.method4535(this);
		if (this.aBoolean501) {
			OpenGL.glTexParameteri(this.anInt6350, 10241, this.aBoolean500 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt6350, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt6350, 10241, this.aBoolean500 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt6350, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)V")
	private void method5144(@OriginalArg(0) int arg0) {
		this.aClass78_Sub3_26.anInt5565 -= arg0;
		this.aClass78_Sub3_26.anInt5565 += this.method5142();
	}

	@OriginalMember(owner = "client!vf", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method5139();
		super.finalize();
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
	public abstract void method7511();
}
