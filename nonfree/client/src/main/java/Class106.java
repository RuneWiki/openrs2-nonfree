import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public abstract class Class106 {

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "Z")
	protected boolean aBoolean460;

	@OriginalMember(owner = "client!hk", name = "h", descriptor = "Z")
	protected boolean aBoolean461;

	@OriginalMember(owner = "client!hk", name = "I", descriptor = "Z")
	public boolean aBoolean470;

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "Z")
	public boolean aBoolean459 = false;

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
	protected int anInt5677 = 2;

	@OriginalMember(owner = "client!hk", name = "n", descriptor = "Z")
	protected boolean aBoolean464 = true;

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
	public int anInt5675 = 0;

	@OriginalMember(owner = "client!hk", name = "q", descriptor = "I")
	public int anInt5681 = 0;

	@OriginalMember(owner = "client!hk", name = "r", descriptor = "I")
	public int anInt5682 = 127;

	@OriginalMember(owner = "client!hk", name = "k", descriptor = "Z")
	public boolean aBoolean463 = false;

	@OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
	public int anInt5680 = 2;

	@OriginalMember(owner = "client!hk", name = "t", descriptor = "Z")
	public boolean aBoolean467 = true;

	@OriginalMember(owner = "client!hk", name = "o", descriptor = "Z")
	public boolean aBoolean465 = true;

	@OriginalMember(owner = "client!hk", name = "s", descriptor = "Z")
	public boolean aBoolean466 = true;

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
	public int anInt5678 = 1;

	@OriginalMember(owner = "client!hk", name = "j", descriptor = "Z")
	public boolean aBoolean462 = true;

	@OriginalMember(owner = "client!hk", name = "x", descriptor = "I")
	public int anInt5685 = 0;

	@OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
	public int anInt5683 = 0;

	@OriginalMember(owner = "client!hk", name = "C", descriptor = "I")
	public int anInt5688 = 2;

	@OriginalMember(owner = "client!hk", name = "M", descriptor = "Z")
	public boolean aBoolean473 = true;

	@OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
	public int anInt5679 = 2;

	@OriginalMember(owner = "client!hk", name = "J", descriptor = "Z")
	public boolean aBoolean471 = true;

	@OriginalMember(owner = "client!hk", name = "y", descriptor = "I")
	protected int anInt5686 = 0;

	@OriginalMember(owner = "client!hk", name = "P", descriptor = "Z")
	public boolean aBoolean475 = true;

	@OriginalMember(owner = "client!hk", name = "z", descriptor = "Z")
	public boolean aBoolean468 = true;

	@OriginalMember(owner = "client!hk", name = "N", descriptor = "I")
	public int anInt5694 = 255;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "Z")
	public boolean aBoolean458 = false;

	@OriginalMember(owner = "client!hk", name = "L", descriptor = "Z")
	public boolean aBoolean472 = true;

	@OriginalMember(owner = "client!hk", name = "T", descriptor = "I")
	public int anInt5698 = 3;

	@OriginalMember(owner = "client!hk", name = "B", descriptor = "Z")
	public boolean aBoolean469 = true;

	@OriginalMember(owner = "client!hk", name = "O", descriptor = "Z")
	public boolean aBoolean474 = true;

	@OriginalMember(owner = "client!hk", name = "R", descriptor = "I")
	public int anInt5696 = 127;

	@OriginalMember(owner = "client!hk", name = "w", descriptor = "I")
	public int anInt5684 = 0;

	@OriginalMember(owner = "client!hk", name = "V", descriptor = "I")
	public int anInt5700 = 0;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V")
	protected Class106() {
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZB)V")
	public final void method4418(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == 1 || arg0 == 3) {
			this.aBoolean461 = arg1;
		} else {
			this.aBoolean460 = arg1;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)Z")
	public final boolean method4423(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.aBoolean461 : this.aBoolean460;
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(II)I")
	public final int method4424(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.anInt5677 : this.anInt5686;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIB)V")
	public final void method4426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1 || arg1 == 3) {
			this.anInt5677 = arg0;
		} else {
			this.anInt5686 = arg0;
		}
	}
}
