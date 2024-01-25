import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!av")
public abstract class Class3 implements Interface11 {

	@OriginalMember(owner = "client!av", name = "q", descriptor = "Z")
	private boolean aBoolean340 = false;

	@OriginalMember(owner = "client!av", name = "p", descriptor = "I")
	private final int anInt4997;

	@OriginalMember(owner = "client!av", name = "m", descriptor = "Lclient!kd;")
	protected final Class39_Sub2 aClass39_Sub2_29;

	@OriginalMember(owner = "client!av", name = "d", descriptor = "I")
	public final int anInt4987;

	@OriginalMember(owner = "client!av", name = "j", descriptor = "I")
	protected final int anInt4993;

	@OriginalMember(owner = "client!av", name = "l", descriptor = "Z")
	private boolean aBoolean339;

	@OriginalMember(owner = "client!av", name = "c", descriptor = "I")
	protected int anInt4986;

	static {
		new Class7("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
	}

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Lclient!kd;IIIZ)V")
	protected Class3(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4997 = arg3;
		this.aClass39_Sub2_29 = arg0;
		this.anInt4987 = arg1;
		this.anInt4993 = arg2;
		this.aBoolean339 = arg4;
		OpenGL.glGenTextures(1, Static170.anIntArray282, 0);
		this.anInt4986 = Static170.anIntArray282[0];
		this.method4156(0);
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ZI)V")
	public final void method4146(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean340) {
			this.aBoolean340 = arg0;
			this.method4153();
		}
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(I)Z")
	public final boolean method4148() {
		if (!this.aClass39_Sub2_29.aBoolean251) {
			return false;
		}
		@Pc(18) int local18 = this.method4154();
		this.aClass39_Sub2_29.method3203(this);
		OpenGL.glGenerateMipmapEXT(this.anInt4987);
		this.aBoolean339 = true;
		this.method4153();
		this.method4156(local18);
		return true;
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(ZI)V")
	protected final void method4149(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean339) {
			@Pc(15) int local15 = this.method4154();
			this.aBoolean339 = true;
			this.method4153();
			this.method4156(local15);
		}
	}

	@OriginalMember(owner = "client!av", name = "c", descriptor = "(I)I")
	public final int method4150() {
		return this.anInt4986;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(B)V")
	public final void method4152() {
		if (this.anInt4986 > 0) {
			this.aClass39_Sub2_29.method3222(this.anInt4986, this.method4154());
			this.anInt4986 = 0;
		}
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(B)V")
	private void method4153() {
		this.aClass39_Sub2_29.method3203(this);
		if (this.aBoolean340) {
			OpenGL.glTexParameteri(this.anInt4987, 10241, this.aBoolean339 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt4987, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt4987, 10241, this.aBoolean339 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt4987, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!av", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method4152();
		super.finalize();
	}

	@OriginalMember(owner = "client!av", name = "d", descriptor = "(I)I")
	private int method4154() {
		@Pc(13) int local13 = this.aClass39_Sub2_29.method3220(this.anInt4993) * this.anInt4997;
		return this.aBoolean339 ? local13 * 4 / 3 : local13;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(BI)V")
	private void method4156(@OriginalArg(1) int arg0) {
		this.aClass39_Sub2_29.anInt3782 -= arg0;
		this.aClass39_Sub2_29.anInt3782 += this.method4154();
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(I)V")
	public abstract void method4145();
}
