import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public abstract class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!ik", name = "u", descriptor = "Lclient!dp;")
	protected Class52 aClass52_41;

	@OriginalMember(owner = "client!ik", name = "w", descriptor = "Lclient!pc;")
	protected Class154 aClass154_41;

	@OriginalMember(owner = "client!ik", name = "z", descriptor = "I")
	public int anInt6591;

	@OriginalMember(owner = "client!ik", name = "B", descriptor = "Z")
	public boolean aBoolean488;

	@OriginalMember(owner = "client!ik", name = "t", descriptor = "[Lclient!ik;")
	public final Class5_Sub2[] aClass5_Sub2Array42;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(IZ)V")
	protected Class5_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean488 = arg1;
		this.aClass5_Sub2Array42 = new Class5_Sub2[arg0];
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)[[I")
	public int[][] method5806(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V")
	public void method5807() {
		if (this.aBoolean488) {
			this.aClass52_41.method1264();
			this.aClass52_41 = null;
		} else {
			this.aClass154_41.method4032();
			this.aClass154_41 = null;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZII)[I")
	protected final int[] method5808(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass5_Sub2Array42[arg0].aBoolean488 ? this.aClass5_Sub2Array42[arg0].method5821(arg1) : this.aClass5_Sub2Array42[arg0].method5806(arg1)[0];
	}

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "(I)V")
	public void method5811() {
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIB)V")
	public void method5812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = this.anInt6591 == 255 ? arg0 : this.anInt6591;
		if (this.aBoolean488) {
			this.aClass52_41 = new Class52(local14, arg0, arg1);
		} else {
			this.aClass154_41 = new Class154(local14, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(BLclient!bk;I)V")
	public void method5813(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "(I)I")
	public int method5814() {
		return -1;
	}

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "(I)I")
	public int method5815() {
		return -1;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(BII)[[I")
	protected final int[][] method5818(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass5_Sub2Array42[arg1].aBoolean488) {
			@Pc(32) int[] local32 = this.aClass5_Sub2Array42[arg1].method5821(arg0);
			return new int[][] { local32, local32, local32 };
		} else {
			return this.aClass5_Sub2Array42[arg1].method5806(arg0);
		}
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(II)[I")
	public int[] method5821(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}
}
