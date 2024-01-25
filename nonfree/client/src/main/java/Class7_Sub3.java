import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public abstract class Class7_Sub3 extends Class7 {

	@OriginalMember(owner = "client!vn", name = "j", descriptor = "Lclient!tc;")
	protected Class235 aClass235_41;

	@OriginalMember(owner = "client!vn", name = "o", descriptor = "Lclient!ib;")
	protected Class113 aClass113_41;

	@OriginalMember(owner = "client!vn", name = "z", descriptor = "I")
	public int anInt7278;

	@OriginalMember(owner = "client!vn", name = "A", descriptor = "[Lclient!vn;")
	public final Class7_Sub3[] aClass7_Sub3Array42;

	@OriginalMember(owner = "client!vn", name = "y", descriptor = "Z")
	public boolean aBoolean490;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(IZ)V")
	protected Class7_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass7_Sub3Array42 = new Class7_Sub3[arg0];
		this.aBoolean490 = arg1;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)I")
	public int method5590() {
		return -1;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(III)[I")
	protected final int[] method5591(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass7_Sub3Array42[arg0].aBoolean490 ? this.aClass7_Sub3Array42[arg0].method5594(arg1) : this.aClass7_Sub3Array42[arg0].method5596(arg1)[0];
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Z)V")
	public void method5592() {
		if (this.aBoolean490) {
			this.aClass113_41.method2453();
			this.aClass113_41 = null;
		} else {
			this.aClass235_41.method4861();
			this.aClass235_41 = null;
		}
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(B)V")
	public void method5593() {
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IB)[I")
	public int[] method5594(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(IB)[[I")
	public int[][] method5596(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(III)[[I")
	protected final int[][] method5597(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass7_Sub3Array42[arg0].aBoolean490) {
			@Pc(31) int[] local31 = this.aClass7_Sub3Array42[arg0].method5594(arg1);
			return new int[][] { local31, local31, local31 };
		} else {
			return this.aClass7_Sub3Array42[arg0].method5596(arg1);
		}
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(Z)I")
	public int method5598() {
		return -1;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IZLclient!gk;)V")
	public void method5599(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IBI)V")
	public void method5601(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt7278 == 255 ? arg1 : this.anInt7278;
		if (this.aBoolean490) {
			this.aClass113_41 = new Class113(local14, arg1, arg0);
		} else {
			this.aClass235_41 = new Class235(local14, arg1, arg0);
		}
	}
}
