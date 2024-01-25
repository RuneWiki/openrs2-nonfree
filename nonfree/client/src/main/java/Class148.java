import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iba")
public final class Class148 {

	@OriginalMember(owner = "client!iba", name = "l", descriptor = "I")
	private volatile int anInt4423;

	@OriginalMember(owner = "client!iba", name = "n", descriptor = "Lclient!wfa;")
	private Class383 aClass383_1;

	@OriginalMember(owner = "client!iba", name = "h", descriptor = "Lclient!vl;")
	private final Class371 aClass371_3 = new Class371();

	@OriginalMember(owner = "client!iba", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString40;

	@OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class148(@OriginalArg(0) String arg0) {
		this.aString40 = arg0;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(Lclient!wfa;B)V")
	public void method4027(@OriginalArg(0) Class383 arg0) {
		this.aClass383_1 = arg0;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(B)Lclient!gk;")
	public Class28 method4028() {
		@Pc(13) Class371 local13 = this.aClass371_3;
		synchronized (this.aClass371_3) {
			@Pc(20) Class28 local20 = this.aClass371_3.method8911();
			local20.method9276();
			this.anInt4423--;
			return local20;
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(Lclient!wea;B)V")
	public void method4029(@OriginalArg(0) Class28_Sub1 arg0) {
		arg0.aBoolean816 = false;
		@Pc(9) Class371 local9 = this.aClass371_3;
		synchronized (this.aClass371_3) {
			this.aClass371_3.method8908(arg0);
			this.anInt4423++;
		}
		if (this.aClass383_1 != null) {
			@Pc(40) Class383 local40 = this.aClass383_1;
			synchronized (this.aClass383_1) {
				this.aClass383_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(Lclient!ov;I)V")
	public void method4030(@OriginalArg(0) Class28_Sub5 arg0) {
		@Pc(6) Class371 local6 = this.aClass371_3;
		synchronized (this.aClass371_3) {
			this.aClass371_3.method8908(arg0);
			this.anInt4423++;
		}
		if (this.aClass383_1 != null) {
			@Pc(38) Class383 local38 = this.aClass383_1;
			synchronized (this.aClass383_1) {
				this.aClass383_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)Z")
	public boolean method4031() {
		return this.anInt4423 == 0;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILclient!wea;)V")
	public void method4032(@OriginalArg(1) Class28_Sub1 arg0) {
		arg0.aBoolean816 = true;
		@Pc(16) Class371 local16 = this.aClass371_3;
		synchronized (this.aClass371_3) {
			this.aClass371_3.method8908(arg0);
			this.anInt4423++;
		}
		if (this.aClass383_1 != null) {
			@Pc(41) Class383 local41 = this.aClass383_1;
			synchronized (this.aClass383_1) {
				this.aClass383_1.notify();
			}
		}
	}
}
