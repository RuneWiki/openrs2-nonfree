import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public abstract class Class81 implements Interface11 {

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "Z")
	private boolean aBoolean354 = false;

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "Lclient!ic;")
	protected final Class48_Sub2 aClass48_Sub2_26;

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
	public final int anInt4831;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
	protected final int anInt4829;

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "Z")
	private boolean aBoolean353;

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
	private final int anInt4830;

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
	protected int anInt4832;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lclient!ic;IIIZ)V")
	protected Class81(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass48_Sub2_26 = arg0;
		this.anInt4831 = arg1;
		this.anInt4829 = arg2;
		this.aBoolean353 = arg4;
		this.anInt4830 = arg3;
		this.aClass48_Sub2_26.anOpengl2.glGenTextures(1, Static363.anIntArray397, 0);
		this.anInt4832 = Static363.anIntArray397[0];
		this.method4340(0);
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "()V")
	private void method4338() {
		@Pc(3) opengl local3 = this.aClass48_Sub2_26.anOpengl2;
		this.aClass48_Sub2_26.method2573(this);
		if (this.aBoolean354) {
			local3.glTexParameteri(this.anInt4831, 10241, this.aBoolean353 ? 9987 : 9729);
			local3.glTexParameteri(this.anInt4831, 10240, 9729);
		} else {
			local3.glTexParameteri(this.anInt4831, 10241, this.aBoolean353 ? 9984 : 9728);
			local3.glTexParameteri(this.anInt4831, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "()V")
	public final void method4339() {
		if (this.anInt4832 > 0) {
			this.aClass48_Sub2_26.method2593(this.anInt4832, this.method4347());
			this.anInt4832 = 0;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
	private void method4340(@OriginalArg(0) int arg0) {
		this.aClass48_Sub2_26.anInt3046 -= arg0;
		this.aClass48_Sub2_26.anInt3046 += this.method4347();
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "()Z")
	public final boolean method4343() {
		@Pc(3) opengl local3 = this.aClass48_Sub2_26.anOpengl2;
		if (!this.aClass48_Sub2_26.aBoolean229) {
			return false;
		}
		@Pc(10) int local10 = this.method4347();
		this.aClass48_Sub2_26.method2573(this);
		local3.glGenerateMipmapEXT(this.anInt4831);
		this.aBoolean353 = true;
		this.method4338();
		this.method4340(local10);
		return true;
	}

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "()I")
	public final int method4344() {
		return this.anInt4832;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)V")
	protected final void method4345(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean353 != arg0) {
			@Pc(6) int local6 = this.method4347();
			this.aBoolean353 = true;
			this.method4338();
			this.method4340(local6);
		}
	}

	@OriginalMember(owner = "client!vd", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method4339();
		super.finalize();
	}

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "()I")
	private int method4347() {
		@Pc(8) int local8 = this.aClass48_Sub2_26.method2590(this.anInt4829) * this.anInt4830;
		return this.aBoolean353 ? local8 * 4 / 3 : local8;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(Z)V")
	public final void method4350(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean354 != arg0) {
			this.aBoolean354 = arg0;
			this.method4338();
		}
	}
}
