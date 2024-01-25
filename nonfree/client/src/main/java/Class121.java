import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public abstract class Class121 implements Interface10 {

	@OriginalMember(owner = "client!kp", name = "t", descriptor = "Z")
	private boolean aBoolean748 = false;

	@OriginalMember(owner = "client!kp", name = "n", descriptor = "Lclient!eq;")
	protected final Class33_Sub3 aClass33_Sub3_36;

	@OriginalMember(owner = "client!kp", name = "r", descriptor = "I")
	private final int anInt8885;

	@OriginalMember(owner = "client!kp", name = "p", descriptor = "I")
	protected final int anInt8883;

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "I")
	public final int anInt8871;

	@OriginalMember(owner = "client!kp", name = "m", descriptor = "Z")
	private boolean aBoolean747;

	@OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
	protected int anInt8879;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lclient!eq;IIIZ)V")
	protected Class121(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass33_Sub3_36 = arg0;
		this.anInt8885 = arg3;
		this.anInt8883 = arg2;
		this.anInt8871 = arg1;
		this.aBoolean747 = arg4;
		OpenGL.glGenTextures(1, Static274.anIntArray339, 0);
		this.anInt8879 = Static274.anIntArray339[0];
		this.method7324(0);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)V")
	public final void method7322() {
		if (this.anInt8879 > 0) {
			this.aClass33_Sub3_36.method3088(this.method7328(), this.anInt8879);
			this.anInt8879 = 0;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)V")
	private void method7324(@OriginalArg(1) int arg0) {
		this.aClass33_Sub3_36.anInt3422 -= arg0;
		this.aClass33_Sub3_36.anInt3422 += this.method7328();
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(B)V")
	private void method7325() {
		this.aClass33_Sub3_36.method3012(this);
		if (this.aBoolean748) {
			OpenGL.glTexParameteri(this.anInt8871, 10241, this.aBoolean747 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt8871, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt8871, 10241, this.aBoolean747 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt8871, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZI)V")
	public final void method7326(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean748) {
			this.aBoolean748 = arg0;
			this.method7325();
		}
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(Z)I")
	private int method7328() {
		@Pc(20) int local20 = this.aClass33_Sub3_36.method3071(this.anInt8883) * this.anInt8885;
		return this.aBoolean747 ? local20 * 4 / 3 : local20;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IZ)V")
	protected final void method7329(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean747 != arg0) {
			@Pc(19) int local19 = this.method7328();
			this.aBoolean747 = true;
			this.method7325();
			this.method7324(local19);
		}
	}

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "(Z)Z")
	public final boolean method7330() {
		if (!this.aClass33_Sub3_36.aBoolean273) {
			return false;
		}
		@Pc(11) int local11 = this.method7328();
		this.aClass33_Sub3_36.method3012(this);
		OpenGL.glGenerateMipmapEXT(this.anInt8871);
		this.aBoolean747 = true;
		this.method7325();
		this.method7324(local11);
		return true;
	}

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "(Z)I")
	public final int method7332() {
		return this.anInt8879;
	}

	@OriginalMember(owner = "client!kp", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7322();
		super.finalize();
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Z)V")
	public abstract void method7320();
}
