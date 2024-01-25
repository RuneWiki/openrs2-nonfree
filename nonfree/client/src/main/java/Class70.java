import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public abstract class Class70 implements Interface8 {

	@OriginalMember(owner = "client!na", name = "h", descriptor = "Z")
	private boolean aBoolean201 = false;

	@OriginalMember(owner = "client!na", name = "b", descriptor = "Lclient!ql;")
	protected final Class92_Sub2 aClass92_Sub2_15;

	@OriginalMember(owner = "client!na", name = "d", descriptor = "I")
	public final int anInt2351;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "I")
	protected final int anInt2349;

	@OriginalMember(owner = "client!na", name = "g", descriptor = "Z")
	private boolean aBoolean200;

	@OriginalMember(owner = "client!na", name = "c", descriptor = "I")
	private final int anInt2350;

	@OriginalMember(owner = "client!na", name = "f", descriptor = "I")
	protected int anInt2352;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lclient!ql;IIIZ)V")
	protected Class70(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass92_Sub2_15 = arg0;
		this.anInt2351 = arg1;
		this.anInt2349 = arg2;
		this.aBoolean200 = arg4;
		this.anInt2350 = arg3;
		this.aClass92_Sub2_15.anOpengl2.glGenTextures(1, Static201.anIntArray233, 0);
		this.anInt2352 = Static201.anIntArray233[0];
		this.method1985(0);
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "()I")
	public final int method1977() {
		return this.anInt2352;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)V")
	protected final void method1980(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean200 != arg0) {
			@Pc(6) int local6 = this.method1983();
			this.aBoolean200 = true;
			this.method1987();
			this.method1985(local6);
		}
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "()V")
	public final void method1981() {
		if (this.anInt2352 > 0) {
			this.aClass92_Sub2_15.method4577(this.anInt2352, this.method1983());
			this.anInt2352 = 0;
		}
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "()I")
	private int method1983() {
		@Pc(8) int local8 = this.aClass92_Sub2_15.method4592(this.anInt2349) * this.anInt2350;
		return this.aBoolean200 ? local8 * 4 / 3 : local8;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
	private void method1985(@OriginalArg(0) int arg0) {
		this.aClass92_Sub2_15.anInt5378 -= arg0;
		this.aClass92_Sub2_15.anInt5378 += this.method1983();
	}

	@OriginalMember(owner = "client!na", name = "e", descriptor = "()Z")
	public final boolean method1986() {
		@Pc(3) opengl local3 = this.aClass92_Sub2_15.anOpengl2;
		if (!this.aClass92_Sub2_15.aBoolean464) {
			return false;
		}
		@Pc(10) int local10 = this.method1983();
		this.aClass92_Sub2_15.method4548(this);
		local3.glGenerateMipmapEXT(this.anInt2351);
		this.aBoolean200 = true;
		this.method1987();
		this.method1985(local10);
		return true;
	}

	@OriginalMember(owner = "client!na", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method1981();
		super.finalize();
	}

	@OriginalMember(owner = "client!na", name = "f", descriptor = "()V")
	private void method1987() {
		@Pc(3) opengl local3 = this.aClass92_Sub2_15.anOpengl2;
		this.aClass92_Sub2_15.method4548(this);
		if (this.aBoolean201) {
			local3.glTexParameteri(this.anInt2351, 10241, this.aBoolean200 ? 9987 : 9729);
			local3.glTexParameteri(this.anInt2351, 10240, 9729);
		} else {
			local3.glTexParameteri(this.anInt2351, 10241, this.aBoolean200 ? 9984 : 9728);
			local3.glTexParameteri(this.anInt2351, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(Z)V")
	public final void method1989(@OriginalArg(0) boolean arg0) {
		this.aBoolean201 = arg0;
		this.method1987();
	}
}
