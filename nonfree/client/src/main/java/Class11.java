import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class11 implements Interface3 {

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
	private int anInt374;

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
	private int anInt375;

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "I")
	private int anInt377;

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "[Lclient!wq;")
	private final Interface9[] anInterface9Array1 = new Interface9[9];

	@OriginalMember(owner = "client!ao", name = "h", descriptor = "Lclient!h;")
	private final Class32_Sub2 aClass32_Sub2_4;

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
	private final int anInt376;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lclient!h;)V")
	public Class11(@OriginalArg(0) Class32_Sub2 arg0) {
		if (!arg0.aBoolean228) {
			throw new IllegalStateException("");
		}
		this.aClass32_Sub2_4 = arg0;
		this.aClass32_Sub2_4.anOpengl2.glGenFramebuffersEXT(1, Static11.anIntArray43, 0);
		this.anInt376 = Static11.anIntArray43[0];
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILclient!bj;)V")
	public void method342(@OriginalArg(0) int arg0, @OriginalArg(1) Class20_Sub1 arg1) {
		this.method344(arg0, arg1);
	}

	@OriginalMember(owner = "client!ao", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass32_Sub2_4.method2286(this.anInt376);
		super.finalize();
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILclient!oh;)V")
	public void method343(@OriginalArg(1) Class152 arg0) {
		if (this.aClass32_Sub2_4.method2283() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt374 & 0xFFFFFEFF) == 0) {
			this.anInt375 = arg0.anInt4618;
			this.anInt377 = arg0.anInt4623;
		} else if (arg0.anInt4618 != this.anInt375 || arg0.anInt4623 != this.anInt377) {
			throw new RuntimeException();
		}
		arg0.method4152(Static11.anIntArray42[8]);
		this.anInterface9Array1[8] = arg0;
		this.anInt374 |= 0x100;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILclient!bj;I)V")
	private void method344(@OriginalArg(0) int arg0, @OriginalArg(1) Class20_Sub1 arg1) {
		if (this.aClass32_Sub2_4.method2283() != this) {
			throw new RuntimeException();
		}
		@Pc(12) int local12 = 0x1 << arg0;
		if ((this.anInt374 & ~local12) == 0) {
			this.anInt375 = arg1.anInt1599;
			this.anInt377 = arg1.anInt1601;
		} else if (arg1.anInt1599 != this.anInt375 || arg1.anInt1601 != this.anInt377) {
			throw new RuntimeException();
		}
		arg1.method1387(Static11.anIntArray42[arg0]);
		this.anInterface9Array1[arg0] = arg1;
		this.anInt374 |= local12;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
	public void method345(@OriginalArg(0) int arg0) {
		if (this.anInterface9Array1[arg0] != null) {
			this.anInterface9Array1[arg0].method5499();
		}
		this.anInt374 &= ~(0x1 << arg0);
		this.anInterface9Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "()Z")
	public boolean method346() {
		@Pc(5) int local5 = this.aClass32_Sub2_4.anOpengl2.glCheckFramebufferStatusEXT(36160);
		return local5 == 36053;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILclient!hp;I)V")
	public void method347(@OriginalArg(1) Class20_Sub2 arg0, @OriginalArg(2) int arg1) {
		this.method349(arg0, arg1);
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "()V")
	@Override
	public void method2246() {
		this.aClass32_Sub2_4.anOpengl2.glBindFramebufferEXT(36160, this.anInt376);
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "()I")
	@Override
	public int method2245() {
		return this.anInt377;
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V")
	public void method348(@OriginalArg(0) int arg0) {
		if (this.aClass32_Sub2_4.method2283() != this) {
			throw new RuntimeException();
		}
		this.aClass32_Sub2_4.anOpengl2.glDrawBuffer(Static11.anIntArray42[arg0]);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "()V")
	@Override
	public void method2244() {
		this.aClass32_Sub2_4.anOpengl2.glBindFramebufferEXT(36160, 0);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILclient!hp;II)V")
	private void method349(@OriginalArg(1) Class20_Sub2 arg0, @OriginalArg(3) int arg1) {
		if (this.aClass32_Sub2_4.method2283() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt374 & 0xFFFFFFFE) == 0) {
			this.anInt375 = arg0.anInt2660;
			this.anInt377 = arg0.anInt2660;
		} else if (arg0.anInt2660 != this.anInt375 || arg0.anInt2660 != this.anInt377) {
			throw new RuntimeException();
		}
		arg0.method2472(Static11.anIntArray42[0], arg1);
		this.anInterface9Array1[0] = arg0;
		this.anInt374 |= 0x1;
	}
}
