import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fha")
public abstract class Class116 implements Interface15 {

	@OriginalMember(owner = "client!fha", name = "l", descriptor = "Z")
	private boolean aBoolean760 = false;

	@OriginalMember(owner = "client!fha", name = "r", descriptor = "I")
	protected final int anInt9737;

	@OriginalMember(owner = "client!fha", name = "s", descriptor = "I")
	private final int anInt9738;

	@OriginalMember(owner = "client!fha", name = "q", descriptor = "I")
	public final int anInt9736;

	@OriginalMember(owner = "client!fha", name = "k", descriptor = "Lclient!pc;")
	protected final Class33_Sub3 aClass33_Sub3_36;

	@OriginalMember(owner = "client!fha", name = "m", descriptor = "Z")
	private boolean aBoolean761;

	@OriginalMember(owner = "client!fha", name = "e", descriptor = "I")
	protected int anInt9729;

	@OriginalMember(owner = "client!fha", name = "<init>", descriptor = "(Lclient!pc;IIIZ)V")
	protected Class116(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt9737 = arg2;
		this.anInt9738 = arg3;
		this.anInt9736 = arg1;
		this.aClass33_Sub3_36 = arg0;
		this.aBoolean761 = arg4;
		OpenGL.glGenTextures(1, Static212.anIntArray244, 0);
		this.anInt9729 = Static212.anIntArray244[0];
		this.method8347(0);
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(Z)I")
	public final int method8339() {
		return this.anInt9729;
	}

	@OriginalMember(owner = "client!fha", name = "b", descriptor = "(I)V")
	private void method8340() {
		this.aClass33_Sub3_36.method6340(this);
		if (this.aBoolean760) {
			OpenGL.glTexParameteri(this.anInt9736, 10241, this.aBoolean761 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt9736, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt9736, 10241, this.aBoolean761 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt9736, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!fha", name = "c", descriptor = "(I)Z")
	public final boolean method8343() {
		if (!this.aClass33_Sub3_36.aBoolean567) {
			return false;
		}
		@Pc(16) int local16 = this.method8348();
		this.aClass33_Sub3_36.method6340(this);
		OpenGL.glGenerateMipmapEXT(this.anInt9736);
		this.aBoolean761 = true;
		this.method8340();
		this.method8347(local16);
		return true;
	}

	@OriginalMember(owner = "client!fha", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method8345();
		super.finalize();
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(IZ)V")
	protected final void method8344(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean761) {
			@Pc(17) int local17 = this.method8348();
			this.aBoolean761 = true;
			this.method8340();
			this.method8347(local17);
		}
	}

	@OriginalMember(owner = "client!fha", name = "d", descriptor = "(I)V")
	public final void method8345() {
		if (this.anInt9729 > 0) {
			this.aClass33_Sub3_36.method6345(this.anInt9729, this.method8348());
			this.anInt9729 = 0;
		}
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(ZI)V")
	public final void method8346(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean760) {
			this.aBoolean760 = arg0;
			this.method8340();
		}
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(II)V")
	private void method8347(@OriginalArg(0) int arg0) {
		this.aClass33_Sub3_36.anInt7270 -= arg0;
		this.aClass33_Sub3_36.anInt7270 += this.method8348();
	}

	@OriginalMember(owner = "client!fha", name = "e", descriptor = "(I)I")
	private int method8348() {
		@Pc(20) int local20 = this.aClass33_Sub3_36.method6304(this.anInt9737) * this.anInt9738;
		return this.aBoolean761 ? local20 * 4 / 3 : local20;
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(I)V")
	public abstract void method8676();
}
