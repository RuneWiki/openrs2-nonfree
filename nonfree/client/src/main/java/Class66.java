import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public abstract class Class66 implements Interface2 {

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "Z")
	private boolean aBoolean271 = false;

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "Lclient!se;")
	protected final Class122_Sub2 aClass122_Sub2_35;

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
	public final int anInt4752;

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
	protected final int anInt4753;

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "Z")
	private boolean aBoolean272;

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
	private final int anInt4754;

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
	protected int anInt4751;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lclient!se;IIIZ)V")
	protected Class66(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass122_Sub2_35 = arg0;
		this.anInt4752 = arg1;
		this.anInt4753 = arg2;
		this.aBoolean272 = arg4;
		this.anInt4754 = arg3;
		this.aClass122_Sub2_35.anOpengl2.glGenTextures(1, Static101.anIntArray379, 0);
		this.anInt4751 = Static101.anIntArray379[0];
		this.method4038(0);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	private void method4038(@OriginalArg(0) int arg0) {
		this.aClass122_Sub2_35.anInt5615 -= arg0;
		this.aClass122_Sub2_35.anInt5615 += this.method4041();
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "()I")
	public final int method4040() {
		return this.anInt4751;
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "()I")
	private int method4041() {
		@Pc(8) int local8 = this.aClass122_Sub2_35.method4839(this.anInt4753) * this.anInt4754;
		return this.aBoolean272 ? local8 * 4 / 3 : local8;
	}

	@OriginalMember(owner = "client!gd", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method4050();
		super.finalize();
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "()V")
	private void method4042() {
		@Pc(3) opengl local3 = this.aClass122_Sub2_35.anOpengl2;
		this.aClass122_Sub2_35.method4864(this);
		if (this.aBoolean271) {
			local3.glTexParameteri(this.anInt4752, 10241, this.aBoolean272 ? 9987 : 9729);
			local3.glTexParameteri(this.anInt4752, 10240, 9729);
		} else {
			local3.glTexParameteri(this.anInt4752, 10241, this.aBoolean272 ? 9984 : 9728);
			local3.glTexParameteri(this.anInt4752, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V")
	public final void method4044(@OriginalArg(0) boolean arg0) {
		this.aBoolean271 = arg0;
		this.method4042();
	}

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "()Z")
	public final boolean method4045() {
		@Pc(3) opengl local3 = this.aClass122_Sub2_35.anOpengl2;
		if (!this.aClass122_Sub2_35.aBoolean355) {
			return false;
		}
		@Pc(10) int local10 = this.method4041();
		this.aClass122_Sub2_35.method4864(this);
		local3.glGenerateMipmapEXT(this.anInt4752);
		this.aBoolean272 = true;
		this.method4042();
		this.method4038(local10);
		return true;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(Z)V")
	protected final void method4047(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean272 != arg0) {
			@Pc(6) int local6 = this.method4041();
			this.aBoolean272 = true;
			this.method4042();
			this.method4038(local6);
		}
	}

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "()V")
	public final void method4050() {
		if (this.anInt4751 > 0) {
			this.aClass122_Sub2_35.method4881(this.anInt4751, this.method4041());
			this.anInt4751 = 0;
		}
	}
}
