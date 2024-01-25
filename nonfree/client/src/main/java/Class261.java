import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class261 {

	@OriginalMember(owner = "client!w", name = "r", descriptor = "I")
	public int anInt7250;

	@OriginalMember(owner = "client!w", name = "u", descriptor = "Lclient!fe;")
	public Class79 aClass79_6;

	@OriginalMember(owner = "client!w", name = "f", descriptor = "Z")
	public boolean aBoolean511 = false;

	@OriginalMember(owner = "client!w", name = "k", descriptor = "I")
	public int anInt7245 = -1;

	@OriginalMember(owner = "client!w", name = "d", descriptor = "I")
	public int anInt7240 = 127;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "I")
	public int anInt7238 = 128;

	@OriginalMember(owner = "client!w", name = "j", descriptor = "I")
	public int anInt7244 = 8;

	@OriginalMember(owner = "client!w", name = "s", descriptor = "Z")
	public boolean aBoolean513 = true;

	@OriginalMember(owner = "client!w", name = "l", descriptor = "I")
	public int anInt7246 = 1190717;

	@OriginalMember(owner = "client!w", name = "c", descriptor = "I")
	public int anInt7239 = -1;

	@OriginalMember(owner = "client!w", name = "n", descriptor = "I")
	public int anInt7247 = -1;

	@OriginalMember(owner = "client!w", name = "p", descriptor = "Z")
	public boolean aBoolean512 = true;

	@OriginalMember(owner = "client!w", name = "w", descriptor = "I")
	public int anInt7253 = 0;

	@OriginalMember(owner = "client!w", name = "h", descriptor = "I")
	public int anInt7242 = 16;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ILclient!fh;I)V")
	private void method5815(@OriginalArg(1) Class4_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt7253 = Static202.method2859(arg0.method5008());
		} else if (arg1 == 2) {
			this.anInt7247 = arg0.method5007();
		} else if (arg1 == 3) {
			this.anInt7247 = arg0.method5028();
			if (this.anInt7247 == 65535) {
				this.anInt7247 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean512 = false;
		} else if (arg1 == 7) {
			this.anInt7245 = Static202.method2859(arg0.method5008());
		} else if (arg1 == 8) {
			this.aClass79_6.anInt1954 = this.anInt7250;
		} else if (arg1 == 9) {
			this.anInt7238 = arg0.method5028() << 0;
		} else if (arg1 == 10) {
			this.aBoolean513 = false;
		} else if (arg1 == 11) {
			this.anInt7244 = arg0.method5007();
		} else if (arg1 == 12) {
			this.aBoolean511 = true;
		} else if (arg1 == 13) {
			this.anInt7246 = arg0.method5008();
		} else if (arg1 == 14) {
			this.anInt7242 = arg0.method5007() << 0;
		} else if (arg1 == 15) {
			this.anInt7239 = arg0.method5028();
			if (this.anInt7239 == 65535) {
				this.anInt7239 = -1;
			}
		} else if (arg1 == 16) {
			this.anInt7240 = arg0.method5007();
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
	public void method5816() {
		this.anInt7244 = this.anInt7250 | this.anInt7244 << 8;
		if (this.anInt7239 == -1) {
			this.anInt7239 = this.anInt7247;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!fh;I)V")
	public void method5818(@OriginalArg(0) Class4_Sub9 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5007();
			if (local9 == 0) {
				return;
			}
			this.method5815(arg0, local9);
		}
	}
}
