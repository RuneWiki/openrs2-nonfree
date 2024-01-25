import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public abstract class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!vl", name = "n", descriptor = "Lclient!nv;")
	protected Class175 aClass175_41;

	@OriginalMember(owner = "client!vl", name = "p", descriptor = "Lclient!fp;")
	protected Class82 aClass82_41;

	@OriginalMember(owner = "client!vl", name = "A", descriptor = "I")
	public int anInt7416;

	@OriginalMember(owner = "client!vl", name = "t", descriptor = "[Lclient!vl;")
	public final Class2_Sub2[] aClass2_Sub2Array42;

	@OriginalMember(owner = "client!vl", name = "y", descriptor = "Z")
	public boolean aBoolean488;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(IZ)V")
	protected Class2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass2_Sub2Array42 = new Class2_Sub2[arg0];
		this.aBoolean488 = arg1;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)[[I")
	public int[][] method5836(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)I")
	public int method5837() {
		return -1;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!si;II)V")
	public void method5838(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIB)[I")
	protected final int[] method5839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass2_Sub2Array42[arg1].aBoolean488 ? this.aClass2_Sub2Array42[arg1].method5849(arg0) : this.aClass2_Sub2Array42[arg1].method5836(arg0)[0];
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(III)[[I")
	protected final int[][] method5840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass2_Sub2Array42[arg1].aBoolean488) {
			@Pc(30) int[] local30 = this.aClass2_Sub2Array42[arg1].method5849(arg0);
			return new int[][] { local30, local30, local30 };
		} else {
			return this.aClass2_Sub2Array42[arg1].method5836(arg0);
		}
	}

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "(I)I")
	public int method5841() {
		return -1;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V")
	public void method5842() {
		if (this.aBoolean488) {
			this.aClass82_41.method2033();
			this.aClass82_41 = null;
		} else {
			this.aClass175_41.method4049();
			this.aClass175_41 = null;
		}
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(Z)V")
	public void method5845() {
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(III)V")
	public void method5847(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt7416 == 255 ? arg1 : this.anInt7416;
		if (this.aBoolean488) {
			this.aClass82_41 = new Class82(local12, arg1, arg0);
		} else {
			this.aClass175_41 = new Class175(local12, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "(II)[I")
	public int[] method5849(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}
}
