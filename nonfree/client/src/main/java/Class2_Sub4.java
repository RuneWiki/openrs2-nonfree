import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public abstract class Class2_Sub4 extends Class2 {

	@OriginalMember(owner = "client!ol", name = "E", descriptor = "Lclient!vn;")
	protected Class237 aClass237_41;

	@OriginalMember(owner = "client!ol", name = "F", descriptor = "I")
	public int anInt6518;

	@OriginalMember(owner = "client!ol", name = "M", descriptor = "Lclient!nk;")
	protected Class170 aClass170_41;

	@OriginalMember(owner = "client!ol", name = "r", descriptor = "[Lclient!ol;")
	public final Class2_Sub4[] aClass2_Sub4Array42;

	@OriginalMember(owner = "client!ol", name = "q", descriptor = "Z")
	public boolean aBoolean465;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(IZ)V")
	protected Class2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass2_Sub4Array42 = new Class2_Sub4[arg0];
		this.aBoolean465 = arg1;
	}

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "(I)V")
	public void method5587() {
		if (this.aBoolean465) {
			this.aClass237_41.method5431();
			this.aClass237_41 = null;
		} else {
			this.aClass170_41.method3734();
			this.aClass170_41 = null;
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)[I")
	public int[] method5589(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)I")
	public int method5590() {
		return -1;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IBI)[[I")
	protected final int[][] method5591(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass2_Sub4Array42[arg1].aBoolean465) {
			@Pc(30) int[] local30 = this.aClass2_Sub4Array42[arg1].method5589(arg0);
			return new int[][] { local30, local30, local30 };
		} else {
			return this.aClass2_Sub4Array42[arg1].method5594(arg0);
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIB)V")
	public void method5592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = this.anInt6518 == 255 ? arg1 : this.anInt6518;
		if (this.aBoolean465) {
			this.aClass237_41 = new Class237(local14, arg1, arg0);
		} else {
			this.aClass170_41 = new Class170(local14, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(BI)[[I")
	public int[][] method5594(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "(I)I")
	public int method5595() {
		return -1;
	}

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "(I)V")
	public void method5596() {
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(IBI)[I")
	protected final int[] method5600(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass2_Sub4Array42[arg1].aBoolean465 ? this.aClass2_Sub4Array42[arg1].method5589(arg0) : this.aClass2_Sub4Array42[arg1].method5594(arg0)[0];
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(BLclient!kk;I)V")
	public void method5601(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
	}
}
