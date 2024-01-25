import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class89 implements Interface17 {

	@OriginalMember(owner = "client!er", name = "m", descriptor = "I")
	private int anInt2341;

	@OriginalMember(owner = "client!er", name = "y", descriptor = "I")
	private int anInt2352;

	@OriginalMember(owner = "client!er", name = "B", descriptor = "I")
	private int anInt2355;

	@OriginalMember(owner = "client!er", name = "a", descriptor = "I")
	private int anInt2330 = 0;

	@OriginalMember(owner = "client!er", name = "b", descriptor = "I")
	private int anInt2331 = -1;

	@OriginalMember(owner = "client!er", name = "q", descriptor = "[Lclient!ln;")
	private final Interface12[] anInterface12Array1 = new Interface12[9];

	@OriginalMember(owner = "client!er", name = "j", descriptor = "Lclient!mh;")
	private final Class4_Sub3 aClass4_Sub3_9;

	@OriginalMember(owner = "client!er", name = "e", descriptor = "I")
	private final int anInt2334;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lclient!mh;)V")
	public Class89(@OriginalArg(0) Class4_Sub3 arg0) {
		if (!arg0.aBoolean448) {
			throw new IllegalStateException("");
		}
		this.aClass4_Sub3_9 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static91.anIntArray793, 0);
		this.anInt2334 = Static91.anIntArray793[0];
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "(I)V")
	@Override
	public void method2251() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt2334);
		this.anInt2330 |= 0x2;
		this.anInt2331 = this.method2254();
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IB)V")
	public void method2253(@OriginalArg(0) int arg0) {
		if (this.anInterface12Array1[arg0] != null) {
			this.anInterface12Array1[arg0].method8143();
		}
		this.anInt2355 &= ~(0x1 << arg0);
		this.anInterface12Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V")
	@Override
	public void method2247() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt2330 &= 0xFFFFFFFD;
		this.anInt2331 = this.method2254();
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(B)V")
	@Override
	public void method2249() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt2330 &= 0xFFFFFFFB;
		this.anInt2331 = this.method2254();
	}

	@OriginalMember(owner = "client!er", name = "e", descriptor = "(I)I")
	private int method2254() {
		if ((this.anInt2330 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt2330 & 0x2) == 0) {
			return (this.anInt2330 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IILclient!rr;I)V")
	private void method2255(@OriginalArg(1) int arg0, @OriginalArg(2) Class164_Sub3 arg1) {
		if (this.anInt2331 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg0;
		if ((this.anInt2355 & ~local15) == 0) {
			this.anInt2341 = arg1.anInt9468;
			this.anInt2352 = arg1.anInt9475;
		} else if (arg1.anInt9475 != this.anInt2352 || this.anInt2341 != arg1.anInt9468) {
			throw new RuntimeException();
		}
		arg1.method8155(this.anInt2331, Static468.anIntArray739[arg0]);
		this.anInterface12Array1[arg0] = arg1;
		this.anInt2355 |= local15;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IILclient!dca;)V")
	public void method2256(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub2_Sub5 arg1) {
		if (this.anInt2331 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg0;
		if ((~local15 & this.anInt2355) == 0) {
			this.anInt2352 = arg1.anInt1844;
			this.anInt2341 = arg1.anInt1845;
		} else if (arg1.anInt1844 != this.anInt2352 || arg1.anInt1845 != this.anInt2341) {
			throw new RuntimeException();
		}
		arg1.method1788(Static468.anIntArray739[arg0], this.anInt2331);
		this.anInterface12Array1[arg0] = arg1;
		this.anInt2355 |= local15;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BI)V")
	public void method2258(@OriginalArg(1) int arg0) {
		if (this.anInt2331 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static468.anIntArray739[arg0]);
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "(B)I")
	public int method2260() {
		return this.anInt2341;
	}

	@OriginalMember(owner = "client!er", name = "f", descriptor = "(I)Z")
	public boolean method2261() {
		@Pc(13) int local13 = OpenGL.glCheckFramebufferStatusEXT(this.anInt2331);
		return local13 == 36053;
	}

	@OriginalMember(owner = "client!er", name = "d", descriptor = "(I)V")
	@Override
	public void method2252() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt2330 &= 0xFFFFFFFE;
		this.anInt2331 = this.method2254();
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ILclient!rr;I)V")
	public void method2262(@OriginalArg(0) int arg0, @OriginalArg(1) Class164_Sub3 arg1) {
		this.method2255(arg0, arg1);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIILclient!kh;I)V")
	private void method2263(@OriginalArg(3) Class164_Sub1 arg0, @OriginalArg(4) int arg1) {
		if (this.anInt2331 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt2355 & 0xFFFFFFFE) == 0) {
			this.anInt2341 = arg0.anInt4799;
			this.anInt2352 = arg0.anInt4799;
		} else if (arg0.anInt4799 != this.anInt2352 || arg0.anInt4799 != this.anInt2341) {
			throw new RuntimeException();
		}
		arg0.method4428(this.anInt2331, Static468.anIntArray739[0], arg1);
		this.anInterface12Array1[0] = arg0;
		this.anInt2355 |= 0x1;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(II)V")
	public void method2264() {
		if (this.anInt2331 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static468.anIntArray739[0]);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BIILclient!kh;)V")
	public void method2265(@OriginalArg(2) int arg0, @OriginalArg(3) Class164_Sub1 arg1) {
		this.method2263(arg1, arg0);
	}

	@OriginalMember(owner = "client!er", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass4_Sub3_9.method5289(this.anInt2334);
		super.finalize();
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V")
	@Override
	public void method2248() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt2334);
		this.anInt2330 |= 0x1;
		this.anInt2331 = this.method2254();
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(I)V")
	@Override
	public void method2250() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt2334);
		this.anInt2330 |= 0x4;
		this.anInt2331 = this.method2254();
	}
}
