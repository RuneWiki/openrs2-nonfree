import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fv")
public final class Class92 {

	@OriginalMember(owner = "client!fv", name = "p", descriptor = "I")
	public int anInt2783;

	@OriginalMember(owner = "client!fv", name = "u", descriptor = "Lclient!uo;")
	public Class251 aClass251_3;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "I")
	public int anInt2773 = 16;

	@OriginalMember(owner = "client!fv", name = "d", descriptor = "I")
	public int anInt2775 = 0;

	@OriginalMember(owner = "client!fv", name = "n", descriptor = "I")
	public int anInt2782 = 128;

	@OriginalMember(owner = "client!fv", name = "o", descriptor = "Z")
	public boolean aBoolean178 = true;

	@OriginalMember(owner = "client!fv", name = "j", descriptor = "I")
	public int anInt2780 = -1;

	@OriginalMember(owner = "client!fv", name = "l", descriptor = "Z")
	public boolean aBoolean177 = false;

	@OriginalMember(owner = "client!fv", name = "m", descriptor = "I")
	public int anInt2781 = 1190717;

	@OriginalMember(owner = "client!fv", name = "g", descriptor = "I")
	public int anInt2778 = -1;

	@OriginalMember(owner = "client!fv", name = "h", descriptor = "Z")
	public boolean aBoolean176 = true;

	@OriginalMember(owner = "client!fv", name = "s", descriptor = "I")
	public int anInt2785 = 127;

	@OriginalMember(owner = "client!fv", name = "r", descriptor = "I")
	public int anInt2784 = -1;

	@OriginalMember(owner = "client!fv", name = "w", descriptor = "I")
	public int anInt2787 = 8;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lclient!ia;BI)V")
	private void method2048(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2775 = Static404.method4330(arg0.method1226());
		} else if (arg1 == 2) {
			this.anInt2784 = arg0.method1171();
		} else if (arg1 == 3) {
			this.anInt2784 = arg0.method1177();
			if (this.anInt2784 == 65535) {
				this.anInt2784 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean178 = false;
		} else if (arg1 == 7) {
			this.anInt2778 = Static404.method4330(arg0.method1226());
		} else if (arg1 == 8) {
			this.aClass251_3.anInt7374 = this.anInt2783;
		} else if (arg1 == 9) {
			this.anInt2782 = arg0.method1177() << 0;
		} else if (arg1 == 10) {
			this.aBoolean176 = false;
		} else if (arg1 == 11) {
			this.anInt2787 = arg0.method1171();
		} else if (arg1 == 12) {
			this.aBoolean177 = true;
		} else if (arg1 == 13) {
			this.anInt2781 = arg0.method1226();
		} else if (arg1 == 14) {
			this.anInt2773 = arg0.method1171() << 0;
		} else if (arg1 == 15) {
			this.anInt2780 = arg0.method1177();
			if (this.anInt2780 == 65535) {
				this.anInt2780 = -1;
			}
		} else if (arg1 == 16) {
			this.anInt2785 = arg0.method1171();
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V")
	public void method2049() {
		this.anInt2787 = this.anInt2783 | this.anInt2787 << 8;
		if (this.anInt2780 == -1) {
			this.anInt2780 = this.anInt2784;
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(ILclient!ia;)V")
	public void method2050(@OriginalArg(1) Class1_Sub3 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method1171();
			if (local7 == 0) {
				return;
			}
			this.method2048(arg0, local7);
		}
	}
}
