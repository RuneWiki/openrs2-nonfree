import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public abstract class Class4_Sub4 extends Class4 {

	@OriginalMember(owner = "client!mm", name = "o", descriptor = "I")
	public int anInt7633;

	@OriginalMember(owner = "client!mm", name = "p", descriptor = "Lclient!gs;")
	protected Class103 aClass103_41;

	@OriginalMember(owner = "client!mm", name = "w", descriptor = "Lclient!lu;")
	protected Class163 aClass163_41;

	@OriginalMember(owner = "client!mm", name = "n", descriptor = "[Lclient!mm;")
	public final Class4_Sub4[] aClass4_Sub4Array42;

	@OriginalMember(owner = "client!mm", name = "m", descriptor = "Z")
	public boolean aBoolean535;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(IZ)V")
	protected Class4_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass4_Sub4Array42 = new Class4_Sub4[arg0];
		this.aBoolean535 = arg1;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)[I")
	public int[] method6037(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(Z)V")
	public void method6038() {
	}

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "(Z)I")
	public int method6039() {
		return -1;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(III)[I")
	protected final int[] method6040(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass4_Sub4Array42[arg1].aBoolean535 ? this.aClass4_Sub4Array42[arg1].method6037(arg0) : this.aClass4_Sub4Array42[arg1].method6043(arg0)[0];
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(III)V")
	public void method6041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(22) int local22 = this.anInt7633 == 255 ? arg1 : this.anInt7633;
		if (this.aBoolean535) {
			this.aClass103_41 = new Class103(local22, arg1, arg0);
		} else {
			this.aClass163_41 = new Class163(local22, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
	public void method6042() {
		if (this.aBoolean535) {
			this.aClass103_41.method1975();
			this.aClass103_41 = null;
		} else {
			this.aClass163_41.method3182();
			this.aClass163_41 = null;
		}
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(II)[[I")
	public int[][] method6043(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)I")
	public int method6045() {
		return -1;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(BILclient!fh;)V")
	public void method6046(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
	}

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "(III)[[I")
	protected final int[][] method6049(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass4_Sub4Array42[arg1].aBoolean535) {
			@Pc(22) int[] local22 = this.aClass4_Sub4Array42[arg1].method6037(arg0);
			return new int[][] { local22, local22, local22 };
		} else {
			return this.aClass4_Sub4Array42[arg1].method6043(arg0);
		}
	}
}
