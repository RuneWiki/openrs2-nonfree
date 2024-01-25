import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dca")
public abstract class Class66 implements Interface24 {

	@OriginalMember(owner = "client!dca", name = "e", descriptor = "Z")
	private boolean aBoolean572 = false;

	@OriginalMember(owner = "client!dca", name = "n", descriptor = "I")
	private final int anInt8227;

	@OriginalMember(owner = "client!dca", name = "m", descriptor = "Z")
	private boolean aBoolean573;

	@OriginalMember(owner = "client!dca", name = "o", descriptor = "Lclient!qfa;")
	protected final Class137_Sub3 aClass137_Sub3_36;

	@OriginalMember(owner = "client!dca", name = "p", descriptor = "I")
	protected final int anInt8228;

	@OriginalMember(owner = "client!dca", name = "i", descriptor = "I")
	public final int anInt8223;

	@OriginalMember(owner = "client!dca", name = "j", descriptor = "I")
	protected int anInt8224;

	@OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(Lclient!qfa;IIIZ)V")
	protected Class66(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt8227 = arg3;
		this.aBoolean573 = arg4;
		this.aClass137_Sub3_36 = arg0;
		this.anInt8228 = arg2;
		this.anInt8223 = arg1;
		OpenGL.glGenTextures(1, Static275.anIntArray386, 0);
		this.anInt8224 = Static275.anIntArray386[0];
		this.method6847(0);
	}

	@OriginalMember(owner = "client!dca", name = "b", descriptor = "(B)V")
	public final void method6846() {
		if (this.anInt8224 > 0) {
			this.aClass137_Sub3_36.method7072(this.method6853(), this.anInt8224);
			this.anInt8224 = 0;
		}
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(II)V")
	private void method6847(@OriginalArg(1) int arg0) {
		this.aClass137_Sub3_36.anInt8550 -= arg0;
		this.aClass137_Sub3_36.anInt8550 += this.method6853();
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(BZ)V")
	public final void method6848(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean572) {
			this.aBoolean572 = arg0;
			this.method6851();
		}
	}

	@OriginalMember(owner = "client!dca", name = "b", descriptor = "(I)I")
	public final int method6849() {
		return this.anInt8224;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(IZ)V")
	protected final void method6850(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean573) {
			@Pc(15) int local15 = this.method6853();
			this.aBoolean573 = true;
			this.method6851();
			this.method6847(local15);
		}
	}

	@OriginalMember(owner = "client!dca", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method6846();
		super.finalize();
	}

	@OriginalMember(owner = "client!dca", name = "c", descriptor = "(B)V")
	private void method6851() {
		this.aClass137_Sub3_36.method7090(this);
		if (this.aBoolean572) {
			OpenGL.glTexParameteri(this.anInt8223, 10241, this.aBoolean573 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt8223, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt8223, 10241, this.aBoolean573 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt8223, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!dca", name = "d", descriptor = "(B)I")
	private int method6853() {
		@Pc(18) int local18 = this.aClass137_Sub3_36.method7096(this.anInt8228) * this.anInt8227;
		return this.aBoolean573 ? local18 * 4 / 3 : local18;
	}

	@OriginalMember(owner = "client!dca", name = "c", descriptor = "(I)Z")
	public final boolean method6854() {
		if (!this.aClass137_Sub3_36.aBoolean608) {
			return false;
		}
		@Pc(18) int local18 = this.method6853();
		this.aClass137_Sub3_36.method7090(this);
		OpenGL.glGenerateMipmapEXT(this.anInt8223);
		this.aBoolean573 = true;
		this.method6851();
		this.method6847(local18);
		return true;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(I)V")
	public abstract void method6844();
}
