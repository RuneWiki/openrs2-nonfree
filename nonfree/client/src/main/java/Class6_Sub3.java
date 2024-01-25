import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public abstract class Class6_Sub3 extends Class6 {

	@OriginalMember(owner = "client!vm", name = "p", descriptor = "Lclient!fi;")
	protected Class103 aClass103_41;

	@OriginalMember(owner = "client!vm", name = "s", descriptor = "I")
	public int anInt9586;

	@OriginalMember(owner = "client!vm", name = "v", descriptor = "Lclient!kk;")
	protected Class174 aClass174_41;

	@OriginalMember(owner = "client!vm", name = "l", descriptor = "[Lclient!vm;")
	public final Class6_Sub3[] aClass6_Sub3Array42;

	@OriginalMember(owner = "client!vm", name = "m", descriptor = "Z")
	public boolean aBoolean668;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(IZ)V")
	protected Class6_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass6_Sub3Array42 = new Class6_Sub3[arg0];
		this.aBoolean668 = arg1;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IB)[[I")
	public int[][] method7822(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(III)[[I")
	protected final int[][] method7823(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass6_Sub3Array42[arg0].aBoolean668) {
			@Pc(22) int[] local22 = this.aClass6_Sub3Array42[arg0].method7828(arg1);
			return new int[][] { local22, local22, local22 };
		} else {
			return this.aClass6_Sub3Array42[arg0].method7822(arg1);
		}
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(III)[I")
	protected final int[] method7824(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass6_Sub3Array42[arg0].aBoolean668 ? this.aClass6_Sub3Array42[arg0].method7828(arg1) : this.aClass6_Sub3Array42[arg0].method7822(arg1)[0];
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)I")
	public int method7825() {
		return -1;
	}

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(III)V")
	public void method7827(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt9586 == 255 ? arg0 : this.anInt9586;
		if (this.aBoolean668) {
			this.aClass174_41 = new Class174(local12, arg0, arg1);
		} else {
			this.aClass103_41 = new Class103(local12, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(BI)[I")
	public int[] method7828(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)I")
	public int method7829() {
		return -1;
	}

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(I)V")
	public void method7830() {
		if (this.aBoolean668) {
			this.aClass174_41.method3730();
			this.aClass174_41 = null;
		} else {
			this.aClass103_41.method2142();
			this.aClass103_41 = null;
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IILclient!dga;)V")
	public void method7831(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
	}

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(B)V")
	public void method7832() {
	}
}
