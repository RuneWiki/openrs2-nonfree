import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class190 {

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "[I")
	public static final int[] anIntArray377 = new int[128];

	@OriginalMember(owner = "client!ki", name = "k", descriptor = "Lclient!qr;")
	private final Class293 aClass293_38 = new Class293(64);

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "Lclient!wu;")
	public final Class384 aClass384_73;

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "Lclient!wu;")
	private final Class384 aClass384_74;

	static {
		for (@Pc(4) int local4 = 0; local4 < anIntArray377.length; local4++) {
			anIntArray377[local4] = -1;
		}
		for (@Pc(20) int local20 = 65; local20 <= 90; local20++) {
			anIntArray377[local20] = local20 - 65;
		}
		for (@Pc(33) int local33 = 97; local33 <= 122; local33++) {
			anIntArray377[local33] = local33 + 26 - 97;
		}
		for (@Pc(48) int local48 = 48; local48 <= 57; local48++) {
			anIntArray377[local48] = local48 + 52 - 48;
		}
		anIntArray377[42] = anIntArray377[43] = 62;
		anIntArray377[45] = anIntArray377[47] = 63;
	}

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lclient!ms;ILclient!wu;Lclient!wu;)V")
	public Class190(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class384 arg2, @OriginalArg(3) Class384 arg3) {
		this.aClass384_73 = arg3;
		this.aClass384_74 = arg2;
		this.aClass384_74.method8862(3);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)Lclient!qea;")
	public Class282 method4302(@OriginalArg(1) int arg0) {
		@Pc(6) Class293 local6 = this.aClass293_38;
		@Pc(16) Class282 local16;
		synchronized (this.aClass293_38) {
			local16 = (Class282) this.aClass293_38.method6921((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class384 local29 = this.aClass384_74;
		@Pc(38) byte[] local38;
		synchronized (this.aClass384_74) {
			local38 = this.aClass384_74.method8885(3, arg0);
		}
		local16 = new Class282();
		local16.aClass190_1 = this;
		if (local38 != null) {
			local16.method6820(new Class5_Sub12(local38));
		}
		@Pc(65) Class293 local65 = this.aClass293_38;
		synchronized (this.aClass293_38) {
			this.aClass293_38.method6925((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
	public void method4303() {
		@Pc(11) Class293 local11 = this.aClass293_38;
		synchronized (this.aClass293_38) {
			this.aClass293_38.method6930();
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
	public void method4304() {
		@Pc(6) Class293 local6 = this.aClass293_38;
		synchronized (this.aClass293_38) {
			this.aClass293_38.method6927();
		}
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(II)V")
	public void method4307() {
		@Pc(6) Class293 local6 = this.aClass293_38;
		synchronized (this.aClass293_38) {
			this.aClass293_38.method6922(5);
		}
	}
}
