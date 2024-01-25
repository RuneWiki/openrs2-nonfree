import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class45 {

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "Lclient!si;")
	private final Class338 aClass338_3 = new Class338(64);

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "Lclient!lb;")
	private final Class221 aClass221_12;

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
	public final int anInt1100;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lclient!iga;ILclient!lb;)V")
	public Class45(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class221 arg2) {
		this.aClass221_12 = arg2;
		if (this.aClass221_12 == null) {
			this.anInt1100 = 0;
		} else {
			this.anInt1100 = this.aClass221_12.method5065(16);
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
	public void method897() {
		@Pc(2) Class338 local2 = this.aClass338_3;
		synchronized (this.aClass338_3) {
			this.aClass338_3.method8047();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Lclient!et;")
	public Class102 method898(@OriginalArg(1) int arg0) {
		@Pc(6) Class338 local6 = this.aClass338_3;
		@Pc(16) Class102 local16;
		synchronized (this.aClass338_3) {
			local16 = (Class102) this.aClass338_3.method8049((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class221 local30 = this.aClass221_12;
		@Pc(39) byte[] local39;
		synchronized (this.aClass221_12) {
			local39 = this.aClass221_12.method5089(arg0, 16);
		}
		local16 = new Class102();
		if (local39 != null) {
			local16.method2554(new Class3_Sub28(local39));
		}
		@Pc(63) Class338 local63 = this.aClass338_3;
		synchronized (this.aClass338_3) {
			this.aClass338_3.method8044((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V")
	public void method899() {
		@Pc(6) Class338 local6 = this.aClass338_3;
		synchronized (this.aClass338_3) {
			this.aClass338_3.method8051();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BI)V")
	public void method900() {
		@Pc(6) Class338 local6 = this.aClass338_3;
		synchronized (this.aClass338_3) {
			this.aClass338_3.method8052(5);
		}
	}
}
