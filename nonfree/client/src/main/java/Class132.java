import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uda")
public abstract class Class132 implements Interface7 {

	@OriginalMember(owner = "client!uda", name = "f", descriptor = "Z")
	private boolean aBoolean502 = false;

	@OriginalMember(owner = "client!uda", name = "c", descriptor = "I")
	private final int anInt6647;

	@OriginalMember(owner = "client!uda", name = "u", descriptor = "Lclient!ap;")
	protected final Class9_Sub2 aClass9_Sub2_24;

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "Z")
	private boolean aBoolean501;

	@OriginalMember(owner = "client!uda", name = "m", descriptor = "I")
	protected final int anInt6656;

	@OriginalMember(owner = "client!uda", name = "g", descriptor = "I")
	public final int anInt6650;

	@OriginalMember(owner = "client!uda", name = "i", descriptor = "I")
	protected int anInt6652;

	@OriginalMember(owner = "client!uda", name = "<init>", descriptor = "(Lclient!ap;IIIZ)V")
	protected Class132(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6647 = arg3;
		this.aClass9_Sub2_24 = arg0;
		this.aBoolean501 = arg4;
		this.anInt6656 = arg2;
		this.anInt6650 = arg1;
		OpenGL.glGenTextures(1, Static543.anIntArray810, 0);
		this.anInt6652 = Static543.anIntArray810[0];
		this.method5617(0);
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)V")
	public final void method5609() {
		if (this.anInt6652 > 0) {
			this.aClass9_Sub2_24.method765(this.method5615(), this.anInt6652);
			this.anInt6652 = 0;
		}
	}

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "(B)Z")
	public final boolean method5610() {
		if (!this.aClass9_Sub2_24.aBoolean70) {
			return false;
		}
		@Pc(18) int local18 = this.method5615();
		this.aClass9_Sub2_24.method814(this);
		OpenGL.glGenerateMipmapEXT(this.anInt6650);
		this.aBoolean501 = true;
		this.method5611();
		this.method5617(local18);
		return true;
	}

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "(I)V")
	private void method5611() {
		this.aClass9_Sub2_24.method814(this);
		if (this.aBoolean502) {
			OpenGL.glTexParameteri(this.anInt6650, 10241, this.aBoolean501 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt6650, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt6650, 10241, this.aBoolean501 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt6650, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!uda", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method5609();
		super.finalize();
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(BZ)V")
	protected final void method5613(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean501 != arg0) {
			@Pc(11) int local11 = this.method5615();
			this.aBoolean501 = true;
			this.method5611();
			this.method5617(local11);
		}
	}

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "(BZ)V")
	public final void method5614(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean502) {
			this.aBoolean502 = arg0;
			this.method5611();
		}
	}

	@OriginalMember(owner = "client!uda", name = "c", descriptor = "(B)I")
	private int method5615() {
		@Pc(18) int local18 = this.aClass9_Sub2_24.method766(this.anInt6656) * this.anInt6647;
		return this.aBoolean501 ? local18 * 4 / 3 : local18;
	}

	@OriginalMember(owner = "client!uda", name = "d", descriptor = "(B)I")
	public final int method5616() {
		return this.anInt6652;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(BI)V")
	private void method5617(@OriginalArg(1) int arg0) {
		this.aClass9_Sub2_24.anInt817 -= arg0;
		this.aClass9_Sub2_24.anInt817 += this.method5615();
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(B)V")
	public abstract void method6643();
}
