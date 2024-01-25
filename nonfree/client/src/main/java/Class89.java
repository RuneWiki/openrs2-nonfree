import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class89 implements Interface9 {

	@OriginalMember(owner = "client!ei", name = "r", descriptor = "I")
	private int anInt2605;

	@OriginalMember(owner = "client!ei", name = "t", descriptor = "I")
	private int anInt2607;

	@OriginalMember(owner = "client!ei", name = "A", descriptor = "I")
	private int anInt2614;

	@OriginalMember(owner = "client!ei", name = "w", descriptor = "I")
	private int anInt2610 = -1;

	@OriginalMember(owner = "client!ei", name = "j", descriptor = "[Lclient!ih;")
	private final Interface7[] anInterface7Array1 = new Interface7[9];

	@OriginalMember(owner = "client!ei", name = "F", descriptor = "I")
	private int anInt2617 = 0;

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "Lclient!ap;")
	private final Class9_Sub2 aClass9_Sub2_6;

	@OriginalMember(owner = "client!ei", name = "s", descriptor = "I")
	private final int anInt2606;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lclient!ap;)V")
	public Class89(@OriginalArg(0) Class9_Sub2 arg0) {
		if (!arg0.aBoolean70) {
			throw new IllegalStateException("");
		}
		this.aClass9_Sub2_6 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static567.anIntArray540, 0);
		this.anInt2606 = Static567.anIntArray540[0];
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V")
	@Override
	public void method2364() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt2617 &= 0xFFFFFFFE;
		this.anInt2610 = this.method2374();
	}

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "(I)V")
	@Override
	public void method2367() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt2617 &= 0xFFFFFFFD;
		this.anInt2610 = this.method2374();
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V")
	@Override
	public void method2362() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt2606);
		this.anInt2617 |= 0x4;
		this.anInt2610 = this.method2374();
	}

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)V")
	@Override
	public void method2366() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt2606);
		this.anInt2617 |= 0x2;
		this.anInt2610 = this.method2374();
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(B)Z")
	public boolean method2370() {
		@Pc(7) int local7 = OpenGL.glCheckFramebufferStatusEXT(this.anInt2610);
		return local7 == 36053;
	}

	@OriginalMember(owner = "client!ei", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass9_Sub2_6.method827(this.anInt2606);
		super.finalize();
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
	@Override
	public void method2363() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt2606);
		this.anInt2617 |= 0x1;
		this.anInt2610 = this.method2374();
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!rc;IB)V")
	public void method2371(@OriginalArg(0) Class6_Sub4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt2610 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg1;
		if ((this.anInt2607 & ~local16) == 0) {
			this.anInt2605 = arg0.anInt7945;
			this.anInt2614 = arg0.anInt7944;
		} else if (arg0.anInt7945 != this.anInt2605 || this.anInt2614 != arg0.anInt7944) {
			throw new RuntimeException();
		}
		arg0.method6644(this.anInt2610, Static170.anIntArray259[arg1]);
		this.anInterface7Array1[arg1] = arg0;
		this.anInt2607 |= local16;
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)V")
	@Override
	public void method2365() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt2617 &= 0xFFFFFFFB;
		this.anInt2610 = this.method2374();
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(BLclient!kp;II)V")
	private void method2373(@OriginalArg(1) Class132_Sub1 arg0, @OriginalArg(3) int arg1) {
		if (this.anInt2610 == -1) {
			throw new RuntimeException();
		}
		@Pc(20) int local20 = 0x1 << arg1;
		if ((~local20 & this.anInt2607) == 0) {
			this.anInt2614 = arg0.anInt4212;
			this.anInt2605 = arg0.anInt4217;
		} else if (arg0.anInt4217 != this.anInt2605 || this.anInt2614 != arg0.anInt4212) {
			throw new RuntimeException();
		}
		arg0.method3695(this.anInt2610, Static170.anIntArray259[arg1]);
		this.anInterface7Array1[arg1] = arg0;
		this.anInt2607 |= local20;
	}

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "(B)I")
	private int method2374() {
		if ((this.anInt2617 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt2617 & 0x2) == 0) {
			return (this.anInt2617 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IB)V")
	public void method2375() {
		if (this.anInt2610 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static170.anIntArray259[0]);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)V")
	public void method2376(@OriginalArg(0) int arg0) {
		if (this.anInt2610 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static170.anIntArray259[arg0]);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IILclient!kp;)V")
	public void method2378(@OriginalArg(1) int arg0, @OriginalArg(2) Class132_Sub1 arg1) {
		this.method2373(arg1, arg0);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILclient!ng;IZ)V")
	public void method2379(@OriginalArg(0) int arg0, @OriginalArg(1) Class132_Sub4 arg1) {
		this.method2381(arg0, arg1);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIILclient!ng;I)V")
	private void method2381(@OriginalArg(2) int arg0, @OriginalArg(3) Class132_Sub4 arg1) {
		if (this.anInt2610 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt2607 & 0xFFFFFFFE) == 0) {
			this.anInt2614 = arg1.anInt6663;
			this.anInt2605 = arg1.anInt6663;
		} else if (arg1.anInt6663 != this.anInt2605 || this.anInt2614 != arg1.anInt6663) {
			throw new RuntimeException();
		}
		arg1.method5619(arg0, this.anInt2610, Static170.anIntArray259[0]);
		this.anInterface7Array1[0] = arg1;
		this.anInt2607 |= 0x1;
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)V")
	public void method2382(@OriginalArg(0) int arg0) {
		if (this.anInterface7Array1[arg0] != null) {
			this.anInterface7Array1[arg0].method6643();
		}
		this.anInt2607 &= ~(0x1 << arg0);
		this.anInterface7Array1[arg0] = null;
	}
}
