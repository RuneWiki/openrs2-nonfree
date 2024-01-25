import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public abstract class Class19 implements Interface9 {

	@OriginalMember(owner = "client!vo", name = "h", descriptor = "Z")
	private boolean aBoolean349 = false;

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "Lclient!ks;")
	protected final Class63_Sub1 aClass63_Sub1_32;

	@OriginalMember(owner = "client!vo", name = "g", descriptor = "I")
	public final int anInt4603;

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "I")
	protected final int anInt4601;

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "Z")
	private boolean aBoolean348;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "I")
	private final int anInt4600;

	@OriginalMember(owner = "client!vo", name = "f", descriptor = "I")
	protected int anInt4602;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lclient!ks;IIIZ)V")
	protected Class19(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass63_Sub1_32 = arg0;
		this.anInt4603 = arg1;
		this.anInt4601 = arg2;
		this.aBoolean348 = arg4;
		this.anInt4600 = arg3;
		this.aClass63_Sub1_32.anOpengl1.glGenTextures(1, Static347.anIntArray377, 0);
		this.anInt4602 = Static347.anIntArray377[0];
		this.method4235(0);
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "()V")
	public final void method4234() {
		if (this.anInt4602 > 0) {
			this.aClass63_Sub1_32.method3379(this.anInt4602, this.method4240());
			this.anInt4602 = 0;
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V")
	private void method4235(@OriginalArg(0) int arg0) {
		this.aClass63_Sub1_32.anInt3595 -= arg0;
		this.aClass63_Sub1_32.anInt3595 += this.method4240();
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Z)V")
	public final void method4238(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean349 != arg0) {
			this.aBoolean349 = arg0;
			this.method4241();
		}
	}

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "()I")
	private int method4240() {
		@Pc(8) int local8 = this.aClass63_Sub1_32.method3396(this.anInt4601) * this.anInt4600;
		return this.aBoolean348 ? local8 * 4 / 3 : local8;
	}

	@OriginalMember(owner = "client!vo", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method4234();
		super.finalize();
	}

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "()V")
	private void method4241() {
		@Pc(3) opengl local3 = this.aClass63_Sub1_32.anOpengl1;
		this.aClass63_Sub1_32.method3355(this);
		if (this.aBoolean349) {
			local3.glTexParameteri(this.anInt4603, 10241, this.aBoolean348 ? 9987 : 9729);
			local3.glTexParameteri(this.anInt4603, 10240, 9729);
		} else {
			local3.glTexParameteri(this.anInt4603, 10241, this.aBoolean348 ? 9984 : 9728);
			local3.glTexParameteri(this.anInt4603, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "()I")
	public final int method4242() {
		return this.anInt4602;
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(Z)V")
	protected final void method4243(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean348 != arg0) {
			@Pc(6) int local6 = this.method4240();
			this.aBoolean348 = true;
			this.method4241();
			this.method4235(local6);
		}
	}

	@OriginalMember(owner = "client!vo", name = "f", descriptor = "()Z")
	public final boolean method4246() {
		@Pc(3) opengl local3 = this.aClass63_Sub1_32.anOpengl1;
		if (!this.aClass63_Sub1_32.aBoolean254) {
			return false;
		}
		@Pc(10) int local10 = this.method4240();
		this.aClass63_Sub1_32.method3355(this);
		local3.glGenerateMipmapEXT(this.anInt4603);
		this.aBoolean348 = true;
		this.method4241();
		this.method4235(local10);
		return true;
	}
}
