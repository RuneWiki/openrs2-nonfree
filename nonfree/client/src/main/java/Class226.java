import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class226 {

	@OriginalMember(owner = "client!tm", name = "l", descriptor = "Lclient!mo;")
	private Class160 aClass160_55 = new Class160(128);

	@OriginalMember(owner = "client!tm", name = "m", descriptor = "Lclient!mo;")
	public Class160 aClass160_56 = new Class160(64);

	@OriginalMember(owner = "client!tm", name = "i", descriptor = "Lclient!nl;")
	public final Class171 aClass171_89;

	@OriginalMember(owner = "client!tm", name = "h", descriptor = "Lclient!nl;")
	private final Class171 aClass171_88;

	static {
		new Class32(null, "geschickt werden.", null, null);
	}

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lclient!lo;ILclient!nl;Lclient!nl;)V")
	public Class226(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2, @OriginalArg(3) Class171 arg3) {
		this.aClass171_89 = arg3;
		this.aClass171_88 = arg2;
		this.aClass171_88.method3750(36);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V")
	public void method4906() {
		@Pc(2) Class160 local2 = this.aClass160_55;
		synchronized (this.aClass160_55) {
			this.aClass160_55.method3605();
		}
		@Pc(29) Class160 local29 = this.aClass160_56;
		synchronized (this.aClass160_56) {
			this.aClass160_56.method3605();
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V")
	public void method4907() {
		@Pc(2) Class160 local2 = this.aClass160_55;
		synchronized (this.aClass160_55) {
			this.aClass160_55.method3595();
		}
		local2 = this.aClass160_56;
		synchronized (this.aClass160_56) {
			this.aClass160_56.method3595();
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(BI)V")
	public void method4908() {
		@Pc(6) Class160 local6 = this.aClass160_55;
		synchronized (this.aClass160_55) {
			this.aClass160_55.method3606(5);
		}
		local6 = this.aClass160_56;
		synchronized (this.aClass160_56) {
			this.aClass160_56.method3606(5);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(III)V")
	public void method4912(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass160_55 = new Class160(arg0);
		this.aClass160_56 = new Class160(arg1);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IZ)Lclient!we;")
	public Class243 method4913(@OriginalArg(0) int arg0) {
		@Pc(6) Class160 local6 = this.aClass160_55;
		@Pc(16) Class243 local16;
		synchronized (this.aClass160_55) {
			local16 = (Class243) this.aClass160_55.method3599((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass171_88.method3745(36, arg0);
		local16 = new Class243();
		local16.aClass226_4 = this;
		local16.anInt6352 = arg0;
		if (local33 != null) {
			local16.method5524(new Class2_Sub16(local33));
		}
		local16.method5526();
		@Pc(69) Class160 local69 = this.aClass160_55;
		synchronized (this.aClass160_55) {
			this.aClass160_55.method3602((long) arg0, local16);
			return local16;
		}
	}
}
