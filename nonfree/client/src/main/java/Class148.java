import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public final class Class148 {

	@OriginalMember(owner = "client!ks", name = "f", descriptor = "Lclient!nj;")
	private final Class171 aClass171_33 = new Class171(64);

	@OriginalMember(owner = "client!ks", name = "k", descriptor = "I")
	public int anInt4113 = 0;

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "Lclient!mg;")
	private final Class160 aClass160_39;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "I")
	public final int anInt4108;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Lclient!al;ILclient!mg;)V")
	public Class148(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2) {
		this.aClass160_39 = arg2;
		this.anInt4108 = this.aClass160_39.method3722(4);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(II)Lclient!bh;")
	public Class24 method3342(@OriginalArg(1) int arg0) {
		@Pc(6) Class171 local6 = this.aClass171_33;
		@Pc(16) Class24 local16;
		synchronized (this.aClass171_33) {
			local16 = (Class24) this.aClass171_33.method3941((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass160_39.method3696(arg0, 4);
		local16 = new Class24();
		local16.aClass148_2 = this;
		local16.anInt598 = arg0;
		if (local33 != null) {
			local16.method502(new Class2_Sub23(local33));
		}
		local16.method504();
		@Pc(65) Class171 local65 = this.aClass171_33;
		synchronized (this.aClass171_33) {
			this.aClass171_33.method3940((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(II)V")
	public void method3343() {
		@Pc(6) Class171 local6 = this.aClass171_33;
		synchronized (this.aClass171_33) {
			this.aClass171_33.method3933(5);
		}
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)V")
	public void method3344() {
		@Pc(6) Class171 local6 = this.aClass171_33;
		synchronized (this.aClass171_33) {
			this.aClass171_33.method3936();
		}
	}

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "(I)V")
	public void method3345() {
		@Pc(2) Class171 local2 = this.aClass171_33;
		synchronized (this.aClass171_33) {
			this.aClass171_33.method3934();
		}
	}
}
