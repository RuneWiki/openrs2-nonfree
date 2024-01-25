import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qia")
public final class Class289 {

	@OriginalMember(owner = "client!qia", name = "j", descriptor = "Lclient!kv;")
	private Class204 aClass204_1;

	@OriginalMember(owner = "client!qia", name = "k", descriptor = "I")
	private volatile int anInt8090;

	@OriginalMember(owner = "client!qia", name = "i", descriptor = "Lclient!hv;")
	private final Class156 aClass156_9 = new Class156();

	@OriginalMember(owner = "client!qia", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString78;

	@OriginalMember(owner = "client!qia", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class289(@OriginalArg(0) String arg0) {
		this.aString78 = arg0;
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(I)Lclient!mq;")
	public Class28 method6857() {
		@Pc(8) Class156 local8 = this.aClass156_9;
		synchronized (this.aClass156_9) {
			@Pc(17) Class28 local17 = this.aClass156_9.method3776();
			local17.method9022();
			this.anInt8090--;
			return local17;
		}
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(Lclient!kv;I)V")
	public void method6858(@OriginalArg(0) Class204 arg0) {
		this.aClass204_1 = arg0;
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(Lclient!lq;B)V")
	public void method6859(@OriginalArg(0) Class28_Sub1 arg0) {
		arg0.aBoolean913 = true;
		@Pc(9) Class156 local9 = this.aClass156_9;
		synchronized (this.aClass156_9) {
			this.aClass156_9.method3774(arg0);
			this.anInt8090++;
		}
		if (this.aClass204_1 != null) {
			@Pc(42) Class204 local42 = this.aClass204_1;
			synchronized (this.aClass204_1) {
				this.aClass204_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!qia", name = "b", descriptor = "(I)Z")
	public boolean method6860() {
		return this.anInt8090 == 0;
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(ZLclient!eh;)V")
	public void method6861(@OriginalArg(1) Class28_Sub2 arg0) {
		@Pc(2) Class156 local2 = this.aClass156_9;
		synchronized (this.aClass156_9) {
			this.aClass156_9.method3774(arg0);
			this.anInt8090++;
		}
		if (this.aClass204_1 != null) {
			@Pc(37) Class204 local37 = this.aClass204_1;
			synchronized (this.aClass204_1) {
				this.aClass204_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(BLclient!lq;)V")
	public void method6862(@OriginalArg(1) Class28_Sub1 arg0) {
		arg0.aBoolean913 = false;
		@Pc(15) Class156 local15 = this.aClass156_9;
		synchronized (this.aClass156_9) {
			this.aClass156_9.method3774(arg0);
			this.anInt8090++;
		}
		if (this.aClass204_1 != null) {
			@Pc(40) Class204 local40 = this.aClass204_1;
			synchronized (this.aClass204_1) {
				this.aClass204_1.notify();
			}
		}
	}
}
