import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public abstract class Class30 implements Interface1 {

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "Z")
	private boolean aBoolean403 = false;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "Lclient!mi;")
	protected final Class155_Sub1 aClass155_Sub1_35;

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
	public final int anInt5155;

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
	protected final int anInt5154;

	@OriginalMember(owner = "client!bl", name = "g", descriptor = "Z")
	private boolean aBoolean404;

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
	private final int anInt5153;

	@OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
	protected int anInt5156;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lclient!mi;IIIZ)V")
	protected Class30(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass155_Sub1_35 = arg0;
		this.anInt5155 = arg1;
		this.anInt5154 = arg2;
		this.aBoolean404 = arg4;
		this.anInt5153 = arg3;
		this.aClass155_Sub1_35.anOpengl1.glGenTextures(1, Static31.anIntArray571, 0);
		this.anInt5156 = Static31.anIntArray571[0];
		this.method4600(0);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
	private void method4600(@OriginalArg(0) int arg0) {
		this.aClass155_Sub1_35.anInt3847 -= arg0;
		this.aClass155_Sub1_35.anInt3847 += this.method4608();
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "()Z")
	public final boolean method4602() {
		@Pc(3) opengl local3 = this.aClass155_Sub1_35.anOpengl1;
		if (!this.aClass155_Sub1_35.aBoolean314) {
			return false;
		}
		@Pc(10) int local10 = this.method4608();
		this.aClass155_Sub1_35.method3585(this);
		local3.glGenerateMipmapEXT(this.anInt5155);
		this.aBoolean404 = true;
		this.method4604();
		this.method4600(local10);
		return true;
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "()V")
	private void method4604() {
		@Pc(3) opengl local3 = this.aClass155_Sub1_35.anOpengl1;
		this.aClass155_Sub1_35.method3585(this);
		if (this.aBoolean403) {
			local3.glTexParameteri(this.anInt5155, 10241, this.aBoolean404 ? 9987 : 9729);
			local3.glTexParameteri(this.anInt5155, 10240, 9729);
		} else {
			local3.glTexParameteri(this.anInt5155, 10241, this.aBoolean404 ? 9984 : 9728);
			local3.glTexParameteri(this.anInt5155, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!bl", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method4609();
		super.finalize();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)V")
	public final void method4607(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean403 != arg0) {
			this.aBoolean403 = arg0;
			this.method4604();
		}
	}

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "()I")
	private int method4608() {
		@Pc(8) int local8 = this.aClass155_Sub1_35.method3577(this.anInt5154) * this.anInt5153;
		return this.aBoolean404 ? local8 * 4 / 3 : local8;
	}

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "()V")
	public final void method4609() {
		if (this.anInt5156 > 0) {
			this.aClass155_Sub1_35.method3596(this.anInt5156, this.method4608());
			this.anInt5156 = 0;
		}
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(Z)V")
	protected final void method4610(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean404 != arg0) {
			@Pc(6) int local6 = this.method4608();
			this.aBoolean404 = true;
			this.method4604();
			this.method4600(local6);
		}
	}

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "()I")
	public final int method4612() {
		return this.anInt5156;
	}
}
