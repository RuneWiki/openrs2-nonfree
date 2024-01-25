import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public abstract class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!uu", name = "j", descriptor = "Lclient!mga;")
	protected Class214 aClass214_41;

	@OriginalMember(owner = "client!uu", name = "n", descriptor = "I")
	public int anInt10146;

	@OriginalMember(owner = "client!uu", name = "p", descriptor = "Lclient!uea;")
	protected Class330 aClass330_41;

	@OriginalMember(owner = "client!uu", name = "u", descriptor = "Z")
	public boolean aBoolean855;

	@OriginalMember(owner = "client!uu", name = "C", descriptor = "[Lclient!uu;")
	public final Class3_Sub2[] aClass3_Sub2Array42;

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(IZ)V")
	protected Class3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean855 = arg1;
		this.aClass3_Sub2Array42 = new Class3_Sub2[arg0];
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)I")
	public int method8329() {
		return -1;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)[[I")
	public int[][] method8331(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "(I)V")
	public void method8332() {
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(III)V")
	public void method8333(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt10146 == 255 ? arg0 : this.anInt10146;
		if (this.aBoolean855) {
			this.aClass330_41 = new Class330(local14, arg0, arg1);
		} else {
			this.aClass214_41 = new Class214(local14, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IBLclient!tn;)V")
	public void method8335(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IB)[I")
	public int[] method8336(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(III)[[I")
	protected final int[][] method8337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass3_Sub2Array42[arg0].aBoolean855) {
			@Pc(36) int[] local36 = this.aClass3_Sub2Array42[arg0].method8336(arg1);
			return new int[][] { local36, local36, local36 };
		} else {
			return this.aClass3_Sub2Array42[arg0].method8331(arg1);
		}
	}

	@OriginalMember(owner = "client!uu", name = "e", descriptor = "(I)I")
	public int method8338() {
		return -1;
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(B)V")
	public void method8339() {
		if (this.aBoolean855) {
			this.aClass330_41.method7980();
			this.aClass330_41 = null;
		} else {
			this.aClass214_41.method5659();
			this.aClass214_41 = null;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(BII)[I")
	protected final int[] method8340(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass3_Sub2Array42[arg1].aBoolean855 ? this.aClass3_Sub2Array42[arg1].method8336(arg0) : this.aClass3_Sub2Array42[arg1].method8331(arg0)[0];
	}
}
