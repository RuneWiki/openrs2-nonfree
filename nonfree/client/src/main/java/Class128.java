import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public abstract class Class128 {

	@OriginalMember(owner = "client!qd", name = "m", descriptor = "Z")
	public boolean aBoolean233;

	@OriginalMember(owner = "client!qd", name = "C", descriptor = "Z")
	protected boolean aBoolean238;

	@OriginalMember(owner = "client!qd", name = "L", descriptor = "Z")
	protected boolean aBoolean244;

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
	public int anInt3561 = 0;

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
	public int anInt3562 = 3;

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
	public int anInt3560 = 0;

	@OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
	public int anInt3565 = 127;

	@OriginalMember(owner = "client!qd", name = "p", descriptor = "Z")
	public boolean aBoolean234 = true;

	@OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
	public int anInt3566 = 2;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
	public int anInt3558 = 0;

	@OriginalMember(owner = "client!qd", name = "x", descriptor = "I")
	public int anInt3572 = 2;

	@OriginalMember(owner = "client!qd", name = "G", descriptor = "I")
	public int anInt3576 = 0;

	@OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
	public int anInt3569 = 1;

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
	public int anInt3559 = 255;

	@OriginalMember(owner = "client!qd", name = "u", descriptor = "I")
	public int anInt3570 = 0;

	@OriginalMember(owner = "client!qd", name = "D", descriptor = "I")
	protected int anInt3575 = 0;

	@OriginalMember(owner = "client!qd", name = "M", descriptor = "Z")
	public boolean aBoolean245 = false;

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
	public int anInt3563 = 2;

	@OriginalMember(owner = "client!qd", name = "w", descriptor = "Z")
	public boolean aBoolean236 = false;

	@OriginalMember(owner = "client!qd", name = "F", descriptor = "Z")
	public boolean aBoolean240 = true;

	@OriginalMember(owner = "client!qd", name = "y", descriptor = "I")
	public int anInt3573 = 127;

	@OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
	protected int anInt3567 = 2;

	@OriginalMember(owner = "client!qd", name = "l", descriptor = "Z")
	public boolean aBoolean232 = true;

	@OriginalMember(owner = "client!qd", name = "J", descriptor = "Z")
	public boolean aBoolean242 = true;

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "Z")
	public boolean aBoolean229 = true;

	@OriginalMember(owner = "client!qd", name = "H", descriptor = "Z")
	public boolean aBoolean241 = true;

	@OriginalMember(owner = "client!qd", name = "K", descriptor = "Z")
	public boolean aBoolean243 = true;

	@OriginalMember(owner = "client!qd", name = "r", descriptor = "Z")
	public boolean aBoolean235 = true;

	@OriginalMember(owner = "client!qd", name = "z", descriptor = "Z")
	public boolean aBoolean237 = true;

	@OriginalMember(owner = "client!qd", name = "B", descriptor = "I")
	public int anInt3574 = 0;

	@OriginalMember(owner = "client!qd", name = "j", descriptor = "Z")
	protected boolean aBoolean231 = true;

	@OriginalMember(owner = "client!qd", name = "E", descriptor = "Z")
	public boolean aBoolean239 = false;

	@OriginalMember(owner = "client!qd", name = "N", descriptor = "Z")
	public boolean aBoolean246 = true;

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "Z")
	public boolean aBoolean230 = true;

	static {
		new Class84("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
	}

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
	protected Class128() {
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZII)V")
	public final void method2973(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1 || arg1 == 3) {
			this.aBoolean238 = arg0;
		} else {
			this.aBoolean244 = arg0;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IBI)V")
	public final void method2974(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1 || arg1 == 3) {
			this.anInt3567 = arg0;
		} else {
			this.anInt3575 = arg0;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)Z")
	public final boolean method2975(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.aBoolean238 : this.aBoolean244;
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(IB)I")
	public final int method2977(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.anInt3567 : this.anInt3575;
	}
}
