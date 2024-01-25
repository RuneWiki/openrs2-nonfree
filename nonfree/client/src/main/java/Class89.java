import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fw")
public final class Class89 {

	@OriginalMember(owner = "client!fw", name = "e", descriptor = "Lclient!fc;")
	private final Class77 aClass77_21 = new Class77(64);

	@OriginalMember(owner = "client!fw", name = "f", descriptor = "Lclient!oi;")
	private final Class185 aClass185_37;

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "Lclient!oi;")
	private final Class185 aClass185_36;

	@OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(ILclient!oi;Lclient!oi;)V")
	public Class89(@OriginalArg(0) int arg0, @OriginalArg(1) Class185 arg1, @OriginalArg(2) Class185 arg2) {
		this.aClass185_37 = arg1;
		this.aClass185_36 = arg2;
		if (this.aClass185_37 != null) {
			this.aClass185_37.method4011(0);
		}
		if (this.aClass185_36 != null) {
			this.aClass185_36.method4011(0);
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IB)Lclient!dt;")
	public Class1_Sub3_Sub4 method1589(@OriginalArg(0) int arg0) {
		@Pc(17) Class1_Sub3_Sub4 local17 = (Class1_Sub3_Sub4) this.aClass77_21.method1387((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(33) byte[] local33;
		if (arg0 < 32768) {
			local33 = this.aClass185_37.method4002(0, arg0);
		} else {
			local33 = this.aClass185_36.method4002(0, arg0 & 0x7FFF);
		}
		local17 = new Class1_Sub3_Sub4();
		if (local33 != null) {
			local17.method1010(new Class1_Sub19(local33));
		}
		if (arg0 >= 32768) {
			local17.method1005();
		}
		this.aClass77_21.method1396(local17, (long) arg0);
		return local17;
	}
}
