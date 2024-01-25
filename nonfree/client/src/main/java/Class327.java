import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sda")
public final class Class327 {

	@OriginalMember(owner = "client!sda", name = "e", descriptor = "Lclient!iha;")
	private Class168 aClass168_77 = new Class168(128);

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "Lclient!iha;")
	public Class168 aClass168_78 = new Class168(64);

	@OriginalMember(owner = "client!sda", name = "k", descriptor = "Lclient!gda;")
	public final Class126 aClass126_243;

	@OriginalMember(owner = "client!sda", name = "f", descriptor = "Lclient!gda;")
	private final Class126 aClass126_242;

	@OriginalMember(owner = "client!sda", name = "<init>", descriptor = "(Lclient!po;ILclient!gda;Lclient!gda;)V")
	public Class327(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class126 arg2, @OriginalArg(3) Class126 arg3) {
		this.aClass126_243 = arg3;
		this.aClass126_242 = arg2;
		this.aClass126_242.method3062(36);
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(BI)V")
	public void method7409() {
		@Pc(6) Class168 local6 = this.aClass168_77;
		synchronized (this.aClass168_77) {
			this.aClass168_77.method3852(5);
		}
		local6 = this.aClass168_78;
		synchronized (this.aClass168_78) {
			this.aClass168_78.method3852(5);
		}
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)V")
	public void method7410() {
		@Pc(2) Class168 local2 = this.aClass168_77;
		synchronized (this.aClass168_77) {
			this.aClass168_77.method3856();
		}
		local2 = this.aClass168_78;
		synchronized (this.aClass168_78) {
			this.aClass168_78.method3856();
		}
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(B)V")
	public void method7412() {
		@Pc(6) Class168 local6 = this.aClass168_77;
		synchronized (this.aClass168_77) {
			this.aClass168_77.method3862();
		}
		local6 = this.aClass168_78;
		synchronized (this.aClass168_78) {
			this.aClass168_78.method3862();
		}
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(II)Lclient!rfa;")
	public Class313 method7413(@OriginalArg(1) int arg0) {
		@Pc(6) Class168 local6 = this.aClass168_77;
		@Pc(16) Class313 local16;
		synchronized (this.aClass168_77) {
			local16 = (Class313) this.aClass168_77.method3860((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class126 local30 = this.aClass126_242;
		@Pc(45) byte[] local45;
		synchronized (this.aClass126_242) {
			local45 = this.aClass126_242.method3086(arg0, 36);
		}
		local16 = new Class313();
		local16.aClass327_3 = this;
		local16.anInt8168 = arg0;
		if (local45 != null) {
			local16.method7056(new Class5_Sub36(local45));
		}
		local16.method7060();
		@Pc(78) Class168 local78 = this.aClass168_77;
		synchronized (this.aClass168_77) {
			this.aClass168_77.method3853((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(III)V")
	public void method7415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass168_77 = new Class168(arg1);
		this.aClass168_78 = new Class168(arg0);
	}
}
