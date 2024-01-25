import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public abstract class Class3_Sub9 extends Class3 {

	@OriginalMember(owner = "client!le", name = "o", descriptor = "Lclient!ga;")
	protected Class113 aClass113_41;

	@OriginalMember(owner = "client!le", name = "u", descriptor = "Lclient!uh;")
	protected Class348 aClass348_41;

	@OriginalMember(owner = "client!le", name = "A", descriptor = "I")
	public int anInt10587;

	@OriginalMember(owner = "client!le", name = "z", descriptor = "Z")
	public boolean aBoolean804;

	@OriginalMember(owner = "client!le", name = "q", descriptor = "[Lclient!le;")
	public final Class3_Sub9[] aClass3_Sub9Array42;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(IZ)V")
	protected Class3_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean804 = arg1;
		this.aClass3_Sub9Array42 = new Class3_Sub9[arg0];
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(IIB)[I")
	protected final int[] method9162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass3_Sub9Array42[arg1].aBoolean804 ? this.aClass3_Sub9Array42[arg1].method9165(arg0) : this.aClass3_Sub9Array42[arg1].method9168(arg0)[0];
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V")
	public void method9163() {
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(III)V")
	public void method9164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(22) int local22 = this.anInt10587 == 255 ? arg1 : this.anInt10587;
		if (this.aBoolean804) {
			this.aClass113_41 = new Class113(local22, arg1, arg0);
		} else {
			this.aClass348_41 = new Class348(local22, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BI)[I")
	public int[] method9165(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!jp;IB)V")
	public void method9166(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(III)[[I")
	protected final int[][] method9167(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass3_Sub9Array42[arg0].aBoolean804) {
			@Pc(31) int[] local31 = this.aClass3_Sub9Array42[arg0].method9165(arg1);
			return new int[][] { local31, local31, local31 };
		} else {
			return this.aClass3_Sub9Array42[arg0].method9168(arg1);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IB)[[I")
	public int[][] method9168(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)I")
	public int method9169() {
		return -1;
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(B)I")
	public int method9170() {
		return -1;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	public void method9171() {
		if (this.aBoolean804) {
			this.aClass113_41.method3240();
			this.aClass113_41 = null;
		} else {
			this.aClass348_41.method8551();
			this.aClass348_41 = null;
		}
	}
}
