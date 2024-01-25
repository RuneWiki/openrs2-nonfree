import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public abstract class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!qs", name = "m", descriptor = "Lclient!wn;")
	protected Class217 aClass217_41;

	@OriginalMember(owner = "client!qs", name = "z", descriptor = "I")
	public int anInt6851;

	@OriginalMember(owner = "client!qs", name = "E", descriptor = "Lclient!hn;")
	protected Class84 aClass84_41;

	@OriginalMember(owner = "client!qs", name = "F", descriptor = "[Lclient!qs;")
	public final Class3_Sub3[] aClass3_Sub3Array42;

	@OriginalMember(owner = "client!qs", name = "l", descriptor = "Z")
	public boolean aBoolean454;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(IZ)V")
	protected Class3_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass3_Sub3Array42 = new Class3_Sub3[arg0];
		this.aBoolean454 = arg1;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V")
	public void method5724() {
		if (this.aBoolean454) {
			this.aClass217_41.method5703();
			this.aClass217_41 = null;
		} else {
			this.aClass84_41.method2092();
			this.aClass84_41 = null;
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(III)V")
	public void method5725(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt6851 == 255 ? arg1 : this.anInt6851;
		if (this.aBoolean454) {
			this.aClass217_41 = new Class217(local14, arg1, arg0);
		} else {
			this.aClass84_41 = new Class84(local14, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(II)[I")
	public int[] method5727(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "(Z)I")
	public int method5728() {
		return -1;
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(III)[[I")
	protected final int[][] method5729(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass3_Sub3Array42[arg0].aBoolean454) {
			@Pc(23) int[] local23 = this.aClass3_Sub3Array42[arg0].method5727(arg1);
			return new int[][] { local23, local23, local23 };
		} else {
			return this.aClass3_Sub3Array42[arg0].method5734(arg1);
		}
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(B)V")
	public void method5730() {
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lclient!fb;ZI)V")
	public void method5731(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "(B)I")
	public int method5732() {
		return -1;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(BII)[I")
	protected final int[] method5733(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass3_Sub3Array42[arg1].aBoolean454 ? this.aClass3_Sub3Array42[arg1].method5727(arg0) : this.aClass3_Sub3Array42[arg1].method5734(arg0)[0];
	}

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "(II)[[I")
	public int[][] method5734(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}
}
