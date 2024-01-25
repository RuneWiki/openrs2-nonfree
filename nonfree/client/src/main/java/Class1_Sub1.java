import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public abstract class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!po", name = "q", descriptor = "Lclient!j;")
	protected Class98 aClass98_41;

	@OriginalMember(owner = "client!po", name = "C", descriptor = "I")
	public int anInt6964;

	@OriginalMember(owner = "client!po", name = "H", descriptor = "Lclient!dg;")
	protected Class34 aClass34_41;

	@OriginalMember(owner = "client!po", name = "w", descriptor = "Z")
	public boolean aBoolean509;

	@OriginalMember(owner = "client!po", name = "D", descriptor = "[Lclient!po;")
	public final Class1_Sub1[] aClass1_Sub1Array42;

	static {
		new Class106(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
	}

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(IZ)V")
	protected Class1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean509 = arg1;
		this.aClass1_Sub1Array42 = new Class1_Sub1[arg0];
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(III)V")
	public void method6001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = this.anInt6964 == 255 ? arg1 : this.anInt6964;
		if (this.aBoolean509) {
			this.aClass98_41 = new Class98(local12, arg1, arg0);
		} else {
			this.aClass34_41 = new Class34(local12, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IILclient!at;)V")
	public void method6002(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
	}

	@OriginalMember(owner = "client!po", name = "d", descriptor = "(I)I")
	public int method6003() {
		return -1;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(II)[[I")
	public int[][] method6004(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(III)[[I")
	protected final int[][] method6006(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass1_Sub1Array42[arg0].aBoolean509) {
			@Pc(23) int[] local23 = this.aClass1_Sub1Array42[arg0].method6007(arg1);
			return new int[][] { local23, local23, local23 };
		} else {
			return this.aClass1_Sub1Array42[arg0].method6004(arg1);
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IB)[I")
	public int[] method6007(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!po", name = "e", descriptor = "(I)V")
	public void method6008() {
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Z)V")
	public void method6009() {
		if (this.aBoolean509) {
			this.aClass98_41.method2849();
			this.aClass98_41 = null;
		} else {
			this.aClass34_41.method1355();
			this.aClass34_41 = null;
		}
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(B)I")
	public int method6011() {
		return -1;
	}

	@OriginalMember(owner = "client!po", name = "c", descriptor = "(III)[I")
	protected final int[] method6013(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass1_Sub1Array42[arg1].aBoolean509 ? this.aClass1_Sub1Array42[arg1].method6007(arg0) : this.aClass1_Sub1Array42[arg1].method6004(arg0)[0];
	}
}
