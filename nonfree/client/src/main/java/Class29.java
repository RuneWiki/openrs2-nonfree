import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public abstract class Class29 implements Interface12 {

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "Z")
	private boolean aBoolean670 = false;

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "Z")
	private boolean aBoolean671;

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "Lclient!vf;")
	protected final Class100_Sub3 aClass100_Sub3_41;

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
	public final int anInt9567;

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
	private final int anInt9572;

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
	protected final int anInt9574;

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
	protected int anInt9573;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!vf;IIIZ)V")
	protected Class29(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean671 = arg4;
		this.aClass100_Sub3_41 = arg0;
		this.anInt9567 = arg1;
		this.anInt9572 = arg3;
		this.anInt9574 = arg2;
		OpenGL.glGenTextures(1, Static93.anIntArray89, 0);
		this.anInt9573 = Static93.anIntArray89[0];
		this.method8163(0);
	}

	@OriginalMember(owner = "client!gb", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method8167();
		super.finalize();
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)V")
	private void method8163(@OriginalArg(0) int arg0) {
		this.aClass100_Sub3_41.anInt10261 -= arg0;
		this.aClass100_Sub3_41.anInt10261 += this.method8165();
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZ)V")
	public final void method8164(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean670 != arg0) {
			this.aBoolean670 = arg0;
			this.method8169();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)I")
	private int method8165() {
		@Pc(21) int local21 = this.aClass100_Sub3_41.method8726(this.anInt9574) * this.anInt9572;
		return this.aBoolean671 ? local21 * 4 / 3 : local21;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)V")
	public final void method8167() {
		if (this.anInt9573 > 0) {
			this.aClass100_Sub3_41.method8712(this.method8165(), this.anInt9573);
			this.anInt9573 = 0;
		}
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)Z")
	public final boolean method8168() {
		if (!this.aClass100_Sub3_41.aBoolean741) {
			return false;
		}
		@Pc(17) int local17 = this.method8165();
		this.aClass100_Sub3_41.method8743(this);
		OpenGL.glGenerateMipmapEXT(this.anInt9567);
		this.aBoolean671 = true;
		this.method8169();
		this.method8163(local17);
		return true;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
	private void method8169() {
		this.aClass100_Sub3_41.method8743(this);
		if (this.aBoolean670) {
			OpenGL.glTexParameteri(this.anInt9567, 10241, this.aBoolean671 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt9567, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt9567, 10241, this.aBoolean671 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt9567, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)I")
	public final int method8170() {
		return this.anInt9573;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZZ)V")
	protected final void method8171(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean671) {
			@Pc(25) int local25 = this.method8165();
			this.aBoolean671 = true;
			this.method8169();
			this.method8163(local25);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
	public abstract void method8162();
}
