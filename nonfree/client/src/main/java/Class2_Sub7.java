import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public abstract class Class2_Sub7 extends Class2 {

	@OriginalMember(owner = "client!tk", name = "q", descriptor = "I")
	public int anInt9073;

	@OriginalMember(owner = "client!tk", name = "r", descriptor = "Lclient!lu;")
	protected Class180 aClass180_41;

	@OriginalMember(owner = "client!tk", name = "F", descriptor = "Lclient!pj;")
	protected Class221 aClass221_41;

	@OriginalMember(owner = "client!tk", name = "z", descriptor = "[Lclient!tk;")
	public final Class2_Sub7[] aClass2_Sub7Array42;

	@OriginalMember(owner = "client!tk", name = "n", descriptor = "Z")
	public boolean aBoolean649;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(IZ)V")
	protected Class2_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass2_Sub7Array42 = new Class2_Sub7[arg0];
		this.aBoolean649 = arg1;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)I")
	public int method7579() {
		return -1;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(BII)[I")
	protected final int[] method7581(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass2_Sub7Array42[arg1].aBoolean649 ? this.aClass2_Sub7Array42[arg1].method7587(arg0) : this.aClass2_Sub7Array42[arg1].method7585(arg0)[0];
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IBLclient!ps;)V")
	public void method7582(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
	public void method7583() {
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(BI)[[I")
	public int[][] method7585(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(BI)[I")
	public int[] method7587(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)V")
	public void method7588(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt9073 == 255 ? arg1 : this.anInt9073;
		if (this.aBoolean649) {
			this.aClass221_41 = new Class221(local12, arg1, arg0);
		} else {
			this.aClass180_41 = new Class180(local12, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(BII)[[I")
	protected final int[][] method7589(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass2_Sub7Array42[arg0].aBoolean649) {
			@Pc(31) int[] local31 = this.aClass2_Sub7Array42[arg0].method7587(arg1);
			return new int[][] { local31, local31, local31 };
		} else {
			return this.aClass2_Sub7Array42[arg0].method7585(arg1);
		}
	}

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "(I)V")
	public void method7591() {
		if (this.aBoolean649) {
			this.aClass221_41.method5899();
			this.aClass221_41 = null;
		} else {
			this.aClass180_41.method4529();
			this.aClass180_41 = null;
		}
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(Z)I")
	public int method7593() {
		return -1;
	}
}
