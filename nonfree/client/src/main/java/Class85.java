import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public abstract class Class85 implements Interface24 {

	@OriginalMember(owner = "client!il", name = "m", descriptor = "Z")
	private boolean aBoolean705 = false;

	@OriginalMember(owner = "client!il", name = "p", descriptor = "Lclient!dia;")
	protected final Class13_Sub2 aClass13_Sub2_40;

	@OriginalMember(owner = "client!il", name = "b", descriptor = "I")
	protected final int anInt9005;

	@OriginalMember(owner = "client!il", name = "d", descriptor = "I")
	private final int anInt9007;

	@OriginalMember(owner = "client!il", name = "h", descriptor = "Z")
	private boolean aBoolean704;

	@OriginalMember(owner = "client!il", name = "c", descriptor = "I")
	public final int anInt9006;

	@OriginalMember(owner = "client!il", name = "q", descriptor = "I")
	protected int anInt9016;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lclient!dia;IIIZ)V")
	protected Class85(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass13_Sub2_40 = arg0;
		this.anInt9005 = arg2;
		this.anInt9007 = arg3;
		this.aBoolean704 = arg4;
		this.anInt9006 = arg1;
		OpenGL.glGenTextures(1, Static640.anIntArray890, 0);
		this.anInt9016 = Static640.anIntArray890[0];
		this.method7874(0);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(B)I")
	public final int method7869() {
		return this.anInt9016;
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V")
	public final void method7870() {
		if (this.anInt9016 > 0) {
			this.aClass13_Sub2_40.method2032(this.anInt9016, this.method7876());
			this.anInt9016 = 0;
		}
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(B)V")
	private void method7872() {
		this.aClass13_Sub2_40.method2024(this);
		if (this.aBoolean705) {
			OpenGL.glTexParameteri(this.anInt9006, 10241, this.aBoolean704 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt9006, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt9006, 10241, this.aBoolean704 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt9006, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!il", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7870();
		super.finalize();
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(II)V")
	private void method7874(@OriginalArg(1) int arg0) {
		this.aClass13_Sub2_40.anInt2161 -= arg0;
		this.aClass13_Sub2_40.anInt2161 += this.method7876();
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ZZ)V")
	public final void method7875(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean705 != arg0) {
			this.aBoolean705 = arg0;
			this.method7872();
		}
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(B)I")
	private int method7876() {
		@Pc(21) int local21 = this.aClass13_Sub2_40.method2016(this.anInt9005) * this.anInt9007;
		return this.aBoolean704 ? local21 * 4 / 3 : local21;
	}

	@OriginalMember(owner = "client!il", name = "e", descriptor = "(B)Z")
	public final boolean method7878() {
		if (!this.aClass13_Sub2_40.aBoolean172) {
			return false;
		}
		@Pc(18) int local18 = this.method7876();
		this.aClass13_Sub2_40.method2024(this);
		OpenGL.glGenerateMipmapEXT(this.anInt9006);
		this.aBoolean704 = true;
		this.method7872();
		this.method7874(local18);
		return true;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(BZ)V")
	protected final void method7880(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean704 != arg0) {
			@Pc(27) int local27 = this.method7876();
			this.aBoolean704 = true;
			this.method7872();
			this.method7874(local27);
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
	public abstract void method7868();
}
