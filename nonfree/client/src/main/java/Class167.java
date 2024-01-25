import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public abstract class Class167 {

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "Z")
	public boolean aBoolean480;

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "Z")
	protected boolean aBoolean484;

	@OriginalMember(owner = "client!nh", name = "L", descriptor = "Z")
	protected boolean aBoolean496;

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "Z")
	public boolean aBoolean481 = false;

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
	public int anInt5553 = 2;

	@OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
	protected int anInt5556 = 2;

	@OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
	public int anInt5554 = 3;

	@OriginalMember(owner = "client!nh", name = "h", descriptor = "Z")
	public boolean aBoolean482 = true;

	@OriginalMember(owner = "client!nh", name = "r", descriptor = "Z")
	public boolean aBoolean487 = false;

	@OriginalMember(owner = "client!nh", name = "s", descriptor = "Z")
	public boolean aBoolean488 = false;

	@OriginalMember(owner = "client!nh", name = "A", descriptor = "Z")
	public boolean aBoolean490 = true;

	@OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
	public int anInt5559 = 0;

	@OriginalMember(owner = "client!nh", name = "u", descriptor = "I")
	public int anInt5560 = 0;

	@OriginalMember(owner = "client!nh", name = "i", descriptor = "Z")
	public boolean aBoolean483 = true;

	@OriginalMember(owner = "client!nh", name = "x", descriptor = "I")
	public int anInt5562 = 0;

	@OriginalMember(owner = "client!nh", name = "F", descriptor = "I")
	public int anInt5566 = 0;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
	public int anInt5550 = 1;

	@OriginalMember(owner = "client!nh", name = "y", descriptor = "I")
	public int anInt5563 = 2;

	@OriginalMember(owner = "client!nh", name = "D", descriptor = "Z")
	public boolean aBoolean493 = true;

	@OriginalMember(owner = "client!nh", name = "C", descriptor = "Z")
	public boolean aBoolean492 = true;

	@OriginalMember(owner = "client!nh", name = "w", descriptor = "I")
	public int anInt5561 = 0;

	@OriginalMember(owner = "client!nh", name = "G", descriptor = "Z")
	public boolean aBoolean494 = true;

	@OriginalMember(owner = "client!nh", name = "J", descriptor = "I")
	public int anInt5567 = 127;

	@OriginalMember(owner = "client!nh", name = "E", descriptor = "I")
	public int anInt5565 = 127;

	@OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
	public int anInt5557 = 2;

	@OriginalMember(owner = "client!nh", name = "m", descriptor = "Z")
	public boolean aBoolean485 = true;

	@OriginalMember(owner = "client!nh", name = "N", descriptor = "I")
	public int anInt5568 = 255;

	@OriginalMember(owner = "client!nh", name = "v", descriptor = "Z")
	public boolean aBoolean489 = true;

	@OriginalMember(owner = "client!nh", name = "z", descriptor = "I")
	protected int anInt5564 = 0;

	@OriginalMember(owner = "client!nh", name = "B", descriptor = "Z")
	public boolean aBoolean491 = true;

	@OriginalMember(owner = "client!nh", name = "K", descriptor = "Z")
	public boolean aBoolean495 = true;

	@OriginalMember(owner = "client!nh", name = "n", descriptor = "Z")
	protected boolean aBoolean486 = true;

	@OriginalMember(owner = "client!nh", name = "P", descriptor = "I")
	public int anInt5569 = 0;

	@OriginalMember(owner = "client!nh", name = "Q", descriptor = "Z")
	public boolean aBoolean497 = true;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
	protected Class167() {
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)Z")
	public final boolean method4514(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.aBoolean496 : this.aBoolean484;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)V")
	public final void method4515(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1 || arg1 == 3) {
			this.anInt5556 = arg0;
		} else {
			this.anInt5564 = arg0;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZI)V")
	public final void method4516(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1 || arg1 == 3) {
			this.aBoolean496 = arg0;
		} else {
			this.aBoolean484 = arg0;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BI)I")
	public final int method4517(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.anInt5556 : this.anInt5564;
	}
}
