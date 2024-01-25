import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public abstract class Class7 implements Interface5 {

	@OriginalMember(owner = "client!et", name = "c", descriptor = "Z")
	private boolean aBoolean426 = false;

	@OriginalMember(owner = "client!et", name = "h", descriptor = "Lclient!qi;")
	protected final Class82_Sub2 aClass82_Sub2_33;

	@OriginalMember(owner = "client!et", name = "d", descriptor = "I")
	public final int anInt5432;

	@OriginalMember(owner = "client!et", name = "e", descriptor = "I")
	protected final int anInt5433;

	@OriginalMember(owner = "client!et", name = "g", descriptor = "Z")
	private boolean aBoolean427;

	@OriginalMember(owner = "client!et", name = "b", descriptor = "I")
	private final int anInt5431;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "I")
	protected int anInt5430;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lclient!qi;IIIZ)V")
	protected Class7(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass82_Sub2_33 = arg0;
		this.anInt5432 = arg1;
		this.anInt5433 = arg2;
		this.aBoolean427 = arg4;
		this.anInt5431 = arg3;
		this.aClass82_Sub2_33.anOpengl2.glGenTextures(1, Static87.anIntArray661, 0);
		this.anInt5430 = Static87.anIntArray661[0];
		this.method4739(0);
	}

	@OriginalMember(owner = "client!et", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method4732();
		super.finalize();
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "()V")
	public final void method4732() {
		if (this.anInt5430 > 0) {
			this.aClass82_Sub2_33.method4587(this.anInt5430, this.method4742());
			this.anInt5430 = 0;
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Z)V")
	public final void method4734(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean426 != arg0) {
			this.aBoolean426 = arg0;
			this.method4744();
		}
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "()Z")
	public final boolean method4735() {
		@Pc(3) opengl local3 = this.aClass82_Sub2_33.anOpengl2;
		if (!this.aClass82_Sub2_33.aBoolean406) {
			return false;
		}
		@Pc(10) int local10 = this.method4742();
		this.aClass82_Sub2_33.method4614(this);
		local3.glGenerateMipmapEXT(this.anInt5432);
		this.aBoolean427 = true;
		this.method4744();
		this.method4739(local10);
		return true;
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(I)V")
	private void method4739(@OriginalArg(0) int arg0) {
		this.aClass82_Sub2_33.anInt5199 -= arg0;
		this.aClass82_Sub2_33.anInt5199 += this.method4742();
	}

	@OriginalMember(owner = "client!et", name = "d", descriptor = "()I")
	public final int method4741() {
		return this.anInt5430;
	}

	@OriginalMember(owner = "client!et", name = "e", descriptor = "()I")
	private int method4742() {
		@Pc(8) int local8 = this.aClass82_Sub2_33.method4577(this.anInt5433) * this.anInt5431;
		return this.aBoolean427 ? local8 * 4 / 3 : local8;
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(Z)V")
	protected final void method4743(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean427 != arg0) {
			@Pc(6) int local6 = this.method4742();
			this.aBoolean427 = true;
			this.method4744();
			this.method4739(local6);
		}
	}

	@OriginalMember(owner = "client!et", name = "f", descriptor = "()V")
	private void method4744() {
		@Pc(3) opengl local3 = this.aClass82_Sub2_33.anOpengl2;
		this.aClass82_Sub2_33.method4614(this);
		if (this.aBoolean426) {
			local3.glTexParameteri(this.anInt5432, 10241, this.aBoolean427 ? 9987 : 9729);
			local3.glTexParameteri(this.anInt5432, 10240, 9729);
		} else {
			local3.glTexParameteri(this.anInt5432, 10241, this.aBoolean427 ? 9984 : 9728);
			local3.glTexParameteri(this.anInt5432, 10240, 9728);
		}
	}
}
