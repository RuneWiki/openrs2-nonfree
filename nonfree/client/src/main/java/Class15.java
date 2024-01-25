import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public abstract class Class15 implements Interface7 {

	@OriginalMember(owner = "client!ap", name = "h", descriptor = "Z")
	private boolean aBoolean591 = false;

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "Lclient!nm;")
	protected final Class164_Sub1 aClass164_Sub1_42;

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "I")
	public final int anInt6388;

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
	protected final int anInt6389;

	@OriginalMember(owner = "client!ap", name = "f", descriptor = "Z")
	private boolean aBoolean590;

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "I")
	private final int anInt6390;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "I")
	protected int anInt6387;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lclient!nm;IIIZ)V")
	protected Class15(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass164_Sub1_42 = arg0;
		this.anInt6388 = arg1;
		this.anInt6389 = arg2;
		this.aBoolean590 = arg4;
		this.anInt6390 = arg3;
		this.aClass164_Sub1_42.anOpengl1.glGenTextures(1, Static15.anIntArray746, 0);
		this.anInt6387 = Static15.anIntArray746[0];
		this.method5559(0);
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "()V")
	private void method5549() {
		@Pc(3) opengl local3 = this.aClass164_Sub1_42.anOpengl1;
		this.aClass164_Sub1_42.method3603(this);
		if (this.aBoolean591) {
			local3.glTexParameteri(this.anInt6388, 10241, this.aBoolean590 ? 9987 : 9729);
			local3.glTexParameteri(this.anInt6388, 10240, 9729);
		} else {
			local3.glTexParameteri(this.anInt6388, 10241, this.aBoolean590 ? 9984 : 9728);
			local3.glTexParameteri(this.anInt6388, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "()V")
	public final void method5550() {
		if (this.anInt6387 > 0) {
			this.aClass164_Sub1_42.method3626(this.anInt6387, this.method5560());
			this.anInt6387 = 0;
		}
	}

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "()Z")
	public final boolean method5555() {
		@Pc(3) opengl local3 = this.aClass164_Sub1_42.anOpengl1;
		if (!this.aClass164_Sub1_42.aBoolean420) {
			return false;
		}
		@Pc(10) int local10 = this.method5560();
		this.aClass164_Sub1_42.method3603(this);
		local3.glGenerateMipmapEXT(this.anInt6388);
		this.aBoolean590 = true;
		this.method5549();
		this.method5559(local10);
		return true;
	}

	@OriginalMember(owner = "client!ap", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method5550();
		super.finalize();
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Z)V")
	public final void method5556(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean591 != arg0) {
			this.aBoolean591 = arg0;
			this.method5549();
		}
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(Z)V")
	protected final void method5558(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean590 != arg0) {
			@Pc(6) int local6 = this.method5560();
			this.aBoolean590 = true;
			this.method5549();
			this.method5559(local6);
		}
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(I)V")
	private void method5559(@OriginalArg(0) int arg0) {
		this.aClass164_Sub1_42.anInt4063 -= arg0;
		this.aClass164_Sub1_42.anInt4063 += this.method5560();
	}

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "()I")
	private int method5560() {
		@Pc(8) int local8 = this.aClass164_Sub1_42.method3575(this.anInt6389) * this.anInt6390;
		return this.aBoolean590 ? local8 * 4 / 3 : local8;
	}

	@OriginalMember(owner = "client!ap", name = "f", descriptor = "()I")
	public final int method5561() {
		return this.anInt6387;
	}
}
