import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ffa")
public final class Class103 {

	@OriginalMember(owner = "client!ffa", name = "e", descriptor = "Lclient!vg;")
	private final Class342 aClass342_56 = new Class342(16);

	@OriginalMember(owner = "client!ffa", name = "i", descriptor = "Lclient!ri;")
	private final Class284 aClass284_47;

	@OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(Lclient!ei;ILclient!ri;)V")
	public Class103(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class284 arg2) {
		this.aClass284_47 = arg2;
		this.aClass284_47.method6354(29);
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(BIILclient!aga;II)Lclient!pj;")
	public Class256 method2773(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class13 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) Class183[] local15 = null;
		@Pc(20) Class314 local20 = this.method2776(arg3);
		if (local20.anIntArray522 != null) {
			local15 = new Class183[local20.anIntArray522.length];
			for (@Pc(30) int local30 = 0; local30 < local15.length; local30++) {
				@Pc(40) Class257 local40 = arg2.method123(local20.anIntArray522[local30]);
				local15[local30] = new Class183(local40.anInt7420, local40.anInt7421, local40.anInt7425, local40.anInt7416, local40.anInt7423, local40.anInt7424, local40.anInt7422, local40.aBoolean518);
			}
		}
		return new Class256(local20.anInt8800, local15, local20.anInt8801, arg4, arg0, arg1);
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Z)V")
	public void method2774() {
		@Pc(13) Class342 local13 = this.aClass342_56;
		synchronized (this.aClass342_56) {
			this.aClass342_56.method7693();
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(II)V")
	public void method2775() {
		@Pc(2) Class342 local2 = this.aClass342_56;
		synchronized (this.aClass342_56) {
			this.aClass342_56.method7697(5);
		}
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(II)Lclient!te;")
	private Class314 method2776(@OriginalArg(1) int arg0) {
		@Pc(6) Class342 local6 = this.aClass342_56;
		@Pc(16) Class314 local16;
		synchronized (this.aClass342_56) {
			local16 = (Class314) this.aClass342_56.method7684((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class284 local29 = this.aClass284_47;
		@Pc(38) byte[] local38;
		synchronized (this.aClass284_47) {
			local38 = this.aClass284_47.method6331(29, arg0);
		}
		local16 = new Class314();
		if (local38 != null) {
			local16.method6873(new Class3_Sub26(local38));
		}
		@Pc(60) Class342 local60 = this.aClass342_56;
		synchronized (this.aClass342_56) {
			this.aClass342_56.method7683(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(B)V")
	public void method2777() {
		@Pc(2) Class342 local2 = this.aClass342_56;
		synchronized (this.aClass342_56) {
			this.aClass342_56.method7687();
		}
	}
}
