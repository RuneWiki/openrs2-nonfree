import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mca")
public abstract class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!mca", name = "s", descriptor = "Lclient!oca;")
	protected Class238 aClass238_41;

	@OriginalMember(owner = "client!mca", name = "u", descriptor = "I")
	public int anInt9552;

	@OriginalMember(owner = "client!mca", name = "B", descriptor = "Lclient!td;")
	protected Class314 aClass314_41;

	@OriginalMember(owner = "client!mca", name = "m", descriptor = "Z")
	public boolean aBoolean729;

	@OriginalMember(owner = "client!mca", name = "w", descriptor = "[Lclient!mca;")
	public final Class2_Sub2[] aClass2_Sub2Array42;

	@OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(IZ)V")
	protected Class2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean729 = arg1;
		this.aClass2_Sub2Array42 = new Class2_Sub2[arg0];
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)V")
	public void method7939() {
		if (this.aBoolean729) {
			this.aClass238_41.method5572();
			this.aClass238_41 = null;
		} else {
			this.aClass314_41.method7009();
			this.aClass314_41 = null;
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(B)I")
	public int method7940() {
		return -1;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(II)[I")
	public int[] method7941(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(IBI)V")
	public void method7944(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(22) int local22 = this.anInt9552 == 255 ? arg0 : this.anInt9552;
		if (this.aBoolean729) {
			this.aClass238_41 = new Class238(local22, arg0, arg1);
		} else {
			this.aClass314_41 = new Class314(local22, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "(B)I")
	public int method7945() {
		return -1;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(IZ)[[I")
	public int[][] method7946(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(III)[[I")
	protected final int[][] method7947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass2_Sub2Array42[arg0].aBoolean729) {
			@Pc(32) int[] local32 = this.aClass2_Sub2Array42[arg0].method7941(arg1);
			return new int[][] { local32, local32, local32 };
		} else {
			return this.aClass2_Sub2Array42[arg0].method7946(arg1);
		}
	}

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "(I)V")
	public void method7948() {
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(ILclient!es;I)V")
	public void method7949(@OriginalArg(1) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(IZI)[I")
	protected final int[] method7951(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass2_Sub2Array42[arg1].aBoolean729 ? this.aClass2_Sub2Array42[arg1].method7941(arg0) : this.aClass2_Sub2Array42[arg1].method7946(arg0)[0];
	}
}
