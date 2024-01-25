import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ffa")
public final class Class105 implements Interface22 {

	@OriginalMember(owner = "client!ffa", name = "q", descriptor = "I")
	private int anInt2291;

	@OriginalMember(owner = "client!ffa", name = "s", descriptor = "I")
	private int anInt2293;

	@OriginalMember(owner = "client!ffa", name = "t", descriptor = "I")
	private int anInt2294;

	@OriginalMember(owner = "client!ffa", name = "r", descriptor = "I")
	private int anInt2292 = 0;

	@OriginalMember(owner = "client!ffa", name = "x", descriptor = "[Lclient!dv;")
	private final Interface7[] anInterface7Array1 = new Interface7[9];

	@OriginalMember(owner = "client!ffa", name = "z", descriptor = "I")
	private int anInt2299 = -1;

	@OriginalMember(owner = "client!ffa", name = "k", descriptor = "Lclient!uca;")
	private final Class162_Sub3 aClass162_Sub3_16;

	@OriginalMember(owner = "client!ffa", name = "h", descriptor = "I")
	private final int anInt2283;

	@OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(Lclient!uca;)V")
	public Class105(@OriginalArg(0) Class162_Sub3 arg0) {
		if (!arg0.aBoolean721) {
			throw new IllegalStateException("");
		}
		this.aClass162_Sub3_16 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static5.anIntArray6, 0);
		this.anInt2283 = Static5.anIntArray6[0];
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ILclient!aaa;I)V")
	public void method1940(@OriginalArg(1) Class3_Sub1 arg0, @OriginalArg(2) int arg1) {
		this.method1945(arg0, arg1);
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ILclient!eg;II)V")
	public void method1941(@OriginalArg(1) Class3_Sub3 arg0, @OriginalArg(2) int arg1) {
		this.method1942(arg1, arg0);
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IILclient!eg;II)V")
	private void method1942(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub3 arg1) {
		if (this.anInt2299 == -1) {
			throw new RuntimeException();
		}
		if ((-2 & this.anInt2293) == 0) {
			this.anInt2291 = arg1.anInt2042;
			this.anInt2294 = arg1.anInt2042;
		} else if (arg1.anInt2042 != this.anInt2294 || arg1.anInt2042 != this.anInt2291) {
			throw new RuntimeException();
		}
		arg1.method1698(this.anInt2299, Static270.anIntArray317[0], arg0);
		this.anInterface7Array1[0] = arg1;
		this.anInt2293 |= 0x1;
	}

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "(I)Z")
	public boolean method1943() {
		@Pc(12) int local12 = OpenGL.glCheckFramebufferStatusEXT(this.anInt2299);
		return local12 == 36053;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(B)V")
	@Override
	public void method1934() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt2283);
		this.anInt2292 |= 0x4;
		this.anInt2299 = this.method1947();
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!dh;IZ)V")
	public void method1944(@OriginalArg(0) Class2_Sub2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt2299 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg1;
		if ((~local15 & this.anInt2293) == 0) {
			this.anInt2294 = arg0.anInt1648;
			this.anInt2291 = arg0.anInt1658;
		} else if (this.anInt2294 != arg0.anInt1648 || arg0.anInt1658 != this.anInt2291) {
			throw new RuntimeException();
		}
		arg0.method1385(Static270.anIntArray317[arg1], this.anInt2299);
		this.anInterface7Array1[arg1] = arg0;
		this.anInt2293 |= local15;
	}

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "(B)V")
	@Override
	public void method1937() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt2283);
		this.anInt2292 |= 0x1;
		this.anInt2299 = this.method1947();
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!aaa;BII)V")
	private void method1945(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt2299 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg1;
		if ((this.anInt2293 & ~local16) == 0) {
			this.anInt2291 = arg0.anInt2069;
			this.anInt2294 = arg0.anInt2066;
		} else if (arg0.anInt2066 != this.anInt2294 || arg0.anInt2069 != this.anInt2291) {
			throw new RuntimeException();
		}
		arg0.method1717(this.anInt2299, Static270.anIntArray317[arg1]);
		this.anInterface7Array1[arg1] = arg0;
		this.anInt2293 |= local16;
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(Z)I")
	private int method1947() {
		if ((this.anInt2292 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt2292 & 0x2) == 0) {
			return (this.anInt2292 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(II)V")
	public void method1949(@OriginalArg(0) int arg0) {
		if (this.anInterface7Array1[arg0] != null) {
			this.anInterface7Array1[arg0].method5566();
		}
		this.anInt2293 &= ~(0x1 << arg0);
		this.anInterface7Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I)V")
	@Override
	public void method1935() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt2292 &= 0xFFFFFFFB;
		this.anInt2299 = this.method1947();
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(II)V")
	public void method1950(@OriginalArg(0) int arg0) {
		if (this.anInt2299 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static270.anIntArray317[arg0]);
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(I)V")
	@Override
	public void method1938() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt2292 &= 0xFFFFFFFE;
		this.anInt2299 = this.method1947();
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(B)V")
	@Override
	public void method1936() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt2283);
		this.anInt2292 |= 0x2;
		this.anInt2299 = this.method1947();
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Z)V")
	@Override
	public void method1939() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt2292 &= 0xFFFFFFFD;
		this.anInt2299 = this.method1947();
	}

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "(II)V")
	public void method1951() {
		if (this.anInt2299 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static270.anIntArray317[0]);
	}

	@OriginalMember(owner = "client!ffa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass162_Sub3_16.method6967(this.anInt2283);
		super.finalize();
	}
}
