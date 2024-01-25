import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class286 {

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "Lclient!qfa;")
	private final Class307 aClass307_74 = new Class307(64);

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
	public int anInt7692 = 0;

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "Lclient!ik;")
	private final Class182 aClass182_99;

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
	public final int anInt7690;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lclient!qh;ILclient!ik;)V")
	public Class286(@OriginalArg(0) Class309 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class182 arg2) {
		this.aClass182_99 = arg2;
		this.anInt7690 = this.aClass182_99.method3970(4);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V")
	public void method6630() {
		@Pc(6) Class307 local6 = this.aClass307_74;
		synchronized (this.aClass307_74) {
			this.aClass307_74.method7006();
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)Lclient!we;")
	public Class400 method6631(@OriginalArg(0) int arg0) {
		@Pc(6) Class307 local6 = this.aClass307_74;
		@Pc(16) Class400 local16;
		synchronized (this.aClass307_74) {
			local16 = (Class400) this.aClass307_74.method7002((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class182 local30 = this.aClass182_99;
		@Pc(39) byte[] local39;
		synchronized (this.aClass182_99) {
			local39 = this.aClass182_99.method3985(arg0, 4);
		}
		local16 = new Class400();
		local16.aClass286_6 = this;
		local16.anInt11055 = arg0;
		if (local39 != null) {
			local16.method9427(new Class3_Sub2(local39));
		}
		local16.method9426();
		@Pc(80) Class307 local80 = this.aClass307_74;
		synchronized (this.aClass307_74) {
			this.aClass307_74.method7000(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI)V")
	public void method6632() {
		@Pc(2) Class307 local2 = this.aClass307_74;
		synchronized (this.aClass307_74) {
			this.aClass307_74.method6995(5);
		}
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)V")
	public void method6633() {
		@Pc(2) Class307 local2 = this.aClass307_74;
		synchronized (this.aClass307_74) {
			this.aClass307_74.method6998();
		}
	}
}
