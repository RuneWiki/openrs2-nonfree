import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public abstract class Class1 {

	@OriginalMember(owner = "client!a", name = "f", descriptor = "Z")
	public boolean aBoolean297;

	@OriginalMember(owner = "client!a", name = "h", descriptor = "Z")
	protected boolean aBoolean298;

	@OriginalMember(owner = "client!a", name = "m", descriptor = "Z")
	protected boolean aBoolean299;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "I")
	public int anInt4503 = 0;

	@OriginalMember(owner = "client!a", name = "l", descriptor = "I")
	public int anInt4510 = 0;

	@OriginalMember(owner = "client!a", name = "p", descriptor = "Z")
	public boolean aBoolean301 = true;

	@OriginalMember(owner = "client!a", name = "q", descriptor = "Z")
	public boolean aBoolean302 = true;

	@OriginalMember(owner = "client!a", name = "v", descriptor = "Z")
	public boolean aBoolean305 = true;

	@OriginalMember(owner = "client!a", name = "j", descriptor = "I")
	public int anInt4508 = 0;

	@OriginalMember(owner = "client!a", name = "w", descriptor = "I")
	public int anInt4514 = 2;

	@OriginalMember(owner = "client!a", name = "B", descriptor = "I")
	public int anInt4517 = 0;

	@OriginalMember(owner = "client!a", name = "r", descriptor = "I")
	public int anInt4512 = 127;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "I")
	public int anInt4501 = 1;

	@OriginalMember(owner = "client!a", name = "z", descriptor = "I")
	public int anInt4515 = 3;

	@OriginalMember(owner = "client!a", name = "D", descriptor = "Z")
	public boolean aBoolean309 = false;

	@OriginalMember(owner = "client!a", name = "x", descriptor = "Z")
	public boolean aBoolean306 = true;

	@OriginalMember(owner = "client!a", name = "C", descriptor = "Z")
	public boolean aBoolean308 = true;

	@OriginalMember(owner = "client!a", name = "t", descriptor = "Z")
	public boolean aBoolean303 = true;

	@OriginalMember(owner = "client!a", name = "A", descriptor = "I")
	public int anInt4516 = 2;

	@OriginalMember(owner = "client!a", name = "o", descriptor = "I")
	protected int anInt4511 = 0;

	@OriginalMember(owner = "client!a", name = "k", descriptor = "I")
	public int anInt4509 = 255;

	@OriginalMember(owner = "client!a", name = "y", descriptor = "Z")
	protected boolean aBoolean307 = true;

	@OriginalMember(owner = "client!a", name = "H", descriptor = "Z")
	public boolean aBoolean310 = true;

	@OriginalMember(owner = "client!a", name = "b", descriptor = "I")
	public int anInt4502 = 2;

	@OriginalMember(owner = "client!a", name = "E", descriptor = "I")
	public int anInt4518 = 0;

	@OriginalMember(owner = "client!a", name = "u", descriptor = "Z")
	public boolean aBoolean304 = false;

	@OriginalMember(owner = "client!a", name = "g", descriptor = "I")
	public int anInt4506 = 0;

	@OriginalMember(owner = "client!a", name = "L", descriptor = "I")
	protected int anInt4520 = 2;

	@OriginalMember(owner = "client!a", name = "K", descriptor = "Z")
	public boolean aBoolean313 = true;

	@OriginalMember(owner = "client!a", name = "n", descriptor = "Z")
	public boolean aBoolean300 = true;

	@OriginalMember(owner = "client!a", name = "J", descriptor = "Z")
	public boolean aBoolean312 = false;

	@OriginalMember(owner = "client!a", name = "I", descriptor = "Z")
	public boolean aBoolean311 = true;

	@OriginalMember(owner = "client!a", name = "M", descriptor = "Z")
	public boolean aBoolean314 = true;

	@OriginalMember(owner = "client!a", name = "O", descriptor = "I")
	public int anInt4521 = 127;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
	protected Class1() {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IZ)Z")
	public final boolean method3579(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.aBoolean298 : this.aBoolean299;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)I")
	public final int method3580(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.anInt4520 : this.anInt4511;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIZ)V")
	public final void method3581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 1 || arg0 == 3) {
			this.anInt4520 = arg1;
		} else {
			this.anInt4511 = arg1;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ZBI)V")
	public final void method3583(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1 || arg1 == 3) {
			this.aBoolean298 = arg0;
		} else {
			this.aBoolean299 = arg0;
		}
	}
}
