import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public abstract class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!nc", name = "w", descriptor = "Lclient!rn;")
	protected Class207 aClass207_41;

	@OriginalMember(owner = "client!nc", name = "y", descriptor = "I")
	public int anInt7578;

	@OriginalMember(owner = "client!nc", name = "B", descriptor = "Lclient!ai;")
	protected Class9 aClass9_41;

	@OriginalMember(owner = "client!nc", name = "v", descriptor = "[Lclient!nc;")
	public final Class4_Sub2[] aClass4_Sub2Array42;

	@OriginalMember(owner = "client!nc", name = "x", descriptor = "Z")
	public boolean aBoolean501;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(IZ)V")
	protected Class4_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass4_Sub2Array42 = new Class4_Sub2[arg0];
		this.aBoolean501 = arg1;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)[I")
	public int[] method5838(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)V")
	public void method5839(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt7578 == 255 ? arg1 : this.anInt7578;
		if (this.aBoolean501) {
			this.aClass9_41 = new Class9(local12, arg1, arg0);
		} else {
			this.aClass207_41 = new Class207(local12, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(B)V")
	public void method5840() {
		if (this.aBoolean501) {
			this.aClass9_41.method278();
			this.aClass9_41 = null;
		} else {
			this.aClass207_41.method4801();
			this.aClass207_41 = null;
		}
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)I")
	public int method5841() {
		return -1;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)[[I")
	public int[][] method5842(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IBLclient!tl;)V")
	public void method5843(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)I")
	public int method5844() {
		return -1;
	}

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)V")
	public void method5845() {
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(III)[I")
	protected final int[] method5847(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass4_Sub2Array42[arg0].aBoolean501 ? this.aClass4_Sub2Array42[arg0].method5838(arg1) : this.aClass4_Sub2Array42[arg0].method5842(arg1)[0];
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BII)[[I")
	protected final int[][] method5848(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass4_Sub2Array42[arg0].aBoolean501) {
			@Pc(22) int[] local22 = this.aClass4_Sub2Array42[arg0].method5838(arg1);
			return new int[][] { local22, local22, local22 };
		} else {
			return this.aClass4_Sub2Array42[arg0].method5842(arg1);
		}
	}
}
