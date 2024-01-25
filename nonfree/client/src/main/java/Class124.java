import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public abstract class Class124 implements Interface5 {

	@OriginalMember(owner = "client!lp", name = "e", descriptor = "Z")
	private boolean aBoolean599 = false;

	@OriginalMember(owner = "client!lp", name = "g", descriptor = "Lclient!ao;")
	protected final Class4_Sub1 aClass4_Sub1_41;

	@OriginalMember(owner = "client!lp", name = "h", descriptor = "I")
	public final int anInt6844;

	@OriginalMember(owner = "client!lp", name = "f", descriptor = "I")
	protected final int anInt6843;

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "Z")
	private boolean aBoolean598;

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
	private final int anInt6841;

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "I")
	protected int anInt6842;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lclient!ao;IIIZ)V")
	protected Class124(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass4_Sub1_41 = arg0;
		this.anInt6844 = arg1;
		this.anInt6843 = arg2;
		this.aBoolean598 = arg4;
		this.anInt6841 = arg3;
		this.aClass4_Sub1_41.anOpengl1.glGenTextures(1, Static190.anIntArray507, 0);
		this.anInt6842 = Static190.anIntArray507[0];
		this.method5895(0);
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)V")
	private void method5895(@OriginalArg(0) int arg0) {
		this.aClass4_Sub1_41.anInt315 -= arg0;
		this.aClass4_Sub1_41.anInt315 += this.method5900();
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Z)V")
	public final void method5896(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean599 != arg0) {
			this.aBoolean599 = arg0;
			this.method5897();
		}
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "()V")
	private void method5897() {
		@Pc(3) opengl local3 = this.aClass4_Sub1_41.anOpengl1;
		this.aClass4_Sub1_41.method602(this);
		if (this.aBoolean599) {
			local3.glTexParameteri(this.anInt6844, 10241, this.aBoolean598 ? 9987 : 9729);
			local3.glTexParameteri(this.anInt6844, 10240, 9729);
		} else {
			local3.glTexParameteri(this.anInt6844, 10241, this.aBoolean598 ? 9984 : 9728);
			local3.glTexParameteri(this.anInt6844, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "()V")
	public final void method5898() {
		if (this.anInt6842 > 0) {
			this.aClass4_Sub1_41.method542(this.anInt6842, this.method5900());
			this.anInt6842 = 0;
		}
	}

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "()I")
	private int method5900() {
		@Pc(8) int local8 = this.aClass4_Sub1_41.method605(this.anInt6843) * this.anInt6841;
		return this.aBoolean598 ? local8 * 4 / 3 : local8;
	}

	@OriginalMember(owner = "client!lp", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method5898();
		super.finalize();
	}

	@OriginalMember(owner = "client!lp", name = "e", descriptor = "()Z")
	public final boolean method5901() {
		@Pc(3) opengl local3 = this.aClass4_Sub1_41.anOpengl1;
		if (!this.aClass4_Sub1_41.aBoolean45) {
			return false;
		}
		@Pc(10) int local10 = this.method5900();
		this.aClass4_Sub1_41.method602(this);
		local3.glGenerateMipmapEXT(this.anInt6844);
		this.aBoolean598 = true;
		this.method5897();
		this.method5895(local10);
		return true;
	}

	@OriginalMember(owner = "client!lp", name = "f", descriptor = "()I")
	public final int method5902() {
		return this.anInt6842;
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(Z)V")
	protected final void method5904(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean598 != arg0) {
			@Pc(6) int local6 = this.method5900();
			this.aBoolean598 = true;
			this.method5897();
			this.method5895(local6);
		}
	}
}
