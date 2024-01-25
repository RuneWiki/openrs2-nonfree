import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public abstract class Class85 implements Interface20 {

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "Z")
	private boolean aBoolean743 = false;

	@OriginalMember(owner = "client!ud", name = "n", descriptor = "Z")
	private boolean aBoolean744;

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
	public final int anInt10892;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
	private final int anInt10890;

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
	protected final int anInt10899;

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "Lclient!qo;")
	protected final Class20_Sub3 aClass20_Sub3_41;

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
	protected int anInt10900;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!qo;IIIZ)V")
	protected Class85(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean744 = arg4;
		this.anInt10892 = arg1;
		this.anInt10890 = arg3;
		this.anInt10899 = arg2;
		this.aClass20_Sub3_41 = arg0;
		OpenGL.glGenTextures(1, Static190.anIntArray222, 0);
		this.anInt10900 = Static190.anIntArray222[0];
		this.method9099(0);
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)Z")
	public final boolean method9095() {
		if (!this.aClass20_Sub3_41.aBoolean626) {
			return false;
		}
		@Pc(19) int local19 = this.method9096();
		this.aClass20_Sub3_41.method7358(this);
		OpenGL.glGenerateMipmapEXT(this.anInt10892);
		this.aBoolean744 = true;
		this.method9101();
		this.method9099(local19);
		return true;
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)I")
	private int method9096() {
		@Pc(19) int local19 = this.aClass20_Sub3_41.method7385(this.anInt10899) * this.anInt10890;
		return this.aBoolean744 ? local19 * 4 / 3 : local19;
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)V")
	public final void method9097() {
		if (this.anInt10900 > 0) {
			this.aClass20_Sub3_41.method7324(this.anInt10900, this.method9096());
			this.anInt10900 = 0;
		}
	}

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "(I)I")
	public final int method9098() {
		return this.anInt10900;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V")
	private void method9099(@OriginalArg(0) int arg0) {
		this.aClass20_Sub3_41.anInt8778 -= arg0;
		this.aClass20_Sub3_41.anInt8778 += this.method9096();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZB)V")
	protected final void method9100(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean744 != arg0) {
			@Pc(18) int local18 = this.method9096();
			this.aBoolean744 = true;
			this.method9101();
			this.method9099(local18);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V")
	private void method9101() {
		this.aClass20_Sub3_41.method7358(this);
		if (this.aBoolean743) {
			OpenGL.glTexParameteri(this.anInt10892, 10241, this.aBoolean744 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt10892, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt10892, 10241, this.aBoolean744 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt10892, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZ)V")
	public final void method9102(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean743 != arg0) {
			this.aBoolean743 = arg0;
			this.method9101();
		}
	}

	@OriginalMember(owner = "client!ud", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method9097();
		super.finalize();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
	public abstract void method9094();
}
