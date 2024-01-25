import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class237 {

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "Lclient!fc;")
	private final Class77 aClass77_53 = new Class77(16);

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "Lclient!oi;")
	private final Class185 aClass185_103;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lclient!le;ILclient!oi;)V")
	public Class237(@OriginalArg(0) Class148 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class185 arg2) {
		this.aClass185_103 = arg2;
		this.aClass185_103.method4011(29);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)Lclient!dk;")
	private Class56 method5076(@OriginalArg(0) int arg0) {
		@Pc(6) Class77 local6 = this.aClass77_53;
		@Pc(16) Class56 local16;
		synchronized (this.aClass77_53) {
			local16 = (Class56) this.aClass77_53.method1387((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class185 local29 = this.aClass185_103;
		@Pc(38) byte[] local38;
		synchronized (this.aClass185_103) {
			local38 = this.aClass185_103.method4002(29, arg0);
		}
		local16 = new Class56();
		if (local38 != null) {
			local16.method937(new Class1_Sub19(local38));
		}
		@Pc(60) Class77 local60 = this.aClass77_53;
		synchronized (this.aClass77_53) {
			this.aClass77_53.method1396(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIILclient!ja;II)Lclient!pf;")
	public Class197 method5077(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class126 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class201[] local7 = null;
		@Pc(14) Class56 local14 = this.method5076(arg4);
		if (local14.anIntArray115 != null) {
			local7 = new Class201[local14.anIntArray115.length];
			for (@Pc(24) int local24 = 0; local24 < local7.length; local24++) {
				@Pc(34) Class134 local34 = arg2.method2690(local14.anIntArray115[local24]);
				local7[local24] = new Class201(local34.anInt3804, local34.anInt3802, local34.anInt3803, local34.anInt3808, local34.anInt3798, local34.anInt3807, local34.anInt3805, local34.aBoolean355);
			}
		}
		return new Class197(local14.anInt1064, local7, local14.anInt1069, arg0, arg3, arg1);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IB)V")
	public void method5079() {
		@Pc(6) Class77 local6 = this.aClass77_53;
		synchronized (this.aClass77_53) {
			this.aClass77_53.method1386(5);
		}
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
	public void method5082() {
		@Pc(2) Class77 local2 = this.aClass77_53;
		synchronized (this.aClass77_53) {
			this.aClass77_53.method1394();
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)V")
	public void method5083() {
		@Pc(2) Class77 local2 = this.aClass77_53;
		synchronized (this.aClass77_53) {
			this.aClass77_53.method1395();
		}
	}
}
