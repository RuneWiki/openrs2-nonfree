import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public abstract class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!a", name = "C", descriptor = "Lclient!ic;")
	protected Class39 aClass39_41;

	@OriginalMember(owner = "client!a", name = "K", descriptor = "Lclient!sc;")
	protected Class80 aClass80_41;

	@OriginalMember(owner = "client!a", name = "O", descriptor = "I")
	public int anInt4454;

	@OriginalMember(owner = "client!a", name = "Q", descriptor = "Z")
	public boolean aBoolean185;

	@OriginalMember(owner = "client!a", name = "r", descriptor = "[Lclient!a;")
	public final Class1_Sub1[] aClass1_Sub1Array42;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "(IZ)V")
	protected Class1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean185 = arg1;
		this.aClass1_Sub1Array42 = new Class1_Sub1[arg0];
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	public void method3301() {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(III)[I")
	protected final int[] method3303(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass1_Sub1Array42[arg1].aBoolean185 ? this.aClass1_Sub1Array42[arg1].method3310(arg0) : this.aClass1_Sub1Array42[arg1].method3313(arg0)[0];
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(B)V")
	public void method3306() {
		if (this.aBoolean185) {
			this.aClass80_41.method2879();
			this.aClass80_41 = null;
		} else {
			this.aClass39_41.method1377();
			this.aClass39_41 = null;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IBI)[[I")
	protected final int[][] method3307(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass1_Sub1Array42[arg0].aBoolean185) {
			@Pc(33) int[] local33 = this.aClass1_Sub1Array42[arg0].method3310(arg1);
			return new int[][] { local33, local33, local33 };
		} else {
			return this.aClass1_Sub1Array42[arg0].method3313(arg1);
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(III)V")
	public final void method3308(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = this.anInt4454 == 255 ? arg0 : this.anInt4454;
		if (this.aBoolean185) {
			this.aClass80_41 = new Class80(local17, arg0, arg1);
		} else {
			this.aClass39_41 = new Class39(local17, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(B)I")
	public int method3309() {
		return -1;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)[I")
	public int[] method3310(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(I)I")
	public int method3311() {
		return -1;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IILclient!wa;)V")
	public void method3312(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(II)[[I")
	public int[][] method3313(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}
}
