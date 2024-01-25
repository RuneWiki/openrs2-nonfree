import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class127 implements Interface8 {

	@OriginalMember(owner = "client!je", name = "h", descriptor = "I")
	private int anInt3495;

	@OriginalMember(owner = "client!je", name = "n", descriptor = "I")
	private int anInt3500;

	@OriginalMember(owner = "client!je", name = "r", descriptor = "I")
	private int anInt3504;

	@OriginalMember(owner = "client!je", name = "i", descriptor = "[Lclient!qd;")
	private final Interface9[] anInterface9Array1 = new Interface9[9];

	@OriginalMember(owner = "client!je", name = "z", descriptor = "I")
	private int anInt3512 = 0;

	@OriginalMember(owner = "client!je", name = "u", descriptor = "I")
	private int anInt3507 = -1;

	@OriginalMember(owner = "client!je", name = "D", descriptor = "Lclient!ef;")
	private final Class49_Sub2 aClass49_Sub2_19;

	@OriginalMember(owner = "client!je", name = "C", descriptor = "I")
	private final int anInt3515;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lclient!ef;)V")
	public Class127(@OriginalArg(0) Class49_Sub2 arg0) {
		if (!arg0.aBoolean117) {
			throw new IllegalStateException("");
		}
		this.aClass49_Sub2_19 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static54.anIntArray83, 0);
		this.anInt3515 = Static54.anIntArray83[0];
	}

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(I)Z")
	public boolean method2871() {
		@Pc(7) int local7 = OpenGL.glCheckFramebufferStatusEXT(this.anInt3507);
		return local7 == 36053;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
	@Override
	public void method2869() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt3512 &= 0xFFFFFFFD;
		this.anInt3507 = this.method2882();
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	@Override
	public void method2865() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt3512 &= 0xFFFFFFFE;
		this.anInt3507 = this.method2882();
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IZLclient!vg;I)V")
	public void method2872(@OriginalArg(0) int arg0, @OriginalArg(2) Class55_Sub4 arg1) {
		this.method2878(arg1, arg0);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZI)V")
	public void method2873(@OriginalArg(1) int arg0) {
		if (this.anInt3507 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static385.anIntArray550[arg0]);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IILclient!sf;)V")
	public void method2874(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub5_Sub15 arg1) {
		if (this.anInt3507 == -1) {
			throw new RuntimeException();
		}
		@Pc(21) int local21 = 0x1 << arg0;
		if ((~local21 & this.anInt3504) == 0) {
			this.anInt3500 = arg1.anInt6064;
			this.anInt3495 = arg1.anInt6055;
		} else if (this.anInt3495 != arg1.anInt6055 || arg1.anInt6064 != this.anInt3500) {
			throw new RuntimeException();
		}
		arg1.method4869(this.anInt3507, Static385.anIntArray550[arg0]);
		this.anInterface9Array1[arg0] = arg1;
		this.anInt3504 |= local21;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)V")
	public void method2875(@OriginalArg(1) int arg0) {
		if (this.anInterface9Array1[arg0] != null) {
			this.anInterface9Array1[arg0].method5551();
		}
		this.anInt3504 &= ~(0x1 << arg0);
		this.anInterface9Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V")
	@Override
	public void method2868() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt3515);
		this.anInt3512 |= 0x2;
		this.anInt3507 = this.method2882();
	}

	@OriginalMember(owner = "client!je", name = "f", descriptor = "(I)I")
	public int method2877() {
		return this.anInt3500;
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V")
	@Override
	public void method2870() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt3515);
		this.anInt3512 |= 0x4;
		this.anInt3507 = this.method2882();
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BLclient!vg;III)V")
	private void method2878(@OriginalArg(1) Class55_Sub4 arg0, @OriginalArg(3) int arg1) {
		if (this.anInt3507 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt3504 & 0xFFFFFFFE) == 0) {
			this.anInt3500 = arg0.anInt7045;
			this.anInt3495 = arg0.anInt7045;
		} else if (arg0.anInt7045 != this.anInt3495 || this.anInt3500 != arg0.anInt7045) {
			throw new RuntimeException();
		}
		arg0.method5564(this.anInt3507, arg1, Static385.anIntArray550[0]);
		this.anInterface9Array1[0] = arg0;
		this.anInt3504 |= 0x1;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIZLclient!ml;)V")
	private void method2879(@OriginalArg(1) int arg0, @OriginalArg(3) Class55_Sub3 arg1) {
		if (this.anInt3507 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg0;
		if ((~local15 & this.anInt3504) == 0) {
			this.anInt3500 = arg1.anInt6491;
			this.anInt3495 = arg1.anInt6487;
		} else if (this.anInt3495 != arg1.anInt6487 || arg1.anInt6491 != this.anInt3500) {
			throw new RuntimeException();
		}
		arg1.method5118(Static385.anIntArray550[arg0], this.anInt3507);
		this.anInterface9Array1[arg0] = arg1;
		this.anInt3504 |= local15;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
	@Override
	public void method2866() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt3515);
		this.anInt3512 |= 0x1;
		this.anInt3507 = this.method2882();
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V")
	@Override
	public void method2867() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt3512 &= 0xFFFFFFFB;
		this.anInt3507 = this.method2882();
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(II)V")
	public void method2881() {
		if (this.anInt3507 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static385.anIntArray550[0]);
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(B)I")
	private int method2882() {
		if ((this.anInt3512 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt3512 & 0x2) == 0) {
			return (this.anInt3512 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!je", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass49_Sub2_19.method1637(this.anInt3515);
		super.finalize();
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IBLclient!ml;)V")
	public void method2883(@OriginalArg(0) int arg0, @OriginalArg(2) Class55_Sub3 arg1) {
		this.method2879(arg0, arg1);
	}
}
