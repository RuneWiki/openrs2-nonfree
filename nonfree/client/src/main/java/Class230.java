import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public abstract class Class230 {

	@OriginalMember(owner = "client!to", name = "i", descriptor = "Z")
	protected boolean aBoolean606;

	@OriginalMember(owner = "client!to", name = "M", descriptor = "Z")
	protected boolean aBoolean619;

	@OriginalMember(owner = "client!to", name = "Q", descriptor = "Z")
	public boolean aBoolean621;

	@OriginalMember(owner = "client!to", name = "b", descriptor = "Z")
	public boolean aBoolean604 = true;

	@OriginalMember(owner = "client!to", name = "n", descriptor = "Z")
	public boolean aBoolean608 = false;

	@OriginalMember(owner = "client!to", name = "o", descriptor = "Z")
	public boolean aBoolean609 = true;

	@OriginalMember(owner = "client!to", name = "v", descriptor = "Z")
	public boolean aBoolean612 = false;

	@OriginalMember(owner = "client!to", name = "e", descriptor = "I")
	public int anInt7296 = 1;

	@OriginalMember(owner = "client!to", name = "h", descriptor = "I")
	public int anInt7298 = 127;

	@OriginalMember(owner = "client!to", name = "x", descriptor = "I")
	public int anInt7305 = 0;

	@OriginalMember(owner = "client!to", name = "u", descriptor = "Z")
	public boolean aBoolean611 = true;

	@OriginalMember(owner = "client!to", name = "z", descriptor = "Z")
	public boolean aBoolean615 = true;

	@OriginalMember(owner = "client!to", name = "B", descriptor = "Z")
	public boolean aBoolean616 = true;

	@OriginalMember(owner = "client!to", name = "g", descriptor = "Z")
	public boolean aBoolean605 = true;

	@OriginalMember(owner = "client!to", name = "A", descriptor = "I")
	public int anInt7306 = 127;

	@OriginalMember(owner = "client!to", name = "p", descriptor = "I")
	public int anInt7301 = 2;

	@OriginalMember(owner = "client!to", name = "y", descriptor = "Z")
	public boolean aBoolean614 = true;

	@OriginalMember(owner = "client!to", name = "I", descriptor = "I")
	public int anInt7313 = 2;

	@OriginalMember(owner = "client!to", name = "s", descriptor = "I")
	public int anInt7303 = 0;

	@OriginalMember(owner = "client!to", name = "J", descriptor = "Z")
	public boolean aBoolean617 = false;

	@OriginalMember(owner = "client!to", name = "K", descriptor = "Z")
	public boolean aBoolean618 = true;

	@OriginalMember(owner = "client!to", name = "C", descriptor = "I")
	public int anInt7307 = 0;

	@OriginalMember(owner = "client!to", name = "H", descriptor = "I")
	public int anInt7312 = 0;

	@OriginalMember(owner = "client!to", name = "E", descriptor = "I")
	public int anInt7309 = 2;

	@OriginalMember(owner = "client!to", name = "O", descriptor = "I")
	protected int anInt7315 = 2;

	@OriginalMember(owner = "client!to", name = "j", descriptor = "Z")
	public boolean aBoolean607 = true;

	@OriginalMember(owner = "client!to", name = "F", descriptor = "I")
	public int anInt7310 = 0;

	@OriginalMember(owner = "client!to", name = "t", descriptor = "I")
	public int anInt7304 = 3;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "I")
	public int anInt7294 = 0;

	@OriginalMember(owner = "client!to", name = "G", descriptor = "I")
	public int anInt7311 = 255;

	@OriginalMember(owner = "client!to", name = "P", descriptor = "Z")
	protected boolean aBoolean620 = true;

	@OriginalMember(owner = "client!to", name = "R", descriptor = "I")
	protected int anInt7316 = 0;

	@OriginalMember(owner = "client!to", name = "T", descriptor = "Z")
	public boolean aBoolean622 = true;

	@OriginalMember(owner = "client!to", name = "w", descriptor = "Z")
	public boolean aBoolean613 = true;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "()V")
	protected Class230() {
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BI)I")
	public final int method5636(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.anInt7315 : this.anInt7316;
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(BI)Z")
	public final boolean method5639(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.aBoolean606 : this.aBoolean619;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ZII)V")
	public final void method5641(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1 || arg1 == 3) {
			this.aBoolean606 = arg0;
		} else {
			this.aBoolean619 = arg0;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(III)V")
	public final void method5642(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1 || arg1 == 3) {
			this.anInt7315 = arg0;
		} else {
			this.anInt7316 = arg0;
		}
	}
}
