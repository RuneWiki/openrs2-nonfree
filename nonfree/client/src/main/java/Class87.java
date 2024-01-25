import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class87 implements Interface5 {

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
	private int anInt2650;

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
	private int anInt2651;

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
	private int anInt2653;

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "[Lclient!nh;")
	private final Interface7[] anInterface7Array1 = new Interface7[9];

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "Lclient!po;")
	private final Class59_Sub1 aClass59_Sub1_16;

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
	private final int anInt2652;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!po;)V")
	public Class87(@OriginalArg(0) Class59_Sub1 arg0) {
		if (!arg0.aBoolean367) {
			throw new IllegalStateException("");
		}
		this.aClass59_Sub1_16 = arg0;
		this.aClass59_Sub1_16.anOpengl2.glGenFramebuffersEXT(1, Static127.anIntArray162, 0);
		this.anInt2652 = Static127.anIntArray162[0];
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "()V")
	@Override
	public void method4263() {
		this.aClass59_Sub1_16.anOpengl2.glBindFramebufferEXT(36160, this.anInt2652);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	public void method2457(@OriginalArg(0) int arg0) {
		if (this.anInterface7Array1[arg0] != null) {
			this.anInterface7Array1[arg0].method5524();
		}
		this.anInt2653 &= ~(0x1 << arg0);
		this.anInterface7Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!fc;)V")
	public void method2458(@OriginalArg(0) int arg0, @OriginalArg(1) Class11_Sub1 arg1) {
		this.method2461(arg0, arg1);
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "()V")
	@Override
	public void method4265() {
		this.aClass59_Sub1_16.anOpengl2.glBindFramebufferEXT(36160, 0);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!vf;)V")
	public void method2459(@OriginalArg(1) Class209 arg0) {
		if (this.aClass59_Sub1_16.method4290() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt2653 & 0xFFFFFEFF) == 0) {
			this.anInt2650 = arg0.anInt6219;
			this.anInt2651 = arg0.anInt6220;
		} else if (arg0.anInt6219 != this.anInt2650 || arg0.anInt6220 != this.anInt2651) {
			throw new RuntimeException();
		}
		arg0.method5525(Static127.anIntArray161[8]);
		this.anInterface7Array1[8] = arg0;
		this.anInt2653 |= 0x100;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!bc;II)V")
	private void method2460(@OriginalArg(1) Class11_Sub2 arg0, @OriginalArg(3) int arg1) {
		if (this.aClass59_Sub1_16.method4290() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt2653 & 0xFFFFFFFE) == 0) {
			this.anInt2650 = arg0.anInt529;
			this.anInt2651 = arg0.anInt529;
		} else if (arg0.anInt529 != this.anInt2650 || arg0.anInt529 != this.anInt2651) {
			throw new RuntimeException();
		}
		arg0.method544(Static127.anIntArray161[0], arg1);
		this.anInterface7Array1[0] = arg0;
		this.anInt2653 |= 0x1;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!fc;I)V")
	private void method2461(@OriginalArg(0) int arg0, @OriginalArg(1) Class11_Sub1 arg1) {
		if (this.aClass59_Sub1_16.method4290() != this) {
			throw new RuntimeException();
		}
		@Pc(12) int local12 = 0x1 << arg0;
		if ((this.anInt2653 & ~local12) == 0) {
			this.anInt2650 = arg1.anInt365;
			this.anInt2651 = arg1.anInt367;
		} else if (arg1.anInt365 != this.anInt2650 || arg1.anInt367 != this.anInt2651) {
			throw new RuntimeException();
		}
		arg1.method386(Static127.anIntArray161[arg0]);
		this.anInterface7Array1[arg0] = arg1;
		this.anInt2653 |= local12;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "()I")
	@Override
	public int method4264() {
		return this.anInt2651;
	}

	@OriginalMember(owner = "client!ib", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass59_Sub1_16.method4271(this.anInt2652);
		super.finalize();
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
	public void method2462(@OriginalArg(0) int arg0) {
		if (this.aClass59_Sub1_16.method4290() != this) {
			throw new RuntimeException();
		}
		this.aClass59_Sub1_16.anOpengl2.glDrawBuffer(Static127.anIntArray161[arg0]);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!bc;I)V")
	public void method2463(@OriginalArg(1) Class11_Sub2 arg0, @OriginalArg(2) int arg1) {
		this.method2460(arg0, arg1);
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "()Z")
	public boolean method2464() {
		@Pc(5) int local5 = this.aClass59_Sub1_16.anOpengl2.glCheckFramebufferStatusEXT(36160);
		return local5 == 36053;
	}
}
