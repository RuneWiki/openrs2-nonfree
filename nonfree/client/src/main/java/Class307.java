import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vu")
public final class Class307 {

	@OriginalMember(owner = "client!vu", name = "e", descriptor = "Lclient!uaa;")
	private final Class288 aClass288_70 = new Class288(64);

	@OriginalMember(owner = "client!vu", name = "j", descriptor = "I")
	public int anInt8864 = 0;

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "Lclient!gp;")
	private final Class117 aClass117_222;

	@OriginalMember(owner = "client!vu", name = "i", descriptor = "I")
	public final int anInt8863;

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(Lclient!jc;ILclient!gp;)V")
	public Class307(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class117 arg2) {
		this.aClass117_222 = arg2;
		this.anInt8863 = this.aClass117_222.method2951(4);
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(II)V")
	public void method7173() {
		@Pc(2) Class288 local2 = this.aClass288_70;
		synchronized (this.aClass288_70) {
			this.aClass288_70.method6735(5);
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)V")
	public void method7174() {
		@Pc(2) Class288 local2 = this.aClass288_70;
		synchronized (this.aClass288_70) {
			this.aClass288_70.method6742();
		}
	}

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)V")
	public void method7175() {
		@Pc(2) Class288 local2 = this.aClass288_70;
		synchronized (this.aClass288_70) {
			this.aClass288_70.method6744();
		}
	}

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(II)Lclient!sb;")
	public Class264 method7176(@OriginalArg(1) int arg0) {
		@Pc(12) Class288 local12 = this.aClass288_70;
		@Pc(22) Class264 local22;
		synchronized (this.aClass288_70) {
			local22 = (Class264) this.aClass288_70.method6745((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class117 local35 = this.aClass117_222;
		@Pc(44) byte[] local44;
		synchronized (this.aClass117_222) {
			local44 = this.aClass117_222.method2962(arg0, 4);
		}
		local22 = new Class264();
		local22.aClass307_6 = this;
		local22.anInt7718 = arg0;
		if (local44 != null) {
			local22.method6254(new Class5_Sub3(local44));
		}
		local22.method6253();
		@Pc(75) Class288 local75 = this.aClass288_70;
		synchronized (this.aClass288_70) {
			this.aClass288_70.method6746(local22, (long) arg0);
			return local22;
		}
	}
}
