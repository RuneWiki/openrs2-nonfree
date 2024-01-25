import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public abstract class Class153 {

	@OriginalMember(owner = "client!me", name = "e", descriptor = "Z")
	public boolean aBoolean337;

	@OriginalMember(owner = "client!me", name = "t", descriptor = "Z")
	protected boolean aBoolean342;

	@OriginalMember(owner = "client!me", name = "w", descriptor = "Z")
	protected boolean aBoolean345;

	@OriginalMember(owner = "client!me", name = "s", descriptor = "Z")
	public boolean aBoolean341 = true;

	@OriginalMember(owner = "client!me", name = "o", descriptor = "I")
	public int anInt5239 = 0;

	@OriginalMember(owner = "client!me", name = "m", descriptor = "Z")
	public boolean aBoolean339 = false;

	@OriginalMember(owner = "client!me", name = "b", descriptor = "I")
	public int anInt5230 = 2;

	@OriginalMember(owner = "client!me", name = "k", descriptor = "Z")
	public boolean aBoolean338 = false;

	@OriginalMember(owner = "client!me", name = "h", descriptor = "I")
	protected int anInt5235 = 0;

	@OriginalMember(owner = "client!me", name = "D", descriptor = "Z")
	public boolean aBoolean349 = true;

	@OriginalMember(owner = "client!me", name = "A", descriptor = "Z")
	public boolean aBoolean347 = true;

	@OriginalMember(owner = "client!me", name = "x", descriptor = "Z")
	protected boolean aBoolean346 = true;

	@OriginalMember(owner = "client!me", name = "c", descriptor = "I")
	public int anInt5231 = 0;

	@OriginalMember(owner = "client!me", name = "g", descriptor = "I")
	public int anInt5234 = 0;

	@OriginalMember(owner = "client!me", name = "f", descriptor = "I")
	public int anInt5233 = 2;

	@OriginalMember(owner = "client!me", name = "E", descriptor = "Z")
	public boolean aBoolean350 = true;

	@OriginalMember(owner = "client!me", name = "r", descriptor = "I")
	public int anInt5241 = 0;

	@OriginalMember(owner = "client!me", name = "n", descriptor = "I")
	public int anInt5238 = 1;

	@OriginalMember(owner = "client!me", name = "C", descriptor = "I")
	public int anInt5244 = 0;

	@OriginalMember(owner = "client!me", name = "G", descriptor = "Z")
	public boolean aBoolean352 = false;

	@OriginalMember(owner = "client!me", name = "J", descriptor = "I")
	public int anInt5246 = 127;

	@OriginalMember(owner = "client!me", name = "I", descriptor = "I")
	public int anInt5245 = 2;

	@OriginalMember(owner = "client!me", name = "K", descriptor = "I")
	protected int anInt5247 = 2;

	@OriginalMember(owner = "client!me", name = "u", descriptor = "Z")
	public boolean aBoolean343 = true;

	@OriginalMember(owner = "client!me", name = "l", descriptor = "I")
	public int anInt5237 = 127;

	@OriginalMember(owner = "client!me", name = "F", descriptor = "Z")
	public boolean aBoolean351 = true;

	@OriginalMember(owner = "client!me", name = "p", descriptor = "I")
	public int anInt5240 = 255;

	@OriginalMember(owner = "client!me", name = "y", descriptor = "I")
	public int anInt5242 = 0;

	@OriginalMember(owner = "client!me", name = "N", descriptor = "Z")
	public boolean aBoolean353 = true;

	@OriginalMember(owner = "client!me", name = "B", descriptor = "Z")
	public boolean aBoolean348 = true;

	@OriginalMember(owner = "client!me", name = "O", descriptor = "Z")
	public boolean aBoolean354 = true;

	@OriginalMember(owner = "client!me", name = "q", descriptor = "Z")
	public boolean aBoolean340 = true;

	@OriginalMember(owner = "client!me", name = "v", descriptor = "Z")
	public boolean aBoolean344 = true;

	@OriginalMember(owner = "client!me", name = "P", descriptor = "I")
	public int anInt5250 = 3;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
	protected Class153() {
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II)I")
	public final int method4217(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.anInt5247 : this.anInt5235;
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(II)Z")
	public final boolean method4218(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.aBoolean345 : this.aBoolean342;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIZ)V")
	public final void method4219(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == 1 || arg0 == 3) {
			this.aBoolean345 = arg1;
		} else {
			this.aBoolean342 = arg1;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(III)V")
	public final void method4220(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 1 || arg0 == 3) {
			this.anInt5247 = arg1;
		} else {
			this.anInt5235 = arg1;
		}
	}
}
