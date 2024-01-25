import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public abstract class Class135 {

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "Z")
	protected boolean aBoolean355;

	@OriginalMember(owner = "client!ki", name = "z", descriptor = "Z")
	public boolean aBoolean362;

	@OriginalMember(owner = "client!ki", name = "A", descriptor = "Z")
	protected boolean aBoolean363;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
	public int anInt5090 = 2;

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
	public int anInt5092 = 127;

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "Z")
	public boolean aBoolean353 = true;

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
	public int anInt5091 = 0;

	@OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
	public int anInt5102 = 0;

	@OriginalMember(owner = "client!ki", name = "y", descriptor = "Z")
	protected boolean aBoolean361 = true;

	@OriginalMember(owner = "client!ki", name = "q", descriptor = "I")
	public int anInt5098 = 2;

	@OriginalMember(owner = "client!ki", name = "n", descriptor = "Z")
	public boolean aBoolean358 = true;

	@OriginalMember(owner = "client!ki", name = "m", descriptor = "Z")
	public boolean aBoolean357 = false;

	@OriginalMember(owner = "client!ki", name = "D", descriptor = "I")
	public int anInt5105 = 2;

	@OriginalMember(owner = "client!ki", name = "C", descriptor = "Z")
	public boolean aBoolean365 = true;

	@OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
	public int anInt5095 = 0;

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "Z")
	public boolean aBoolean352 = true;

	@OriginalMember(owner = "client!ki", name = "F", descriptor = "Z")
	public boolean aBoolean366 = true;

	@OriginalMember(owner = "client!ki", name = "G", descriptor = "Z")
	public boolean aBoolean367 = true;

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
	public int anInt5093 = 1;

	@OriginalMember(owner = "client!ki", name = "r", descriptor = "I")
	public int anInt5099 = 0;

	@OriginalMember(owner = "client!ki", name = "k", descriptor = "Z")
	public boolean aBoolean356 = true;

	@OriginalMember(owner = "client!ki", name = "o", descriptor = "Z")
	public boolean aBoolean359 = false;

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "Z")
	public boolean aBoolean354 = true;

	@OriginalMember(owner = "client!ki", name = "H", descriptor = "I")
	protected int anInt5107 = 2;

	@OriginalMember(owner = "client!ki", name = "B", descriptor = "Z")
	public boolean aBoolean364 = true;

	@OriginalMember(owner = "client!ki", name = "v", descriptor = "I")
	public int anInt5103 = 0;

	@OriginalMember(owner = "client!ki", name = "I", descriptor = "I")
	public int anInt5108 = 0;

	@OriginalMember(owner = "client!ki", name = "J", descriptor = "I")
	public int anInt5109 = 255;

	@OriginalMember(owner = "client!ki", name = "L", descriptor = "I")
	public int anInt5110 = 127;

	@OriginalMember(owner = "client!ki", name = "K", descriptor = "Z")
	public boolean aBoolean368 = true;

	@OriginalMember(owner = "client!ki", name = "M", descriptor = "Z")
	public boolean aBoolean369 = false;

	@OriginalMember(owner = "client!ki", name = "N", descriptor = "I")
	public int anInt5111 = 3;

	@OriginalMember(owner = "client!ki", name = "x", descriptor = "Z")
	public boolean aBoolean360 = true;

	@OriginalMember(owner = "client!ki", name = "O", descriptor = "I")
	protected int anInt5112 = 0;

	static {
		new Class7("Use", "Benutzen", "Utiliser", "Usar");
	}

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V")
	protected Class135() {
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IBI)V")
	public final void method4232(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 1 || arg0 == 3) {
			this.anInt5107 = arg1;
		} else {
			this.anInt5112 = arg1;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IZI)V")
	public final void method4233(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1 || arg1 == 3) {
			this.aBoolean355 = arg0;
		} else {
			this.aBoolean363 = arg0;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)I")
	public final int method4236(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.anInt5107 : this.anInt5112;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZI)Z")
	public final boolean method4237(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.aBoolean355 : this.aBoolean363;
	}
}
