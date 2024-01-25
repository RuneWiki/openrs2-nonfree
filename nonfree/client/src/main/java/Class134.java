import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public final class Class134 {

	@OriginalMember(owner = "client!gs", name = "j", descriptor = "I")
	private volatile int anInt3683;

	@OriginalMember(owner = "client!gs", name = "k", descriptor = "Lclient!fl;")
	private Class109 aClass109_1;

	@OriginalMember(owner = "client!gs", name = "i", descriptor = "Lclient!vv;")
	private final Class376 aClass376_3 = new Class376();

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString45;

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class134(@OriginalArg(0) String arg0) {
		this.aString45 = arg0;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Z)Lclient!ea;")
	public Class12 method3033() {
		@Pc(13) Class376 local13 = this.aClass376_3;
		synchronized (this.aClass376_3) {
			@Pc(20) Class12 local20 = this.aClass376_3.method9008();
			local20.method9143();
			this.anInt3683--;
			return local20;
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(BLclient!je;)V")
	public void method3034(@OriginalArg(1) Class12_Sub2 arg0) {
		arg0.aBoolean757 = true;
		@Pc(9) Class376 local9 = this.aClass376_3;
		synchronized (this.aClass376_3) {
			this.aClass376_3.method9011(arg0);
			this.anInt3683++;
		}
		if (this.aClass109_1 != null) {
			@Pc(41) Class109 local41 = this.aClass109_1;
			synchronized (this.aClass109_1) {
				this.aClass109_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ZLclient!je;)V")
	public void method3035(@OriginalArg(1) Class12_Sub2 arg0) {
		arg0.aBoolean757 = false;
		@Pc(9) Class376 local9 = this.aClass376_3;
		synchronized (this.aClass376_3) {
			this.aClass376_3.method9011(arg0);
			this.anInt3683++;
		}
		if (this.aClass109_1 != null) {
			@Pc(34) Class109 local34 = this.aClass109_1;
			synchronized (this.aClass109_1) {
				this.aClass109_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)Z")
	public boolean method3036() {
		return this.anInt3683 == 0;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(BLclient!hk;)V")
	public void method3038(@OriginalArg(1) Class12_Sub6 arg0) {
		@Pc(13) Class376 local13 = this.aClass376_3;
		synchronized (this.aClass376_3) {
			this.aClass376_3.method9011(arg0);
			this.anInt3683++;
		}
		if (this.aClass109_1 != null) {
			@Pc(38) Class109 local38 = this.aClass109_1;
			synchronized (this.aClass109_1) {
				this.aClass109_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILclient!fl;)V")
	public void method3039(@OriginalArg(1) Class109 arg0) {
		this.aClass109_1 = arg0;
	}
}
