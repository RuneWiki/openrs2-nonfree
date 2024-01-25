import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class12 {

	@OriginalMember(owner = "client!an", name = "i", descriptor = "Lclient!nj;")
	private final Class171 aClass171_2 = new Class171(64);

	@OriginalMember(owner = "client!an", name = "m", descriptor = "Lclient!nj;")
	private final Class171 aClass171_3 = new Class171(100);

	@OriginalMember(owner = "client!an", name = "d", descriptor = "Lclient!mg;")
	private final Class160 aClass160_2;

	static {
		new Class209("Ok", "Okay", "OK", "Ok");
	}

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lclient!al;ILclient!mg;Lclient!mg;Lclient!mg;)V")
	public Class12(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2, @OriginalArg(3) Class160 arg3, @OriginalArg(4) Class160 arg4) {
		this.aClass160_2 = arg2;
		if (this.aClass160_2 != null) {
			@Pc(26) int local26 = this.aClass160_2.method3715() - 1;
			this.aClass160_2.method3722(local26);
		}
		Static13.method291(arg4, arg3);
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(B)V")
	public void method252() {
		@Pc(6) Class171 local6 = this.aClass171_2;
		synchronized (this.aClass171_2) {
			this.aClass171_2.method3934();
		}
		local6 = this.aClass171_3;
		synchronized (this.aClass171_3) {
			this.aClass171_3.method3934();
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(II)V")
	public void method253() {
		@Pc(6) Class171 local6 = this.aClass171_2;
		synchronized (this.aClass171_2) {
			this.aClass171_2.method3933(5);
		}
		local6 = this.aClass171_3;
		synchronized (this.aClass171_3) {
			this.aClass171_3.method3933(5);
		}
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(II)Lclient!vf;")
	public Class250 method255(@OriginalArg(1) int arg0) {
		@Pc(6) Class171 local6 = this.aClass171_2;
		@Pc(16) Class250 local16;
		synchronized (this.aClass171_2) {
			local16 = (Class250) this.aClass171_2.method3941((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass160_2.method3696(Static27.method5779(arg0), Static217.method3402(arg0));
		local16 = new Class250();
		local16.anInt7008 = arg0;
		local16.aClass12_3 = this;
		if (local37 != null) {
			local16.method5541(new Class2_Sub23(local37));
		}
		local16.method5544();
		@Pc(62) Class171 local62 = this.aClass171_2;
		synchronized (this.aClass171_2) {
			this.aClass171_2.method3940((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(II)Lclient!cq;")
	public Class2_Sub5_Sub3 method257(@OriginalArg(0) int arg0) {
		@Pc(11) Class171 local11 = this.aClass171_3;
		@Pc(21) Class2_Sub5_Sub3 local21;
		synchronized (this.aClass171_3) {
			local21 = (Class2_Sub5_Sub3) this.aClass171_3.method3941((long) arg0);
			if (local21 == null) {
				local21 = new Class2_Sub5_Sub3(arg0);
				this.aClass171_3.method3940((long) arg0, local21);
			}
		}
		synchronized (local21) {
			return local21.method886() ? local21 : null;
		}
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(I)V")
	public void method258() {
		@Pc(6) Class171 local6 = this.aClass171_2;
		synchronized (this.aClass171_2) {
			this.aClass171_2.method3936();
		}
		local6 = this.aClass171_3;
		synchronized (this.aClass171_3) {
			this.aClass171_3.method3936();
		}
	}
}
