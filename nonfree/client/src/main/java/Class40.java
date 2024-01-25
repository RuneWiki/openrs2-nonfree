import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public abstract class Class40 implements Interface2 {

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "Z")
	private boolean aBoolean576 = false;

	@OriginalMember(owner = "client!ip", name = "p", descriptor = "Z")
	private boolean aBoolean579;

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
	protected final int anInt7350;

	@OriginalMember(owner = "client!ip", name = "n", descriptor = "I")
	private final int anInt7358;

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "Lclient!ok;")
	protected final Class134_Sub2 aClass134_Sub2_31;

	@OriginalMember(owner = "client!ip", name = "t", descriptor = "I")
	public final int anInt7362;

	@OriginalMember(owner = "client!ip", name = "q", descriptor = "I")
	protected int anInt7359;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lclient!ok;IIIZ)V")
	protected Class40(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean579 = arg4;
		this.anInt7350 = arg2;
		this.anInt7358 = arg3;
		this.aClass134_Sub2_31 = arg0;
		this.anInt7362 = arg1;
		OpenGL.glGenTextures(1, Static323.anIntArray426, 0);
		this.anInt7359 = Static323.anIntArray426[0];
		this.method5875(0);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V")
	private void method5871() {
		this.aClass134_Sub2_31.method5202(this);
		if (this.aBoolean576) {
			OpenGL.glTexParameteri(this.anInt7362, 10241, this.aBoolean579 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt7362, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt7362, 10241, this.aBoolean579 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt7362, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)I")
	public final int method5872() {
		return this.anInt7359;
	}

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)V")
	public final void method5873() {
		if (this.anInt7359 > 0) {
			this.aClass134_Sub2_31.method5203(this.method5877(), this.anInt7359);
			this.anInt7359 = 0;
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(BZ)V")
	public final void method5874(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean576 != arg0) {
			this.aBoolean576 = arg0;
			this.method5871();
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(II)V")
	private void method5875(@OriginalArg(1) int arg0) {
		this.aClass134_Sub2_31.anInt6555 -= arg0;
		this.aClass134_Sub2_31.anInt6555 += this.method5877();
	}

	@OriginalMember(owner = "client!ip", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method5873();
		super.finalize();
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Z)I")
	private int method5877() {
		@Pc(18) int local18 = this.aClass134_Sub2_31.method5211(this.anInt7350) * this.anInt7358;
		return this.aBoolean579 ? local18 * 4 / 3 : local18;
	}

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "(I)Z")
	public final boolean method5878() {
		if (!this.aClass134_Sub2_31.aBoolean518) {
			return false;
		}
		@Pc(18) int local18 = this.method5877();
		this.aClass134_Sub2_31.method5202(this);
		OpenGL.glGenerateMipmapEXT(this.anInt7362);
		this.aBoolean579 = true;
		this.method5871();
		this.method5875(local18);
		return true;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZI)V")
	protected final void method5879(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean579 != arg0) {
			@Pc(24) int local24 = this.method5877();
			this.aBoolean579 = true;
			this.method5871();
			this.method5875(local24);
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V")
	public abstract void method5870();
}
