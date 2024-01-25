import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class339 implements Interface17 {

	@OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
	private int anInt9571;

	@OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
	private int anInt9576;

	@OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
	private int anInt9591;

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
	private int anInt9577 = -1;

	@OriginalMember(owner = "client!sj", name = "z", descriptor = "[Lclient!kv;")
	private final Interface15[] anInterface15Array1 = new Interface15[9];

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
	private int anInt9593 = 0;

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "Lclient!gia;")
	private final Class67_Sub2 aClass67_Sub2_37;

	@OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
	private final int anInt9594;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lclient!gia;)V")
	public Class339(@OriginalArg(0) Class67_Sub2 arg0) {
		if (!arg0.aBoolean309) {
			throw new IllegalStateException("");
		}
		this.aClass67_Sub2_37 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static100.anIntArray529, 0);
		this.anInt9594 = Static100.anIntArray529[0];
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V")
	@Override
	public void method8069() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt9593 &= 0xFFFFFFFD;
		this.anInt9577 = this.method8071();
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)Z")
	public boolean method8070() {
		@Pc(7) int local7 = OpenGL.glCheckFramebufferStatusEXT(this.anInt9577);
		return local7 == 36053;
	}

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "(B)I")
	private int method8071() {
		if ((this.anInt9593 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt9593 & 0x2) == 0) {
			return (this.anInt9593 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!sj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass67_Sub2_37.method3239(this.anInt9594);
		super.finalize();
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILclient!po;I)V")
	public void method8073(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4_Sub16 arg1) {
		if (this.anInt9577 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg0;
		if ((~local16 & this.anInt9571) == 0) {
			this.anInt9591 = arg1.anInt8545;
			this.anInt9576 = arg1.anInt8540;
		} else if (arg1.anInt8545 != this.anInt9591 || this.anInt9576 != arg1.anInt8540) {
			throw new RuntimeException();
		}
		arg1.method7169(Static246.anIntArray247[arg0], this.anInt9577);
		this.anInterface15Array1[arg0] = arg1;
		this.anInt9571 |= local16;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V")
	@Override
	public void method8065() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt9594);
		this.anInt9593 |= 0x4;
		this.anInt9577 = this.method8071();
	}

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(B)V")
	@Override
	public void method8067() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt9593 &= 0xFFFFFFFE;
		this.anInt9577 = this.method8071();
	}

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "(B)V")
	@Override
	public void method8066() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt9593 &= 0xFFFFFFFB;
		this.anInt9577 = this.method8071();
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZ)V")
	public void method8075() {
		if (this.anInt9577 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static246.anIntArray247[0]);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IILclient!nw;)V")
	public void method8076(@OriginalArg(0) int arg0, @OriginalArg(2) Class245_Sub2 arg1) {
		this.method8080(arg1, arg0);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(BI)V")
	public void method8077(@OriginalArg(1) int arg0) {
		if (this.anInterface15Array1[arg0] != null) {
			this.anInterface15Array1[arg0].method8671();
		}
		this.anInt9571 &= ~(0x1 << arg0);
		this.anInterface15Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIILclient!mr;I)V")
	private void method8078(@OriginalArg(3) Class245_Sub1 arg0, @OriginalArg(4) int arg1) {
		if (this.anInt9577 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt9571 & 0xFFFFFFFE) == 0) {
			this.anInt9591 = arg0.anInt7222;
			this.anInt9576 = arg0.anInt7222;
		} else if (arg0.anInt7222 != this.anInt9591 || this.anInt9576 != arg0.anInt7222) {
			throw new RuntimeException();
		}
		arg0.method6047(arg1, Static246.anIntArray247[0], this.anInt9577);
		this.anInterface15Array1[0] = arg0;
		this.anInt9571 |= 0x1;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!nw;IBI)V")
	private void method8080(@OriginalArg(0) Class245_Sub2 arg0, @OriginalArg(3) int arg1) {
		if (this.anInt9577 == -1) {
			throw new RuntimeException();
		}
		@Pc(27) int local27 = 0x1 << arg1;
		if ((this.anInt9571 & ~local27) == 0) {
			this.anInt9576 = arg0.anInt10092;
			this.anInt9591 = arg0.anInt10091;
		} else if (arg0.anInt10091 != this.anInt9591 || arg0.anInt10092 != this.anInt9576) {
			throw new RuntimeException();
		}
		arg0.method8467(Static246.anIntArray247[arg1], this.anInt9577);
		this.anInterface15Array1[arg1] = arg0;
		this.anInt9571 |= local27;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIILclient!mr;)V")
	public void method8082(@OriginalArg(0) int arg0, @OriginalArg(3) Class245_Sub1 arg1) {
		this.method8078(arg1, arg0);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
	@Override
	public void method8068() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt9594);
		this.anInt9593 |= 0x1;
		this.anInt9577 = this.method8071();
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)V")
	public void method8083(@OriginalArg(0) int arg0) {
		if (this.anInt9577 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static246.anIntArray247[arg0]);
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)V")
	@Override
	public void method8064() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt9594);
		this.anInt9593 |= 0x2;
		this.anInt9577 = this.method8071();
	}
}
