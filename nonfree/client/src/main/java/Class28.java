import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public abstract class Class28 implements Interface1 {

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "Z")
	private boolean aBoolean300 = false;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "Lclient!ge;")
	protected final Class81_Sub1 aClass81_Sub1_26;

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
	public final int anInt4318;

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
	protected final int anInt4319;

	@OriginalMember(owner = "client!mo", name = "h", descriptor = "Z")
	private boolean aBoolean301;

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "I")
	private final int anInt4320;

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
	protected int anInt4317;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lclient!ge;IIIZ)V")
	protected Class28(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass81_Sub1_26 = arg0;
		this.anInt4318 = arg1;
		this.anInt4319 = arg2;
		this.aBoolean301 = arg4;
		this.anInt4320 = arg3;
		this.aClass81_Sub1_26.anOpengl1.glGenTextures(1, Static199.anIntArray488, 0);
		this.anInt4317 = Static199.anIntArray488[0];
		this.method4122(0);
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "()I")
	private int method4116() {
		@Pc(8) int local8 = this.aClass81_Sub1_26.method1969(this.anInt4319) * this.anInt4320;
		return this.aBoolean301 ? local8 * 4 / 3 : local8;
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "()V")
	public final void method4117() {
		if (this.anInt4317 > 0) {
			this.aClass81_Sub1_26.method1985(this.anInt4317, this.method4116());
			this.anInt4317 = 0;
		}
	}

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "()Z")
	public final boolean method4119() {
		@Pc(3) opengl local3 = this.aClass81_Sub1_26.anOpengl1;
		if (!this.aClass81_Sub1_26.aBoolean132) {
			return false;
		}
		@Pc(10) int local10 = this.method4116();
		this.aClass81_Sub1_26.method2022(this);
		local3.glGenerateMipmapEXT(this.anInt4318);
		this.aBoolean301 = true;
		this.method4126();
		this.method4122(local10);
		return true;
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)V")
	private void method4122(@OriginalArg(0) int arg0) {
		this.aClass81_Sub1_26.anInt1806 -= arg0;
		this.aClass81_Sub1_26.anInt1806 += this.method4116();
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)V")
	protected final void method4123(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean301 != arg0) {
			@Pc(6) int local6 = this.method4116();
			this.aBoolean301 = true;
			this.method4126();
			this.method4122(local6);
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(Z)V")
	public final void method4124(@OriginalArg(0) boolean arg0) {
		this.aBoolean300 = arg0;
		this.method4126();
	}

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "()V")
	private void method4126() {
		@Pc(3) opengl local3 = this.aClass81_Sub1_26.anOpengl1;
		this.aClass81_Sub1_26.method2022(this);
		if (this.aBoolean300) {
			local3.glTexParameteri(this.anInt4318, 10241, this.aBoolean301 ? 9987 : 9729);
			local3.glTexParameteri(this.anInt4318, 10240, 9729);
		} else {
			local3.glTexParameteri(this.anInt4318, 10241, this.aBoolean301 ? 9984 : 9728);
			local3.glTexParameteri(this.anInt4318, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "()I")
	public final int method4127() {
		return this.anInt4317;
	}

	@OriginalMember(owner = "client!mo", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method4117();
		super.finalize();
	}
}
