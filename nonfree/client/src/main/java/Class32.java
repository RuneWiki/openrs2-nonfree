import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public abstract class Class32 implements Interface27 {

	@OriginalMember(owner = "client!mw", name = "i", descriptor = "Z")
	private boolean aBoolean752 = false;

	@OriginalMember(owner = "client!mw", name = "t", descriptor = "I")
	public final int anInt9813;

	@OriginalMember(owner = "client!mw", name = "m", descriptor = "Z")
	private boolean aBoolean751;

	@OriginalMember(owner = "client!mw", name = "u", descriptor = "I")
	private final int anInt9817;

	@OriginalMember(owner = "client!mw", name = "s", descriptor = "I")
	protected final int anInt9805;

	@OriginalMember(owner = "client!mw", name = "d", descriptor = "Lclient!ffa;")
	protected final Class57_Sub2 aClass57_Sub2_36;

	@OriginalMember(owner = "client!mw", name = "k", descriptor = "I")
	protected int anInt9804;

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lclient!ffa;IIIZ)V")
	protected Class32(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt9813 = arg1;
		this.aBoolean751 = arg4;
		this.anInt9817 = arg3;
		this.anInt9805 = arg2;
		this.aClass57_Sub2_36 = arg0;
		OpenGL.glGenTextures(1, Static451.anIntArray466, 0);
		this.anInt9804 = Static451.anIntArray466[0];
		this.method8438(0);
	}

	@OriginalMember(owner = "client!mw", name = "c", descriptor = "(B)I")
	public final int method8428() {
		return this.anInt9804;
	}

	@OriginalMember(owner = "client!mw", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method8429();
		super.finalize();
	}

	@OriginalMember(owner = "client!mw", name = "d", descriptor = "(I)V")
	public final void method8429() {
		if (this.anInt9804 > 0) {
			this.aClass57_Sub2_36.method2380(this.method8434(), this.anInt9804);
			this.anInt9804 = 0;
		}
	}

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "(IZ)V")
	public final void method8430(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean752 != arg0) {
			this.aBoolean752 = arg0;
			this.method8433();
		}
	}

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "(B)V")
	private void method8433() {
		this.aClass57_Sub2_36.method2362(this);
		if (this.aBoolean752) {
			OpenGL.glTexParameteri(this.anInt9813, 10241, this.aBoolean751 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt9813, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt9813, 10241, this.aBoolean751 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt9813, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(B)I")
	private int method8434() {
		@Pc(13) int local13 = this.aClass57_Sub2_36.method2338(this.anInt9805) * this.anInt9817;
		return this.aBoolean751 ? local13 * 4 / 3 : local13;
	}

	@OriginalMember(owner = "client!mw", name = "c", descriptor = "(I)Z")
	public final boolean method8435() {
		if (!this.aClass57_Sub2_36.aBoolean234) {
			return false;
		}
		@Pc(17) int local17 = this.method8434();
		this.aClass57_Sub2_36.method2362(this);
		OpenGL.glGenerateMipmapEXT(this.anInt9813);
		this.aBoolean751 = true;
		this.method8433();
		this.method8438(local17);
		return true;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IZ)V")
	protected final void method8436(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean751) {
			@Pc(16) int local16 = this.method8434();
			this.aBoolean751 = true;
			this.method8433();
			this.method8438(local16);
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(II)V")
	private void method8438(@OriginalArg(0) int arg0) {
		this.aClass57_Sub2_36.anInt2755 -= arg0;
		this.aClass57_Sub2_36.anInt2755 += this.method8434();
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)V")
	public abstract void method8965();
}
