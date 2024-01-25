import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gv")
public final class Class141 {

	@OriginalMember(owner = "client!gv", name = "j", descriptor = "Lclient!iha;")
	private final Class168 aClass168_34 = new Class168(64);

	@OriginalMember(owner = "client!gv", name = "i", descriptor = "I")
	public int anInt3620 = 0;

	@OriginalMember(owner = "client!gv", name = "f", descriptor = "Lclient!gda;")
	private final Class126 aClass126_104;

	@OriginalMember(owner = "client!gv", name = "h", descriptor = "I")
	public final int anInt3612;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lclient!po;ILclient!gda;)V")
	public Class141(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class126 arg2) {
		this.aClass126_104 = arg2;
		this.anInt3612 = this.aClass126_104.method3062(4);
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V")
	public void method3310() {
		@Pc(6) Class168 local6 = this.aClass168_34;
		synchronized (this.aClass168_34) {
			this.aClass168_34.method3856();
		}
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)V")
	public void method3311() {
		@Pc(2) Class168 local2 = this.aClass168_34;
		synchronized (this.aClass168_34) {
			this.aClass168_34.method3862();
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(II)V")
	public void method3312() {
		@Pc(6) Class168 local6 = this.aClass168_34;
		synchronized (this.aClass168_34) {
			this.aClass168_34.method3852(5);
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IZ)Lclient!jc;")
	public Class181 method3314(@OriginalArg(0) int arg0) {
		@Pc(6) Class168 local6 = this.aClass168_34;
		@Pc(25) Class181 local25;
		synchronized (this.aClass168_34) {
			local25 = (Class181) this.aClass168_34.method3860((long) arg0);
		}
		if (local25 != null) {
			return local25;
		}
		@Pc(39) Class126 local39 = this.aClass126_104;
		@Pc(48) byte[] local48;
		synchronized (this.aClass126_104) {
			local48 = this.aClass126_104.method3086(arg0, 4);
		}
		local25 = new Class181();
		local25.aClass141_5 = this;
		local25.anInt4666 = arg0;
		if (local48 != null) {
			local25.method4252(new Class5_Sub36(local48));
		}
		local25.method4248();
		local6 = this.aClass168_34;
		synchronized (this.aClass168_34) {
			this.aClass168_34.method3853((long) arg0, local25);
			return local25;
		}
	}
}
