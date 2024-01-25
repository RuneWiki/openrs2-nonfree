import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public abstract class Class79 {

	@OriginalMember(owner = "client!fl", name = "k", descriptor = "Z")
	protected boolean aBoolean357;

	@OriginalMember(owner = "client!fl", name = "q", descriptor = "Z")
	protected boolean aBoolean359;

	@OriginalMember(owner = "client!fl", name = "x", descriptor = "Z")
	public boolean aBoolean363;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "Z")
	public boolean aBoolean351 = true;

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "Z")
	public boolean aBoolean352 = false;

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
	public int anInt4913 = 2;

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "Z")
	public boolean aBoolean354 = true;

	@OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
	public int anInt4917 = 2;

	@OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
	protected int anInt4918 = 0;

	@OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
	public int anInt4915 = 127;

	@OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
	public int anInt4916 = 0;

	@OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
	public int anInt4920 = 127;

	@OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
	public int anInt4914 = 0;

	@OriginalMember(owner = "client!fl", name = "z", descriptor = "Z")
	public boolean aBoolean364 = false;

	@OriginalMember(owner = "client!fl", name = "F", descriptor = "I")
	public int anInt4926 = 2;

	@OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
	public int anInt4919 = 0;

	@OriginalMember(owner = "client!fl", name = "C", descriptor = "I")
	protected int anInt4924 = 2;

	@OriginalMember(owner = "client!fl", name = "v", descriptor = "Z")
	public boolean aBoolean361 = true;

	@OriginalMember(owner = "client!fl", name = "i", descriptor = "Z")
	protected boolean aBoolean356 = true;

	@OriginalMember(owner = "client!fl", name = "E", descriptor = "I")
	public int anInt4925 = 1;

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "Z")
	public boolean aBoolean353 = false;

	@OriginalMember(owner = "client!fl", name = "G", descriptor = "I")
	public int anInt4927 = 0;

	@OriginalMember(owner = "client!fl", name = "w", descriptor = "Z")
	public boolean aBoolean362 = true;

	@OriginalMember(owner = "client!fl", name = "H", descriptor = "Z")
	public boolean aBoolean366 = true;

	@OriginalMember(owner = "client!fl", name = "I", descriptor = "Z")
	public boolean aBoolean367 = true;

	@OriginalMember(owner = "client!fl", name = "p", descriptor = "Z")
	public boolean aBoolean358 = true;

	@OriginalMember(owner = "client!fl", name = "D", descriptor = "Z")
	public boolean aBoolean365 = true;

	@OriginalMember(owner = "client!fl", name = "s", descriptor = "Z")
	public boolean aBoolean360 = true;

	@OriginalMember(owner = "client!fl", name = "M", descriptor = "I")
	public int anInt4929 = 0;

	@OriginalMember(owner = "client!fl", name = "O", descriptor = "I")
	public int anInt4931 = 255;

	@OriginalMember(owner = "client!fl", name = "N", descriptor = "I")
	public int anInt4930 = 0;

	@OriginalMember(owner = "client!fl", name = "K", descriptor = "Z")
	public boolean aBoolean368 = true;

	@OriginalMember(owner = "client!fl", name = "J", descriptor = "I")
	public int anInt4928 = 3;

	@OriginalMember(owner = "client!fl", name = "h", descriptor = "Z")
	public boolean aBoolean355 = true;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V")
	protected Class79() {
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZB)V")
	public final void method3956(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == 1 || arg0 == 3) {
			this.aBoolean359 = arg1;
		} else {
			this.aBoolean357 = arg1;
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IBI)V")
	public final void method3958(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1 || arg1 == 3) {
			this.anInt4924 = arg0;
		} else {
			this.anInt4918 = arg0;
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BI)Z")
	public final boolean method3959(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.aBoolean359 : this.aBoolean357;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IB)I")
	public final int method3960(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.anInt4924 : this.anInt4918;
	}
}
