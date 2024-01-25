import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class57 implements Interface3 {

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
	private int anInt1477;

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
	private int anInt1479;

	@OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
	private int anInt1480;

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "[Lclient!jr;")
	private final Interface5[] anInterface5Array1 = new Interface5[9];

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "Lclient!nf;")
	private final Class105_Sub1 aClass105_Sub1_12;

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
	private final int anInt1478;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lclient!nf;)V")
	public Class57(@OriginalArg(0) Class105_Sub1 arg0) {
		if (!arg0.aBoolean326) {
			throw new IllegalStateException("");
		}
		this.aClass105_Sub1_12 = arg0;
		this.aClass105_Sub1_12.anOpengl1.glGenFramebuffersEXT(1, Static70.anIntArray107, 0);
		this.anInt1478 = Static70.anIntArray107[0];
	}

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "()I")
	@Override
	public int method3559() {
		return this.anInt1480;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILclient!vm;II)V")
	private void method1234(@OriginalArg(1) Class44_Sub4 arg0, @OriginalArg(3) int arg1) {
		if (this.aClass105_Sub1_12.method3580() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt1479 & 0xFFFFFFFE) == 0) {
			this.anInt1477 = arg0.anInt6479;
			this.anInt1480 = arg0.anInt6479;
		} else if (arg0.anInt6479 != this.anInt1477 || arg0.anInt6479 != this.anInt1480) {
			throw new RuntimeException();
		}
		arg0.method5581(Static70.anIntArray108[0], arg1);
		this.anInterface5Array1[0] = arg0;
		this.anInt1479 |= 0x1;
	}

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "()Z")
	public boolean method1235() {
		@Pc(5) int local5 = this.aClass105_Sub1_12.anOpengl1.glCheckFramebufferStatusEXT(36160);
		return local5 == 36053;
	}

	@OriginalMember(owner = "client!ej", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass105_Sub1_12.method3581(this.anInt1478);
		super.finalize();
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
	public void method1236(@OriginalArg(0) int arg0) {
		if (this.aClass105_Sub1_12.method3580() != this) {
			throw new RuntimeException();
		}
		this.aClass105_Sub1_12.anOpengl1.glDrawBuffer(Static70.anIntArray108[arg0]);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILclient!ir;I)V")
	private void method1237(@OriginalArg(0) int arg0, @OriginalArg(1) Class44_Sub1 arg1) {
		if (this.aClass105_Sub1_12.method3580() != this) {
			throw new RuntimeException();
		}
		@Pc(12) int local12 = 0x1 << arg0;
		if ((this.anInt1479 & ~local12) == 0) {
			this.anInt1477 = arg1.anInt1285;
			this.anInt1480 = arg1.anInt1287;
		} else if (arg1.anInt1285 != this.anInt1477 || arg1.anInt1287 != this.anInt1480) {
			throw new RuntimeException();
		}
		arg1.method1070(Static70.anIntArray108[arg0]);
		this.anInterface5Array1[arg0] = arg1;
		this.anInt1479 |= local12;
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V")
	public void method1238(@OriginalArg(0) int arg0) {
		if (this.anInterface5Array1[arg0] != null) {
			this.anInterface5Array1[arg0].method5567();
		}
		this.anInt1479 &= ~(0x1 << arg0);
		this.anInterface5Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILclient!vm;I)V")
	public void method1239(@OriginalArg(1) Class44_Sub4 arg0, @OriginalArg(2) int arg1) {
		this.method1234(arg0, arg1);
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "()V")
	@Override
	public void method3558() {
		this.aClass105_Sub1_12.anOpengl1.glBindFramebufferEXT(36160, 0);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILclient!tm;)V")
	public void method1240(@OriginalArg(1) Class195 arg0) {
		if (this.aClass105_Sub1_12.method3580() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt1479 & 0xFFFFFEFF) == 0) {
			this.anInt1477 = arg0.anInt6020;
			this.anInt1480 = arg0.anInt6021;
		} else if (arg0.anInt6020 != this.anInt1477 || arg0.anInt6021 != this.anInt1480) {
			throw new RuntimeException();
		}
		arg0.method5221(Static70.anIntArray108[8]);
		this.anInterface5Array1[8] = arg0;
		this.anInt1479 |= 0x100;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "()V")
	@Override
	public void method3557() {
		this.aClass105_Sub1_12.anOpengl1.glBindFramebufferEXT(36160, this.anInt1478);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILclient!ir;)V")
	public void method1241(@OriginalArg(0) int arg0, @OriginalArg(1) Class44_Sub1 arg1) {
		this.method1237(arg0, arg1);
	}
}
