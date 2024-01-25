import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ct")
public final class Class76 implements Interface17 {

	@OriginalMember(owner = "client!ct", name = "p", descriptor = "I")
	private int anInt1491;

	@OriginalMember(owner = "client!ct", name = "d", descriptor = "I")
	private int anInt1496;

	@OriginalMember(owner = "client!ct", name = "t", descriptor = "I")
	private int anInt1503;

	@OriginalMember(owner = "client!ct", name = "h", descriptor = "I")
	private int anInt1485 = -1;

	@OriginalMember(owner = "client!ct", name = "r", descriptor = "I")
	private int anInt1484 = 0;

	@OriginalMember(owner = "client!ct", name = "F", descriptor = "[Lclient!wr;")
	private final Interface27[] anInterface27Array1 = new Interface27[9];

	@OriginalMember(owner = "client!ct", name = "z", descriptor = "Lclient!ffa;")
	private final Class57_Sub2 aClass57_Sub2_9;

	@OriginalMember(owner = "client!ct", name = "l", descriptor = "I")
	private final int anInt1505;

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lclient!ffa;)V")
	public Class76(@OriginalArg(0) Class57_Sub2 arg0) {
		if (!arg0.aBoolean234) {
			throw new IllegalStateException("");
		}
		this.aClass57_Sub2_9 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static284.anIntArray275, 0);
		this.anInt1505 = Static284.anIntArray275[0];
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(B)V")
	@Override
	public void method1332() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt1484 &= 0xFFFFFFFB;
		this.anInt1485 = this.method1348();
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lclient!bca;IIB)V")
	private void method1336(@OriginalArg(0) Class32_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt1485 == -1) {
			throw new RuntimeException();
		}
		@Pc(22) int local22 = 0x1 << arg1;
		if ((this.anInt1496 & ~local22) == 0) {
			this.anInt1503 = arg0.anInt3103;
			this.anInt1491 = arg0.anInt3107;
		} else if (this.anInt1503 != arg0.anInt3103 || arg0.anInt3107 != this.anInt1491) {
			throw new RuntimeException();
		}
		arg0.method2720(Static251.anIntArray246[arg1], this.anInt1485);
		this.anInterface27Array1[arg1] = arg0;
		this.anInt1496 |= local22;
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(II)V")
	public void method1337() {
		if (this.anInt1485 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static251.anIntArray246[0]);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(BI)V")
	public void method1338(@OriginalArg(1) int arg0) {
		if (this.anInterface27Array1[arg0] != null) {
			this.anInterface27Array1[arg0].method8965();
		}
		this.anInt1496 &= ~(0x1 << arg0);
		this.anInterface27Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIILclient!od;I)V")
	private void method1339(@OriginalArg(0) int arg0, @OriginalArg(3) Class32_Sub3 arg1) {
		if (this.anInt1485 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt1496 & 0xFFFFFFFE) == 0) {
			this.anInt1503 = arg1.anInt7191;
			this.anInt1491 = arg1.anInt7191;
		} else if (arg1.anInt7191 != this.anInt1503 || this.anInt1491 != arg1.anInt7191) {
			throw new RuntimeException();
		}
		arg1.method6221(arg0, this.anInt1485, Static251.anIntArray246[0]);
		this.anInterface27Array1[0] = arg1;
		this.anInt1496 |= 0x1;
	}

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "(I)V")
	@Override
	public void method1331() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt1505);
		this.anInt1484 |= 0x1;
		this.anInt1485 = this.method1348();
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(II)V")
	public void method1340(@OriginalArg(0) int arg0) {
		if (this.anInt1485 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static251.anIntArray246[arg0]);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IILclient!bca;)V")
	public void method1342(@OriginalArg(0) int arg0, @OriginalArg(2) Class32_Sub1 arg1) {
		this.method1336(arg1, arg0);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIILclient!od;)V")
	public void method1343(@OriginalArg(1) int arg0, @OriginalArg(3) Class32_Sub3 arg1) {
		this.method1339(arg0, arg1);
	}

	@OriginalMember(owner = "client!ct", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass57_Sub2_9.method2324(this.anInt1505);
		super.finalize();
	}

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "(B)Z")
	public boolean method1346() {
		@Pc(14) int local14 = OpenGL.glCheckFramebufferStatusEXT(this.anInt1485);
		return local14 == 36053;
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(I)V")
	@Override
	public void method1330() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt1505);
		this.anInt1484 |= 0x4;
		this.anInt1485 = this.method1348();
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V")
	@Override
	public void method1335() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt1505);
		this.anInt1484 |= 0x2;
		this.anInt1485 = this.method1348();
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IBLclient!vq;)V")
	public void method1347(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub5_Sub20 arg1) {
		if (this.anInt1485 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg0;
		if ((this.anInt1496 & ~local16) == 0) {
			this.anInt1491 = arg1.anInt10448;
			this.anInt1503 = arg1.anInt10445;
		} else if (this.anInt1503 != arg1.anInt10445 || this.anInt1491 != arg1.anInt10448) {
			throw new RuntimeException();
		}
		arg1.method8967(this.anInt1485, Static251.anIntArray246[arg0]);
		this.anInterface27Array1[arg0] = arg1;
		this.anInt1496 |= local16;
	}

	@OriginalMember(owner = "client!ct", name = "g", descriptor = "(I)I")
	private int method1348() {
		if ((this.anInt1484 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt1484 & 0x2) == 0) {
			return (this.anInt1484 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!ct", name = "d", descriptor = "(I)V")
	@Override
	public void method1333() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt1484 &= 0xFFFFFFFD;
		this.anInt1485 = this.method1348();
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)V")
	@Override
	public void method1334() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt1484 &= 0xFFFFFFFE;
		this.anInt1485 = this.method1348();
	}
}
