import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class278 {

	@OriginalMember(owner = "client!qm", name = "m", descriptor = "I")
	public int anInt7310;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "Lclient!ad;")
	private final Class6 aClass6_54 = new Class6(64);

	@OriginalMember(owner = "client!qm", name = "l", descriptor = "Lclient!ad;")
	public final Class6 aClass6_55 = new Class6(60);

	@OriginalMember(owner = "client!qm", name = "h", descriptor = "Lclient!tf;")
	public final Class322 aClass322_125;

	@OriginalMember(owner = "client!qm", name = "k", descriptor = "Lclient!tf;")
	private final Class322 aClass322_126;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lclient!qh;ILclient!tf;Lclient!tf;)V")
	public Class278(@OriginalArg(0) Class274 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class322 arg2, @OriginalArg(3) Class322 arg3) {
		this.aClass322_125 = arg3;
		this.aClass322_126 = arg2;
		@Pc(26) int local26 = this.aClass322_126.method6825() - 1;
		this.aClass322_126.method6831(local26);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)V")
	public void method6125(@OriginalArg(0) int arg0) {
		this.anInt7310 = arg0;
		@Pc(9) Class6 local9 = this.aClass6_55;
		synchronized (this.aClass6_55) {
			this.aClass6_55.method102();
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZI)Lclient!raa;")
	public Class284 method6127(@OriginalArg(1) int arg0) {
		@Pc(6) Class6 local6 = this.aClass6_54;
		@Pc(16) Class284 local16;
		synchronized (this.aClass6_54) {
			local16 = (Class284) this.aClass6_54.method92((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class322 local29 = this.aClass322_126;
		@Pc(42) byte[] local42;
		synchronized (this.aClass322_126) {
			local42 = this.aClass322_126.method6802(Static139.method2698(arg0), Static536.method7155(arg0));
		}
		local16 = new Class284();
		local16.anInt7481 = arg0;
		local16.aClass278_2 = this;
		if (local42 != null) {
			local16.method6248(new Class3_Sub11(local42));
		}
		@Pc(70) Class6 local70 = this.aClass6_54;
		synchronized (this.aClass6_54) {
			this.aClass6_54.method106((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V")
	public void method6128() {
		@Pc(6) Class6 local6 = this.aClass6_54;
		synchronized (this.aClass6_54) {
			this.aClass6_54.method94();
		}
		local6 = this.aClass6_55;
		synchronized (this.aClass6_55) {
			this.aClass6_55.method94();
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IB)V")
	public void method6129() {
		@Pc(10) Class6 local10 = this.aClass6_54;
		synchronized (this.aClass6_54) {
			this.aClass6_54.method97(5);
		}
		local10 = this.aClass6_55;
		synchronized (this.aClass6_55) {
			this.aClass6_55.method97(5);
		}
	}

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)V")
	public void method6130() {
		@Pc(2) Class6 local2 = this.aClass6_54;
		synchronized (this.aClass6_54) {
			this.aClass6_54.method102();
		}
		local2 = this.aClass6_55;
		synchronized (this.aClass6_55) {
			this.aClass6_55.method102();
		}
	}
}
