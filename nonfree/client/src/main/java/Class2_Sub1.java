import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public abstract class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!je", name = "p", descriptor = "Lclient!ic;")
	protected Class43 aClass43_41;

	@OriginalMember(owner = "client!je", name = "x", descriptor = "I")
	public int anInt4288;

	@OriginalMember(owner = "client!je", name = "z", descriptor = "Lclient!jj;")
	protected Class52 aClass52_41;

	@OriginalMember(owner = "client!je", name = "w", descriptor = "Z")
	public boolean aBoolean196;

	@OriginalMember(owner = "client!je", name = "y", descriptor = "[Lclient!je;")
	public final Class2_Sub1[] aClass2_Sub1Array42;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(IZ)V")
	protected Class2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean196 = arg1;
		this.aClass2_Sub1Array42 = new Class2_Sub1[arg0];
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZI)[I")
	public int[] method3256(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
	public void method3257() {
		if (this.aBoolean196) {
			this.aClass52_41.method1599();
			this.aClass52_41 = null;
		} else {
			this.aClass43_41.method1430();
			this.aClass43_41 = null;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(III)[[I")
	protected final int[][] method3259(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aClass2_Sub1Array42[arg1].aBoolean196) {
			return this.aClass2_Sub1Array42[arg1].method3262(arg0);
		}
		@Pc(26) int[][] local26 = new int[3][];
		@Pc(34) int[] local34 = this.aClass2_Sub1Array42[arg1].method3256(arg0);
		local26[0] = local34;
		local26[2] = local34;
		local26[1] = local34;
		return local26;
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V")
	public void method3260() {
	}

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(I)I")
	public int method3261() {
		return -1;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)[[I")
	public int[][] method3262(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(III)V")
	public final void method3263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = this.anInt4288 == 255 ? arg0 : this.anInt4288;
		if (this.aBoolean196) {
			this.aClass52_41 = new Class52(local12, arg0, arg1);
		} else {
			this.aClass43_41 = new Class43(local12, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!ra;IZ)V")
	public void method3264(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIB)[I")
	protected final int[] method3265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass2_Sub1Array42[arg1].aBoolean196 ? this.aClass2_Sub1Array42[arg1].method3256(arg0) : this.aClass2_Sub1Array42[arg1].method3262(arg0)[0];
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(B)I")
	public int method3266() {
		return -1;
	}
}
