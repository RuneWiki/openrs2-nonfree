import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public abstract class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!dt", name = "s", descriptor = "Lclient!oea;")
	protected Class239 aClass239_41;

	@OriginalMember(owner = "client!dt", name = "u", descriptor = "I")
	public int anInt10697;

	@OriginalMember(owner = "client!dt", name = "A", descriptor = "Lclient!bca;")
	protected Class24 aClass24_41;

	@OriginalMember(owner = "client!dt", name = "v", descriptor = "Z")
	public boolean aBoolean842;

	@OriginalMember(owner = "client!dt", name = "o", descriptor = "[Lclient!dt;")
	public final Class6_Sub1[] aClass6_Sub1Array42;

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(IZ)V")
	protected Class6_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean842 = arg1;
		this.aClass6_Sub1Array42 = new Class6_Sub1[arg0];
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(II)[I")
	public int[] method8721(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILclient!ji;B)V")
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)I")
	public int method8723() {
		return -1;
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)V")
	public void method8724() {
		if (this.aBoolean842) {
			this.aClass24_41.method787();
			this.aClass24_41 = null;
		} else {
			this.aClass239_41.method6266();
			this.aClass239_41 = null;
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(III)[[I")
	protected final int[][] method8725(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass6_Sub1Array42[arg1].aBoolean842) {
			@Pc(33) int[] local33 = this.aClass6_Sub1Array42[arg1].method8721(arg0);
			return new int[][] { local33, local33, local33 };
		} else {
			return this.aClass6_Sub1Array42[arg1].method8728(arg0);
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)I")
	public int method8727() {
		return -1;
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(II)[[I")
	public int[][] method8728(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(III)V")
	public void method8729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = this.anInt10697 == 255 ? arg0 : this.anInt10697;
		if (this.aBoolean842) {
			this.aClass24_41 = new Class24(local14, arg0, arg1);
		} else {
			this.aClass239_41 = new Class239(local14, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "(III)[I")
	protected final int[] method8731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass6_Sub1Array42[arg1].aBoolean842 ? this.aClass6_Sub1Array42[arg1].method8721(arg0) : this.aClass6_Sub1Array42[arg1].method8728(arg0)[0];
	}

	@OriginalMember(owner = "client!dt", name = "d", descriptor = "(B)V")
	public void method8732() {
	}
}
