import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wu")
public abstract class Class94 implements Interface9 {

	@OriginalMember(owner = "client!wu", name = "h", descriptor = "Z")
	private boolean aBoolean341 = false;

	@OriginalMember(owner = "client!wu", name = "d", descriptor = "I")
	public final int anInt4672;

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "Lclient!dw;")
	protected final Class82_Sub1 aClass82_Sub1_25;

	@OriginalMember(owner = "client!wu", name = "w", descriptor = "Z")
	private boolean aBoolean342;

	@OriginalMember(owner = "client!wu", name = "m", descriptor = "I")
	protected final int anInt4680;

	@OriginalMember(owner = "client!wu", name = "r", descriptor = "I")
	private final int anInt4684;

	@OriginalMember(owner = "client!wu", name = "u", descriptor = "I")
	protected int anInt4686;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Lclient!dw;IIIZ)V")
	protected Class94(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4672 = arg1;
		this.aClass82_Sub1_25 = arg0;
		this.aBoolean342 = arg4;
		this.anInt4680 = arg2;
		this.anInt4684 = arg3;
		OpenGL.glGenTextures(1, Static615.anIntArray637, 0);
		this.anInt4686 = Static615.anIntArray637[0];
		this.method4013(0);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZZ)V")
	protected final void method4005(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean342) {
			@Pc(21) int local21 = this.method4010();
			this.aBoolean342 = true;
			this.method4007();
			this.method4013(local21);
		}
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(I)I")
	public final int method4006() {
		return this.anInt4686;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)V")
	private void method4007() {
		this.aClass82_Sub1_25.method2029(this);
		if (this.aBoolean341) {
			OpenGL.glTexParameteri(this.anInt4672, 10241, this.aBoolean342 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt4672, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt4672, 10241, this.aBoolean342 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt4672, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "(I)V")
	public final void method4008() {
		if (this.anInt4686 > 0) {
			this.aClass82_Sub1_25.method2023(this.anInt4686, this.method4010());
			this.anInt4686 = 0;
		}
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(B)I")
	private int method4010() {
		@Pc(13) int local13 = this.aClass82_Sub1_25.method2025(this.anInt4680) * this.anInt4684;
		return this.aBoolean342 ? local13 * 4 / 3 : local13;
	}

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "(I)Z")
	public final boolean method4011() {
		if (!this.aClass82_Sub1_25.aBoolean185) {
			return false;
		}
		@Pc(11) int local11 = this.method4010();
		this.aClass82_Sub1_25.method2029(this);
		OpenGL.glGenerateMipmapEXT(this.anInt4672);
		this.aBoolean342 = true;
		this.method4007();
		this.method4013(local11);
		return true;
	}

	@OriginalMember(owner = "client!wu", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method4008();
		super.finalize();
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IZ)V")
	public final void method4012(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean341 != arg0) {
			this.aBoolean341 = arg0;
			this.method4007();
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)V")
	private void method4013(@OriginalArg(0) int arg0) {
		this.aClass82_Sub1_25.anInt2470 -= arg0;
		this.aClass82_Sub1_25.anInt2470 += this.method4010();
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)V")
	public abstract void method4004();
}
