import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dca")
public final class Class73 {

	@OriginalMember(owner = "client!dca", name = "h", descriptor = "Lclient!qfa;")
	private final Class307 aClass307_25 = new Class307(64);

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "Lclient!ik;")
	public final Class182 aClass182_32;

	@OriginalMember(owner = "client!dca", name = "l", descriptor = "Lclient!ik;")
	private final Class182 aClass182_31;

	@OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(Lclient!qh;ILclient!ik;Lclient!ik;)V")
	public Class73(@OriginalArg(0) Class309 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class182 arg2, @OriginalArg(3) Class182 arg3) {
		this.aClass182_32 = arg3;
		this.aClass182_31 = arg2;
		this.aClass182_31.method3970(3);
	}

	@OriginalMember(owner = "client!dca", name = "b", descriptor = "(II)Lclient!wv;")
	public Class409 method1983(@OriginalArg(1) int arg0) {
		@Pc(6) Class307 local6 = this.aClass307_25;
		@Pc(16) Class409 local16;
		synchronized (this.aClass307_25) {
			local16 = (Class409) this.aClass307_25.method7002((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class182 local30 = this.aClass182_31;
		@Pc(39) byte[] local39;
		synchronized (this.aClass182_31) {
			local39 = this.aClass182_31.method3985(arg0, 3);
		}
		local16 = new Class409();
		local16.aClass73_2 = this;
		if (local39 != null) {
			local16.method9593(new Class3_Sub2(local39));
		}
		@Pc(74) Class307 local74 = this.aClass307_25;
		synchronized (this.aClass307_25) {
			this.aClass307_25.method7000(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!dca", name = "c", descriptor = "(I)V")
	public void method1984() {
		@Pc(2) Class307 local2 = this.aClass307_25;
		synchronized (this.aClass307_25) {
			this.aClass307_25.method7006();
		}
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(II)V")
	public void method1986() {
		@Pc(6) Class307 local6 = this.aClass307_25;
		synchronized (this.aClass307_25) {
			this.aClass307_25.method6995(5);
		}
	}

	@OriginalMember(owner = "client!dca", name = "b", descriptor = "(I)V")
	public void method1987() {
		@Pc(11) Class307 local11 = this.aClass307_25;
		synchronized (this.aClass307_25) {
			this.aClass307_25.method6998();
		}
	}
}
