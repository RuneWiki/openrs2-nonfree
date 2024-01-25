import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class279 {

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
	public int anInt8076;

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "Lclient!af;")
	private final Class10 aClass10_48 = new Class10(64);

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "Lclient!af;")
	public final Class10 aClass10_49 = new Class10(60);

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "Lclient!ae;")
	public final Class8 aClass8_115;

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "Lclient!ae;")
	private final Class8 aClass8_116;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Lclient!jk;ILclient!ae;Lclient!ae;)V")
	public Class279(@OriginalArg(0) Class176 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) Class8 arg3) {
		this.aClass8_115 = arg3;
		this.aClass8_116 = arg2;
		@Pc(26) int local26 = this.aClass8_116.method279() - 1;
		this.aClass8_116.method280(local26);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IB)V")
	public void method6904() {
		@Pc(2) Class10 local2 = this.aClass10_48;
		synchronized (this.aClass10_48) {
			this.aClass10_48.method369(5);
		}
		local2 = this.aClass10_49;
		synchronized (this.aClass10_49) {
			this.aClass10_49.method369(5);
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BI)Lclient!lr;")
	public Class213 method6905(@OriginalArg(1) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_48;
		@Pc(16) Class213 local16;
		synchronized (this.aClass10_48) {
			local16 = (Class213) this.aClass10_48.method373((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class8 local34 = this.aClass8_116;
		@Pc(47) byte[] local47;
		synchronized (this.aClass8_116) {
			local47 = this.aClass8_116.method262(Static390.method5562(arg0), Static247.method3618(arg0));
		}
		local16 = new Class213();
		local16.anInt6018 = arg0;
		local16.aClass279_3 = this;
		if (local47 != null) {
			local16.method5119(new Class6_Sub23(local47));
		}
		@Pc(77) Class10 local77 = this.aClass10_48;
		synchronized (this.aClass10_48) {
			this.aClass10_48.method366(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
	public void method6906() {
		@Pc(6) Class10 local6 = this.aClass10_48;
		synchronized (this.aClass10_48) {
			this.aClass10_48.method375();
		}
		local6 = this.aClass10_49;
		synchronized (this.aClass10_49) {
			this.aClass10_49.method375();
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZI)V")
	public void method6907(@OriginalArg(1) int arg0) {
		this.anInt8076 = arg0;
		@Pc(16) Class10 local16 = this.aClass10_49;
		synchronized (this.aClass10_49) {
			this.aClass10_49.method375();
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
	public void method6908() {
		@Pc(6) Class10 local6 = this.aClass10_48;
		synchronized (this.aClass10_48) {
			this.aClass10_48.method380();
		}
		local6 = this.aClass10_49;
		synchronized (this.aClass10_49) {
			this.aClass10_49.method380();
		}
	}
}
