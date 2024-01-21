import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public abstract class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!c", name = "t", descriptor = "Lclient!vi;")
	protected Class105 aClass105_41;

	@OriginalMember(owner = "client!c", name = "A", descriptor = "Lclient!ud;")
	protected Class101 aClass101_41;

	@OriginalMember(owner = "client!c", name = "D", descriptor = "I")
	public int anInt4201;

	@OriginalMember(owner = "client!c", name = "F", descriptor = "[Lclient!c;")
	public final Class5_Sub1[] aClass5_Sub1Array42;

	@OriginalMember(owner = "client!c", name = "C", descriptor = "Z")
	public boolean aBoolean189;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(IZ)V")
	protected Class5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass5_Sub1Array42 = new Class5_Sub1[arg0];
		this.aBoolean189 = arg1;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III)V")
	public final void method3188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anInt4201 == 255 ? arg0 : this.anInt4201;
		if (this.aBoolean189) {
			this.aClass101_41 = new Class101(local8, arg0, arg1);
		} else {
			this.aClass105_41 = new Class105(local8, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
	public void method3189() {
		if (this.aBoolean189) {
			this.aClass101_41.method2881();
			this.aClass101_41 = null;
		} else {
			this.aClass105_41.method3107();
			this.aClass105_41 = null;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ce;II)V")
	public void method3190(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IBI)[[I")
	protected final int[][] method3191(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aClass5_Sub1Array42[arg0].aBoolean189) {
			return this.aClass5_Sub1Array42[arg0].method3193(arg1);
		}
		@Pc(26) int[][] local26 = new int[3][];
		@Pc(34) int[] local34 = this.aClass5_Sub1Array42[arg0].method3195(arg1);
		local26[0] = local34;
		local26[2] = local34;
		local26[1] = local34;
		return local26;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)[[I")
	public int[][] method3193(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)[I")
	public int[] method3195(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIB)[I")
	protected final int[] method3196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass5_Sub1Array42[arg1].aBoolean189 ? this.aClass5_Sub1Array42[arg1].method3195(arg0) : this.aClass5_Sub1Array42[arg1].method3193(arg0)[0];
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(I)I")
	public int method3197() {
		return -1;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(B)I")
	public int method3199() {
		return -1;
	}

	@OriginalMember(owner = "client!c", name = "f", descriptor = "(I)V")
	public void method3200() {
	}
}
