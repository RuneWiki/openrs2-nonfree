import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class23 implements Interface10 {

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
	private int anInt407;

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
	private int anInt408;

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
	private int anInt409;

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "[Lclient!dg;")
	private final Interface1[] anInterface1Array1 = new Interface1[9];

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "Lclient!cg;")
	private final Class37_Sub1 aClass37_Sub1_2;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
	private final int anInt406;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lclient!cg;)V")
	public Class23(@OriginalArg(0) Class37_Sub1 arg0) {
		if (!arg0.aBoolean77) {
			throw new IllegalStateException("");
		}
		this.aClass37_Sub1_2 = arg0;
		this.aClass37_Sub1_2.anOpengl1.glGenFramebuffersEXT(1, Static27.anIntArray52, 0);
		this.anInt406 = Static27.anIntArray52[0];
	}

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "()Z")
	public boolean method344() {
		@Pc(5) int local5 = this.aClass37_Sub1_2.anOpengl1.glCheckFramebufferStatusEXT(36160);
		return local5 == 36053;
	}

	@OriginalMember(owner = "client!bh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass37_Sub1_2.method783(this.anInt406);
		super.finalize();
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "()V")
	@Override
	public void method728() {
		this.aClass37_Sub1_2.anOpengl1.glBindFramebufferEXT(36160, 0);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!gm;II)V")
	private void method345(@OriginalArg(1) Class81_Sub1 arg0, @OriginalArg(3) int arg1) {
		if (this.aClass37_Sub1_2.method775() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt408 & 0xFFFFFFFE) == 0) {
			this.anInt407 = arg0.anInt2373;
			this.anInt409 = arg0.anInt2373;
		} else if (arg0.anInt2373 != this.anInt407 || arg0.anInt2373 != this.anInt409) {
			throw new RuntimeException();
		}
		arg0.method2206(Static27.anIntArray53[0], arg1);
		this.anInterface1Array1[0] = arg0;
		this.anInt408 |= 0x1;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!pq;)V")
	public void method346(@OriginalArg(0) int arg0, @OriginalArg(1) Class81_Sub4 arg1) {
		this.method347(arg0, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!pq;I)V")
	private void method347(@OriginalArg(0) int arg0, @OriginalArg(1) Class81_Sub4 arg1) {
		if (this.aClass37_Sub1_2.method775() != this) {
			throw new RuntimeException();
		}
		@Pc(12) int local12 = 0x1 << arg0;
		if ((this.anInt408 & ~local12) == 0) {
			this.anInt407 = arg1.anInt5614;
			this.anInt409 = arg1.anInt5612;
		} else if (arg1.anInt5614 != this.anInt407 || arg1.anInt5612 != this.anInt409) {
			throw new RuntimeException();
		}
		arg1.method4749(Static27.anIntArray53[arg0]);
		this.anInterface1Array1[arg0] = arg1;
		this.anInt408 |= local12;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "()V")
	@Override
	public void method727() {
		this.aClass37_Sub1_2.anOpengl1.glBindFramebufferEXT(36160, this.anInt406);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
	public void method348(@OriginalArg(0) int arg0) {
		if (this.anInterface1Array1[arg0] != null) {
			this.anInterface1Array1[arg0].method5338();
		}
		this.anInt408 &= ~(0x1 << arg0);
		this.anInterface1Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!ue;)V")
	public void method349(@OriginalArg(1) Class200 arg0) {
		if (this.aClass37_Sub1_2.method775() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt408 & 0xFFFFFEFF) == 0) {
			this.anInt407 = arg0.anInt6329;
			this.anInt409 = arg0.anInt6334;
		} else if (arg0.anInt6329 != this.anInt407 || arg0.anInt6334 != this.anInt409) {
			throw new RuntimeException();
		}
		arg0.method5340(Static27.anIntArray53[8]);
		this.anInterface1Array1[8] = arg0;
		this.anInt408 |= 0x100;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!gm;I)V")
	public void method350(@OriginalArg(1) Class81_Sub1 arg0, @OriginalArg(2) int arg1) {
		this.method345(arg0, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "()I")
	@Override
	public int method729() {
		return this.anInt409;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
	public void method351(@OriginalArg(0) int arg0) {
		if (this.aClass37_Sub1_2.method775() != this) {
			throw new RuntimeException();
		}
		this.aClass37_Sub1_2.anOpengl1.glDrawBuffer(Static27.anIntArray53[arg0]);
	}
}
