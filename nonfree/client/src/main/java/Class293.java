import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public final class Class293 implements Interface19 {

	@OriginalMember(owner = "client!rq", name = "e", descriptor = "I")
	private int anInt7563;

	@OriginalMember(owner = "client!rq", name = "y", descriptor = "I")
	private int anInt7581;

	@OriginalMember(owner = "client!rq", name = "E", descriptor = "I")
	private int anInt7586;

	@OriginalMember(owner = "client!rq", name = "h", descriptor = "I")
	private int anInt7566 = 0;

	@OriginalMember(owner = "client!rq", name = "p", descriptor = "I")
	private int anInt7574 = -1;

	@OriginalMember(owner = "client!rq", name = "A", descriptor = "[Lclient!jn;")
	private final Interface12[] anInterface12Array1 = new Interface12[9];

	@OriginalMember(owner = "client!rq", name = "s", descriptor = "Lclient!us;")
	private final Class43_Sub3 aClass43_Sub3_34;

	@OriginalMember(owner = "client!rq", name = "j", descriptor = "I")
	private final int anInt7568;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!us;)V")
	public Class293(@OriginalArg(0) Class43_Sub3 arg0) {
		if (!arg0.aBoolean676) {
			throw new IllegalStateException("");
		}
		this.aClass43_Sub3_34 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static222.anIntArray703, 0);
		this.anInt7568 = Static222.anIntArray703[0];
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(II)V")
	public void method6411(@OriginalArg(0) int arg0) {
		if (this.anInterface12Array1[arg0] != null) {
			this.anInterface12Array1[arg0].method4969();
		}
		this.anInt7581 &= ~(0x1 << arg0);
		this.anInterface12Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZI)V")
	public void method6412(@OriginalArg(1) int arg0) {
		if (this.anInt7574 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static444.anIntArray574[arg0]);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V")
	@Override
	public void method6405() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt7566 &= 0xFFFFFFFB;
		this.anInt7574 = this.method6425();
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Z)V")
	@Override
	public void method6407() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt7566 &= 0xFFFFFFFE;
		this.anInt7574 = this.method6425();
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IB)V")
	public void method6413() {
		if (this.anInt7574 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static444.anIntArray574[0]);
	}

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "(B)Z")
	public boolean method6416() {
		@Pc(7) int local7 = OpenGL.glCheckFramebufferStatusEXT(this.anInt7574);
		return local7 == 36053;
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(B)V")
	@Override
	public void method6408() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt7568);
		this.anInt7566 |= 0x2;
		this.anInt7574 = this.method6425();
	}

	@OriginalMember(owner = "client!rq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass43_Sub3_34.method7227(this.anInt7568);
		super.finalize();
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(I)V")
	@Override
	public void method6409() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt7568);
		this.anInt7566 |= 0x1;
		this.anInt7574 = this.method6425();
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V")
	@Override
	public void method6406() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt7566 &= 0xFFFFFFFD;
		this.anInt7574 = this.method6425();
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lclient!mda;BII)V")
	public void method6419(@OriginalArg(0) Class34_Sub4 arg0, @OriginalArg(2) int arg1) {
		this.method6420(arg1, arg0);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IILclient!mda;II)V")
	private void method6420(@OriginalArg(0) int arg0, @OriginalArg(2) Class34_Sub4 arg1) {
		if (this.anInt7574 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt7581 & 0xFFFFFFFE) == 0) {
			this.anInt7586 = arg1.anInt5777;
			this.anInt7563 = arg1.anInt5777;
		} else if (arg1.anInt5777 != this.anInt7563 || arg1.anInt5777 != this.anInt7586) {
			throw new RuntimeException();
		}
		arg1.method4979(this.anInt7574, Static444.anIntArray574[0], arg0);
		this.anInterface12Array1[0] = arg1;
		this.anInt7581 |= 0x1;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lclient!db;BI)V")
	public void method6421(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(2) int arg1) {
		this.method6422(arg1, arg0);
	}

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "(I)V")
	@Override
	public void method6410() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt7568);
		this.anInt7566 |= 0x4;
		this.anInt7574 = this.method6425();
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IILclient!db;B)V")
	private void method6422(@OriginalArg(1) int arg0, @OriginalArg(2) Class34_Sub2 arg1) {
		if (this.anInt7574 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg0;
		if ((this.anInt7581 & ~local16) == 0) {
			this.anInt7563 = arg1.anInt2179;
			this.anInt7586 = arg1.anInt2188;
		} else if (this.anInt7563 != arg1.anInt2179 || this.anInt7586 != arg1.anInt2188) {
			throw new RuntimeException();
		}
		arg1.method1959(Static444.anIntArray574[arg0], this.anInt7574);
		this.anInterface12Array1[arg0] = arg1;
		this.anInt7581 |= local16;
	}

	@OriginalMember(owner = "client!rq", name = "e", descriptor = "(I)I")
	private int method6425() {
		if ((this.anInt7566 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt7566 & 0x2) == 0) {
			return (this.anInt7566 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(BILclient!ht;)V")
	public void method6426(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub3_Sub12 arg1) {
		if (this.anInt7574 == -1) {
			throw new RuntimeException();
		}
		@Pc(23) int local23 = 0x1 << arg0;
		if ((~local23 & this.anInt7581) == 0) {
			this.anInt7586 = arg1.anInt4176;
			this.anInt7563 = arg1.anInt4179;
		} else if (arg1.anInt4179 != this.anInt7563 || this.anInt7586 != arg1.anInt4176) {
			throw new RuntimeException();
		}
		arg1.method3698(Static444.anIntArray574[arg0], this.anInt7574);
		this.anInterface12Array1[arg0] = arg1;
		this.anInt7581 |= local23;
	}
}
