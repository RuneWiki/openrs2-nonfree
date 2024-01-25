import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sga")
public abstract class Class245 implements Interface15 {

	@OriginalMember(owner = "client!sga", name = "c", descriptor = "Z")
	private boolean aBoolean749 = false;

	@OriginalMember(owner = "client!sga", name = "t", descriptor = "I")
	private final int anInt10361;

	@OriginalMember(owner = "client!sga", name = "e", descriptor = "I")
	public final int anInt10362;

	@OriginalMember(owner = "client!sga", name = "n", descriptor = "Lclient!gia;")
	protected final Class67_Sub2 aClass67_Sub2_40;

	@OriginalMember(owner = "client!sga", name = "r", descriptor = "I")
	protected final int anInt10366;

	@OriginalMember(owner = "client!sga", name = "d", descriptor = "Z")
	private boolean aBoolean750;

	@OriginalMember(owner = "client!sga", name = "p", descriptor = "I")
	protected int anInt10370;

	@OriginalMember(owner = "client!sga", name = "<init>", descriptor = "(Lclient!gia;IIIZ)V")
	protected Class245(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt10361 = arg3;
		this.anInt10362 = arg1;
		this.aClass67_Sub2_40 = arg0;
		this.anInt10366 = arg2;
		this.aBoolean750 = arg4;
		OpenGL.glGenTextures(1, Static552.anIntArray508, 0);
		this.anInt10370 = Static552.anIntArray508[0];
		this.method8674(0);
	}

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "(ZI)V")
	public final void method8672(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean749) {
			this.aBoolean749 = arg0;
			this.method8677();
		}
	}

	@OriginalMember(owner = "client!sga", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method8676();
		super.finalize();
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(I)Z")
	public final boolean method8673() {
		if (!this.aClass67_Sub2_40.aBoolean309) {
			return false;
		}
		@Pc(18) int local18 = this.method8675();
		this.aClass67_Sub2_40.method3234(this);
		OpenGL.glGenerateMipmapEXT(this.anInt10362);
		this.aBoolean750 = true;
		this.method8677();
		this.method8674(local18);
		return true;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(II)V")
	private void method8674(@OriginalArg(0) int arg0) {
		this.aClass67_Sub2_40.anInt3883 -= arg0;
		this.aClass67_Sub2_40.anInt3883 += this.method8675();
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Z)I")
	private int method8675() {
		@Pc(21) int local21 = this.aClass67_Sub2_40.method3272(this.anInt10366) * this.anInt10361;
		return this.aBoolean750 ? local21 * 4 / 3 : local21;
	}

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "(B)V")
	public final void method8676() {
		if (this.anInt10370 > 0) {
			this.aClass67_Sub2_40.method3237(this.anInt10370, this.method8675());
			this.anInt10370 = 0;
		}
	}

	@OriginalMember(owner = "client!sga", name = "d", descriptor = "(I)V")
	private void method8677() {
		this.aClass67_Sub2_40.method3234(this);
		if (this.aBoolean749) {
			OpenGL.glTexParameteri(this.anInt10362, 10241, this.aBoolean750 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt10362, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt10362, 10241, this.aBoolean750 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt10362, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!sga", name = "c", descriptor = "(I)I")
	public final int method8678() {
		return this.anInt10370;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(ZI)V")
	protected final void method8681(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean750 != arg0) {
			@Pc(19) int local19 = this.method8675();
			this.aBoolean750 = true;
			this.method8677();
			this.method8674(local19);
		}
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(B)V")
	public abstract void method8671();
}
