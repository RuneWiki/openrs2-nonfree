import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public abstract class Class4_Sub4 extends Class4 {

	@OriginalMember(owner = "client!mr", name = "v", descriptor = "Lclient!vc;")
	protected Class207 aClass207_41;

	@OriginalMember(owner = "client!mr", name = "y", descriptor = "I")
	public int anInt6436;

	@OriginalMember(owner = "client!mr", name = "G", descriptor = "Lclient!pr;")
	protected Class160 aClass160_41;

	@OriginalMember(owner = "client!mr", name = "J", descriptor = "[Lclient!mr;")
	public final Class4_Sub4[] aClass4_Sub4Array42;

	@OriginalMember(owner = "client!mr", name = "D", descriptor = "Z")
	public boolean aBoolean563;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(IZ)V")
	protected Class4_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass4_Sub4Array42 = new Class4_Sub4[arg0];
		this.aBoolean563 = arg1;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)I")
	public int method5379() {
		return -1;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)[I")
	public int[] method5380(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(III)V")
	public void method5381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = this.anInt6436 == 255 ? arg1 : this.anInt6436;
		if (this.aBoolean563) {
			this.aClass207_41 = new Class207(local12, arg1, arg0);
		} else {
			this.aClass160_41 = new Class160(local12, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Z)I")
	public int method5382() {
		return -1;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZI)[[I")
	public int[][] method5383(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IZI)[[I")
	protected final int[][] method5384(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass4_Sub4Array42[arg0].aBoolean563) {
			@Pc(31) int[] local31 = this.aClass4_Sub4Array42[arg0].method5380(arg1);
			return new int[][] { local31, local31, local31 };
		} else {
			return this.aClass4_Sub4Array42[arg0].method5383(arg1);
		}
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(III)[I")
	protected final int[] method5386(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass4_Sub4Array42[arg0].aBoolean563 ? this.aClass4_Sub4Array42[arg0].method5380(arg1) : this.aClass4_Sub4Array42[arg0].method5383(arg1)[0];
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IBLclient!tq;)V")
	public void method5387(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
	}

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "(B)V")
	public void method5390() {
		if (this.aBoolean563) {
			this.aClass207_41.method5469();
			this.aClass207_41 = null;
		} else {
			this.aClass160_41.method4317();
			this.aClass160_41 = null;
		}
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(Z)V")
	public void method5392() {
	}
}
