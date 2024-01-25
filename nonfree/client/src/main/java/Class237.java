import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class237 {

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "Lclient!lga;")
	private final Class207 aClass207_34 = new Class207(16);

	@OriginalMember(owner = "client!nk", name = "f", descriptor = "Lclient!sea;")
	private final Class308 aClass308_123;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lclient!ci;ILclient!sea;)V")
	public Class237(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class308 arg2) {
		this.aClass308_123 = arg2;
		this.aClass308_123.method6568(29);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)Lclient!jn;")
	private Class177 method5205(@OriginalArg(0) int arg0) {
		@Pc(6) Class207 local6 = this.aClass207_34;
		@Pc(16) Class177 local16;
		synchronized (this.aClass207_34) {
			local16 = (Class177) this.aClass207_34.method4390((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class308 local29 = this.aClass308_123;
		@Pc(38) byte[] local38;
		synchronized (this.aClass308_123) {
			local38 = this.aClass308_123.method6569(29, arg0);
		}
		local16 = new Class177();
		if (local38 != null) {
			local16.method3641(new Class1_Sub3(local38));
		}
		@Pc(60) Class207 local60 = this.aClass207_34;
		synchronized (this.aClass207_34) {
			this.aClass207_34.method4391((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIBIILclient!it;)Lclient!qv;")
	public Class289 method5206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class164 arg4) {
		@Pc(14) Class179[] local14 = null;
		@Pc(19) Class177 local19 = this.method5205(arg0);
		if (local19.anIntArray249 != null) {
			local14 = new Class179[local19.anIntArray249.length];
			for (@Pc(29) int local29 = 0; local29 < local14.length; local29++) {
				@Pc(39) Class251 local39 = arg4.method3419(local19.anIntArray249[local29]);
				local14[local29] = new Class179(local39.anInt6719, local39.anInt6720, local39.anInt6716, local39.anInt6721, local39.anInt6714, local39.anInt6723, local39.anInt6715, local39.aBoolean521);
			}
		}
		return new Class289(local19.anInt4545, local14, local19.anInt4546, arg1, arg3, arg2);
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)V")
	public void method5208() {
		@Pc(6) Class207 local6 = this.aClass207_34;
		synchronized (this.aClass207_34) {
			this.aClass207_34.method4397(5);
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
	public void method5209() {
		@Pc(7) Class207 local7 = this.aClass207_34;
		synchronized (this.aClass207_34) {
			this.aClass207_34.method4398();
		}
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)V")
	public void method5210() {
		@Pc(6) Class207 local6 = this.aClass207_34;
		synchronized (this.aClass207_34) {
			this.aClass207_34.method4392();
		}
	}
}
