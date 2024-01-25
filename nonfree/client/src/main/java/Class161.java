import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pu")
public abstract class Class161 implements Interface15 {

	@OriginalMember(owner = "client!pu", name = "u", descriptor = "Z")
	private boolean aBoolean742 = false;

	@OriginalMember(owner = "client!pu", name = "n", descriptor = "Lclient!pi;")
	protected final Class144_Sub3 aClass144_Sub3_42;

	@OriginalMember(owner = "client!pu", name = "s", descriptor = "I")
	public final int anInt10743;

	@OriginalMember(owner = "client!pu", name = "k", descriptor = "Z")
	private boolean aBoolean743;

	@OriginalMember(owner = "client!pu", name = "l", descriptor = "I")
	protected final int anInt10745;

	@OriginalMember(owner = "client!pu", name = "p", descriptor = "I")
	private final int anInt10752;

	@OriginalMember(owner = "client!pu", name = "q", descriptor = "I")
	protected int anInt10748;

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lclient!pi;IIIZ)V")
	protected Class161(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass144_Sub3_42 = arg0;
		this.anInt10743 = arg1;
		this.aBoolean743 = arg4;
		this.anInt10745 = arg2;
		this.anInt10752 = arg3;
		OpenGL.glGenTextures(1, Static304.anIntArray300, 0);
		this.anInt10748 = Static304.anIntArray300[0];
		this.method9175(0);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)V")
	public final void method9167() {
		if (this.anInt10748 > 0) {
			this.aClass144_Sub3_42.method7024(this.method9171(), this.anInt10748);
			this.anInt10748 = 0;
		}
	}

	@OriginalMember(owner = "client!pu", name = "e", descriptor = "(B)I")
	public final int method9168() {
		return this.anInt10748;
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(BZ)V")
	protected final void method9169(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean743 != arg0) {
			@Pc(20) int local20 = this.method9171();
			this.aBoolean743 = true;
			this.method9170();
			this.method9175(local20);
		}
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(B)V")
	private void method9170() {
		this.aClass144_Sub3_42.method6982(this);
		if (this.aBoolean742) {
			OpenGL.glTexParameteri(this.anInt10743, 10241, this.aBoolean743 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt10743, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt10743, 10241, this.aBoolean743 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt10743, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!pu", name = "d", descriptor = "(B)I")
	private int method9171() {
		@Pc(13) int local13 = this.aClass144_Sub3_42.method7034(this.anInt10745) * this.anInt10752;
		return this.aBoolean743 ? local13 * 4 / 3 : local13;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(BZ)V")
	public final void method9173(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean742) {
			this.aBoolean742 = arg0;
			this.method9170();
		}
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)Z")
	public final boolean method9174() {
		if (!this.aClass144_Sub3_42.aBoolean576) {
			return false;
		}
		@Pc(18) int local18 = this.method9171();
		this.aClass144_Sub3_42.method6982(this);
		OpenGL.glGenerateMipmapEXT(this.anInt10743);
		this.aBoolean743 = true;
		this.method9170();
		this.method9175(local18);
		return true;
	}

	@OriginalMember(owner = "client!pu", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method9167();
		super.finalize();
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IB)V")
	private void method9175(@OriginalArg(0) int arg0) {
		this.aClass144_Sub3_42.anInt8060 -= arg0;
		this.aClass144_Sub3_42.anInt8060 += this.method9171();
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)V")
	public abstract void method9166();
}
