import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaa")
public final class Class141 implements Interface11 {

	@OriginalMember(owner = "client!jaa", name = "z", descriptor = "[C")
	private static final char[] aCharArray7 = new char[64];

	@OriginalMember(owner = "client!jaa", name = "f", descriptor = "I")
	private int anInt4721;

	@OriginalMember(owner = "client!jaa", name = "B", descriptor = "I")
	private int anInt4738;

	@OriginalMember(owner = "client!jaa", name = "E", descriptor = "I")
	private int anInt4741;

	@OriginalMember(owner = "client!jaa", name = "i", descriptor = "I")
	private int anInt4724 = 0;

	@OriginalMember(owner = "client!jaa", name = "u", descriptor = "[Lclient!fr;")
	private final Interface7[] anInterface7Array1 = new Interface7[9];

	@OriginalMember(owner = "client!jaa", name = "C", descriptor = "I")
	private int anInt4739 = -1;

	@OriginalMember(owner = "client!jaa", name = "w", descriptor = "Lclient!ad;")
	private final Class5_Sub1 aClass5_Sub1_18;

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "I")
	private final int anInt4717;

	static {
		for (@Pc(251) int local251 = 0; local251 < 26; local251++) {
			aCharArray7[local251] = (char) (local251 + 65);
		}
		for (@Pc(265) int local265 = 26; local265 < 52; local265++) {
			aCharArray7[local265] = (char) (local265 + 97 - 26);
		}
		for (@Pc(281) int local281 = 52; local281 < 62; local281++) {
			aCharArray7[local281] = (char) (local281 - 4);
		}
		aCharArray7[63] = '-';
		aCharArray7[62] = '*';
	}

	@OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "(Lclient!ad;)V")
	public Class141(@OriginalArg(0) Class5_Sub1 arg0) {
		if (!arg0.aBoolean43) {
			throw new IllegalStateException("");
		}
		this.aClass5_Sub1_18 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static168.anIntArray379, 0);
		this.anInt4717 = Static168.anIntArray379[0];
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ILclient!vda;IIZ)V")
	private void method3970(@OriginalArg(1) Class11_Sub4 arg0, @OriginalArg(3) int arg1) {
		if (this.anInt4739 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt4738 & 0xFFFFFFFE) == 0) {
			this.anInt4721 = arg0.anInt8895;
			this.anInt4741 = arg0.anInt8895;
		} else if (arg0.anInt8895 != this.anInt4721 || this.anInt4741 != arg0.anInt8895) {
			throw new RuntimeException();
		}
		arg0.method7310(Static169.anIntArray380[0], this.anInt4739, arg1);
		this.anInterface7Array1[0] = arg0;
		this.anInt4738 |= 0x1;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ILclient!cs;II)V")
	private void method3971(@OriginalArg(1) Class11_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt4739 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg1;
		if ((~local15 & this.anInt4738) == 0) {
			this.anInt4721 = arg0.anInt569;
			this.anInt4741 = arg0.anInt564;
		} else if (arg0.anInt569 != this.anInt4721 || this.anInt4741 != arg0.anInt564) {
			throw new RuntimeException();
		}
		arg0.method608(Static169.anIntArray380[arg1], this.anInt4739);
		this.anInterface7Array1[arg1] = arg0;
		this.anInt4738 |= local15;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ZLclient!vda;II)V")
	public void method3973(@OriginalArg(1) Class11_Sub4 arg0, @OriginalArg(2) int arg1) {
		this.method3970(arg0, arg1);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I)V")
	@Override
	public void method3963() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt4724 &= 0xFFFFFFFD;
		this.anInt4739 = this.method3981();
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IILclient!pg;)V")
	public void method3974(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub10_Sub14 arg1) {
		if (this.anInt4739 == -1) {
			throw new RuntimeException();
		}
		@Pc(24) int local24 = 0x1 << arg0;
		if ((~local24 & this.anInt4738) == 0) {
			this.anInt4741 = arg1.anInt6951;
			this.anInt4721 = arg1.anInt6962;
		} else if (this.anInt4721 != arg1.anInt6962 || this.anInt4741 != arg1.anInt6951) {
			throw new RuntimeException();
		}
		arg1.method5844(this.anInt4739, Static169.anIntArray380[arg0]);
		this.anInterface7Array1[arg0] = arg1;
		this.anInt4738 |= local24;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IB)V")
	public void method3975(@OriginalArg(0) int arg0) {
		if (this.anInt4739 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static169.anIntArray380[arg0]);
	}

	@OriginalMember(owner = "client!jaa", name = "d", descriptor = "(I)V")
	@Override
	public void method3967() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt4724 &= 0xFFFFFFFE;
		this.anInt4739 = this.method3981();
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(I)V")
	@Override
	public void method3964() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt4717);
		this.anInt4724 |= 0x2;
		this.anInt4739 = this.method3981();
	}

	@OriginalMember(owner = "client!jaa", name = "c", descriptor = "(B)Z")
	public boolean method3977() {
		@Pc(7) int local7 = OpenGL.glCheckFramebufferStatusEXT(this.anInt4739);
		return local7 == 36053;
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(II)V")
	public void method3978(@OriginalArg(0) int arg0) {
		if (this.anInterface7Array1[arg0] != null) {
			this.anInterface7Array1[arg0].method7295();
		}
		this.anInt4738 &= ~(0x1 << arg0);
		this.anInterface7Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ILclient!cs;B)V")
	public void method3979(@OriginalArg(0) int arg0, @OriginalArg(1) Class11_Sub1 arg1) {
		this.method3971(arg1, arg0);
	}

	@OriginalMember(owner = "client!jaa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass5_Sub1_18.method435(this.anInt4717);
		super.finalize();
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(B)V")
	@Override
	public void method3966() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt4717);
		this.anInt4724 |= 0x4;
		this.anInt4739 = this.method3981();
	}

	@OriginalMember(owner = "client!jaa", name = "c", descriptor = "(II)V")
	public void method3980() {
		if (this.anInt4739 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static169.anIntArray380[0]);
	}

	@OriginalMember(owner = "client!jaa", name = "c", descriptor = "(I)V")
	@Override
	public void method3965() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt4724 &= 0xFFFFFFFB;
		this.anInt4739 = this.method3981();
	}

	@OriginalMember(owner = "client!jaa", name = "f", descriptor = "(I)I")
	private int method3981() {
		if ((this.anInt4724 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt4724 & 0x2) == 0) {
			return (this.anInt4724 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!jaa", name = "e", descriptor = "(I)V")
	@Override
	public void method3968() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt4717);
		this.anInt4724 |= 0x1;
		this.anInt4739 = this.method3981();
	}
}
