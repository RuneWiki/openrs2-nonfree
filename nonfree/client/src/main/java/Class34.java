import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public abstract class Class34 implements Interface12 {

	@OriginalMember(owner = "client!um", name = "j", descriptor = "Z")
	private boolean aBoolean468 = false;

	@OriginalMember(owner = "client!um", name = "f", descriptor = "I")
	protected final int anInt5764;

	@OriginalMember(owner = "client!um", name = "n", descriptor = "I")
	public final int anInt5770;

	@OriginalMember(owner = "client!um", name = "b", descriptor = "I")
	private final int anInt5761;

	@OriginalMember(owner = "client!um", name = "e", descriptor = "Z")
	private boolean aBoolean467;

	@OriginalMember(owner = "client!um", name = "l", descriptor = "Lclient!us;")
	protected final Class43_Sub3 aClass43_Sub3_23;

	@OriginalMember(owner = "client!um", name = "g", descriptor = "I")
	protected int anInt5765;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lclient!us;IIIZ)V")
	protected Class34(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5764 = arg2;
		this.anInt5770 = arg1;
		this.anInt5761 = arg3;
		this.aBoolean467 = arg4;
		this.aClass43_Sub3_23 = arg0;
		OpenGL.glGenTextures(1, Static568.anIntArray670, 0);
		this.anInt5765 = Static568.anIntArray670[0];
		this.method4977(0);
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V")
	private void method4970() {
		this.aClass43_Sub3_23.method7220(this);
		if (this.aBoolean468) {
			OpenGL.glTexParameteri(this.anInt5770, 10241, this.aBoolean467 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt5770, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt5770, 10241, this.aBoolean467 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt5770, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(BZ)V")
	protected final void method4971(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean467 != arg0) {
			@Pc(15) int local15 = this.method4978();
			this.aBoolean467 = true;
			this.method4970();
			this.method4977(local15);
		}
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(I)I")
	public final int method4972() {
		return this.anInt5765;
	}

	@OriginalMember(owner = "client!um", name = "d", descriptor = "(I)V")
	public final void method4973() {
		if (this.anInt5765 > 0) {
			this.aClass43_Sub3_23.method7234(this.anInt5765, this.method4978());
			this.anInt5765 = 0;
		}
	}

	@OriginalMember(owner = "client!um", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method4973();
		super.finalize();
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ZB)V")
	public final void method4974(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean468 != arg0) {
			this.aBoolean468 = arg0;
			this.method4970();
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(B)Z")
	public final boolean method4975() {
		if (!this.aClass43_Sub3_23.aBoolean676) {
			return false;
		}
		@Pc(20) int local20 = this.method4978();
		this.aClass43_Sub3_23.method7220(this);
		OpenGL.glGenerateMipmapEXT(this.anInt5770);
		this.aBoolean467 = true;
		this.method4970();
		this.method4977(local20);
		return true;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(II)V")
	private void method4977(@OriginalArg(0) int arg0) {
		this.aClass43_Sub3_23.anInt8739 -= arg0;
		this.aClass43_Sub3_23.anInt8739 += this.method4978();
	}

	@OriginalMember(owner = "client!um", name = "e", descriptor = "(I)I")
	private int method4978() {
		@Pc(13) int local13 = this.aClass43_Sub3_23.method7276(this.anInt5764) * this.anInt5761;
		return this.aBoolean467 ? local13 * 4 / 3 : local13;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
	public abstract void method4969();
}
