import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class252 {

	@OriginalMember(owner = "client!ur", name = "f", descriptor = "Lclient!kh;")
	private final Class134 aClass134_55 = new Class134(64);

	@OriginalMember(owner = "client!ur", name = "h", descriptor = "Lclient!ul;")
	private final Class246 aClass246_210;

	@OriginalMember(owner = "client!ur", name = "g", descriptor = "I")
	public final int anInt6748;

	static {
		new Class7(null, "geschickt werden.", null, null);
	}

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lclient!ee;ILclient!ul;)V")
	public Class252(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2) {
		this.aClass246_210 = arg2;
		if (this.aClass246_210 == null) {
			this.anInt6748 = 0;
		} else {
			this.anInt6748 = this.aClass246_210.method5492(16);
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V")
	public void method5551() {
		@Pc(2) Class134 local2 = this.aClass134_55;
		synchronized (this.aClass134_55) {
			this.aClass134_55.method3267();
		}
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)V")
	public void method5552() {
		@Pc(12) Class134 local12 = this.aClass134_55;
		synchronized (this.aClass134_55) {
			this.aClass134_55.method3272();
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(BI)Lclient!fn;")
	public Class79 method5553(@OriginalArg(1) int arg0) {
		@Pc(6) Class134 local6 = this.aClass134_55;
		@Pc(16) Class79 local16;
		synchronized (this.aClass134_55) {
			local16 = (Class79) this.aClass134_55.method3266((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class246 local34 = this.aClass246_210;
		@Pc(43) byte[] local43;
		synchronized (this.aClass246_210) {
			local43 = this.aClass246_210.method5477(16, arg0);
		}
		local16 = new Class79();
		if (local43 != null) {
			local16.method2119(new Class1_Sub5(local43));
		}
		@Pc(65) Class134 local65 = this.aClass134_55;
		synchronized (this.aClass134_55) {
			this.aClass134_55.method3263((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)V")
	public void method5554() {
		@Pc(6) Class134 local6 = this.aClass134_55;
		synchronized (this.aClass134_55) {
			this.aClass134_55.method3270(5);
		}
	}
}
