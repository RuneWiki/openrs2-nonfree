import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class311 {

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "Lclient!kj;")
	private Class176 aClass176_1;

	@OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
	private volatile int anInt8674;

	@OriginalMember(owner = "client!tb", name = "j", descriptor = "Lclient!qe;")
	private final Class269 aClass269_9 = new Class269();

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString232;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class311(@OriginalArg(0) String arg0) {
		this.aString232 = arg0;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!pn;I)V")
	public void method6754(@OriginalArg(0) Class25_Sub2 arg0) {
		arg0.aBoolean575 = true;
		@Pc(13) Class269 local13 = this.aClass269_9;
		synchronized (this.aClass269_9) {
			this.aClass269_9.method5977(arg0);
			this.anInt8674++;
		}
		if (this.aClass176_1 != null) {
			@Pc(38) Class176 local38 = this.aClass176_1;
			synchronized (this.aClass176_1) {
				this.aClass176_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)Lclient!jea;")
	public Class25 method6756() {
		@Pc(13) Class269 local13 = this.aClass269_9;
		synchronized (this.aClass269_9) {
			@Pc(20) Class25 local20 = this.aClass269_9.method5974();
			local20.method6959();
			this.anInt8674--;
			return local20;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!kb;)V")
	public void method6757(@OriginalArg(1) Class25_Sub8 arg0) {
		@Pc(6) Class269 local6 = this.aClass269_9;
		synchronized (this.aClass269_9) {
			this.aClass269_9.method5977(arg0);
			this.anInt8674++;
		}
		if (this.aClass176_1 != null) {
			@Pc(41) Class176 local41 = this.aClass176_1;
			synchronized (this.aClass176_1) {
				this.aClass176_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!kj;)V")
	public void method6759(@OriginalArg(1) Class176 arg0) {
		this.aClass176_1 = arg0;
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)Z")
	public boolean method6760() {
		return this.anInt8674 == 0;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!pn;)V")
	public void method6761(@OriginalArg(1) Class25_Sub2 arg0) {
		arg0.aBoolean575 = false;
		@Pc(13) Class269 local13 = this.aClass269_9;
		synchronized (this.aClass269_9) {
			this.aClass269_9.method5977(arg0);
			this.anInt8674++;
		}
		if (this.aClass176_1 != null) {
			@Pc(38) Class176 local38 = this.aClass176_1;
			synchronized (this.aClass176_1) {
				this.aClass176_1.notify();
			}
		}
	}
}
