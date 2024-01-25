import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class119 {

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "Lclient!wf;")
	private final Class316 aClass316_20 = new Class316(64);

	@OriginalMember(owner = "client!hh", name = "p", descriptor = "Lclient!kda;")
	private final Class160 aClass160_41;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lclient!bt;ILclient!kda;)V")
	public Class119(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2) {
		this.aClass160_41 = arg2;
		this.aClass160_41.method4207(31);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)Lclient!cp;")
	public Class48 method3462(@OriginalArg(1) int arg0) {
		@Pc(14) Class316 local14 = this.aClass316_20;
		@Pc(24) Class48 local24;
		synchronized (this.aClass316_20) {
			local24 = (Class48) this.aClass316_20.method7799((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class160 local37 = this.aClass160_41;
		@Pc(46) byte[] local46;
		synchronized (this.aClass160_41) {
			local46 = this.aClass160_41.method4198(arg0, 31);
		}
		local24 = new Class48();
		if (local46 != null) {
			local24.method1813(new Class1_Sub13(local46));
		}
		@Pc(68) Class316 local68 = this.aClass316_20;
		synchronized (this.aClass316_20) {
			this.aClass316_20.method7792((long) arg0, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
	public void method3463() {
		@Pc(2) Class316 local2 = this.aClass316_20;
		synchronized (this.aClass316_20) {
			this.aClass316_20.method7803();
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZI)V")
	public void method3464() {
		@Pc(2) Class316 local2 = this.aClass316_20;
		synchronized (this.aClass316_20) {
			this.aClass316_20.method7791(5);
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V")
	public void method3468() {
		@Pc(6) Class316 local6 = this.aClass316_20;
		synchronized (this.aClass316_20) {
			this.aClass316_20.method7794();
		}
	}
}
