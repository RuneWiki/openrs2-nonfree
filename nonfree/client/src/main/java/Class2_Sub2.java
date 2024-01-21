import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public abstract class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "Lclient!oh;")
	protected Class62 aClass62_38;

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
	public int anInt3630;

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "Lclient!sg;")
	protected Class76 aClass76_38;

	@OriginalMember(owner = "client!ha", name = "M", descriptor = "I")
	public int anInt3643;

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "Z")
	public boolean aBoolean160;

	@OriginalMember(owner = "client!ha", name = "B", descriptor = "[Lclient!ha;")
	public final Class2_Sub2[] aClass2_Sub2Array38;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(IZ)V")
	protected Class2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean160 = arg1;
		this.aClass2_Sub2Array38 = new Class2_Sub2[arg0];
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)[I")
	protected final int[] method2573(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass2_Sub2Array38[arg1].aBoolean160 ? this.aClass2_Sub2Array38[arg1].method2575(arg0) : this.aClass2_Sub2Array38[arg1].method2579(arg0)[0];
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(B)V")
	public void method2574() {
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)[I")
	public int[] method2575(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)I")
	public int method2576() {
		return -1;
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)I")
	public int method2578() {
		return -1;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZ)[[I")
	public int[][] method2579(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BILclient!va;)V")
	public void method2580(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
	}

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
	public final void method2581() {
		if (this.aBoolean160) {
			this.aClass76_38.method2285();
			this.aClass76_38 = null;
		} else {
			this.aClass62_38.method1906();
			this.aClass62_38 = null;
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIB)[[I")
	protected final int[][] method2582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass2_Sub2Array38[arg0].aBoolean160) {
			@Pc(22) int[] local22 = this.aClass2_Sub2Array38[arg0].method2575(arg1);
			return new int[][] { local22, local22, local22 };
		} else {
			return this.aClass2_Sub2Array38[arg0].method2579(arg1);
		}
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(III)V")
	public final void method2583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(22) int local22 = this.anInt3630 == 255 ? arg0 : this.anInt3630;
		if (this.aBoolean160) {
			this.aClass76_38 = new Class76(local22, arg0, arg1);
		} else {
			this.aClass62_38 = new Class62(local22, arg0, arg1);
		}
	}
}
