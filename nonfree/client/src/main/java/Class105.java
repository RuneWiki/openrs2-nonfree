import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class105 implements Interface3 {

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
	private int anInt2622;

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
	private int anInt2623;

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
	private int anInt2625;

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "[Lclient!aq;")
	private final Interface1[] anInterface1Array1 = new Interface1[9];

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "Lclient!ge;")
	private final Class81_Sub1 aClass81_Sub1_22;

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
	private final int anInt2624;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class105(@OriginalArg(0) Class81_Sub1 arg0) {
		if (!arg0.aBoolean132) {
			throw new IllegalStateException("");
		}
		this.aClass81_Sub1_22 = arg0;
		this.aClass81_Sub1_22.anOpengl1.glGenFramebuffersEXT(1, Static146.anIntArray338, 0);
		this.anInt2624 = Static146.anIntArray338[0];
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!ca;II)V")
	private void method2745(@OriginalArg(1) Class28_Sub1 arg0, @OriginalArg(3) int arg1) {
		if (this.aClass81_Sub1_22.method1955() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt2625 & 0xFFFFFFFE) == 0) {
			this.anInt2623 = arg0.anInt644;
			this.anInt2622 = arg0.anInt644;
		} else if (arg0.anInt644 != this.anInt2623 || arg0.anInt644 != this.anInt2622) {
			throw new RuntimeException();
		}
		arg0.method556(Static146.anIntArray337[0], arg1);
		this.anInterface1Array1[0] = arg0;
		this.anInt2625 |= 0x1;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
	public void method2746(@OriginalArg(0) int arg0) {
		if (this.anInterface1Array1[arg0] != null) {
			this.anInterface1Array1[arg0].method4114();
		}
		this.anInt2625 &= ~(0x1 << arg0);
		this.anInterface1Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "()V")
	@Override
	public void method2743() {
		this.aClass81_Sub1_22.anOpengl1.glBindFramebufferEXT(36160, 0);
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "()I")
	@Override
	public int method2744() {
		return this.anInt2622;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!ca;I)V")
	public void method2747(@OriginalArg(1) Class28_Sub1 arg0, @OriginalArg(2) int arg1) {
		this.method2745(arg0, arg1);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!cl;)V")
	public void method2748(@OriginalArg(1) Class35 arg0) {
		if (this.aClass81_Sub1_22.method1955() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt2625 & 0xFFFFFEFF) == 0) {
			this.anInt2623 = arg0.anInt795;
			this.anInt2622 = arg0.anInt796;
		} else if (arg0.anInt795 != this.anInt2623 || arg0.anInt796 != this.anInt2622) {
			throw new RuntimeException();
		}
		arg0.method708(Static146.anIntArray337[8]);
		this.anInterface1Array1[8] = arg0;
		this.anInt2625 |= 0x100;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
	public void method2749(@OriginalArg(0) int arg0) {
		if (this.aClass81_Sub1_22.method1955() != this) {
			throw new RuntimeException();
		}
		this.aClass81_Sub1_22.anOpengl1.glDrawBuffer(Static146.anIntArray337[arg0]);
	}

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "()Z")
	public boolean method2750() {
		@Pc(5) int local5 = this.aClass81_Sub1_22.anOpengl1.glCheckFramebufferStatusEXT(36160);
		return local5 == 36053;
	}

	@OriginalMember(owner = "client!jd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass81_Sub1_22.method1988(this.anInt2624);
		super.finalize();
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!lb;I)V")
	private void method2751(@OriginalArg(0) int arg0, @OriginalArg(1) Class28_Sub3 arg1) {
		if (this.aClass81_Sub1_22.method1955() != this) {
			throw new RuntimeException();
		}
		@Pc(12) int local12 = 0x1 << arg0;
		if ((this.anInt2625 & ~local12) == 0) {
			this.anInt2623 = arg1.anInt1334;
			this.anInt2622 = arg1.anInt1335;
		} else if (arg1.anInt1334 != this.anInt2623 || arg1.anInt1335 != this.anInt2622) {
			throw new RuntimeException();
		}
		arg1.method1256(Static146.anIntArray337[arg0]);
		this.anInterface1Array1[arg0] = arg1;
		this.anInt2625 |= local12;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "()V")
	@Override
	public void method2742() {
		this.aClass81_Sub1_22.anOpengl1.glBindFramebufferEXT(36160, this.anInt2624);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!lb;)V")
	public void method2752(@OriginalArg(0) int arg0, @OriginalArg(1) Class28_Sub3 arg1) {
		this.method2751(arg0, arg1);
	}
}
