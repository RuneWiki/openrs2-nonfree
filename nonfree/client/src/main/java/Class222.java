import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class222 {

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "Lclient!pja;")
	private final Class279 aClass279_33 = new Class279(16);

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "Lclient!gj;")
	private final Class143 aClass143_84;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lclient!im;ILclient!gj;)V")
	public Class222(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class143 arg2) {
		this.aClass143_84 = arg2;
		this.aClass143_84.method3123(29);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)Lclient!jka;")
	private Class196 method5121(@OriginalArg(0) int arg0) {
		@Pc(6) Class279 local6 = this.aClass279_33;
		@Pc(16) Class196 local16;
		synchronized (this.aClass279_33) {
			local16 = (Class196) this.aClass279_33.method6631((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class143 local29 = this.aClass143_84;
		@Pc(38) byte[] local38;
		synchronized (this.aClass143_84) {
			local38 = this.aClass143_84.method3125(arg0, 29);
		}
		local16 = new Class196();
		if (local38 != null) {
			local16.method4507(new Class3_Sub17(local38));
		}
		@Pc(65) Class279 local65 = this.aClass279_33;
		synchronized (this.aClass279_33) {
			this.aClass279_33.method6635(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
	public void method5122() {
		@Pc(6) Class279 local6 = this.aClass279_33;
		synchronized (this.aClass279_33) {
			this.aClass279_33.method6638();
		}
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
	public void method5123() {
		@Pc(12) Class279 local12 = this.aClass279_33;
		synchronized (this.aClass279_33) {
			this.aClass279_33.method6637();
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)V")
	public void method5124() {
		@Pc(7) Class279 local7 = this.aClass279_33;
		synchronized (this.aClass279_33) {
			this.aClass279_33.method6630(5);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!sfa;IIIBI)Lclient!af;")
	public Class10 method5125(@OriginalArg(0) Class322 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class26[] local7 = null;
		@Pc(12) Class196 local12 = this.method5121(arg3);
		if (local12.anIntArray344 != null) {
			local7 = new Class26[local12.anIntArray344.length];
			for (@Pc(30) int local30 = 0; local30 < local7.length; local30++) {
				@Pc(40) Class22 local40 = arg0.method7489(local12.anIntArray344[local30]);
				local7[local30] = new Class26(local40.anInt734, local40.anInt730, local40.anInt729, local40.anInt731, local40.anInt728, local40.anInt727, local40.anInt732, local40.aBoolean69);
			}
		}
		return new Class10(local12.anInt5327, local7, local12.anInt5323, arg2, arg1, arg4);
	}
}
