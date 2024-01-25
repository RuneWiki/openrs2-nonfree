import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aba")
public abstract class Class4 implements Interface19 {

	@OriginalMember(owner = "client!aba", name = "v", descriptor = "[I")
	public static final int[] anIntArray501 = new int[32];

	@OriginalMember(owner = "client!aba", name = "l", descriptor = "Z")
	private boolean aBoolean475 = false;

	@OriginalMember(owner = "client!aba", name = "e", descriptor = "Z")
	private boolean aBoolean474;

	@OriginalMember(owner = "client!aba", name = "n", descriptor = "I")
	protected final int anInt6703;

	@OriginalMember(owner = "client!aba", name = "p", descriptor = "I")
	private final int anInt6704;

	@OriginalMember(owner = "client!aba", name = "f", descriptor = "Lclient!jj;")
	protected final Class62_Sub3 aClass62_Sub3_28;

	@OriginalMember(owner = "client!aba", name = "u", descriptor = "I")
	public final int anInt6708;

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "I")
	protected int anInt6694;

	static {
		@Pc(8) int local8 = 2;
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			anIntArray501[local10] = local8 - 1;
			local8 += local8;
		}
	}

	@OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(Lclient!jj;IIIZ)V")
	protected Class4(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean474 = arg4;
		this.anInt6703 = arg2;
		this.anInt6704 = arg3;
		this.aClass62_Sub3_28 = arg0;
		this.anInt6708 = arg1;
		OpenGL.glGenTextures(1, Static449.anIntArray592, 0);
		this.anInt6694 = Static449.anIntArray592[0];
		this.method5495(0);
	}

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "(I)Z")
	public final boolean method5491() {
		if (!this.aClass62_Sub3_28.aBoolean282) {
			return false;
		}
		@Pc(19) int local19 = this.method5496();
		this.aClass62_Sub3_28.method4007(this);
		OpenGL.glGenerateMipmapEXT(this.anInt6708);
		this.aBoolean474 = true;
		this.method5503();
		this.method5495(local19);
		return true;
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(B)I")
	public final int method5493() {
		return this.anInt6694;
	}

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "(B)V")
	public final void method5494() {
		if (this.anInt6694 > 0) {
			this.aClass62_Sub3_28.method3991(this.method5496(), this.anInt6694);
			this.anInt6694 = 0;
		}
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(II)V")
	private void method5495(@OriginalArg(1) int arg0) {
		this.aClass62_Sub3_28.anInt4629 -= arg0;
		this.aClass62_Sub3_28.anInt4629 += this.method5496();
	}

	@OriginalMember(owner = "client!aba", name = "c", descriptor = "(B)I")
	private int method5496() {
		@Pc(18) int local18 = this.aClass62_Sub3_28.method4005(this.anInt6703) * this.anInt6704;
		return this.aBoolean474 ? local18 * 4 / 3 : local18;
	}

	@OriginalMember(owner = "client!aba", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method5494();
		super.finalize();
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(IZ)V")
	protected final void method5499(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean474) {
			@Pc(11) int local11 = this.method5496();
			this.aBoolean474 = true;
			this.method5503();
			this.method5495(local11);
		}
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(BZ)V")
	public final void method5502(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean475) {
			this.aBoolean475 = arg0;
			this.method5503();
		}
	}

	@OriginalMember(owner = "client!aba", name = "d", descriptor = "(I)V")
	private void method5503() {
		this.aClass62_Sub3_28.method4007(this);
		if (this.aBoolean475) {
			OpenGL.glTexParameteri(this.anInt6708, 10241, this.aBoolean474 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt6708, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt6708, 10241, this.aBoolean474 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt6708, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)V")
	public abstract void method5490();
}
