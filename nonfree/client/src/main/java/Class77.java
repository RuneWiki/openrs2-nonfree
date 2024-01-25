import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public abstract class Class77 implements Interface15 {

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "Z")
	private boolean aBoolean611 = false;

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
	public final int anInt8662;

	@OriginalMember(owner = "client!jf", name = "p", descriptor = "I")
	protected final int anInt8673;

	@OriginalMember(owner = "client!jf", name = "j", descriptor = "Lclient!kga;")
	protected final Class44_Sub3 aClass44_Sub3_36;

	@OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
	private final int anInt8676;

	@OriginalMember(owner = "client!jf", name = "r", descriptor = "Z")
	private boolean aBoolean612;

	@OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
	protected int anInt8675;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!kga;IIIZ)V")
	protected Class77(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt8662 = arg1;
		this.anInt8673 = arg2;
		this.aClass44_Sub3_36 = arg0;
		this.anInt8676 = arg3;
		this.aBoolean612 = arg4;
		OpenGL.glGenTextures(1, Static242.anIntArray222, 0);
		this.anInt8675 = Static242.anIntArray222[0];
		this.method7065(0);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)V")
	private void method7065(@OriginalArg(1) int arg0) {
		this.aClass44_Sub3_36.anInt5477 -= arg0;
		this.aClass44_Sub3_36.anInt5477 += this.method7068();
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)Z")
	public final boolean method7067() {
		if (!this.aClass44_Sub3_36.aBoolean412) {
			return false;
		}
		@Pc(16) int local16 = this.method7068();
		this.aClass44_Sub3_36.method4605(this);
		OpenGL.glGenerateMipmapEXT(this.anInt8662);
		this.aBoolean612 = true;
		this.method7070();
		this.method7065(local16);
		return true;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)I")
	private int method7068() {
		@Pc(13) int local13 = this.aClass44_Sub3_36.method4666(this.anInt8673) * this.anInt8676;
		return this.aBoolean612 ? local13 * 4 / 3 : local13;
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V")
	public final void method7069() {
		if (this.anInt8675 > 0) {
			this.aClass44_Sub3_36.method4612(this.anInt8675, this.method7068());
			this.anInt8675 = 0;
		}
	}

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)V")
	private void method7070() {
		this.aClass44_Sub3_36.method4605(this);
		if (this.aBoolean611) {
			OpenGL.glTexParameteri(this.anInt8662, 10241, this.aBoolean612 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt8662, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt8662, 10241, this.aBoolean612 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt8662, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!jf", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7069();
		super.finalize();
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZB)V")
	protected final void method7073(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean612) {
			@Pc(21) int local21 = this.method7068();
			this.aBoolean612 = true;
			this.method7070();
			this.method7065(local21);
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)I")
	public final int method7075() {
		return this.anInt8675;
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(ZB)V")
	public final void method7076(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean611) {
			this.aBoolean611 = arg0;
			this.method7070();
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
	public abstract void method7064();
}
