import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class251 {

	@OriginalMember(owner = "client!mk", name = "i", descriptor = "Lclient!qfa;")
	private final Class307 aClass307_65 = new Class307(256);

	@OriginalMember(owner = "client!mk", name = "e", descriptor = "Lclient!ik;")
	private final Class182 aClass182_86;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lclient!qh;ILclient!ik;)V")
	public Class251(@OriginalArg(0) Class309 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class182 arg2) {
		this.aClass182_86 = arg2;
		this.aClass182_86.method3970(26);
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V")
	public void method5497() {
		@Pc(6) Class307 local6 = this.aClass307_65;
		synchronized (this.aClass307_65) {
			this.aClass307_65.method6998();
		}
	}

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "(II)Lclient!jm;")
	public Class3_Sub7_Sub13 method5498(@OriginalArg(0) int arg0) {
		@Pc(6) Class307 local6 = this.aClass307_65;
		@Pc(16) Class3_Sub7_Sub13 local16;
		synchronized (this.aClass307_65) {
			local16 = (Class3_Sub7_Sub13) this.aClass307_65.method7002((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class182 local30 = this.aClass182_86;
		@Pc(39) byte[] local39;
		synchronized (this.aClass182_86) {
			local39 = this.aClass182_86.method3985(arg0, 26);
		}
		local16 = new Class3_Sub7_Sub13();
		if (local39 != null) {
			local16.method4647(new Class3_Sub2(local39));
		}
		@Pc(63) Class307 local63 = this.aClass307_65;
		synchronized (this.aClass307_65) {
			this.aClass307_65.method7000(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)V")
	public void method5500() {
		@Pc(2) Class307 local2 = this.aClass307_65;
		synchronized (this.aClass307_65) {
			this.aClass307_65.method7006();
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)V")
	public void method5501() {
		@Pc(2) Class307 local2 = this.aClass307_65;
		synchronized (this.aClass307_65) {
			this.aClass307_65.method6995(5);
		}
	}
}
