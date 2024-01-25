import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public abstract class Class44 implements Interface5 {

	@OriginalMember(owner = "client!me", name = "g", descriptor = "Z")
	private boolean aBoolean535 = false;

	@OriginalMember(owner = "client!me", name = "h", descriptor = "Lclient!nf;")
	protected final Class105_Sub1 aClass105_Sub1_41;

	@OriginalMember(owner = "client!me", name = "c", descriptor = "I")
	public final int anInt6476;

	@OriginalMember(owner = "client!me", name = "b", descriptor = "I")
	protected final int anInt6475;

	@OriginalMember(owner = "client!me", name = "e", descriptor = "Z")
	private boolean aBoolean534;

	@OriginalMember(owner = "client!me", name = "d", descriptor = "I")
	private final int anInt6477;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "I")
	protected int anInt6474;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!nf;IIIZ)V")
	protected Class44(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass105_Sub1_41 = arg0;
		this.anInt6476 = arg1;
		this.anInt6475 = arg2;
		this.aBoolean534 = arg4;
		this.anInt6477 = arg3;
		this.aClass105_Sub1_41.anOpengl1.glGenTextures(1, Static181.anIntArray652, 0);
		this.anInt6474 = Static181.anIntArray652[0];
		this.method5580(0);
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "()I")
	public final int method5569() {
		return this.anInt6474;
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "()Z")
	public final boolean method5571() {
		@Pc(3) opengl local3 = this.aClass105_Sub1_41.anOpengl1;
		if (!this.aClass105_Sub1_41.aBoolean326) {
			return false;
		}
		@Pc(10) int local10 = this.method5575();
		this.aClass105_Sub1_41.method3591(this);
		local3.glGenerateMipmapEXT(this.anInt6476);
		this.aBoolean534 = true;
		this.method5579();
		this.method5580(local10);
		return true;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)V")
	public final void method5572(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean535 != arg0) {
			this.aBoolean535 = arg0;
			this.method5579();
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(Z)V")
	protected final void method5573(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean534 != arg0) {
			@Pc(6) int local6 = this.method5575();
			this.aBoolean534 = true;
			this.method5579();
			this.method5580(local6);
		}
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "()I")
	private int method5575() {
		@Pc(8) int local8 = this.aClass105_Sub1_41.method3563(this.anInt6475) * this.anInt6477;
		return this.aBoolean534 ? local8 * 4 / 3 : local8;
	}

	@OriginalMember(owner = "client!me", name = "e", descriptor = "()V")
	public final void method5577() {
		if (this.anInt6474 > 0) {
			this.aClass105_Sub1_41.method3600(this.anInt6474, this.method5575());
			this.anInt6474 = 0;
		}
	}

	@OriginalMember(owner = "client!me", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method5577();
		super.finalize();
	}

	@OriginalMember(owner = "client!me", name = "f", descriptor = "()V")
	private void method5579() {
		@Pc(3) opengl local3 = this.aClass105_Sub1_41.anOpengl1;
		this.aClass105_Sub1_41.method3591(this);
		if (this.aBoolean535) {
			local3.glTexParameteri(this.anInt6476, 10241, this.aBoolean534 ? 9987 : 9729);
			local3.glTexParameteri(this.anInt6476, 10240, 9729);
		} else {
			local3.glTexParameteri(this.anInt6476, 10241, this.aBoolean534 ? 9984 : 9728);
			local3.glTexParameteri(this.anInt6476, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(I)V")
	private void method5580(@OriginalArg(0) int arg0) {
		this.aClass105_Sub1_41.anInt4169 -= arg0;
		this.aClass105_Sub1_41.anInt4169 += this.method5575();
	}
}
