import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public abstract class Class185 {

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "Z")
	public boolean aBoolean393;

	@OriginalMember(owner = "client!ok", name = "A", descriptor = "Z")
	protected boolean aBoolean399;

	@OriginalMember(owner = "client!ok", name = "O", descriptor = "Z")
	protected boolean aBoolean409;

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
	public int anInt5557 = 2;

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
	public int anInt5555 = 127;

	@OriginalMember(owner = "client!ok", name = "q", descriptor = "Z")
	protected boolean aBoolean396 = true;

	@OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
	public int anInt5563 = 0;

	@OriginalMember(owner = "client!ok", name = "n", descriptor = "Z")
	public boolean aBoolean395 = true;

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "Z")
	public boolean aBoolean394 = false;

	@OriginalMember(owner = "client!ok", name = "r", descriptor = "I")
	public int anInt5565 = 3;

	@OriginalMember(owner = "client!ok", name = "z", descriptor = "I")
	public int anInt5571 = 1;

	@OriginalMember(owner = "client!ok", name = "u", descriptor = "I")
	public int anInt5567 = 127;

	@OriginalMember(owner = "client!ok", name = "t", descriptor = "I")
	protected int anInt5566 = 2;

	@OriginalMember(owner = "client!ok", name = "F", descriptor = "I")
	public int anInt5573 = 2;

	@OriginalMember(owner = "client!ok", name = "p", descriptor = "I")
	public int anInt5564 = 0;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
	public int anInt5554 = 127;

	@OriginalMember(owner = "client!ok", name = "s", descriptor = "Z")
	public boolean aBoolean397 = true;

	@OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
	public int anInt5561 = 0;

	@OriginalMember(owner = "client!ok", name = "J", descriptor = "I")
	public int anInt5574 = 0;

	@OriginalMember(owner = "client!ok", name = "B", descriptor = "I")
	public int anInt5572 = 0;

	@OriginalMember(owner = "client!ok", name = "I", descriptor = "Z")
	public boolean aBoolean405 = false;

	@OriginalMember(owner = "client!ok", name = "H", descriptor = "Z")
	public boolean aBoolean404 = true;

	@OriginalMember(owner = "client!ok", name = "D", descriptor = "Z")
	public boolean aBoolean401 = false;

	@OriginalMember(owner = "client!ok", name = "w", descriptor = "Z")
	public boolean aBoolean398 = true;

	@OriginalMember(owner = "client!ok", name = "C", descriptor = "Z")
	public boolean aBoolean400 = true;

	@OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
	public int anInt5562 = 2;

	@OriginalMember(owner = "client!ok", name = "K", descriptor = "Z")
	public boolean aBoolean406 = true;

	@OriginalMember(owner = "client!ok", name = "G", descriptor = "Z")
	public boolean aBoolean403 = true;

	@OriginalMember(owner = "client!ok", name = "y", descriptor = "I")
	protected int anInt5570 = 0;

	@OriginalMember(owner = "client!ok", name = "M", descriptor = "Z")
	public boolean aBoolean408 = true;

	@OriginalMember(owner = "client!ok", name = "L", descriptor = "Z")
	public boolean aBoolean407 = true;

	@OriginalMember(owner = "client!ok", name = "E", descriptor = "Z")
	public boolean aBoolean402 = true;

	@OriginalMember(owner = "client!ok", name = "N", descriptor = "I")
	public int anInt5575 = 0;

	@OriginalMember(owner = "client!ok", name = "P", descriptor = "Z")
	public boolean aBoolean410 = true;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V")
	protected Class185() {
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZII)V")
	public final void method4629(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1 || arg1 == 3) {
			this.anInt5566 = arg0;
		} else {
			this.anInt5570 = arg0;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(BI)I")
	public final int method4630(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.anInt5566 : this.anInt5570;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(BIZ)V")
	public final void method4631(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == 1 || arg0 == 3) {
			this.aBoolean409 = arg1;
		} else {
			this.aBoolean399 = arg1;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)Z")
	public final boolean method4632(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.aBoolean409 : this.aBoolean399;
	}
}
