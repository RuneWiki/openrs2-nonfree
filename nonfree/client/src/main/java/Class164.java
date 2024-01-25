import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public abstract class Class164 implements Interface12 {

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "Z")
	private boolean aBoolean705 = false;

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "I")
	public final int anInt9448;

	@OriginalMember(owner = "client!uu", name = "k", descriptor = "I")
	private final int anInt9456;

	@OriginalMember(owner = "client!uu", name = "p", descriptor = "Lclient!mh;")
	protected final Class4_Sub3 aClass4_Sub3_43;

	@OriginalMember(owner = "client!uu", name = "i", descriptor = "Z")
	private boolean aBoolean706;

	@OriginalMember(owner = "client!uu", name = "r", descriptor = "I")
	protected final int anInt9461;

	@OriginalMember(owner = "client!uu", name = "t", descriptor = "I")
	protected int anInt9463;

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(Lclient!mh;IIIZ)V")
	protected Class164(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt9448 = arg1;
		this.anInt9456 = arg3;
		this.aClass4_Sub3_43 = arg0;
		this.aBoolean706 = arg4;
		this.anInt9461 = arg2;
		OpenGL.glGenTextures(1, Static73.anIntArray120, 0);
		this.anInt9463 = Static73.anIntArray120[0];
		this.method8147(0);
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(B)I")
	private int method8144() {
		@Pc(18) int local18 = this.aClass4_Sub3_43.method5295(this.anInt9461) * this.anInt9456;
		return this.aBoolean706 ? local18 * 4 / 3 : local18;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)Z")
	public final boolean method8145() {
		if (!this.aClass4_Sub3_43.aBoolean448) {
			return false;
		}
		@Pc(16) int local16 = this.method8144();
		this.aClass4_Sub3_43.method5250(this);
		OpenGL.glGenerateMipmapEXT(this.anInt9448);
		this.aBoolean706 = true;
		this.method8152();
		this.method8147(local16);
		return true;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)V")
	private void method8147(@OriginalArg(0) int arg0) {
		this.aClass4_Sub3_43.anInt5801 -= arg0;
		this.aClass4_Sub3_43.anInt5801 += this.method8144();
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(I)V")
	public final void method8148() {
		if (this.anInt9463 > 0) {
			this.aClass4_Sub3_43.method5271(this.method8144(), this.anInt9463);
			this.anInt9463 = 0;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IZ)V")
	protected final void method8149(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean706 != arg0) {
			@Pc(23) int local23 = this.method8144();
			this.aBoolean706 = true;
			this.method8152();
			this.method8147(local23);
		}
	}

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "(I)I")
	public final int method8151() {
		return this.anInt9463;
	}

	@OriginalMember(owner = "client!uu", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method8148();
		super.finalize();
	}

	@OriginalMember(owner = "client!uu", name = "d", descriptor = "(I)V")
	private void method8152() {
		this.aClass4_Sub3_43.method5250(this);
		if (this.aBoolean705) {
			OpenGL.glTexParameteri(this.anInt9448, 10241, this.aBoolean706 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt9448, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt9448, 10241, this.aBoolean706 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt9448, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(BZ)V")
	public final void method8154(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean705 != arg0) {
			this.aBoolean705 = arg0;
			this.method8152();
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)V")
	public abstract void method8143();
}
