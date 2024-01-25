import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vaa")
public abstract class Class3 implements Interface7 {

	@OriginalMember(owner = "client!vaa", name = "j", descriptor = "Z")
	private boolean aBoolean538 = false;

	@OriginalMember(owner = "client!vaa", name = "q", descriptor = "I")
	private final int anInt6729;

	@OriginalMember(owner = "client!vaa", name = "e", descriptor = "Lclient!uca;")
	protected final Class162_Sub3 aClass162_Sub3_33;

	@OriginalMember(owner = "client!vaa", name = "l", descriptor = "I")
	protected final int anInt6725;

	@OriginalMember(owner = "client!vaa", name = "m", descriptor = "I")
	public final int anInt6726;

	@OriginalMember(owner = "client!vaa", name = "o", descriptor = "Z")
	private boolean aBoolean539;

	@OriginalMember(owner = "client!vaa", name = "k", descriptor = "I")
	protected int anInt6724;

	@OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Lclient!uca;IIIZ)V")
	protected Class3(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6729 = arg3;
		this.aClass162_Sub3_33 = arg0;
		this.anInt6725 = arg2;
		this.anInt6726 = arg1;
		this.aBoolean539 = arg4;
		OpenGL.glGenTextures(1, Static387.anIntArray409, 0);
		this.anInt6724 = Static387.anIntArray409[0];
		this.method5574(0);
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Z)I")
	private int method5567() {
		@Pc(13) int local13 = this.aClass162_Sub3_33.method6970(this.anInt6725) * this.anInt6729;
		return this.aBoolean539 ? local13 * 4 / 3 : local13;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IZ)V")
	protected final void method5568(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean539 != arg0) {
			@Pc(19) int local19 = this.method5567();
			this.aBoolean539 = true;
			this.method5572();
			this.method5574(local19);
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)V")
	public final void method5569() {
		if (this.anInt6724 > 0) {
			this.aClass162_Sub3_33.method6920(this.method5567(), this.anInt6724);
			this.anInt6724 = 0;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ZI)V")
	public final void method5571(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean538) {
			this.aBoolean538 = arg0;
			this.method5572();
		}
	}

	@OriginalMember(owner = "client!vaa", name = "c", descriptor = "(I)V")
	private void method5572() {
		this.aClass162_Sub3_33.method6911(this);
		if (this.aBoolean538) {
			OpenGL.glTexParameteri(this.anInt6726, 10241, this.aBoolean539 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt6726, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt6726, 10241, this.aBoolean539 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt6726, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(B)Z")
	public final boolean method5573() {
		if (!this.aClass162_Sub3_33.aBoolean721) {
			return false;
		}
		@Pc(17) int local17 = this.method5567();
		this.aClass162_Sub3_33.method6911(this);
		OpenGL.glGenerateMipmapEXT(this.anInt6726);
		this.aBoolean539 = true;
		this.method5572();
		this.method5574(local17);
		return true;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(II)V")
	private void method5574(@OriginalArg(1) int arg0) {
		this.aClass162_Sub3_33.anInt8691 -= arg0;
		this.aClass162_Sub3_33.anInt8691 += this.method5567();
	}

	@OriginalMember(owner = "client!vaa", name = "d", descriptor = "(I)I")
	public final int method5575() {
		return this.anInt6724;
	}

	@OriginalMember(owner = "client!vaa", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method5569();
		super.finalize();
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(B)V")
	public abstract void method5566();
}
