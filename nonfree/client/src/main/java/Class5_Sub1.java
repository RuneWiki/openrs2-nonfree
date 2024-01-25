import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rfa")
public abstract class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!rfa", name = "m", descriptor = "Lclient!rl;")
	protected Class307 aClass307_41;

	@OriginalMember(owner = "client!rfa", name = "j", descriptor = "Lclient!dc;")
	protected Class83 aClass83_41;

	@OriginalMember(owner = "client!rfa", name = "n", descriptor = "I")
	public int anInt10698;

	@OriginalMember(owner = "client!rfa", name = "A", descriptor = "[Lclient!rfa;")
	public final Class5_Sub1[] aClass5_Sub1Array42;

	@OriginalMember(owner = "client!rfa", name = "p", descriptor = "Z")
	public boolean aBoolean786;

	@OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(IZ)V")
	protected Class5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass5_Sub1Array42 = new Class5_Sub1[arg0];
		this.aBoolean786 = arg1;
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(B)I")
	public int method9202() {
		return -1;
	}

	@OriginalMember(owner = "client!rfa", name = "c", descriptor = "(III)[[I")
	protected final int[][] method9203(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass5_Sub1Array42[arg0].aBoolean786) {
			@Pc(23) int[] local23 = this.aClass5_Sub1Array42[arg0].method9212(arg1);
			return new int[][] { local23, local23, local23 };
		} else {
			return this.aClass5_Sub1Array42[arg0].method9205(arg1);
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I)V")
	public void method9204() {
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II)[[I")
	public int[][] method9205(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(B)V")
	public void method9207() {
		if (this.aBoolean786) {
			this.aClass83_41.method1413();
			this.aClass83_41 = null;
		} else {
			this.aClass307_41.method7495();
			this.aClass307_41 = null;
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(BILclient!ib;)V")
	public void method9209(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(III)[I")
	protected final int[] method9210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass5_Sub1Array42[arg0].aBoolean786 ? this.aClass5_Sub1Array42[arg0].method9212(arg1) : this.aClass5_Sub1Array42[arg0].method9205(arg1)[0];
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(I)I")
	public int method9211() {
		return -1;
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(II)[I")
	public int[] method9212(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(III)V")
	public void method9213(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.anInt10698 == 255 ? arg0 : this.anInt10698;
		if (this.aBoolean786) {
			this.aClass83_41 = new Class83(local13, arg0, arg1);
		} else {
			this.aClass307_41 = new Class307(local13, arg0, arg1);
		}
	}
}
