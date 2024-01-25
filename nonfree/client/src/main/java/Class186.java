import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kga")
public final class Class186 {

	@OriginalMember(owner = "client!kga", name = "e", descriptor = "Lclient!fba;")
	private final Class102 aClass102_31 = new Class102(16);

	@OriginalMember(owner = "client!kga", name = "h", descriptor = "Lclient!la;")
	private final Class196 aClass196_52;

	@OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(Lclient!mp;ILclient!la;)V")
	public Class186(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class196 arg2) {
		this.aClass196_52 = arg2;
		this.aClass196_52.method5118(29);
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIIIILclient!sea;)Lclient!tr;")
	public Class327 method4651(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class306 arg4) {
		@Pc(12) Class365[] local12 = null;
		@Pc(17) Class257 local17 = this.method4655(arg2);
		if (local17.anIntArray467 != null) {
			local12 = new Class365[local17.anIntArray467.length];
			for (@Pc(27) int local27 = 0; local27 < local12.length; local27++) {
				@Pc(37) Class124 local37 = arg4.method7662(local17.anIntArray467[local27]);
				local12[local27] = new Class365(local37.anInt3432, local37.anInt3431, local37.anInt3426, local37.anInt3436, local37.anInt3428, local37.anInt3433, local37.anInt3429, local37.aBoolean220);
			}
		}
		return new Class327(local17.anInt7646, local12, local17.anInt7648, arg3, arg0, arg1);
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(I)V")
	public void method4652() {
		@Pc(6) Class102 local6 = this.aClass102_31;
		synchronized (this.aClass102_31) {
			this.aClass102_31.method2681();
		}
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "(I)V")
	public void method4654() {
		@Pc(11) Class102 local11 = this.aClass102_31;
		synchronized (this.aClass102_31) {
			this.aClass102_31.method2680();
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(BI)Lclient!pc;")
	private Class257 method4655(@OriginalArg(1) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_31;
		@Pc(16) Class257 local16;
		synchronized (this.aClass102_31) {
			local16 = (Class257) this.aClass102_31.method2677((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class196 local29 = this.aClass196_52;
		@Pc(38) byte[] local38;
		synchronized (this.aClass196_52) {
			local38 = this.aClass196_52.method5102(29, arg0);
		}
		local16 = new Class257();
		if (local38 != null) {
			local16.method6623(new Class3_Sub3(local38));
		}
		@Pc(60) Class102 local60 = this.aClass102_31;
		synchronized (this.aClass102_31) {
			this.aClass102_31.method2674((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IB)V")
	public void method4656() {
		@Pc(6) Class102 local6 = this.aClass102_31;
		synchronized (this.aClass102_31) {
			this.aClass102_31.method2668(5);
		}
	}
}
