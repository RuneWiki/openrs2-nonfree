import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public final class Class121 implements Interface9 {

	@OriginalMember(owner = "client!js", name = "e", descriptor = "I")
	private int anInt3487;

	@OriginalMember(owner = "client!js", name = "f", descriptor = "I")
	private int anInt3488;

	@OriginalMember(owner = "client!js", name = "g", descriptor = "I")
	private int anInt3489;

	@OriginalMember(owner = "client!js", name = "h", descriptor = "[Lclient!wg;")
	private final Interface11[] anInterface11Array1 = new Interface11[9];

	@OriginalMember(owner = "client!js", name = "b", descriptor = "Lclient!ic;")
	private final Class48_Sub2 aClass48_Sub2_16;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "I")
	private final int anInt3486;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Lclient!ic;)V")
	public Class121(@OriginalArg(0) Class48_Sub2 arg0) {
		if (!arg0.aBoolean229) {
			throw new IllegalStateException("");
		}
		this.aClass48_Sub2_16 = arg0;
		this.aClass48_Sub2_16.anOpengl2.glGenFramebuffersEXT(1, Static170.anIntArray271, 0);
		this.anInt3486 = Static170.anIntArray271[0];
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V")
	public void method3024(@OriginalArg(0) int arg0) {
		if (this.anInterface11Array1[arg0] != null) {
			this.anInterface11Array1[arg0].method5235();
		}
		this.anInt3487 &= ~(0x1 << arg0);
		this.anInterface11Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ILclient!sn;)V")
	public void method3025(@OriginalArg(1) Class211 arg0) {
		if (this.aClass48_Sub2_16.method2560() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt3487 & 0xFFFFFEFF) == 0) {
			this.anInt3489 = arg0.anInt5968;
			this.anInt3488 = arg0.anInt5966;
		} else if (arg0.anInt5968 != this.anInt3489 || arg0.anInt5966 != this.anInt3488) {
			throw new RuntimeException();
		}
		arg0.method5237(Static170.anIntArray270[8]);
		this.anInterface11Array1[8] = arg0;
		this.anInt3487 |= 0x100;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ILclient!nb;II)V")
	private void method3026(@OriginalArg(1) Class81_Sub3 arg0, @OriginalArg(3) int arg1) {
		if (this.aClass48_Sub2_16.method2560() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt3487 & 0xFFFFFFFE) == 0) {
			this.anInt3489 = arg0.anInt4461;
			this.anInt3488 = arg0.anInt4461;
		} else if (arg0.anInt4461 != this.anInt3489 || arg0.anInt4461 != this.anInt3488) {
			throw new RuntimeException();
		}
		arg0.method3944(Static170.anIntArray270[0], arg1);
		this.anInterface11Array1[0] = arg0;
		this.anInt3487 |= 0x1;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ILclient!tr;I)V")
	private void method3027(@OriginalArg(0) int arg0, @OriginalArg(1) Class81_Sub2 arg1) {
		if (this.aClass48_Sub2_16.method2560() != this) {
			throw new RuntimeException();
		}
		@Pc(12) int local12 = 0x1 << arg0;
		if ((this.anInt3487 & ~local12) == 0) {
			this.anInt3489 = arg1.anInt4125;
			this.anInt3488 = arg1.anInt4124;
		} else if (arg1.anInt4125 != this.anInt3489 || arg1.anInt4124 != this.anInt3488) {
			throw new RuntimeException();
		}
		arg1.method3637(Static170.anIntArray270[arg0]);
		this.anInterface11Array1[arg0] = arg1;
		this.anInt3487 |= local12;
	}

	@OriginalMember(owner = "client!js", name = "d", descriptor = "()Z")
	public boolean method3028() {
		@Pc(5) int local5 = this.aClass48_Sub2_16.anOpengl2.glCheckFramebufferStatusEXT(36160);
		return local5 == 36053;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "()V")
	@Override
	public void method3021() {
		this.aClass48_Sub2_16.anOpengl2.glBindFramebufferEXT(36160, this.anInt3486);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ILclient!tr;)V")
	public void method3029(@OriginalArg(0) int arg0, @OriginalArg(1) Class81_Sub2 arg1) {
		this.method3027(arg0, arg1);
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(I)V")
	public void method3030(@OriginalArg(0) int arg0) {
		if (this.aClass48_Sub2_16.method2560() != this) {
			throw new RuntimeException();
		}
		this.aClass48_Sub2_16.anOpengl2.glDrawBuffer(Static170.anIntArray270[arg0]);
	}

	@OriginalMember(owner = "client!js", name = "c", descriptor = "()V")
	@Override
	public void method3023() {
		this.aClass48_Sub2_16.anOpengl2.glBindFramebufferEXT(36160, 0);
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "()I")
	@Override
	public int method3022() {
		return this.anInt3488;
	}

	@OriginalMember(owner = "client!js", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass48_Sub2_16.method2587(this.anInt3486);
		super.finalize();
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ILclient!nb;I)V")
	public void method3031(@OriginalArg(1) Class81_Sub3 arg0, @OriginalArg(2) int arg1) {
		this.method3026(arg0, arg1);
	}
}
