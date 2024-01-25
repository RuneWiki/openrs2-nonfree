import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class17 {

	@OriginalMember(owner = "client!am", name = "g", descriptor = "Lclient!qfa;")
	private final Class307 aClass307_4 = new Class307(64);

	@OriginalMember(owner = "client!am", name = "d", descriptor = "Lclient!ik;")
	private final Class182 aClass182_4;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "I")
	public final int anInt722;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lclient!qh;ILclient!ik;)V")
	public Class17(@OriginalArg(0) Class309 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class182 arg2) {
		this.aClass182_4 = arg2;
		if (this.aClass182_4 == null) {
			this.anInt722 = 0;
		} else {
			this.anInt722 = this.aClass182_4.method3970(47);
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(II)Lclient!daa;")
	public Class69 method653(@OriginalArg(1) int arg0) {
		@Pc(14) Class307 local14 = this.aClass307_4;
		@Pc(24) Class69 local24;
		synchronized (this.aClass307_4) {
			local24 = (Class69) this.aClass307_4.method7002((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(38) Class182 local38 = this.aClass182_4;
		@Pc(47) byte[] local47;
		synchronized (this.aClass182_4) {
			local47 = this.aClass182_4.method3985(arg0, 47);
		}
		local24 = new Class69();
		if (local47 != null) {
			local24.method1969(new Class3_Sub2(local47));
		}
		@Pc(71) Class307 local71 = this.aClass307_4;
		synchronized (this.aClass307_4) {
			this.aClass307_4.method7000(local24, (long) arg0);
			return local24;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V")
	public void method654() {
		@Pc(14) Class307 local14 = this.aClass307_4;
		synchronized (this.aClass307_4) {
			this.aClass307_4.method6998();
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BI)V")
	public void method655() {
		@Pc(6) Class307 local6 = this.aClass307_4;
		synchronized (this.aClass307_4) {
			this.aClass307_4.method6995(5);
		}
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(I)V")
	public void method656() {
		@Pc(6) Class307 local6 = this.aClass307_4;
		synchronized (this.aClass307_4) {
			this.aClass307_4.method7006();
		}
	}
}
