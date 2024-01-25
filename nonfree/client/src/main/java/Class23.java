import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public abstract class Class23 implements Interface10 {

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "Z")
	private boolean aBoolean622 = false;

	@OriginalMember(owner = "client!sv", name = "j", descriptor = "I")
	private final int anInt7157;

	@OriginalMember(owner = "client!sv", name = "s", descriptor = "I")
	public final int anInt7163;

	@OriginalMember(owner = "client!sv", name = "o", descriptor = "Z")
	private boolean aBoolean624;

	@OriginalMember(owner = "client!sv", name = "v", descriptor = "I")
	protected final int anInt7166;

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "Lclient!ih;")
	protected final Class117_Sub1 aClass117_Sub1_42;

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "I")
	protected int anInt7153;

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Lclient!ih;IIIZ)V")
	protected Class23(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7157 = arg3;
		this.anInt7163 = arg1;
		this.aBoolean624 = arg4;
		this.anInt7166 = arg2;
		this.aClass117_Sub1_42 = arg0;
		OpenGL.glGenTextures(1, Static178.anIntArray240, 0);
		this.anInt7153 = Static178.anIntArray240[0];
		this.method5802(0);
	}

	@OriginalMember(owner = "client!sv", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method5800();
		super.finalize();
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(I)I")
	private int method5798() {
		@Pc(21) int local21 = this.aClass117_Sub1_42.method2458(this.anInt7166) * this.anInt7157;
		return this.aBoolean624 ? local21 * 4 / 3 : local21;
	}

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "(I)V")
	public final void method5800() {
		if (this.anInt7153 > 0) {
			this.aClass117_Sub1_42.method2468(this.anInt7153, this.method5798());
			this.anInt7153 = 0;
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZI)V")
	protected final void method5801(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean624) {
			@Pc(15) int local15 = this.method5798();
			this.aBoolean624 = true;
			this.method5806();
			this.method5802(local15);
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)V")
	private void method5802(@OriginalArg(0) int arg0) {
		this.aClass117_Sub1_42.anInt3097 -= arg0;
		this.aClass117_Sub1_42.anInt3097 += this.method5798();
	}

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "(I)I")
	public final int method5803() {
		return this.anInt7153;
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(B)Z")
	public final boolean method5804() {
		if (!this.aClass117_Sub1_42.aBoolean310) {
			return false;
		}
		@Pc(13) int local13 = this.method5798();
		this.aClass117_Sub1_42.method2504(this);
		OpenGL.glGenerateMipmapEXT(this.anInt7163);
		this.aBoolean624 = true;
		this.method5806();
		this.method5802(local13);
		return true;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IZ)V")
	public final void method5805(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean622) {
			this.aBoolean622 = arg0;
			this.method5806();
		}
	}

	@OriginalMember(owner = "client!sv", name = "e", descriptor = "(I)V")
	private void method5806() {
		this.aClass117_Sub1_42.method2504(this);
		if (this.aBoolean622) {
			OpenGL.glTexParameteri(this.anInt7163, 10241, this.aBoolean624 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt7163, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt7163, 10241, this.aBoolean624 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt7163, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V")
	public abstract void method5797();
}
