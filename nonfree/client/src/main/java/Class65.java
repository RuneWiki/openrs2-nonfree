import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public abstract class Class65 implements Interface10 {

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "Z")
	private boolean aBoolean420 = false;

	@OriginalMember(owner = "client!sq", name = "q", descriptor = "I")
	protected final int anInt5981;

	@OriginalMember(owner = "client!sq", name = "g", descriptor = "I")
	private final int anInt5974;

	@OriginalMember(owner = "client!sq", name = "m", descriptor = "Lclient!ug;")
	protected final Class135_Sub2 aClass135_Sub2_32;

	@OriginalMember(owner = "client!sq", name = "j", descriptor = "I")
	public final int anInt5976;

	@OriginalMember(owner = "client!sq", name = "k", descriptor = "Z")
	private boolean aBoolean421;

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "I")
	protected int anInt5972;

	static {
		new Class15("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
	}

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lclient!ug;IIIZ)V")
	protected Class65(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5981 = arg2;
		this.anInt5974 = arg3;
		this.aClass135_Sub2_32 = arg0;
		this.anInt5976 = arg1;
		this.aBoolean421 = arg4;
		OpenGL.glGenTextures(1, Static268.anIntArray365, 0);
		this.anInt5972 = Static268.anIntArray365[0];
		this.method4766(0);
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)I")
	private int method4761() {
		@Pc(21) int local21 = this.aClass135_Sub2_32.method5433(this.anInt5981) * this.anInt5974;
		return this.aBoolean421 ? local21 * 4 / 3 : local21;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZZ)V")
	protected final void method4763(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean421 != arg0) {
			@Pc(11) int local11 = this.method4761();
			this.aBoolean421 = true;
			this.method4773();
			this.method4766(local11);
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(BI)V")
	private void method4766(@OriginalArg(1) int arg0) {
		this.aClass135_Sub2_32.anInt6786 -= arg0;
		this.aClass135_Sub2_32.anInt6786 += this.method4761();
	}

	@OriginalMember(owner = "client!sq", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method4770();
		super.finalize();
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(Z)I")
	public final int method4768() {
		return this.anInt5972;
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(B)Z")
	public final boolean method4769() {
		if (!this.aClass135_Sub2_32.aBoolean458) {
			return false;
		}
		@Pc(11) int local11 = this.method4761();
		this.aClass135_Sub2_32.method5458(this);
		OpenGL.glGenerateMipmapEXT(this.anInt5976);
		this.aBoolean421 = true;
		this.method4773();
		this.method4766(local11);
		return true;
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(B)V")
	public final void method4770() {
		if (this.anInt5972 > 0) {
			this.aClass135_Sub2_32.method5436(this.method4761(), this.anInt5972);
			this.anInt5972 = 0;
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZI)V")
	public final void method4771(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean420) {
			this.aBoolean420 = arg0;
			this.method4773();
		}
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(I)V")
	private void method4773() {
		this.aClass135_Sub2_32.method5458(this);
		if (this.aBoolean420) {
			OpenGL.glTexParameteri(this.anInt5976, 10241, this.aBoolean421 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt5976, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt5976, 10241, this.aBoolean421 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt5976, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V")
	public abstract void method4759();
}
