import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public abstract class Class39 implements Interface4 {

	@OriginalMember(owner = "client!qk", name = "f", descriptor = "Z")
	private boolean aBoolean729 = false;

	@OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
	protected final int anInt9934;

	@OriginalMember(owner = "client!qk", name = "q", descriptor = "Lclient!hk;")
	protected final Class16_Sub2 aClass16_Sub2_39;

	@OriginalMember(owner = "client!qk", name = "m", descriptor = "I")
	public final int anInt9936;

	@OriginalMember(owner = "client!qk", name = "r", descriptor = "I")
	private final int anInt9940;

	@OriginalMember(owner = "client!qk", name = "s", descriptor = "Z")
	private boolean aBoolean730;

	@OriginalMember(owner = "client!qk", name = "p", descriptor = "I")
	protected int anInt9939;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lclient!hk;IIIZ)V")
	protected Class39(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt9934 = arg2;
		this.aClass16_Sub2_39 = arg0;
		this.anInt9936 = arg1;
		this.anInt9940 = arg3;
		this.aBoolean730 = arg4;
		OpenGL.glGenTextures(1, Static677.anIntArray670, 0);
		this.anInt9939 = Static677.anIntArray670[0];
		this.method8462(0);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)Z")
	public final boolean method8458() {
		if (!this.aClass16_Sub2_39.aBoolean331) {
			return false;
		}
		@Pc(11) int local11 = this.method8461();
		this.aClass16_Sub2_39.method3620(this);
		OpenGL.glGenerateMipmapEXT(this.anInt9936);
		this.aBoolean730 = true;
		this.method8463();
		this.method8462(local11);
		return true;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZB)V")
	protected final void method8459(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean730 != arg0) {
			@Pc(26) int local26 = this.method8461();
			this.aBoolean730 = true;
			this.method8463();
			this.method8462(local26);
		}
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)I")
	public final int method8460() {
		return this.anInt9939;
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)I")
	private int method8461() {
		@Pc(20) int local20 = this.aClass16_Sub2_39.method3650(this.anInt9934) * this.anInt9940;
		return this.aBoolean730 ? local20 * 4 / 3 : local20;
	}

	@OriginalMember(owner = "client!qk", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method8467();
		super.finalize();
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)V")
	private void method8462(@OriginalArg(0) int arg0) {
		this.aClass16_Sub2_39.anInt4371 -= arg0;
		this.aClass16_Sub2_39.anInt4371 += this.method8461();
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)V")
	private void method8463() {
		this.aClass16_Sub2_39.method3620(this);
		if (this.aBoolean729) {
			OpenGL.glTexParameteri(this.anInt9936, 10241, this.aBoolean730 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt9936, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt9936, 10241, this.aBoolean730 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt9936, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZI)V")
	public final void method8465(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean729) {
			this.aBoolean729 = arg0;
			this.method8463();
		}
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(B)V")
	public final void method8467() {
		if (this.anInt9939 > 0) {
			this.aClass16_Sub2_39.method3662(this.anInt9939, this.method8461());
			this.anInt9939 = 0;
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
	public abstract void method8457();
}
