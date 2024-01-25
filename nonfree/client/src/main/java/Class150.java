import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class150 {

	@OriginalMember(owner = "client!or", name = "b", descriptor = "I")
	public int anInt4531 = 1190717;

	@OriginalMember(owner = "client!or", name = "d", descriptor = "Z")
	public boolean aBoolean414 = true;

	@OriginalMember(owner = "client!or", name = "e", descriptor = "I")
	public int anInt4533 = 16;

	@OriginalMember(owner = "client!or", name = "f", descriptor = "I")
	public int anInt4534 = -1;

	@OriginalMember(owner = "client!or", name = "g", descriptor = "Z")
	public boolean aBoolean415 = false;

	@OriginalMember(owner = "client!or", name = "h", descriptor = "I")
	public int anInt4535 = 0;

	@OriginalMember(owner = "client!or", name = "i", descriptor = "I")
	public int anInt4536 = 128;

	@OriginalMember(owner = "client!or", name = "l", descriptor = "I")
	public int anInt4538 = -1;

	@OriginalMember(owner = "client!or", name = "r", descriptor = "I")
	public int anInt4543 = 8;

	@OriginalMember(owner = "client!or", name = "t", descriptor = "I")
	public int anInt4545 = -1;

	@OriginalMember(owner = "client!or", name = "q", descriptor = "Z")
	public boolean aBoolean416 = true;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIILclient!dg;)V")
	private void method4079(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub10 arg2) {
		if (arg1 == 1) {
			this.anInt4535 = Static81.method1822(arg2.method4463());
		} else if (arg1 == 2) {
			this.anInt4545 = arg2.method4421();
		} else if (arg1 == 3) {
			this.anInt4545 = arg2.method4464();
			if (this.anInt4545 == 65535) {
				this.anInt4545 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean414 = false;
		} else if (arg1 == 7) {
			this.anInt4538 = Static81.method1822(arg2.method4463());
		} else if (arg1 == 8) {
			Static15.anInt381 = arg0;
		} else if (arg1 == 9) {
			this.anInt4536 = arg2.method4464();
		} else if (arg1 == 10) {
			this.aBoolean416 = false;
		} else if (arg1 == 11) {
			this.anInt4543 = arg2.method4421();
		} else if (arg1 == 12) {
			this.aBoolean415 = true;
		} else if (arg1 == 13) {
			this.anInt4531 = arg2.method4463();
		} else if (arg1 == 14) {
			this.anInt4533 = arg2.method4421();
		} else if (arg1 == 15) {
			this.anInt4534 = arg2.method4464();
			if (this.anInt4534 == 65535) {
				this.anInt4534 = -1;
			}
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ILclient!dg;I)V")
	public void method4080(@OriginalArg(1) Class2_Sub10 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(10) int local10 = arg0.method4421();
			if (local10 == 0) {
				return;
			}
			this.method4079(arg1, local10, arg0);
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ZI)V")
	public void method4081(@OriginalArg(1) int arg0) {
		this.anInt4543 = this.anInt4543 << 8 | arg0;
		if (this.anInt4534 == -1) {
			this.anInt4534 = this.anInt4545;
		}
	}
}
