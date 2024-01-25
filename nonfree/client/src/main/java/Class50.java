import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public abstract class Class50 {

	@OriginalMember(owner = "client!dj", name = "A", descriptor = "Z")
	protected boolean aBoolean299;

	@OriginalMember(owner = "client!dj", name = "E", descriptor = "Z")
	protected boolean aBoolean301;

	@OriginalMember(owner = "client!dj", name = "N", descriptor = "Z")
	public boolean aBoolean303;

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
	public int anInt3428 = 0;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "Z")
	public boolean aBoolean289 = true;

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "Z")
	public boolean aBoolean291 = true;

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "Z")
	public boolean aBoolean293 = true;

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "Z")
	protected boolean aBoolean290 = true;

	@OriginalMember(owner = "client!dj", name = "j", descriptor = "Z")
	public boolean aBoolean295 = true;

	@OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
	public int anInt3433 = 1;

	@OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
	public int anInt3437 = 2;

	@OriginalMember(owner = "client!dj", name = "x", descriptor = "I")
	public int anInt3442 = 0;

	@OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
	public int anInt3434 = 0;

	@OriginalMember(owner = "client!dj", name = "y", descriptor = "Z")
	public boolean aBoolean297 = false;

	@OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
	protected int anInt3430 = 0;

	@OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
	public int anInt3431 = 0;

	@OriginalMember(owner = "client!dj", name = "t", descriptor = "Z")
	public boolean aBoolean296 = true;

	@OriginalMember(owner = "client!dj", name = "v", descriptor = "I")
	public int anInt3440 = 0;

	@OriginalMember(owner = "client!dj", name = "D", descriptor = "Z")
	public boolean aBoolean300 = false;

	@OriginalMember(owner = "client!dj", name = "p", descriptor = "I")
	protected int anInt3435 = 2;

	@OriginalMember(owner = "client!dj", name = "u", descriptor = "I")
	public int anInt3439 = 255;

	@OriginalMember(owner = "client!dj", name = "q", descriptor = "I")
	public int anInt3436 = 3;

	@OriginalMember(owner = "client!dj", name = "L", descriptor = "I")
	public int anInt3449 = 127;

	@OriginalMember(owner = "client!dj", name = "H", descriptor = "I")
	public int anInt3447 = 2;

	@OriginalMember(owner = "client!dj", name = "F", descriptor = "I")
	public int anInt3445 = 2;

	@OriginalMember(owner = "client!dj", name = "M", descriptor = "I")
	public int anInt3450 = 0;

	@OriginalMember(owner = "client!dj", name = "K", descriptor = "I")
	public int anInt3448 = 127;

	@OriginalMember(owner = "client!dj", name = "z", descriptor = "Z")
	public boolean aBoolean298 = true;

	@OriginalMember(owner = "client!dj", name = "h", descriptor = "Z")
	public boolean aBoolean294 = true;

	@OriginalMember(owner = "client!dj", name = "R", descriptor = "Z")
	public boolean aBoolean307 = false;

	@OriginalMember(owner = "client!dj", name = "P", descriptor = "Z")
	public boolean aBoolean305 = true;

	@OriginalMember(owner = "client!dj", name = "Q", descriptor = "Z")
	public boolean aBoolean306 = true;

	@OriginalMember(owner = "client!dj", name = "O", descriptor = "Z")
	public boolean aBoolean304 = true;

	@OriginalMember(owner = "client!dj", name = "I", descriptor = "Z")
	public boolean aBoolean302 = true;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V")
	protected Class50() {
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IB)I")
	public final int method2850(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.anInt3435 : this.anInt3430;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)V")
	public final void method2852(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 1 || arg0 == 3) {
			this.anInt3435 = arg1;
		} else {
			this.anInt3430 = arg1;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)Z")
	public final boolean method2854(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.aBoolean299 : this.aBoolean301;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZII)V")
	public final void method2855(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1 || arg1 == 3) {
			this.aBoolean299 = arg0;
		} else {
			this.aBoolean301 = arg0;
		}
	}
}
