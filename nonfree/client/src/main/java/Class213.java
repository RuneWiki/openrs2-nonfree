import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class213 {

	@OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
	public static int anInt5956 = -2;

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "Z")
	public static boolean aBoolean408 = false;

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "Lclient!hu;")
	private final Class98 aClass98_52 = new Class98(16);

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "Lclient!r;")
	private final Class197 aClass197_83;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V", line = 255)
	public Class213(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class197 arg2) {
		this.aClass197_83 = arg2;
		this.aClass197_83.method5082(29);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V", line = 21)
	public void method5423() {
		@Pc(10) Class98 local10 = this.aClass98_52;
		synchronized (this.aClass98_52) {
			this.aClass98_52.method2623();
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)V", line = 35)
	public void method5424() {
		@Pc(2) Class98 local2 = this.aClass98_52;
		synchronized (this.aClass98_52) {
			this.aClass98_52.method2617(5);
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIILclient!ng;IB)Lclient!dd;", line = 48)
	public Class43 method5425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class160 arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Class112[] local7 = null;
		@Pc(19) Class245 local19 = this.method5428(arg0);
		if (local19.anIntArray484 != null) {
			local7 = new Class112[local19.anIntArray484.length];
			for (@Pc(29) int local29 = 0; local29 < local7.length; local29++) {
				@Pc(41) Class101 local41 = arg3.method4032(local19.anIntArray484[local29]);
				local7[local29] = new Class112(local41.anInt2689, local41.anInt2683, local41.anInt2692, local41.anInt2695, local41.anInt2690, local41.anInt2687, local41.anInt2684, local41.aBoolean191);
			}
		}
		return new Class43(local19.anInt7059, local7, local19.anInt7065, arg1, arg2, arg4);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V", line = 131)
	public void method5427() {
		@Pc(12) Class98 local12 = this.aClass98_52;
		synchronized (this.aClass98_52) {
			this.aClass98_52.method2616();
		}
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(II)Lclient!wa;", line = 150)
	private Class245 method5428(@OriginalArg(0) int arg0) {
		@Pc(6) Class98 local6 = this.aClass98_52;
		@Pc(24) Class245 local24;
		synchronized (this.aClass98_52) {
			local24 = (Class245) this.aClass98_52.method2614((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(41) byte[] local41 = this.aClass197_83.method5090(arg0, 29);
		local24 = new Class245();
		if (local41 != null) {
			local24.method6316(new Class2_Sub4(local41));
		}
		local6 = this.aClass98_52;
		synchronized (this.aClass98_52) {
			this.aClass98_52.method2626((long) arg0, local24);
			return local24;
		}
	}
}
