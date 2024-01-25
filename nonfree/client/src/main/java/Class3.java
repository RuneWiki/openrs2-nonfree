import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public abstract class Class3 implements Interface16 {

	@OriginalMember(owner = "client!me", name = "h", descriptor = "Z")
	private boolean aBoolean442 = false;

	@OriginalMember(owner = "client!me", name = "j", descriptor = "I")
	public final int anInt6738;

	@OriginalMember(owner = "client!me", name = "s", descriptor = "Z")
	private boolean aBoolean443;

	@OriginalMember(owner = "client!me", name = "i", descriptor = "I")
	protected final int anInt6737;

	@OriginalMember(owner = "client!me", name = "t", descriptor = "Lclient!wh;")
	protected final Class100_Sub3 aClass100_Sub3_34;

	@OriginalMember(owner = "client!me", name = "c", descriptor = "I")
	private final int anInt6732;

	@OriginalMember(owner = "client!me", name = "k", descriptor = "I")
	protected int anInt6739;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!wh;IIIZ)V")
	protected Class3(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6738 = arg1;
		this.aBoolean443 = arg4;
		this.anInt6737 = arg2;
		this.aClass100_Sub3_34 = arg0;
		this.anInt6732 = arg3;
		OpenGL.glGenTextures(1, Static584.anIntArray598, 0);
		this.anInt6739 = Static584.anIntArray598[0];
		this.method5779(0);
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
	public final void method5770() {
		if (this.anInt6739 > 0) {
			this.aClass100_Sub3_34.method8881(this.anInt6739, this.method5778());
			this.anInt6739 = 0;
		}
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(I)V")
	private void method5772() {
		this.aClass100_Sub3_34.method8925(this);
		if (this.aBoolean442) {
			OpenGL.glTexParameteri(this.anInt6738, 10241, this.aBoolean443 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt6738, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt6738, 10241, this.aBoolean443 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt6738, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!me", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method5770();
		super.finalize();
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZI)V")
	protected final void method5773(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean443 != arg0) {
			@Pc(15) int local15 = this.method5778();
			this.aBoolean443 = true;
			this.method5772();
			this.method5779(local15);
		}
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(B)Z")
	public final boolean method5777() {
		if (!this.aClass100_Sub3_34.aBoolean698) {
			return false;
		}
		@Pc(19) int local19 = this.method5778();
		this.aClass100_Sub3_34.method8925(this);
		OpenGL.glGenerateMipmapEXT(this.anInt6738);
		this.aBoolean443 = true;
		this.method5772();
		this.method5779(local19);
		return true;
	}

	@OriginalMember(owner = "client!me", name = "e", descriptor = "(B)I")
	private int method5778() {
		@Pc(20) int local20 = this.aClass100_Sub3_34.method8938(this.anInt6737) * this.anInt6732;
		return this.aBoolean443 ? local20 * 4 / 3 : local20;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)V")
	private void method5779(@OriginalArg(0) int arg0) {
		this.aClass100_Sub3_34.anInt10591 -= arg0;
		this.aClass100_Sub3_34.anInt10591 += this.method5778();
	}

	@OriginalMember(owner = "client!me", name = "f", descriptor = "(B)I")
	public final int method5780() {
		return this.anInt6739;
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(ZI)V")
	public final void method5781(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean442) {
			this.aBoolean442 = arg0;
			this.method5772();
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
	public abstract void method5769();
}
