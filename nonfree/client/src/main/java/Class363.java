import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class363 implements Interface6 {

	@OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
	private int anInt10201;

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
	private int anInt10203;

	@OriginalMember(owner = "client!vd", name = "z", descriptor = "I")
	private int anInt10216;

	@OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
	private int anInt10205 = 0;

	@OriginalMember(owner = "client!vd", name = "x", descriptor = "[Lclient!uj;")
	private final Interface26[] anInterface26Array1 = new Interface26[9];

	@OriginalMember(owner = "client!vd", name = "w", descriptor = "I")
	private int anInt10214 = -1;

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "Lclient!ck;")
	private final Class65_Sub1 aClass65_Sub1_38;

	@OriginalMember(owner = "client!vd", name = "v", descriptor = "I")
	private final int anInt10213;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lclient!ck;)V")
	public Class363(@OriginalArg(0) Class65_Sub1 arg0) {
		if (!arg0.aBoolean100) {
			throw new IllegalStateException("");
		}
		this.aClass65_Sub1_38 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static198.anIntArray476, 0);
		this.anInt10213 = Static198.anIntArray476[0];
	}

	@OriginalMember(owner = "client!vd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass65_Sub1_38.method1260(this.anInt10213);
		super.finalize();
	}

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)Z")
	public boolean method8445() {
		@Pc(7) int local7 = OpenGL.glCheckFramebufferStatusEXT(this.anInt10214);
		return local7 == 36053;
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V")
	@Override
	public void method8443() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt10205 &= 0xFFFFFFFE;
		this.anInt10214 = this.method8452();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V")
	public void method8446(@OriginalArg(0) int arg0) {
		if (this.anInterface26Array1[arg0] != null) {
			this.anInterface26Array1[arg0].method7433();
		}
		this.anInt10201 &= ~(0x1 << arg0);
		this.anInterface26Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BI)V")
	public void method8447(@OriginalArg(1) int arg0) {
		if (this.anInt10214 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static36.anIntArray25[arg0]);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIZLclient!maa;I)V")
	private void method8448(@OriginalArg(3) Class80_Sub4 arg0, @OriginalArg(4) int arg1) {
		if (this.anInt10214 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt10201 & 0xFFFFFFFE) == 0) {
			this.anInt10203 = arg0.anInt6519;
			this.anInt10216 = arg0.anInt6519;
		} else if (arg0.anInt6519 != this.anInt10203 || arg0.anInt6519 != this.anInt10216) {
			throw new RuntimeException();
		}
		arg0.method5430(arg1, this.anInt10214, Static36.anIntArray25[0]);
		this.anInterface26Array1[0] = arg0;
		this.anInt10201 |= 0x1;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!gha;II)V")
	public void method8449(@OriginalArg(0) Class80_Sub2 arg0, @OriginalArg(2) int arg1) {
		this.method8450(arg0, arg1);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!gha;II)V")
	private void method8450(@OriginalArg(1) Class80_Sub2 arg0, @OriginalArg(3) int arg1) {
		if (this.anInt10214 == -1) {
			throw new RuntimeException();
		}
		@Pc(19) int local19 = 0x1 << arg1;
		if ((~local19 & this.anInt10201) == 0) {
			this.anInt10203 = arg0.anInt8354;
			this.anInt10216 = arg0.anInt8357;
		} else if (this.anInt10203 != arg0.anInt8354 || this.anInt10216 != arg0.anInt8357) {
			throw new RuntimeException();
		}
		arg0.method7147(Static36.anIntArray25[arg1], this.anInt10214);
		this.anInterface26Array1[arg1] = arg0;
		this.anInt10201 |= local19;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
	@Override
	public void method8439() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt10213);
		this.anInt10205 |= 0x4;
		this.anInt10214 = this.method8452();
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
	@Override
	public void method8442() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt10205 &= 0xFFFFFFFB;
		this.anInt10214 = this.method8452();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!ru;Z)V")
	public void method8451(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub3_Sub18 arg1) {
		if (this.anInt10214 == -1) {
			throw new RuntimeException();
		}
		@Pc(19) int local19 = 0x1 << arg0;
		if ((~local19 & this.anInt10201) == 0) {
			this.anInt10203 = arg1.anInt8735;
			this.anInt10216 = arg1.anInt8729;
		} else if (arg1.anInt8735 != this.anInt10203 || arg1.anInt8729 != this.anInt10216) {
			throw new RuntimeException();
		}
		arg1.method7435(this.anInt10214, Static36.anIntArray25[arg0]);
		this.anInterface26Array1[arg0] = arg1;
		this.anInt10201 |= local19;
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)V")
	@Override
	public void method8444() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt10205 &= 0xFFFFFFFD;
		this.anInt10214 = this.method8452();
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)I")
	private int method8452() {
		if ((this.anInt10205 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt10205 & 0x2) == 0) {
			return (this.anInt10205 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!maa;III)V")
	public void method8453(@OriginalArg(0) Class80_Sub4 arg0, @OriginalArg(1) int arg1) {
		this.method8448(arg0, arg1);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZI)V")
	public void method8454() {
		if (this.anInt10214 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static36.anIntArray25[0]);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)V")
	@Override
	public void method8441() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt10213);
		this.anInt10205 |= 0x2;
		this.anInt10214 = this.method8452();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
	@Override
	public void method8440() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt10213);
		this.anInt10205 |= 0x1;
		this.anInt10214 = this.method8452();
	}
}
