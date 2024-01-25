import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ica")
public abstract class Class44 implements Interface21 {

	@OriginalMember(owner = "client!ica", name = "l", descriptor = "Z")
	private boolean aBoolean776 = false;

	@OriginalMember(owner = "client!ica", name = "k", descriptor = "Lclient!ml;")
	protected final Class75_Sub3 aClass75_Sub3_43;

	@OriginalMember(owner = "client!ica", name = "c", descriptor = "I")
	public final int anInt10474;

	@OriginalMember(owner = "client!ica", name = "j", descriptor = "I")
	protected final int anInt10483;

	@OriginalMember(owner = "client!ica", name = "q", descriptor = "Z")
	private boolean aBoolean777;

	@OriginalMember(owner = "client!ica", name = "g", descriptor = "I")
	private final int anInt10473;

	@OriginalMember(owner = "client!ica", name = "n", descriptor = "I")
	protected int anInt10480;

	@OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(Lclient!ml;IIIZ)V")
	protected Class44(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass75_Sub3_43 = arg0;
		this.anInt10474 = arg1;
		this.anInt10483 = arg2;
		this.aBoolean777 = arg4;
		this.anInt10473 = arg3;
		OpenGL.glGenTextures(1, Static657.anIntArray684, 0);
		this.anInt10480 = Static657.anIntArray684[0];
		this.method9011(0);
	}

	@OriginalMember(owner = "client!ica", name = "d", descriptor = "(I)V")
	public final void method9005() {
		if (this.anInt10480 > 0) {
			this.aClass75_Sub3_43.method5782(this.method9006(), this.anInt10480);
			this.anInt10480 = 0;
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(B)I")
	private int method9006() {
		@Pc(21) int local21 = this.aClass75_Sub3_43.method5817(this.anInt10483) * this.anInt10473;
		return this.aBoolean777 ? local21 * 4 / 3 : local21;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IZ)V")
	public final void method9007(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean776 != arg0) {
			this.aBoolean776 = arg0;
			this.method9012();
		}
	}

	@OriginalMember(owner = "client!ica", name = "c", descriptor = "(I)Z")
	public final boolean method9008() {
		if (!this.aClass75_Sub3_43.aBoolean473) {
			return false;
		}
		@Pc(19) int local19 = this.method9006();
		this.aClass75_Sub3_43.method5774(this);
		OpenGL.glGenerateMipmapEXT(this.anInt10474);
		this.aBoolean777 = true;
		this.method9012();
		this.method9011(local19);
		return true;
	}

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "(B)I")
	public final int method9009() {
		return this.anInt10480;
	}

	@OriginalMember(owner = "client!ica", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method9005();
		super.finalize();
	}

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "(IZ)V")
	protected final void method9010(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean777 != arg0) {
			@Pc(19) int local19 = this.method9006();
			this.aBoolean777 = true;
			this.method9012();
			this.method9011(local19);
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(II)V")
	private void method9011(@OriginalArg(1) int arg0) {
		this.aClass75_Sub3_43.anInt6536 -= arg0;
		this.aClass75_Sub3_43.anInt6536 += this.method9006();
	}

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "(I)V")
	private void method9012() {
		this.aClass75_Sub3_43.method5774(this);
		if (this.aBoolean776) {
			OpenGL.glTexParameteri(this.anInt10474, 10241, this.aBoolean777 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt10474, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt10474, 10241, this.aBoolean777 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt10474, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)V")
	public abstract void method9004();
}
