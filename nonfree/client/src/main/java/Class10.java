import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public abstract class Class10 implements Interface24 {

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "Z")
	private boolean aBoolean611 = false;

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "Lclient!bi;")
	protected final Class13_Sub2 aClass13_Sub2_39;

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "Z")
	private boolean aBoolean610;

	@OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
	public final int anInt8418;

	@OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
	private final int anInt8417;

	@OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
	protected final int anInt8428;

	@OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
	protected int anInt8421;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lclient!bi;IIIZ)V")
	protected Class10(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass13_Sub2_39 = arg0;
		this.aBoolean610 = arg4;
		this.anInt8418 = arg1;
		this.anInt8417 = arg3;
		this.anInt8428 = arg2;
		OpenGL.glGenTextures(1, Static390.anIntArray443, 0);
		this.anInt8421 = Static390.anIntArray443[0];
		this.method7255(0);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI)V")
	protected final void method7254(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean610) {
			@Pc(13) int local13 = this.method7259();
			this.aBoolean610 = true;
			this.method7262();
			this.method7255(local13);
		}
	}

	@OriginalMember(owner = "client!cj", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7257();
		super.finalize();
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IB)V")
	private void method7255(@OriginalArg(0) int arg0) {
		this.aClass13_Sub2_39.anInt1082 -= arg0;
		this.aClass13_Sub2_39.anInt1082 += this.method7259();
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)V")
	public final void method7257() {
		if (this.anInt8421 > 0) {
			this.aClass13_Sub2_39.method1032(this.method7259(), this.anInt8421);
			this.anInt8421 = 0;
		}
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(B)Z")
	public final boolean method7258() {
		if (!this.aClass13_Sub2_39.aBoolean91) {
			return false;
		}
		@Pc(16) int local16 = this.method7259();
		this.aClass13_Sub2_39.method1096(this);
		OpenGL.glGenerateMipmapEXT(this.anInt8418);
		this.aBoolean610 = true;
		this.method7262();
		this.method7255(local16);
		return true;
	}

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)I")
	private int method7259() {
		@Pc(20) int local20 = this.aClass13_Sub2_39.method1083(this.anInt8428) * this.anInt8417;
		return this.aBoolean610 ? local20 * 4 / 3 : local20;
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(ZI)V")
	public final void method7260(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean611 != arg0) {
			this.aBoolean611 = arg0;
			this.method7262();
		}
	}

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "(I)I")
	public final int method7261() {
		return this.anInt8421;
	}

	@OriginalMember(owner = "client!cj", name = "f", descriptor = "(I)V")
	private void method7262() {
		this.aClass13_Sub2_39.method1096(this);
		if (this.aBoolean611) {
			OpenGL.glTexParameteri(this.anInt8418, 10241, this.aBoolean610 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt8418, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt8418, 10241, this.aBoolean610 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt8418, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
	public abstract void method7251();
}
