import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public abstract class Class21 {

	@OriginalMember(owner = "client!fv", name = "o", descriptor = "Z")
	protected boolean aBoolean71;

	@OriginalMember(owner = "client!fv", name = "p", descriptor = "Z")
	public boolean aBoolean72;

	@OriginalMember(owner = "client!fv", name = "s", descriptor = "Z")
	protected boolean aBoolean74;

	@OriginalMember(owner = "client!fv", name = "d", descriptor = "I")
	public int anInt863 = 127;

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "I")
	public int anInt862 = 0;

	@OriginalMember(owner = "client!fv", name = "e", descriptor = "Z")
	public boolean aBoolean66 = true;

	@OriginalMember(owner = "client!fv", name = "m", descriptor = "I")
	public int anInt868 = 127;

	@OriginalMember(owner = "client!fv", name = "k", descriptor = "I")
	public int anInt867 = 2;

	@OriginalMember(owner = "client!fv", name = "g", descriptor = "I")
	public int anInt864 = 3;

	@OriginalMember(owner = "client!fv", name = "r", descriptor = "I")
	public int anInt869 = 0;

	@OriginalMember(owner = "client!fv", name = "f", descriptor = "Z")
	public boolean aBoolean67 = false;

	@OriginalMember(owner = "client!fv", name = "h", descriptor = "Z")
	public boolean aBoolean68 = true;

	@OriginalMember(owner = "client!fv", name = "q", descriptor = "Z")
	public boolean aBoolean73 = true;

	@OriginalMember(owner = "client!fv", name = "l", descriptor = "Z")
	public boolean aBoolean69 = false;

	@OriginalMember(owner = "client!fv", name = "j", descriptor = "I")
	public int anInt866 = 0;

	@OriginalMember(owner = "client!fv", name = "u", descriptor = "I")
	public int anInt871 = 255;

	@OriginalMember(owner = "client!fv", name = "x", descriptor = "Z")
	public boolean aBoolean77 = true;

	@OriginalMember(owner = "client!fv", name = "C", descriptor = "Z")
	public boolean aBoolean79 = true;

	@OriginalMember(owner = "client!fv", name = "B", descriptor = "Z")
	public boolean aBoolean78 = true;

	@OriginalMember(owner = "client!fv", name = "w", descriptor = "Z")
	public boolean aBoolean76 = true;

	@OriginalMember(owner = "client!fv", name = "I", descriptor = "I")
	public int anInt877 = 1;

	@OriginalMember(owner = "client!fv", name = "E", descriptor = "Z")
	public boolean aBoolean80 = true;

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "Z")
	public boolean aBoolean65 = true;

	@OriginalMember(owner = "client!fv", name = "J", descriptor = "Z")
	public boolean aBoolean82 = false;

	@OriginalMember(owner = "client!fv", name = "A", descriptor = "I")
	public int anInt874 = 0;

	@OriginalMember(owner = "client!fv", name = "v", descriptor = "Z")
	protected boolean aBoolean75 = true;

	@OriginalMember(owner = "client!fv", name = "y", descriptor = "I")
	protected int anInt872 = 2;

	@OriginalMember(owner = "client!fv", name = "n", descriptor = "Z")
	public boolean aBoolean70 = true;

	@OriginalMember(owner = "client!fv", name = "L", descriptor = "I")
	public int anInt879 = 0;

	@OriginalMember(owner = "client!fv", name = "K", descriptor = "I")
	public int anInt878 = 2;

	@OriginalMember(owner = "client!fv", name = "N", descriptor = "I")
	public int anInt881 = 2;

	@OriginalMember(owner = "client!fv", name = "G", descriptor = "Z")
	public boolean aBoolean81 = true;

	@OriginalMember(owner = "client!fv", name = "O", descriptor = "I")
	public int anInt882 = 0;

	@OriginalMember(owner = "client!fv", name = "t", descriptor = "I")
	protected int anInt870 = 0;

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "()V")
	protected Class21() {
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(BI)I")
	public final int method775(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.anInt872 : this.anInt870;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIB)V")
	public final void method778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 1 || arg0 == 3) {
			this.anInt872 = arg1;
		} else {
			this.anInt870 = arg1;
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(BIZ)V")
	public final void method779(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == 1 || arg0 == 3) {
			this.aBoolean74 = arg1;
		} else {
			this.aBoolean71 = arg1;
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IB)Z")
	public final boolean method780(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.aBoolean74 : this.aBoolean71;
	}
}
