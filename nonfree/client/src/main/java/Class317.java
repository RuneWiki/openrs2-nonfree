import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sda")
public final class Class317 {

	@OriginalMember(owner = "client!sda", name = "j", descriptor = "Lclient!wq;")
	private final Class391 aClass391_48 = new Class391(64);

	@OriginalMember(owner = "client!sda", name = "f", descriptor = "Lclient!wq;")
	private final Class391 aClass391_49 = new Class391(100);

	@OriginalMember(owner = "client!sda", name = "h", descriptor = "Lclient!la;")
	private final Class208 aClass208_119;

	@OriginalMember(owner = "client!sda", name = "<init>", descriptor = "(Lclient!to;ILclient!la;Lclient!la;Lclient!la;)V")
	public Class317(@OriginalArg(0) Class333 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class208 arg2, @OriginalArg(3) Class208 arg3, @OriginalArg(4) Class208 arg4) {
		this.aClass208_119 = arg2;
		if (this.aClass208_119 != null) {
			@Pc(26) int local26 = this.aClass208_119.method4988() - 1;
			this.aClass208_119.method5005(local26);
		}
		Static131.method1899(arg3, arg4);
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(II)Lclient!hs;")
	public Class165 method7882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class391 local6 = this.aClass391_48;
		@Pc(16) Class165 local16;
		synchronized (this.aClass391_48) {
			local16 = (Class165) this.aClass391_48.method9275((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class208 local30 = this.aClass208_119;
		@Pc(45) byte[] local45;
		synchronized (this.aClass208_119) {
			local45 = this.aClass208_119.method4991(Static602.method8661(arg0), Static480.method6996(arg0), arg1 - 221);
		}
		local16 = new Class165();
		if (arg1 != 100) {
			Static532.method7885(105);
		}
		local16.anInt3916 = arg0;
		local16.aClass317_2 = this;
		if (local45 != null) {
			local16.method3398(arg1 ^ 0x7, new Class5_Sub23(local45));
		}
		local16.method3396();
		@Pc(87) Class391 local87 = this.aClass391_48;
		synchronized (this.aClass391_48) {
			this.aClass391_48.method9273((long) arg0, local16, 1);
			return local16;
		}
	}

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "(II)Lclient!kl;")
	public Class5_Sub5_Sub15 method7883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class391 local6 = this.aClass391_49;
		synchronized (this.aClass391_49) {
			@Pc(16) Class5_Sub5_Sub15 local16 = (Class5_Sub5_Sub15) this.aClass391_49.method9275((long) arg0);
			if (arg1 != 64) {
				this.method7884(82);
			}
			if (local16 == null) {
				local16 = new Class5_Sub5_Sub15(arg0);
				this.aClass391_49.method9273((long) arg0, local16, 1);
			}
			return local16.method4804() ? local16 : null;
		}
	}

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "(I)V")
	public void method7884(@OriginalArg(0) int arg0) {
		if (arg0 != 64) {
			Static532.anInt9189 = 121;
		}
		@Pc(9) Class391 local9 = this.aClass391_48;
		synchronized (this.aClass391_48) {
			this.aClass391_48.method9286();
		}
		local9 = this.aClass391_49;
		synchronized (this.aClass391_49) {
			this.aClass391_49.method9286();
		}
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(B)V")
	public void method7886() {
		@Pc(2) Class391 local2 = this.aClass391_48;
		synchronized (this.aClass391_48) {
			this.aClass391_48.method9276(0);
		}
		local2 = this.aClass391_49;
		synchronized (this.aClass391_49) {
			this.aClass391_49.method9276(0);
		}
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(IZ)V")
	public void method7887() {
		@Pc(2) Class391 local2 = this.aClass391_48;
		synchronized (this.aClass391_48) {
			this.aClass391_48.method9274(5);
		}
		local2 = this.aClass391_49;
		synchronized (this.aClass391_49) {
			this.aClass391_49.method9274(5);
		}
	}
}
