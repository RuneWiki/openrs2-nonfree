import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public abstract class Class40 implements Interface3 {

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "Z")
	private boolean aBoolean409 = false;

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
	private final int anInt6155;

	@OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
	public final int anInt6158;

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
	protected final int anInt6159;

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "Z")
	private boolean aBoolean408;

	@OriginalMember(owner = "client!ce", name = "m", descriptor = "Lclient!bl;")
	protected final Class28_Sub1 aClass28_Sub1_35;

	@OriginalMember(owner = "client!ce", name = "s", descriptor = "I")
	protected int anInt6163;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lclient!bl;IIIZ)V")
	protected Class40(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6155 = arg3;
		this.anInt6158 = arg1;
		this.anInt6159 = arg2;
		this.aBoolean408 = arg4;
		this.aClass28_Sub1_35 = arg0;
		OpenGL.glGenTextures(1, Static256.anIntArray395, 0);
		this.anInt6163 = Static256.anIntArray395[0];
		this.method5144(0);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZI)V")
	private void method5144(@OriginalArg(1) int arg0) {
		this.aClass28_Sub1_35.anInt742 -= arg0;
		this.aClass28_Sub1_35.anInt742 += this.method5146();
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)Z")
	public final boolean method5145() {
		if (!this.aClass28_Sub1_35.aBoolean60) {
			return false;
		}
		@Pc(16) int local16 = this.method5146();
		this.aClass28_Sub1_35.method654(this);
		OpenGL.glGenerateMipmapEXT(this.anInt6158);
		this.aBoolean408 = true;
		this.method5149();
		this.method5144(local16);
		return true;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)I")
	private int method5146() {
		@Pc(21) int local21 = this.aClass28_Sub1_35.method651(this.anInt6159) * this.anInt6155;
		return this.aBoolean408 ? local21 * 4 / 3 : local21;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZZ)V")
	public final void method5148(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean409) {
			this.aBoolean409 = arg0;
			this.method5149();
		}
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(B)V")
	private void method5149() {
		this.aClass28_Sub1_35.method654(this);
		if (this.aBoolean409) {
			OpenGL.glTexParameteri(this.anInt6158, 10241, this.aBoolean408 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt6158, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt6158, 10241, this.aBoolean408 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt6158, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!ce", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method5154();
		super.finalize();
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)I")
	public final int method5151() {
		return this.anInt6163;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZB)V")
	protected final void method5153(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean408) {
			@Pc(15) int local15 = this.method5146();
			this.aBoolean408 = true;
			this.method5149();
			this.method5144(local15);
		}
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)V")
	public final void method5154() {
		if (this.anInt6163 > 0) {
			this.aClass28_Sub1_35.method657(this.method5146(), this.anInt6163);
			this.anInt6163 = 0;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
	public abstract void method5143();
}
