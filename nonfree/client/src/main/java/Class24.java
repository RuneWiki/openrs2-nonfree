import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!av")
public abstract class Class24 implements Interface1 {

	@OriginalMember(owner = "client!av", name = "b", descriptor = "Z")
	private boolean aBoolean251 = false;

	@OriginalMember(owner = "client!av", name = "f", descriptor = "Lclient!vj;")
	protected final Class45_Sub3 aClass45_Sub3_16;

	@OriginalMember(owner = "client!av", name = "o", descriptor = "I")
	protected final int anInt3110;

	@OriginalMember(owner = "client!av", name = "c", descriptor = "I")
	public final int anInt3100;

	@OriginalMember(owner = "client!av", name = "r", descriptor = "Z")
	private boolean aBoolean252;

	@OriginalMember(owner = "client!av", name = "q", descriptor = "I")
	private final int anInt3112;

	@OriginalMember(owner = "client!av", name = "k", descriptor = "I")
	protected int anInt3107;

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Lclient!vj;IIIZ)V")
	protected Class24(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass45_Sub3_16 = arg0;
		this.anInt3110 = arg2;
		this.anInt3100 = arg1;
		this.aBoolean252 = arg4;
		this.anInt3112 = arg3;
		OpenGL.glGenTextures(1, Static409.anIntArray435, 0);
		this.anInt3107 = Static409.anIntArray435[0];
		this.method2795(0);
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ZI)V")
	protected final void method2793(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean252 != arg0) {
			@Pc(20) int local20 = this.method2798();
			this.aBoolean252 = true;
			this.method2800();
			this.method2795(local20);
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(B)I")
	public final int method2794() {
		return this.anInt3107;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(II)V")
	private void method2795(@OriginalArg(0) int arg0) {
		this.aClass45_Sub3_16.anInt9049 -= arg0;
		this.aClass45_Sub3_16.anInt9049 += this.method2798();
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(B)V")
	public final void method2797() {
		if (this.anInt3107 > 0) {
			this.aClass45_Sub3_16.method7518(this.anInt3107, this.method2798());
			this.anInt3107 = 0;
		}
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(I)I")
	private int method2798() {
		@Pc(20) int local20 = this.aClass45_Sub3_16.method7496(this.anInt3110) * this.anInt3112;
		return this.aBoolean252 ? local20 * 4 / 3 : local20;
	}

	@OriginalMember(owner = "client!av", name = "c", descriptor = "(I)Z")
	public final boolean method2799() {
		if (!this.aClass45_Sub3_16.aBoolean704) {
			return false;
		}
		@Pc(11) int local11 = this.method2798();
		this.aClass45_Sub3_16.method7475(this);
		OpenGL.glGenerateMipmapEXT(this.anInt3100);
		this.aBoolean252 = true;
		this.method2800();
		this.method2795(local11);
		return true;
	}

	@OriginalMember(owner = "client!av", name = "d", descriptor = "(I)V")
	private void method2800() {
		this.aClass45_Sub3_16.method7475(this);
		if (this.aBoolean251) {
			OpenGL.glTexParameteri(this.anInt3100, 10241, this.aBoolean252 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt3100, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt3100, 10241, this.aBoolean252 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt3100, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ZB)V")
	public final void method2802(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean251 != arg0) {
			this.aBoolean251 = arg0;
			this.method2800();
		}
	}

	@OriginalMember(owner = "client!av", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method2797();
		super.finalize();
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(I)V")
	public abstract void method2792();
}
