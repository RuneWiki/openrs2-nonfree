import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class132 {

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "[I")
	public static final int[] anIntArray178 = new int[99];

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "Lclient!ng;")
	private final Class167 aClass167_54 = new Class167(64);

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "Lclient!ic;")
	private final Class113 aClass113_67;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 99; local6++) {
			@Pc(11) int local11 = local6 + 1;
			@Pc(24) int local24 = (int) (Math.pow(2.0D, (double) local11 / 7.0D) * 300.0D + (double) local11);
			local4 += local24;
			anIntArray178[local6] = local4 / 4;
		}
		new Class151("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lclient!ai;ILclient!ic;)V")
	public Class132(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class113 arg2) {
		this.aClass113_67 = arg2;
		if (this.aClass113_67 != null) {
			this.aClass113_67.method2271(11);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
	public void method2767() {
		@Pc(6) Class167 local6 = this.aClass167_54;
		synchronized (this.aClass167_54) {
			this.aClass167_54.method3389();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
	public void method2768() {
		@Pc(2) Class167 local2 = this.aClass167_54;
		synchronized (this.aClass167_54) {
			this.aClass167_54.method3390();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V")
	public void method2770() {
		@Pc(2) Class167 local2 = this.aClass167_54;
		synchronized (this.aClass167_54) {
			this.aClass167_54.method3384(5);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZI)Lclient!fg;")
	public Class78 method2771(@OriginalArg(1) int arg0) {
		@Pc(6) Class167 local6 = this.aClass167_54;
		@Pc(16) Class78 local16;
		synchronized (this.aClass167_54) {
			local16 = (Class78) this.aClass167_54.method3386((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass113_67.method2274(11, arg0);
		local16 = new Class78();
		if (local33 != null) {
			local16.method1576(new Class1_Sub11(local33));
		}
		@Pc(49) Class167 local49 = this.aClass167_54;
		synchronized (this.aClass167_54) {
			this.aClass167_54.method3392(local16, (long) arg0);
			return local16;
		}
	}
}
