import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eu")
public abstract class Class1_Sub4 extends Class1 {

	@OriginalMember(owner = "client!eu", name = "n", descriptor = "Lclient!aw;")
	protected Class15 aClass15_41;

	@OriginalMember(owner = "client!eu", name = "r", descriptor = "Lclient!ca;")
	protected Class34 aClass34_41;

	@OriginalMember(owner = "client!eu", name = "s", descriptor = "I")
	public int anInt7279;

	@OriginalMember(owner = "client!eu", name = "v", descriptor = "[Lclient!eu;")
	public final Class1_Sub4[] aClass1_Sub4Array42;

	@OriginalMember(owner = "client!eu", name = "z", descriptor = "Z")
	public boolean aBoolean501;

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(IZ)V")
	protected Class1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass1_Sub4Array42 = new Class1_Sub4[arg0];
		this.aBoolean501 = arg1;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(BILclient!hp;)V")
	public void method5949(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)V")
	public void method5950() {
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(II)[[I")
	public int[][] method5951(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "(B)I")
	public int method5952() {
		return -1;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)V")
	public void method5953() {
		if (this.aBoolean501) {
			this.aClass15_41.method505();
			this.aClass15_41 = null;
		} else {
			this.aClass34_41.method822();
			this.aClass34_41 = null;
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(III)V")
	public void method5954(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt7279 == 255 ? arg0 : this.anInt7279;
		if (this.aBoolean501) {
			this.aClass15_41 = new Class15(local14, arg0, arg1);
		} else {
			this.aClass34_41 = new Class34(local14, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!eu", name = "g", descriptor = "(I)I")
	public int method5955() {
		return -1;
	}

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "(III)[[I")
	protected final int[][] method5956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass1_Sub4Array42[arg1].aBoolean501) {
			@Pc(30) int[] local30 = this.aClass1_Sub4Array42[arg1].method5957(arg0);
			return new int[][] { local30, local30, local30 };
		} else {
			return this.aClass1_Sub4Array42[arg1].method5951(arg0);
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IB)[I")
	public int[] method5957(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!eu", name = "c", descriptor = "(III)[I")
	protected final int[] method5958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass1_Sub4Array42[arg1].aBoolean501 ? this.aClass1_Sub4Array42[arg1].method5957(arg0) : this.aClass1_Sub4Array42[arg1].method5951(arg0)[0];
	}
}
