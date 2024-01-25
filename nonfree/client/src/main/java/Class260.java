import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class260 implements Interface3 {

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
	private int anInt7260;

	@OriginalMember(owner = "client!vn", name = "s", descriptor = "I")
	private int anInt7273;

	@OriginalMember(owner = "client!vn", name = "y", descriptor = "I")
	private int anInt7278;

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
	private int anInt7258 = -1;

	@OriginalMember(owner = "client!vn", name = "u", descriptor = "I")
	private int anInt7275 = 0;

	@OriginalMember(owner = "client!vn", name = "w", descriptor = "[Lclient!pq;")
	private final Interface9[] anInterface9Array1 = new Interface9[9];

	@OriginalMember(owner = "client!vn", name = "f", descriptor = "Lclient!da;")
	private final Class50_Sub1 aClass50_Sub1_40;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "I")
	private final int anInt7257;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class260(@OriginalArg(0) Class50_Sub1 arg0) {
		if (!arg0.aBoolean98) {
			throw new IllegalStateException("");
		}
		this.aClass50_Sub1_40 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static377.anIntArray12, 0);
		this.anInt7257 = Static377.anIntArray12[0];
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IILclient!sq;)V")
	public void method5729(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub1 arg1) {
		this.method5734(arg1, arg0);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IILclient!wa;)V")
	public void method5730(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub1_Sub18 arg1) {
		if (this.anInt7258 == -1) {
			throw new RuntimeException();
		}
		@Pc(17) int local17 = 0x1 << arg0;
		if ((~local17 & this.anInt7260) == 0) {
			this.anInt7273 = arg1.anInt7393;
			this.anInt7278 = arg1.anInt7396;
		} else if (arg1.anInt7396 != this.anInt7278 || arg1.anInt7393 != this.anInt7273) {
			throw new RuntimeException();
		}
		arg1.method5900(this.anInt7258, Static380.anIntArray634[arg0]);
		this.anInterface9Array1[arg0] = arg1;
		this.anInt7260 |= local17;
	}

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "(I)V")
	@Override
	public void method5727() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt7275 &= 0xFFFFFFFD;
		this.anInt7258 = this.method5737();
	}

	@OriginalMember(owner = "client!vn", name = "f", descriptor = "(I)V")
	@Override
	public void method5728() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt7275 &= 0xFFFFFFFE;
		this.anInt7258 = this.method5737();
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)V")
	public void method5731(@OriginalArg(1) int arg0) {
		if (this.anInt7258 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static380.anIntArray634[arg0]);
	}

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "(I)V")
	@Override
	public void method5726() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt7257);
		this.anInt7275 |= 0x2;
		this.anInt7258 = this.method5737();
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(II)V")
	public void method5732(@OriginalArg(0) int arg0) {
		if (this.anInterface9Array1[arg0] != null) {
			this.anInterface9Array1[arg0].method5899();
		}
		this.anInt7260 &= ~(0x1 << arg0);
		this.anInterface9Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!dl;IIZI)V")
	private void method5733(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt7258 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt7260 & 0xFFFFFFFE) == 0) {
			this.anInt7273 = arg0.anInt1545;
			this.anInt7278 = arg0.anInt1545;
		} else if (arg0.anInt1545 != this.anInt7278 || this.anInt7273 != arg0.anInt1545) {
			throw new RuntimeException();
		}
		arg0.method1416(arg1, this.anInt7258, Static380.anIntArray634[0]);
		this.anInterface9Array1[0] = arg0;
		this.anInt7260 |= 0x1;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!sq;IIB)V")
	private void method5734(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt7258 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg1;
		if ((this.anInt7260 & ~local15) == 0) {
			this.anInt7273 = arg0.anInt208;
			this.anInt7278 = arg0.anInt199;
		} else if (this.anInt7278 != arg0.anInt199 || this.anInt7273 != arg0.anInt208) {
			throw new RuntimeException();
		}
		arg0.method153(this.anInt7258, Static380.anIntArray634[arg1]);
		this.anInterface9Array1[arg1] = arg0;
		this.anInt7260 |= local15;
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)V")
	@Override
	public void method5725() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt7257);
		this.anInt7275 |= 0x4;
		this.anInt7258 = this.method5737();
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Z)Z")
	public boolean method5736() {
		@Pc(7) int local7 = OpenGL.glCheckFramebufferStatusEXT(this.anInt7258);
		return local7 == 36053;
	}

	@OriginalMember(owner = "client!vn", name = "h", descriptor = "(I)I")
	private int method5737() {
		if ((this.anInt7275 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt7275 & 0x2) == 0) {
			return (this.anInt7275 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
	@Override
	public void method5723() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt7275 &= 0xFFFFFFFB;
		this.anInt7258 = this.method5737();
	}

	@OriginalMember(owner = "client!vn", name = "i", descriptor = "(I)I")
	public int method5738() {
		return this.anInt7273;
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
	@Override
	public void method5724() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt7257);
		this.anInt7275 |= 0x1;
		this.anInt7258 = this.method5737();
	}

	@OriginalMember(owner = "client!vn", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass50_Sub1_40.method1258(this.anInt7257);
		super.finalize();
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(II)V")
	public void method5739() {
		if (this.anInt7258 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static380.anIntArray634[0]);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IILclient!dl;Z)V")
	public void method5740(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub2 arg1) {
		this.method5733(arg1, arg0);
	}
}
