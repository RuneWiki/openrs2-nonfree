import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class197 implements Interface2 {

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
	private int anInt5962;

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
	private int anInt5963;

	@OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
	private int anInt5965;

	@OriginalMember(owner = "client!tj", name = "h", descriptor = "[Lclient!sh;")
	private final Interface9[] anInterface9Array1 = new Interface9[9];

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "Lclient!ks;")
	private final Class63_Sub1 aClass63_Sub1_38;

	@OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
	private final int anInt5964;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lclient!ks;)V")
	public Class197(@OriginalArg(0) Class63_Sub1 arg0) {
		if (!arg0.aBoolean254) {
			throw new IllegalStateException("");
		}
		this.aClass63_Sub1_38 = arg0;
		this.aClass63_Sub1_38.anOpengl1.glGenFramebuffersEXT(1, Static309.anIntArray458, 0);
		this.anInt5964 = Static309.anIntArray458[0];
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "()I")
	@Override
	public int method5354() {
		return this.anInt5962;
	}

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "()Z")
	public boolean method5356() {
		@Pc(5) int local5 = this.aClass63_Sub1_38.anOpengl1.glCheckFramebufferStatusEXT(36160);
		return local5 == 36053;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "()V")
	@Override
	public void method5353() {
		this.aClass63_Sub1_38.anOpengl1.glBindFramebufferEXT(36160, 0);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
	public void method5357(@OriginalArg(0) int arg0) {
		if (this.aClass63_Sub1_38.method3350() != this) {
			throw new RuntimeException();
		}
		this.aClass63_Sub1_38.anOpengl1.glDrawBuffer(Static309.anIntArray459[arg0]);
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "()V")
	@Override
	public void method5355() {
		this.aClass63_Sub1_38.anOpengl1.glBindFramebufferEXT(36160, this.anInt5964);
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)V")
	public void method5358(@OriginalArg(0) int arg0) {
		if (this.anInterface9Array1[arg0] != null) {
			this.anInterface9Array1[arg0].method4708();
		}
		this.anInt5963 &= ~(0x1 << arg0);
		this.anInterface9Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILclient!ea;I)V")
	public void method5359(@OriginalArg(1) Class19_Sub2 arg0, @OriginalArg(2) int arg1) {
		this.method5361(arg0, arg1);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILclient!qb;)V")
	public void method5360(@OriginalArg(0) int arg0, @OriginalArg(1) Class19_Sub3 arg1) {
		this.method5362(arg0, arg1);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILclient!ea;II)V")
	private void method5361(@OriginalArg(1) Class19_Sub2 arg0, @OriginalArg(3) int arg1) {
		if (this.aClass63_Sub1_38.method3350() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt5963 & 0xFFFFFFFE) == 0) {
			this.anInt5965 = arg0.anInt1573;
			this.anInt5962 = arg0.anInt1573;
		} else if (arg0.anInt1573 != this.anInt5965 || arg0.anInt1573 != this.anInt5962) {
			throw new RuntimeException();
		}
		arg0.method1537(Static309.anIntArray459[0], arg1);
		this.anInterface9Array1[0] = arg0;
		this.anInt5963 |= 0x1;
	}

	@OriginalMember(owner = "client!tj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass63_Sub1_38.method3353(this.anInt5964);
		super.finalize();
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILclient!qb;I)V")
	private void method5362(@OriginalArg(0) int arg0, @OriginalArg(1) Class19_Sub3 arg1) {
		if (this.aClass63_Sub1_38.method3350() != this) {
			throw new RuntimeException();
		}
		@Pc(12) int local12 = 0x1 << arg0;
		if ((this.anInt5963 & ~local12) == 0) {
			this.anInt5965 = arg1.anInt3964;
			this.anInt5962 = arg1.anInt3963;
		} else if (arg1.anInt3964 != this.anInt5965 || arg1.anInt3963 != this.anInt5962) {
			throw new RuntimeException();
		}
		arg1.method3677(Static309.anIntArray459[arg0]);
		this.anInterface9Array1[arg0] = arg1;
		this.anInt5963 |= local12;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILclient!q;)V")
	public void method5363(@OriginalArg(1) Class166 arg0) {
		if (this.aClass63_Sub1_38.method3350() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt5963 & 0xFFFFFEFF) == 0) {
			this.anInt5965 = arg0.anInt5099;
			this.anInt5962 = arg0.anInt5095;
		} else if (arg0.anInt5099 != this.anInt5965 || arg0.anInt5095 != this.anInt5962) {
			throw new RuntimeException();
		}
		arg0.method4710(Static309.anIntArray459[8]);
		this.anInterface9Array1[8] = arg0;
		this.anInt5963 |= 0x100;
	}
}
