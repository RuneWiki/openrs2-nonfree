import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aea")
public abstract class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!aea", name = "k", descriptor = "I")
	public int anInt10378;

	@OriginalMember(owner = "client!aea", name = "p", descriptor = "Lclient!op;")
	protected Class271 aClass271_41;

	@OriginalMember(owner = "client!aea", name = "w", descriptor = "Lclient!qk;")
	protected Class304 aClass304_41;

	@OriginalMember(owner = "client!aea", name = "z", descriptor = "Z")
	public boolean aBoolean793;

	@OriginalMember(owner = "client!aea", name = "m", descriptor = "[Lclient!aea;")
	public final Class4_Sub2[] aClass4_Sub2Array42;

	@OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(IZ)V")
	protected Class4_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean793 = arg1;
		this.aClass4_Sub2Array42 = new Class4_Sub2[arg0];
	}

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "(Z)V")
	public void method8763() {
		if (this.aBoolean793) {
			this.aClass271_41.method6066();
			this.aClass271_41 = null;
		} else {
			this.aClass304_41.method6700();
			this.aClass304_41 = null;
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(II)[I")
	public int[] method8765(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(III)V")
	public void method8766(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt10378 == 255 ? arg0 : this.anInt10378;
		if (this.aBoolean793) {
			this.aClass271_41 = new Class271(local12, arg0, arg1);
		} else {
			this.aClass304_41 = new Class304(local12, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(BILclient!es;)V")
	public void method8767(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIB)[I")
	protected final int[] method8768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass4_Sub2Array42[arg0].aBoolean793 ? this.aClass4_Sub2Array42[arg0].method8765(arg1) : this.aClass4_Sub2Array42[arg0].method8771(arg1)[0];
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(B)V")
	public void method8769() {
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(I)I")
	public int method8770() {
		return -1;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(BI)[[I")
	public int[][] method8771(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "(III)[[I")
	protected final int[][] method8772(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass4_Sub2Array42[arg1].aBoolean793) {
			@Pc(33) int[] local33 = this.aClass4_Sub2Array42[arg1].method8765(arg0);
			return new int[][] { local33, local33, local33 };
		} else {
			return this.aClass4_Sub2Array42[arg1].method8771(arg0);
		}
	}

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "(I)I")
	public int method8774() {
		return -1;
	}
}
