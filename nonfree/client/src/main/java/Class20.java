import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public abstract class Class20 {

	@OriginalMember(owner = "client!be", name = "i", descriptor = "Z")
	public boolean aBoolean186;

	@OriginalMember(owner = "client!be", name = "m", descriptor = "Z")
	protected boolean aBoolean188;

	@OriginalMember(owner = "client!be", name = "u", descriptor = "Z")
	protected boolean aBoolean192;

	@OriginalMember(owner = "client!be", name = "j", descriptor = "I")
	public int anInt2346 = 3;

	@OriginalMember(owner = "client!be", name = "f", descriptor = "Z")
	public boolean aBoolean185 = true;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "Z")
	public boolean aBoolean183 = true;

	@OriginalMember(owner = "client!be", name = "g", descriptor = "I")
	public int anInt2344 = 0;

	@OriginalMember(owner = "client!be", name = "s", descriptor = "I")
	public int anInt2351 = 0;

	@OriginalMember(owner = "client!be", name = "d", descriptor = "Z")
	public boolean aBoolean184 = true;

	@OriginalMember(owner = "client!be", name = "q", descriptor = "Z")
	public boolean aBoolean190 = true;

	@OriginalMember(owner = "client!be", name = "w", descriptor = "I")
	public int anInt2352 = 0;

	@OriginalMember(owner = "client!be", name = "l", descriptor = "I")
	public int anInt2347 = 2;

	@OriginalMember(owner = "client!be", name = "b", descriptor = "I")
	public int anInt2341 = 255;

	@OriginalMember(owner = "client!be", name = "x", descriptor = "Z")
	public boolean aBoolean193 = false;

	@OriginalMember(owner = "client!be", name = "t", descriptor = "Z")
	public boolean aBoolean191 = true;

	@OriginalMember(owner = "client!be", name = "z", descriptor = "Z")
	public boolean aBoolean195 = true;

	@OriginalMember(owner = "client!be", name = "y", descriptor = "Z")
	public boolean aBoolean194 = true;

	@OriginalMember(owner = "client!be", name = "c", descriptor = "I")
	public int anInt2342 = 1;

	@OriginalMember(owner = "client!be", name = "F", descriptor = "Z")
	public boolean aBoolean197 = false;

	@OriginalMember(owner = "client!be", name = "C", descriptor = "I")
	public int anInt2354 = 0;

	@OriginalMember(owner = "client!be", name = "H", descriptor = "I")
	protected int anInt2356 = 2;

	@OriginalMember(owner = "client!be", name = "e", descriptor = "I")
	protected int anInt2343 = 0;

	@OriginalMember(owner = "client!be", name = "o", descriptor = "I")
	public int anInt2349 = 127;

	@OriginalMember(owner = "client!be", name = "K", descriptor = "I")
	public int anInt2359 = 0;

	@OriginalMember(owner = "client!be", name = "L", descriptor = "Z")
	public boolean aBoolean198 = true;

	@OriginalMember(owner = "client!be", name = "B", descriptor = "I")
	public int anInt2353 = 2;

	@OriginalMember(owner = "client!be", name = "N", descriptor = "Z")
	public boolean aBoolean199 = true;

	@OriginalMember(owner = "client!be", name = "M", descriptor = "I")
	public int anInt2360 = 127;

	@OriginalMember(owner = "client!be", name = "I", descriptor = "I")
	public int anInt2357 = 2;

	@OriginalMember(owner = "client!be", name = "D", descriptor = "Z")
	public boolean aBoolean196 = true;

	@OriginalMember(owner = "client!be", name = "k", descriptor = "Z")
	protected boolean aBoolean187 = true;

	@OriginalMember(owner = "client!be", name = "O", descriptor = "Z")
	public boolean aBoolean200 = true;

	@OriginalMember(owner = "client!be", name = "r", descriptor = "I")
	public int anInt2350 = 0;

	@OriginalMember(owner = "client!be", name = "p", descriptor = "Z")
	public boolean aBoolean189 = false;

	static {
		new Class189("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
	}

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
	protected Class20() {
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BII)V")
	public final void method1802(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1 || arg1 == 3) {
			this.anInt2356 = arg0;
		} else {
			this.anInt2343 = arg0;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZIB)V")
	public final void method1803(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1 || arg1 == 3) {
			this.aBoolean192 = arg0;
		} else {
			this.aBoolean188 = arg0;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IB)Z")
	public final boolean method1805(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.aBoolean192 : this.aBoolean188;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)I")
	public final int method1806(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.anInt2356 : this.anInt2343;
	}
}
