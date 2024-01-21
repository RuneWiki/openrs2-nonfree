import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public abstract class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!ba", name = "x", descriptor = "I")
	public int anInt4134;

	@OriginalMember(owner = "client!ba", name = "A", descriptor = "Lclient!aa;")
	protected Class2 aClass2_41;

	@OriginalMember(owner = "client!ba", name = "C", descriptor = "I")
	public int anInt4136;

	@OriginalMember(owner = "client!ba", name = "I", descriptor = "Lclient!lc;")
	protected Class53 aClass53_41;

	@OriginalMember(owner = "client!ba", name = "r", descriptor = "[Lclient!ba;")
	public final Class1_Sub5[] aClass1_Sub5Array42;

	@OriginalMember(owner = "client!ba", name = "n", descriptor = "Z")
	public boolean aBoolean173;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(IZ)V")
	protected Class1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass1_Sub5Array42 = new Class1_Sub5[arg0];
		this.aBoolean173 = arg1;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)I")
	public int method3140() {
		return -1;
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)V")
	public final void method3141() {
		if (this.aBoolean173) {
			this.aClass2_41.method23();
			this.aClass2_41 = null;
		} else {
			this.aClass53_41.method1594();
			this.aClass53_41 = null;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)[I")
	public int[] method3143(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(III)[[I")
	protected final int[][] method3144(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass1_Sub5Array42[arg1].aBoolean173) {
			@Pc(32) int[] local32 = this.aClass1_Sub5Array42[arg1].method3143(arg0);
			return new int[][] { local32, local32, local32 };
		} else {
			return this.aClass1_Sub5Array42[arg1].method3149(arg0);
		}
	}

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "(III)[I")
	protected final int[] method3145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass1_Sub5Array42[arg0].aBoolean173 ? this.aClass1_Sub5Array42[arg0].method3143(arg1) : this.aClass1_Sub5Array42[arg0].method3149(arg1)[0];
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)V")
	public void method3146() {
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!ka;IZ)V")
	public void method3148(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(II)[[I")
	public int[][] method3149(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IBI)V")
	public final void method3150(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt4134 == 255 ? arg0 : this.anInt4134;
		if (this.aBoolean173) {
			this.aClass2_41 = new Class2(local12, arg0, arg1);
		} else {
			this.aClass53_41 = new Class53(local12, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)I")
	public int method3151() {
		return -1;
	}
}
