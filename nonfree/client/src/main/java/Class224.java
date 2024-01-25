import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class224 implements Interface2 {

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
	private int anInt6334;

	@OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
	private int anInt6335;

	@OriginalMember(owner = "client!sk", name = "s", descriptor = "I")
	private int anInt6348;

	@OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
	private int anInt6343 = 0;

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "[Lclient!lh;")
	private final Interface8[] anInterface8Array1 = new Interface8[9];

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
	private int anInt6333 = -1;

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "Lclient!nq;")
	private final Class167_Sub1 aClass167_Sub1_39;

	@OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
	private final int anInt6346;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lclient!nq;)V")
	public Class224(@OriginalArg(0) Class167_Sub1 arg0) {
		if (!arg0.aBoolean343) {
			throw new IllegalStateException("");
		}
		this.aClass167_Sub1_39 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static215.anIntArray268, 0);
		this.anInt6346 = Static215.anIntArray268[0];
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIZLclient!us;I)V")
	private void method5223(@OriginalArg(3) Class137_Sub4 arg0, @OriginalArg(4) int arg1) {
		if (this.anInt6333 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt6348 & 0xFFFFFFFE) == 0) {
			this.anInt6335 = arg0.anInt7153;
			this.anInt6334 = arg0.anInt7153;
		} else if (arg0.anInt7153 != this.anInt6334 || this.anInt6335 != arg0.anInt7153) {
			throw new RuntimeException();
		}
		arg0.method5788(arg1, this.anInt6333, Static212.anIntArray231[0]);
		this.anInterface8Array1[0] = arg0;
		this.anInt6348 |= 0x1;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V")
	@Override
	public void method5217() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt6346);
		this.anInt6343 |= 0x1;
		this.anInt6333 = this.method5224();
	}

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "(B)I")
	private int method5224() {
		if ((this.anInt6343 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt6343 & 0x2) == 0) {
			return (this.anInt6343 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IBLclient!wv;)V")
	public void method5225(@OriginalArg(0) int arg0, @OriginalArg(2) Class137_Sub1 arg1) {
		this.method5231(arg0, arg1);
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)V")
	@Override
	public void method5220() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt6343 &= 0xFFFFFFFB;
		this.anInt6333 = this.method5224();
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)V")
	@Override
	public void method5218() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt6346);
		this.anInt6343 |= 0x4;
		this.anInt6333 = this.method5224();
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)V")
	public void method5228(@OriginalArg(1) int arg0) {
		if (this.anInt6333 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static212.anIntArray231[arg0]);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILclient!us;II)V")
	public void method5229(@OriginalArg(1) Class137_Sub4 arg0, @OriginalArg(3) int arg1) {
		this.method5223(arg0, arg1);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V")
	@Override
	public void method5219() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt6346);
		this.anInt6343 |= 0x2;
		this.anInt6333 = this.method5224();
	}

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)V")
	@Override
	public void method5221() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt6343 &= 0xFFFFFFFE;
		this.anInt6333 = this.method5224();
	}

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "(I)Z")
	public boolean method5230() {
		@Pc(7) int local7 = OpenGL.glCheckFramebufferStatusEXT(this.anInt6333);
		return local7 == 36053;
	}

	@OriginalMember(owner = "client!sk", name = "d", descriptor = "(I)V")
	@Override
	public void method5222() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt6343 &= 0xFFFFFFFD;
		this.anInt6333 = this.method5224();
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILclient!wv;II)V")
	private void method5231(@OriginalArg(0) int arg0, @OriginalArg(1) Class137_Sub1 arg1) {
		if (this.anInt6333 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg0;
		if ((~local15 & this.anInt6348) == 0) {
			this.anInt6334 = arg1.anInt3911;
			this.anInt6335 = arg1.anInt3916;
		} else if (arg1.anInt3911 != this.anInt6334 || this.anInt6335 != arg1.anInt3916) {
			throw new RuntimeException();
		}
		arg1.method3347(this.anInt6333, Static212.anIntArray231[arg0]);
		this.anInterface8Array1[arg0] = arg1;
		this.anInt6348 |= local15;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IZLclient!in;)V")
	public void method5232(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub3_Sub12 arg1) {
		if (this.anInt6333 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg0;
		if ((this.anInt6348 & ~local16) == 0) {
			this.anInt6335 = arg1.anInt3319;
			this.anInt6334 = arg1.anInt3312;
		} else if (this.anInt6334 != arg1.anInt3312 || this.anInt6335 != arg1.anInt3319) {
			throw new RuntimeException();
		}
		arg1.method2849(this.anInt6333, Static212.anIntArray231[arg0]);
		this.anInterface8Array1[arg0] = arg1;
		this.anInt6348 |= local16;
	}

	@OriginalMember(owner = "client!sk", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass167_Sub1_39.method4021(this.anInt6346);
		super.finalize();
	}

	@OriginalMember(owner = "client!sk", name = "g", descriptor = "(I)I")
	public int method5233() {
		return this.anInt6335;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IB)V")
	public void method5234(@OriginalArg(0) int arg0) {
		if (this.anInterface8Array1[arg0] != null) {
			this.anInterface8Array1[arg0].method5778();
		}
		this.anInt6348 &= ~(0x1 << arg0);
		this.anInterface8Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(IB)V")
	public void method5237() {
		if (this.anInt6333 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static212.anIntArray231[0]);
	}
}
