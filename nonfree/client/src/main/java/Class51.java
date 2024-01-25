import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class51 {

	@OriginalMember(owner = "client!db", name = "g", descriptor = "Lclient!nj;")
	private final Class171 aClass171_8 = new Class171(64);

	@OriginalMember(owner = "client!db", name = "f", descriptor = "Lclient!mg;")
	private final Class160 aClass160_8;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lclient!al;ILclient!mg;)V")
	public Class51(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2) {
		this.aClass160_8 = arg2;
		this.aClass160_8.method3722(32);
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(Z)V")
	public void method1143() {
		@Pc(2) Class171 local2 = this.aClass171_8;
		synchronized (this.aClass171_8) {
			this.aClass171_8.method3934();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)Lclient!ls;")
	public Class156 method1144(@OriginalArg(0) int arg0) {
		@Pc(6) Class171 local6 = this.aClass171_8;
		@Pc(16) Class156 local16;
		synchronized (this.aClass171_8) {
			local16 = (Class156) this.aClass171_8.method3941((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) byte[] local38 = this.aClass160_8.method3696(arg0, 32);
		local16 = new Class156();
		if (local38 != null) {
			local16.method3598(new Class2_Sub23(local38));
		}
		@Pc(54) Class171 local54 = this.aClass171_8;
		synchronized (this.aClass171_8) {
			this.aClass171_8.method3940((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IZ)V")
	public void method1146() {
		@Pc(6) Class171 local6 = this.aClass171_8;
		synchronized (this.aClass171_8) {
			this.aClass171_8.method3933(5);
		}
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(Z)V")
	public void method1147() {
		@Pc(6) Class171 local6 = this.aClass171_8;
		synchronized (this.aClass171_8) {
			this.aClass171_8.method3936();
		}
	}
}
