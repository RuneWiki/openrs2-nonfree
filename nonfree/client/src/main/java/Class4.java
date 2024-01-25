import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public abstract class Class4 implements Interface9 {

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "Z")
	private boolean aBoolean371 = false;

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
	protected final int anInt5763;

	@OriginalMember(owner = "client!ac", name = "r", descriptor = "I")
	public final int anInt5771;

	@OriginalMember(owner = "client!ac", name = "q", descriptor = "Z")
	private boolean aBoolean372;

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "Lclient!da;")
	protected final Class50_Sub1 aClass50_Sub1_32;

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
	private final int anInt5766;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
	protected int anInt5758;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lclient!da;IIIZ)V")
	protected Class4(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5763 = arg2;
		this.anInt5771 = arg1;
		this.aBoolean372 = arg4;
		this.aClass50_Sub1_32 = arg0;
		this.anInt5766 = arg3;
		OpenGL.glGenTextures(1, Static370.anIntArray620, 0);
		this.anInt5758 = Static370.anIntArray620[0];
		this.method4584(0);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
	public final void method4575() {
		if (this.anInt5758 > 0) {
			this.aClass50_Sub1_32.method1329(this.anInt5758, this.method4578());
			this.anInt5758 = 0;
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
	private void method4576() {
		this.aClass50_Sub1_32.method1295(this);
		if (this.aBoolean371) {
			OpenGL.glTexParameteri(this.anInt5771, 10241, this.aBoolean372 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt5771, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt5771, 10241, this.aBoolean372 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt5771, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!ac", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method4575();
		super.finalize();
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)I")
	private int method4578() {
		@Pc(18) int local18 = this.aClass50_Sub1_32.method1312(this.anInt5763) * this.anInt5766;
		return this.aBoolean372 ? local18 * 4 / 3 : local18;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZ)V")
	public final void method4580(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean371 != arg0) {
			this.aBoolean371 = arg0;
			this.method4576();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BZ)V")
	protected final void method4581(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean372 != arg0) {
			@Pc(17) int local17 = this.method4578();
			this.aBoolean372 = true;
			this.method4576();
			this.method4584(local17);
		}
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)I")
	public final int method4582() {
		return this.anInt5758;
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(B)Z")
	public final boolean method4583() {
		if (!this.aClass50_Sub1_32.aBoolean98) {
			return false;
		}
		@Pc(18) int local18 = this.method4578();
		this.aClass50_Sub1_32.method1295(this);
		OpenGL.glGenerateMipmapEXT(this.anInt5771);
		this.aBoolean372 = true;
		this.method4576();
		this.method4584(local18);
		return true;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BI)V")
	private void method4584(@OriginalArg(1) int arg0) {
		this.aClass50_Sub1_32.anInt1410 -= arg0;
		this.aClass50_Sub1_32.anInt1410 += this.method4578();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
	public abstract void method5899();
}
