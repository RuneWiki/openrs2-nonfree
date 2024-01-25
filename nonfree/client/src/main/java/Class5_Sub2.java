import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fw")
public abstract class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!fw", name = "o", descriptor = "I")
	public int anInt10638;

	@OriginalMember(owner = "client!fw", name = "y", descriptor = "Lclient!ws;")
	protected Class379 aClass379_41;

	@OriginalMember(owner = "client!fw", name = "z", descriptor = "Lclient!iga;")
	protected Class160 aClass160_41;

	@OriginalMember(owner = "client!fw", name = "u", descriptor = "Z")
	public boolean aBoolean762;

	@OriginalMember(owner = "client!fw", name = "x", descriptor = "[Lclient!fw;")
	public final Class5_Sub2[] aClass5_Sub2Array42;

	@OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(IZ)V")
	protected Class5_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean762 = arg1;
		this.aClass5_Sub2Array42 = new Class5_Sub2[arg0];
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Z)I")
	public int method9032() {
		return -1;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(ZII)[[I")
	protected final int[][] method9033(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass5_Sub2Array42[arg0].aBoolean762) {
			@Pc(30) int[] local30 = this.aClass5_Sub2Array42[arg0].method9034(arg1);
			return new int[][] { local30, local30, local30 };
		} else {
			return this.aClass5_Sub2Array42[arg0].method9037(arg1);
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IB)[I")
	public int[] method9034(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!fw", name = "c", descriptor = "(II)[[I")
	public int[][] method9037(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(I)V")
	public void method9038() {
		if (this.aBoolean762) {
			this.aClass379_41.method9011();
			this.aClass379_41 = null;
		} else {
			this.aClass160_41.method3855();
			this.aClass160_41 = null;
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(B)I")
	public int method9039() {
		return -1;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(ILclient!ofa;I)V")
	public void method9040(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(III)[I")
	protected final int[] method9042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass5_Sub2Array42[arg1].aBoolean762 ? this.aClass5_Sub2Array42[arg1].method9034(arg0) : this.aClass5_Sub2Array42[arg1].method9037(arg0)[0];
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(BII)V")
	public void method9043(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt10638 == 255 ? arg1 : this.anInt10638;
		if (this.aBoolean762) {
			this.aClass379_41 = new Class379(local14, arg1, arg0);
		} else {
			this.aClass160_41 = new Class160(local14, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!fw", name = "c", descriptor = "(I)V")
	public void method9044() {
	}
}
