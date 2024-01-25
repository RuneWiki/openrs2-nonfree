import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qt")
public abstract class Class8_Sub2 extends Class8 {

	@OriginalMember(owner = "client!qt", name = "n", descriptor = "I")
	public int anInt10548;

	@OriginalMember(owner = "client!qt", name = "o", descriptor = "Lclient!cd;")
	protected Class50 aClass50_41;

	@OriginalMember(owner = "client!qt", name = "A", descriptor = "Lclient!qaa;")
	protected Class269 aClass269_41;

	@OriginalMember(owner = "client!qt", name = "v", descriptor = "Z")
	public boolean aBoolean753;

	@OriginalMember(owner = "client!qt", name = "D", descriptor = "[Lclient!qt;")
	public final Class8_Sub2[] aClass8_Sub2Array42;

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(IZ)V")
	protected Class8_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean753 = arg1;
		this.aClass8_Sub2Array42 = new Class8_Sub2[arg0];
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(BI)[[I")
	public int[][] method8500(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(ILclient!ig;Z)V")
	public void method8501(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub8 arg1) {
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)I")
	public int method8503() {
		return -1;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(III)[I")
	protected final int[] method8505(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass8_Sub2Array42[arg1].aBoolean753 ? this.aClass8_Sub2Array42[arg1].method8507(arg0) : this.aClass8_Sub2Array42[arg1].method8500(arg0)[0];
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(B)V")
	public void method8506() {
		if (this.aBoolean753) {
			this.aClass50_41.method1689();
			this.aClass50_41 = null;
		} else {
			this.aClass269_41.method6814();
			this.aClass269_41 = null;
		}
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(BI)[I")
	public int[] method8507(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!qt", name = "c", descriptor = "(B)V")
	public void method8508() {
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIB)V")
	public void method8509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = this.anInt10548 == 255 ? arg0 : this.anInt10548;
		if (this.aBoolean753) {
			this.aClass50_41 = new Class50(local14, arg0, arg1);
		} else {
			this.aClass269_41 = new Class269(local14, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIZ)[[I")
	protected final int[][] method8510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass8_Sub2Array42[arg0].aBoolean753) {
			@Pc(30) int[] local30 = this.aClass8_Sub2Array42[arg0].method8507(arg1);
			return new int[][] { local30, local30, local30 };
		} else {
			return this.aClass8_Sub2Array42[arg0].method8500(arg1);
		}
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(I)I")
	public int method8511() {
		return -1;
	}
}
