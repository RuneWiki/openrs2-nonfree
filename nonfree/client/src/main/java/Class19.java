import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class19 implements Interface3 {

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
	private int anInt367;

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
	private int anInt371;

	@OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
	private int anInt379;

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "[Lclient!pb;")
	private final Interface7[] anInterface7Array1 = new Interface7[9];

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
	private int anInt374 = -1;

	@OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
	private int anInt380 = 0;

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "Lclient!qg;")
	private final Class121_Sub2 aClass121_Sub2_3;

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
	private final int anInt368;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!qg;)V")
	public Class19(@OriginalArg(0) Class121_Sub2 arg0) {
		if (!arg0.aBoolean466) {
			throw new IllegalStateException("");
		}
		this.aClass121_Sub2_3 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static386.anIntArray505, 0);
		this.anInt368 = Static386.anIntArray505[0];
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
	@Override
	public void method304() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt380 &= 0xFFFFFFFD;
		this.anInt374 = this.method319();
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V")
	public void method310(@OriginalArg(1) int arg0) {
		if (this.anInt374 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static374.anIntArray501[arg0]);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IILclient!jp;I)V")
	private void method311(@OriginalArg(0) int arg0, @OriginalArg(2) Class21_Sub2 arg1) {
		if (this.anInt374 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg0;
		if ((this.anInt367 & ~local16) == 0) {
			this.anInt379 = arg1.anInt4198;
			this.anInt371 = arg1.anInt4199;
		} else if (arg1.anInt4199 != this.anInt371 || this.anInt379 != arg1.anInt4198) {
			throw new RuntimeException();
		}
		arg1.method3485(Static374.anIntArray501[arg0], this.anInt374);
		this.anInterface7Array1[arg0] = arg1;
		this.anInt367 |= local16;
	}

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "(B)V")
	@Override
	public void method308() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt380 &= 0xFFFFFFFE;
		this.anInt374 = this.method319();
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
	@Override
	public void method309() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt368);
		this.anInt380 |= 0x1;
		this.anInt374 = this.method319();
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILclient!nm;III)V")
	private void method312(@OriginalArg(0) int arg0, @OriginalArg(1) Class21_Sub4 arg1) {
		if (this.anInt374 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt367 & 0xFFFFFFFE) == 0) {
			this.anInt379 = arg1.anInt4566;
			this.anInt371 = arg1.anInt4566;
		} else if (arg1.anInt4566 != this.anInt371 || this.anInt379 != arg1.anInt4566) {
			throw new RuntimeException();
		}
		arg1.method3762(Static374.anIntArray501[0], arg0, this.anInt374);
		this.anInterface7Array1[0] = arg1;
		this.anInt367 |= 0x1;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IILclient!nm;I)V")
	public void method313(@OriginalArg(2) Class21_Sub4 arg0, @OriginalArg(3) int arg1) {
		this.method312(arg1, arg0);
	}

	@OriginalMember(owner = "client!bb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass121_Sub2_3.method4660(this.anInt368);
		super.finalize();
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZI)V")
	public void method314() {
		if (this.anInt374 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static374.anIntArray501[0]);
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)V")
	@Override
	public void method305() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt380 &= 0xFFFFFFFB;
		this.anInt374 = this.method319();
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(B)V")
	@Override
	public void method306() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt368);
		this.anInt380 |= 0x4;
		this.anInt374 = this.method319();
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!ec;II)V")
	public void method315(@OriginalArg(0) Class1_Sub1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt374 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg1;
		if ((~local16 & this.anInt367) == 0) {
			this.anInt371 = arg0.anInt1529;
			this.anInt379 = arg0.anInt1521;
		} else if (arg0.anInt1529 != this.anInt371 || this.anInt379 != arg0.anInt1521) {
			throw new RuntimeException();
		}
		arg0.method1207(Static374.anIntArray501[arg1], this.anInt374);
		this.anInterface7Array1[arg1] = arg0;
		this.anInt367 |= local16;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)I")
	public int method316() {
		return this.anInt379;
	}

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "(B)I")
	private int method319() {
		if ((this.anInt380 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt380 & 0x2) == 0) {
			return (this.anInt380 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)Z")
	public boolean method320() {
		@Pc(7) int local7 = OpenGL.glCheckFramebufferStatusEXT(this.anInt374);
		return local7 == 36053;
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(II)V")
	public void method321(@OriginalArg(1) int arg0) {
		if (this.anInterface7Array1[arg0] != null) {
			this.anInterface7Array1[arg0].method3747();
		}
		this.anInt367 &= ~(0x1 << arg0);
		this.anInterface7Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(B)V")
	@Override
	public void method307() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt368);
		this.anInt380 |= 0x2;
		this.anInt374 = this.method319();
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLclient!jp;I)V")
	public void method324(@OriginalArg(1) Class21_Sub2 arg0, @OriginalArg(2) int arg1) {
		this.method311(arg1, arg0);
	}
}
