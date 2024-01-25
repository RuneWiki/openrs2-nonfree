import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public abstract class Class81 implements Interface1 {

	@OriginalMember(owner = "client!q", name = "d", descriptor = "Z")
	private boolean aBoolean495 = false;

	@OriginalMember(owner = "client!q", name = "g", descriptor = "Lclient!cg;")
	protected final Class37_Sub1 aClass37_Sub1_34;

	@OriginalMember(owner = "client!q", name = "c", descriptor = "I")
	public final int anInt5610;

	@OriginalMember(owner = "client!q", name = "b", descriptor = "I")
	protected final int anInt5609;

	@OriginalMember(owner = "client!q", name = "h", descriptor = "Z")
	private boolean aBoolean496;

	@OriginalMember(owner = "client!q", name = "e", descriptor = "I")
	private final int anInt5611;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "I")
	protected int anInt5608;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lclient!cg;IIIZ)V")
	protected Class81(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass37_Sub1_34 = arg0;
		this.anInt5610 = arg1;
		this.anInt5609 = arg2;
		this.aBoolean496 = arg4;
		this.anInt5611 = arg3;
		this.aClass37_Sub1_34.anOpengl1.glGenTextures(1, Static259.anIntArray433, 0);
		this.anInt5608 = Static259.anIntArray433[0];
		this.method4736(0);
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "()V")
	private void method4732() {
		@Pc(3) opengl local3 = this.aClass37_Sub1_34.anOpengl1;
		this.aClass37_Sub1_34.method767(this);
		if (this.aBoolean495) {
			local3.glTexParameteri(this.anInt5610, 10241, this.aBoolean496 ? 9987 : 9729);
			local3.glTexParameteri(this.anInt5610, 10240, 9729);
		} else {
			local3.glTexParameteri(this.anInt5610, 10241, this.aBoolean496 ? 9984 : 9728);
			local3.glTexParameteri(this.anInt5610, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "()Z")
	public final boolean method4735() {
		@Pc(3) opengl local3 = this.aClass37_Sub1_34.anOpengl1;
		if (!this.aClass37_Sub1_34.aBoolean77) {
			return false;
		}
		@Pc(10) int local10 = this.method4739();
		this.aClass37_Sub1_34.method767(this);
		local3.glGenerateMipmapEXT(this.anInt5610);
		this.aBoolean496 = true;
		this.method4732();
		this.method4736(local10);
		return true;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
	private void method4736(@OriginalArg(0) int arg0) {
		this.aClass37_Sub1_34.anInt636 -= arg0;
		this.aClass37_Sub1_34.anInt636 += this.method4739();
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V")
	public final void method4737(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean495 != arg0) {
			this.aBoolean495 = arg0;
			this.method4732();
		}
	}

	@OriginalMember(owner = "client!q", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method4738();
		super.finalize();
	}

	@OriginalMember(owner = "client!q", name = "d", descriptor = "()V")
	public final void method4738() {
		if (this.anInt5608 > 0) {
			this.aClass37_Sub1_34.method736(this.anInt5608, this.method4739());
			this.anInt5608 = 0;
		}
	}

	@OriginalMember(owner = "client!q", name = "e", descriptor = "()I")
	private int method4739() {
		@Pc(8) int local8 = this.aClass37_Sub1_34.method801(this.anInt5609) * this.anInt5611;
		return this.aBoolean496 ? local8 * 4 / 3 : local8;
	}

	@OriginalMember(owner = "client!q", name = "f", descriptor = "()I")
	public final int method4740() {
		return this.anInt5608;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(Z)V")
	protected final void method4742(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean496 != arg0) {
			@Pc(6) int local6 = this.method4739();
			this.aBoolean496 = true;
			this.method4732();
			this.method4736(local6);
		}
	}
}
