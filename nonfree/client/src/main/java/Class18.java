import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public abstract class Class18 implements Interface5 {

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "Z")
	private boolean aBoolean467 = false;

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "Lclient!hj;")
	protected final Class2_Sub1 aClass2_Sub1_34;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
	public final int anInt5452;

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
	protected final int anInt5454;

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "Z")
	private boolean aBoolean468;

	@OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
	private final int anInt5455;

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
	protected int anInt5453;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lclient!hj;IIIZ)V")
	protected Class18(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass2_Sub1_34 = arg0;
		this.anInt5452 = arg1;
		this.anInt5454 = arg2;
		this.aBoolean468 = arg4;
		this.anInt5455 = arg3;
		this.aClass2_Sub1_34.anOpengl1.glGenTextures(1, Static208.anIntArray685, 0);
		this.anInt5453 = Static208.anIntArray685[0];
		this.method4849(0);
	}

	@OriginalMember(owner = "client!nj", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method4843();
		super.finalize();
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "()I")
	private int method4841() {
		@Pc(8) int local8 = this.aClass2_Sub1_34.method2335(this.anInt5454) * this.anInt5455;
		return this.aBoolean468 ? local8 * 4 / 3 : local8;
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "()I")
	public final int method4842() {
		return this.anInt5453;
	}

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "()V")
	public final void method4843() {
		if (this.anInt5453 > 0) {
			this.aClass2_Sub1_34.method2362(this.anInt5453, this.method4841());
			this.anInt5453 = 0;
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)V")
	protected final void method4844(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean468 != arg0) {
			@Pc(6) int local6 = this.method4841();
			this.aBoolean468 = true;
			this.method4845();
			this.method4849(local6);
		}
	}

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "()V")
	private void method4845() {
		@Pc(3) opengl local3 = this.aClass2_Sub1_34.anOpengl1;
		this.aClass2_Sub1_34.method2376(this);
		if (this.aBoolean467) {
			local3.glTexParameteri(this.anInt5452, 10241, this.aBoolean468 ? 9987 : 9729);
			local3.glTexParameteri(this.anInt5452, 10240, 9729);
		} else {
			local3.glTexParameteri(this.anInt5452, 10241, this.aBoolean468 ? 9984 : 9728);
			local3.glTexParameteri(this.anInt5452, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "()Z")
	public final boolean method4848() {
		@Pc(3) opengl local3 = this.aClass2_Sub1_34.anOpengl1;
		if (!this.aClass2_Sub1_34.aBoolean217) {
			return false;
		}
		@Pc(10) int local10 = this.method4841();
		this.aClass2_Sub1_34.method2376(this);
		local3.glGenerateMipmapEXT(this.anInt5452);
		this.aBoolean468 = true;
		this.method4845();
		this.method4849(local10);
		return true;
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V")
	private void method4849(@OriginalArg(0) int arg0) {
		this.aClass2_Sub1_34.anInt2411 -= arg0;
		this.aClass2_Sub1_34.anInt2411 += this.method4841();
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(Z)V")
	public final void method4852(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean467 != arg0) {
			this.aBoolean467 = arg0;
			this.method4845();
		}
	}
}
