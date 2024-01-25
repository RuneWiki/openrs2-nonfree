import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public abstract class Class34 {

	@OriginalMember(owner = "client!bp", name = "g", descriptor = "Z")
	protected boolean aBoolean442;

	@OriginalMember(owner = "client!bp", name = "F", descriptor = "Z")
	public boolean aBoolean454;

	@OriginalMember(owner = "client!bp", name = "Q", descriptor = "Z")
	protected boolean aBoolean459;

	@OriginalMember(owner = "client!bp", name = "i", descriptor = "Z")
	public boolean aBoolean443 = true;

	@OriginalMember(owner = "client!bp", name = "m", descriptor = "Z")
	public boolean aBoolean445 = false;

	@OriginalMember(owner = "client!bp", name = "d", descriptor = "I")
	public int anInt7158 = 0;

	@OriginalMember(owner = "client!bp", name = "r", descriptor = "Z")
	public boolean aBoolean448 = true;

	@OriginalMember(owner = "client!bp", name = "k", descriptor = "Z")
	public boolean aBoolean444 = true;

	@OriginalMember(owner = "client!bp", name = "o", descriptor = "Z")
	public boolean aBoolean446 = true;

	@OriginalMember(owner = "client!bp", name = "h", descriptor = "I")
	public int anInt7161 = 0;

	@OriginalMember(owner = "client!bp", name = "p", descriptor = "Z")
	public boolean aBoolean447 = true;

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "I")
	public int anInt7157 = 255;

	@OriginalMember(owner = "client!bp", name = "z", descriptor = "Z")
	public boolean aBoolean451 = true;

	@OriginalMember(owner = "client!bp", name = "j", descriptor = "I")
	public int anInt7162 = 2;

	@OriginalMember(owner = "client!bp", name = "n", descriptor = "I")
	public int anInt7164 = 0;

	@OriginalMember(owner = "client!bp", name = "C", descriptor = "I")
	public int anInt7170 = 0;

	@OriginalMember(owner = "client!bp", name = "s", descriptor = "I")
	public int anInt7165 = 0;

	@OriginalMember(owner = "client!bp", name = "E", descriptor = "Z")
	public boolean aBoolean453 = false;

	@OriginalMember(owner = "client!bp", name = "t", descriptor = "Z")
	protected boolean aBoolean449 = true;

	@OriginalMember(owner = "client!bp", name = "f", descriptor = "I")
	protected int anInt7160 = 2;

	@OriginalMember(owner = "client!bp", name = "J", descriptor = "I")
	public int anInt7174 = 2;

	@OriginalMember(owner = "client!bp", name = "L", descriptor = "Z")
	public boolean aBoolean456 = true;

	@OriginalMember(owner = "client!bp", name = "u", descriptor = "I")
	public int anInt7166 = 1;

	@OriginalMember(owner = "client!bp", name = "I", descriptor = "I")
	public int anInt7173 = 127;

	@OriginalMember(owner = "client!bp", name = "K", descriptor = "I")
	public int anInt7175 = 127;

	@OriginalMember(owner = "client!bp", name = "w", descriptor = "I")
	public int anInt7168 = 3;

	@OriginalMember(owner = "client!bp", name = "B", descriptor = "Z")
	public boolean aBoolean452 = true;

	@OriginalMember(owner = "client!bp", name = "O", descriptor = "Z")
	public boolean aBoolean458 = false;

	@OriginalMember(owner = "client!bp", name = "M", descriptor = "Z")
	public boolean aBoolean457 = true;

	@OriginalMember(owner = "client!bp", name = "x", descriptor = "Z")
	public boolean aBoolean450 = true;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "I")
	protected int anInt7156 = 0;

	@OriginalMember(owner = "client!bp", name = "D", descriptor = "I")
	public int anInt7171 = 2;

	@OriginalMember(owner = "client!bp", name = "N", descriptor = "I")
	public int anInt7176 = 0;

	@OriginalMember(owner = "client!bp", name = "H", descriptor = "Z")
	public boolean aBoolean455 = true;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "()V")
	protected Class34() {
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZII)V")
	public final void method5461(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1 || arg1 == 3) {
			this.anInt7160 = arg0;
		} else {
			this.anInt7156 = arg0;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(II)I")
	public final int method5462(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.anInt7160 : this.anInt7156;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZZI)V")
	public final void method5464(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1 || arg1 == 3) {
			this.aBoolean459 = arg0;
		} else {
			this.aBoolean442 = arg0;
		}
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(II)Z")
	public final boolean method5466(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.aBoolean459 : this.aBoolean442;
	}
}
