import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public abstract class Class2_Sub4 extends Class2 {

	@OriginalMember(owner = "client!eo", name = "p", descriptor = "I")
	public int anInt9462;

	@OriginalMember(owner = "client!eo", name = "u", descriptor = "Lclient!hj;")
	protected Class143 aClass143_41;

	@OriginalMember(owner = "client!eo", name = "z", descriptor = "Lclient!pq;")
	protected Class271 aClass271_41;

	@OriginalMember(owner = "client!eo", name = "q", descriptor = "Z")
	public boolean aBoolean789;

	@OriginalMember(owner = "client!eo", name = "t", descriptor = "[Lclient!eo;")
	public final Class2_Sub4[] aClass2_Sub4Array42;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(IZ)V")
	protected Class2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean789 = arg1;
		this.aClass2_Sub4Array42 = new Class2_Sub4[arg0];
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)I")
	public int method7557() {
		return -1;
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)V")
	public void method7558() {
		if (this.aBoolean789) {
			this.aClass271_41.method5623();
			this.aClass271_41 = null;
		} else {
			this.aClass143_41.method2533();
			this.aClass143_41 = null;
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)I")
	public int method7560() {
		return -1;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)[[I")
	public int[][] method7561(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!eo", name = "e", descriptor = "(I)V")
	public void method7562() {
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(II)[I")
	public int[] method7564(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IBI)V")
	public void method7565(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt9462 == 255 ? arg1 : this.anInt9462;
		if (this.aBoolean789) {
			this.aClass271_41 = new Class271(local14, arg1, arg0);
		} else {
			this.aClass143_41 = new Class143(local14, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILclient!gk;B)V")
	public void method7566(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7 arg1) {
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IZI)[[I")
	protected final int[][] method7567(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass2_Sub4Array42[arg1].aBoolean789) {
			@Pc(33) int[] local33 = this.aClass2_Sub4Array42[arg1].method7564(arg0);
			return new int[][] { local33, local33, local33 };
		} else {
			return this.aClass2_Sub4Array42[arg1].method7561(arg0);
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(BII)[I")
	protected final int[] method7568(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass2_Sub4Array42[arg1].aBoolean789 ? this.aClass2_Sub4Array42[arg1].method7564(arg0) : this.aClass2_Sub4Array42[arg1].method7561(arg0)[0];
	}
}
