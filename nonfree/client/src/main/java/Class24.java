import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iga")
public abstract class Class24 implements Interface6 {

	@OriginalMember(owner = "client!iga", name = "o", descriptor = "Z")
	private boolean aBoolean635 = false;

	@OriginalMember(owner = "client!iga", name = "j", descriptor = "Z")
	private boolean aBoolean634;

	@OriginalMember(owner = "client!iga", name = "e", descriptor = "I")
	public final int anInt7702;

	@OriginalMember(owner = "client!iga", name = "n", descriptor = "Lclient!rda;")
	protected final Class126_Sub3 aClass126_Sub3_30;

	@OriginalMember(owner = "client!iga", name = "g", descriptor = "I")
	private final int anInt7704;

	@OriginalMember(owner = "client!iga", name = "t", descriptor = "I")
	protected final int anInt7714;

	@OriginalMember(owner = "client!iga", name = "p", descriptor = "I")
	protected int anInt7710;

	@OriginalMember(owner = "client!iga", name = "<init>", descriptor = "(Lclient!rda;IIIZ)V")
	protected Class24(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean634 = arg4;
		this.anInt7702 = arg1;
		this.aClass126_Sub3_30 = arg0;
		this.anInt7704 = arg3;
		this.anInt7714 = arg2;
		OpenGL.glGenTextures(1, Static430.anIntArray586, 0);
		this.anInt7710 = Static430.anIntArray586[0];
		this.method6779(0);
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(I)I")
	private int method6777() {
		@Pc(19) int local19 = this.aClass126_Sub3_30.method7122(this.anInt7714) * this.anInt7704;
		return this.aBoolean634 ? local19 * 4 / 3 : local19;
	}

	@OriginalMember(owner = "client!iga", name = "b", descriptor = "(I)I")
	public final int method6778() {
		return this.anInt7710;
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(II)V")
	private void method6779(@OriginalArg(1) int arg0) {
		this.aClass126_Sub3_30.anInt8279 -= arg0;
		this.aClass126_Sub3_30.anInt8279 += this.method6777();
	}

	@OriginalMember(owner = "client!iga", name = "b", descriptor = "(B)V")
	private void method6781() {
		this.aClass126_Sub3_30.method7113(this);
		if (this.aBoolean635) {
			OpenGL.glTexParameteri(this.anInt7702, 10241, this.aBoolean634 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt7702, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt7702, 10241, this.aBoolean634 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt7702, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(ZI)V")
	protected final void method6782(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean634 != arg0) {
			@Pc(17) int local17 = this.method6777();
			this.aBoolean634 = true;
			this.method6781();
			this.method6779(local17);
		}
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(ZZ)V")
	public final void method6783(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean635 != arg0) {
			this.aBoolean635 = arg0;
			this.method6781();
		}
	}

	@OriginalMember(owner = "client!iga", name = "c", descriptor = "(B)Z")
	public final boolean method6784() {
		if (!this.aClass126_Sub3_30.aBoolean666) {
			return false;
		}
		@Pc(18) int local18 = this.method6777();
		this.aClass126_Sub3_30.method7113(this);
		OpenGL.glGenerateMipmapEXT(this.anInt7702);
		this.aBoolean634 = true;
		this.method6781();
		this.method6779(local18);
		return true;
	}

	@OriginalMember(owner = "client!iga", name = "c", descriptor = "(I)V")
	public final void method6786() {
		if (this.anInt7710 > 0) {
			this.aClass126_Sub3_30.method7120(this.anInt7710, this.method6777());
			this.anInt7710 = 0;
		}
	}

	@OriginalMember(owner = "client!iga", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method6786();
		super.finalize();
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(B)V")
	public abstract void method6776();
}
