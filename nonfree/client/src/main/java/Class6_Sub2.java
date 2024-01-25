import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public abstract class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!et", name = "j", descriptor = "Lclient!jm;")
	protected Class130 aClass130_41;

	@OriginalMember(owner = "client!et", name = "k", descriptor = "Lclient!gv;")
	protected Class100 aClass100_41;

	@OriginalMember(owner = "client!et", name = "y", descriptor = "I")
	public int anInt7158;

	@OriginalMember(owner = "client!et", name = "n", descriptor = "Z")
	public boolean aBoolean488;

	@OriginalMember(owner = "client!et", name = "q", descriptor = "[Lclient!et;")
	public final Class6_Sub2[] aClass6_Sub2Array42;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(IZ)V")
	protected Class6_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean488 = arg1;
		this.aClass6_Sub2Array42 = new Class6_Sub2[arg0];
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IBI)[I")
	protected final int[] method5858(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass6_Sub2Array42[arg0].aBoolean488 ? this.aClass6_Sub2Array42[arg0].method5859(arg1) : this.aClass6_Sub2Array42[arg0].method5868(arg1)[0];
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(II)[I")
	public int[] method5859(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(BII)V")
	public void method5860(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt7158 == 255 ? arg1 : this.anInt7158;
		if (this.aBoolean488) {
			this.aClass100_41 = new Class100(local14, arg1, arg0);
		} else {
			this.aClass130_41 = new Class130(local14, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ILclient!ha;I)V")
	public void method5861(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!et", name = "d", descriptor = "(I)V")
	public void method5862() {
	}

	@OriginalMember(owner = "client!et", name = "e", descriptor = "(I)V")
	public void method5864() {
		if (this.aBoolean488) {
			this.aClass100_41.method2223();
			this.aClass100_41 = null;
		} else {
			this.aClass130_41.method2913();
			this.aClass130_41 = null;
		}
	}

	@OriginalMember(owner = "client!et", name = "f", descriptor = "(I)I")
	public int method5865() {
		return -1;
	}

	@OriginalMember(owner = "client!et", name = "g", descriptor = "(I)I")
	public int method5866() {
		return -1;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(III)[[I")
	protected final int[][] method5867(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass6_Sub2Array42[arg1].aBoolean488) {
			@Pc(23) int[] local23 = this.aClass6_Sub2Array42[arg1].method5859(arg0);
			return new int[][] { local23, local23, local23 };
		} else {
			return this.aClass6_Sub2Array42[arg1].method5868(arg0);
		}
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(II)[[I")
	public int[][] method5868(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}
}
