import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mba")
public abstract class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!mba", name = "k", descriptor = "I")
	public int anInt10269;

	@OriginalMember(owner = "client!mba", name = "s", descriptor = "Lclient!kd;")
	protected Class185 aClass185_41;

	@OriginalMember(owner = "client!mba", name = "A", descriptor = "Lclient!efa;")
	protected Class84 aClass84_41;

	@OriginalMember(owner = "client!mba", name = "x", descriptor = "Z")
	public boolean aBoolean726;

	@OriginalMember(owner = "client!mba", name = "j", descriptor = "[Lclient!mba;")
	public final Class4_Sub1[] aClass4_Sub1Array42;

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(IZ)V")
	protected Class4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean726 = arg1;
		this.aClass4_Sub1Array42 = new Class4_Sub1[arg0];
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(B)I")
	public int method8383() {
		return -1;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(II)[I")
	public int[] method8384(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "(III)[[I")
	protected final int[][] method8385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass4_Sub1Array42[arg1].aBoolean726) {
			@Pc(22) int[] local22 = this.aClass4_Sub1Array42[arg1].method8384(arg0);
			return new int[][] { local22, local22, local22 };
		} else {
			return this.aClass4_Sub1Array42[arg1].method8388(arg0);
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Z)V")
	public void method8386() {
		if (this.aBoolean726) {
			this.aClass185_41.method4442();
			this.aClass185_41 = null;
		} else {
			this.aClass84_41.method2456();
			this.aClass84_41 = null;
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IBI)V")
	public void method8387(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt10269 == 255 ? arg1 : this.anInt10269;
		if (this.aBoolean726) {
			this.aClass185_41 = new Class185(local14, arg1, arg0);
		} else {
			this.aClass84_41 = new Class84(local14, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "(II)[[I")
	public int[][] method8388(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IBLclient!un;)V")
	public void method8389(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
	}

	@OriginalMember(owner = "client!mba", name = "c", descriptor = "(B)I")
	public int method8390() {
		return -1;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(I)V")
	public void method8391() {
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(BII)[I")
	protected final int[] method8392(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass4_Sub1Array42[arg1].aBoolean726 ? this.aClass4_Sub1Array42[arg1].method8384(arg0) : this.aClass4_Sub1Array42[arg1].method8388(arg0)[0];
	}
}
