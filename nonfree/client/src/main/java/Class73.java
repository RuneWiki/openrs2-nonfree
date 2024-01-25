import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class73 implements Interface9 {

	@OriginalMember(owner = "client!es", name = "d", descriptor = "I")
	private int anInt2008;

	@OriginalMember(owner = "client!es", name = "C", descriptor = "I")
	private int anInt2030;

	@OriginalMember(owner = "client!es", name = "D", descriptor = "I")
	private int anInt2031;

	@OriginalMember(owner = "client!es", name = "l", descriptor = "[Lclient!ko;")
	private final Interface7[] anInterface7Array1 = new Interface7[9];

	@OriginalMember(owner = "client!es", name = "e", descriptor = "I")
	private int anInt2009 = 0;

	@OriginalMember(owner = "client!es", name = "h", descriptor = "I")
	private int anInt2012 = -1;

	@OriginalMember(owner = "client!es", name = "y", descriptor = "Lclient!vd;")
	private final Class51_Sub2 aClass51_Sub2_16;

	@OriginalMember(owner = "client!es", name = "k", descriptor = "I")
	private final int anInt2015;

	static {
		new Class55("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
	}

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lclient!vd;)V")
	public Class73(@OriginalArg(0) Class51_Sub2 arg0) {
		if (!arg0.aBoolean458) {
			throw new IllegalStateException("");
		}
		this.aClass51_Sub2_16 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static119.anIntArray168, 0);
		this.anInt2015 = Static119.anIntArray168[0];
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(I)V")
	@Override
	public void method1729() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt2009 &= 0xFFFFFFFE;
		this.anInt2012 = this.method1734();
	}

	@OriginalMember(owner = "client!es", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass51_Sub2_16.method5402(this.anInt2015);
		super.finalize();
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(B)I")
	private int method1734() {
		if ((this.anInt2009 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt2009 & 0x2) == 0) {
			return (this.anInt2009 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!es", name = "d", descriptor = "(I)I")
	public int method1735() {
		return this.anInt2031;
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(B)V")
	@Override
	public void method1730() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt2015);
		this.anInt2009 |= 0x1;
		this.anInt2012 = this.method1734();
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(ILclient!ui;ZII)V")
	private void method1736(@OriginalArg(1) Class59_Sub4 arg0, @OriginalArg(3) int arg1) {
		if (this.anInt2012 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt2030 & 0xFFFFFFFE) == 0) {
			this.anInt2008 = arg0.anInt6451;
			this.anInt2031 = arg0.anInt6451;
		} else if (this.anInt2008 != arg0.anInt6451 || arg0.anInt6451 != this.anInt2031) {
			throw new RuntimeException();
		}
		arg0.method5125(Static407.anIntArray576[0], arg1, this.anInt2012);
		this.anInterface7Array1[0] = arg0;
		this.anInt2030 |= 0x1;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IILclient!ud;)V")
	public void method1737(@OriginalArg(0) int arg0, @OriginalArg(2) Class59_Sub3 arg1) {
		this.method1746(arg0, arg1);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(ILclient!nt;I)V")
	public void method1738(@OriginalArg(0) int arg0, @OriginalArg(1) Class7_Sub4_Sub11 arg1) {
		if (this.anInt2012 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg0;
		if ((this.anInt2030 & ~local16) == 0) {
			this.anInt2031 = arg1.anInt4680;
			this.anInt2008 = arg1.anInt4673;
		} else if (this.anInt2008 != arg1.anInt4673 || arg1.anInt4680 != this.anInt2031) {
			throw new RuntimeException();
		}
		arg1.method3707(this.anInt2012, Static407.anIntArray576[arg0]);
		this.anInterface7Array1[arg0] = arg1;
		this.anInt2030 |= local16;
	}

	@OriginalMember(owner = "client!es", name = "d", descriptor = "(B)Z")
	public boolean method1739() {
		@Pc(7) int local7 = OpenGL.glCheckFramebufferStatusEXT(this.anInt2012);
		return local7 == 36053;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)V")
	@Override
	public void method1731() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt2015);
		this.anInt2009 |= 0x4;
		this.anInt2012 = this.method1734();
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(I)V")
	@Override
	public void method1726() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt2009 &= 0xFFFFFFFD;
		this.anInt2012 = this.method1734();
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(I)V")
	@Override
	public void method1728() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt2009 &= 0xFFFFFFFB;
		this.anInt2012 = this.method1734();
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(IB)V")
	public void method1740(@OriginalArg(0) int arg0) {
		if (this.anInterface7Array1[arg0] != null) {
			this.anInterface7Array1[arg0].method5755();
		}
		this.anInt2030 &= ~(0x1 << arg0);
		this.anInterface7Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(II)V")
	public void method1741(@OriginalArg(1) int arg0) {
		if (this.anInt2012 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static407.anIntArray576[arg0]);
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(IB)V")
	public void method1744() {
		if (this.anInt2012 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static407.anIntArray576[0]);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IIZLclient!ui;)V")
	public void method1745(@OriginalArg(1) int arg0, @OriginalArg(3) Class59_Sub4 arg1) {
		this.method1736(arg1, arg0);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IILclient!ud;I)V")
	private void method1746(@OriginalArg(0) int arg0, @OriginalArg(2) Class59_Sub3 arg1) {
		if (this.anInt2012 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg0;
		if ((this.anInt2030 & ~local16) == 0) {
			this.anInt2008 = arg1.anInt7486;
			this.anInt2031 = arg1.anInt7488;
		} else if (this.anInt2008 != arg1.anInt7486 || arg1.anInt7488 != this.anInt2031) {
			throw new RuntimeException();
		}
		arg1.method5768(this.anInt2012, Static407.anIntArray576[arg0]);
		this.anInterface7Array1[arg0] = arg1;
		this.anInt2030 |= local16;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(B)V")
	@Override
	public void method1727() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt2015);
		this.anInt2009 |= 0x2;
		this.anInt2012 = this.method1734();
	}
}
