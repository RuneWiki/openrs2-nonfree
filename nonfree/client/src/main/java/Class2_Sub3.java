import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public abstract class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!tf", name = "u", descriptor = "Lclient!qk;")
	protected Class281 aClass281_41;

	@OriginalMember(owner = "client!tf", name = "v", descriptor = "Lclient!afa;")
	protected Class10 aClass10_41;

	@OriginalMember(owner = "client!tf", name = "y", descriptor = "I")
	public int anInt10959;

	@OriginalMember(owner = "client!tf", name = "t", descriptor = "[Lclient!tf;")
	public final Class2_Sub3[] aClass2_Sub3Array42;

	@OriginalMember(owner = "client!tf", name = "H", descriptor = "Z")
	public boolean aBoolean748;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(IZ)V")
	protected Class2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass2_Sub3Array42 = new Class2_Sub3[arg0];
		this.aBoolean748 = arg1;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)I")
	public int method9145() {
		return -1;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(BII)[[I")
	protected final int[][] method9147(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass2_Sub3Array42[arg1].aBoolean748) {
			@Pc(25) int[] local25 = this.aClass2_Sub3Array42[arg1].method9150(arg0);
			return new int[][] { local25, local25, local25 };
		} else {
			return this.aClass2_Sub3Array42[arg1].method9155(arg0);
		}
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(II)[I")
	public int[] method9150(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "(I)I")
	public int method9151() {
		return -1;
	}

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "(I)V")
	public void method9152() {
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(III)V")
	public void method9153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = this.anInt10959 == 255 ? arg1 : this.anInt10959;
		if (this.aBoolean748) {
			this.aClass281_41 = new Class281(local14, arg1, arg0);
		} else {
			this.aClass10_41 = new Class10(local14, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
	public void method9154() {
		if (this.aBoolean748) {
			this.aClass281_41.method7188();
			this.aClass281_41 = null;
		} else {
			this.aClass10_41.method212();
			this.aClass10_41 = null;
		}
	}

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "(II)[[I")
	public int[][] method9155(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(III)[I")
	protected final int[] method9156(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass2_Sub3Array42[arg1].aBoolean748 ? this.aClass2_Sub3Array42[arg1].method9150(arg0) : this.aClass2_Sub3Array42[arg1].method9155(arg0)[0];
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!cea;II)V")
	public void method9157(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
	}
}
