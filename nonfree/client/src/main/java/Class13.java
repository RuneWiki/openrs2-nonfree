import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aha")
public final class Class13 {

	@OriginalMember(owner = "client!aha", name = "d", descriptor = "I")
	public int anInt169 = 0;

	@OriginalMember(owner = "client!aha", name = "c", descriptor = "I")
	public int anInt168 = 0;

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "Lclient!jr;")
	private final Class169 aClass169_1 = new Class169(64);

	@OriginalMember(owner = "client!aha", name = "l", descriptor = "Lclient!bq;")
	private Interface3 anInterface3_1 = null;

	@OriginalMember(owner = "client!aha", name = "g", descriptor = "Lclient!in;")
	private final Class157 aClass157_6;

	@OriginalMember(owner = "client!aha", name = "h", descriptor = "Lclient!in;")
	private final Class157 aClass157_7;

	@OriginalMember(owner = "client!aha", name = "<init>", descriptor = "(ILclient!in;Lclient!in;Lclient!bq;)V")
	public Class13(@OriginalArg(0) int arg0, @OriginalArg(1) Class157 arg1, @OriginalArg(2) Class157 arg2, @OriginalArg(3) Interface3 arg3) {
		this.anInterface3_1 = arg3;
		this.aClass157_6 = arg1;
		this.aClass157_7 = arg2;
		if (this.aClass157_6 != null) {
			this.anInt169 = this.aClass157_6.method4561(1);
		}
		if (this.aClass157_7 != null) {
			this.anInt168 = this.aClass157_7.method4561(1);
		}
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(IB)Lclient!td;")
	public Class2_Sub6_Sub19 method226(@OriginalArg(0) int arg0) {
		@Pc(11) Class2_Sub6_Sub19 local11 = (Class2_Sub6_Sub19) this.aClass169_1.method5002((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(29) byte[] local29;
		if (arg0 >= 32768) {
			local29 = this.aClass157_7.method4564(1, arg0 & 0x7FFF);
		} else {
			local29 = this.aClass157_6.method4564(1, arg0);
		}
		local11 = new Class2_Sub6_Sub19();
		local11.aClass13_2 = this;
		if (local29 != null) {
			local11.method8044(new Class2_Sub11(local29));
		}
		if (arg0 >= 32768) {
			local11.method8035();
		}
		this.aClass169_1.method5001(local11, (long) arg0);
		return local11;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(J[IILclient!oaa;)Ljava/lang/String;")
	public String method227(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class234 arg2) {
		if (this.anInterface3_1 != null) {
			@Pc(20) String local20 = this.anInterface3_1.method4297(arg0, arg2, arg1);
			if (local20 != null) {
				return local20;
			}
		}
		return Long.toString(arg0);
	}
}
