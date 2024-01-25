import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class151 {

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "Lclient!nj;")
	private final Class171 aClass171_34 = new Class171(64);

	@OriginalMember(owner = "client!ld", name = "m", descriptor = "Lclient!mg;")
	private final Class160 aClass160_41;

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
	public final int anInt4189;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!al;ILclient!mg;)V")
	public Class151(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2) {
		this.aClass160_41 = arg2;
		if (this.aClass160_41 == null) {
			this.anInt4189 = 0;
		} else {
			this.anInt4189 = this.aClass160_41.method3722(16);
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V")
	public void method3404() {
		@Pc(11) Class171 local11 = this.aClass171_34;
		synchronized (this.aClass171_34) {
			this.aClass171_34.method3934();
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(BI)V")
	public void method3405() {
		@Pc(7) Class171 local7 = this.aClass171_34;
		synchronized (this.aClass171_34) {
			this.aClass171_34.method3933(5);
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZI)Lclient!vs;")
	public Class254 method3406(@OriginalArg(1) int arg0) {
		@Pc(6) Class171 local6 = this.aClass171_34;
		@Pc(16) Class254 local16;
		synchronized (this.aClass171_34) {
			local16 = (Class254) this.aClass171_34.method3941((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass160_41.method3696(arg0, 16);
		local16 = new Class254();
		if (local33 != null) {
			local16.method5627(new Class2_Sub23(local33));
		}
		@Pc(49) Class171 local49 = this.aClass171_34;
		synchronized (this.aClass171_34) {
			this.aClass171_34.method3940((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
	public void method3407() {
		@Pc(13) Class171 local13 = this.aClass171_34;
		synchronized (this.aClass171_34) {
			this.aClass171_34.method3936();
		}
	}
}
