import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public abstract class Class55 implements Interface9 {

	@OriginalMember(owner = "client!mk", name = "r", descriptor = "Z")
	private boolean aBoolean469 = false;

	@OriginalMember(owner = "client!mk", name = "f", descriptor = "I")
	protected final int anInt7029;

	@OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
	public final int anInt7037;

	@OriginalMember(owner = "client!mk", name = "m", descriptor = "Lclient!ef;")
	protected final Class49_Sub2 aClass49_Sub2_42;

	@OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
	private final int anInt7033;

	@OriginalMember(owner = "client!mk", name = "q", descriptor = "Z")
	private boolean aBoolean468;

	@OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
	protected int anInt7034;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lclient!ef;IIIZ)V")
	protected Class55(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7029 = arg2;
		this.anInt7037 = arg1;
		this.aClass49_Sub2_42 = arg0;
		this.anInt7033 = arg3;
		this.aBoolean468 = arg4;
		OpenGL.glGenTextures(1, Static211.anIntArray357, 0);
		this.anInt7034 = Static211.anIntArray357[0];
		this.method5555(0);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(BZ)V")
	public final void method5553(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean469) {
			this.aBoolean469 = arg0;
			this.method5556();
		}
	}

	@OriginalMember(owner = "client!mk", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method5559();
		super.finalize();
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)Z")
	public final boolean method5554() {
		if (!this.aClass49_Sub2_42.aBoolean117) {
			return false;
		}
		@Pc(11) int local11 = this.method5561();
		this.aClass49_Sub2_42.method1646(this);
		OpenGL.glGenerateMipmapEXT(this.anInt7037);
		this.aBoolean468 = true;
		this.method5556();
		this.method5555(local11);
		return true;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IB)V")
	private void method5555(@OriginalArg(0) int arg0) {
		this.aClass49_Sub2_42.anInt2008 -= arg0;
		this.aClass49_Sub2_42.anInt2008 += this.method5561();
	}

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "(I)V")
	private void method5556() {
		this.aClass49_Sub2_42.method1646(this);
		if (this.aBoolean469) {
			OpenGL.glTexParameteri(this.anInt7037, 10241, this.aBoolean468 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt7037, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt7037, 10241, this.aBoolean468 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt7037, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "(I)I")
	public final int method5558() {
		return this.anInt7034;
	}

	@OriginalMember(owner = "client!mk", name = "e", descriptor = "(I)V")
	public final void method5559() {
		if (this.anInt7034 > 0) {
			this.aClass49_Sub2_42.method1603(this.anInt7034, this.method5561());
			this.anInt7034 = 0;
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZI)V")
	protected final void method5560(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean468) {
			@Pc(17) int local17 = this.method5561();
			this.aBoolean468 = true;
			this.method5556();
			this.method5555(local17);
		}
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(B)I")
	private int method5561() {
		@Pc(21) int local21 = this.aClass49_Sub2_42.method1606(this.anInt7029) * this.anInt7033;
		return this.aBoolean468 ? local21 * 4 / 3 : local21;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V")
	public abstract void method5551();
}
