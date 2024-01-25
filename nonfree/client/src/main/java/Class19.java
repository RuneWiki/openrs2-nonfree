import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public abstract class Class19 {

	@OriginalMember(owner = "client!as", name = "A", descriptor = "Z")
	public boolean aBoolean382;

	@OriginalMember(owner = "client!as", name = "D", descriptor = "Z")
	protected boolean aBoolean385;

	@OriginalMember(owner = "client!as", name = "N", descriptor = "Z")
	protected boolean aBoolean391;

	@OriginalMember(owner = "client!as", name = "h", descriptor = "I")
	public int anInt4221 = 127;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "Z")
	public boolean aBoolean375 = false;

	@OriginalMember(owner = "client!as", name = "b", descriptor = "Z")
	public boolean aBoolean376 = false;

	@OriginalMember(owner = "client!as", name = "m", descriptor = "I")
	public int anInt4226 = 127;

	@OriginalMember(owner = "client!as", name = "f", descriptor = "Z")
	public boolean aBoolean377 = false;

	@OriginalMember(owner = "client!as", name = "c", descriptor = "I")
	public int anInt4218 = 0;

	@OriginalMember(owner = "client!as", name = "q", descriptor = "Z")
	public boolean aBoolean378 = true;

	@OriginalMember(owner = "client!as", name = "e", descriptor = "I")
	public int anInt4220 = 2;

	@OriginalMember(owner = "client!as", name = "x", descriptor = "Z")
	public boolean aBoolean381 = true;

	@OriginalMember(owner = "client!as", name = "d", descriptor = "I")
	public int anInt4219 = 2;

	@OriginalMember(owner = "client!as", name = "n", descriptor = "I")
	public int anInt4227 = 2;

	@OriginalMember(owner = "client!as", name = "y", descriptor = "I")
	public int anInt4233 = 0;

	@OriginalMember(owner = "client!as", name = "s", descriptor = "I")
	public int anInt4230 = 0;

	@OriginalMember(owner = "client!as", name = "t", descriptor = "I")
	public int anInt4231 = 0;

	@OriginalMember(owner = "client!as", name = "l", descriptor = "I")
	public int anInt4225 = 255;

	@OriginalMember(owner = "client!as", name = "p", descriptor = "I")
	public int anInt4229 = 0;

	@OriginalMember(owner = "client!as", name = "I", descriptor = "Z")
	public boolean aBoolean387 = true;

	@OriginalMember(owner = "client!as", name = "K", descriptor = "Z")
	public boolean aBoolean388 = true;

	@OriginalMember(owner = "client!as", name = "C", descriptor = "Z")
	public boolean aBoolean384 = true;

	@OriginalMember(owner = "client!as", name = "B", descriptor = "Z")
	public boolean aBoolean383 = true;

	@OriginalMember(owner = "client!as", name = "M", descriptor = "Z")
	public boolean aBoolean390 = true;

	@OriginalMember(owner = "client!as", name = "w", descriptor = "Z")
	public boolean aBoolean380 = true;

	@OriginalMember(owner = "client!as", name = "O", descriptor = "Z")
	public boolean aBoolean392 = true;

	@OriginalMember(owner = "client!as", name = "P", descriptor = "I")
	public int anInt4237 = 1;

	@OriginalMember(owner = "client!as", name = "G", descriptor = "Z")
	protected boolean aBoolean386 = true;

	@OriginalMember(owner = "client!as", name = "r", descriptor = "Z")
	public boolean aBoolean379 = true;

	@OriginalMember(owner = "client!as", name = "i", descriptor = "I")
	protected int anInt4222 = 2;

	@OriginalMember(owner = "client!as", name = "E", descriptor = "I")
	protected int anInt4234 = 0;

	@OriginalMember(owner = "client!as", name = "R", descriptor = "I")
	public int anInt4238 = 3;

	@OriginalMember(owner = "client!as", name = "L", descriptor = "Z")
	public boolean aBoolean389 = true;

	@OriginalMember(owner = "client!as", name = "T", descriptor = "I")
	public int anInt4240 = 0;

	static {
		new Class142("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "()V")
	protected Class19() {
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(II)I")
	public final int method3337(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.anInt4222 : this.anInt4234;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IZI)V")
	public final void method3338(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == 1 || arg0 == 3) {
			this.aBoolean391 = arg1;
		} else {
			this.aBoolean385 = arg1;
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ZI)Z")
	public final boolean method3339(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.aBoolean391 : this.aBoolean385;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(III)V")
	public final void method3342(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1 || arg1 == 3) {
			this.anInt4222 = arg0;
		} else {
			this.anInt4234 = arg0;
		}
	}
}
