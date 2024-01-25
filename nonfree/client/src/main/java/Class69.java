import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class69 {

	@OriginalMember(owner = "client!er", name = "e", descriptor = "Lclient!jv;")
	private final Class126 aClass126_13 = new Class126(64);

	@OriginalMember(owner = "client!er", name = "h", descriptor = "Lclient!bu;")
	public final Class32 aClass32_32;

	@OriginalMember(owner = "client!er", name = "j", descriptor = "Lclient!bu;")
	private final Class32 aClass32_33;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lclient!oq;ILclient!bu;Lclient!bu;)V")
	public Class69(@OriginalArg(0) Class183 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32 arg2, @OriginalArg(3) Class32 arg3) {
		this.aClass32_32 = arg3;
		this.aClass32_33 = arg2;
		this.aClass32_33.method790(3);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BI)V")
	public void method1704() {
		@Pc(14) Class126 local14 = this.aClass126_13;
		synchronized (this.aClass126_13) {
			this.aClass126_13.method3140(5);
		}
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(I)V")
	public void method1705() {
		@Pc(8) Class126 local8 = this.aClass126_13;
		synchronized (this.aClass126_13) {
			this.aClass126_13.method3131();
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(II)Lclient!qp;")
	public Class207 method1706(@OriginalArg(0) int arg0) {
		@Pc(6) Class126 local6 = this.aClass126_13;
		@Pc(16) Class207 local16;
		synchronized (this.aClass126_13) {
			local16 = (Class207) this.aClass126_13.method3141((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) byte[] local35 = this.aClass32_33.method785(arg0, 3);
		local16 = new Class207();
		local16.aClass69_2 = this;
		if (local35 != null) {
			local16.method4470(new Class3_Sub7(local35));
		}
		@Pc(54) Class126 local54 = this.aClass126_13;
		synchronized (this.aClass126_13) {
			this.aClass126_13.method3132((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!er", name = "d", descriptor = "(I)V")
	public void method1709() {
		@Pc(2) Class126 local2 = this.aClass126_13;
		synchronized (this.aClass126_13) {
			this.aClass126_13.method3135();
		}
	}
}
