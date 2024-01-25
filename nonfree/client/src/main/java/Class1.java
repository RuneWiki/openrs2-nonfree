import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kv")
public abstract class Class1 implements Interface9 {

	@OriginalMember(owner = "client!kv", name = "i", descriptor = "Z")
	private boolean aBoolean371 = false;

	@OriginalMember(owner = "client!kv", name = "d", descriptor = "I")
	protected final int anInt5551;

	@OriginalMember(owner = "client!kv", name = "q", descriptor = "I")
	private final int anInt5561;

	@OriginalMember(owner = "client!kv", name = "v", descriptor = "Lclient!bv;")
	protected final Class30_Sub1 aClass30_Sub1_36;

	@OriginalMember(owner = "client!kv", name = "u", descriptor = "I")
	public final int anInt5564;

	@OriginalMember(owner = "client!kv", name = "m", descriptor = "Z")
	private boolean aBoolean372;

	@OriginalMember(owner = "client!kv", name = "k", descriptor = "I")
	protected int anInt5557;

	static {
		new Class242(null, "Dieses System darf nicht missbraucht werden!", null, null);
	}

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lclient!bv;IIIZ)V")
	protected Class1(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5551 = arg2;
		this.anInt5561 = arg3;
		this.aClass30_Sub1_36 = arg0;
		this.anInt5564 = arg1;
		this.aBoolean372 = arg4;
		OpenGL.glGenTextures(1, Static37.anIntArray72, 0);
		this.anInt5557 = Static37.anIntArray72[0];
		this.method4272(0);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)I")
	public final int method4265() {
		return this.anInt5557;
	}

	@OriginalMember(owner = "client!kv", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method4271();
		super.finalize();
	}

	@OriginalMember(owner = "client!kv", name = "c", descriptor = "(I)V")
	private void method4268() {
		this.aClass30_Sub1_36.method916(this);
		if (this.aBoolean371) {
			OpenGL.glTexParameteri(this.anInt5564, 10241, this.aBoolean372 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt5564, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt5564, 10241, this.aBoolean372 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt5564, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!kv", name = "d", descriptor = "(I)I")
	private int method4269() {
		@Pc(21) int local21 = this.aClass30_Sub1_36.method929(this.anInt5551) * this.anInt5561;
		return this.aBoolean372 ? local21 * 4 / 3 : local21;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(B)V")
	public final void method4271() {
		if (this.anInt5557 > 0) {
			this.aClass30_Sub1_36.method899(this.anInt5557, this.method4269());
			this.anInt5557 = 0;
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(II)V")
	private void method4272(@OriginalArg(0) int arg0) {
		this.aClass30_Sub1_36.anInt1248 -= arg0;
		this.aClass30_Sub1_36.anInt1248 += this.method4269();
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(ZZ)V")
	public final void method4273(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean371 != arg0) {
			this.aBoolean371 = arg0;
			this.method4268();
		}
	}

	@OriginalMember(owner = "client!kv", name = "e", descriptor = "(I)Z")
	public final boolean method4274() {
		if (!this.aClass30_Sub1_36.aBoolean69) {
			return false;
		}
		@Pc(16) int local16 = this.method4269();
		this.aClass30_Sub1_36.method916(this);
		OpenGL.glGenerateMipmapEXT(this.anInt5564);
		this.aBoolean372 = true;
		this.method4268();
		this.method4272(local16);
		return true;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(ZB)V")
	protected final void method4276(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean372 != arg0) {
			@Pc(19) int local19 = this.method4269();
			this.aBoolean372 = true;
			this.method4268();
			this.method4272(local19);
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Z)V")
	public abstract void method4264();
}
