import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ct")
public final class Class42 implements Interface8 {

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "I")
	private int anInt943;

	@OriginalMember(owner = "client!ct", name = "f", descriptor = "I")
	private int anInt944;

	@OriginalMember(owner = "client!ct", name = "g", descriptor = "I")
	private int anInt945;

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "[Lclient!jp;")
	private final Interface5[] anInterface5Array1 = new Interface5[9];

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "Lclient!qi;")
	private final Class82_Sub2 aClass82_Sub2_13;

	@OriginalMember(owner = "client!ct", name = "h", descriptor = "I")
	private final int anInt946;

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lclient!qi;)V")
	public Class42(@OriginalArg(0) Class82_Sub2 arg0) {
		if (!arg0.aBoolean406) {
			throw new IllegalStateException("");
		}
		this.aClass82_Sub2_13 = arg0;
		this.aClass82_Sub2_13.anOpengl2.glGenFramebuffersEXT(1, Static49.anIntArray132, 0);
		this.anInt946 = Static49.anIntArray132[0];
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILclient!ai;I)V")
	private void method926(@OriginalArg(0) int arg0, @OriginalArg(1) Class7_Sub1 arg1) {
		if (this.aClass82_Sub2_13.method4607() != this) {
			throw new RuntimeException();
		}
		@Pc(12) int local12 = 0x1 << arg0;
		if ((this.anInt944 & ~local12) == 0) {
			this.anInt945 = arg1.anInt5435;
			this.anInt943 = arg1.anInt5434;
		} else if (arg1.anInt5435 != this.anInt945 || arg1.anInt5434 != this.anInt943) {
			throw new RuntimeException();
		}
		arg1.method4746(Static49.anIntArray131[arg0]);
		this.anInterface5Array1[arg0] = arg1;
		this.anInt944 |= local12;
	}

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "()V")
	@Override
	public void method4560() {
		this.aClass82_Sub2_13.anOpengl2.glBindFramebufferEXT(36160, 0);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "()V")
	@Override
	public void method4558() {
		this.aClass82_Sub2_13.anOpengl2.glBindFramebufferEXT(36160, this.anInt946);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V")
	public void method927(@OriginalArg(0) int arg0) {
		if (this.anInterface5Array1[arg0] != null) {
			this.anInterface5Array1[arg0].method4731();
		}
		this.anInt944 &= ~(0x1 << arg0);
		this.anInterface5Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "()I")
	@Override
	public int method4559() {
		return this.anInt943;
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(I)V")
	public void method928(@OriginalArg(0) int arg0) {
		if (this.aClass82_Sub2_13.method4607() != this) {
			throw new RuntimeException();
		}
		this.aClass82_Sub2_13.anOpengl2.glDrawBuffer(Static49.anIntArray131[arg0]);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILclient!ai;)V")
	public void method929(@OriginalArg(0) int arg0, @OriginalArg(1) Class7_Sub1 arg1) {
		this.method926(arg0, arg1);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILclient!mn;)V")
	public void method930(@OriginalArg(1) Class152 arg0) {
		if (this.aClass82_Sub2_13.method4607() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt944 & 0xFFFFFEFF) == 0) {
			this.anInt945 = arg0.anInt4072;
			this.anInt943 = arg0.anInt4070;
		} else if (arg0.anInt4072 != this.anInt945 || arg0.anInt4070 != this.anInt943) {
			throw new RuntimeException();
		}
		arg0.method3713(Static49.anIntArray131[8]);
		this.anInterface5Array1[8] = arg0;
		this.anInt944 |= 0x100;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILclient!qh;II)V")
	private void method931(@OriginalArg(1) Class7_Sub4 arg0, @OriginalArg(3) int arg1) {
		if (this.aClass82_Sub2_13.method4607() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt944 & 0xFFFFFFFE) == 0) {
			this.anInt945 = arg0.anInt5179;
			this.anInt943 = arg0.anInt5179;
		} else if (arg0.anInt5179 != this.anInt945 || arg0.anInt5179 != this.anInt943) {
			throw new RuntimeException();
		}
		arg0.method4455(Static49.anIntArray131[0], arg1);
		this.anInterface5Array1[0] = arg0;
		this.anInt944 |= 0x1;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILclient!qh;I)V")
	public void method932(@OriginalArg(1) Class7_Sub4 arg0, @OriginalArg(2) int arg1) {
		this.method931(arg0, arg1);
	}

	@OriginalMember(owner = "client!ct", name = "d", descriptor = "()Z")
	public boolean method933() {
		@Pc(5) int local5 = this.aClass82_Sub2_13.anOpengl2.glCheckFramebufferStatusEXT(36160);
		return local5 == 36053;
	}

	@OriginalMember(owner = "client!ct", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass82_Sub2_13.method4617(this.anInt946);
		super.finalize();
	}
}
