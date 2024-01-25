import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class Class226 {

	@OriginalMember(owner = "client!st", name = "g", descriptor = "Lclient!cq;")
	public Class42 aClass42_6;

	@OriginalMember(owner = "client!st", name = "u", descriptor = "I")
	public int anInt6135;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "I")
	public int anInt6119 = -1;

	@OriginalMember(owner = "client!st", name = "i", descriptor = "Z")
	public boolean aBoolean427 = false;

	@OriginalMember(owner = "client!st", name = "k", descriptor = "I")
	public int anInt6126 = -1;

	@OriginalMember(owner = "client!st", name = "j", descriptor = "Z")
	public boolean aBoolean428 = true;

	@OriginalMember(owner = "client!st", name = "m", descriptor = "I")
	public int anInt6128 = 16;

	@OriginalMember(owner = "client!st", name = "l", descriptor = "I")
	public int anInt6127 = 128;

	@OriginalMember(owner = "client!st", name = "h", descriptor = "I")
	public int anInt6125 = 0;

	@OriginalMember(owner = "client!st", name = "q", descriptor = "Z")
	public boolean aBoolean429 = true;

	@OriginalMember(owner = "client!st", name = "e", descriptor = "I")
	public int anInt6123 = 127;

	@OriginalMember(owner = "client!st", name = "n", descriptor = "I")
	public int anInt6129 = 8;

	@OriginalMember(owner = "client!st", name = "t", descriptor = "I")
	public int anInt6134 = -1;

	@OriginalMember(owner = "client!st", name = "p", descriptor = "I")
	public int anInt6131 = 1190717;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(I)V")
	public void method5098() {
		this.anInt6129 = this.anInt6135 | this.anInt6129 << 8;
		if (this.anInt6126 == -1) {
			this.anInt6126 = this.anInt6119;
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ILclient!hp;)V")
	public void method5100(@OriginalArg(1) Class1_Sub5 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5366();
			if (local5 == 0) {
				return;
			}
			this.method5102(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ILclient!hp;I)V")
	private void method5102(@OriginalArg(1) Class1_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt6125 = Static350.method4856(arg0.method5399());
		} else if (arg1 == 2) {
			this.anInt6119 = arg0.method5366();
		} else if (arg1 == 3) {
			this.anInt6119 = arg0.method5362();
			if (this.anInt6119 == 65535) {
				this.anInt6119 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean428 = false;
		} else if (arg1 == 7) {
			this.anInt6134 = Static350.method4856(arg0.method5399());
		} else if (arg1 == 8) {
			this.aClass42_6.anInt1455 = this.anInt6135;
		} else if (arg1 == 9) {
			this.anInt6127 = arg0.method5362() << 0;
		} else if (arg1 == 10) {
			this.aBoolean429 = false;
		} else if (arg1 == 11) {
			this.anInt6129 = arg0.method5366();
		} else if (arg1 == 12) {
			this.aBoolean427 = true;
		} else if (arg1 == 13) {
			this.anInt6131 = arg0.method5399();
		} else if (arg1 == 14) {
			this.anInt6128 = arg0.method5366() << 0;
		} else if (arg1 == 15) {
			this.anInt6126 = arg0.method5362();
			if (this.anInt6126 == 65535) {
				this.anInt6126 = -1;
			}
		} else if (arg1 == 16) {
			this.anInt6123 = arg0.method5366();
		}
	}
}
