import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tv")
public final class Class238 implements Interface10 {

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "I")
	private int anInt6379;

	@OriginalMember(owner = "client!tv", name = "h", descriptor = "I")
	private int anInt6383;

	@OriginalMember(owner = "client!tv", name = "v", descriptor = "I")
	private int anInt6396;

	@OriginalMember(owner = "client!tv", name = "f", descriptor = "[Lclient!wo;")
	private final Interface11[] anInterface11Array1 = new Interface11[9];

	@OriginalMember(owner = "client!tv", name = "q", descriptor = "I")
	private int anInt6391 = 0;

	@OriginalMember(owner = "client!tv", name = "p", descriptor = "I")
	private int anInt6390 = -1;

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "Lclient!kd;")
	private final Class39_Sub2 aClass39_Sub2_38;

	@OriginalMember(owner = "client!tv", name = "i", descriptor = "I")
	private final int anInt6384;

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Lclient!kd;)V")
	public Class238(@OriginalArg(0) Class39_Sub2 arg0) {
		if (!arg0.aBoolean251) {
			throw new IllegalStateException("");
		}
		this.aClass39_Sub2_38 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static79.anIntArray134, 0);
		this.anInt6384 = Static79.anIntArray134[0];
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lclient!fo;III)V")
	private void method5313(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt6390 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg1;
		if ((this.anInt6379 & ~local15) == 0) {
			this.anInt6383 = arg0.anInt5003;
			this.anInt6396 = arg0.anInt5007;
		} else if (this.anInt6383 != arg0.anInt5003 || arg0.anInt5007 != this.anInt6396) {
			throw new RuntimeException();
		}
		arg0.method4159(Static380.anIntArray564[arg1], this.anInt6390);
		this.anInterface11Array1[arg1] = arg0;
		this.anInt6379 |= local15;
	}

	@OriginalMember(owner = "client!tv", name = "d", descriptor = "(I)V")
	@Override
	public void method5311() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt6384);
		this.anInt6391 |= 0x2;
		this.anInt6390 = this.method5319();
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Z)V")
	@Override
	public void method5307() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt6391 &= 0xFFFFFFFE;
		this.anInt6390 = this.method5319();
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IB)V")
	public void method5316(@OriginalArg(0) int arg0) {
		if (this.anInt6390 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static380.anIntArray564[arg0]);
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILclient!gb;I)V")
	public void method5317(@OriginalArg(1) Class1_Sub2_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt6390 == -1) {
			throw new RuntimeException();
		}
		@Pc(20) int local20 = 0x1 << arg1;
		if ((~local20 & this.anInt6379) == 0) {
			this.anInt6383 = arg0.anInt2483;
			this.anInt6396 = arg0.anInt2486;
		} else if (arg0.anInt2483 != this.anInt6383 || arg0.anInt2486 != this.anInt6396) {
			throw new RuntimeException();
		}
		arg0.method2214(Static380.anIntArray564[arg1], this.anInt6390);
		this.anInterface11Array1[arg1] = arg0;
		this.anInt6379 |= local20;
	}

	@OriginalMember(owner = "client!tv", name = "g", descriptor = "(I)I")
	public int method5318() {
		return this.anInt6396;
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(Z)I")
	private int method5319() {
		if ((this.anInt6391 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt6391 & 0x2) == 0) {
			return (this.anInt6391 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lclient!gl;IZI)V")
	public void method5320(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(3) int arg1) {
		this.method5325(arg0, arg1);
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)V")
	@Override
	public void method5309() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt6384);
		this.anInt6391 |= 0x4;
		this.anInt6390 = this.method5319();
	}

	@OriginalMember(owner = "client!tv", name = "h", descriptor = "(I)Z")
	public boolean method5321() {
		@Pc(13) int local13 = OpenGL.glCheckFramebufferStatusEXT(this.anInt6390);
		return local13 == 36053;
	}

	@OriginalMember(owner = "client!tv", name = "e", descriptor = "(I)V")
	@Override
	public void method5312() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt6384);
		this.anInt6391 |= 0x1;
		this.anInt6390 = this.method5319();
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)V")
	@Override
	public void method5308() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt6391 &= 0xFFFFFFFB;
		this.anInt6390 = this.method5319();
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IZ)V")
	public void method5322(@OriginalArg(0) int arg0) {
		if (this.anInterface11Array1[arg0] != null) {
			this.anInterface11Array1[arg0].method4145();
		}
		this.anInt6379 &= ~(0x1 << arg0);
		this.anInterface11Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!tv", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass39_Sub2_38.method3164(this.anInt6384);
		super.finalize();
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(IB)V")
	public void method5323() {
		if (this.anInt6390 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static380.anIntArray564[0]);
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IBLclient!fo;)V")
	public void method5324(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		this.method5313(arg1, arg0);
	}

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "(I)V")
	@Override
	public void method5310() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt6391 &= 0xFFFFFFFD;
		this.anInt6390 = this.method5319();
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IBILclient!gl;I)V")
	private void method5325(@OriginalArg(3) Class3_Sub3 arg0, @OriginalArg(4) int arg1) {
		if (this.anInt6390 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt6379 & 0xFFFFFFFE) == 0) {
			this.anInt6396 = arg0.anInt2610;
			this.anInt6383 = arg0.anInt2610;
		} else if (arg0.anInt2610 != this.anInt6383 || arg0.anInt2610 != this.anInt6396) {
			throw new RuntimeException();
		}
		arg0.method2272(this.anInt6390, Static380.anIntArray564[0], arg1);
		this.anInterface11Array1[0] = arg0;
		this.anInt6379 |= 0x1;
	}
}
