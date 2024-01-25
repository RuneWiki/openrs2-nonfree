import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hja")
public final class Class161 {

	@OriginalMember(owner = "client!hja", name = "h", descriptor = "Lclient!qfa;")
	private final Class307 aClass307_50 = new Class307(64);

	@OriginalMember(owner = "client!hja", name = "d", descriptor = "Lclient!ik;")
	private final Class182 aClass182_66;

	@OriginalMember(owner = "client!hja", name = "k", descriptor = "I")
	public final int anInt3879;

	@OriginalMember(owner = "client!hja", name = "<init>", descriptor = "(Lclient!qh;ILclient!ik;)V")
	public Class161(@OriginalArg(0) Class309 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class182 arg2) {
		this.aClass182_66 = arg2;
		if (this.aClass182_66 == null) {
			this.anInt3879 = 0;
		} else {
			this.anInt3879 = this.aClass182_66.method3970(16);
		}
	}

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "(B)V")
	public void method3495() {
		@Pc(2) Class307 local2 = this.aClass307_50;
		synchronized (this.aClass307_50) {
			this.aClass307_50.method6998();
		}
	}

	@OriginalMember(owner = "client!hja", name = "b", descriptor = "(II)V")
	public void method3496() {
		@Pc(6) Class307 local6 = this.aClass307_50;
		synchronized (this.aClass307_50) {
			this.aClass307_50.method6995(5);
		}
	}

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "(II)Lclient!lj;")
	public Class231 method3497(@OriginalArg(0) int arg0) {
		@Pc(6) Class307 local6 = this.aClass307_50;
		@Pc(16) Class231 local16;
		synchronized (this.aClass307_50) {
			local16 = (Class231) this.aClass307_50.method7002((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class182 local30 = this.aClass182_66;
		@Pc(39) byte[] local39;
		synchronized (this.aClass182_66) {
			local39 = this.aClass182_66.method3985(arg0, 16);
		}
		local16 = new Class231();
		if (local39 != null) {
			local16.method5115(new Class3_Sub2(local39));
		}
		@Pc(63) Class307 local63 = this.aClass307_50;
		synchronized (this.aClass307_50) {
			this.aClass307_50.method7000(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "(I)V")
	public void method3499() {
		@Pc(2) Class307 local2 = this.aClass307_50;
		synchronized (this.aClass307_50) {
			this.aClass307_50.method7006();
		}
	}
}
