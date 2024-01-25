import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class214 implements Interface4 {

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "I")
	private int anInt6697;

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "I")
	private int anInt6698;

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "I")
	private int anInt6699;

	@OriginalMember(owner = "client!vr", name = "g", descriptor = "[Lclient!vq;")
	private final Interface8[] anInterface8Array1 = new Interface8[9];

	@OriginalMember(owner = "client!vr", name = "f", descriptor = "Lclient!ql;")
	private final Class92_Sub2 aClass92_Sub2_39;

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "I")
	private final int anInt6700;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lclient!ql;)V")
	public Class214(@OriginalArg(0) Class92_Sub2 arg0) {
		if (!arg0.aBoolean464) {
			throw new IllegalStateException("");
		}
		this.aClass92_Sub2_39 = arg0;
		this.aClass92_Sub2_39.anOpengl2.glGenFramebuffersEXT(1, Static341.anIntArray532, 0);
		this.anInt6700 = Static341.anIntArray532[0];
	}

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "()V")
	@Override
	public void method5564() {
		this.aClass92_Sub2_39.anOpengl2.glBindFramebufferEXT(36160, 0);
	}

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "()Z")
	public boolean method5565() {
		@Pc(5) int local5 = this.aClass92_Sub2_39.anOpengl2.glCheckFramebufferStatusEXT(36160);
		return local5 == 36053;
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "()V")
	@Override
	public void method5563() {
		this.aClass92_Sub2_39.anOpengl2.glBindFramebufferEXT(36160, this.anInt6700);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)V")
	public void method5566(@OriginalArg(0) int arg0) {
		if (this.aClass92_Sub2_39.method4617() != this) {
			throw new RuntimeException();
		}
		this.aClass92_Sub2_39.anOpengl2.glDrawBuffer(Static341.anIntArray533[arg0]);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "()I")
	@Override
	public int method5562() {
		return this.anInt6699;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILclient!g;I)V")
	public void method5567(@OriginalArg(1) Class70_Sub2 arg0, @OriginalArg(2) int arg1) {
		this.method5568(arg0, arg1);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILclient!g;II)V")
	private void method5568(@OriginalArg(1) Class70_Sub2 arg0, @OriginalArg(3) int arg1) {
		if (this.aClass92_Sub2_39.method4617() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt6697 & 0xFFFFFFFE) == 0) {
			this.anInt6698 = arg0.anInt2161;
			this.anInt6699 = arg0.anInt2161;
		} else if (arg0.anInt2161 != this.anInt6698 || arg0.anInt2161 != this.anInt6699) {
			throw new RuntimeException();
		}
		arg0.method1753(Static341.anIntArray533[0], arg1);
		this.anInterface8Array1[0] = arg0;
		this.anInt6697 |= 0x1;
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)V")
	public void method5569(@OriginalArg(0) int arg0) {
		if (this.anInterface8Array1[arg0] != null) {
			this.anInterface8Array1[arg0].method5489();
		}
		this.anInt6697 &= ~(0x1 << arg0);
		this.anInterface8Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILclient!jo;)V")
	public void method5570(@OriginalArg(0) int arg0, @OriginalArg(1) Class70_Sub4 arg1) {
		this.method5572(arg0, arg1);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILclient!vf;)V")
	public void method5571(@OriginalArg(1) Class208 arg0) {
		if (this.aClass92_Sub2_39.method4617() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt6697 & 0xFFFFFEFF) == 0) {
			this.anInt6698 = arg0.anInt6624;
			this.anInt6699 = arg0.anInt6623;
		} else if (arg0.anInt6624 != this.anInt6698 || arg0.anInt6623 != this.anInt6699) {
			throw new RuntimeException();
		}
		arg0.method5491(Static341.anIntArray533[8]);
		this.anInterface8Array1[8] = arg0;
		this.anInt6697 |= 0x100;
	}

	@OriginalMember(owner = "client!vr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass92_Sub2_39.method4566(this.anInt6700);
		super.finalize();
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILclient!jo;I)V")
	private void method5572(@OriginalArg(0) int arg0, @OriginalArg(1) Class70_Sub4 arg1) {
		if (this.aClass92_Sub2_39.method4617() != this) {
			throw new RuntimeException();
		}
		@Pc(12) int local12 = 0x1 << arg0;
		if ((this.anInt6697 & ~local12) == 0) {
			this.anInt6698 = arg1.anInt2354;
			this.anInt6699 = arg1.anInt2353;
		} else if (arg1.anInt2354 != this.anInt6698 || arg1.anInt2353 != this.anInt6699) {
			throw new RuntimeException();
		}
		arg1.method1990(Static341.anIntArray533[arg0]);
		this.anInterface8Array1[arg0] = arg1;
		this.anInt6697 |= local12;
	}
}
