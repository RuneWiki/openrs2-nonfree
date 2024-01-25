import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public abstract class Class35 implements Interface4 {

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "Z")
	private boolean aBoolean430 = false;

	@OriginalMember(owner = "client!wq", name = "f", descriptor = "I")
	public final int anInt6267;

	@OriginalMember(owner = "client!wq", name = "i", descriptor = "Z")
	private boolean aBoolean431;

	@OriginalMember(owner = "client!wq", name = "p", descriptor = "Lclient!pea;")
	protected final Class121_Sub3 aClass121_Sub3_31;

	@OriginalMember(owner = "client!wq", name = "h", descriptor = "I")
	protected final int anInt6269;

	@OriginalMember(owner = "client!wq", name = "q", descriptor = "I")
	private final int anInt6275;

	@OriginalMember(owner = "client!wq", name = "s", descriptor = "I")
	protected int anInt6277;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lclient!pea;IIIZ)V")
	protected Class35(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6267 = arg1;
		this.aBoolean431 = arg4;
		this.aClass121_Sub3_31 = arg0;
		this.anInt6269 = arg2;
		this.anInt6275 = arg3;
		OpenGL.glGenTextures(1, Static92.anIntArray575, 0);
		this.anInt6277 = Static92.anIntArray575[0];
		this.method5328(0);
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(I)I")
	public final int method5324() {
		return this.anInt6277;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)V")
	public final void method5325() {
		if (this.anInt6277 > 0) {
			this.aClass121_Sub3_31.method5723(this.method5331(), this.anInt6277);
			this.anInt6277 = 0;
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(BZ)V")
	protected final void method5327(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean431 != arg0) {
			@Pc(19) int local19 = this.method5331();
			this.aBoolean431 = true;
			this.method5330();
			this.method5328(local19);
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(II)V")
	private void method5328(@OriginalArg(1) int arg0) {
		this.aClass121_Sub3_31.anInt6805 -= arg0;
		this.aClass121_Sub3_31.anInt6805 += this.method5331();
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IZ)V")
	public final void method5329(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean430 != arg0) {
			this.aBoolean430 = arg0;
			this.method5330();
		}
	}

	@OriginalMember(owner = "client!wq", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method5325();
		super.finalize();
	}

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "(B)V")
	private void method5330() {
		this.aClass121_Sub3_31.method5713(this);
		if (this.aBoolean430) {
			OpenGL.glTexParameteri(this.anInt6267, 10241, this.aBoolean431 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt6267, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt6267, 10241, this.aBoolean431 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt6267, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!wq", name = "d", descriptor = "(B)I")
	private int method5331() {
		@Pc(21) int local21 = this.aClass121_Sub3_31.method5715(this.anInt6269) * this.anInt6275;
		return this.aBoolean431 ? local21 * 4 / 3 : local21;
	}

	@OriginalMember(owner = "client!wq", name = "e", descriptor = "(B)Z")
	public final boolean method5332() {
		if (!this.aClass121_Sub3_31.aBoolean468) {
			return false;
		}
		@Pc(16) int local16 = this.method5331();
		this.aClass121_Sub3_31.method5713(this);
		OpenGL.glGenerateMipmapEXT(this.anInt6267);
		this.aBoolean431 = true;
		this.method5330();
		this.method5328(local16);
		return true;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V")
	public abstract void method5323();
}
