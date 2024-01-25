import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class99 implements Interface5 {

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
	private int anInt2631;

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
	private int anInt2632;

	@OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
	private int anInt2633;

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "[Lclient!ko;")
	private final Interface4[] anInterface4Array1 = new Interface4[9];

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "Lclient!fu;")
	private final Class63_Sub2 aClass63_Sub2_19;

	@OriginalMember(owner = "client!hm", name = "g", descriptor = "I")
	private final int anInt2634;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lclient!fu;)V")
	public Class99(@OriginalArg(0) Class63_Sub2 arg0) {
		if (!arg0.aBoolean167) {
			throw new IllegalStateException("");
		}
		this.aClass63_Sub2_19 = arg0;
		this.aClass63_Sub2_19.anOpengl2.glGenFramebuffersEXT(1, Static129.anIntArray538, 0);
		this.anInt2634 = Static129.anIntArray538[0];
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILclient!uo;I)V")
	private void method2531(@OriginalArg(0) int arg0, @OriginalArg(1) Class20_Sub4 arg1) {
		if (this.aClass63_Sub2_19.method2069() != this) {
			throw new RuntimeException();
		}
		@Pc(12) int local12 = 0x1 << arg0;
		if ((this.anInt2631 & ~local12) == 0) {
			this.anInt2632 = arg1.anInt6337;
			this.anInt2633 = arg1.anInt6336;
		} else if (arg1.anInt6337 != this.anInt2632 || arg1.anInt6336 != this.anInt2633) {
			throw new RuntimeException();
		}
		arg1.method5510(Static129.anIntArray537[arg0]);
		this.anInterface4Array1[arg0] = arg1;
		this.anInt2631 |= local12;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILclient!kd;)V")
	public void method2532(@OriginalArg(1) Class134 arg0) {
		if (this.aClass63_Sub2_19.method2069() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt2631 & 0xFFFFFEFF) == 0) {
			this.anInt2632 = arg0.anInt3372;
			this.anInt2633 = arg0.anInt3376;
		} else if (arg0.anInt3372 != this.anInt2632 || arg0.anInt3376 != this.anInt2633) {
			throw new RuntimeException();
		}
		arg0.method3098(Static129.anIntArray537[8]);
		this.anInterface4Array1[8] = arg0;
		this.anInt2631 |= 0x100;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "()V")
	@Override
	public void method2528() {
		this.aClass63_Sub2_19.anOpengl2.glBindFramebufferEXT(36160, this.anInt2634);
	}

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "()I")
	@Override
	public int method2530() {
		return this.anInt2633;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILclient!bl;I)V")
	public void method2533(@OriginalArg(1) Class20_Sub1 arg0, @OriginalArg(2) int arg1) {
		this.method2536(arg0, arg1);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V")
	public void method2534(@OriginalArg(0) int arg0) {
		if (this.anInterface4Array1[arg0] != null) {
			this.anInterface4Array1[arg0].method5494();
		}
		this.anInt2631 &= ~(0x1 << arg0);
		this.anInterface4Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILclient!uo;)V")
	public void method2535(@OriginalArg(0) int arg0, @OriginalArg(1) Class20_Sub4 arg1) {
		this.method2531(arg0, arg1);
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "()V")
	@Override
	public void method2529() {
		this.aClass63_Sub2_19.anOpengl2.glBindFramebufferEXT(36160, 0);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILclient!bl;II)V")
	private void method2536(@OriginalArg(1) Class20_Sub1 arg0, @OriginalArg(3) int arg1) {
		if (this.aClass63_Sub2_19.method2069() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt2631 & 0xFFFFFFFE) == 0) {
			this.anInt2632 = arg0.anInt628;
			this.anInt2633 = arg0.anInt628;
		} else if (arg0.anInt628 != this.anInt2632 || arg0.anInt628 != this.anInt2633) {
			throw new RuntimeException();
		}
		arg0.method541(Static129.anIntArray537[0], arg1);
		this.anInterface4Array1[0] = arg0;
		this.anInt2631 |= 0x1;
	}

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "()Z")
	public boolean method2537() {
		@Pc(5) int local5 = this.aClass63_Sub2_19.anOpengl2.glCheckFramebufferStatusEXT(36160);
		return local5 == 36053;
	}

	@OriginalMember(owner = "client!hm", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass63_Sub2_19.method2121(this.anInt2634);
		super.finalize();
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V")
	public void method2538(@OriginalArg(0) int arg0) {
		if (this.aClass63_Sub2_19.method2069() != this) {
			throw new RuntimeException();
		}
		this.aClass63_Sub2_19.anOpengl2.glDrawBuffer(Static129.anIntArray537[arg0]);
	}
}
