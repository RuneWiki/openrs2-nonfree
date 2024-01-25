import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public abstract class Class6_Sub4 extends Class6 {

	@OriginalMember(owner = "client!be", name = "m", descriptor = "I")
	public int anInt9849;

	@OriginalMember(owner = "client!be", name = "r", descriptor = "Lclient!sl;")
	protected Class307 aClass307_41;

	@OriginalMember(owner = "client!be", name = "B", descriptor = "Lclient!wfa;")
	protected Class372 aClass372_41;

	@OriginalMember(owner = "client!be", name = "y", descriptor = "[Lclient!be;")
	public final Class6_Sub4[] aClass6_Sub4Array42;

	@OriginalMember(owner = "client!be", name = "s", descriptor = "Z")
	public boolean aBoolean674;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(IZ)V")
	protected Class6_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass6_Sub4Array42 = new Class6_Sub4[arg0];
		this.aBoolean674 = arg1;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIB)[I")
	protected final int[] method8313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass6_Sub4Array42[arg1].aBoolean674 ? this.aClass6_Sub4Array42[arg1].method8323(arg0) : this.aClass6_Sub4Array42[arg1].method8320(arg0)[0];
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IILclient!rg;)V")
	public void method8314(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
	public void method8315() {
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(B)I")
	public int method8316() {
		return -1;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(III)V")
	public void method8318(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt9849 == 255 ? arg1 : this.anInt9849;
		if (this.aBoolean674) {
			this.aClass372_41 = new Class372(local12, arg1, arg0);
		} else {
			this.aClass307_41 = new Class307(local12, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZII)[[I")
	protected final int[][] method8319(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass6_Sub4Array42[arg0].aBoolean674) {
			@Pc(31) int[] local31 = this.aClass6_Sub4Array42[arg0].method8323(arg1);
			return new int[][] { local31, local31, local31 };
		} else {
			return this.aClass6_Sub4Array42[arg0].method8320(arg1);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)[[I")
	public int[][] method8320(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(B)I")
	public int method8321() {
		return -1;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
	public void method8322() {
		if (this.aBoolean674) {
			this.aClass372_41.method8733();
			this.aClass372_41 = null;
		} else {
			this.aClass307_41.method7790();
			this.aClass307_41 = null;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BI)[I")
	public int[] method8323(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}
}
