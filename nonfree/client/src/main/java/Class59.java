import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ew")
public abstract class Class59 implements Interface7 {

	@OriginalMember(owner = "client!ew", name = "i", descriptor = "Z")
	private boolean aBoolean506 = false;

	@OriginalMember(owner = "client!ew", name = "e", descriptor = "Z")
	private boolean aBoolean505;

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "I")
	private final int anInt7466;

	@OriginalMember(owner = "client!ew", name = "m", descriptor = "I")
	protected final int anInt7474;

	@OriginalMember(owner = "client!ew", name = "p", descriptor = "Lclient!vd;")
	protected final Class51_Sub2 aClass51_Sub2_43;

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "I")
	public final int anInt7465;

	@OriginalMember(owner = "client!ew", name = "k", descriptor = "I")
	protected int anInt7472;

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(Lclient!vd;IIIZ)V")
	protected Class59(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean505 = arg4;
		this.anInt7466 = arg3;
		this.anInt7474 = arg2;
		this.aClass51_Sub2_43 = arg0;
		this.anInt7465 = arg1;
		OpenGL.glGenTextures(1, Static274.anIntArray419, 0);
		this.anInt7472 = Static274.anIntArray419[0];
		this.method5756(0);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(II)V")
	private void method5756(@OriginalArg(1) int arg0) {
		this.aClass51_Sub2_43.anInt6917 -= arg0;
		this.aClass51_Sub2_43.anInt6917 += this.method5762();
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(BZ)V")
	protected final void method5757(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean505 != arg0) {
			@Pc(15) int local15 = this.method5762();
			this.aBoolean505 = true;
			this.method5758();
			this.method5756(local15);
		}
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(I)V")
	private void method5758() {
		this.aClass51_Sub2_43.method5364(this);
		if (this.aBoolean506) {
			OpenGL.glTexParameteri(this.anInt7465, 10241, this.aBoolean505 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt7465, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt7465, 10241, this.aBoolean505 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt7465, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "(I)I")
	public final int method5759() {
		return this.anInt7472;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(ZB)V")
	public final void method5760(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean506) {
			this.aBoolean506 = arg0;
			this.method5758();
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(Z)Z")
	public final boolean method5761() {
		if (!this.aClass51_Sub2_43.aBoolean458) {
			return false;
		}
		@Pc(18) int local18 = this.method5762();
		this.aClass51_Sub2_43.method5364(this);
		OpenGL.glGenerateMipmapEXT(this.anInt7465);
		this.aBoolean505 = true;
		this.method5758();
		this.method5756(local18);
		return true;
	}

	@OriginalMember(owner = "client!ew", name = "d", descriptor = "(I)I")
	private int method5762() {
		@Pc(18) int local18 = this.aClass51_Sub2_43.method5387(this.anInt7474) * this.anInt7466;
		return this.aBoolean505 ? local18 * 4 / 3 : local18;
	}

	@OriginalMember(owner = "client!ew", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method5763();
		super.finalize();
	}

	@OriginalMember(owner = "client!ew", name = "e", descriptor = "(I)V")
	public final void method5763() {
		if (this.anInt7472 > 0) {
			this.aClass51_Sub2_43.method5370(this.anInt7472, this.method5762());
			this.anInt7472 = 0;
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V")
	public abstract void method5755();
}
