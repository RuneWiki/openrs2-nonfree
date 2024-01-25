import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class302 {

	@OriginalMember(owner = "client!qd", name = "j", descriptor = "Lclient!qfa;")
	private final Class307 aClass307_81 = new Class307(16);

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "Lclient!ik;")
	private final Class182 aClass182_103;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!qh;ILclient!ik;)V")
	public Class302(@OriginalArg(0) Class309 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class182 arg2) {
		this.aClass182_103 = arg2;
		this.aClass182_103.method3970(29);
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)V")
	public void method6966() {
		@Pc(14) Class307 local14 = this.aClass307_81;
		synchronized (this.aClass307_81) {
			this.aClass307_81.method6995(5);
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIBLclient!pu;)Lclient!jr;")
	public Class200 method6968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class297 arg4) {
		@Pc(7) Class332[] local7 = null;
		@Pc(12) Class293 local12 = this.method6973(arg2);
		if (local12.anIntArray583 != null) {
			local7 = new Class332[local12.anIntArray583.length];
			for (@Pc(22) int local22 = 0; local22 < local7.length; local22++) {
				@Pc(32) Class212 local32 = arg4.method6919(local12.anIntArray583[local22]);
				local7[local22] = new Class332(local32.anInt5554, local32.anInt5551, local32.anInt5548, local32.anInt5550, local32.anInt5558, local32.anInt5545, local32.anInt5557, local32.aBoolean359, local32.anInt5555, local32.anInt5549, local32.anInt5556);
			}
		}
		return new Class200(local12.anInt8021, local7, local12.anInt8024, arg1, arg0, arg3, local12.anInt8023, local12.anInt8019);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
	public void method6969() {
		@Pc(2) Class307 local2 = this.aClass307_81;
		synchronized (this.aClass307_81) {
			this.aClass307_81.method6998();
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
	public void method6972() {
		@Pc(17) Class307 local17 = this.aClass307_81;
		synchronized (this.aClass307_81) {
			this.aClass307_81.method7006();
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)Lclient!pl;")
	private Class293 method6973(@OriginalArg(1) int arg0) {
		@Pc(6) Class307 local6 = this.aClass307_81;
		@Pc(18) Class293 local18;
		synchronized (this.aClass307_81) {
			local18 = (Class293) this.aClass307_81.method7002((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(32) Class182 local32 = this.aClass182_103;
		@Pc(41) byte[] local41;
		synchronized (this.aClass182_103) {
			local41 = this.aClass182_103.method3985(arg0, 29);
		}
		local18 = new Class293();
		if (local41 != null) {
			local18.method6864(new Class3_Sub2(local41));
		}
		@Pc(65) Class307 local65 = this.aClass307_81;
		synchronized (this.aClass307_81) {
			this.aClass307_81.method7000(local18, (long) arg0);
			return local18;
		}
	}
}
