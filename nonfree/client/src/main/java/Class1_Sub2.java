import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public abstract class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!fm", name = "r", descriptor = "Lclient!hn;")
	protected Class84 aClass84_41;

	@OriginalMember(owner = "client!fm", name = "s", descriptor = "Lclient!mi;")
	protected Class129 aClass129_41;

	@OriginalMember(owner = "client!fm", name = "u", descriptor = "I")
	public int anInt6479;

	@OriginalMember(owner = "client!fm", name = "D", descriptor = "[Lclient!fm;")
	public final Class1_Sub2[] aClass1_Sub2Array42;

	@OriginalMember(owner = "client!fm", name = "p", descriptor = "Z")
	public boolean aBoolean583;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(IZ)V")
	protected Class1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass1_Sub2Array42 = new Class1_Sub2[arg0];
		this.aBoolean583 = arg1;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(III)[I")
	protected final int[] method5654(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass1_Sub2Array42[arg0].aBoolean583 ? this.aClass1_Sub2Array42[arg0].method5662(arg1) : this.aClass1_Sub2Array42[arg0].method5664(arg1)[0];
	}

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "(I)V")
	public void method5655() {
		if (this.aBoolean583) {
			this.aClass84_41.method2425();
			this.aClass84_41 = null;
		} else {
			this.aClass129_41.method3672();
			this.aClass129_41 = null;
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IBI)V")
	public void method5656(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(22) int local22 = this.anInt6479 == 255 ? arg1 : this.anInt6479;
		if (this.aBoolean583) {
			this.aClass84_41 = new Class84(local22, arg1, arg0);
		} else {
			this.aClass129_41 = new Class129(local22, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "(B)I")
	public int method5657() {
		return -1;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IZI)[[I")
	protected final int[][] method5659(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass1_Sub2Array42[arg1].aBoolean583) {
			@Pc(33) int[] local33 = this.aClass1_Sub2Array42[arg1].method5662(arg0);
			return new int[][] { local33, local33, local33 };
		} else {
			return this.aClass1_Sub2Array42[arg1].method5664(arg0);
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IILclient!eb;)V")
	public void method5660(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
	}

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "(I)V")
	public void method5661() {
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)[I")
	public int[] method5662(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "(I)I")
	public int method5663() {
		return -1;
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(II)[[I")
	public int[][] method5664(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}
}
