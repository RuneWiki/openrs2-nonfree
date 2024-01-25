import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public abstract class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
	public int anInt7025;

	@OriginalMember(owner = "client!eg", name = "z", descriptor = "Lclient!qs;")
	protected Class207 aClass207_41;

	@OriginalMember(owner = "client!eg", name = "A", descriptor = "Lclient!nk;")
	protected Class170 aClass170_41;

	@OriginalMember(owner = "client!eg", name = "w", descriptor = "Z")
	public boolean aBoolean509;

	@OriginalMember(owner = "client!eg", name = "q", descriptor = "[Lclient!eg;")
	public final Class2_Sub2[] aClass2_Sub2Array42;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(IZ)V")
	protected Class2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean509 = arg1;
		this.aClass2_Sub2Array42 = new Class2_Sub2[arg0];
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IB)[I")
	public int[] method5465(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IBI)V")
	public void method5466(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt7025 == 255 ? arg0 : this.anInt7025;
		if (this.aBoolean509) {
			this.aClass170_41 = new Class170(local12, arg0, arg1);
		} else {
			this.aClass207_41 = new Class207(local12, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)V")
	public void method5467() {
		if (this.aBoolean509) {
			this.aClass170_41.method3648();
			this.aClass170_41 = null;
		} else {
			this.aClass207_41.method4462();
			this.aClass207_41 = null;
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)I")
	public int method5468() {
		return -1;
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)I")
	public int method5469() {
		return -1;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!sv;II)V")
	public void method5470(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(BI)[[I")
	public int[][] method5471(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZII)[I")
	protected final int[] method5472(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass2_Sub2Array42[arg1].aBoolean509 ? this.aClass2_Sub2Array42[arg1].method5465(arg0) : this.aClass2_Sub2Array42[arg1].method5471(arg0)[0];
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)[[I")
	protected final int[][] method5474(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass2_Sub2Array42[arg0].aBoolean509) {
			@Pc(24) int[] local24 = this.aClass2_Sub2Array42[arg0].method5465(arg1);
			return new int[][] { local24, local24, local24 };
		} else {
			return this.aClass2_Sub2Array42[arg0].method5471(arg1);
		}
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(B)V")
	public void method5475() {
	}
}
