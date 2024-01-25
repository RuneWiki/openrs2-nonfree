import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iia")
public abstract class Class88 implements Interface1 {

	@OriginalMember(owner = "client!iia", name = "e", descriptor = "Z")
	private boolean aBoolean623 = false;

	@OriginalMember(owner = "client!iia", name = "b", descriptor = "I")
	protected final int anInt8313;

	@OriginalMember(owner = "client!iia", name = "s", descriptor = "Z")
	private boolean aBoolean624;

	@OriginalMember(owner = "client!iia", name = "g", descriptor = "I")
	public final int anInt8317;

	@OriginalMember(owner = "client!iia", name = "n", descriptor = "I")
	private final int anInt8323;

	@OriginalMember(owner = "client!iia", name = "k", descriptor = "Lclient!oea;")
	protected final Class87_Sub2 aClass87_Sub2_32;

	@OriginalMember(owner = "client!iia", name = "h", descriptor = "I")
	protected int anInt8318;

	@OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(Lclient!oea;IIIZ)V")
	protected Class88(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt8313 = arg2;
		this.aBoolean624 = arg4;
		this.anInt8317 = arg1;
		this.anInt8323 = arg3;
		this.aClass87_Sub2_32 = arg0;
		OpenGL.glGenTextures(1, Static199.anIntArray287, 0);
		this.anInt8318 = Static199.anIntArray287[0];
		this.method6985(0);
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(ZB)V")
	public final void method6981(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean623) {
			this.aBoolean623 = arg0;
			this.method6982();
		}
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(B)V")
	private void method6982() {
		this.aClass87_Sub2_32.method6167(this);
		if (this.aBoolean623) {
			OpenGL.glTexParameteri(this.anInt8317, 10241, this.aBoolean624 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt8317, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt8317, 10241, this.aBoolean624 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt8317, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!iia", name = "b", descriptor = "(I)Z")
	public final boolean method6983() {
		if (!this.aClass87_Sub2_32.aBoolean546) {
			return false;
		}
		@Pc(18) int local18 = this.method6987();
		this.aClass87_Sub2_32.method6167(this);
		OpenGL.glGenerateMipmapEXT(this.anInt8317);
		this.aBoolean624 = true;
		this.method6982();
		this.method6985(local18);
		return true;
	}

	@OriginalMember(owner = "client!iia", name = "b", descriptor = "(B)V")
	public final void method6984() {
		if (this.anInt8318 > 0) {
			this.aClass87_Sub2_32.method6150(this.anInt8318, this.method6987());
			this.anInt8318 = 0;
		}
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(II)V")
	private void method6985(@OriginalArg(1) int arg0) {
		this.aClass87_Sub2_32.anInt7372 -= arg0;
		this.aClass87_Sub2_32.anInt7372 += this.method6987();
	}

	@OriginalMember(owner = "client!iia", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method6984();
		super.finalize();
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(IZ)V")
	protected final void method6986(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean624 != arg0) {
			@Pc(17) int local17 = this.method6987();
			this.aBoolean624 = true;
			this.method6982();
			this.method6985(local17);
		}
	}

	@OriginalMember(owner = "client!iia", name = "c", descriptor = "(I)I")
	private int method6987() {
		@Pc(20) int local20 = this.aClass87_Sub2_32.method6183(this.anInt8313) * this.anInt8323;
		return this.aBoolean624 ? local20 * 4 / 3 : local20;
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(Z)I")
	public final int method6989() {
		return this.anInt8318;
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(I)V")
	public abstract void method6980();
}
