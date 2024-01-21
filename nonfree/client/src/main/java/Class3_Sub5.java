import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public abstract class Class3_Sub5 extends Class3 {

	@OriginalMember(owner = "client!db", name = "s", descriptor = "Lclient!ib;")
	protected Class39 aClass39_41;

	@OriginalMember(owner = "client!db", name = "z", descriptor = "I")
	public int anInt4489;

	@OriginalMember(owner = "client!db", name = "F", descriptor = "Lclient!ud;")
	protected Class89 aClass89_41;

	@OriginalMember(owner = "client!db", name = "I", descriptor = "I")
	public int anInt4495;

	@OriginalMember(owner = "client!db", name = "B", descriptor = "[Lclient!db;")
	public final Class3_Sub5[] aClass3_Sub5Array42;

	@OriginalMember(owner = "client!db", name = "D", descriptor = "Z")
	public boolean aBoolean178;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(IZ)V")
	protected Class3_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass3_Sub5Array42 = new Class3_Sub5[arg0];
		this.aBoolean178 = arg1;
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(I)I")
	public int method3162() {
		return -1;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(III)[[I")
	protected final int[][] method3163(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aClass3_Sub5Array42[arg0].aBoolean178) {
			return this.aClass3_Sub5Array42[arg0].method3172(arg1);
		}
		@Pc(20) int[][] local20 = new int[3][];
		@Pc(28) int[] local28 = this.aClass3_Sub5Array42[arg0].method3173(arg1);
		local20[2] = local28;
		local20[1] = local28;
		local20[0] = local28;
		return local20;
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(I)V")
	public void method3164() {
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIB)V")
	public final void method3165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = this.anInt4489 == 255 ? arg0 : this.anInt4489;
		if (this.aBoolean178) {
			this.aClass39_41 = new Class39(local12, arg0, arg1);
		} else {
			this.aClass89_41 = new Class89(local12, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V")
	public void method3166() {
		if (this.aBoolean178) {
			this.aClass39_41.method1111();
			this.aClass39_41 = null;
		} else {
			this.aClass89_41.method2877();
			this.aClass89_41 = null;
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(III)[I")
	protected final int[] method3167(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass3_Sub5Array42[arg1].aBoolean178 ? this.aClass3_Sub5Array42[arg1].method3173(arg0) : this.aClass3_Sub5Array42[arg1].method3172(arg0)[0];
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IILclient!mb;)V")
	public void method3169(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
	}

	@OriginalMember(owner = "client!db", name = "e", descriptor = "(I)I")
	public int method3170() {
		return -1;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(II)[[I")
	public int[][] method3172(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)[I")
	public int[] method3173(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}
}
