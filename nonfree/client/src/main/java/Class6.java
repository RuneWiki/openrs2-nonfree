import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public abstract class Class6 implements Interface9 {

	@OriginalMember(owner = "client!kj", name = "o", descriptor = "Z")
	private boolean aBoolean489 = false;

	@OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
	public final int anInt5441;

	@OriginalMember(owner = "client!kj", name = "r", descriptor = "I")
	private final int anInt5450;

	@OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
	protected final int anInt5443;

	@OriginalMember(owner = "client!kj", name = "t", descriptor = "Z")
	private boolean aBoolean490;

	@OriginalMember(owner = "client!kj", name = "f", descriptor = "Lclient!fd;")
	protected final Class19_Sub2 aClass19_Sub2_31;

	@OriginalMember(owner = "client!kj", name = "q", descriptor = "I")
	protected int anInt5449;

	static {
		new Class83("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
	}

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lclient!fd;IIIZ)V")
	protected Class6(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5441 = arg1;
		this.anInt5450 = arg3;
		this.anInt5443 = arg2;
		this.aBoolean490 = arg4;
		this.aClass19_Sub2_31 = arg0;
		OpenGL.glGenTextures(1, Static40.anIntArray41, 0);
		this.anInt5449 = Static40.anIntArray41[0];
		this.method4179(0);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(BI)V")
	private void method4179(@OriginalArg(1) int arg0) {
		this.aClass19_Sub2_31.anInt2279 -= arg0;
		this.aClass19_Sub2_31.anInt2279 += this.method4184();
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V")
	private void method4180() {
		this.aClass19_Sub2_31.method1905(this);
		if (this.aBoolean489) {
			OpenGL.glTexParameteri(this.anInt5441, 10241, this.aBoolean490 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt5441, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt5441, 10241, this.aBoolean490 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt5441, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IZ)V")
	public final void method4181(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean489 != arg0) {
			this.aBoolean489 = arg0;
			this.method4180();
		}
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)V")
	public final void method4183() {
		if (this.anInt5449 > 0) {
			this.aClass19_Sub2_31.method1978(this.anInt5449, this.method4184());
			this.anInt5449 = 0;
		}
	}

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "(I)I")
	private int method4184() {
		@Pc(13) int local13 = this.aClass19_Sub2_31.method1920(this.anInt5443) * this.anInt5450;
		return this.aBoolean490 ? local13 * 4 / 3 : local13;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZZ)V")
	protected final void method4185(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean490 != arg0) {
			@Pc(17) int local17 = this.method4184();
			this.aBoolean490 = true;
			this.method4180();
			this.method4179(local17);
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)I")
	public final int method4186() {
		return this.anInt5449;
	}

	@OriginalMember(owner = "client!kj", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method4183();
		super.finalize();
	}

	@OriginalMember(owner = "client!kj", name = "e", descriptor = "(I)Z")
	public final boolean method4189() {
		if (!this.aClass19_Sub2_31.aBoolean191) {
			return false;
		}
		@Pc(16) int local16 = this.method4184();
		this.aClass19_Sub2_31.method1905(this);
		OpenGL.glGenerateMipmapEXT(this.anInt5441);
		this.aBoolean490 = true;
		this.method4180();
		this.method4179(local16);
		return true;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
	public abstract void method4178();
}
