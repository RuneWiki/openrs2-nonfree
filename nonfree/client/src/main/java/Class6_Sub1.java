import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public abstract class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!ba", name = "m", descriptor = "Lclient!wq;")
	protected Class220 aClass220_41;

	@OriginalMember(owner = "client!ba", name = "t", descriptor = "Lclient!na;")
	protected Class140 aClass140_41;

	@OriginalMember(owner = "client!ba", name = "z", descriptor = "I")
	public int anInt6204;

	@OriginalMember(owner = "client!ba", name = "v", descriptor = "Z")
	public boolean aBoolean411;

	@OriginalMember(owner = "client!ba", name = "D", descriptor = "[Lclient!ba;")
	public final Class6_Sub1[] aClass6_Sub1Array42;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(IZ)V")
	protected Class6_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean411 = arg1;
		this.aClass6_Sub1Array42 = new Class6_Sub1[arg0];
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)V")
	public void method5606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = this.anInt6204 == 255 ? arg1 : this.anInt6204;
		if (this.aBoolean411) {
			this.aClass140_41 = new Class140(local12, arg1, arg0);
		} else {
			this.aClass220_41 = new Class220(local12, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZI)[[I")
	public int[][] method5608(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(III)[I")
	protected final int[] method5609(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass6_Sub1Array42[arg0].aBoolean411 ? this.aClass6_Sub1Array42[arg0].method5616(arg1) : this.aClass6_Sub1Array42[arg0].method5608(arg1)[0];
	}

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)I")
	public int method5610() {
		return -1;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V")
	public void method5611() {
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(B)V")
	public void method5613() {
		if (this.aBoolean411) {
			this.aClass140_41.method3665();
			this.aClass140_41 = null;
		} else {
			this.aClass220_41.method5810();
			this.aClass220_41 = null;
		}
	}

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "(B)I")
	public int method5615() {
		return -1;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BI)[I")
	public int[] method5616(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BLclient!ec;I)V")
	public void method5617(@OriginalArg(1) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIB)[[I")
	protected final int[][] method5618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass6_Sub1Array42[arg1].aBoolean411) {
			@Pc(22) int[] local22 = this.aClass6_Sub1Array42[arg1].method5616(arg0);
			return new int[][] { local22, local22, local22 };
		} else {
			return this.aClass6_Sub1Array42[arg1].method5608(arg0);
		}
	}
}
