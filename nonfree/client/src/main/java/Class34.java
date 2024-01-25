import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class34 {

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
	public int anInt682 = 8;

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
	public int anInt683 = 16;

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "Z")
	public boolean aBoolean37 = true;

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
	public int anInt686 = -1;

	@OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
	public int anInt690 = -1;

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
	public int anInt685 = 1190717;

	@OriginalMember(owner = "client!cf", name = "n", descriptor = "Z")
	public boolean aBoolean39 = true;

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "Z")
	public boolean aBoolean38 = false;

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
	public int anInt684 = 0;

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
	public int anInt692 = 128;

	@OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
	public int anInt689 = -1;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZIILclient!kh;)V")
	private void method545(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class11_Sub25 arg2) {
		if (arg1 == 1) {
			this.anInt684 = Static169.method5407(arg2.method5221());
		} else if (arg1 == 2) {
			this.anInt686 = arg2.method5185();
		} else if (arg1 == 3) {
			this.anInt686 = arg2.method5187();
			if (this.anInt686 == 65535) {
				this.anInt686 = -1;
				return;
			}
		} else if (arg1 == 5) {
			this.aBoolean37 = false;
		} else if (arg1 == 7) {
			this.anInt689 = Static169.method5407(arg2.method5221());
			return;
		} else if (arg1 == 8) {
			Static71.anInt1348 = arg0;
			return;
		} else if (arg1 == 9) {
			this.anInt692 = arg2.method5187();
			return;
		} else if (arg1 == 10) {
			this.aBoolean39 = false;
			return;
		} else if (arg1 == 11) {
			this.anInt682 = arg2.method5185();
			return;
		} else if (arg1 == 12) {
			this.aBoolean38 = true;
			return;
		} else if (arg1 == 13) {
			this.anInt685 = arg2.method5221();
			return;
		} else {
			if (arg1 == 14) {
				this.anInt683 = arg2.method5185();
			} else if (arg1 == 15) {
				this.anInt690 = arg2.method5187();
				if (this.anInt690 == 65535) {
					this.anInt690 = -1;
					return;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)V")
	public void method548(@OriginalArg(1) int arg0) {
		if (this.anInt690 == -1) {
			this.anInt690 = this.anInt686;
		}
		this.anInt682 = this.anInt682 << 8 | arg0;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILclient!kh;I)V")
	public void method549(@OriginalArg(1) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method5185();
			if (local5 == 0) {
				return;
			}
			this.method545(arg1, local5, arg0);
		}
	}
}
