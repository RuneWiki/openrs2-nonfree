import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class84 {

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "Lclient!bb;")
	private final Class8 aClass8_30;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(I)V")
	public Class84(@OriginalArg(0) int arg0) {
		this.aClass8_30 = new Class8(arg0);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IJLclient!ia;)V")
	public void method2331(@OriginalArg(1) long arg0, @OriginalArg(2) Class1 arg1) {
		this.aClass8_30.method232(arg0, new Class5_Sub2_Sub25(arg1));
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(JB)Lclient!ia;")
	public Class1 method2332(@OriginalArg(0) long arg0) {
		@Pc(6) Class5_Sub2_Sub25 local6 = (Class5_Sub2_Sub25) this.aClass8_30.method227(arg0);
		return local6 == null ? null : local6.aClass1_11;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)V")
	public void method2335() {
		this.aClass8_30.method233();
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IJ)V")
	public void method2336(@OriginalArg(1) long arg0) {
		this.aClass8_30.method235(arg0);
	}
}
