import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class228 implements Interface8 {

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "[I")
	private static final int[] anIntArray433 = new int[1];

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "[I")
	private static final int[] anIntArray434 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
	private int anInt6391;

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
	private int anInt6392;

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
	private int anInt6393;

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "[Lclient!aq;")
	private final Interface1[] anInterface1Array1 = new Interface1[9];

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "Lclient!bf;")
	private final Class19_Sub1 aClass19_Sub1_37;

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
	private final int anInt6394;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lclient!bf;)V", line = 131)
	public Class228(@OriginalArg(0) Class19_Sub1 arg0) {
		if (!arg0.aBoolean36) {
			throw new IllegalStateException("");
		}
		this.aClass19_Sub1_37 = arg0;
		this.aClass19_Sub1_37.anOpengl1.glGenFramebuffersEXT(1, anIntArray433, 0);
		this.anInt6394 = anIntArray433[0];
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!al;)V", line = 3)
	public void method5795(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub1 arg1) {
		this.method5798(arg0, arg1);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!qd;II)V", line = 7)
	private void method5796(@OriginalArg(1) Class8_Sub3 arg0, @OriginalArg(3) int arg1) {
		if (this.aClass19_Sub1_37.method821() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt6393 & 0xFFFFFFFE) == 0) {
			this.anInt6392 = arg0.anInt5157;
			this.anInt6391 = arg0.anInt5157;
		} else if (arg0.anInt5157 != this.anInt6392 || arg0.anInt5157 != this.anInt6391) {
			throw new RuntimeException();
		}
		arg0.method4741(anIntArray434[0], arg1);
		this.anInterface1Array1[0] = arg0;
		this.anInt6393 |= 0x1;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V", line = 30)
	public void method5797(@OriginalArg(0) int arg0) {
		if (this.aClass19_Sub1_37.method821() != this) {
			throw new RuntimeException();
		}
		this.aClass19_Sub1_37.anOpengl1.glDrawBuffer(anIntArray434[arg0]);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!al;I)V", line = 36)
	private void method5798(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub1 arg1) {
		if (this.aClass19_Sub1_37.method821() != this) {
			throw new RuntimeException();
		}
		@Pc(12) int local12 = 0x1 << arg0;
		if ((this.anInt6393 & ~local12) == 0) {
			this.anInt6392 = arg1.anInt3680;
			this.anInt6391 = arg1.anInt3681;
		} else if (arg1.anInt3680 != this.anInt6392 || arg1.anInt3681 != this.anInt6391) {
			throw new RuntimeException();
		}
		arg1.method3640(anIntArray434[arg0]);
		this.anInterface1Array1[arg0] = arg1;
		this.anInt6393 |= local12;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "()V", line = 62)
	@Override
	public void method5792() {
		this.aClass19_Sub1_37.anOpengl1.glBindFramebufferEXT(36160, this.anInt6394);
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "()V", line = 65)
	@Override
	public void method5793() {
		this.aClass19_Sub1_37.anOpengl1.glBindFramebufferEXT(36160, 0);
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V", line = 70)
	public void method5799(@OriginalArg(0) int arg0) {
		if (this.anInterface1Array1[arg0] != null) {
			this.anInterface1Array1[arg0].method6153();
		}
		this.anInt6393 &= ~(0x1 << arg0);
		this.anInterface1Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "()Z", line = 78)
	public boolean method5800() {
		@Pc(5) int local5 = this.aClass19_Sub1_37.anOpengl1.glCheckFramebufferStatusEXT(36160);
		return local5 == 36053;
	}

	@OriginalMember(owner = "client!ua", name = "finalize", descriptor = "()V", line = 89)
	@Override
	public void finalize() throws Throwable {
		this.aClass19_Sub1_37.method822(this.anInt6394);
		super.finalize();
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "()I", line = 94)
	@Override
	public int method5794() {
		return this.anInt6391;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!pq;)V", line = 107)
	public void method5801(@OriginalArg(1) Class184 arg0) {
		if (this.aClass19_Sub1_37.method821() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt6393 & 0xFFFFFEFF) == 0) {
			this.anInt6392 = arg0.anInt5057;
			this.anInt6391 = arg0.anInt5055;
		} else if (arg0.anInt5057 != this.anInt6392 || arg0.anInt5055 != this.anInt6391) {
			throw new RuntimeException();
		}
		arg0.method4650(anIntArray434[8]);
		this.anInterface1Array1[8] = arg0;
		this.anInt6393 |= 0x100;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!qd;I)V", line = 140)
	public void method5802(@OriginalArg(1) Class8_Sub3 arg0, @OriginalArg(2) int arg1) {
		this.method5796(arg0, arg1);
	}
}
