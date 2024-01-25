import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public abstract class Class148 {

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "Z")
	public boolean aBoolean245;

	@OriginalMember(owner = "client!nm", name = "m", descriptor = "Z")
	protected boolean aBoolean251;

	@OriginalMember(owner = "client!nm", name = "B", descriptor = "Z")
	protected boolean aBoolean259;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
	public int anInt3776 = 0;

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "Z")
	public boolean aBoolean247 = true;

	@OriginalMember(owner = "client!nm", name = "h", descriptor = "Z")
	public boolean aBoolean248 = true;

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
	public int anInt3777 = 0;

	@OriginalMember(owner = "client!nm", name = "k", descriptor = "Z")
	public boolean aBoolean250 = true;

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
	public int anInt3778 = 127;

	@OriginalMember(owner = "client!nm", name = "p", descriptor = "Z")
	protected boolean aBoolean252 = true;

	@OriginalMember(owner = "client!nm", name = "s", descriptor = "I")
	public int anInt3784 = 3;

	@OriginalMember(owner = "client!nm", name = "q", descriptor = "Z")
	public boolean aBoolean253 = true;

	@OriginalMember(owner = "client!nm", name = "x", descriptor = "I")
	protected int anInt3786 = 2;

	@OriginalMember(owner = "client!nm", name = "D", descriptor = "Z")
	public boolean aBoolean260 = false;

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
	public int anInt3779 = 0;

	@OriginalMember(owner = "client!nm", name = "v", descriptor = "Z")
	public boolean aBoolean255 = true;

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "Z")
	public boolean aBoolean246 = true;

	@OriginalMember(owner = "client!nm", name = "F", descriptor = "Z")
	public boolean aBoolean261 = false;

	@OriginalMember(owner = "client!nm", name = "i", descriptor = "Z")
	public boolean aBoolean249 = true;

	@OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
	public int anInt3781 = 0;

	@OriginalMember(owner = "client!nm", name = "r", descriptor = "I")
	public int anInt3783 = 1;

	@OriginalMember(owner = "client!nm", name = "I", descriptor = "I")
	public int anInt3790 = 127;

	@OriginalMember(owner = "client!nm", name = "C", descriptor = "I")
	public int anInt3787 = 2;

	@OriginalMember(owner = "client!nm", name = "J", descriptor = "I")
	public int anInt3791 = 0;

	@OriginalMember(owner = "client!nm", name = "A", descriptor = "Z")
	public boolean aBoolean258 = true;

	@OriginalMember(owner = "client!nm", name = "H", descriptor = "Z")
	public boolean aBoolean262 = false;

	@OriginalMember(owner = "client!nm", name = "t", descriptor = "Z")
	public boolean aBoolean254 = true;

	@OriginalMember(owner = "client!nm", name = "y", descriptor = "Z")
	public boolean aBoolean256 = true;

	@OriginalMember(owner = "client!nm", name = "z", descriptor = "Z")
	public boolean aBoolean257 = true;

	@OriginalMember(owner = "client!nm", name = "L", descriptor = "I")
	public int anInt3792 = 255;

	@OriginalMember(owner = "client!nm", name = "P", descriptor = "I")
	public int anInt3796 = 0;

	@OriginalMember(owner = "client!nm", name = "O", descriptor = "I")
	public int anInt3795 = 2;

	@OriginalMember(owner = "client!nm", name = "M", descriptor = "I")
	public int anInt3793 = 2;

	@OriginalMember(owner = "client!nm", name = "N", descriptor = "I")
	protected int anInt3794 = 0;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V")
	protected Class148() {
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)I")
	public final int method3036(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.anInt3786 : this.anInt3794;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIZ)V")
	public final void method3037(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == 1 || arg0 == 3) {
			this.aBoolean259 = arg1;
		} else {
			this.aBoolean251 = arg1;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IBI)V")
	public final void method3039(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1 || arg1 == 3) {
			this.anInt3786 = arg0;
		} else {
			this.anInt3794 = arg0;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZI)Z")
	public final boolean method3040(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.aBoolean259 : this.aBoolean251;
	}
}
