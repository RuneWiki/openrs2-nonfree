import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aea")
public final class Class9 implements Interface4 {

	@OriginalMember(owner = "client!aea", name = "f", descriptor = "I")
	private int anInt124;

	@OriginalMember(owner = "client!aea", name = "i", descriptor = "I")
	private int anInt126;

	@OriginalMember(owner = "client!aea", name = "l", descriptor = "I")
	private int anInt129;

	@OriginalMember(owner = "client!aea", name = "j", descriptor = "I")
	private int anInt127 = -1;

	@OriginalMember(owner = "client!aea", name = "r", descriptor = "I")
	private int anInt135 = 0;

	@OriginalMember(owner = "client!aea", name = "F", descriptor = "[Lclient!ida;")
	private final Interface7[] anInterface7Array1 = new Interface7[9];

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "Lclient!gi;")
	private final Class42_Sub3 aClass42_Sub3_1;

	@OriginalMember(owner = "client!aea", name = "q", descriptor = "I")
	private final int anInt134;

	@OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Lclient!gi;)V")
	public Class9(@OriginalArg(0) Class42_Sub3 arg0) {
		if (!arg0.aBoolean305) {
			throw new IllegalStateException("");
		}
		this.aClass42_Sub3_1 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static100.anIntArray204, 0);
		this.anInt134 = Static100.anIntArray204[0];
	}

	@OriginalMember(owner = "client!aea", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass42_Sub3_1.method3264(this.anInt134);
		super.finalize();
	}

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "(B)V")
	@Override
	public void method270() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt134);
		this.anInt135 |= 0x2;
		this.anInt127 = this.method282();
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(ILclient!ob;I)V")
	public void method275(@OriginalArg(1) Class79_Sub2 arg0, @OriginalArg(2) int arg1) {
		this.method283(arg1, arg0);
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIIILclient!nm;)V")
	private void method276(@OriginalArg(2) int arg0, @OriginalArg(4) Class79_Sub4 arg1) {
		if (this.anInt127 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt124 & 0xFFFFFFFE) == 0) {
			this.anInt129 = arg1.anInt6309;
			this.anInt126 = arg1.anInt6309;
		} else if (this.anInt126 != arg1.anInt6309 || this.anInt129 != arg1.anInt6309) {
			throw new RuntimeException();
		}
		arg1.method5283(this.anInt127, Static119.anIntArray221[0], arg0);
		this.anInterface7Array1[0] = arg1;
		this.anInt124 |= 0x1;
	}

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "(I)V")
	@Override
	public void method273() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt135 &= 0xFFFFFFFD;
		this.anInt127 = this.method282();
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(Z)V")
	@Override
	public void method271() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt135 &= 0xFFFFFFFE;
		this.anInt127 = this.method282();
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIILclient!nm;)V")
	public void method279(@OriginalArg(1) int arg0, @OriginalArg(3) Class79_Sub4 arg1) {
		this.method276(arg0, arg1);
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(B)V")
	@Override
	public void method269() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt135 &= 0xFFFFFFFB;
		this.anInt127 = this.method282();
	}

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "(II)V")
	public void method281() {
		if (this.anInt127 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static119.anIntArray221[0]);
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(I)V")
	@Override
	public void method268() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt134);
		this.anInt135 |= 0x4;
		this.anInt127 = this.method282();
	}

	@OriginalMember(owner = "client!aea", name = "c", descriptor = "(I)I")
	private int method282() {
		if ((this.anInt135 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt135 & 0x2) == 0) {
			return (this.anInt135 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(ILclient!ob;BI)V")
	private void method283(@OriginalArg(0) int arg0, @OriginalArg(1) Class79_Sub2 arg1) {
		if (this.anInt127 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg0;
		if ((this.anInt124 & ~local16) == 0) {
			this.anInt126 = arg1.anInt2816;
			this.anInt129 = arg1.anInt2812;
		} else if (arg1.anInt2816 != this.anInt126 || arg1.anInt2812 != this.anInt129) {
			throw new RuntimeException();
		}
		arg1.method2526(this.anInt127, Static119.anIntArray221[arg0]);
		this.anInterface7Array1[arg0] = arg1;
		this.anInt124 |= local16;
	}

	@OriginalMember(owner = "client!aea", name = "d", descriptor = "(I)Z")
	public boolean method284() {
		@Pc(7) int local7 = OpenGL.glCheckFramebufferStatusEXT(this.anInt127);
		return local7 == 36053;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(Lclient!fda;II)V")
	public void method285(@OriginalArg(0) Class12_Sub4_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt127 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg1;
		if ((~local15 & this.anInt124) == 0) {
			this.anInt126 = arg0.anInt3016;
			this.anInt129 = arg0.anInt3017;
		} else if (arg0.anInt3016 != this.anInt126 || arg0.anInt3017 != this.anInt129) {
			throw new RuntimeException();
		}
		arg0.method2745(this.anInt127, Static119.anIntArray221[arg1]);
		this.anInterface7Array1[arg1] = arg0;
		this.anInt124 |= local15;
	}

	@OriginalMember(owner = "client!aea", name = "e", descriptor = "(B)I")
	public int method286() {
		return this.anInt129;
	}

	@OriginalMember(owner = "client!aea", name = "c", descriptor = "(B)V")
	@Override
	public void method272() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt134);
		this.anInt135 |= 0x1;
		this.anInt127 = this.method282();
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(BI)V")
	public void method287(@OriginalArg(1) int arg0) {
		if (this.anInterface7Array1[arg0] != null) {
			this.anInterface7Array1[arg0].method5270();
		}
		this.anInt124 &= ~(0x1 << arg0);
		this.anInterface7Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!aea", name = "c", descriptor = "(II)V")
	public void method288(@OriginalArg(1) int arg0) {
		if (this.anInt127 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static119.anIntArray221[arg0]);
	}
}
