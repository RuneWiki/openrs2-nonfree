import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vca")
public final class Class358 {

	@OriginalMember(owner = "client!vca", name = "p", descriptor = "Lclient!ls;")
	private Class212 aClass212_1;

	@OriginalMember(owner = "client!vca", name = "q", descriptor = "I")
	private volatile int anInt9632;

	@OriginalMember(owner = "client!vca", name = "l", descriptor = "Lclient!jia;")
	private final Class171 aClass171_11 = new Class171();

	@OriginalMember(owner = "client!vca", name = "n", descriptor = "Ljava/lang/String;")
	public final String aString106;

	@OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class358(@OriginalArg(0) String arg0) {
		this.aString106 = arg0;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(I)Z")
	public boolean method8047() {
		return this.anInt9632 == 0;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(ILclient!ig;)V")
	public void method8049(@OriginalArg(1) Class13_Sub1 arg0) {
		arg0.aBoolean737 = true;
		@Pc(9) Class171 local9 = this.aClass171_11;
		synchronized (this.aClass171_11) {
			this.aClass171_11.method3746(arg0);
			this.anInt9632++;
		}
		if (this.aClass212_1 != null) {
			@Pc(42) Class212 local42 = this.aClass212_1;
			synchronized (this.aClass212_1) {
				this.aClass212_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "(ILclient!ig;)V")
	public void method8051(@OriginalArg(1) Class13_Sub1 arg0) {
		arg0.aBoolean737 = false;
		@Pc(13) Class171 local13 = this.aClass171_11;
		synchronized (this.aClass171_11) {
			this.aClass171_11.method3746(arg0);
			this.anInt9632++;
		}
		if (this.aClass212_1 != null) {
			@Pc(38) Class212 local38 = this.aClass212_1;
			synchronized (this.aClass212_1) {
				this.aClass212_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(ILclient!nba;)V")
	public void method8052(@OriginalArg(1) Class13_Sub8 arg0) {
		@Pc(10) Class171 local10 = this.aClass171_11;
		synchronized (this.aClass171_11) {
			this.aClass171_11.method3746(arg0);
			this.anInt9632++;
		}
		if (this.aClass212_1 != null) {
			@Pc(35) Class212 local35 = this.aClass212_1;
			synchronized (this.aClass212_1) {
				this.aClass212_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!vca", name = "c", descriptor = "(I)Lclient!ib;")
	public Class13 method8054() {
		@Pc(8) Class171 local8 = this.aClass171_11;
		synchronized (this.aClass171_11) {
			@Pc(15) Class13 local15 = this.aClass171_11.method3745();
			local15.method8394();
			this.anInt9632--;
			return local15;
		}
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(Lclient!ls;I)V")
	public void method8055(@OriginalArg(0) Class212 arg0) {
		this.aClass212_1 = arg0;
	}
}
