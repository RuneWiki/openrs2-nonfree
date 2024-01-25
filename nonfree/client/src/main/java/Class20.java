import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public abstract class Class20 implements Interface4 {

	@OriginalMember(owner = "client!tp", name = "d", descriptor = "Z")
	private boolean aBoolean449 = false;

	@OriginalMember(owner = "client!tp", name = "g", descriptor = "Lclient!fu;")
	protected final Class63_Sub2 aClass63_Sub2_42;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "I")
	public final int anInt6331;

	@OriginalMember(owner = "client!tp", name = "h", descriptor = "I")
	protected final int anInt6334;

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "Z")
	private boolean aBoolean448;

	@OriginalMember(owner = "client!tp", name = "e", descriptor = "I")
	private final int anInt6333;

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
	protected int anInt6332;

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lclient!fu;IIIZ)V")
	protected Class20(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass63_Sub2_42 = arg0;
		this.anInt6331 = arg1;
		this.anInt6334 = arg2;
		this.aBoolean448 = arg4;
		this.anInt6333 = arg3;
		this.aClass63_Sub2_42.anOpengl2.glGenTextures(1, Static336.anIntArray1316, 0);
		this.anInt6332 = Static336.anIntArray1316[0];
		this.method5506(0);
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "()I")
	private int method5496() {
		@Pc(8) int local8 = this.aClass63_Sub2_42.method2101(this.anInt6334) * this.anInt6333;
		return this.aBoolean448 ? local8 * 4 / 3 : local8;
	}

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "()I")
	public final int method5500() {
		return this.anInt6332;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Z)V")
	protected final void method5501(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean448 != arg0) {
			@Pc(6) int local6 = this.method5496();
			this.aBoolean448 = true;
			this.method5507();
			this.method5506(local6);
		}
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(Z)V")
	public final void method5502(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean449 != arg0) {
			this.aBoolean449 = arg0;
			this.method5507();
		}
	}

	@OriginalMember(owner = "client!tp", name = "d", descriptor = "()Z")
	public final boolean method5504() {
		@Pc(3) opengl local3 = this.aClass63_Sub2_42.anOpengl2;
		if (!this.aClass63_Sub2_42.aBoolean167) {
			return false;
		}
		@Pc(10) int local10 = this.method5496();
		this.aClass63_Sub2_42.method2068(this);
		local3.glGenerateMipmapEXT(this.anInt6331);
		this.aBoolean448 = true;
		this.method5507();
		this.method5506(local10);
		return true;
	}

	@OriginalMember(owner = "client!tp", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method5505();
		super.finalize();
	}

	@OriginalMember(owner = "client!tp", name = "e", descriptor = "()V")
	public final void method5505() {
		if (this.anInt6332 > 0) {
			this.aClass63_Sub2_42.method2080(this.anInt6332, this.method5496());
			this.anInt6332 = 0;
		}
	}

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "(I)V")
	private void method5506(@OriginalArg(0) int arg0) {
		this.aClass63_Sub2_42.anInt2092 -= arg0;
		this.aClass63_Sub2_42.anInt2092 += this.method5496();
	}

	@OriginalMember(owner = "client!tp", name = "f", descriptor = "()V")
	private void method5507() {
		@Pc(3) opengl local3 = this.aClass63_Sub2_42.anOpengl2;
		this.aClass63_Sub2_42.method2068(this);
		if (this.aBoolean449) {
			local3.glTexParameteri(this.anInt6331, 10241, this.aBoolean448 ? 9987 : 9729);
			local3.glTexParameteri(this.anInt6331, 10240, 9729);
		} else {
			local3.glTexParameteri(this.anInt6331, 10241, this.aBoolean448 ? 9984 : 9728);
			local3.glTexParameteri(this.anInt6331, 10240, 9728);
		}
	}
}
